package X;

import android.os.SystemClock;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CtD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C327850CtD {
    public static final C327850CtD LIZ = new C327850CtD();
    public static final HashMap<String, Long> LIZIZ = new HashMap<>();
    public static boolean LIZJ;

    public static final synchronized void LIZIZ(String str) {
        LIZIZ.clear();
        LIZJ = false;
        LIZLLL("detail_session", str);
        LIZLLL("detail_page_init", str);
    }

    public static final synchronized void LIZ(String str, String str2) {
        Long lValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("detail_session");
        sbLIZ2.append(str2);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        HashMap<String, Long> map = LIZIZ;
        Long lRemove = map.remove(strLIZIZ);
        if (lRemove != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - lRemove.longValue();
            Long l = map.get(strLIZIZ2);
            if (l != null) {
                lValueOf = Long.valueOf(SystemClock.elapsedRealtime() - l.longValue());
            } else {
                lValueOf = null;
            }
            if (jElapsedRealtime < 10000) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("detail_phrase", str);
                c2344009Gk.LJ(lValueOf, "duration_from_begin");
                c2344009Gk.LIZLLL(jElapsedRealtime, "duration");
                c2344009Gk.LJIIIIZZ("detail_page_name", str2);
                C20684815ws.LJIILLIIL("detail_performance_metrics", c2344009Gk.LIZ);
            }
            if (Intrinsics.LJFF(str, "detail_content_render") || Intrinsics.LJFF(str, "detail_header_render")) {
                if (LIZJ) {
                    LIZJ = false;
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LJIIIIZZ("detail_phrase", "detail_session");
                    c2344009Gk2.LJ(lValueOf, "duration_from_begin");
                    c2344009Gk2.LJ(lValueOf, "duration");
                    c2344009Gk2.LJIIIIZZ("detail_page_name", str2);
                    C20684815ws.LJIILLIIL("detail_performance_metrics", c2344009Gk2.LIZ);
                } else {
                    LIZJ = true;
                }
            }
        }
    }

    public static final void LIZJ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        LIZIZ.remove(C2188811AlT.LIZIZ(sbLIZ));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("detail_phrase", str);
        c2344009Gk.LIZLLL(-1L, "duration");
        c2344009Gk.LJIIIIZZ("detail_page_name", str2);
        C20684815ws.LJIILLIIL("detail_performance_metrics", c2344009Gk.LIZ);
    }

    public static final synchronized void LIZLLL(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        HashMap<String, Long> map = LIZIZ;
        Long l = map.get(strLIZIZ);
        if (l == null || SystemClock.elapsedRealtime() - l.longValue() >= 10000) {
            map.put(strLIZIZ, Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }
}
