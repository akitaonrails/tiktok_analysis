package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lEA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1349720lEA {
    public static final EnumC1349720lEA BACK_PRESS;
    public static final EnumC1349720lEA CLICK_CLOSE_ICON;
    public static final EnumC1349720lEA CLICK_OUTSIDE;
    public static final C1349710lE9 Companion;
    public static final /* synthetic */ EnumC1349720lEA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1349720lEA NONE;
    public static final EnumC1349720lEA SWIPE_DOWN;
    public static final EnumC1349720lEA SWIPE_RIGHT;
    public static final EnumC1349720lEA TAB_CHANGE_UNKNOWN;
    public static final EnumC1349720lEA UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1349720lEA> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0lE9] */
    static {
        EnumC1349720lEA enumC1349720lEA = new EnumC1349720lEA("NONE", 0, "");
        NONE = enumC1349720lEA;
        EnumC1349720lEA enumC1349720lEA2 = new EnumC1349720lEA("UNKNOWN", 1, "unknown");
        UNKNOWN = enumC1349720lEA2;
        EnumC1349720lEA enumC1349720lEA3 = new EnumC1349720lEA("TAB_CHANGE_UNKNOWN", 2, "tab_change_unknown");
        TAB_CHANGE_UNKNOWN = enumC1349720lEA3;
        EnumC1349720lEA enumC1349720lEA4 = new EnumC1349720lEA("SWIPE_DOWN", 3, "slide_down");
        SWIPE_DOWN = enumC1349720lEA4;
        EnumC1349720lEA enumC1349720lEA5 = new EnumC1349720lEA("SWIPE_RIGHT", 4, "slide_right");
        SWIPE_RIGHT = enumC1349720lEA5;
        EnumC1349720lEA enumC1349720lEA6 = new EnumC1349720lEA("CLICK_OUTSIDE", 5, "click_empty");
        CLICK_OUTSIDE = enumC1349720lEA6;
        EnumC1349720lEA enumC1349720lEA7 = new EnumC1349720lEA("CLICK_CLOSE_ICON", 6, "click_close");
        CLICK_CLOSE_ICON = enumC1349720lEA7;
        EnumC1349720lEA enumC1349720lEA8 = new EnumC1349720lEA("BACK_PRESS", 7, "back_pressed");
        BACK_PRESS = enumC1349720lEA8;
        EnumC1349720lEA[] enumC1349720lEAArr = {enumC1349720lEA, enumC1349720lEA2, enumC1349720lEA3, enumC1349720lEA4, enumC1349720lEA5, enumC1349720lEA6, enumC1349720lEA7, enumC1349720lEA8};
        LLILLJJLI = enumC1349720lEAArr;
        LLILLL = new C2254308sP(enumC1349720lEAArr);
        Companion = new Object() { // from class: X.0lE9
        };
    }

    public static EnumC1349720lEA[] values() {
        return (EnumC1349720lEA[]) LLILLJJLI.clone();
    }

    public final String getDesc() {
        return this.LL;
    }

    public static EnumC1349720lEA valueOf(String str) {
        return (EnumC1349720lEA) C08FF.LIZ(EnumC1349720lEA.class, str);
    }

    public EnumC1349720lEA(String str, int i, String str2) {
        this.LL = str2;
    }
}
