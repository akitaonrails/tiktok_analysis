package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LQ8, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LQ8 implements C0LQB {
    public static final C0LQ8 CHECK_VALIDITY_FAIL;
    public static final C0LQ8 CHECK_VALIDITY_PASS;
    public static final C0LQ8 DB_SAVE_FAIL;
    public static final C0LQ8 DB_SAVE_PASS;
    public static final /* synthetic */ C0LQ8[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C0LQ8 PRE_PROCESS_FAIL;
    public static final C0LQ8 PRE_PROCESS_PASS;
    public static final C0LQ8 SAVE_EXCEPTION;
    public static final C0LQ8 SAVE_FILE_FAIL;
    public static final C0LQ8 SAVE_FILE_PASS;
    public static final C0LQ8 SAVE_START;
    public final String LL;
    public final C0LQ6 LLILLJJLI;

    public static InterfaceC2044707zh<C0LQ8> getEntries() {
        return LLILZ;
    }

    static {
        C0LQ8 c0lq8 = new C0LQ8("SAVE_START", 0, "save_start");
        SAVE_START = c0lq8;
        C0LQ8 c0lq82 = new C0LQ8("PRE_PROCESS_PASS", 1, "pre_process_pass");
        PRE_PROCESS_PASS = c0lq82;
        C0LQ6 c0lq6 = C0LQ6.GLOBAL;
        C0LQ8 c0lq83 = new C0LQ8("PRE_PROCESS_FAIL", 2, "pre_process_fail", c0lq6);
        PRE_PROCESS_FAIL = c0lq83;
        C0LQ8 c0lq84 = new C0LQ8("CHECK_VALIDITY_PASS", 3, "check_validity_pass");
        CHECK_VALIDITY_PASS = c0lq84;
        C0LQ8 c0lq85 = new C0LQ8("CHECK_VALIDITY_FAIL", 4, "check_validity_fail", c0lq6);
        CHECK_VALIDITY_FAIL = c0lq85;
        C0LQ8 c0lq86 = new C0LQ8("SAVE_FILE_PASS", 5, "save_file_pass");
        SAVE_FILE_PASS = c0lq86;
        C0LQ8 c0lq87 = new C0LQ8("SAVE_FILE_FAIL", 6, "save_file_fail", c0lq6);
        SAVE_FILE_FAIL = c0lq87;
        C0LQ8 c0lq88 = new C0LQ8("DB_SAVE_PASS", 7, "db_save_pass", C0LQ6.COMMON_ONLY);
        DB_SAVE_PASS = c0lq88;
        C0LQ8 c0lq89 = new C0LQ8("DB_SAVE_FAIL", 8, "db_save_fail", c0lq6);
        DB_SAVE_FAIL = c0lq89;
        C0LQ8 c0lq810 = new C0LQ8("SAVE_EXCEPTION", 9, "save_exception", c0lq6);
        SAVE_EXCEPTION = c0lq810;
        C0LQ8[] c0lq8Arr = {c0lq8, c0lq82, c0lq83, c0lq84, c0lq85, c0lq86, c0lq87, c0lq88, c0lq89, c0lq810};
        LLILLL = c0lq8Arr;
        LLILZ = new C2254308sP(c0lq8Arr);
    }

    public static C0LQ8[] values() {
        return (C0LQ8[]) LLILLL.clone();
    }

    @Override // X.C0LQB
    public String getBranchName() {
        return this.LL;
    }

    @Override // X.C0LQB
    public C0LQ6 getScope() {
        return this.LLILLJJLI;
    }

    public static C0LQ8 valueOf(String str) {
        return (C0LQ8) C08FF.LIZ(C0LQ8.class, str);
    }

    public /* synthetic */ C0LQ8(String str, int i, String str2) {
        this(str, i, str2, C0LQ6.NONE);
    }

    public C0LQ8(String str, int i, String str2, C0LQ6 c0lq6) {
        this.LL = str2;
        this.LLILLJJLI = c0lq6;
    }
}
