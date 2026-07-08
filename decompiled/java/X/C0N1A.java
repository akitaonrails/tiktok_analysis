package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N1A, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N1A {
    public static final C0N1A EXHAUSTED;
    public static final C0N1A IDLE;
    public static final /* synthetic */ C0N1A[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0N1A RETRYING;
    public static final C0N1A WAITING;

    public static InterfaceC2044707zh<C0N1A> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0N1A c0n1a = new C0N1A("IDLE", 0);
        IDLE = c0n1a;
        C0N1A c0n1a2 = new C0N1A("WAITING", 1);
        WAITING = c0n1a2;
        C0N1A c0n1a3 = new C0N1A("RETRYING", 2);
        RETRYING = c0n1a3;
        C0N1A c0n1a4 = new C0N1A("EXHAUSTED", 3);
        EXHAUSTED = c0n1a4;
        C0N1A[] c0n1aArr = {c0n1a, c0n1a2, c0n1a3, c0n1a4};
        LL = c0n1aArr;
        LLILLJJLI = new C2254308sP(c0n1aArr);
    }

    public static C0N1A[] values() {
        return (C0N1A[]) LL.clone();
    }

    public static C0N1A valueOf(String str) {
        return (C0N1A) C08FF.LIZ(C0N1A.class, str);
    }

    public C0N1A(String str, int i) {
    }
}
