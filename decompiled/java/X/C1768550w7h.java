package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0w7h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1768550w7h {
    public static C1768420w7U LIZIZ(Map map) {
        return LIZ("auto_play_check_list", map);
    }

    public static C1768420w7U LIZ(String str, Map map) {
        Map map2;
        double dDoubleValue;
        Double d;
        Object objLIZ = C7726030a.LIZ(str, map);
        C1768420w7U c1768420w7U = null;
        if ((objLIZ instanceof Map) && (map2 = (Map) objLIZ) != null) {
            int iLIZJ = LIZJ(0, "auto_play", map);
            int iLIZJ2 = LIZJ(25, "play_percent", map);
            int iLIZJ3 = LIZJ(0, "repeat_play", map);
            int iLIZJ4 = LIZJ(0, "login", map2);
            Object objLIZ2 = C7726030a.LIZ("device_score", map2);
            if ((objLIZ2 instanceof Double) && (d = (Double) objLIZ2) != null) {
                dDoubleValue = d.doubleValue();
            } else {
                dDoubleValue = 0.0d;
            }
            int iLIZJ5 = LIZJ(0, "network_type", map2);
            int iLIZJ6 = LIZJ(-1, "network_level", map2);
            int iLIZJ7 = LIZJ(0, "inertia_play", map2);
            LIZJ(0, "cache_data_play", map2);
            c1768420w7U = new C1768420w7U(iLIZJ, iLIZJ2, iLIZJ3, iLIZJ4, dDoubleValue, iLIZJ5, iLIZJ6, iLIZJ7, map2);
        }
        return c1768420w7U;
    }

    public static int LIZJ(int i, String str, Map map) {
        Double d;
        Object objLIZ = C7726030a.LIZ(str, map);
        if ((objLIZ instanceof Double) && (d = (Double) objLIZ) != null) {
            return (int) d.doubleValue();
        }
        return i;
    }
}
