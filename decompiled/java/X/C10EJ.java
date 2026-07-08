package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.10EJ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10EJ {
    public static final C10EJ LIZ = new C10EJ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(582));

    public static String LIZ(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "" : "off" : "personalized" : "all";
    }

    public static void LJI(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", "notification_bell");
        c2344009Gk.LJIIIIZZ("enter_reason", "leave");
        C20684815ws.LJIILLIIL("push_pre_permission_show", c2344009Gk.LIZ);
    }

    public static void LIZJ(C10EF c10ef, int i) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from_merge", c10ef.LIZJ);
        c2344009Gk.LJIIIIZZ("enter_method", c10ef.LIZLLL);
        c2344009Gk.LJIIIIZZ("room_id", c10ef.LIZ);
        c2344009Gk.LJIIIIZZ("anchor_id", c10ef.LIZIZ);
        c2344009Gk.LJIIIIZZ("setting_type", LIZ(i));
        c2344009Gk.LJII(c10ef.LJ);
        C20684815ws.LJIILLIIL("livesdk_live_notification_choose", c2344009Gk.LIZ);
    }

    public static void LIZLLL(String str, String str2) {
        C20684815ws.LJIILLIIL("manage_push_setting_popup_action", C2097608Jq.LJIIJ(new Pair("setting_type", str), new Pair("action_type", str2)));
    }

    public static void LJFF(String str, Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(map);
        c2344009Gk.LJIIIIZZ("popup_type", str);
        C20684815ws.LJIILLIIL("mpsdk_sub_details_popup_show", c2344009Gk.LIZ);
    }

    public static void LJ(String str, String str2, Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(map);
        c2344009Gk.LJIIIIZZ("popup_type", str);
        c2344009Gk.LJIIIIZZ("click_target", str2);
        C20684815ws.LJIILLIIL("mpsdk_sub_details_popup_click", c2344009Gk.LIZ);
    }

    public static void LJII(int i, String str, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "others_homepage");
        c2344009Gk.LJIIIIZZ("user_id", str);
        c2344009Gk.LIZJ(i, "follow_status");
        c2344009Gk.LJIIIIZZ("enter_method", "button");
        c2344009Gk.LIZJ(z ? 1 : 0, "is_enterprise");
        C20684815ws.LJIILLIIL("show_message_button", c2344009Gk.LIZ);
    }

    public static void LIZIZ(int i, int i2, int i3, int i4, String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LIZJ(i2, "follow_status");
        c2344009Gk.LJIIIIZZ("to_user_id", str2);
        c2344009Gk.LJIIIIZZ("previous_page", str3);
        if (i != 1) {
            if (i == 4) {
                LIZ.getClass();
                c2344009Gk.LJFF("from_status", LIZ(i3));
                c2344009Gk.LJFF("to_status", LIZ(i4));
            }
        } else {
            LIZ.getClass();
            c2344009Gk.LJFF("video_post_from_status", LIZ(i3));
            c2344009Gk.LJFF("video_post_to_status", LIZ(i4));
        }
        C20684815ws.LJIILLIIL("change_notification_preference", c2344009Gk.LIZ);
    }
}
