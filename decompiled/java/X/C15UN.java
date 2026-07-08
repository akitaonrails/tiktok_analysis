package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15UN, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15UN {
    public static final C15UN HAS_DATA;
    public static final C15UN IDLE;
    public static final /* synthetic */ C15UN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C15UN LOADING;
    public static final C15UN NOT_TARGET;
    public static final C15UN REQUEST_FAILED;
    public static final C15UN REQUEST_SUCCESS;
    public static final C15UN TRIGGER_TASK;
    public final String LL;

    public static InterfaceC2044707zh<C15UN> getEntries() {
        return LLILLL;
    }

    static {
        C15UN c15un = new C15UN("IDLE", 0, "idle");
        IDLE = c15un;
        C15UN c15un2 = new C15UN("TRIGGER_TASK", 1, "trigger_task");
        TRIGGER_TASK = c15un2;
        C15UN c15un3 = new C15UN("NOT_TARGET", 2, "not_target");
        NOT_TARGET = c15un3;
        C15UN c15un4 = new C15UN("HAS_DATA", 3, "has_data");
        HAS_DATA = c15un4;
        C15UN c15un5 = new C15UN("LOADING", 4, "loading");
        LOADING = c15un5;
        C15UN c15un6 = new C15UN("REQUEST_FAILED", 5, "request_failed");
        REQUEST_FAILED = c15un6;
        C15UN c15un7 = new C15UN("REQUEST_SUCCESS", 6, "request_success");
        REQUEST_SUCCESS = c15un7;
        C15UN[] c15unArr = {c15un, c15un2, c15un3, c15un4, c15un5, c15un6, c15un7};
        LLILLJJLI = c15unArr;
        LLILLL = new C2254308sP(c15unArr);
    }

    public static C15UN[] values() {
        return (C15UN[]) LLILLJJLI.clone();
    }

    public final String getStatus() {
        return this.LL;
    }

    public static C15UN valueOf(String str) {
        return (C15UN) C08FF.LIZ(C15UN.class, str);
    }

    public C15UN(String str, int i, String str2) {
        this.LL = str2;
    }
}
