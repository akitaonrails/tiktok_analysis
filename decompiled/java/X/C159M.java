package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.159M, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C159M {
    public static final C159M BONUS_FINISHED;
    public static final C159M BONUS_IN_PROCESS;
    public static final C159M DISABLED;
    public static final /* synthetic */ C159M[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C159M TASK_FAILED;
    public static final C159M TASK_IN_PROCESS;
    public static final C159M TASK_NOTICE;
    public static final C159M TASK_SUCCEED;

    public static InterfaceC2044707zh<C159M> getEntries() {
        return LLILLJJLI;
    }

    static {
        C159M c159m = new C159M("DISABLED", 0);
        DISABLED = c159m;
        C159M c159m2 = new C159M("TASK_NOTICE", 1);
        TASK_NOTICE = c159m2;
        C159M c159m3 = new C159M("TASK_IN_PROCESS", 2);
        TASK_IN_PROCESS = c159m3;
        C159M c159m4 = new C159M("TASK_SUCCEED", 3);
        TASK_SUCCEED = c159m4;
        C159M c159m5 = new C159M("TASK_FAILED", 4);
        TASK_FAILED = c159m5;
        C159M c159m6 = new C159M("BONUS_IN_PROCESS", 5);
        BONUS_IN_PROCESS = c159m6;
        C159M c159m7 = new C159M("BONUS_FINISHED", 6);
        BONUS_FINISHED = c159m7;
        C159M[] c159mArr = {c159m, c159m2, c159m3, c159m4, c159m5, c159m6, c159m7};
        LL = c159mArr;
        LLILLJJLI = new C2254308sP(c159mArr);
    }

    public static C159M[] values() {
        return (C159M[]) LL.clone();
    }

    public static C159M valueOf(String str) {
        return (C159M) C08FF.LIZ(C159M.class, str);
    }

    public C159M(String str, int i) {
    }
}
