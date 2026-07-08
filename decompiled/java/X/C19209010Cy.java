package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.10Cy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19209010Cy {
    public static final C19209010Cy LIZ = new C19209010Cy();

    public static void LIZ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", "homepage_message");
        c2344009Gk.LJFF("pop_up_type", str);
        c2344009Gk.LJFF("trigger", "new_message");
        c2344009Gk.LJFF("action_type", str2);
        c2344009Gk.LJFF("channel_type", "edm");
        C20684815ws.LJIILLIIL("click_channel_permission_banner", c2344009Gk.LIZ);
    }

    public static void LIZJ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("page_name", "homepage_message");
        c2344009Gk.LJFF("trigger", "new_message");
        c2344009Gk.LJFF("pop_up_type", str);
        c2344009Gk.LJFF("action_type", str2);
        C20684815ws.LJIILLIIL("tiktok_sms_permission_banner_click", c2344009Gk.LIZ);
    }

    public static void LIZLLL(String str, String str2, String str3, String str4, String str5) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str);
        int i = 0;
        if (str2.length() == 0) {
            str2 = "others";
        }
        c2344009Gk.LJFF("page_name", str2);
        c2344009Gk.LJFF("trigger", str3);
        c2344009Gk.LJFF("show_type", "popup");
        c2344009Gk.LIZJ(1, "mobile");
        c2344009Gk.LJFF("action_type", str4);
        if (str5 == null) {
            i = 1;
        }
        c2344009Gk.LIZJ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (str5 != null) {
            c2344009Gk.LJFF("fail_reason", str5);
        }
        C20684815ws.LJIILLIIL("tiktok_sms_popup_click", c2344009Gk.LIZ);
    }

    public static void LIZIZ(String str, String str2, String str3, String str4, String str5, String str6) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str);
        c2344009Gk.LJFF("trigger", str2);
        c2344009Gk.LJFF("pop_up_type", str3);
        c2344009Gk.LJFF("action_type", str4);
        c2344009Gk.LJFF(Scene.SCENE_SERVICE, str5);
        c2344009Gk.LJFF("sub_scene", str6);
        C20684815ws.LJIILLIIL("click_email_permission_pop_up", c2344009Gk.LIZ);
    }
}
