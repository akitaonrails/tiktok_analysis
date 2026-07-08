package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993540bxg {
    public static final EnumC993540bxg BEAUTY_PANEL;
    public static final EnumC993540bxg COUNTDOWN_PANEL;
    public static final EnumC993540bxg DIALOG_SHOWING;
    public static final EnumC993540bxg FILTER_PANEL;
    public static final EnumC993540bxg KEYBOARD;
    public static final /* synthetic */ EnumC993540bxg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993540bxg RECORDING;
    public static final EnumC993540bxg RECORD_SEGMENT;
    public static final EnumC993540bxg SETTING_PANEL;
    public static final EnumC993540bxg SPECIAL_TAB;
    public static final EnumC993540bxg STICKER_PANEL;
    public static final EnumC993540bxg TOUCHABLE_STICKER;
    public static final EnumC993540bxg UPLOAD_PANEL;

    public static InterfaceC2044707zh<EnumC993540bxg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993540bxg enumC993540bxg = new EnumC993540bxg("STICKER_PANEL", 0);
        STICKER_PANEL = enumC993540bxg;
        EnumC993540bxg enumC993540bxg2 = new EnumC993540bxg("RECORD_SEGMENT", 1);
        RECORD_SEGMENT = enumC993540bxg2;
        EnumC993540bxg enumC993540bxg3 = new EnumC993540bxg(C1649000t0s.LLLJIL, 2);
        RECORDING = enumC993540bxg3;
        EnumC993540bxg enumC993540bxg4 = new EnumC993540bxg("BEAUTY_PANEL", 3);
        BEAUTY_PANEL = enumC993540bxg4;
        EnumC993540bxg enumC993540bxg5 = new EnumC993540bxg("FILTER_PANEL", 4);
        FILTER_PANEL = enumC993540bxg5;
        EnumC993540bxg enumC993540bxg6 = new EnumC993540bxg("KEYBOARD", 5);
        KEYBOARD = enumC993540bxg6;
        EnumC993540bxg enumC993540bxg7 = new EnumC993540bxg("SPECIAL_TAB", 6);
        SPECIAL_TAB = enumC993540bxg7;
        EnumC993540bxg enumC993540bxg8 = new EnumC993540bxg("TOUCHABLE_STICKER", 7);
        TOUCHABLE_STICKER = enumC993540bxg8;
        EnumC993540bxg enumC993540bxg9 = new EnumC993540bxg("DIALOG_SHOWING", 8);
        DIALOG_SHOWING = enumC993540bxg9;
        EnumC993540bxg enumC993540bxg10 = new EnumC993540bxg("COUNTDOWN_PANEL", 9);
        COUNTDOWN_PANEL = enumC993540bxg10;
        EnumC993540bxg enumC993540bxg11 = new EnumC993540bxg("UPLOAD_PANEL", 10);
        UPLOAD_PANEL = enumC993540bxg11;
        EnumC993540bxg enumC993540bxg12 = new EnumC993540bxg("SETTING_PANEL", 11);
        SETTING_PANEL = enumC993540bxg12;
        EnumC993540bxg[] enumC993540bxgArr = {enumC993540bxg, enumC993540bxg2, enumC993540bxg3, enumC993540bxg4, enumC993540bxg5, enumC993540bxg6, enumC993540bxg7, enumC993540bxg8, enumC993540bxg9, enumC993540bxg10, enumC993540bxg11, enumC993540bxg12};
        LL = enumC993540bxgArr;
        LLILLJJLI = new C2254308sP(enumC993540bxgArr);
    }

    public static EnumC993540bxg[] values() {
        return (EnumC993540bxg[]) LL.clone();
    }

    public static EnumC993540bxg valueOf(String str) {
        return (EnumC993540bxg) C08FF.LIZ(EnumC993540bxg.class, str);
    }

    public EnumC993540bxg(String str, int i) {
    }
}
