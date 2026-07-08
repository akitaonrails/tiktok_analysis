package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008A, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C008A {
    public static final C008A FinishRecovery;
    public static final /* synthetic */ C008A[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C008A StartRecovery;

    public static InterfaceC2044707zh<C008A> getEntries() {
        return LLILLJJLI;
    }

    static {
        C008A c008a = new C008A("StartRecovery", 0);
        StartRecovery = c008a;
        C008A c008a2 = new C008A("FinishRecovery", 1);
        FinishRecovery = c008a2;
        C008A[] c008aArr = {c008a, c008a2};
        LL = c008aArr;
        LLILLJJLI = new C2254308sP(c008aArr);
    }

    public static C008A[] values() {
        return (C008A[]) LL.clone();
    }

    public static C008A valueOf(String str) {
        return (C008A) C08FF.LIZ(C008A.class, str);
    }

    public C008A(String str, int i) {
    }
}
