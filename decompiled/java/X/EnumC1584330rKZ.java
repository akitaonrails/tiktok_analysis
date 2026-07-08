package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rKZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1584330rKZ {
    public static final EnumC1584330rKZ BOTTOM_2TAB;
    public static final EnumC1584330rKZ BOTTOM_3TAB;
    public static final EnumC1584330rKZ BOTTOM_4TAB;
    public static final EnumC1584330rKZ BOTTOM_5TAB;
    public static final EnumC1584330rKZ BOTTOM_6TAB;
    public static final /* synthetic */ EnumC1584330rKZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1584330rKZ TOP_1TAB;
    public static final EnumC1584330rKZ TOP_2TAB;
    public static final EnumC1584330rKZ TOP_3TAB;
    public static final EnumC1584330rKZ TOP_4TAB;
    public static final EnumC1584330rKZ TOP_LEFT_ICON;
    public static final EnumC1584330rKZ TOP_LEFT_TAB;
    public static final EnumC1584330rKZ TOP_MINUS_1TAB;
    public static final EnumC1584330rKZ TOP_RIGHT_ICON;
    public static final EnumC1584330rKZ TOP_RIGHT_TAB;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1584330rKZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1584330rKZ enumC1584330rKZ = new EnumC1584330rKZ("TOP_MINUS_1TAB", 0, "top_neg1tab");
        TOP_MINUS_1TAB = enumC1584330rKZ;
        EnumC1584330rKZ enumC1584330rKZ2 = new EnumC1584330rKZ("TOP_1TAB", 1, "top_1tab");
        TOP_1TAB = enumC1584330rKZ2;
        EnumC1584330rKZ enumC1584330rKZ3 = new EnumC1584330rKZ("TOP_2TAB", 2, "top_2tab");
        TOP_2TAB = enumC1584330rKZ3;
        EnumC1584330rKZ enumC1584330rKZ4 = new EnumC1584330rKZ("TOP_3TAB", 3, "top_3tab");
        TOP_3TAB = enumC1584330rKZ4;
        EnumC1584330rKZ enumC1584330rKZ5 = new EnumC1584330rKZ("TOP_4TAB", 4, "top_4tab");
        TOP_4TAB = enumC1584330rKZ5;
        EnumC1584330rKZ enumC1584330rKZ6 = new EnumC1584330rKZ("TOP_LEFT_TAB", 5, "top_left_tab");
        TOP_LEFT_TAB = enumC1584330rKZ6;
        EnumC1584330rKZ enumC1584330rKZ7 = new EnumC1584330rKZ("TOP_RIGHT_TAB", 6, "top_right_tab");
        TOP_RIGHT_TAB = enumC1584330rKZ7;
        EnumC1584330rKZ enumC1584330rKZ8 = new EnumC1584330rKZ("BOTTOM_2TAB", 7, "bottom_2tab");
        BOTTOM_2TAB = enumC1584330rKZ8;
        EnumC1584330rKZ enumC1584330rKZ9 = new EnumC1584330rKZ("BOTTOM_3TAB", 8, "bottom_3tab");
        BOTTOM_3TAB = enumC1584330rKZ9;
        EnumC1584330rKZ enumC1584330rKZ10 = new EnumC1584330rKZ("BOTTOM_4TAB", 9, "bottom_4tab");
        BOTTOM_4TAB = enumC1584330rKZ10;
        EnumC1584330rKZ enumC1584330rKZ11 = new EnumC1584330rKZ("BOTTOM_5TAB", 10, "bottom_5tab");
        BOTTOM_5TAB = enumC1584330rKZ11;
        EnumC1584330rKZ enumC1584330rKZ12 = new EnumC1584330rKZ("BOTTOM_6TAB", 11, "bottom_6tab");
        BOTTOM_6TAB = enumC1584330rKZ12;
        EnumC1584330rKZ enumC1584330rKZ13 = new EnumC1584330rKZ("TOP_LEFT_ICON", 12, "top_left_icon");
        TOP_LEFT_ICON = enumC1584330rKZ13;
        EnumC1584330rKZ enumC1584330rKZ14 = new EnumC1584330rKZ("TOP_RIGHT_ICON", 13, "top_right_icon");
        TOP_RIGHT_ICON = enumC1584330rKZ14;
        EnumC1584330rKZ[] enumC1584330rKZArr = {enumC1584330rKZ, enumC1584330rKZ2, enumC1584330rKZ3, enumC1584330rKZ4, enumC1584330rKZ5, enumC1584330rKZ6, enumC1584330rKZ7, enumC1584330rKZ8, enumC1584330rKZ9, enumC1584330rKZ10, enumC1584330rKZ11, enumC1584330rKZ12, enumC1584330rKZ13, enumC1584330rKZ14};
        LLILLJJLI = enumC1584330rKZArr;
        LLILLL = new C2254308sP(enumC1584330rKZArr);
    }

    public static EnumC1584330rKZ[] values() {
        return (EnumC1584330rKZ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1584330rKZ valueOf(String str) {
        return (EnumC1584330rKZ) C08FF.LIZ(EnumC1584330rKZ.class, str);
    }

    public EnumC1584330rKZ(String str, int i, String str2) {
        this.LL = str2;
    }
}
