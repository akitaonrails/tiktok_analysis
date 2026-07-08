package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M5D, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M5D {
    public static final C0M5D DRAFT_NOT_EXIST;
    public static final C0M5D DRAFT_OTHER_DEVICE;
    public static final C0M5D DRAFT_PUBLISHED;
    public static final C0M5D DRAFT_PUBLISHING;
    public static final C0M5D EXCEPTION;
    public static final /* synthetic */ C0M5D[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0M5D LOCAL_TASK_NOT_EXIST;
    public static final C0M5D NONE;
    public final String LL;

    public static InterfaceC2044707zh<C0M5D> getEntries() {
        return LLILLL;
    }

    static {
        C0M5D c0m5d = new C0M5D("NONE", 0, "");
        NONE = c0m5d;
        C0M5D c0m5d2 = new C0M5D("LOCAL_TASK_NOT_EXIST", 1, "local_task_not_exist");
        LOCAL_TASK_NOT_EXIST = c0m5d2;
        C0M5D c0m5d3 = new C0M5D("DRAFT_NOT_EXIST", 2, "draft_not_exist");
        DRAFT_NOT_EXIST = c0m5d3;
        C0M5D c0m5d4 = new C0M5D("EXCEPTION", 3, "exception");
        EXCEPTION = c0m5d4;
        C0M5D c0m5d5 = new C0M5D("DRAFT_PUBLISHING", 4, "draft_publishing");
        DRAFT_PUBLISHING = c0m5d5;
        C0M5D c0m5d6 = new C0M5D("DRAFT_PUBLISHED", 5, "draft_published");
        DRAFT_PUBLISHED = c0m5d6;
        C0M5D c0m5d7 = new C0M5D("DRAFT_OTHER_DEVICE", 6, "draft_other_device");
        DRAFT_OTHER_DEVICE = c0m5d7;
        C0M5D[] c0m5dArr = {c0m5d, c0m5d2, c0m5d3, c0m5d4, c0m5d5, c0m5d6, c0m5d7};
        LLILLJJLI = c0m5dArr;
        LLILLL = new C2254308sP(c0m5dArr);
    }

    public static C0M5D[] values() {
        return (C0M5D[]) LLILLJJLI.clone();
    }

    public final String getReason() {
        return this.LL;
    }

    public static C0M5D valueOf(String str) {
        return (C0M5D) C08FF.LIZ(C0M5D.class, str);
    }

    public C0M5D(String str, int i, String str2) {
        this.LL = str2;
    }
}
