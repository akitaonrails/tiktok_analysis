package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DKP, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DKP {
    public static final C0DKP CLICK_BACK;
    public static final C0DKP CLICK_CONTINUE;
    public static final C0DKP CLICK_SKIP;
    public static final /* synthetic */ C0DKP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0DKP SHOW;
    public final String LL;

    public static InterfaceC2044707zh<C0DKP> getEntries() {
        return LLILLL;
    }

    static {
        C0DKP c0dkp = new C0DKP("SHOW", 0, "show");
        SHOW = c0dkp;
        C0DKP c0dkp2 = new C0DKP("CLICK_CONTINUE", 1, "click_continue");
        CLICK_CONTINUE = c0dkp2;
        C0DKP c0dkp3 = new C0DKP("CLICK_SKIP", 2, "click_skip");
        CLICK_SKIP = c0dkp3;
        C0DKP c0dkp4 = new C0DKP("CLICK_BACK", 3, "click_back");
        CLICK_BACK = c0dkp4;
        C0DKP[] c0dkpArr = {c0dkp, c0dkp2, c0dkp3, c0dkp4};
        LLILLJJLI = c0dkpArr;
        LLILLL = new C2254308sP(c0dkpArr);
    }

    public static C0DKP[] values() {
        return (C0DKP[]) LLILLJJLI.clone();
    }

    public final String getParamValue() {
        return this.LL;
    }

    public static C0DKP valueOf(String str) {
        return (C0DKP) C08FF.LIZ(C0DKP.class, str);
    }

    public C0DKP(String str, int i, String str2) {
        this.LL = str2;
    }
}
