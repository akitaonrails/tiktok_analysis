package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0huV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1222210huV {
    public static final Map<String, C1222220huW> LIZ = new LinkedHashMap();

    public static void LIZ(String str, boolean z) {
        Map<String, C1222220huW> map = LIZ;
        C1222220huW c1222220huW = (C1222220huW) ((LinkedHashMap) map).get(str);
        if (c1222220huW != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - c1222220huW.LIZ;
            if (!c1222220huW.LIZIZ) {
                C1350920lG6.LIZ.getClass();
                if (!C1350920lG6.LJJIJIL(1, "comment_secondary_load_time")) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
                    c2344009Gk.LJ(Boolean.valueOf(z), "is_success");
                    C1350920lG6.LJJJ(c2344009Gk, "comment_secondary_load_time");
                }
                c1222220huW.LIZIZ = true;
            }
            map.remove(str);
        }
    }

    public static void LIZIZ(long j, boolean z) {
        C1350920lG6.LIZ.getClass();
        if (!C1350920lG6.LJJIJIL(1, "comment_post_duration")) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(j, "duration");
            c2344009Gk.LJ(Boolean.valueOf(z), "is_success");
            C1350920lG6.LJJJ(c2344009Gk, "comment_post_duration");
        }
    }
}
