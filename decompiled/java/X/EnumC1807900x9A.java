package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0x9A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1807900x9A {
    public static final EnumC1807900x9A LLILLJJLI;
    public static final EnumC1807900x9A LLILLL;
    public static final EnumC1807900x9A LLILZ;
    public static final EnumC1807900x9A LLILZIL;
    public static final EnumC1807900x9A LLILZLL;
    public static final EnumC1807900x9A LLIZ;
    public static final EnumC1807900x9A LLIZLLLIL;
    public static final EnumC1807900x9A LLJ;
    public static final EnumC1807900x9A LLJI;
    public static final EnumC1807900x9A LLJIJIL;
    public static final /* synthetic */ EnumC1807900x9A[] LLJILJIL;
    public final String LL;

    static {
        EnumC1807900x9A enumC1807900x9A = new EnumC1807900x9A("STARTED", 0, "started");
        LLILLJJLI = enumC1807900x9A;
        EnumC1807900x9A enumC1807900x9A2 = new EnumC1807900x9A("QUERY_CURRENCY_STARTED", 1, "query_currency_started");
        LLILLL = enumC1807900x9A2;
        EnumC1807900x9A enumC1807900x9A3 = new EnumC1807900x9A("QUERY_CURRENCY_COMPLETED", 2, "query_currency_completed");
        LLILZ = enumC1807900x9A3;
        EnumC1807900x9A enumC1807900x9A4 = new EnumC1807900x9A("FETCH_DIAMOND_PACKAGE_STARTED", 3, "fetch_diamond_package_started");
        LLILZIL = enumC1807900x9A4;
        EnumC1807900x9A enumC1807900x9A5 = new EnumC1807900x9A("FETCH_DIAMOND_PACKAGE_COMPLETED", 4, "fetch_diamond_package_completed");
        LLILZLL = enumC1807900x9A5;
        EnumC1807900x9A enumC1807900x9A6 = new EnumC1807900x9A("QUERY_PRODUCT_DETAILS_STARTED", 5, "query_product_detail_started");
        LLIZ = enumC1807900x9A6;
        EnumC1807900x9A enumC1807900x9A7 = new EnumC1807900x9A("QUERY_PRODUCT_DETAILS_COMPLETED", 6, "query_product_detail_completed");
        LLIZLLLIL = enumC1807900x9A7;
        EnumC1807900x9A enumC1807900x9A8 = new EnumC1807900x9A("MERGE_DATA_STARTED", 7, "merge_data_started");
        LLJ = enumC1807900x9A8;
        EnumC1807900x9A enumC1807900x9A9 = new EnumC1807900x9A("MERGE_DATA_COMPLETED", 8, "merge_data_completed");
        LLJI = enumC1807900x9A9;
        EnumC1807900x9A enumC1807900x9A10 = new EnumC1807900x9A("ENDED", 9, "ended");
        LLJIJIL = enumC1807900x9A10;
        EnumC1807900x9A[] enumC1807900x9AArr = {enumC1807900x9A, enumC1807900x9A2, enumC1807900x9A3, enumC1807900x9A4, enumC1807900x9A5, enumC1807900x9A6, enumC1807900x9A7, enumC1807900x9A8, enumC1807900x9A9, enumC1807900x9A10};
        LLJILJIL = enumC1807900x9AArr;
        new C2254308sP(enumC1807900x9AArr);
    }

    public static EnumC1807900x9A[] values() {
        return (EnumC1807900x9A[]) LLJILJIL.clone();
    }

    public static EnumC1807900x9A valueOf(String str) {
        return (EnumC1807900x9A) C08FF.LIZ(EnumC1807900x9A.class, str);
    }

    public EnumC1807900x9A(String str, int i, String str2) {
        this.LL = str2;
    }
}
