package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00I4, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00I4 {
    public static final /* synthetic */ C00I4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00I4 PRODUCT_GRID;
    public static final C00I4 PRODUCT_LIST;
    public final int LL;

    public static InterfaceC2044707zh<C00I4> getEntries() {
        return LLILLL;
    }

    static {
        C00I4 c00i4 = new C00I4("PRODUCT_GRID", 0, 1);
        PRODUCT_GRID = c00i4;
        C00I4 c00i42 = new C00I4("PRODUCT_LIST", 1, 2);
        PRODUCT_LIST = c00i42;
        C00I4[] c00i4Arr = {c00i4, c00i42};
        LLILLJJLI = c00i4Arr;
        LLILLL = new C2254308sP(c00i4Arr);
    }

    public static C00I4[] values() {
        return (C00I4[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C00I4 valueOf(String str) {
        return (C00I4) C08FF.LIZ(C00I4.class, str);
    }

    public C00I4(String str, int i, int i2) {
        this.LL = i2;
    }
}
