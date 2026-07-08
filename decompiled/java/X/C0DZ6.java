package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DZ6, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DZ6 {
    public static final C0DZ6 CREATION;
    public static final /* synthetic */ C0DZ6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0DZ6 QUEUE;
    public final String LL;

    public static InterfaceC2044707zh<C0DZ6> getEntries() {
        return LLILLL;
    }

    static {
        C0DZ6 c0dz6 = new C0DZ6("QUEUE", 0, "something_went_wrong_toast");
        QUEUE = c0dz6;
        C0DZ6 c0dz62 = new C0DZ6("CREATION", 1, "creation_task_fail");
        CREATION = c0dz62;
        C0DZ6[] c0dz6Arr = {c0dz6, c0dz62};
        LLILLJJLI = c0dz6Arr;
        LLILLL = new C2254308sP(c0dz6Arr);
    }

    public static C0DZ6[] values() {
        return (C0DZ6[]) LLILLJJLI.clone();
    }

    public final String getReportValue() {
        return this.LL;
    }

    public static C0DZ6 valueOf(String str) {
        return (C0DZ6) C08FF.LIZ(C0DZ6.class, str);
    }

    public C0DZ6(String str, int i, String str2) {
        this.LL = str2;
    }
}
