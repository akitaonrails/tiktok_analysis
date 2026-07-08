package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZQC, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZQC {
    public static final C0ZQC DELETE;
    public static final C0ZQC DIGG;
    public static final C0ZQC FORWARD;
    public static final /* synthetic */ C0ZQC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0ZQC REACTION;
    public static final C0ZQC REPLY;
    public static final C0ZQC REPORT;

    public static InterfaceC2044707zh<C0ZQC> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0ZQC c0zqc = new C0ZQC("DELETE", 0);
        DELETE = c0zqc;
        C0ZQC c0zqc2 = new C0ZQC("DIGG", 1);
        DIGG = c0zqc2;
        C0ZQC c0zqc3 = new C0ZQC("REPORT", 2);
        REPORT = c0zqc3;
        C0ZQC c0zqc4 = new C0ZQC("REPLY", 3);
        REPLY = c0zqc4;
        C0ZQC c0zqc5 = new C0ZQC("FORWARD", 4);
        FORWARD = c0zqc5;
        C0ZQC c0zqc6 = new C0ZQC("REACTION", 5);
        REACTION = c0zqc6;
        C0ZQC[] c0zqcArr = {c0zqc, c0zqc2, c0zqc3, c0zqc4, c0zqc5, c0zqc6};
        LL = c0zqcArr;
        LLILLJJLI = new C2254308sP(c0zqcArr);
    }

    public static C0ZQC[] values() {
        return (C0ZQC[]) LL.clone();
    }

    public static C0ZQC valueOf(String str) {
        return (C0ZQC) C08FF.LIZ(C0ZQC.class, str);
    }

    public C0ZQC(String str, int i) {
    }
}
