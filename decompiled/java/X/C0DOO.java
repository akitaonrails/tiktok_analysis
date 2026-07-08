package X;

import com.bytedance.scene.Scene;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0DOO, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DOO {
    public static final C0DOO LIZ = new C0DOO();

    public static void LIZJ(int i) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "error_code");
        C20684815ws.LJIILLIIL("add_school_page_school_list_download_fail", c2344009Gk.LIZ);
    }

    public static void LJIIIZ(C0DOM c0dom) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", c0dom.getParamValue());
        c2344009Gk.LJIIIIZZ("enter_method", "edit_school");
        C20684815ws.LJIILLIIL("remove_verified_emails_pop_up", c2344009Gk.LIZ);
    }

    public static void LJIILLIIL(C0DOQ c0doq) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", c0doq.getParamValue());
        C20684815ws.LJIILLIIL("select_graduation_year_sheet", c2344009Gk.LIZ);
    }

    public static C0DOP LJIIZILJ(EnumC1229960i70 enumC1229960i70) {
        switch (C1230870i8T.LIZIZ[enumC1229960i70.ordinal()]) {
            case 1:
                return C0DOP.MY_GROUP_VIEW;
            case 2:
                return C0DOP.EXPLORE_GROUP_REQUESTED;
            case 3:
            case 4:
            case 5:
                return C0DOP.EXPLORE_GROUP_JOIN;
            case 6:
                return null;
            default:
                throw new C1954807lC();
        }
    }

    public static void LJ(EnumC1245820iWa enumC1245820iWa, C1245860iWe c1245860iWe) {
        C1245880iWg c1245880iWg = C1245880iWg.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", enumC1245820iWa.getParamValue());
        c1245880iWg.getClass();
        C1245880iWg.LIZ(c2344009Gk, c1245860iWe);
        C20684815ws.LJIILLIIL("add_school_sheet_pop_up", c2344009Gk.LIZ);
    }

    public static void LJFF(C1245860iWe c1245860iWe, C0DOF c0dof) {
        C1245880iWg c1245880iWg = C1245880iWg.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c1245880iWg.getClass();
        C1245880iWg.LIZ(c2344009Gk, c1245860iWe);
        c2344009Gk.LJIIIIZZ("action_type", c0dof.getParamValue());
        C20684815ws.LJIILLIIL("edit_school_page", c2344009Gk.LIZ);
    }

    public static void LJII(C0DNU c0dnu, C0DNV c0dnv) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("error_type", c0dnu.getParamValue());
        c2344009Gk.LJIIIIZZ("enter_from", c0dnv.getParamValue());
        C20684815ws.LJIILLIIL("error_prompt", c2344009Gk.LIZ);
    }

    public static void LJIIL(C1245860iWe c1245860iWe, EnumC338220DNs enumC338220DNs) {
        C1245880iWg c1245880iWg = C1245880iWg.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c1245880iWg.getClass();
        C1245880iWg.LIZ(c2344009Gk, c1245860iWe);
        C1245880iWg.LIZIZ(c2344009Gk, c1245860iWe);
        c2344009Gk.LJIIIIZZ("action_type", enumC338220DNs.getParamValue());
        C20684815ws.LJIILLIIL("school_verification_code_page", c2344009Gk.LIZ);
    }

    public static void LJIILIIL(EnumC2235608pO enumC2235608pO, int i) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", enumC2235608pO.getParamValue());
        c2344009Gk.LIZJ(i, "num_schools");
        C20684815ws.LJIILLIIL("school_verification_correct_school_page", c2344009Gk.LIZ);
    }

    public static void LJIILJJIL(C1245860iWe c1245860iWe, C0DNZ c0dnz) {
        C1245880iWg c1245880iWg = C1245880iWg.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c1245880iWg.getClass();
        C1245880iWg.LIZ(c2344009Gk, c1245860iWe);
        C1245880iWg.LIZIZ(c2344009Gk, c1245860iWe);
        c2344009Gk.LJIIIIZZ("action_type", c0dnz.getParamValue());
        C20684815ws.LJIILLIIL("school_verification_page", c2344009Gk.LIZ);
    }

    public static void LJIILL(C1245860iWe c1245860iWe, EnumC330310CxB enumC330310CxB) {
        C1245880iWg c1245880iWg = C1245880iWg.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c1245880iWg.getClass();
        C1245880iWg.LIZ(c2344009Gk, c1245860iWe);
        C1245880iWg.LIZIZ(c2344009Gk, c1245860iWe);
        c2344009Gk.LJIIIIZZ("result", enumC330310CxB.getParamValue());
        C20684815ws.LJIILLIIL("ttsocial_school_verification_result", c2344009Gk.LIZ);
    }

    public static void LIZIZ(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        if (str3 != null) {
            c2344009Gk.LJFF(Scene.SCENE_SERVICE, str3);
        }
        C20684815ws.LJIILLIIL("ttsocial_add_school_guide_popup_show", c2344009Gk.LIZ);
    }

    public static void LIZLLL(long j, long j2, long j3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j, "unix_start_time");
        c2344009Gk.LIZLLL(j2, "duration_since_cold_start");
        c2344009Gk.LIZLLL(j3, "latency");
        c2344009Gk.LJIIIIZZ("network_type", C786410Ut5.c3(C0CHQ.LIZ));
        C20684815ws.LJIILLIIL("add_school_page_school_list_download_latency", c2344009Gk.LIZ);
    }

    public static void LJIIJJI(int i, C1245860iWe c1245860iWe, String str) {
        C1245880iWg c1245880iWg = C1245880iWg.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c1245880iWg.getClass();
        C1245880iWg.LIZ(c2344009Gk, c1245860iWe);
        c2344009Gk.LJIIIIZZ("enter_method", "click_profile_school");
        c2344009Gk.LJIIIIZZ("swipe_up_tab_name", str);
        c2344009Gk.LIZJ(i, "tab_num");
        C20684815ws.LJIILLIIL("ttsocial_school_page_tab_swipe_up", c2344009Gk.LIZ);
    }

    public static void LIZ(String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("button_name", str3);
        if (str4 != null) {
            c2344009Gk.LJFF(Scene.SCENE_SERVICE, str4);
        }
        C20684815ws.LJIILLIIL("ttsocial_add_school_guide_popup_click", c2344009Gk.LIZ);
    }

    public static void LJIIIIZZ(C1245860iWe c1245860iWe, C0DKP c0dkp, boolean z, Integer num) {
        C1245880iWg c1245880iWg = C1245880iWg.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c1245880iWg.getClass();
        C1245880iWg.LIZ(c2344009Gk, c1245860iWe);
        C1245880iWg.LIZIZ(c2344009Gk, c1245860iWe);
        c2344009Gk.LJIIIIZZ("action_type", c0dkp.getParamValue());
        c2344009Gk.LIZJ(z ? 1 : 0, "is_new_user");
        if (num != null) {
            c2344009Gk.LJFF("year_graduation", String.valueOf(num.intValue()));
        }
        C20684815ws.LJIILLIIL("graduation_year_page", c2344009Gk.LIZ);
    }

    public static void LJIIJ(C1245860iWe c1245860iWe, String str, C0DOT c0dot, Integer num) {
        C1245880iWg c1245880iWg = C1245880iWg.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c1245880iWg.getClass();
        C1245880iWg.LIZ(c2344009Gk, c1245860iWe);
        c2344009Gk.LJIIIIZZ("search_keyword", str);
        c2344009Gk.LJIIIIZZ("result", c0dot.getParamValue());
        c2344009Gk.LJ(num, "search_num");
        C20684815ws.LJIILLIIL("ttsocial_school_page_search_result", c2344009Gk.LIZ);
    }

    public static void LJI(EnumC1579300rCS enumC1579300rCS, EnumC1579290rCR enumC1579290rCR, Pair pair, boolean z, EnumC338610DPf enumC338610DPf) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", enumC1579300rCS.getParamValue());
        c2344009Gk.LIZJ(z ? 1 : 0, "popular_filter_on");
        c2344009Gk.LJIIIIZZ("tab_name", enumC338610DPf.getValue());
        c2344009Gk.LJIIIIZZ("empty_type", enumC1579290rCR.getValue());
        if (pair != null) {
            c2344009Gk.LJFF("year_filter_from", String.valueOf(((Number) pair.getFirst()).intValue()));
            c2344009Gk.LJFF("year_filter_end", String.valueOf(((Number) pair.getSecond()).intValue()));
        }
        C20684815ws.LJIILLIIL("empty_school_community_page", c2344009Gk.LIZ);
    }
}
