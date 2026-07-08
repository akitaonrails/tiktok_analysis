package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QRm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC670440QRm {
    public static final EnumC670440QRm HALF_SHOP;
    public static final /* synthetic */ EnumC670440QRm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC670440QRm NINE_PERCENT_SHOP;
    public static final EnumC670440QRm NORMAL;
    public static final EnumC670440QRm PHOTO_SEARCH;
    public static final EnumC670440QRm SIMPLE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC670440QRm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC670440QRm enumC670440QRm = new EnumC670440QRm("SIMPLE", 0, "simple");
        SIMPLE = enumC670440QRm;
        EnumC670440QRm enumC670440QRm2 = new EnumC670440QRm("NORMAL", 1, "normal");
        NORMAL = enumC670440QRm2;
        EnumC670440QRm enumC670440QRm3 = new EnumC670440QRm("HALF_SHOP", 2, "half_shop");
        HALF_SHOP = enumC670440QRm3;
        EnumC670440QRm enumC670440QRm4 = new EnumC670440QRm("NINE_PERCENT_SHOP", 3, "nine_percent_shop");
        NINE_PERCENT_SHOP = enumC670440QRm4;
        EnumC670440QRm enumC670440QRm5 = new EnumC670440QRm("PHOTO_SEARCH", 4, "photo_search");
        PHOTO_SEARCH = enumC670440QRm5;
        EnumC670440QRm[] enumC670440QRmArr = {enumC670440QRm, enumC670440QRm2, enumC670440QRm3, enumC670440QRm4, enumC670440QRm5};
        LLILLJJLI = enumC670440QRmArr;
        LLILLL = new C2254308sP(enumC670440QRmArr);
    }

    public static EnumC670440QRm[] values() {
        return (EnumC670440QRm[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC670440QRm valueOf(String str) {
        return (EnumC670440QRm) C08FF.LIZ(EnumC670440QRm.class, str);
    }

    public EnumC670440QRm(String str, int i, String str2) {
        this.LL = str2;
    }
}
