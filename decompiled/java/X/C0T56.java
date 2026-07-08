package X;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0T56, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T56 {
    public static final ConcurrentHashMap<Long, Object> LIZ = new ConcurrentHashMap<>();

    public static JSONObject LIZ(long j) {
        Object obj = LIZ.get(Long.valueOf(j));
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        return null;
    }

    public static Object LIZIZ(long j) {
        return LIZ.get(Long.valueOf(j));
    }
}
