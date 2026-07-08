package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DOT, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DOT {
    public static final C0DOT FAIL;
    public static final /* synthetic */ C0DOT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0DOT NO_RESULT;
    public static final C0DOT SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<C0DOT> getEntries() {
        return LLILLL;
    }

    static {
        C0DOT c0dot = new C0DOT("SUCCESS", 0, "success");
        SUCCESS = c0dot;
        C0DOT c0dot2 = new C0DOT("FAIL", 1, "fail");
        FAIL = c0dot2;
        C0DOT c0dot3 = new C0DOT("NO_RESULT", 2, "no_result");
        NO_RESULT = c0dot3;
        C0DOT[] c0dotArr = {c0dot, c0dot2, c0dot3};
        LLILLJJLI = c0dotArr;
        LLILLL = new C2254308sP(c0dotArr);
    }

    public static C0DOT[] values() {
        return (C0DOT[]) LLILLJJLI.clone();
    }

    public final String getParamValue() {
        return this.LL;
    }

    public static C0DOT valueOf(String str) {
        return (C0DOT) C08FF.LIZ(C0DOT.class, str);
    }

    public C0DOT(String str, int i, String str2) {
        this.LL = str2;
    }
}
