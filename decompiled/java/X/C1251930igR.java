package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0igR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1251930igR {
    public static void LIZIZ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "others_homepage");
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    public static void LIZ(Boolean bool, String str) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "others_homepage");
        c2344009Gk.LJIIIIZZ("target", str);
        Map<String, String> map = c2344009Gk.LIZ;
        if (C299940BpI.LIZ()) {
            if (bool.booleanValue()) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            ((HashMap) map).put("remove_linked_account_toggle", str2);
        }
        C20684815ws.LJIILLIIL("block_confirm", map);
    }

    public static void LIZJ(Boolean bool, String str) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "others_homepage");
        c2344009Gk.LJIIIIZZ("target", str);
        Map<String, String> map = c2344009Gk.LIZ;
        if (C299940BpI.LIZ()) {
            if (bool.booleanValue()) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            ((HashMap) map).put("remove_linked_account_toggle", str2);
        }
        C20684815ws.LJIILLIIL("unblock_confirm", map);
    }

    public static void LIZLLL(int i, String str, String str2, String str3, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "others_homepage");
        c2344009Gk.LJIIIIZZ("user_id", str);
        c2344009Gk.LIZJ(i, "follow_status");
        c2344009Gk.LJIIIIZZ("enter_method", "button");
        c2344009Gk.LIZJ(z ? 1 : 0, "is_enterprise");
        c2344009Gk.LJIIIIZZ("rec_type", str2);
        c2344009Gk.LIZJ(i, "relation_tag");
        c2344009Gk.LJIIIIZZ("to_user_type", str3);
        C20684815ws.LJIILLIIL("show_message_button", c2344009Gk.LIZ);
    }
}
