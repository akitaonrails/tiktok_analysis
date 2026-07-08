package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LQ3, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LQ3 implements C0LQB {
    public static final C0LQ3 CHECK_VALIDITY_FAIL;
    public static final C0LQ3 CHECK_VALIDITY_PASS;
    public static final C0LQ3 CONVERT_MODEL_PASS;
    public static final C0LQ3 DRAFT_ITEM_CLICK;
    public static final /* synthetic */ C0LQ3[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C0LQ3 RESTORE_EXCEPTION;
    public static final C0LQ3 RESTORE_FILE_FAIL;
    public static final C0LQ3 RESTORE_FILE_PASS;
    public static final C0LQ3 RESTORE_START;
    public final String LL;
    public final C0LQ6 LLILLJJLI;

    public static InterfaceC2044707zh<C0LQ3> getEntries() {
        return LLILZ;
    }

    static {
        C0LQ6 c0lq6 = C0LQ6.GLOBAL;
        C0LQ3 c0lq3 = new C0LQ3("DRAFT_ITEM_CLICK", 0, "draft_item_click", c0lq6);
        DRAFT_ITEM_CLICK = c0lq3;
        C0LQ3 c0lq32 = new C0LQ3("RESTORE_START", 1, "restore_start");
        RESTORE_START = c0lq32;
        C0LQ3 c0lq33 = new C0LQ3("CHECK_VALIDITY_PASS", 2, "check_validity_pass");
        CHECK_VALIDITY_PASS = c0lq33;
        C0LQ3 c0lq34 = new C0LQ3("CHECK_VALIDITY_FAIL", 3, "check_validity_fail", c0lq6);
        CHECK_VALIDITY_FAIL = c0lq34;
        C0LQ3 c0lq35 = new C0LQ3("RESTORE_FILE_PASS", 4, "restore_file_pass");
        RESTORE_FILE_PASS = c0lq35;
        C0LQ3 c0lq36 = new C0LQ3("RESTORE_FILE_FAIL", 5, "restore_file_fail", c0lq6);
        RESTORE_FILE_FAIL = c0lq36;
        C0LQ3 c0lq37 = new C0LQ3("CONVERT_MODEL_PASS", 6, "convert_model_pass");
        CONVERT_MODEL_PASS = c0lq37;
        C0LQ3 c0lq38 = new C0LQ3("RESTORE_EXCEPTION", 7, "restore_exception", c0lq6);
        RESTORE_EXCEPTION = c0lq38;
        C0LQ3[] c0lq3Arr = {c0lq3, c0lq32, c0lq33, c0lq34, c0lq35, c0lq36, c0lq37, c0lq38};
        LLILLL = c0lq3Arr;
        LLILZ = new C2254308sP(c0lq3Arr);
    }

    public static C0LQ3[] values() {
        return (C0LQ3[]) LLILLL.clone();
    }

    @Override // X.C0LQB
    public String getBranchName() {
        return this.LL;
    }

    @Override // X.C0LQB
    public C0LQ6 getScope() {
        return this.LLILLJJLI;
    }

    public static C0LQ3 valueOf(String str) {
        return (C0LQ3) C08FF.LIZ(C0LQ3.class, str);
    }

    public /* synthetic */ C0LQ3(String str, int i, String str2) {
        this(str, i, str2, C0LQ6.NONE);
    }

    public C0LQ3(String str, int i, String str2, C0LQ6 c0lq6) {
        this.LL = str2;
        this.LLILLJJLI = c0lq6;
    }
}
