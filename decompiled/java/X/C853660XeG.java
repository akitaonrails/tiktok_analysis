package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0XeG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C853660XeG {
    public static final C853660XeG LIZ = new C853660XeG();
    public static long LIZIZ = -1;

    public static void LJFF(EnumC1237100iIW enumC1237100iIW, boolean z) {
        if (!z) {
            return;
        }
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZ(enumC1237100iIW.ordinal(), "input_type");
        C20684815ws.LJIILLIIL("paste_verify_success", c0xgr.LIZ);
    }

    public static void LJI(String str, String str2, String str3) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("platform", "sms_verification");
        c0xgr.LIZLLL("enter_from", str2);
        c0xgr.LIZLLL("enter_method", str);
        c0xgr.LIZLLL("enter_type", str3);
        c0xgr.LIZLLL("login_panel_type", "signup");
        C20684815ws.LJIILLIIL("phone_email_click_next", c0xgr.LIZ);
    }

    public static void LIZJ(C853660XeG c853660XeG, String str, String str2, String str3) {
        c853660XeG.getClass();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str2);
        c0xgr.LIZLLL("enter_method", str);
        c0xgr.LIZLLL("login_panel_type", str3);
        c0xgr.LIZLLL("page", null);
        C20684815ws.LJIILLIIL("click_phone_email", c0xgr.LIZ);
    }

    public static void LIZIZ(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        if (z) {
            str5 = "start_phone_typing";
        } else {
            str5 = "start_email_typing";
        }
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str2);
        c0xgr.LIZLLL("enter_method", str);
        c0xgr.LIZLLL("login_panel_type", str3);
        if (str4 != null) {
            c0xgr.LIZJ("page", str4);
        }
        C20684815ws.LJIILLIIL(str5, c0xgr.LIZ);
    }

    public static void LJII(String str, Integer num, String str2, String str3, Boolean bool, String str4, String str5) {
        int i;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("platform", str3);
        c0xgr.LIZLLL("enter_method", str);
        c0xgr.LIZLLL("enter_from", str2);
        if (num != null && num.intValue() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        c0xgr.LIZ(i, "is_success");
        c0xgr.LIZLLL("login_panel_type", str4);
        if (num == null) {
            c0xgr.LIZJ("error_code", "");
        } else {
            c0xgr.LIZ(num.intValue(), "error_code");
        }
        if (bool != null) {
            c0xgr.LIZ(1 ^ (bool.booleanValue() ? 1 : 0), "is_register");
        }
        if (str5 != null) {
            c0xgr.LIZJ("enter_type", str5);
        }
        C20684815ws.LJIILLIIL("register_click_next_result", c0xgr.LIZ);
    }

    public static void LIZ(C853660XeG c853660XeG, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        if ((i & 32) != 0) {
            str6 = null;
        }
        if ((i & 64) != 0) {
            str7 = null;
        }
        c853660XeG.getClass();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str2);
        c0xgr.LIZLLL("enter_method", str);
        c0xgr.LIZLLL("page", str3);
        c0xgr.LIZLLL("3p_platform", str4);
        c0xgr.LIZLLL("config_key", str5);
        c0xgr.LIZLLL("popup_freq", str6);
        c0xgr.LIZLLL("enter_position", str7);
        C20684815ws.LJIILLIIL("phone_binding_show", c0xgr.LIZ);
    }

    public static void LIZLLL(boolean z, String str, String str2, int i, String str3, String str4, Boolean bool, Boolean bool2, String str5, String str6) {
        String str7;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("platform", str2);
        c0xgr.LIZLLL("enter_method", str);
        c0xgr.LIZ(z ? 1 : 0, "is_success");
        c0xgr.LIZ(0, "is_register");
        c0xgr.LIZLLL("error_code", String.valueOf(i));
        if (str3 == null) {
            str3 = "";
        }
        c0xgr.LIZLLL("enter_from", str3);
        if (str4 != null) {
            c0xgr.LIZJ("login_panel_type", str4);
        }
        String str8 = "1";
        if (bool != null) {
            if (bool.booleanValue()) {
                str7 = "1";
            } else {
                str7 = CardStruct.IStatusCode.DEFAULT;
            }
            c0xgr.LIZJ("is_org_account", str7);
        }
        if (bool2 != null) {
            if (!bool2.booleanValue()) {
                str8 = CardStruct.IStatusCode.DEFAULT;
            }
            c0xgr.LIZJ("is_org_account_inter_period", str8);
        }
        if (str5 != null) {
            c0xgr.LIZJ("business_platform_name", str5);
        }
        if (str6 != null) {
            c0xgr.LIZJ("tt_account_type", str6);
        }
        C20684815ws.LJIILLIIL("login_click_next_result", c0xgr.LIZ);
    }
}
