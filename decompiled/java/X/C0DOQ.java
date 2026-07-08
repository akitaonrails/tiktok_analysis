package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DOQ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DOQ {
    public static final C0DOQ CLICK_SAVE;
    public static final C0DOQ CLICK_SKIP;
    public static final /* synthetic */ C0DOQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0DOQ SHOW;
    public final String LL;

    public static InterfaceC2044707zh<C0DOQ> getEntries() {
        return LLILLL;
    }

    static {
        C0DOQ c0doq = new C0DOQ("SHOW", 0, "show");
        SHOW = c0doq;
        C0DOQ c0doq2 = new C0DOQ("CLICK_SAVE", 1, "click_save");
        CLICK_SAVE = c0doq2;
        C0DOQ c0doq3 = new C0DOQ("CLICK_SKIP", 2, "click_skip");
        CLICK_SKIP = c0doq3;
        C0DOQ[] c0doqArr = {c0doq, c0doq2, c0doq3};
        LLILLJJLI = c0doqArr;
        LLILLL = new C2254308sP(c0doqArr);
    }

    public static C0DOQ[] values() {
        return (C0DOQ[]) LLILLJJLI.clone();
    }

    public final String getParamValue() {
        return this.LL;
    }

    public static C0DOQ valueOf(String str) {
        return (C0DOQ) C08FF.LIZ(C0DOQ.class, str);
    }

    public C0DOQ(String str, int i, String str2) {
        this.LL = str2;
    }
}
