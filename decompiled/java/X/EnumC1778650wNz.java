package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wNz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778650wNz {
    public static final EnumC1778650wNz FLASH_SALE;
    public static final EnumC1778650wNz LIVE_WINDOW;
    public static final /* synthetic */ EnumC1778650wNz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1778650wNz LUCKY_BUG;
    public static final EnumC1778650wNz PIN_CARD;
    public static final EnumC1778650wNz SHOP_BAG_ICON;
    public static final EnumC1778650wNz SHOP_BAG_LIST;
    public static final EnumC1778650wNz SHORT_TOUCH;
    public static final EnumC1778650wNz VIDEO_ANCHOR;

    public static InterfaceC2044707zh<EnumC1778650wNz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778650wNz enumC1778650wNz = new EnumC1778650wNz("SHOP_BAG_LIST", 0);
        SHOP_BAG_LIST = enumC1778650wNz;
        EnumC1778650wNz enumC1778650wNz2 = new EnumC1778650wNz("SHOP_BAG_ICON", 1);
        SHOP_BAG_ICON = enumC1778650wNz2;
        EnumC1778650wNz enumC1778650wNz3 = new EnumC1778650wNz("PIN_CARD", 2);
        PIN_CARD = enumC1778650wNz3;
        EnumC1778650wNz enumC1778650wNz4 = new EnumC1778650wNz("SHORT_TOUCH", 3);
        SHORT_TOUCH = enumC1778650wNz4;
        EnumC1778650wNz enumC1778650wNz5 = new EnumC1778650wNz("LUCKY_BUG", 4);
        LUCKY_BUG = enumC1778650wNz5;
        EnumC1778650wNz enumC1778650wNz6 = new EnumC1778650wNz("FLASH_SALE", 5);
        FLASH_SALE = enumC1778650wNz6;
        EnumC1778650wNz enumC1778650wNz7 = new EnumC1778650wNz("LIVE_WINDOW", 6);
        LIVE_WINDOW = enumC1778650wNz7;
        EnumC1778650wNz enumC1778650wNz8 = new EnumC1778650wNz("VIDEO_ANCHOR", 7);
        VIDEO_ANCHOR = enumC1778650wNz8;
        EnumC1778650wNz[] enumC1778650wNzArr = {enumC1778650wNz, enumC1778650wNz2, enumC1778650wNz3, enumC1778650wNz4, enumC1778650wNz5, enumC1778650wNz6, enumC1778650wNz7, enumC1778650wNz8};
        LL = enumC1778650wNzArr;
        LLILLJJLI = new C2254308sP(enumC1778650wNzArr);
    }

    public static EnumC1778650wNz[] values() {
        return (EnumC1778650wNz[]) LL.clone();
    }

    public static EnumC1778650wNz valueOf(String str) {
        return (EnumC1778650wNz) C08FF.LIZ(EnumC1778650wNz.class, str);
    }

    public EnumC1778650wNz(String str, int i) {
    }
}
