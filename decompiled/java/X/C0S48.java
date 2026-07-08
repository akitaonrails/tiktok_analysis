package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0S48, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S48 {
    public static final C0S48 ENTRY_BACKGROUND;
    public static final C0S48 ENTRY_BOTTOM_TAB_CHANGE_COMPLETE;
    public static final C0S48 ENTRY_CELL_CHANGE_COMPLETE;
    public static final C0S48 ENTRY_ERROR_BLACK_CHECK;
    public static final C0S48 ENTRY_FEEDBACK;
    public static final C0S48 ENTRY_LOCAL_TEST_FEEDBACK;
    public static final C0S48 ENTRY_LYNX_LOADED;
    public static final C0S48 ENTRY_MAINPAGE_RESUMED;
    public static final C0S48 ENTRY_QUIT;
    public static final C0S48 ENTRY_RECORD;
    public static final C0S48 ENTRY_SCROLL_END_STABLE;
    public static final C0S48 ENTRY_SHOT;
    public static final C0S48 ENTRY_TOP_TAB_CHANGE_COMPLETE;
    public static final C0S48 ENTRY_UNSELECTED;
    public static final /* synthetic */ C0S48[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final String LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<C0S48> getEntries() {
        return LLILZ;
    }

    static {
        C0S48 c0s48 = new C0S48("ENTRY_SHOT", 0, "on_shot", 1);
        ENTRY_SHOT = c0s48;
        C0S48 c0s482 = new C0S48("ENTRY_UNSELECTED", 1, "unselected", 2);
        ENTRY_UNSELECTED = c0s482;
        C0S48 c0s483 = new C0S48("ENTRY_QUIT", 2, "quit", 3);
        ENTRY_QUIT = c0s483;
        C0S48 c0s484 = new C0S48("ENTRY_BACKGROUND", 3, "background", 4);
        ENTRY_BACKGROUND = c0s484;
        C0S48 c0s485 = new C0S48("ENTRY_RECORD", 4, "record", 5);
        ENTRY_RECORD = c0s485;
        C0S48 c0s486 = new C0S48("ENTRY_FEEDBACK", 5, "feedback", 6);
        ENTRY_FEEDBACK = c0s486;
        C0S48 c0s487 = new C0S48("ENTRY_ERROR_BLACK_CHECK", 6, "error_black_check", 7);
        ENTRY_ERROR_BLACK_CHECK = c0s487;
        C0S48 c0s488 = new C0S48("ENTRY_LOCAL_TEST_FEEDBACK", 7, "local_test_feedback", 8);
        ENTRY_LOCAL_TEST_FEEDBACK = c0s488;
        C0S48 c0s489 = new C0S48("ENTRY_SCROLL_END_STABLE", 8, "scroll_end_stable", 9);
        ENTRY_SCROLL_END_STABLE = c0s489;
        C0S48 c0s4810 = new C0S48("ENTRY_TOP_TAB_CHANGE_COMPLETE", 9, "top_tab_change_complete", 10);
        ENTRY_TOP_TAB_CHANGE_COMPLETE = c0s4810;
        C0S48 c0s4811 = new C0S48("ENTRY_BOTTOM_TAB_CHANGE_COMPLETE", 10, "bottom_tab_change_complete", 11);
        ENTRY_BOTTOM_TAB_CHANGE_COMPLETE = c0s4811;
        C0S48 c0s4812 = new C0S48("ENTRY_CELL_CHANGE_COMPLETE", 11, "cell_change_complete", 12);
        ENTRY_CELL_CHANGE_COMPLETE = c0s4812;
        C0S48 c0s4813 = new C0S48("ENTRY_MAINPAGE_RESUMED", 12, "mainpage_resumed", 13);
        ENTRY_MAINPAGE_RESUMED = c0s4813;
        C0S48 c0s4814 = new C0S48("ENTRY_LYNX_LOADED", 13, "lynx_loaded", 14);
        ENTRY_LYNX_LOADED = c0s4814;
        C0S48[] c0s48Arr = {c0s48, c0s482, c0s483, c0s484, c0s485, c0s486, c0s487, c0s488, c0s489, c0s4810, c0s4811, c0s4812, c0s4813, c0s4814};
        LLILLL = c0s48Arr;
        LLILZ = new C2254308sP(c0s48Arr);
    }

    public static C0S48[] values() {
        return (C0S48[]) LLILLL.clone();
    }

    public final int getId() {
        return this.LLILLJJLI;
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0S48 valueOf(String str) {
        return (C0S48) C08FF.LIZ(C0S48.class, str);
    }

    public C0S48(String str, int i, String str2, int i2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
    }
}
