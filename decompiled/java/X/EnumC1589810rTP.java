package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rTP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1589810rTP {
    public static final /* synthetic */ EnumC1589810rTP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1589810rTP ON_ATTACH;
    public static final EnumC1589810rTP PAGE_DETERMINE_SELECTED;
    public static final EnumC1589810rTP PAGE_SCROLL_OVER_THRESHOLD;
    public static final EnumC1589810rTP PAGE_SCROLL_START;
    public static final EnumC1589810rTP TOUCH_DOWN;
    public static final EnumC1589810rTP TOUCH_UP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1589810rTP> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1589810rTP enumC1589810rTP = new EnumC1589810rTP("ON_ATTACH", 0, "on_attach");
        ON_ATTACH = enumC1589810rTP;
        EnumC1589810rTP enumC1589810rTP2 = new EnumC1589810rTP("TOUCH_DOWN", 1, "touch_down");
        TOUCH_DOWN = enumC1589810rTP2;
        EnumC1589810rTP enumC1589810rTP3 = new EnumC1589810rTP("TOUCH_UP", 2, "touch_up");
        TOUCH_UP = enumC1589810rTP3;
        EnumC1589810rTP enumC1589810rTP4 = new EnumC1589810rTP("PAGE_SCROLL_START", 3, "page_scroll_start");
        PAGE_SCROLL_START = enumC1589810rTP4;
        EnumC1589810rTP enumC1589810rTP5 = new EnumC1589810rTP("PAGE_SCROLL_OVER_THRESHOLD", 4, "page_scroll_over_threshold");
        PAGE_SCROLL_OVER_THRESHOLD = enumC1589810rTP5;
        EnumC1589810rTP enumC1589810rTP6 = new EnumC1589810rTP("PAGE_DETERMINE_SELECTED", 5, "page_determine_selected");
        PAGE_DETERMINE_SELECTED = enumC1589810rTP6;
        EnumC1589810rTP[] enumC1589810rTPArr = {enumC1589810rTP, enumC1589810rTP2, enumC1589810rTP3, enumC1589810rTP4, enumC1589810rTP5, enumC1589810rTP6};
        LLILLJJLI = enumC1589810rTPArr;
        LLILLL = new C2254308sP(enumC1589810rTPArr);
    }

    public static EnumC1589810rTP[] values() {
        return (EnumC1589810rTP[]) LLILLJJLI.clone();
    }

    public final String getSceneStr() {
        return this.LL;
    }

    public static EnumC1589810rTP valueOf(String str) {
        return (EnumC1589810rTP) C08FF.LIZ(EnumC1589810rTP.class, str);
    }

    public EnumC1589810rTP(String str, int i, String str2) {
        this.LL = str2;
    }
}
