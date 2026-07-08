package X;

import Y.AObjectS121S0000000_20;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jKh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1276890jKh {
    public static double LIZLLL;
    public static double LJ;
    public static double LJFF;
    public static double LJI;
    public static double LJII;
    public static int LJIIIIZZ;
    public static int LJIIIZ;
    public static int LJIIJ;
    public static int LJIIJJI;
    public static int LJIIL;
    public static int LJIILIIL;
    public static int LJIILJJIL;
    public static int LJIILL;
    public static int LJIILLIIL;
    public static int LJIIZILJ;
    public static int LJIJ;
    public static volatile String LJIJI;
    public static volatile String LJIJJ;
    public static volatile String LJIJJLI;
    public static volatile String LJIL;
    public static volatile String LJJ;
    public static volatile String LJJI;
    public static volatile String LJJIFFI;
    public static volatile String LJJII;
    public static volatile boolean LJJIII;
    public static final C1300480jwk LIZ = new C1300480jwk("live_fluency_broadcast_enter_new", 1, null, null, 28);
    public static final C0UP4 LIZIZ = new C0UP4(C783270Uo1.LIZJ(), new C1300480jwk("live_host_widget_loaded", 1, null, null, 28));
    public static final C0UP4 LIZJ = new C0UP4(C783270Uo1.LIZJ(), new C1300480jwk("live_host_rtmp_connected", 1, null, null, 28));
    public static final AObjectS121S0000000_20 LJJIIJ = new AObjectS121S0000000_20(0);

    public static void LIZJ() {
        LJJIII = true;
        LIZ.LIZJ(null);
        C465520INi.LIZ.L11(LJJIIJ);
        C786410Ut5.LJLIIL(20000L, C473410IhP.LIZ(), new Runnable() { // from class: X.0UUq
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BroadcastEnterPerformanceHelper@b0df.start$1");
                try {
                    C1276890jKh.LJ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BroadcastEnterPerformanceHelper@b0df.start$1");
            }
        });
    }

    public static void LJ() {
        LJJIII = false;
        C465520INi.LIZ.zO1(LJJIIJ);
        C1300480jwk c1300480jwk = LIZ;
        HashMap map = new HashMap();
        map.put("push_fps", String.valueOf(LIZLLL));
        map.put("preview_fps", String.valueOf(LJ));
        map.put("in_cap_fps", String.valueOf(LJFF));
        map.put("out_cap_fps", String.valueOf(LJI));
        map.put("encode_fps", String.valueOf(LJII));
        map.put("camera_capture_time", String.valueOf(LJIIIIZZ));
        map.put("camera_to_processor_latency", String.valueOf(LJIIIZ));
        map.put("update_tex_image_time", String.valueOf(LJIIJ));
        map.put("oes_to_2d_time", String.valueOf(LJIIJJI));
        map.put("effect_process_time", String.valueOf(LJIIL));
        map.put("after_effect_gl_finish_time", String.valueOf(LJIILIIL));
        map.put("post_process_algorithm_time", String.valueOf(LJIILJJIL));
        map.put("process_to_render_latency", String.valueOf(LJIILL));
        map.put("render_time", String.valueOf(LJIILLIIL));
        map.put("process_to_encoder_latency", String.valueOf(LJIIZILJ));
        map.put("encoder_draw_surface_time", String.valueOf(LJIJ));
        String str = LJIJI;
        if (str == null) {
            str = "-999";
        }
        map.put("cpu_cores", str);
        String str2 = LJIJJ;
        if (str2 == null) {
            str2 = "-999";
        }
        map.put("cpu_rate", str2);
        String str3 = LJIJJLI;
        if (str3 == null) {
            str3 = "-999";
        }
        map.put("cpu_speed", str3);
        String str4 = LJIL;
        if (str4 == null) {
            str4 = "-999";
        }
        map.put("single_cores_cpu_speed", str4);
        String str5 = LJJ;
        if (str5 == null) {
            str5 = "-999";
        }
        map.put("app_max_memory", str5);
        String str6 = LJJI;
        if (str6 == null) {
            str6 = "-999";
        }
        map.put("memory_app_allocate", str6);
        String str7 = LJJIFFI;
        if (str7 == null) {
            str7 = "-999";
        }
        map.put("memory_usage_rate_android", str7);
        String str8 = LJJII;
        map.put("pss_app_usage", str8 != null ? str8 : "-999");
        c1300480jwk.LJIIZILJ = map;
        c1300480jwk.stop();
        LIZLLL = 0.0d;
        LJ = 0.0d;
        LJFF = 0.0d;
        LJI = 0.0d;
        LJII = 0.0d;
        LJIIIIZZ = 0;
        LJIIIZ = 0;
        LJIIJ = 0;
        LJIIJJI = 0;
        LJIIL = 0;
        LJIILIIL = 0;
        LJIILJJIL = 0;
        LJIILL = 0;
        LJIILLIIL = 0;
        LJIIZILJ = 0;
        LJIJ = 0;
        LJIJI = null;
        LJIJJ = null;
        LJIJJLI = null;
        LJIL = null;
        LJJ = null;
        LJJI = null;
        LJJIFFI = null;
        LJJII = null;
    }

    public static void LIZLLL() {
        C0UP4 c0up4 = LIZIZ;
        if (!c0up4.LLILZ) {
            c0up4.LLILZ = true;
            c0up4.LLILLL = true;
            c0up4.run();
        }
        C0UP4 c0up42 = LIZJ;
        if (c0up42.LLILZ) {
            return;
        }
        c0up42.LLILZ = true;
        c0up42.LLILLL = true;
        c0up42.run();
    }

    public static Double LIZ(double d, String str, JSONObject jSONObject) {
        Double dValueOf = Double.valueOf(jSONObject.optDouble(str, -1.0d));
        if (dValueOf.doubleValue() == -1.0d && !(!true)) {
            return null;
        }
        double dDoubleValue = dValueOf.doubleValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" = ");
        sbLIZ.append(dDoubleValue);
        sbLIZ.append(", value = ");
        sbLIZ.append(d);
        C20441214yg.LJ("push_params", C2188811AlT.LIZIZ(sbLIZ));
        if (d != 0.0d) {
            dDoubleValue = (d + dDoubleValue) / ((double) 2);
        }
        return Double.valueOf(dDoubleValue);
    }

    public static Integer LIZIZ(int i, JSONArray jSONArray, int i2) {
        Integer numValueOf = Integer.valueOf(jSONArray.optInt(i, -1));
        if (numValueOf.intValue() == -1 && 0 == 0) {
            return null;
        }
        int iIntValue = numValueOf.intValue();
        if (i2 != 0) {
            iIntValue = (i2 + iIntValue) / 2;
        }
        return Integer.valueOf(iIntValue);
    }
}
