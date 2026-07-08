package X;

import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0dxu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1070560dxu {
    public static final C1070560dxu LIZ = new C1070560dxu();

    public static String LIZJ(int i) {
        return i != 1 ? i != 2 ? i != 6 ? "" : "mlbb" : "fb" : "contact";
    }

    public static void LIZ(int i) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "privacy_setting");
        c2344009Gk.LJIIIIZZ("platform", LIZJ(i));
        C20684815ws.LJIILLIIL("remove_sync_auth", c2344009Gk.LIZ);
    }

    public static void LIZIZ(String str) {
        String curUserId;
        C2344009Gk c2344009Gk = new C2344009Gk();
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF == null || (curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId()) == null) {
            curUserId = "";
        }
        c2344009Gk.LJIIIIZZ("anchor_id", curUserId);
        c2344009Gk.LJIIIIZZ("enter_from", "setting");
        c2344009Gk.LJIIIIZZ("event_page", "setting");
        c2344009Gk.LJIIIIZZ("action_type", str);
        C20684815ws.LJIILLIIL("livesdk_live_event_list_entrance", c2344009Gk.LIZ);
    }

    public static void LJ(int i) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "privacy_setting");
        c2344009Gk.LJIIIIZZ("platform", LIZJ(i));
        C20684815ws.LJIILLIIL("remove_sync_pop", c2344009Gk.LIZ);
    }

    public static void LJFF(boolean z) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            str = "success";
        } else {
            str = "fail";
        }
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        C20684815ws.LJIILLIIL(" remove_result", c2344009Gk.LIZ);
    }

    public static void LJI(int i) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "privacy_setting");
        c2344009Gk.LJIIIIZZ("method", "manual");
        c2344009Gk.LJIIIIZZ("to_status", "off");
        c2344009Gk.LJIIIIZZ("platform", LIZJ(i));
        if (i == 1) {
            if (C1076010e6h.LIZJ.LJJII()) {
                c2344009Gk.LJFF("prompt_content", "ad_disclosure");
            } else {
                c2344009Gk.LJFF("prompt_content", "no_ad_disclosure");
            }
        }
        C20684815ws.LJIILLIIL("switch_sync_auth", c2344009Gk.LIZ);
    }

    public static void LJII(int i) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "privacy_setting");
        c2344009Gk.LJIIIIZZ("method", "manual");
        c2344009Gk.LJIIIIZZ("to_status", "on");
        c2344009Gk.LJIIIIZZ("platform", LIZJ(i));
        if (i == 1) {
            if (C1076010e6h.LIZJ.LJJII()) {
                c2344009Gk.LJFF("prompt_content", "ad_disclosure");
            } else {
                c2344009Gk.LJFF("prompt_content", "no_ad_disclosure");
            }
        }
        C20684815ws.LJIILLIIL("switch_sync_auth", c2344009Gk.LIZ);
    }

    public static void LIZLLL(int i, boolean z) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "privacy_setting");
        if (z) {
            str = "remove";
        } else {
            str = "cancel";
        }
        c2344009Gk.LJIIIIZZ("result", str);
        c2344009Gk.LJIIIIZZ("platform", LIZJ(i));
        C20684815ws.LJIILLIIL("confirm_remove_sync_pop", c2344009Gk.LIZ);
    }
}
