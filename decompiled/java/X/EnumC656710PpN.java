package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PpN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC656710PpN {
    public static final EnumC656710PpN CAROUSEL_ADS;
    public static final /* synthetic */ EnumC656710PpN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC656710PpN PRODUCT_PHOTO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC656710PpN> getEntries() {
        return LLILLL;
    }

    static {
        EnumC656710PpN enumC656710PpN = new EnumC656710PpN("PRODUCT_PHOTO", 0, "product");
        PRODUCT_PHOTO = enumC656710PpN;
        EnumC656710PpN enumC656710PpN2 = new EnumC656710PpN("CAROUSEL_ADS", 1, "carousel");
        CAROUSEL_ADS = enumC656710PpN2;
        EnumC656710PpN[] enumC656710PpNArr = {enumC656710PpN, enumC656710PpN2};
        LLILLJJLI = enumC656710PpNArr;
        LLILLL = new C2254308sP(enumC656710PpNArr);
    }

    public static EnumC656710PpN[] values() {
        return (EnumC656710PpN[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC656710PpN valueOf(String str) {
        return (EnumC656710PpN) C08FF.LIZ(EnumC656710PpN.class, str);
    }

    public EnumC656710PpN(String str, int i, String str2) {
        this.LL = str2;
    }
}
