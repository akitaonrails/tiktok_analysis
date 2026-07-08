package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03ZQ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03ZQ {
    public static final C03ZQ COMBINE_PAYMENT;
    public static final C03ZQ DOUBLE_COLUMN;
    public static final /* synthetic */ C03ZQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C03ZQ NORMAL;

    public static InterfaceC2044707zh<C03ZQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C03ZQ c03zq = new C03ZQ("NORMAL", 0);
        NORMAL = c03zq;
        C03ZQ c03zq2 = new C03ZQ("COMBINE_PAYMENT", 1);
        COMBINE_PAYMENT = c03zq2;
        C03ZQ c03zq3 = new C03ZQ("DOUBLE_COLUMN", 2);
        DOUBLE_COLUMN = c03zq3;
        C03ZQ[] c03zqArr = {c03zq, c03zq2, c03zq3};
        LL = c03zqArr;
        LLILLJJLI = new C2254308sP(c03zqArr);
    }

    public static C03ZQ[] values() {
        return (C03ZQ[]) LL.clone();
    }

    public static C03ZQ valueOf(String str) {
        return (C03ZQ) C08FF.LIZ(C03ZQ.class, str);
    }

    public C03ZQ(String str, int i) {
    }
}
