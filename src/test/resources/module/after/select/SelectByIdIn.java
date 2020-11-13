package template;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import java.util.Collection;
import template.Blog;

public interface TipMapper {
    List<Blog> selectByIdIn(@Param("idList") Collection<Long> idList);
}
