package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PRM, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PRM {
    public static final C0PRM BACK_TO_VISUAL_SEARCH;
    public static final /* synthetic */ C0PRM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0PRM ON_APP_BACKGROUND;
    public static final C0PRM ON_APP_FOREGROUND;
    public static final C0PRM ON_SEARCH_DESTROY;
    public static final C0PRM ON_TAB_SWITCHED;
    public static final C0PRM OPEN_TAKO_PAGE;
    public static final C0PRM REFRESH_SEARCH_ID;

    public static InterfaceC2044707zh<C0PRM> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0PRM c0prm = new C0PRM("REFRESH_SEARCH_ID", 0);
        REFRESH_SEARCH_ID = c0prm;
        C0PRM c0prm2 = new C0PRM("ON_SEARCH_DESTROY", 1);
        ON_SEARCH_DESTROY = c0prm2;
        C0PRM c0prm3 = new C0PRM("ON_APP_BACKGROUND", 2);
        ON_APP_BACKGROUND = c0prm3;
        C0PRM c0prm4 = new C0PRM("ON_APP_FOREGROUND", 3);
        ON_APP_FOREGROUND = c0prm4;
        C0PRM c0prm5 = new C0PRM("ON_TAB_SWITCHED", 4);
        ON_TAB_SWITCHED = c0prm5;
        C0PRM c0prm6 = new C0PRM("OPEN_TAKO_PAGE", 5);
        OPEN_TAKO_PAGE = c0prm6;
        C0PRM c0prm7 = new C0PRM("BACK_TO_VISUAL_SEARCH", 6);
        BACK_TO_VISUAL_SEARCH = c0prm7;
        C0PRM[] c0prmArr = {c0prm, c0prm2, c0prm3, c0prm4, c0prm5, c0prm6, c0prm7};
        LL = c0prmArr;
        LLILLJJLI = new C2254308sP(c0prmArr);
    }

    public static C0PRM[] values() {
        return (C0PRM[]) LL.clone();
    }

    public static C0PRM valueOf(String str) {
        return (C0PRM) C08FF.LIZ(C0PRM.class, str);
    }

    public C0PRM(String str, int i) {
    }
}
