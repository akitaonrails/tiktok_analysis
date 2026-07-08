package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.13Y3, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13Y3 {
    public static final C13Y3 Idle;
    public static final C13Y3 Inactive;
    public static final C13Y3 InactivePendingWork;
    public static final /* synthetic */ C13Y3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C13Y3 PendingWork;
    public static final C13Y3 ShutDown;
    public static final C13Y3 ShuttingDown;

    public static InterfaceC2044707zh<C13Y3> getEntries() {
        return LLILLJJLI;
    }

    public static C13Y3 valueOf(String str) {
        return (C13Y3) C08FF.LIZ(C13Y3.class, str);
    }

    public static C13Y3[] values() {
        return (C13Y3[]) LL.clone();
    }

    static {
        C13Y3 c13y3 = new C13Y3("ShutDown", 0);
        ShutDown = c13y3;
        C13Y3 c13y32 = new C13Y3("ShuttingDown", 1);
        ShuttingDown = c13y32;
        C13Y3 c13y33 = new C13Y3("Inactive", 2);
        Inactive = c13y33;
        C13Y3 c13y34 = new C13Y3("InactivePendingWork", 3);
        InactivePendingWork = c13y34;
        C13Y3 c13y35 = new C13Y3("Idle", 4);
        Idle = c13y35;
        C13Y3 c13y36 = new C13Y3("PendingWork", 5);
        PendingWork = c13y36;
        C13Y3[] c13y3Arr = {c13y3, c13y32, c13y33, c13y34, c13y35, c13y36};
        LL = c13y3Arr;
        LLILLJJLI = new C2254308sP(c13y3Arr);
    }

    public C13Y3(String str, int i) {
    }
}
