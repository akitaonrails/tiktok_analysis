package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ieQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1250680ieQ {
    public static final C1250680ieQ LIZ = new C1250680ieQ();
    public static final Map<String, Boolean> LIZIZ = new LinkedHashMap();
    public static final Map<String, Boolean> LIZJ = new LinkedHashMap();
    public static final Map<String, Boolean> LIZLLL = new LinkedHashMap();
    public static final Map<String, Boolean> LJ;
    public static final Map<String, Boolean> LJFF;
    public static final Map<String, Boolean> LJI;
    public static final Map<String, Boolean> LJII;
    public static long LJIIIIZZ;
    public static boolean LJIIIZ;
    public static boolean LJIIJ;
    public static String LJIIJJI;

    static {
        new LinkedHashMap();
        LJ = new LinkedHashMap();
        LJFF = new LinkedHashMap();
        LJI = new LinkedHashMap();
        LJII = new LinkedHashMap();
        LJIIIIZZ = -1L;
        LJIIJJI = "";
    }

    public static void LJIIIZ() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("profile_attributes", LJIIJJI);
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LIZJ(1, "is_success");
        C20684815ws.LJIILLIIL("profile_request_response", c2344009Gk.LIZ);
    }

    public static void LJFF(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("profile_attributes", LJIIJJI);
        c2344009Gk.LJIIIIZZ("report_scene", str);
        C20684815ws.LJIILLIIL("profile_platform_view_model_get_error", c2344009Gk.LIZ);
    }

    public static void LJIILIIL(boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJ(Boolean.FALSE, "is_my_profile");
        c2344009Gk.LJ(Boolean.valueOf(z), "post_api_return_first");
        C20684815ws.LJIILLIIL("profile_create_and_post_api_cost_time", c2344009Gk.LIZ);
    }

    public static void LIZ(String str, ProfileUser profileUser) {
        ProfileComponents profileComponents;
        List<? extends ProfileComponents> list;
        String imprId;
        if (profileUser != null && (profileComponents = profileUser.headerComponents) != null && (list = profileComponents.components) != null) {
            Iterator<? extends ProfileComponents> it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().componentName, "header_avatar")) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    LogPbBean logPbBean = profileUser.logPb;
                    if (logPbBean != null) {
                        imprId = logPbBean.getImprId();
                    } else {
                        imprId = null;
                    }
                    c2344009Gk.LJIIIIZZ("log_id", imprId);
                    c2344009Gk.LJIIIIZZ("to_user_id", str);
                    C20684815ws.LJIILLIIL("profile_exp_diff_data_error", c2344009Gk.LIZ);
                    return;
                }
            }
        }
    }

    public static void LIZIZ(long j, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("report_scene", "profile_page_load_time");
        c2344009Gk.LIZLLL(j, str);
        c2344009Gk.LJ(Boolean.FALSE, "is_my_profile");
        C20684815ws.LJIILLIIL("profile_performance_data_statistics", c2344009Gk.LIZ);
    }

    public static void LIZJ(long j, String str) {
        if (!LJIIIZ) {
            if (Intrinsics.LJFF(str, "page_on_resume_complete_time")) {
                LJIIIZ = true;
            }
            if (LJIIIIZZ == -1) {
                return;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("report_scene", "profile_page_load_time");
            c2344009Gk.LIZLLL(j - LJIIIIZZ, str);
            c2344009Gk.LJ(Boolean.TRUE, "is_my_profile");
            C20684815ws.LJIILLIIL("profile_performance_data_statistics", c2344009Gk.LIZ);
        }
    }

    public static void LJ(n nVar, Exception exc) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("profile_attributes", LJIIJJI);
        c2344009Gk.LJIIIIZZ("report_scene", "convert_data_exception");
        c2344009Gk.LJIIIIZZ("error_msg", exc.getMessage());
        c2344009Gk.LJ(exc.getStackTrace(), "stack_info");
        c2344009Gk.LJ(nVar, "biz_data");
        C20684815ws.LJIILLIIL("profile_performance_data_statistics", c2344009Gk.LIZ);
    }

    public static void LJIIIIZZ(String str, Throwable th) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("profile_attributes", LJIIJJI);
        c2344009Gk.LJIIIIZZ("method_from", str);
        c2344009Gk.LIZJ(0, "is_success");
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LJIIIIZZ("fail_info", th.getMessage());
        if (th instanceof C0XIR) {
            c2344009Gk.LJIIIIZZ("response", ((C0XIR) th).getResponse());
            c2344009Gk.LIZJ(C2177208fy.LIZ(th), "status_code");
        }
        C20684815ws.LJIILLIIL("profile_request_response", c2344009Gk.LIZ);
    }

    public static void LJIIL(Long l, Long l2) {
        if (l != null && l.longValue() > 0 && l2 != null && l2.longValue() > 0) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("postApiCostTime: ");
            sbLIZ.append(l);
            sbLIZ.append(", pageCostTime: ");
            sbLIZ.append(l2);
            C1720106oR.LJI("ProfilePlatformStatistics", C2188811AlT.LIZIZ(sbLIZ));
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(l.longValue(), "post_api_cost_time");
            c2344009Gk.LIZLLL(l2.longValue(), "page_create_time");
            c2344009Gk.LJ(Boolean.FALSE, "is_my_profile");
            C20684815ws.LJIILLIIL("profile_create_and_post_api_cost_time", c2344009Gk.LIZ);
        }
    }

    public static void LIZLLL(long j, String str, boolean z) {
        if ((AbstractC19994813Le.Default.nextInt(100) + 1) % 10 == 0) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("profile_attributes", LJIIJJI);
            c2344009Gk.LJIIIIZZ("report_scene", str);
            c2344009Gk.LIZLLL(j, "profile_platform_convert_data_cost_time");
            c2344009Gk.LJ(Boolean.valueOf(z), "is_my_profile");
            C20684815ws.LJIILLIIL("profile_performance_data_statistics", c2344009Gk.LIZ);
        }
    }

    public static void LJII(long j, boolean z, boolean z2) {
        int i = 1;
        if ((AbstractC19994813Le.Default.nextInt(10) + 1) % 2 == 0) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("report_scene", "profile_request_data");
            c2344009Gk.LIZLLL(j, "profile_request_data_cost_time");
            if (!z) {
                i = 0;
            }
            c2344009Gk.LIZJ(i, "is_success");
            c2344009Gk.LJ(Boolean.valueOf(z2), "is_my_profile");
            C20684815ws.LJIILLIIL("profile_performance_data_statistics", c2344009Gk.LIZ);
        }
    }

    public static void LJIIJJI(long j, String str, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("report_scene", "profile_component_cost_time");
        c2344009Gk.LJIIIIZZ("component_tag", str);
        c2344009Gk.LJ(Boolean.valueOf(z), "is_my_profile");
        c2344009Gk.LIZLLL(j, "update_when_user_update_cost_time");
        C20684815ws.LJIILLIIL("profile_performance_data_statistics", c2344009Gk.LIZ);
    }

    public static void LJIJJ(C1250680ieQ c1250680ieQ, String str, String str2) {
        c1250680ieQ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("image_source", str);
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str2);
        c2344009Gk.LJIIIIZZ("enter_from", "profile_background_crop_page");
        C20684815ws.LJIILLIIL("ttinfra_profile_background_crop_click", c2344009Gk.LIZ);
    }

    public static void LJIJJLI(C1250680ieQ c1250680ieQ, String str, List list) {
        c1250680ieQ.getClass();
        if (!list.isEmpty()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("image_source", str);
            c2344009Gk.LJ(list, "action_type");
            c2344009Gk.LJIIIIZZ("enter_from", "profile_background_crop_page");
            C20684815ws.LJIILLIIL("ttinfra_profile_background_crop_edit", c2344009Gk.LIZ);
        }
    }

    public static void LJIL(C1250680ieQ c1250680ieQ, String str, String str2) {
        c1250680ieQ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("image_source", str);
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        c2344009Gk.LJIIIIZZ("enter_from", "profile_background_crop_page");
        C20684815ws.LJIILLIIL("ttinfra_profile_background_save_result", c2344009Gk.LIZ);
    }

    public static final void LJIJ(Boolean bool, String str, String str2, Long l, Integer num) {
        if (bool != null && num != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01TG(str, num, str2, l, bool, null), 3);
        }
    }

    public static final void LJIIZILJ(Boolean bool, String str, String str2, String str3, Long l, Integer num) {
        if (bool != null && num != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01TE(bool, str, str2, l, num, str3, null), 3);
        }
    }

    public static void LJIILJJIL(boolean z, int i, boolean z2, Boolean bool, Throwable th, Integer num, Boolean bool2) {
        boolean zLIZIZ;
        INetworkStateService iNetworkStateService = (INetworkStateService) ServiceManager.get().getService(INetworkStateService.class);
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        boolean zIsWeakNetwork = iNetworkStateService.isWeakNetwork();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJ(Boolean.FALSE, "is_my_profile");
        c2344009Gk.LJ(Boolean.valueOf(z), "is_chunk");
        c2344009Gk.LIZJ(i, "scene_type");
        c2344009Gk.LJ(Boolean.valueOf(z2), "is_post_request_success");
        c2344009Gk.LJ(bool, "from_first_cold_start");
        c2344009Gk.LJ(Boolean.valueOf(zLIZIZ), "is_net_available");
        c2344009Gk.LJ(Boolean.valueOf(zIsWeakNetwork), "is_weak_net");
        c2344009Gk.LJ(num, "is_load_more");
        c2344009Gk.LJ(bool2, "is_retry");
        if (th != null) {
            c2344009Gk.LJFF("post_error_des", C13SZ.LIZIZ(th));
            c2344009Gk.LIZJ(C2177208fy.LIZ(th), "post_error_code");
        }
        C20684815ws.LJIILLIIL("profile_post_api_request_report", c2344009Gk.LIZ);
    }

    public static final void LJIILLIIL(Long l, String str, String str2, String str3, String str4, String str5, String str6) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01TF(str, str2, str3, str4, str5, str6, l, null), 3);
    }

    public static final void LJIJI(Long l, String str, String str2, Boolean bool, Long l2, Integer num, String str3) {
        if (bool != null && num != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01TD(bool, str, str2, l, num, "post", str3, l2, null), 3);
        }
    }

    public static void LJIIJ(String str, long j, long j2, long j3, long j4, long j5, long j6, Boolean bool) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("report_scene", "profile_component_cost_time");
        c2344009Gk.LJIIIIZZ("component_tag", str);
        c2344009Gk.LIZLLL(j, "init_base_data_cost_time");
        c2344009Gk.LIZLLL(j2, "parse_biz_data_cost_time");
        c2344009Gk.LIZLLL(j3, "generate_view_cost_time");
        c2344009Gk.LJ(bool, "is_my_profile");
        c2344009Gk.LIZLLL(j4, "actions_before_update_ui_cost_time");
        c2344009Gk.LIZLLL(j5, "update_ui_and_data_cost_time");
        c2344009Gk.LIZLLL(j6, "actions_after_update_ui_cost_time");
        C20684815ws.LJIILLIIL("profile_performance_data_statistics", c2344009Gk.LIZ);
    }

    public static void LJI(C1250680ieQ c1250680ieQ, int i, String str, Throwable th, boolean z, String str2, String str3, String str4, String str5, int i2) {
        String str6;
        if ((i2 & 4) != 0) {
            th = null;
        }
        if ((i2 & 16) != 0) {
            str2 = null;
        }
        if ((i2 & 32) != 0) {
            str3 = null;
        }
        c1250680ieQ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("method_from", str);
        c2344009Gk.LIZJ(i, "is_success");
        if (z) {
            str6 = "personal_homepage";
        } else {
            str6 = "others_homepage";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str6);
        c2344009Gk.LJ(Boolean.valueOf(z), "is_my_profile");
        c2344009Gk.LJIIIIZZ("to_user_id", str2);
        c2344009Gk.LJIIIIZZ("log_pb", str3);
        c2344009Gk.LJIIIIZZ("event_type", str4);
        c2344009Gk.LJIIIIZZ("scene_type", str5);
        if (i == 0 && th != null) {
            c2344009Gk.LJFF("fail_info", th.getMessage());
            if (th instanceof C0XIR) {
                c2344009Gk.LJIIIIZZ("response", ((C0XIR) th).getResponse());
                c2344009Gk.LIZJ(C2177208fy.LIZ(th), "status_code");
            }
        }
        C20684815ws.LJIILLIIL("profile_request_response", c2344009Gk.LIZ);
    }
}
