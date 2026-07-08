package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10pe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19366010pe {
    public static final /* synthetic */ EnumC19366010pe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19366010pe PRODUCT_STATUS_DOWN;
    public static final EnumC19366010pe PRODUCT_STATUS_ON_SALES;
    public static final EnumC19366010pe PRODUCT_STATUS_REVIEW_FAILED;
    public static final EnumC19366010pe PRODUCT_STATUS_RE_UNDER_REVIEW;
    public static final EnumC19366010pe PRODUCT_STATUS_STOCK;
    public static final EnumC19366010pe PRODUCT_STATUS_UNDER_REVIEW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19366010pe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19366010pe enumC19366010pe = new EnumC19366010pe("PRODUCT_STATUS_ON_SALES", 0, 90);
        PRODUCT_STATUS_ON_SALES = enumC19366010pe;
        EnumC19366010pe enumC19366010pe2 = new EnumC19366010pe("PRODUCT_STATUS_STOCK", 1, 80);
        PRODUCT_STATUS_STOCK = enumC19366010pe2;
        EnumC19366010pe enumC19366010pe3 = new EnumC19366010pe("PRODUCT_STATUS_DOWN", 2, 70);
        PRODUCT_STATUS_DOWN = enumC19366010pe3;
        EnumC19366010pe enumC19366010pe4 = new EnumC19366010pe("PRODUCT_STATUS_REVIEW_FAILED", 3, 40);
        PRODUCT_STATUS_REVIEW_FAILED = enumC19366010pe4;
        EnumC19366010pe enumC19366010pe5 = new EnumC19366010pe("PRODUCT_STATUS_UNDER_REVIEW", 4, 30);
        PRODUCT_STATUS_UNDER_REVIEW = enumC19366010pe5;
        EnumC19366010pe enumC19366010pe6 = new EnumC19366010pe("PRODUCT_STATUS_RE_UNDER_REVIEW", 5, 75);
        PRODUCT_STATUS_RE_UNDER_REVIEW = enumC19366010pe6;
        EnumC19366010pe[] enumC19366010peArr = {enumC19366010pe, enumC19366010pe2, enumC19366010pe3, enumC19366010pe4, enumC19366010pe5, enumC19366010pe6};
        LLILLJJLI = enumC19366010peArr;
        LLILLL = new C2254308sP(enumC19366010peArr);
    }

    public static EnumC19366010pe[] values() {
        return (EnumC19366010pe[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC19366010pe valueOf(String str) {
        return (EnumC19366010pe) C08FF.LIZ(EnumC19366010pe.class, str);
    }

    public EnumC19366010pe(String str, int i, int i2) {
        this.LL = i2;
    }
}
