package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HT2, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HT2 {
    public static final C0HT2 IMAGE_FETCH;
    public static final /* synthetic */ C0HT2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0HT2 NETWORK_EXCEPTION;
    public static final C0HT2 QUOTA_CHECK;
    public static final C0HT2 TASK_SUBMISSION;
    public static final C0HT2 TIMEOUT;
    public static final C0HT2 TNS_CHECK;

    public static InterfaceC2044707zh<C0HT2> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0HT2 c0ht2 = new C0HT2("NETWORK_EXCEPTION", 0);
        NETWORK_EXCEPTION = c0ht2;
        C0HT2 c0ht22 = new C0HT2("TIMEOUT", 1);
        TIMEOUT = c0ht22;
        C0HT2 c0ht23 = new C0HT2("IMAGE_FETCH", 2);
        IMAGE_FETCH = c0ht23;
        C0HT2 c0ht24 = new C0HT2("QUOTA_CHECK", 3);
        QUOTA_CHECK = c0ht24;
        C0HT2 c0ht25 = new C0HT2("TNS_CHECK", 4);
        TNS_CHECK = c0ht25;
        C0HT2 c0ht26 = new C0HT2("TASK_SUBMISSION", 5);
        TASK_SUBMISSION = c0ht26;
        C0HT2[] c0ht2Arr = {c0ht2, c0ht22, c0ht23, c0ht24, c0ht25, c0ht26};
        LL = c0ht2Arr;
        LLILLJJLI = new C2254308sP(c0ht2Arr);
    }

    public static C0HT2[] values() {
        return (C0HT2[]) LL.clone();
    }

    public static C0HT2 valueOf(String str) {
        return (C0HT2) C08FF.LIZ(C0HT2.class, str);
    }

    public C0HT2(String str, int i) {
    }
}
