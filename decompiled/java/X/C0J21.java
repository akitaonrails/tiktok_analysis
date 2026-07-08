package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0J21, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J21 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LJIIIIZZ(int i) {
        switch (i) {
            case 1:
                return "save_success";
            case 2:
                return "cancel_save";
            case 3:
                return "discard_edit";
            case 4:
                return "cancel_discard";
            case 5:
                return "submit_success";
            case 6:
                return "cancel_submit";
            case 7:
                return "delete_keyword";
            case 8:
                return "cancel_delete";
            default:
                return "";
        }
    }

    public static void LJFF() {
        C0J26 c0j26 = C0J26.LL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "automsg_setting");
        c0j26.invoke("ttelite_BA_automsg_faq", c2344009Gk.LIZ);
    }

    public static void LIZ(String str) {
        C0J20 c0j20 = C0J20.LL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c0j20.invoke("ttelite_BA_automsg_cancel", c2344009Gk.LIZ);
    }

    public static void LIZIZ(String str) {
        C0J22 c0j22 = C0J22.LL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c0j22.invoke("ttelite_BA_automsg_discard", c2344009Gk.LIZ);
    }

    public static void LIZJ(String str) {
        C0J23 c0j23 = C0J23.LL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c0j23.invoke("ttelite_BA_automsg_exit", c2344009Gk.LIZ);
    }

    public static void LIZLLL(int i) {
        C0J24 c0j24 = C0J24.LL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, LJIIIIZZ(i));
        c0j24.invoke("edit_auto_reply_keyword", c2344009Gk.LIZ);
    }

    public static void LJ(int i) {
        C0J25 c0j25 = C0J25.LL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, LJIIIIZZ(i));
        c0j25.invoke("edit_welcome_message", c2344009Gk.LIZ);
    }

    public static void LJII(int i, boolean z) {
        String str;
        String str2;
        C0J28 c0j28 = C0J28.LL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "business_message_setting_page");
        if (i != 1) {
            if (i == 2) {
                str = "auto_reply";
            } else {
                return;
            }
        } else {
            str = "welcome_message";
        }
        c2344009Gk.LJIIIIZZ("target", str);
        if (z) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        c0j28.invoke("switch_business_message_button", c2344009Gk.LIZ);
    }

    public static void LJI(String str, int i, Integer num, int i2) {
        String str2;
        C0J27 c0j27 = null;
        if ((i2 & 4) != 0) {
            num = null;
        }
        if ((i2 & 8) != 0) {
            c0j27 = C0J27.LL;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        if (i != 1) {
            if (i == 2) {
                str2 = "business_auto_reply";
            } else {
                return;
            }
        } else {
            str2 = "business_welcome_message";
        }
        c2344009Gk.LJIIIIZZ("target", str2);
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "msg_status");
        }
        c0j27.invoke("enter_business_message_edit", c2344009Gk.LIZ);
    }
}
