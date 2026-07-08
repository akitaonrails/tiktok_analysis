package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vqK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1757780vqK {
    public static final EnumC1757780vqK BOTTOM_CENTER;
    public static final EnumC1757780vqK BOTTOM_LEFT;
    public static final EnumC1757780vqK BOTTOM_RIGHT;
    public static final C1721400ute Companion;
    public static final EnumC1757780vqK LEFT_BOTTOM;
    public static final EnumC1757780vqK LEFT_CENTER;
    public static final EnumC1757780vqK LEFT_TOP;
    public static final /* synthetic */ EnumC1757780vqK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1757780vqK RIGHT_BOTTOM;
    public static final EnumC1757780vqK RIGHT_CENTER;
    public static final EnumC1757780vqK RIGHT_TOP;
    public static final EnumC1757780vqK TOP_CENTER;
    public static final EnumC1757780vqK TOP_LEFT;
    public static final EnumC1757780vqK TOP_RIGHT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1757780vqK> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.0ute] */
    static {
        EnumC1757780vqK enumC1757780vqK = new EnumC1757780vqK("LEFT_TOP", 0, "left_top");
        LEFT_TOP = enumC1757780vqK;
        EnumC1757780vqK enumC1757780vqK2 = new EnumC1757780vqK("LEFT_CENTER", 1, "left_center");
        LEFT_CENTER = enumC1757780vqK2;
        EnumC1757780vqK enumC1757780vqK3 = new EnumC1757780vqK("LEFT_BOTTOM", 2, "left_bottom");
        LEFT_BOTTOM = enumC1757780vqK3;
        EnumC1757780vqK enumC1757780vqK4 = new EnumC1757780vqK("TOP_LEFT", 3, "top_left");
        TOP_LEFT = enumC1757780vqK4;
        EnumC1757780vqK enumC1757780vqK5 = new EnumC1757780vqK("TOP_CENTER", 4, "top_center");
        TOP_CENTER = enumC1757780vqK5;
        EnumC1757780vqK enumC1757780vqK6 = new EnumC1757780vqK("TOP_RIGHT", 5, "top_right");
        TOP_RIGHT = enumC1757780vqK6;
        EnumC1757780vqK enumC1757780vqK7 = new EnumC1757780vqK("RIGHT_TOP", 6, "right_top");
        RIGHT_TOP = enumC1757780vqK7;
        EnumC1757780vqK enumC1757780vqK8 = new EnumC1757780vqK("RIGHT_CENTER", 7, "right_center");
        RIGHT_CENTER = enumC1757780vqK8;
        EnumC1757780vqK enumC1757780vqK9 = new EnumC1757780vqK("RIGHT_BOTTOM", 8, "right_bottom");
        RIGHT_BOTTOM = enumC1757780vqK9;
        EnumC1757780vqK enumC1757780vqK10 = new EnumC1757780vqK("BOTTOM_LEFT", 9, "bottom_left");
        BOTTOM_LEFT = enumC1757780vqK10;
        EnumC1757780vqK enumC1757780vqK11 = new EnumC1757780vqK("BOTTOM_CENTER", 10, "bottom_center");
        BOTTOM_CENTER = enumC1757780vqK11;
        EnumC1757780vqK enumC1757780vqK12 = new EnumC1757780vqK("BOTTOM_RIGHT", 11, "bottom_right");
        BOTTOM_RIGHT = enumC1757780vqK12;
        EnumC1757780vqK[] enumC1757780vqKArr = {enumC1757780vqK, enumC1757780vqK2, enumC1757780vqK3, enumC1757780vqK4, enumC1757780vqK5, enumC1757780vqK6, enumC1757780vqK7, enumC1757780vqK8, enumC1757780vqK9, enumC1757780vqK10, enumC1757780vqK11, enumC1757780vqK12};
        LLILLJJLI = enumC1757780vqKArr;
        LLILLL = new C2254308sP(enumC1757780vqKArr);
        Companion = new Object() { // from class: X.0ute
        };
    }

    public static EnumC1757780vqK[] values() {
        return (EnumC1757780vqK[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1757780vqK valueOf(String str) {
        return (EnumC1757780vqK) C08FF.LIZ(EnumC1757780vqK.class, str);
    }

    public EnumC1757780vqK(String str, int i, String str2) {
        this.LL = str2;
    }
}
