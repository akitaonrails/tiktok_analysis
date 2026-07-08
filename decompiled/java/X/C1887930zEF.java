package X;

/* JADX INFO: renamed from: X.0zEF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1887930zEF {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, String str) {
        String str2;
        if (i == 1) {
            str2 = "all_filter_on_ck";
        } else {
            str2 = "all_filter_off_ck";
        }
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        C1887860zE8 c1887860zE8 = new C1887860zE8();
        C1887860zE8.LIZ(c1887860zE8, "enter_from", "privacy_and_setting");
        C1887860zE8.LIZ(c1887860zE8, "enter_method", str);
        c1163504gr.onEventV3(str2, c1887860zE8.LIZ);
    }

    public static void LIZIZ(String str, String str2) {
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        C1887860zE8 c1887860zE8 = new C1887860zE8();
        C1887860zE8.LIZ(c1887860zE8, "failed_reason", str);
        C1887860zE8.LIZ(c1887860zE8, "enter_from", str2);
        c1163504gr.onEventV3("keyword_filter_add_failed_ck", c1887860zE8.LIZ);
    }
}
