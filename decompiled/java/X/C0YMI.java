package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YMI, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YMI {
    public static final C0YMI COMPLETED;
    public static final C0YMI FAILED;
    public static final /* synthetic */ C0YMI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0YMI STARTED;

    public static InterfaceC2044707zh<C0YMI> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0YMI c0ymi = new C0YMI("STARTED", 0);
        STARTED = c0ymi;
        C0YMI c0ymi2 = new C0YMI("COMPLETED", 1);
        COMPLETED = c0ymi2;
        C0YMI c0ymi3 = new C0YMI("FAILED", 2);
        FAILED = c0ymi3;
        C0YMI[] c0ymiArr = {c0ymi, c0ymi2, c0ymi3};
        LL = c0ymiArr;
        LLILLJJLI = new C2254308sP(c0ymiArr);
    }

    public static C0YMI[] values() {
        return (C0YMI[]) LL.clone();
    }

    public static C0YMI valueOf(String str) {
        return (C0YMI) C08FF.LIZ(C0YMI.class, str);
    }

    public C0YMI(String str, int i) {
    }
}
