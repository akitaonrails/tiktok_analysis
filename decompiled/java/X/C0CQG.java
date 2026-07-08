package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0CQG, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CQG {
    public static final C0CQG LIZ = new C0CQG();
    public static final Map<String, Long> LIZIZ = new LinkedHashMap();

    public static void LIZ(String str, String str2) {
        Map<String, Long> map = LIZIZ;
        Long l = (Long) ((LinkedHashMap) map).get(str);
        if (l != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("type", "age_gate");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            c2344009Gk.LJIIIIZZ("sub_type", C2188811AlT.LIZIZ(sbLIZ));
            c2344009Gk.LIZJ(C1514430pVp.LIZLLL().booleanValue() ? 1 : 0, "is_cold_start_first_launch");
            c2344009Gk.LIZLLL(jElapsedRealtime, "from_start_to_current_duration");
            C20684815ws.LJIILLIIL("intention_detection_flag", c2344009Gk.LIZ);
            map.remove(str);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("scene:");
            sbLIZ2.append(str);
            sbLIZ2.append(", duration:");
            sbLIZ2.append(jElapsedRealtime);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }
}
