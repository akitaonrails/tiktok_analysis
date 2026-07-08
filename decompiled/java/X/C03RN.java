package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03RN, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03RN {
    public static final C03RN ACTIVATE_DIALOG;
    public static final C03RN ACTIVATE_FAIL;
    public static final C03RN ACTIVATE_REVIEW;
    public static final C03RN ACTIVATE_SUCCESS;
    public static final C03RN ACTIVATE_SUCCESS_ABOVE_LIMIT;
    public static final C03RN ACTIVATE_SUCCESS_SECURITY_CONCERN;
    public static final /* synthetic */ C03RN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C03RN> getEntries() {
        return LLILLL;
    }

    static {
        C03RN c03rn = new C03RN("ACTIVATE_DIALOG", 0, "activate_bnpl_cashier");
        ACTIVATE_DIALOG = c03rn;
        C03RN c03rn2 = new C03RN("ACTIVATE_REVIEW", 1, "ttpl_activate_review");
        ACTIVATE_REVIEW = c03rn2;
        C03RN c03rn3 = new C03RN("ACTIVATE_FAIL", 2, "ttpl_activate_fail");
        ACTIVATE_FAIL = c03rn3;
        C03RN c03rn4 = new C03RN("ACTIVATE_SUCCESS", 3, "ttpl_activate_success");
        ACTIVATE_SUCCESS = c03rn4;
        C03RN c03rn5 = new C03RN("ACTIVATE_SUCCESS_ABOVE_LIMIT", 4, "ttpl_activate_success_order_above_limit");
        ACTIVATE_SUCCESS_ABOVE_LIMIT = c03rn5;
        C03RN c03rn6 = new C03RN("ACTIVATE_SUCCESS_SECURITY_CONCERN", 5, "ttpl_activate_success_security_concern");
        ACTIVATE_SUCCESS_SECURITY_CONCERN = c03rn6;
        C03RN[] c03rnArr = {c03rn, c03rn2, c03rn3, c03rn4, c03rn5, c03rn6};
        LLILLJJLI = c03rnArr;
        LLILLL = new C2254308sP(c03rnArr);
    }

    public static C03RN[] values() {
        return (C03RN[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C03RN valueOf(String str) {
        return (C03RN) C08FF.LIZ(C03RN.class, str);
    }

    public C03RN(String str, int i, String str2) {
        this.LL = str2;
    }
}
