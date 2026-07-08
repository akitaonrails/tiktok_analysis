package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0lOY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1356160lOY {
    public static final C1356160lOY LIZ = new C1356160lOY();

    public static void LIZ(String str, String str2, String str3, Aweme aweme) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1355960lOE.LIZLLL(c2344009Gk, aweme);
        C1355960lOE.LIZ(c2344009Gk, aweme);
        C1355960lOE.LIZIZ(c2344009Gk, aweme);
        C641850PFn.LIZ(c2344009Gk, C1ER1.LIZIZ.fetchSearchParams(str, ""));
        c2344009Gk.LJFF("to_user_id", str2);
        c2344009Gk.LJFF("enter_method", str3);
        c2344009Gk.LJFF("enter_from", str);
        C20684815ws.LJIILLIIL("enter_personal_detail", c2344009Gk.LIZ);
    }

    public static void LIZIZ(String str, String str2, String str3, Aweme aweme) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1355960lOE.LIZLLL(c2344009Gk, aweme);
        C1355960lOE.LIZ(c2344009Gk, aweme);
        c2344009Gk.LJFF("click_type", str3);
        c2344009Gk.LJFF("enter_from", str);
        c2344009Gk.LJFF("enter_method", str2);
        C641850PFn.LIZ(c2344009Gk, C1ER1.LIZIZ.fetchSearchParams(str, ""));
        C20684815ws.LJIILLIIL("lemon8_download_popup_click", c2344009Gk.LIZ);
    }

    public static void LIZJ(C1356160lOY c1356160lOY, Aweme aweme, String str, String str2) {
        c1356160lOY.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1355960lOE.LIZLLL(c2344009Gk, aweme);
        C1355960lOE.LIZ(c2344009Gk, aweme);
        C1355960lOE.LIZIZ(c2344009Gk, aweme);
        C641850PFn.LIZ(c2344009Gk, C1ER1.LIZIZ.fetchSearchParams(str, ""));
        c2344009Gk.LJFF("is_fullscreen", "1");
        c2344009Gk.LJFF("enter_from", str);
        c2344009Gk.LJFF("enter_method", "click_comment_icon");
        c2344009Gk.LJFF("to_user_id", str2);
        C20684815ws.LJIILLIIL("post_comment", c2344009Gk.LIZ);
    }

    public static void LIZLLL(C1356160lOY c1356160lOY, String str, String str2, String str3, String str4, String str5) {
        c1356160lOY.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("traffic_type", "tiktok_search_inapp_native");
        c2344009Gk.LJFF("page_id", str);
        c2344009Gk.LJFF("current_page_name", "gallery");
        c2344009Gk.LJFF("current_page_module", str2);
        c2344009Gk.LJFF("current_position", str3);
        c2344009Gk.LJFF("is_cta", str4);
        c2344009Gk.LJFF("click_result", str5);
        C20684815ws.LJIILLIIL("wap_click", c2344009Gk.LIZ);
    }

    public static void LJ(C1356160lOY c1356160lOY, String str, String str2, String str3, String str4, int i) {
        String str5;
        String str6;
        if ((i & 1) != 0) {
            str5 = "tiktok_search_inapp_native";
        } else {
            str5 = null;
        }
        if ((i & 4) != 0) {
            str6 = "gallery";
        } else {
            str6 = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        c1356160lOY.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("traffic_type", str5);
        c2344009Gk.LJFF("page_id", str);
        c2344009Gk.LJFF("current_page_name", str6);
        c2344009Gk.LJFF("current_page_module", str2);
        c2344009Gk.LJFF("current_position", str3);
        c2344009Gk.LJFF("comment_id", str4);
        C20684815ws.LJIILLIIL("wap_cta_show", c2344009Gk.LIZ);
    }
}
