package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0t7q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1653320t7q {
    public static final C1653320t7q LIZ = new C1653320t7q();
    public static String LIZIZ = "camera";
    public static String LIZJ = "camera";
    public static final Map<Integer, String> LIZLLL = C2097608Jq.LJIIIIZZ(new Pair(201, "child_model"), new Pair(202, "not_login_or_X86"), new Pair(203, "live_is_null"), new Pair(204, "live_mask_error"), new Pair(205, "not_support_live"), new Pair(206, "live_permission_request_error"), new Pair(207, "no_live_permission"), new Pair(208, "bottom_tab_api_not_valid"), new Pair(209, "not_support_go_live_tab"), new Pair(210, "create_info_request_error"), new Pair(211, "bottom_tab_equal_live_return"), new Pair(212, "bottom_tab_equal_record_env_return"), new Pair(213, "lyrax_plugin_not_ready"));

    public static void LIZ(int i, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", LIZIZ);
        c2344009Gk.LJIIIIZZ("origin_enter_from", LIZJ);
        c2344009Gk.LIZJ(0, "is_success");
        c2344009Gk.LIZJ(i, "error_code");
        c2344009Gk.LJIIIIZZ("reason", LIZLLL.get(Integer.valueOf(i)));
        c2344009Gk.LJIIIIZZ("error_stage", str);
        c2344009Gk.LJI(C1653340t7s.LJFF);
        C20684815ws.LJIILLIIL("livesdk_live_tab_load_result", c2344009Gk.LIZ);
    }
}
