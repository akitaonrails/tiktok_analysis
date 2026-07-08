package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0CQC, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CQC {
    public static final C0CQC LIZ = new C0CQC();
    public static final Map<String, Long> LIZIZ = new LinkedHashMap();

    public static void LIZ(C0CQC c0cqc) {
        c0cqc.getClass();
        Map<String, Long> map = LIZIZ;
        Long l = (Long) ((LinkedHashMap) map).get("require_login");
        if (l != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("type", "require_login");
            c2344009Gk.LJIIIIZZ("sub_type", "require_login");
            c2344009Gk.LIZJ(C1514430pVp.LIZLLL().booleanValue() ? 1 : 0, "is_cold_start_first_launch");
            c2344009Gk.LIZLLL(jElapsedRealtime, "from_start_to_current_duration");
            C20684815ws.LJIILLIIL("intention_detection_flag", c2344009Gk.LIZ);
            map.remove("require_login");
        }
    }
}
