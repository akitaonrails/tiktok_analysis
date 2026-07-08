package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008R, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C008R {
    public static final C008R CACHE_VALID;
    public static final /* synthetic */ C008R[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C008R LYNX_ENTER_DETAIL_PAGE;
    public static final C008R LYNX_NONE_EXPERIMENT;
    public static final C008R MIDDLE_PAGE_CACHE_EXPIRED;
    public static final C008R MIDDLE_PAGE_CACHE_INVALID;
    public static final C008R NATIVE_ENTER_DETAIL_PAGE;
    public static final C008R NATIVE_NONE_EXPERIMENT;
    public static final C008R RESULT_PAGE_CACHE_EXPIRED;
    public static final C008R RESULT_PAGE_CACHE_INVALID;
    public final int LL;

    public static InterfaceC2044707zh<C008R> getEntries() {
        return LLILLL;
    }

    static {
        C008R c008r = new C008R("CACHE_VALID", 0, 0);
        CACHE_VALID = c008r;
        C008R c008r2 = new C008R("MIDDLE_PAGE_CACHE_INVALID", 1, 1);
        MIDDLE_PAGE_CACHE_INVALID = c008r2;
        C008R c008r3 = new C008R("MIDDLE_PAGE_CACHE_EXPIRED", 2, 2);
        MIDDLE_PAGE_CACHE_EXPIRED = c008r3;
        C008R c008r4 = new C008R("RESULT_PAGE_CACHE_INVALID", 3, 3);
        RESULT_PAGE_CACHE_INVALID = c008r4;
        C008R c008r5 = new C008R("RESULT_PAGE_CACHE_EXPIRED", 4, 4);
        RESULT_PAGE_CACHE_EXPIRED = c008r5;
        C008R c008r6 = new C008R("NATIVE_ENTER_DETAIL_PAGE", 5, 5);
        NATIVE_ENTER_DETAIL_PAGE = c008r6;
        C008R c008r7 = new C008R("LYNX_ENTER_DETAIL_PAGE", 6, 6);
        LYNX_ENTER_DETAIL_PAGE = c008r7;
        C008R c008r8 = new C008R("NATIVE_NONE_EXPERIMENT", 7, 7);
        NATIVE_NONE_EXPERIMENT = c008r8;
        C008R c008r9 = new C008R("LYNX_NONE_EXPERIMENT", 8, 8);
        LYNX_NONE_EXPERIMENT = c008r9;
        C008R[] c008rArr = {c008r, c008r2, c008r3, c008r4, c008r5, c008r6, c008r7, c008r8, c008r9};
        LLILLJJLI = c008rArr;
        LLILLL = new C2254308sP(c008rArr);
    }

    public static C008R[] values() {
        return (C008R[]) LLILLJJLI.clone();
    }

    public final int getScene() {
        return this.LL;
    }

    public static C008R valueOf(String str) {
        return (C008R) C08FF.LIZ(C008R.class, str);
    }

    public C008R(String str, int i, int i2) {
        this.LL = i2;
    }
}
