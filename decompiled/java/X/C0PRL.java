package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PRL, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PRL {
    public static final C0PRL BACK_TO_VISUAL_SEARCH;
    public static final /* synthetic */ C0PRL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0PRL ON_APP_BACKGROUND;
    public static final C0PRL ON_APP_FOREGROUND;
    public static final C0PRL ON_SEARCH_DESTROY;
    public static final C0PRL ON_TAB_SWITCHED;
    public static final C0PRL ON_VISUAL_SEARCH_DETAIL_ROOT_DESTROY;
    public static final C0PRL ON_VISUAL_SEARCH_DETAIL_ROOT_OPEN;
    public static final C0PRL OPEN_SEARCH_MIDDLE_PAGE;
    public static final C0PRL REFRESH_SEARCH_ID;

    public static InterfaceC2044707zh<C0PRL> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0PRL c0prl = new C0PRL("REFRESH_SEARCH_ID", 0);
        REFRESH_SEARCH_ID = c0prl;
        C0PRL c0prl2 = new C0PRL("ON_SEARCH_DESTROY", 1);
        ON_SEARCH_DESTROY = c0prl2;
        C0PRL c0prl3 = new C0PRL("ON_APP_BACKGROUND", 2);
        ON_APP_BACKGROUND = c0prl3;
        C0PRL c0prl4 = new C0PRL("ON_APP_FOREGROUND", 3);
        ON_APP_FOREGROUND = c0prl4;
        C0PRL c0prl5 = new C0PRL("ON_TAB_SWITCHED", 4);
        ON_TAB_SWITCHED = c0prl5;
        C0PRL c0prl6 = new C0PRL("OPEN_SEARCH_MIDDLE_PAGE", 5);
        OPEN_SEARCH_MIDDLE_PAGE = c0prl6;
        C0PRL c0prl7 = new C0PRL("BACK_TO_VISUAL_SEARCH", 6);
        BACK_TO_VISUAL_SEARCH = c0prl7;
        C0PRL c0prl8 = new C0PRL("ON_VISUAL_SEARCH_DETAIL_ROOT_OPEN", 7);
        ON_VISUAL_SEARCH_DETAIL_ROOT_OPEN = c0prl8;
        C0PRL c0prl9 = new C0PRL("ON_VISUAL_SEARCH_DETAIL_ROOT_DESTROY", 8);
        ON_VISUAL_SEARCH_DETAIL_ROOT_DESTROY = c0prl9;
        C0PRL[] c0prlArr = {c0prl, c0prl2, c0prl3, c0prl4, c0prl5, c0prl6, c0prl7, c0prl8, c0prl9};
        LL = c0prlArr;
        LLILLJJLI = new C2254308sP(c0prlArr);
    }

    public static C0PRL[] values() {
        return (C0PRL[]) LL.clone();
    }

    public static C0PRL valueOf(String str) {
        return (C0PRL) C08FF.LIZ(C0PRL.class, str);
    }

    public C0PRL(String str, int i) {
    }
}
