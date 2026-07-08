package X;

/* JADX INFO: renamed from: X.011W, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C011W {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, boolean z, boolean z2, String str2, int i, String str3) {
        String str4;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_subscription_page_tips_pincard_quick_set_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_close");
        if (i != 1) {
            if (i != 2) {
                str4 = "";
            } else {
                str4 = "unpin";
            }
        } else {
            str4 = "pin";
        }
        c474500IjALIZ.LJJII(str4, "pin_status");
        c474500IjALIZ.LJJII("anchor", "user_type");
        c474500IjALIZ.LJJII(str, "perk_id");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z2)) ? 1 : 0), "is_template");
        c474500IjALIZ.LJJII(str2, "template_id");
        c474500IjALIZ.LJJII("tip", "show_entrance");
        c474500IjALIZ.LJJII(str3, "anchor_id");
        c474500IjALIZ.LIZ();
    }
}
