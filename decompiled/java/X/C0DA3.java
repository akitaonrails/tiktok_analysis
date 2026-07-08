package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DA3, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DA3 {
    public static final C0DA3 COMPLETING_CHECKOUT;
    public static final C0DA3 CREATING_CHECKOUT;
    public static final /* synthetic */ C0DA3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0DA3 READY_AWAITING_PAYMENT;
    public static final C0DA3 UPDATING_CHECKOUT;

    public static InterfaceC2044707zh<C0DA3> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0DA3 c0da3 = new C0DA3("CREATING_CHECKOUT", 0);
        CREATING_CHECKOUT = c0da3;
        C0DA3 c0da32 = new C0DA3("UPDATING_CHECKOUT", 1);
        UPDATING_CHECKOUT = c0da32;
        C0DA3 c0da33 = new C0DA3("COMPLETING_CHECKOUT", 2);
        COMPLETING_CHECKOUT = c0da33;
        C0DA3 c0da34 = new C0DA3("READY_AWAITING_PAYMENT", 3);
        READY_AWAITING_PAYMENT = c0da34;
        C0DA3[] c0da3Arr = {c0da3, c0da32, c0da33, c0da34};
        LL = c0da3Arr;
        LLILLJJLI = new C2254308sP(c0da3Arr);
    }

    public static C0DA3[] values() {
        return (C0DA3[]) LL.clone();
    }

    public static C0DA3 valueOf(String str) {
        return (C0DA3) C08FF.LIZ(C0DA3.class, str);
    }

    public C0DA3(String str, int i) {
    }
}
