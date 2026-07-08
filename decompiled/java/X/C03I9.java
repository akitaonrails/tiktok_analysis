package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03I9, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03I9 {
    public static final C03I9 CHANGE_ADDRESS;
    public static final C03I9 CPF;
    public static final C03I9 FILL_ADDRESS;
    public static final /* synthetic */ C03I9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C03I9 NORMAL;
    public static final C03I9 SELECT_SKU;
    public final int LL;

    public static InterfaceC2044707zh<C03I9> getEntries() {
        return LLILLL;
    }

    static {
        C03I9 c03i9 = new C03I9("NORMAL", 0, 0);
        NORMAL = c03i9;
        C03I9 c03i92 = new C03I9("CHANGE_ADDRESS", 1, 1);
        CHANGE_ADDRESS = c03i92;
        C03I9 c03i93 = new C03I9("FILL_ADDRESS", 2, 2);
        FILL_ADDRESS = c03i93;
        C03I9 c03i94 = new C03I9("SELECT_SKU", 3, 3);
        SELECT_SKU = c03i94;
        C03I9 c03i95 = new C03I9("CPF", 4, 4);
        CPF = c03i95;
        C03I9[] c03i9Arr = {c03i9, c03i92, c03i93, c03i94, c03i95};
        LLILLJJLI = c03i9Arr;
        LLILLL = new C2254308sP(c03i9Arr);
    }

    public static C03I9[] values() {
        return (C03I9[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C03I9 valueOf(String str) {
        return (C03I9) C08FF.LIZ(C03I9.class, str);
    }

    public C03I9(String str, int i, int i2) {
        this.LL = i2;
    }
}
