package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0sA9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1616310sA9 {
    public static final EnumC1616310sA9 AI_AGENT;
    public static final EnumC1616310sA9 BACK_BUTTON;
    public static final EnumC1616310sA9 CLICK_EXIT;
    public static final EnumC1616310sA9 CLICK_LANDSCAPE_ENTRANCE;
    public static final /* synthetic */ EnumC1616310sA9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1616310sA9 LONG_PRESS;
    public static final EnumC1616310sA9 NOTIFY_EXIT;
    public static final EnumC1616310sA9 OTHER_EXIT;
    public static final EnumC1616310sA9 OTHER_SWIPE;
    public static final EnumC1616310sA9 PINCH_ZOOM;
    public static final EnumC1616310sA9 RESUME;
    public static final EnumC1616310sA9 SCREEN_RECORD;
    public static final EnumC1616310sA9 SWITCH_AD;
    public static final EnumC1616310sA9 SWITCH_PAGE;
    public static final EnumC1616310sA9 SWITCH_STORY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1616310sA9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1616310sA9 enumC1616310sA9 = new EnumC1616310sA9("LONG_PRESS", 0, 0);
        LONG_PRESS = enumC1616310sA9;
        EnumC1616310sA9 enumC1616310sA92 = new EnumC1616310sA9("SCREEN_RECORD", 1, 1);
        SCREEN_RECORD = enumC1616310sA92;
        EnumC1616310sA9 enumC1616310sA93 = new EnumC1616310sA9("CLICK_EXIT", 2, 2);
        CLICK_EXIT = enumC1616310sA93;
        EnumC1616310sA9 enumC1616310sA94 = new EnumC1616310sA9("SWITCH_PAGE", 3, 3);
        SWITCH_PAGE = enumC1616310sA94;
        EnumC1616310sA9 enumC1616310sA95 = new EnumC1616310sA9("PINCH_ZOOM", 4, 4);
        PINCH_ZOOM = enumC1616310sA95;
        EnumC1616310sA9 enumC1616310sA96 = new EnumC1616310sA9("RESUME", 5, 5);
        RESUME = enumC1616310sA96;
        EnumC1616310sA9 enumC1616310sA97 = new EnumC1616310sA9("OTHER_EXIT", 6, 6);
        OTHER_EXIT = enumC1616310sA97;
        EnumC1616310sA9 enumC1616310sA98 = new EnumC1616310sA9("OTHER_SWIPE", 7, 7);
        OTHER_SWIPE = enumC1616310sA98;
        EnumC1616310sA9 enumC1616310sA99 = new EnumC1616310sA9("CLICK_LANDSCAPE_ENTRANCE", 8, 8);
        CLICK_LANDSCAPE_ENTRANCE = enumC1616310sA99;
        EnumC1616310sA9 enumC1616310sA910 = new EnumC1616310sA9("NOTIFY_EXIT", 9, 9);
        NOTIFY_EXIT = enumC1616310sA910;
        EnumC1616310sA9 enumC1616310sA911 = new EnumC1616310sA9("SWITCH_STORY", 10, 10);
        SWITCH_STORY = enumC1616310sA911;
        EnumC1616310sA9 enumC1616310sA912 = new EnumC1616310sA9("SWITCH_AD", 11, 11);
        SWITCH_AD = enumC1616310sA912;
        EnumC1616310sA9 enumC1616310sA913 = new EnumC1616310sA9("BACK_BUTTON", 12, 12);
        BACK_BUTTON = enumC1616310sA913;
        EnumC1616310sA9 enumC1616310sA914 = new EnumC1616310sA9("AI_AGENT", 13, 13);
        AI_AGENT = enumC1616310sA914;
        EnumC1616310sA9[] enumC1616310sA9Arr = {enumC1616310sA9, enumC1616310sA92, enumC1616310sA93, enumC1616310sA94, enumC1616310sA95, enumC1616310sA96, enumC1616310sA97, enumC1616310sA98, enumC1616310sA99, enumC1616310sA910, enumC1616310sA911, enumC1616310sA912, enumC1616310sA913, enumC1616310sA914};
        LLILLJJLI = enumC1616310sA9Arr;
        LLILLL = new C2254308sP(enumC1616310sA9Arr);
    }

    public static EnumC1616310sA9[] values() {
        return (EnumC1616310sA9[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1616310sA9 valueOf(String str) {
        return (EnumC1616310sA9) C08FF.LIZ(EnumC1616310sA9.class, str);
    }

    public EnumC1616310sA9(String str, int i, int i2) {
        this.LL = i2;
    }
}
