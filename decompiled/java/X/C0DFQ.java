package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DFQ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DFQ {
    public static final C0DFQ CANCEL;
    public static final C0DFQ FAIL;
    public static final /* synthetic */ C0DFQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0DFQ SUCCESS;

    public static InterfaceC2044707zh<C0DFQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0DFQ c0dfq = new C0DFQ("SUCCESS", 0);
        SUCCESS = c0dfq;
        C0DFQ c0dfq2 = new C0DFQ("CANCEL", 1);
        CANCEL = c0dfq2;
        C0DFQ c0dfq3 = new C0DFQ("FAIL", 2);
        FAIL = c0dfq3;
        C0DFQ[] c0dfqArr = {c0dfq, c0dfq2, c0dfq3};
        LL = c0dfqArr;
        LLILLJJLI = new C2254308sP(c0dfqArr);
    }

    public static C0DFQ[] values() {
        return (C0DFQ[]) LL.clone();
    }

    public static C0DFQ valueOf(String str) {
        return (C0DFQ) C08FF.LIZ(C0DFQ.class, str);
    }

    public C0DFQ(String str, int i) {
    }
}
