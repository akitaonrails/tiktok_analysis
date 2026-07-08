package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DNV, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DNV {
    public static final C0DNV CORRECT_SCHOOL_PAGE;
    public static final C0DNV EDIT_SCHOOL_PAGE;
    public static final C0DNV ENTER_EMAIL_PAGE;
    public static final C0DNV ENTER_PIN_PAGE;
    public static final C0DNV FIND_SCHOOL_FRIENDS_PAGE;
    public static final /* synthetic */ C0DNV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0DNV> getEntries() {
        return LLILLL;
    }

    static {
        C0DNV c0dnv = new C0DNV("ENTER_PIN_PAGE", 0, "school_verification_code_page");
        ENTER_PIN_PAGE = c0dnv;
        C0DNV c0dnv2 = new C0DNV("ENTER_EMAIL_PAGE", 1, "school_verification_page");
        ENTER_EMAIL_PAGE = c0dnv2;
        C0DNV c0dnv3 = new C0DNV("EDIT_SCHOOL_PAGE", 2, "edit_school_page");
        EDIT_SCHOOL_PAGE = c0dnv3;
        C0DNV c0dnv4 = new C0DNV("FIND_SCHOOL_FRIENDS_PAGE", 3, "find_school_friends_page");
        FIND_SCHOOL_FRIENDS_PAGE = c0dnv4;
        C0DNV c0dnv5 = new C0DNV("CORRECT_SCHOOL_PAGE", 4, "correct_school_page");
        CORRECT_SCHOOL_PAGE = c0dnv5;
        C0DNV[] c0dnvArr = {c0dnv, c0dnv2, c0dnv3, c0dnv4, c0dnv5};
        LLILLJJLI = c0dnvArr;
        LLILLL = new C2254308sP(c0dnvArr);
    }

    public static C0DNV[] values() {
        return (C0DNV[]) LLILLJJLI.clone();
    }

    public final String getParamValue() {
        return this.LL;
    }

    public static C0DNV valueOf(String str) {
        return (C0DNV) C08FF.LIZ(C0DNV.class, str);
    }

    public C0DNV(String str, int i, String str2) {
        this.LL = str2;
    }
}
