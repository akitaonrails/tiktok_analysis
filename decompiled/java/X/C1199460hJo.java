package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0hJo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1199460hJo {
    public static final C1199460hJo LIZ = new C1199460hJo();

    public static void LIZ(C1199450hJn c1199450hJn) {
        if (!C1196170hEV.LIZIZ("location_power_track", c1199450hJn.LIZ, null)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("key", c1199450hJn.LIZ);
        Long l = c1199450hJn.LIZIZ;
        if (l != null) {
            linkedHashMap.put("value_int1", String.valueOf(l.longValue()));
        }
        Long l2 = c1199450hJn.LIZJ;
        if (l2 != null) {
            linkedHashMap.put("value_int2", String.valueOf(l2.longValue()));
        }
        String str = c1199450hJn.LIZLLL;
        if (str != null) {
            linkedHashMap.put("value_str", str);
        }
        C20684815ws.LJIILLIIL("location_power_track", linkedHashMap);
    }
}
