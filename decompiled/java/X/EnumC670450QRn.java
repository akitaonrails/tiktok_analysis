package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QRn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC670450QRn {
    public static final EnumC670450QRn CLICK_CLOSE;
    public static final EnumC670450QRn CLICK_INPUT_BOX;
    public static final /* synthetic */ EnumC670450QRn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC670450QRn NONE;
    public static final EnumC670450QRn OTHER;
    public static final EnumC670450QRn SLIDE_DOWN_TO_EXIT;
    public static final EnumC670450QRn SLIDE_DOWN_TO_ONE_FIFTH_SCREEN;
    public static final EnumC670450QRn SLIDE_UPWARDS_FULL_SCREEN;
    public static final EnumC670450QRn SLIDE_UPWARDS_TO_HALF_SCREEN;
    public static final EnumC670450QRn VISUAL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC670450QRn> getEntries() {
        return LLILLL;
    }

    static {
        EnumC670450QRn enumC670450QRn = new EnumC670450QRn("NONE", 0, "none");
        NONE = enumC670450QRn;
        EnumC670450QRn enumC670450QRn2 = new EnumC670450QRn("SLIDE_UPWARDS_FULL_SCREEN", 1, "slide_upwards_full_screen");
        SLIDE_UPWARDS_FULL_SCREEN = enumC670450QRn2;
        EnumC670450QRn enumC670450QRn3 = new EnumC670450QRn("SLIDE_DOWN_TO_ONE_FIFTH_SCREEN", 2, "slide_down_to_one_fifth_screen");
        SLIDE_DOWN_TO_ONE_FIFTH_SCREEN = enumC670450QRn3;
        EnumC670450QRn enumC670450QRn4 = new EnumC670450QRn("SLIDE_DOWN_TO_EXIT", 3, "slide_down_to_exit");
        SLIDE_DOWN_TO_EXIT = enumC670450QRn4;
        EnumC670450QRn enumC670450QRn5 = new EnumC670450QRn("SLIDE_UPWARDS_TO_HALF_SCREEN", 4, "slide_upwards_to_half_screen");
        SLIDE_UPWARDS_TO_HALF_SCREEN = enumC670450QRn5;
        EnumC670450QRn enumC670450QRn6 = new EnumC670450QRn("CLICK_CLOSE", 5, "click_close");
        CLICK_CLOSE = enumC670450QRn6;
        EnumC670450QRn enumC670450QRn7 = new EnumC670450QRn("VISUAL", 6, "visual");
        VISUAL = enumC670450QRn7;
        EnumC670450QRn enumC670450QRn8 = new EnumC670450QRn("CLICK_INPUT_BOX", 7, "click_input_box");
        CLICK_INPUT_BOX = enumC670450QRn8;
        EnumC670450QRn enumC670450QRn9 = new EnumC670450QRn("OTHER", 8, "other");
        OTHER = enumC670450QRn9;
        EnumC670450QRn[] enumC670450QRnArr = {enumC670450QRn, enumC670450QRn2, enumC670450QRn3, enumC670450QRn4, enumC670450QRn5, enumC670450QRn6, enumC670450QRn7, enumC670450QRn8, enumC670450QRn9};
        LLILLJJLI = enumC670450QRnArr;
        LLILLL = new C2254308sP(enumC670450QRnArr);
    }

    public static EnumC670450QRn[] values() {
        return (EnumC670450QRn[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC670450QRn valueOf(String str) {
        return (EnumC670450QRn) C08FF.LIZ(EnumC670450QRn.class, str);
    }

    public EnumC670450QRn(String str, int i, String str2) {
        this.LL = str2;
    }
}
