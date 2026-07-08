package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NCc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC590000NCc {
    public static final /* synthetic */ EnumC590000NCc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC590000NCc ProductStatusDown;
    public static final EnumC590000NCc ProductStatusOnSales;
    public static final EnumC590000NCc ProductStatusReUnderReview;
    public static final EnumC590000NCc ProductStatusReviewFailed;
    public static final EnumC590000NCc ProductStatusStock;
    public static final EnumC590000NCc ProductStatusUnderReview;
    public final int LL;

    public static InterfaceC2044707zh<EnumC590000NCc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC590000NCc enumC590000NCc = new EnumC590000NCc("ProductStatusOnSales", 0, 90);
        ProductStatusOnSales = enumC590000NCc;
        EnumC590000NCc enumC590000NCc2 = new EnumC590000NCc("ProductStatusStock", 1, 80);
        ProductStatusStock = enumC590000NCc2;
        EnumC590000NCc enumC590000NCc3 = new EnumC590000NCc("ProductStatusDown", 2, 70);
        ProductStatusDown = enumC590000NCc3;
        EnumC590000NCc enumC590000NCc4 = new EnumC590000NCc("ProductStatusReviewFailed", 3, 40);
        ProductStatusReviewFailed = enumC590000NCc4;
        EnumC590000NCc enumC590000NCc5 = new EnumC590000NCc("ProductStatusUnderReview", 4, 30);
        ProductStatusUnderReview = enumC590000NCc5;
        EnumC590000NCc enumC590000NCc6 = new EnumC590000NCc("ProductStatusReUnderReview", 5, 75);
        ProductStatusReUnderReview = enumC590000NCc6;
        EnumC590000NCc[] enumC590000NCcArr = {enumC590000NCc, enumC590000NCc2, enumC590000NCc3, enumC590000NCc4, enumC590000NCc5, enumC590000NCc6};
        LLILLJJLI = enumC590000NCcArr;
        LLILLL = new C2254308sP(enumC590000NCcArr);
    }

    public static EnumC590000NCc[] values() {
        return (EnumC590000NCc[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC590000NCc valueOf(String str) {
        return (EnumC590000NCc) C08FF.LIZ(EnumC590000NCc.class, str);
    }

    public EnumC590000NCc(String str, int i, int i2) {
        this.LL = i2;
    }
}
