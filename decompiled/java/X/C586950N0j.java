package X;

import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0N0j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C586950N0j {
    public final Map<Object, Object> LIZ = new LinkedHashMap();

    public final <T> Video LIZ(Class<T> cls, T t) {
        Function1 function1;
        Object obj = ((LinkedHashMap) this.LIZ).get(cls);
        if (obj == null || !C19719512Dh.LJFF(1, obj) || (function1 = (Function1) obj) == null) {
            return null;
        }
        return (Video) function1.invoke(t);
    }
}
