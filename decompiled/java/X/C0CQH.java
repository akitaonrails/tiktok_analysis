package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0CQH, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CQH {
    public static final C0CQH LIZ = new C0CQH();
    public static final Map<String, Long> LIZIZ = new LinkedHashMap();

    public static void LIZ() {
        Map<String, Long> map = LIZIZ;
        Long l = (Long) ((LinkedHashMap) map).get("authorize");
        if (l != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("type", "deeplink");
            c2344009Gk.LJIIIIZZ("sub_type", "authorize");
            c2344009Gk.LIZJ(C1514430pVp.LIZLLL().booleanValue() ? 1 : 0, "is_cold_start_first_launch");
            c2344009Gk.LIZLLL(jElapsedRealtime, "from_start_to_current_duration");
            C20684815ws.LJIILLIIL("intention_detection_flag", c2344009Gk.LIZ);
            map.remove("authorize");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("scene:");
            sbLIZ.append("authorize");
            sbLIZ.append(", duration:");
            sbLIZ.append(jElapsedRealtime);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
