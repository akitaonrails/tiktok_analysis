package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DNU, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DNU {
    public static final C0DNU DELETE_SCHOOL_FAIL;
    public static final C0DNU EDIT_SCHOOL_FAIL;
    public static final C0DNU INVALID_EMAIL_NO_AT;
    public static final C0DNU INVALID_EMAIL_NO_DOT;
    public static final C0DNU INVALID_EMAIL_OTHER;
    public static final /* synthetic */ C0DNU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0DNU NETWORK_ISSUE_CODE;
    public static final C0DNU NETWORK_ISSUE_EMAIL;
    public static final C0DNU SAVE_SCHOOL_FAIL;
    public static final C0DNU WRONG_CODE;
    public static final C0DNU WRONG_EMAIL_NOT_EDU;
    public static final C0DNU WRONG_EMAIL_OTHER;
    public final String LL;

    public static InterfaceC2044707zh<C0DNU> getEntries() {
        return LLILLL;
    }

    static {
        C0DNU c0dnu = new C0DNU("WRONG_CODE", 0, "wrong_verification_code");
        WRONG_CODE = c0dnu;
        C0DNU c0dnu2 = new C0DNU("WRONG_EMAIL_NOT_EDU", 1, "wrong_email_not_edu");
        WRONG_EMAIL_NOT_EDU = c0dnu2;
        C0DNU c0dnu3 = new C0DNU("WRONG_EMAIL_OTHER", 2, "wrong_email_other");
        WRONG_EMAIL_OTHER = c0dnu3;
        C0DNU c0dnu4 = new C0DNU("INVALID_EMAIL_NO_AT", 3, "invalid_email_no_at");
        INVALID_EMAIL_NO_AT = c0dnu4;
        C0DNU c0dnu5 = new C0DNU("INVALID_EMAIL_NO_DOT", 4, "invalid_email_no_dot");
        INVALID_EMAIL_NO_DOT = c0dnu5;
        C0DNU c0dnu6 = new C0DNU("INVALID_EMAIL_OTHER", 5, "invalid_email_other");
        INVALID_EMAIL_OTHER = c0dnu6;
        C0DNU c0dnu7 = new C0DNU("SAVE_SCHOOL_FAIL", 6, "save_school_fail");
        SAVE_SCHOOL_FAIL = c0dnu7;
        C0DNU c0dnu8 = new C0DNU("EDIT_SCHOOL_FAIL", 7, "edit_school_fail");
        EDIT_SCHOOL_FAIL = c0dnu8;
        C0DNU c0dnu9 = new C0DNU("DELETE_SCHOOL_FAIL", 8, "delete_school_fail");
        DELETE_SCHOOL_FAIL = c0dnu9;
        C0DNU c0dnu10 = new C0DNU("NETWORK_ISSUE_EMAIL", 9, "network_issue_email");
        NETWORK_ISSUE_EMAIL = c0dnu10;
        C0DNU c0dnu11 = new C0DNU("NETWORK_ISSUE_CODE", 10, "network_issue_code");
        NETWORK_ISSUE_CODE = c0dnu11;
        C0DNU[] c0dnuArr = {c0dnu, c0dnu2, c0dnu3, c0dnu4, c0dnu5, c0dnu6, c0dnu7, c0dnu8, c0dnu9, c0dnu10, c0dnu11};
        LLILLJJLI = c0dnuArr;
        LLILLL = new C2254308sP(c0dnuArr);
    }

    public static C0DNU[] values() {
        return (C0DNU[]) LLILLJJLI.clone();
    }

    public final String getParamValue() {
        return this.LL;
    }

    public static C0DNU valueOf(String str) {
        return (C0DNU) C08FF.LIZ(C0DNU.class, str);
    }

    public C0DNU(String str, int i, String str2) {
        this.LL = str2;
    }
}
