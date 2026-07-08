package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PG1, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PG1 {
    public static final C0PG1 INIT;
    public static final /* synthetic */ C0PG1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0PG1 REQUEST_ERROR;
    public static final C0PG1 REQUEST_RETURN_ERROR;
    public static final C0PG1 SMART_MODEL_ERROR;
    public static final C0PG1 SMART_MODEL_POSTPROCESSING_ERROR;
    public static final C0PG1 SMART_MODEL_POSTPROCESSING_LIST_SIZE_ERROR;
    public static final C0PG1 SMART_MODEL_POSTPROCESSING_MAPPING_ERROR;
    public static final C0PG1 SMART_MODEL_RETURN_EMPTY;
    public static final C0PG1 SMART_MODEL_RETURN_ERROR;
    public static final C0PG1 SMART_TOKEN_ERROR;
    public final long LL;

    public static InterfaceC2044707zh<C0PG1> getEntries() {
        return LLILLL;
    }

    static {
        C0PG1 c0pg1 = new C0PG1("INIT", 0, -1L);
        INIT = c0pg1;
        C0PG1 c0pg12 = new C0PG1("REQUEST_RETURN_ERROR", 1, -2L);
        REQUEST_RETURN_ERROR = c0pg12;
        C0PG1 c0pg13 = new C0PG1("REQUEST_ERROR", 2, -3L);
        REQUEST_ERROR = c0pg13;
        C0PG1 c0pg14 = new C0PG1("SMART_TOKEN_ERROR", 3, -4L);
        SMART_TOKEN_ERROR = c0pg14;
        C0PG1 c0pg15 = new C0PG1("SMART_MODEL_ERROR", 4, -5L);
        SMART_MODEL_ERROR = c0pg15;
        C0PG1 c0pg16 = new C0PG1("SMART_MODEL_RETURN_ERROR", 5, -6L);
        SMART_MODEL_RETURN_ERROR = c0pg16;
        C0PG1 c0pg17 = new C0PG1("SMART_MODEL_RETURN_EMPTY", 6, -7L);
        SMART_MODEL_RETURN_EMPTY = c0pg17;
        C0PG1 c0pg18 = new C0PG1("SMART_MODEL_POSTPROCESSING_ERROR", 7, -8L);
        SMART_MODEL_POSTPROCESSING_ERROR = c0pg18;
        C0PG1 c0pg19 = new C0PG1("SMART_MODEL_POSTPROCESSING_MAPPING_ERROR", 8, -9L);
        SMART_MODEL_POSTPROCESSING_MAPPING_ERROR = c0pg19;
        C0PG1 c0pg110 = new C0PG1("SMART_MODEL_POSTPROCESSING_LIST_SIZE_ERROR", 9, -10L);
        SMART_MODEL_POSTPROCESSING_LIST_SIZE_ERROR = c0pg110;
        C0PG1[] c0pg1Arr = {c0pg1, c0pg12, c0pg13, c0pg14, c0pg15, c0pg16, c0pg17, c0pg18, c0pg19, c0pg110};
        LLILLJJLI = c0pg1Arr;
        LLILLL = new C2254308sP(c0pg1Arr);
    }

    public static C0PG1[] values() {
        return (C0PG1[]) LLILLJJLI.clone();
    }

    public final long getMsg() {
        return this.LL;
    }

    public static C0PG1 valueOf(String str) {
        return (C0PG1) C08FF.LIZ(C0PG1.class, str);
    }

    public C0PG1(String str, int i, long j) {
        this.LL = j;
    }
}
