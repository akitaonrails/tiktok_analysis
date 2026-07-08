package X;

/* JADX INFO: renamed from: X.0fq1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142550fq1 {
    public static final String LIZ(int i) {
        boolean zLJIIIZ = C1126800fQc.LIZ.KE0().LJIIIZ();
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return "preclaim";
        }
        if (!zLJIIIZ) {
            return null;
        }
        return "exchange";
    }

    public static final void LIZJ(String str, String str2, String str3) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_incentive_popup_show");
        c474500IjALIZ.LJJII(str2, "task_type");
        c474500IjALIZ.LJJII(str, "popup_name");
        c474500IjALIZ.LJJII(str3, "gift_enter_from");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZIZ(String str, String str2, String str3, String str4) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_incentive_popup_click");
        c474500IjALIZ.LJJII(str2, "task_type");
        c474500IjALIZ.LJJII(str, "popup_name");
        c474500IjALIZ.LJJII(str3, "click_type");
        c474500IjALIZ.LJJII(str4, "gift_enter_from");
        c474500IjALIZ.LIZ();
    }
}
