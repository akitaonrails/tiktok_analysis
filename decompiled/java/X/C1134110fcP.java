package X;

/* JADX INFO: renamed from: X.0fcP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134110fcP {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, boolean z) {
        String str3;
        if (z) {
            str3 = "recharge";
        } else {
            str3 = "send_gift";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_wallet_limit_popup_click");
        c474500IjALIZ.LJJII(4005189, "error_code");
        c474500IjALIZ.LJJII(str3, "entry_type");
        c474500IjALIZ.LJJII(str2, "click_area");
        if (z) {
            c474500IjALIZ.LJJII("room_recharge", "hit_entry");
        } else {
            c474500IjALIZ.LJJII(C1123580fLQ.LIZ(str), "gift_enter_from");
        }
        c474500IjALIZ.LIZ();
    }
}
