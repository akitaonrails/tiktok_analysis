package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZLS, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZLS {
    public static final C0ZLS COPY;
    public static final C0ZLS INPUT_FOCUSED;
    public static final C0ZLS INPUT_TEXT_CHANGED;
    public static final C0ZLS KEYBOARD_TOGGLED;
    public static final /* synthetic */ C0ZLS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0ZLS LONG_PRESS;
    public static final C0ZLS OTHER;
    public static final C0ZLS PAGE_INVISIBLE;
    public static final C0ZLS SWIPE;
    public static final C0ZLS TAP_OUTSIDE;
    public static final C0ZLS TAP_SCROLL_BOTTOM;

    public static InterfaceC2044707zh<C0ZLS> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0ZLS c0zls = new C0ZLS("TAP_OUTSIDE", 0);
        TAP_OUTSIDE = c0zls;
        C0ZLS c0zls2 = new C0ZLS("COPY", 1);
        COPY = c0zls2;
        C0ZLS c0zls3 = new C0ZLS("LONG_PRESS", 2);
        LONG_PRESS = c0zls3;
        C0ZLS c0zls4 = new C0ZLS("SWIPE", 3);
        SWIPE = c0zls4;
        C0ZLS c0zls5 = new C0ZLS("PAGE_INVISIBLE", 4);
        PAGE_INVISIBLE = c0zls5;
        C0ZLS c0zls6 = new C0ZLS("INPUT_FOCUSED", 5);
        INPUT_FOCUSED = c0zls6;
        C0ZLS c0zls7 = new C0ZLS("KEYBOARD_TOGGLED", 6);
        KEYBOARD_TOGGLED = c0zls7;
        C0ZLS c0zls8 = new C0ZLS("INPUT_TEXT_CHANGED", 7);
        INPUT_TEXT_CHANGED = c0zls8;
        C0ZLS c0zls9 = new C0ZLS("TAP_SCROLL_BOTTOM", 8);
        TAP_SCROLL_BOTTOM = c0zls9;
        C0ZLS c0zls10 = new C0ZLS("OTHER", 9);
        OTHER = c0zls10;
        C0ZLS[] c0zlsArr = {c0zls, c0zls2, c0zls3, c0zls4, c0zls5, c0zls6, c0zls7, c0zls8, c0zls9, c0zls10};
        LL = c0zlsArr;
        LLILLJJLI = new C2254308sP(c0zlsArr);
    }

    public static C0ZLS[] values() {
        return (C0ZLS[]) LL.clone();
    }

    public static C0ZLS valueOf(String str) {
        return (C0ZLS) C08FF.LIZ(C0ZLS.class, str);
    }

    public C0ZLS(String str, int i) {
    }
}
