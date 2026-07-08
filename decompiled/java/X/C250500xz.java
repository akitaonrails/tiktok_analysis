package X;

/* JADX INFO: renamed from: X.00xz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C250500xz {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(int i, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_limit_manage_popup_click");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_anchor");
        c474500IjALIZ.LJJII("basic", "reminder_type");
        c474500IjALIZ.LJJII(str, "click_button");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(int i, String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_limit_click");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_anchor");
        c474500IjALIZ.LJJII(str, "first_panel_from");
        c474500IjALIZ.LJJII(str2, "reminder_type");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_limit_gear_setting_panel_show");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_anchor");
        c474500IjALIZ.LJJII(str, "first_panel_from");
        c474500IjALIZ.LJJII(str2, "second_panel_from");
        c474500IjALIZ.LJJII("basic", "reminder_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "if_show_apply");
        c474500IjALIZ.LJJII(str3, "apply_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i3), "apply_amount");
        c474500IjALIZ.LJJII(Integer.valueOf(i4), "style");
        String str5 = "currency";
        c474500IjALIZ.LJJII(str4, "currency");
        if (z) {
            str5 = "coins";
        }
        c474500IjALIZ.LJJII(str5, "coins_or_currency");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }
}
