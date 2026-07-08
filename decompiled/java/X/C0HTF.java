package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HTF, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HTF {
    public static final /* synthetic */ C0HTF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0HTF NETWORK_EXCEPTION;
    public static final C0HTF TASK_SUBMISSION;
    public static final C0HTF TIMEOUT;

    public static InterfaceC2044707zh<C0HTF> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0HTF c0htf = new C0HTF("NETWORK_EXCEPTION", 0);
        NETWORK_EXCEPTION = c0htf;
        C0HTF c0htf2 = new C0HTF("TIMEOUT", 1);
        TIMEOUT = c0htf2;
        C0HTF c0htf3 = new C0HTF("TASK_SUBMISSION", 2);
        TASK_SUBMISSION = c0htf3;
        C0HTF[] c0htfArr = {c0htf, c0htf2, c0htf3};
        LL = c0htfArr;
        LLILLJJLI = new C2254308sP(c0htfArr);
    }

    public static C0HTF[] values() {
        return (C0HTF[]) LL.clone();
    }

    public static C0HTF valueOf(String str) {
        return (C0HTF) C08FF.LIZ(C0HTF.class, str);
    }

    public C0HTF(String str, int i) {
    }
}
