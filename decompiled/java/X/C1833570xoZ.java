package X;

import com.bytedance.android.livesdk.userservice.UserService;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0xoZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1833570xoZ {
    public static final C1833570xoZ LIZ = new C1833570xoZ();
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static final Set<String> LIZLLL = new LinkedHashSet();

    public static void LIZ(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("anchor_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        c2344009Gk.LJIIIIZZ("enter_from_page", LIZIZ);
        c2344009Gk.LJIIIIZZ("enter_from", LIZJ);
        c2344009Gk.LJIIIIZZ("event_page", "live_replay");
        c2344009Gk.LJIIIIZZ("module_name", str);
        c2344009Gk.LJIIIIZZ("click_position", str3);
        c2344009Gk.LJIIIIZZ("room_id", str2);
        C20684815ws.LJIILLIIL("livesdk_live_replay_module_click", c2344009Gk.LIZ);
    }

    public static void LIZJ(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("popup_type", "auto_add_post");
        c2344009Gk.LJIIIIZZ("action_type", str2);
        if (str3 != null) {
            c2344009Gk.LJFF("click_type", str3);
        }
        C20684815ws.LJIILLIIL("livesdk_live_anchor_highlight_element_popup", c2344009Gk.LIZ);
    }

    public static void LJFF(String str, String str2, boolean z) {
        String str3;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            str3 = "anchor_id";
        } else {
            str3 = "viewer_user_id";
        }
        c2344009Gk.LJIIIIZZ(str3, str);
        c2344009Gk.LJIIIIZZ("enter_from", "viewer_live_replay_page");
        c2344009Gk.LJIIIIZZ("enter_from_page", "viewer_live_replay_page");
        c2344009Gk.LJIIIIZZ("module_name", str2);
        C20684815ws.LJIILLIIL("livesdk_viewer_live_replay_module_click", c2344009Gk.LIZ);
    }

    public static void LJ(C1833570xoZ c1833570xoZ, String str, String str2, C1833560xoY c1833560xoY, int i) {
        String str3;
        String str4;
        String str5;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            c1833560xoY = null;
        }
        c1833570xoZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("anchor_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        if (c1833560xoY == null || (str3 = c1833560xoY.LIZJ) == null) {
            str3 = LIZIZ;
        }
        c2344009Gk.LJIIIIZZ("enter_from_page", str3);
        if (c1833560xoY == null || (str4 = c1833560xoY.LIZIZ) == null) {
            str4 = LIZJ;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        c2344009Gk.LJIIIIZZ("button_name", str);
        if (c1833560xoY == null || (str5 = c1833560xoY.LIZ) == null) {
            str5 = "";
        }
        c2344009Gk.LJIIIIZZ("enter_method", str5);
        if (str2 != null) {
            c2344009Gk.LJFF("moderator_user_id", str2);
        }
        C20684815ws.LJIILLIIL("livesdk_live_replay_setting_click", c2344009Gk.LIZ);
    }

    public static void LIZLLL(C1833570xoZ c1833570xoZ, Long l, Integer num, String str, Boolean bool, Integer num2, String str2, int i) {
        if ((i & 1) != 0) {
            l = 0L;
        }
        if ((i & 2) != 0) {
            num = 0;
        }
        if ((i & 8) != 0) {
            bool = Boolean.FALSE;
        }
        if ((i & 16) != 0) {
            num2 = -1;
        }
        if ((i & 32) != 0) {
            str2 = "";
        }
        c1833570xoZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJ(l, "duration");
        c2344009Gk.LJIIIIZZ("error_msg", str2);
        c2344009Gk.LJ(num2, "error_code");
        c2344009Gk.LJ(num, "request_scene");
        c2344009Gk.LJIIIIZZ("request_type", str);
        c2344009Gk.LIZJ(C500260Jjc.LJJJI(bool) ? 1 : 0, "is_response_complete");
        C20684815ws.LJIILLIIL("livesdk_live_replay_request_quality", c2344009Gk.LIZ);
    }
}
