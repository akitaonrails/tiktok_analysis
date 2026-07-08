package X;

import com.bytedance.applog.AppLog;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Vgk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C804240Vgk {
    public static int LIZIZ;
    public static int LIZJ;
    public static int LIZLLL;
    public static boolean LJ;
    public static float LJFF;
    public static boolean LJI;
    public static long LJIIIIZZ;
    public static long LJIIIZ;
    public static final C804240Vgk LIZ = new C804240Vgk();
    public static String LJII = "";
    public static final Map<String, Boolean> LJIIJ = new LinkedHashMap();

    public static void LIZ(String str, boolean z) {
        float f;
        Map<String, Boolean> map = LJIIJ;
        if (map.containsKey(str)) {
            if (Intrinsics.LJFF(((LinkedHashMap) map).get(str), Boolean.TRUE)) {
                map.remove(str);
                return;
            }
            if (z) {
                LIZJ++;
                if (LJ) {
                    LIZLLL++;
                }
                LJ = true;
            } else {
                LIZLLL = 0;
                LJ = false;
            }
            map.remove(str);
        } else {
            map.put(str, Boolean.valueOf(z));
            LIZIZ++;
            if (z) {
                LIZJ++;
                if (LJ) {
                    LIZLLL++;
                }
                LJ = true;
            }
        }
        if (LIZLLL >= ((Number) C2214381Blc.LIZLLL.getValue()).intValue()) {
            C804290Vgp.LIZ(new C804330Vgt(EnumC805430Vif.LIVE, EnumC804170Vgd.LIVE_PLAY_BAD_CONTINUOUS, null, 0L, 28));
        }
        int i = LIZIZ;
        if (i > 0) {
            f = LIZJ / i;
        } else {
            f = 0.0f;
        }
        if ((f > C2214381Blc.LIZIZ() && LJFF <= C2214381Blc.LIZIZ()) || (f <= C2214381Blc.LIZIZ() && LJFF > C2214381Blc.LIZIZ())) {
            C804320Vgs.LIZ().storeFloat("last_bad_live_vv_radio", f);
            if (!LJI) {
                C804320Vgs.LIZ().storeString("last_app_session_live", AppLog.getSessionId());
                LJI = true;
            }
        }
        LJFF = f;
    }
}
