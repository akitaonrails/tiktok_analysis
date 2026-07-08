package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HAU, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HAU {
    public static final C0HAU IMAGE;
    public static final /* synthetic */ C0HAU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0HAU SALE_PROP_EXTENDED_PLACEHOLDER;
    public static final C0HAU SKU_ORIGINAL_PLACEHOLDER;
    public static final C0HAU SPARK_CONTAINER;
    public static final C0HAU VIDEO;
    public final int LL;

    public static InterfaceC2044707zh<C0HAU> getEntries() {
        return LLILLL;
    }

    static {
        C0HAU c0hau = new C0HAU("SPARK_CONTAINER", 0, 1);
        SPARK_CONTAINER = c0hau;
        C0HAU c0hau2 = new C0HAU("VIDEO", 1, 2);
        VIDEO = c0hau2;
        C0HAU c0hau3 = new C0HAU("IMAGE", 2, 3);
        IMAGE = c0hau3;
        C0HAU c0hau4 = new C0HAU("SKU_ORIGINAL_PLACEHOLDER", 3, 4);
        SKU_ORIGINAL_PLACEHOLDER = c0hau4;
        C0HAU c0hau5 = new C0HAU("SALE_PROP_EXTENDED_PLACEHOLDER", 4, 5);
        SALE_PROP_EXTENDED_PLACEHOLDER = c0hau5;
        C0HAU[] c0hauArr = {c0hau, c0hau2, c0hau3, c0hau4, c0hau5};
        LLILLJJLI = c0hauArr;
        LLILLL = new C2254308sP(c0hauArr);
    }

    public static C0HAU[] values() {
        return (C0HAU[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0HAU valueOf(String str) {
        return (C0HAU) C08FF.LIZ(C0HAU.class, str);
    }

    public C0HAU(String str, int i, int i2) {
        this.LL = i2;
    }
}
