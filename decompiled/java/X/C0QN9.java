package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QN9, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QN9 {
    public static final C0QN9 CS;
    public static final /* synthetic */ C0QN9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0QN9 RS;
    public static final C0QN9 SUG;
    public final String LL;

    public static InterfaceC2044707zh<C0QN9> getEntries() {
        return LLILLL;
    }

    static {
        C0QN9 c0qn9 = new C0QN9("SUG", 0, "suggestion");
        SUG = c0qn9;
        C0QN9 c0qn92 = new C0QN9("CS", 1, "sug_recommend");
        CS = c0qn92;
        C0QN9 c0qn93 = new C0QN9("RS", 2, "sug_recommend");
        RS = c0qn93;
        C0QN9[] c0qn9Arr = {c0qn9, c0qn92, c0qn93};
        LLILLJJLI = c0qn9Arr;
        LLILLL = new C2254308sP(c0qn9Arr);
    }

    public static C0QN9[] values() {
        return (C0QN9[]) LLILLJJLI.clone();
    }

    public final String getReportType() {
        return this.LL;
    }

    public static C0QN9 valueOf(String str) {
        return (C0QN9) C08FF.LIZ(C0QN9.class, str);
    }

    public C0QN9(String str, int i, String str2) {
        this.LL = str2;
    }
}
