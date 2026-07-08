package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MU5, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MU5 {
    public static final C0MUD LLILLJJLI;
    public static final C0MU5 LLILLL;
    public static final C0MU5 LLILZ;
    public static final C0MU5 LLILZIL;
    public static final /* synthetic */ C0MU5[] LLILZLL;
    public static final /* synthetic */ C2254308sP LLIZ;
    public final String LL;

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0MUD] */
    static {
        C0MU5 c0mu5 = new C0MU5("EMPTY", 0, "empty");
        LLILLL = c0mu5;
        C0MU5 c0mu52 = new C0MU5("WORKFLOW_NOT_SUBMITTED", 1, "workflow_not_submitted");
        LLILZ = c0mu52;
        C0MU5 c0mu53 = new C0MU5("WORKFLOW_SUBMITTED", 2, "workflow_submitted");
        LLILZIL = c0mu53;
        C0MU5[] c0mu5Arr = {c0mu5, c0mu52, c0mu53, new C0MU5("DRAFT_SAVED", 3, "draft_saved"), new C0MU5("CLOUD_DRAFT_CONSUMED", 4, "cloud_draft_consumed"), new C0MU5("SERVER_FAILED", 5, "server_failed")};
        LLILZLL = c0mu5Arr;
        LLIZ = new C2254308sP(c0mu5Arr);
        LLILLJJLI = new Object() { // from class: X.0MUD
        };
    }

    public static C0MU5[] values() {
        return (C0MU5[]) LLILZLL.clone();
    }

    public static C0MU5 valueOf(String str) {
        return (C0MU5) C08FF.LIZ(C0MU5.class, str);
    }

    public C0MU5(String str, int i, String str2) {
        this.LL = str2;
    }
}
