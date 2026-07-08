package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03RO, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03RO {
    public static final C03RO ACTIVATE_FAIL;
    public static final C03RO ACTIVATE_PROCESSING;
    public static final C03RO ACTIVATE_SUCCESS;
    public static final C03RO ACTIVATE_SUCCESS_ORDER_ABOVE_LIMIT;
    public static final C03RO ACTIVATE_SUCCESS_RISK_REJECT;
    public static final /* synthetic */ C03RO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C03RO> getEntries() {
        return LLILLL;
    }

    static {
        C03RO c03ro = new C03RO("ACTIVATE_SUCCESS", 0, "SUCCESS");
        ACTIVATE_SUCCESS = c03ro;
        C03RO c03ro2 = new C03RO("ACTIVATE_FAIL", 1, "FAIL");
        ACTIVATE_FAIL = c03ro2;
        C03RO c03ro3 = new C03RO("ACTIVATE_PROCESSING", 2, "PROCESSING");
        ACTIVATE_PROCESSING = c03ro3;
        C03RO c03ro4 = new C03RO("ACTIVATE_SUCCESS_ORDER_ABOVE_LIMIT", 3, "activate_success_order_above_limit");
        ACTIVATE_SUCCESS_ORDER_ABOVE_LIMIT = c03ro4;
        C03RO c03ro5 = new C03RO("ACTIVATE_SUCCESS_RISK_REJECT", 4, "activate_success_risk_reject");
        ACTIVATE_SUCCESS_RISK_REJECT = c03ro5;
        C03RO[] c03roArr = {c03ro, c03ro2, c03ro3, c03ro4, c03ro5};
        LLILLJJLI = c03roArr;
        LLILLL = new C2254308sP(c03roArr);
    }

    public static C03RO[] values() {
        return (C03RO[]) LLILLJJLI.clone();
    }

    public final String getStatus() {
        return this.LL;
    }

    public static C03RO valueOf(String str) {
        return (C03RO) C08FF.LIZ(C03RO.class, str);
    }

    public C03RO(String str, int i, String str2) {
        this.LL = str2;
    }
}
