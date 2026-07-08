package X;

/* JADX INFO: renamed from: X.0iMA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1239360iMA {
    public static final C1239360iMA LIZ = new C1239360iMA();

    public static void LIZJ(String str, String str2, String str3, String str4, String str5, int i, EnumC1239350iM9 enumC1239350iM9, String str6, int i2) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("enter_method", str2);
        c0xgr.LIZLLL("login_panel_type", str3);
        c0xgr.LIZLLL("platform", str4);
        c0xgr.LIZLLL("email_type", str5);
        c0xgr.LIZLLL("mobile_type", str6);
        c0xgr.LIZ(i, "popup_freq");
        c0xgr.LIZLLL("click_type", enumC1239350iM9.getClick());
        c0xgr.LIZ(i2, "is_password");
        C20684815ws.LJIILLIIL("failed_3p_login_popup_click", c0xgr.LIZ);
    }

    public static void LIZ(String str, String str2, String str3, EnumC1222190huT enumC1222190huT, long j, String str4, int i, int i2, String str5, int i3, int i4) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("enter_method", str2);
        c0xgr.LIZLLL("platform", str3);
        c0xgr.LIZLLL("matching_reason", enumC1222190huT.getReason());
        c0xgr.LIZIZ(j, "duration");
        c0xgr.LIZLLL("email_type", str4);
        c0xgr.LIZLLL("mobile_type", str5);
        c0xgr.LIZ(i, "error_code");
        c0xgr.LIZ(i2, "has_find_account");
        c0xgr.LIZ(i3, "has_password");
        c0xgr.LIZ(i4, "auto_login_eligible");
        C20684815ws.LJIILLIIL("account_mapping_result", c0xgr.LIZ);
    }
}
