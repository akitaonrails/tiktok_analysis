package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ie, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC055400Ie {
    public static final EnumC055400Ie AFTER_REFRESH;
    public static final EnumC055400Ie CLICK_SCREEN;
    public static final EnumC055400Ie CLOSE_FEEDBACK;
    public static final EnumC055400Ie CLOSE_HISTORY;
    public static final EnumC055400Ie CLOSE_KEYBOARD;
    public static final EnumC055400Ie DOODLE_START;
    public static final EnumC055400Ie DRAGGING_START;
    public static final /* synthetic */ EnumC055400Ie[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC055400Ie OPEN_FEEDBACK;
    public static final EnumC055400Ie OPEN_HISTORY;
    public static final EnumC055400Ie OPEN_KEYBOARD;
    public static final EnumC055400Ie OPEN_TEXT_SEARCH;

    public static InterfaceC2044707zh<EnumC055400Ie> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC055400Ie enumC055400Ie = new EnumC055400Ie("AFTER_REFRESH", 0);
        AFTER_REFRESH = enumC055400Ie;
        EnumC055400Ie enumC055400Ie2 = new EnumC055400Ie("OPEN_TEXT_SEARCH", 1);
        OPEN_TEXT_SEARCH = enumC055400Ie2;
        EnumC055400Ie enumC055400Ie3 = new EnumC055400Ie("DOODLE_START", 2);
        DOODLE_START = enumC055400Ie3;
        EnumC055400Ie enumC055400Ie4 = new EnumC055400Ie("DRAGGING_START", 3);
        DRAGGING_START = enumC055400Ie4;
        EnumC055400Ie enumC055400Ie5 = new EnumC055400Ie("CLICK_SCREEN", 4);
        CLICK_SCREEN = enumC055400Ie5;
        EnumC055400Ie enumC055400Ie6 = new EnumC055400Ie("OPEN_FEEDBACK", 5);
        OPEN_FEEDBACK = enumC055400Ie6;
        EnumC055400Ie enumC055400Ie7 = new EnumC055400Ie("CLOSE_FEEDBACK", 6);
        CLOSE_FEEDBACK = enumC055400Ie7;
        EnumC055400Ie enumC055400Ie8 = new EnumC055400Ie("OPEN_HISTORY", 7);
        OPEN_HISTORY = enumC055400Ie8;
        EnumC055400Ie enumC055400Ie9 = new EnumC055400Ie("CLOSE_HISTORY", 8);
        CLOSE_HISTORY = enumC055400Ie9;
        EnumC055400Ie enumC055400Ie10 = new EnumC055400Ie("OPEN_KEYBOARD", 9);
        OPEN_KEYBOARD = enumC055400Ie10;
        EnumC055400Ie enumC055400Ie11 = new EnumC055400Ie("CLOSE_KEYBOARD", 10);
        CLOSE_KEYBOARD = enumC055400Ie11;
        EnumC055400Ie[] enumC055400IeArr = {enumC055400Ie, enumC055400Ie2, enumC055400Ie3, enumC055400Ie4, enumC055400Ie5, enumC055400Ie6, enumC055400Ie7, enumC055400Ie8, enumC055400Ie9, enumC055400Ie10, enumC055400Ie11};
        LL = enumC055400IeArr;
        LLILLJJLI = new C2254308sP(enumC055400IeArr);
    }

    public static EnumC055400Ie[] values() {
        return (EnumC055400Ie[]) LL.clone();
    }

    public static EnumC055400Ie valueOf(String str) {
        return (EnumC055400Ie) C08FF.LIZ(EnumC055400Ie.class, str);
    }

    public EnumC055400Ie(String str, int i) {
    }
}
