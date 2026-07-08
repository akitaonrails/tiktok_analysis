package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N0E, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N0E {
    public static final C0N0E BIND_LOAD;
    public static final C0N0E FRONTIER_LOAD;
    public static final C0N0E IDLE;
    public static final /* synthetic */ C0N0E[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0N0E> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0N0E c0n0e = new C0N0E("IDLE", 0);
        IDLE = c0n0e;
        C0N0E c0n0e2 = new C0N0E("BIND_LOAD", 1);
        BIND_LOAD = c0n0e2;
        C0N0E c0n0e3 = new C0N0E("FRONTIER_LOAD", 2);
        FRONTIER_LOAD = c0n0e3;
        C0N0E[] c0n0eArr = {c0n0e, c0n0e2, c0n0e3};
        LL = c0n0eArr;
        LLILLJJLI = new C2254308sP(c0n0eArr);
    }

    public static C0N0E[] values() {
        return (C0N0E[]) LL.clone();
    }

    public static C0N0E valueOf(String str) {
        return (C0N0E) C08FF.LIZ(C0N0E.class, str);
    }

    public C0N0E(String str, int i) {
    }
}
