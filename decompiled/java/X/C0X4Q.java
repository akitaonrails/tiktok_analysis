package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0X4Q, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X4Q {
    public static final /* synthetic */ C0X4Q[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0X4Q RELAUNCH_POPUP;
    public static final C0X4Q RELAUNCH_TASK;

    public static InterfaceC2044707zh<C0X4Q> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0X4Q c0x4q = new C0X4Q("RELAUNCH_TASK", 0);
        RELAUNCH_TASK = c0x4q;
        C0X4Q c0x4q2 = new C0X4Q("RELAUNCH_POPUP", 1);
        RELAUNCH_POPUP = c0x4q2;
        C0X4Q[] c0x4qArr = {c0x4q, c0x4q2};
        LL = c0x4qArr;
        LLILLJJLI = new C2254308sP(c0x4qArr);
    }

    public static C0X4Q[] values() {
        return (C0X4Q[]) LL.clone();
    }

    public static C0X4Q valueOf(String str) {
        return (C0X4Q) C08FF.LIZ(C0X4Q.class, str);
    }

    public C0X4Q(String str, int i) {
    }
}
