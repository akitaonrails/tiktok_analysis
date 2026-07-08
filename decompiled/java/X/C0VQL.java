package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VQL, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VQL {
    public static final C0VQL AVAILABLE;
    public static final C0VQL ERR_IPC_CALL_FAILS;
    public static final C0VQL ERR_NOT_AVAILABLE;
    public static final /* synthetic */ C0VQL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0VQL> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0VQL c0vql = new C0VQL("AVAILABLE", 0);
        AVAILABLE = c0vql;
        C0VQL c0vql2 = new C0VQL("ERR_NOT_AVAILABLE", 1);
        ERR_NOT_AVAILABLE = c0vql2;
        C0VQL c0vql3 = new C0VQL("ERR_IPC_CALL_FAILS", 2);
        ERR_IPC_CALL_FAILS = c0vql3;
        C0VQL[] c0vqlArr = {c0vql, c0vql2, c0vql3};
        LL = c0vqlArr;
        LLILLJJLI = new C2254308sP(c0vqlArr);
    }

    public static C0VQL[] values() {
        return (C0VQL[]) LL.clone();
    }

    public static C0VQL valueOf(String str) {
        return (C0VQL) C08FF.LIZ(C0VQL.class, str);
    }

    public C0VQL(String str, int i) {
    }
}
