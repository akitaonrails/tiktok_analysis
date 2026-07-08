package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KM0, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KM0 {
    public static final /* synthetic */ C0KM0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0KM0 PRE_CHECK_ACCOUNT_MISMATCH;
    public static final C0KM0 PRE_CHECK_FAILURE;
    public static final C0KM0 PRE_CHECK_PAYMENT_METHOD_MISMATCH;
    public static final C0KM0 PRE_CHECK_STORE_ACCOUNT_MISMATCH;
    public static final C0KM0 PRE_CHECK_SUCCESS;
    public static final C0KM0 PRE_CHECK_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<C0KM0> getEntries() {
        return LLILLL;
    }

    static {
        C0KM0 c0km0 = new C0KM0("PRE_CHECK_UNKNOWN", 0, -1);
        PRE_CHECK_UNKNOWN = c0km0;
        C0KM0 c0km02 = new C0KM0("PRE_CHECK_SUCCESS", 1, 0);
        PRE_CHECK_SUCCESS = c0km02;
        C0KM0 c0km03 = new C0KM0("PRE_CHECK_FAILURE", 2, 1);
        PRE_CHECK_FAILURE = c0km03;
        C0KM0 c0km04 = new C0KM0("PRE_CHECK_ACCOUNT_MISMATCH", 3, 2);
        PRE_CHECK_ACCOUNT_MISMATCH = c0km04;
        C0KM0 c0km05 = new C0KM0("PRE_CHECK_STORE_ACCOUNT_MISMATCH", 4, 3);
        PRE_CHECK_STORE_ACCOUNT_MISMATCH = c0km05;
        C0KM0 c0km06 = new C0KM0("PRE_CHECK_PAYMENT_METHOD_MISMATCH", 5, 4);
        PRE_CHECK_PAYMENT_METHOD_MISMATCH = c0km06;
        C0KM0[] c0km0Arr = {c0km0, c0km02, c0km03, c0km04, c0km05, c0km06};
        LLILLJJLI = c0km0Arr;
        LLILLL = new C2254308sP(c0km0Arr);
    }

    public static C0KM0[] values() {
        return (C0KM0[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0KM0 valueOf(String str) {
        return (C0KM0) C08FF.LIZ(C0KM0.class, str);
    }

    public C0KM0(String str, int i, int i2) {
        this.LL = i2;
    }
}
