package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03M1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03M1 {
    public static final C03M1 BILL_INFO;
    public static final C03M1 CREATE_ORDER;
    public static final /* synthetic */ C03M1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C03M1 POLL_ORDER;
    public final int LL;

    public static InterfaceC2044707zh<C03M1> getEntries() {
        return LLILLL;
    }

    static {
        C03M1 c03m1 = new C03M1("BILL_INFO", 0, 0);
        BILL_INFO = c03m1;
        C03M1 c03m12 = new C03M1("CREATE_ORDER", 1, 1);
        CREATE_ORDER = c03m12;
        C03M1 c03m13 = new C03M1("POLL_ORDER", 2, 2);
        POLL_ORDER = c03m13;
        C03M1[] c03m1Arr = {c03m1, c03m12, c03m13};
        LLILLJJLI = c03m1Arr;
        LLILLL = new C2254308sP(c03m1Arr);
    }

    public static C03M1[] values() {
        return (C03M1[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C03M1 valueOf(String str) {
        return (C03M1) C08FF.LIZ(C03M1.class, str);
    }

    public C03M1(String str, int i, int i2) {
        this.LL = i2;
    }
}
