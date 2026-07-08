package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PzM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC662900PzM {
    public static final EnumC662900PzM AD_TAG;
    public static final EnumC662900PzM FRE_BOUGHT_STORE;
    public static final /* synthetic */ EnumC662900PzM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC662900PzM MALL;
    public static final EnumC662900PzM OFFICIAL_VERIFIED;
    public static final EnumC662900PzM ON_SALE_PRODUCT;
    public static final EnumC662900PzM PURCHASED;
    public static final EnumC662900PzM RATING_COUNT;
    public static final EnumC662900PzM REVIEW_RATING;
    public static final EnumC662900PzM SOLD_OUT;
    public static final EnumC662900PzM UNDEFINED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC662900PzM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC662900PzM enumC662900PzM = new EnumC662900PzM("UNDEFINED", 0, 0);
        UNDEFINED = enumC662900PzM;
        EnumC662900PzM enumC662900PzM2 = new EnumC662900PzM("OFFICIAL_VERIFIED", 1, 1);
        OFFICIAL_VERIFIED = enumC662900PzM2;
        EnumC662900PzM enumC662900PzM3 = new EnumC662900PzM("PURCHASED", 2, 2);
        PURCHASED = enumC662900PzM3;
        EnumC662900PzM enumC662900PzM4 = new EnumC662900PzM("SOLD_OUT", 3, 3);
        SOLD_OUT = enumC662900PzM4;
        EnumC662900PzM enumC662900PzM5 = new EnumC662900PzM("REVIEW_RATING", 4, 4);
        REVIEW_RATING = enumC662900PzM5;
        EnumC662900PzM enumC662900PzM6 = new EnumC662900PzM("ON_SALE_PRODUCT", 5, 5);
        ON_SALE_PRODUCT = enumC662900PzM6;
        EnumC662900PzM enumC662900PzM7 = new EnumC662900PzM("FRE_BOUGHT_STORE", 6, 6);
        FRE_BOUGHT_STORE = enumC662900PzM7;
        EnumC662900PzM enumC662900PzM8 = new EnumC662900PzM("MALL", 7, 10);
        MALL = enumC662900PzM8;
        EnumC662900PzM enumC662900PzM9 = new EnumC662900PzM("RATING_COUNT", 8, 12);
        RATING_COUNT = enumC662900PzM9;
        EnumC662900PzM enumC662900PzM10 = new EnumC662900PzM("AD_TAG", 9, 15);
        AD_TAG = enumC662900PzM10;
        EnumC662900PzM[] enumC662900PzMArr = {enumC662900PzM, enumC662900PzM2, enumC662900PzM3, enumC662900PzM4, enumC662900PzM5, enumC662900PzM6, enumC662900PzM7, enumC662900PzM8, enumC662900PzM9, enumC662900PzM10};
        LLILLJJLI = enumC662900PzMArr;
        LLILLL = new C2254308sP(enumC662900PzMArr);
    }

    public static EnumC662900PzM[] values() {
        return (EnumC662900PzM[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC662900PzM valueOf(String str) {
        return (EnumC662900PzM) C08FF.LIZ(EnumC662900PzM.class, str);
    }

    public EnumC662900PzM(String str, int i, int i2) {
        this.LL = i2;
    }
}
