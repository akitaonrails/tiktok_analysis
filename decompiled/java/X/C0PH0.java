package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PH0, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PH0 {
    public static final C0PH0 ENTER_MIDDLE_PAGE;
    public static final C0PH0 ENTER_OTHER_BUSINESS;
    public static final C0PH0 ENTER_SUG_PAGE;
    public static final /* synthetic */ C0PH0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0PH0 ON_BACKGROUND;
    public static final C0PH0 OTHER;
    public static final C0PH0 SEND_NEW_SEARCH;
    public final String LL;

    public static InterfaceC2044707zh<C0PH0> getEntries() {
        return LLILLL;
    }

    static {
        C0PH0 c0ph0 = new C0PH0("ON_BACKGROUND", 0, "switch_to_background");
        ON_BACKGROUND = c0ph0;
        C0PH0 c0ph02 = new C0PH0("ENTER_MIDDLE_PAGE", 1, "back_to_blankpage");
        ENTER_MIDDLE_PAGE = c0ph02;
        C0PH0 c0ph03 = new C0PH0("SEND_NEW_SEARCH", 2, "change_query");
        SEND_NEW_SEARCH = c0ph03;
        C0PH0 c0ph04 = new C0PH0("ENTER_OTHER_BUSINESS", 3, "change_Non_searchpage");
        ENTER_OTHER_BUSINESS = c0ph04;
        C0PH0 c0ph05 = new C0PH0("ENTER_SUG_PAGE", 4, "open_sugpage");
        ENTER_SUG_PAGE = c0ph05;
        C0PH0 c0ph06 = new C0PH0("OTHER", 5, "other");
        OTHER = c0ph06;
        C0PH0[] c0ph0Arr = {c0ph0, c0ph02, c0ph03, c0ph04, c0ph05, c0ph06};
        LLILLJJLI = c0ph0Arr;
        LLILLL = new C2254308sP(c0ph0Arr);
    }

    public static C0PH0[] values() {
        return (C0PH0[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static C0PH0 valueOf(String str) {
        return (C0PH0) C08FF.LIZ(C0PH0.class, str);
    }

    public C0PH0(String str, int i, String str2) {
        this.LL = str2;
    }
}
