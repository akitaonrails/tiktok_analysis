package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03M9, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03M9 {
    public static final C03M9 ALL;
    public static final C03M9 DELIVERY_UNREACHABLE;
    public static final C03M9 INVALID_ADDRESS;
    public static final C03M9 INVALID_PAYMENT;
    public static final /* synthetic */ C03M9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C03M9 NO_ADDRESS;
    public static final C03M9 NO_PAYMENT;
    public static final C03M9 NO_SKU;
    public static final C03M9 OTHER;
    public static final C03M9 VALID_PAYMENT;

    public static InterfaceC2044707zh<C03M9> getEntries() {
        return LLILLJJLI;
    }

    static {
        C03M9 c03m9 = new C03M9("NO_SKU", 0);
        NO_SKU = c03m9;
        C03M9 c03m92 = new C03M9("NO_ADDRESS", 1);
        NO_ADDRESS = c03m92;
        C03M9 c03m93 = new C03M9("INVALID_ADDRESS", 2);
        INVALID_ADDRESS = c03m93;
        C03M9 c03m94 = new C03M9("DELIVERY_UNREACHABLE", 3);
        DELIVERY_UNREACHABLE = c03m94;
        C03M9 c03m95 = new C03M9("NO_PAYMENT", 4);
        NO_PAYMENT = c03m95;
        C03M9 c03m96 = new C03M9("INVALID_PAYMENT", 5);
        INVALID_PAYMENT = c03m96;
        C03M9 c03m97 = new C03M9("VALID_PAYMENT", 6);
        VALID_PAYMENT = c03m97;
        C03M9 c03m98 = new C03M9("OTHER", 7);
        OTHER = c03m98;
        C03M9 c03m99 = new C03M9("ALL", 8);
        ALL = c03m99;
        C03M9[] c03m9Arr = {c03m9, c03m92, c03m93, c03m94, c03m95, c03m96, c03m97, c03m98, c03m99};
        LL = c03m9Arr;
        LLILLJJLI = new C2254308sP(c03m9Arr);
    }

    public static C03M9[] values() {
        return (C03M9[]) LL.clone();
    }

    public static C03M9 valueOf(String str) {
        return (C03M9) C08FF.LIZ(C03M9.class, str);
    }

    public C03M9(String str, int i) {
    }
}
