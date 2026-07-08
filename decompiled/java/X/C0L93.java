package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L93, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L93 {
    public static final C0L93 FAILED;
    public static final /* synthetic */ C0L93[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0L93 PENDING;
    public static final C0L93 RUNNING;
    public static final C0L93 SKIPPED;
    public static final C0L93 SUCCESS;

    public static InterfaceC2044707zh<C0L93> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0L93 c0l93 = new C0L93("PENDING", 0);
        PENDING = c0l93;
        C0L93 c0l932 = new C0L93("RUNNING", 1);
        RUNNING = c0l932;
        C0L93 c0l933 = new C0L93("SUCCESS", 2);
        SUCCESS = c0l933;
        C0L93 c0l934 = new C0L93("FAILED", 3);
        FAILED = c0l934;
        C0L93 c0l935 = new C0L93("SKIPPED", 4);
        SKIPPED = c0l935;
        C0L93[] c0l93Arr = {c0l93, c0l932, c0l933, c0l934, c0l935};
        LL = c0l93Arr;
        LLILLJJLI = new C2254308sP(c0l93Arr);
    }

    public static C0L93[] values() {
        return (C0L93[]) LL.clone();
    }

    public static C0L93 valueOf(String str) {
        return (C0L93) C08FF.LIZ(C0L93.class, str);
    }

    public C0L93(String str, int i) {
    }
}
