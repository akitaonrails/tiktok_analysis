package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QRo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC670460QRo {
    public static final EnumC670460QRo CLICK_BLANK_AREA;
    public static final EnumC670460QRo CLICK_CLOSE;
    public static final EnumC670460QRo CLICK_SEARCH_BAR;
    public static final EnumC670460QRo CLICK_SEARCH_MINI_CLOSE;
    public static final /* synthetic */ EnumC670460QRo[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC670460QRo NONE;
    public static final EnumC670460QRo OTHER;
    public static final EnumC670460QRo SLIDE_DOWN_SEVEN_SPLIT_SCREEN;
    public static final EnumC670460QRo SLIDE_UPWARDS_FULL_SCREEN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC670460QRo> getEntries() {
        return LLILLL;
    }

    static {
        EnumC670460QRo enumC670460QRo = new EnumC670460QRo("SLIDE_UPWARDS_FULL_SCREEN", 0, "slide_upwards_full_screen");
        SLIDE_UPWARDS_FULL_SCREEN = enumC670460QRo;
        EnumC670460QRo enumC670460QRo2 = new EnumC670460QRo("SLIDE_DOWN_SEVEN_SPLIT_SCREEN", 1, "slide_down_sevensplit_screen");
        SLIDE_DOWN_SEVEN_SPLIT_SCREEN = enumC670460QRo2;
        EnumC670460QRo enumC670460QRo3 = new EnumC670460QRo("CLICK_BLANK_AREA", 2, "click_blank_area");
        CLICK_BLANK_AREA = enumC670460QRo3;
        EnumC670460QRo enumC670460QRo4 = new EnumC670460QRo("CLICK_CLOSE", 3, "click_close");
        CLICK_CLOSE = enumC670460QRo4;
        EnumC670460QRo enumC670460QRo5 = new EnumC670460QRo("CLICK_SEARCH_BAR", 4, "click_search_bar");
        CLICK_SEARCH_BAR = enumC670460QRo5;
        EnumC670460QRo enumC670460QRo6 = new EnumC670460QRo("CLICK_SEARCH_MINI_CLOSE", 5, "click_search_bar_mini_close");
        CLICK_SEARCH_MINI_CLOSE = enumC670460QRo6;
        EnumC670460QRo enumC670460QRo7 = new EnumC670460QRo("OTHER", 6, "other");
        OTHER = enumC670460QRo7;
        EnumC670460QRo enumC670460QRo8 = new EnumC670460QRo("NONE", 7, "none");
        NONE = enumC670460QRo8;
        EnumC670460QRo[] enumC670460QRoArr = {enumC670460QRo, enumC670460QRo2, enumC670460QRo3, enumC670460QRo4, enumC670460QRo5, enumC670460QRo6, enumC670460QRo7, enumC670460QRo8};
        LLILLJJLI = enumC670460QRoArr;
        LLILLL = new C2254308sP(enumC670460QRoArr);
    }

    public static EnumC670460QRo[] values() {
        return (EnumC670460QRo[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC670460QRo valueOf(String str) {
        return (EnumC670460QRo) C08FF.LIZ(EnumC670460QRo.class, str);
    }

    public EnumC670460QRo(String str, int i, String str2) {
        this.LL = str2;
    }
}
