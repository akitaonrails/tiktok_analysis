package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZBV, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZBV {
    public static final C0ZBV ABNORMAL_FAIL;
    public static final C0ZBV BUSINESS_FAIL;
    public static final /* synthetic */ C0ZBV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0ZBV SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<C0ZBV> getEntries() {
        return LLILLL;
    }

    static {
        C0ZBV c0zbv = new C0ZBV("SUCCESS", 0, 0);
        SUCCESS = c0zbv;
        C0ZBV c0zbv2 = new C0ZBV("BUSINESS_FAIL", 1, 1);
        BUSINESS_FAIL = c0zbv2;
        C0ZBV c0zbv3 = new C0ZBV("ABNORMAL_FAIL", 2, 2);
        ABNORMAL_FAIL = c0zbv3;
        C0ZBV[] c0zbvArr = {c0zbv, c0zbv2, c0zbv3};
        LLILLJJLI = c0zbvArr;
        LLILLL = new C2254308sP(c0zbvArr);
    }

    public static C0ZBV[] values() {
        return (C0ZBV[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0ZBV valueOf(String str) {
        return (C0ZBV) C08FF.LIZ(C0ZBV.class, str);
    }

    public C0ZBV(String str, int i, int i2) {
        this.LL = i2;
    }
}
