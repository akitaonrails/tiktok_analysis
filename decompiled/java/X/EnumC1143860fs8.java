package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fs8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1143860fs8 {
    public static final EnumC1143860fs8 CLICK_SPAN;
    public static final EnumC1143860fs8 COUNT_DOWN_SPAN;
    public static final EnumC1143860fs8 DEFAULT_LOCATION;
    public static final EnumC1143860fs8 GIFT;
    public static final EnumC1143860fs8 HEART;
    public static final EnumC1143860fs8 IMAGE;
    public static final /* synthetic */ EnumC1143860fs8[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1143860fs8 NORMAL_STRING;
    public static final EnumC1143860fs8 PATTERN_REF;
    public static final EnumC1143860fs8 STRING;
    public static final EnumC1143860fs8 UNKNOWN;
    public static final EnumC1143860fs8 USER;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1143860fs8> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1143860fs8 enumC1143860fs8 = new EnumC1143860fs8("NORMAL_STRING", 0, -1, "normal_string");
        NORMAL_STRING = enumC1143860fs8;
        EnumC1143860fs8 enumC1143860fs82 = new EnumC1143860fs8("UNKNOWN", 1, 0, "");
        UNKNOWN = enumC1143860fs82;
        EnumC1143860fs8 enumC1143860fs83 = new EnumC1143860fs8("STRING", 2, 1, "string");
        STRING = enumC1143860fs83;
        EnumC1143860fs8 enumC1143860fs84 = new EnumC1143860fs8("IMAGE", 3, 15, "image");
        IMAGE = enumC1143860fs84;
        EnumC1143860fs8 enumC1143860fs85 = new EnumC1143860fs8("CLICK_SPAN", 4, 20, "string");
        CLICK_SPAN = enumC1143860fs85;
        EnumC1143860fs8 enumC1143860fs86 = new EnumC1143860fs8("COUNT_DOWN_SPAN", 5, 21, "string");
        COUNT_DOWN_SPAN = enumC1143860fs86;
        EnumC1143860fs8 enumC1143860fs87 = new EnumC1143860fs8("DEFAULT_LOCATION", 6, 22, "string");
        DEFAULT_LOCATION = enumC1143860fs87;
        EnumC1143860fs8 enumC1143860fs88 = new EnumC1143860fs8("USER", 7, 11, "user");
        USER = enumC1143860fs88;
        EnumC1143860fs8 enumC1143860fs89 = new EnumC1143860fs8("GIFT", 8, 12, "gift");
        GIFT = enumC1143860fs89;
        EnumC1143860fs8 enumC1143860fs810 = new EnumC1143860fs8("HEART", 9, 13, "heart");
        HEART = enumC1143860fs810;
        EnumC1143860fs8 enumC1143860fs811 = new EnumC1143860fs8("PATTERN_REF", 10, 14, "pref");
        PATTERN_REF = enumC1143860fs811;
        EnumC1143860fs8[] enumC1143860fs8Arr = {enumC1143860fs8, enumC1143860fs82, enumC1143860fs83, enumC1143860fs84, enumC1143860fs85, enumC1143860fs86, enumC1143860fs87, enumC1143860fs88, enumC1143860fs89, enumC1143860fs810, enumC1143860fs811};
        LLILLL = enumC1143860fs8Arr;
        LLILZ = new C2254308sP(enumC1143860fs8Arr);
    }

    public static EnumC1143860fs8[] values() {
        return (EnumC1143860fs8[]) LLILLL.clone();
    }

    public final int getPieceType() {
        return this.LL;
    }

    public final String getTag() {
        return this.LLILLJJLI;
    }

    public static EnumC1143860fs8 valueOf(String str) {
        return (EnumC1143860fs8) C08FF.LIZ(EnumC1143860fs8.class, str);
    }

    public EnumC1143860fs8(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
