package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fpR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1142190fpR {
    public static final EnumC1142190fpR GIFT_TAB_RESOURCE_SLOT;
    public static final EnumC1142190fpR GIFT_TRAY;
    public static final /* synthetic */ EnumC1142190fpR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1142190fpR MUSIC_GIFT_TAB_FEATURED_LIST;
    public static final EnumC1142190fpR MUSIC_GIFT_TAB_TOP_BANNER;
    public static final EnumC1142190fpR MUSIC_GUIDE;
    public static final EnumC1142190fpR PANEL_ITEM;
    public static final EnumC1142190fpR PIN_BAR;
    public static final EnumC1142190fpR PROFILE;
    public static final EnumC1142190fpR SECONDARY_PAGE;
    public static final EnumC1142190fpR SEND_RESULT;
    public static final EnumC1142190fpR UNKNOWN;

    public static InterfaceC2044707zh<EnumC1142190fpR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1142190fpR enumC1142190fpR = new EnumC1142190fpR("PANEL_ITEM", 0);
        PANEL_ITEM = enumC1142190fpR;
        EnumC1142190fpR enumC1142190fpR2 = new EnumC1142190fpR("MUSIC_GIFT_TAB_TOP_BANNER", 1);
        MUSIC_GIFT_TAB_TOP_BANNER = enumC1142190fpR2;
        EnumC1142190fpR enumC1142190fpR3 = new EnumC1142190fpR("MUSIC_GIFT_TAB_FEATURED_LIST", 2);
        MUSIC_GIFT_TAB_FEATURED_LIST = enumC1142190fpR3;
        EnumC1142190fpR enumC1142190fpR4 = new EnumC1142190fpR("GIFT_TAB_RESOURCE_SLOT", 3);
        GIFT_TAB_RESOURCE_SLOT = enumC1142190fpR4;
        EnumC1142190fpR enumC1142190fpR5 = new EnumC1142190fpR("SECONDARY_PAGE", 4);
        SECONDARY_PAGE = enumC1142190fpR5;
        EnumC1142190fpR enumC1142190fpR6 = new EnumC1142190fpR("PIN_BAR", 5);
        PIN_BAR = enumC1142190fpR6;
        EnumC1142190fpR enumC1142190fpR7 = new EnumC1142190fpR("SEND_RESULT", 6);
        SEND_RESULT = enumC1142190fpR7;
        EnumC1142190fpR enumC1142190fpR8 = new EnumC1142190fpR("PROFILE", 7);
        PROFILE = enumC1142190fpR8;
        EnumC1142190fpR enumC1142190fpR9 = new EnumC1142190fpR("GIFT_TRAY", 8);
        GIFT_TRAY = enumC1142190fpR9;
        EnumC1142190fpR enumC1142190fpR10 = new EnumC1142190fpR("MUSIC_GUIDE", 9);
        MUSIC_GUIDE = enumC1142190fpR10;
        EnumC1142190fpR enumC1142190fpR11 = new EnumC1142190fpR("UNKNOWN", 10);
        UNKNOWN = enumC1142190fpR11;
        EnumC1142190fpR[] enumC1142190fpRArr = {enumC1142190fpR, enumC1142190fpR2, enumC1142190fpR3, enumC1142190fpR4, enumC1142190fpR5, enumC1142190fpR6, enumC1142190fpR7, enumC1142190fpR8, enumC1142190fpR9, enumC1142190fpR10, enumC1142190fpR11};
        LL = enumC1142190fpRArr;
        LLILLJJLI = new C2254308sP(enumC1142190fpRArr);
    }

    public static EnumC1142190fpR[] values() {
        return (EnumC1142190fpR[]) LL.clone();
    }

    public static EnumC1142190fpR valueOf(String str) {
        return (EnumC1142190fpR) C08FF.LIZ(EnumC1142190fpR.class, str);
    }

    public EnumC1142190fpR(String str, int i) {
    }
}
