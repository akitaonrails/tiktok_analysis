package X;

/* JADX INFO: renamed from: X.0lPU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1356740lPU {
    public static volatile long LIZ;
    public static volatile long LIZIZ;
    public static volatile long LIZJ;
    public static volatile long LIZLLL;
    public static volatile long LJ;
    public static volatile boolean LJFF = true;
    public static String LJI;
    public static String LJII;
    public static String LJIIIIZZ;

    public static void LIZ() {
        if (LJFF || LIZ == 0) {
            return;
        }
        LJFF = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
        String str = LJI;
        String str2 = LJII;
        String str3 = LJIIIIZZ;
        boolean zLIZ = C1358180lRo.LIZ();
        int iLJ = C1358180lRo.LJ();
        Long lLIZIZ = LIZIZ(LIZ, LIZIZ);
        Long lLIZIZ2 = LIZIZ(LIZIZ, LIZJ);
        Long lLIZIZ3 = LIZIZ(LIZJ, LIZLLL);
        Long lLIZIZ4 = LIZIZ(LIZLLL, LJ);
        Long lLIZIZ5 = LIZIZ(LJ, jCurrentTimeMillis);
        Long lLIZIZ6 = LIZIZ(LIZ, LJ);
        Long lLIZIZ7 = LIZIZ(LIZ, jCurrentTimeMillis);
        c1358550lSP.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("input_open_scene", str);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        c2344009Gk.LIZJ(zLIZ ? 1 : 0, "panel_open_opt_hit");
        c2344009Gk.LIZJ(iLJ, "panel_open_opt_mask");
        C1358170lRn.LIZ(c2344009Gk, "click_to_create_view_ms", lLIZIZ);
        C1358170lRn.LIZ(c2344009Gk, "container_inflate_ms", lLIZIZ2);
        C1358170lRn.LIZ(c2344009Gk, "create_view_to_vc_end_ms", lLIZIZ3);
        C1358170lRn.LIZ(c2344009Gk, "vc_end_to_first_frame_ms", lLIZIZ4);
        C1358170lRn.LIZ(c2344009Gk, "first_frame_to_keyboard_ms", lLIZIZ5);
        C1358170lRn.LIZ(c2344009Gk, "click_to_first_frame_ms", lLIZIZ6);
        C1358170lRn.LIZ(c2344009Gk, "click_to_keyboard_ms", lLIZIZ7);
        C20684815ws.LJIILLIIL("repost_input_open_chain_perf", c2344009Gk.LIZ);
    }

    public static Long LIZIZ(long j, long j2) {
        if (j != 0 && j2 != 0 && j2 >= j) {
            return Long.valueOf(j2 - j);
        }
        return null;
    }

    public static void LIZJ(Long l, String str, String str2, String str3) {
        if (l != null && l.longValue() > 0) {
            LJI = str;
            LIZ = l.longValue();
            LIZIZ = 0L;
            LIZJ = 0L;
            LIZLLL = 0L;
            LJ = 0L;
            LJFF = false;
            LJII = str2;
            LJIIIIZZ = str3;
            return;
        }
        LIZ = 0L;
        LJFF = true;
    }
}
