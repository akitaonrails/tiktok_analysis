package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0OBE, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OBE {
    public static final WeakHashMap<Aweme, Map<String, Object>> LIZ = new WeakHashMap<>();

    public static final <T> T LIZ(Aweme aweme, String str) {
        T t;
        Map<String, Object> map = LIZ.get(aweme);
        if (map == null || (t = (T) map.get(str)) == null) {
            return null;
        }
        return t;
    }

    public static final <T> void LIZIZ(Aweme aweme, String str, T t) {
        WeakHashMap<Aweme, Map<String, Object>> weakHashMap = LIZ;
        Map<String, Object> linkedHashMap = weakHashMap.get(aweme);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            weakHashMap.put(aweme, linkedHashMap);
        }
        linkedHashMap.put(str, t);
    }
}
