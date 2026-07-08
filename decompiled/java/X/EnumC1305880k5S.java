package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0k5S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1305880k5S {
    public static final EnumC1305880k5S BOLD_TEXT;
    public static final EnumC1305880k5S COLOR_INVERSION;
    public static final EnumC1305880k5S DARK_MODE;
    public static final EnumC1305880k5S DISABLE_WINDOW_BLURS;
    public static final EnumC1305880k5S DYNAMIC_FONT;
    public static final EnumC1305880k5S HIGH_CONTRAST;
    public static final EnumC1305880k5S LARGER_TEXT;
    public static final /* synthetic */ EnumC1305880k5S[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1305880k5S REMOVE_ANIMATION;
    public static final EnumC1305880k5S SHOW_CAPTIONS;
    public static final EnumC1305880k5S TALKBACK;
    public static final EnumC1305880k5S TOUCH_EXPLORATION;
    public static final EnumC1305880k5S VOICE_CONTROL;

    public static InterfaceC2044707zh<EnumC1305880k5S> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1305880k5S enumC1305880k5S = new EnumC1305880k5S("TALKBACK", 0);
        TALKBACK = enumC1305880k5S;
        EnumC1305880k5S enumC1305880k5S2 = new EnumC1305880k5S("DARK_MODE", 1);
        DARK_MODE = enumC1305880k5S2;
        EnumC1305880k5S enumC1305880k5S3 = new EnumC1305880k5S("REMOVE_ANIMATION", 2);
        REMOVE_ANIMATION = enumC1305880k5S3;
        EnumC1305880k5S enumC1305880k5S4 = new EnumC1305880k5S("LARGER_TEXT", 3);
        LARGER_TEXT = enumC1305880k5S4;
        EnumC1305880k5S enumC1305880k5S5 = new EnumC1305880k5S("HIGH_CONTRAST", 4);
        HIGH_CONTRAST = enumC1305880k5S5;
        EnumC1305880k5S enumC1305880k5S6 = new EnumC1305880k5S("BOLD_TEXT", 5);
        BOLD_TEXT = enumC1305880k5S6;
        EnumC1305880k5S enumC1305880k5S7 = new EnumC1305880k5S("COLOR_INVERSION", 6);
        COLOR_INVERSION = enumC1305880k5S7;
        EnumC1305880k5S enumC1305880k5S8 = new EnumC1305880k5S("SHOW_CAPTIONS", 7);
        SHOW_CAPTIONS = enumC1305880k5S8;
        EnumC1305880k5S enumC1305880k5S9 = new EnumC1305880k5S("DYNAMIC_FONT", 8);
        DYNAMIC_FONT = enumC1305880k5S9;
        EnumC1305880k5S enumC1305880k5S10 = new EnumC1305880k5S("VOICE_CONTROL", 9);
        VOICE_CONTROL = enumC1305880k5S10;
        EnumC1305880k5S enumC1305880k5S11 = new EnumC1305880k5S("TOUCH_EXPLORATION", 10);
        TOUCH_EXPLORATION = enumC1305880k5S11;
        EnumC1305880k5S enumC1305880k5S12 = new EnumC1305880k5S("DISABLE_WINDOW_BLURS", 11);
        DISABLE_WINDOW_BLURS = enumC1305880k5S12;
        EnumC1305880k5S[] enumC1305880k5SArr = {enumC1305880k5S, enumC1305880k5S2, enumC1305880k5S3, enumC1305880k5S4, enumC1305880k5S5, enumC1305880k5S6, enumC1305880k5S7, enumC1305880k5S8, enumC1305880k5S9, enumC1305880k5S10, enumC1305880k5S11, enumC1305880k5S12};
        LL = enumC1305880k5SArr;
        LLILLJJLI = new C2254308sP(enumC1305880k5SArr);
    }

    public static EnumC1305880k5S[] values() {
        return (EnumC1305880k5S[]) LL.clone();
    }

    public static EnumC1305880k5S valueOf(String str) {
        return (EnumC1305880k5S) C08FF.LIZ(EnumC1305880k5S.class, str);
    }

    public EnumC1305880k5S(String str, int i) {
    }
}
