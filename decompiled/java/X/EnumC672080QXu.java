package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QXu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC672080QXu {
    public static final EnumC672080QXu BRAND;
    public static final EnumC672080QXu ECOM_LIVE;
    public static final EnumC672080QXu FLASH_SALE;
    public static final /* synthetic */ EnumC672080QXu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC672080QXu NEW_USER;
    public static final EnumC672080QXu ORDER;
    public static final EnumC672080QXu SHOP;
    public static final EnumC672080QXu STORE;
    public static final EnumC672080QXu TTF;
    public final String LL;

    public static InterfaceC2044707zh<EnumC672080QXu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC672080QXu enumC672080QXu = new EnumC672080QXu("SHOP", 0, "shop");
        SHOP = enumC672080QXu;
        EnumC672080QXu enumC672080QXu2 = new EnumC672080QXu("STORE", 1, "tab_store");
        STORE = enumC672080QXu2;
        EnumC672080QXu enumC672080QXu3 = new EnumC672080QXu("ORDER", 2, "order_list_search");
        ORDER = enumC672080QXu3;
        EnumC672080QXu enumC672080QXu4 = new EnumC672080QXu("ECOM_LIVE", 3, "ecom_live");
        ECOM_LIVE = enumC672080QXu4;
        EnumC672080QXu enumC672080QXu5 = new EnumC672080QXu("TTF", 4, "ttf");
        TTF = enumC672080QXu5;
        EnumC672080QXu enumC672080QXu6 = new EnumC672080QXu("BRAND", 5, "brand_diskon");
        BRAND = enumC672080QXu6;
        EnumC672080QXu enumC672080QXu7 = new EnumC672080QXu("FLASH_SALE", 6, "flash_sale");
        FLASH_SALE = enumC672080QXu7;
        EnumC672080QXu enumC672080QXu8 = new EnumC672080QXu("NEW_USER", 7, "tiktok_ecom_new_user");
        NEW_USER = enumC672080QXu8;
        EnumC672080QXu[] enumC672080QXuArr = {enumC672080QXu, enumC672080QXu2, enumC672080QXu3, enumC672080QXu4, enumC672080QXu5, enumC672080QXu6, enumC672080QXu7, enumC672080QXu8};
        LLILLJJLI = enumC672080QXuArr;
        LLILLL = new C2254308sP(enumC672080QXuArr);
    }

    public static EnumC672080QXu[] values() {
        return (EnumC672080QXu[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC672080QXu valueOf(String str) {
        return (EnumC672080QXu) C08FF.LIZ(EnumC672080QXu.class, str);
    }

    public EnumC672080QXu(String str, int i, String str2) {
        this.LL = str2;
    }
}
