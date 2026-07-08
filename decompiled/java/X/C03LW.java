package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03LW, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03LW {
    public static final C03LW CASHIER;
    public static final C03LW COMBINED_SKU_SUMMARY;
    public static final /* synthetic */ C03LW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C03LW ORDER_SUBMIT;
    public final int LL;

    public static InterfaceC2044707zh<C03LW> getEntries() {
        return LLILLL;
    }

    static {
        C03LW c03lw = new C03LW("ORDER_SUBMIT", 0, 1);
        ORDER_SUBMIT = c03lw;
        C03LW c03lw2 = new C03LW("CASHIER", 1, 2);
        CASHIER = c03lw2;
        C03LW c03lw3 = new C03LW("COMBINED_SKU_SUMMARY", 2, 3);
        COMBINED_SKU_SUMMARY = c03lw3;
        C03LW[] c03lwArr = {c03lw, c03lw2, c03lw3};
        LLILLJJLI = c03lwArr;
        LLILLL = new C2254308sP(c03lwArr);
    }

    public static C03LW[] values() {
        return (C03LW[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C03LW valueOf(String str) {
        return (C03LW) C08FF.LIZ(C03LW.class, str);
    }

    public C03LW(String str, int i, int i2) {
        this.LL = i2;
    }
}
