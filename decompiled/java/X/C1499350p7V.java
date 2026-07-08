package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0p7V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1499350p7V {
    public long LIZ;
    public long LIZIZ;
    public final HashMap<String, Long> LIZJ = new HashMap<>();
    public final HashMap<String, Long> LIZLLL = new HashMap<>();
    public final HashMap<String, Long> LJ = new HashMap<>();
    public final HashMap<String, Long> LJFF = new HashMap<>();
    public final HashMap<String, Long> LJI = new HashMap<>();

    public static long LIZ(long j, Long l) {
        if (l != null) {
            l.longValue();
            return j + l.longValue();
        }
        return j;
    }

    public static void LIZIZ(HashMap map, HashMap map2) {
        for (Map.Entry entry : map2.entrySet()) {
            map.put(entry.getKey(), Long.valueOf(LIZ(((Number) entry.getValue()).longValue(), (Long) map.get(entry.getKey()))));
        }
    }
}
