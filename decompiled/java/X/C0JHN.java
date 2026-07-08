package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JHN, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JHN {
    public static final /* synthetic */ C0JHN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0JHN NEW_TASK;
    public static final C0JHN RESTART_FAILED_TASK;

    public static InterfaceC2044707zh<C0JHN> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0JHN c0jhn = new C0JHN("NEW_TASK", 0);
        NEW_TASK = c0jhn;
        C0JHN c0jhn2 = new C0JHN("RESTART_FAILED_TASK", 1);
        RESTART_FAILED_TASK = c0jhn2;
        C0JHN[] c0jhnArr = {c0jhn, c0jhn2};
        LL = c0jhnArr;
        LLILLJJLI = new C2254308sP(c0jhnArr);
    }

    public static C0JHN[] values() {
        return (C0JHN[]) LL.clone();
    }

    public static C0JHN valueOf(String str) {
        return (C0JHN) C08FF.LIZ(C0JHN.class, str);
    }

    public C0JHN(String str, int i) {
    }
}
