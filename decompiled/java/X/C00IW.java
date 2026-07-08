package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00IW, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00IW {
    public static final /* synthetic */ C00IW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00IW TT_GREET;
    public static final C00IW TT_GREET_FOLLOWTAB;
    public static final C00IW TT_GREET_TOAST;
    public static final C00IW TT_NORMAL;
    public final int LL;

    public static InterfaceC2044707zh<C00IW> getEntries() {
        return LLILLL;
    }

    static {
        C00IW c00iw = new C00IW("TT_NORMAL", 0, 0);
        TT_NORMAL = c00iw;
        C00IW c00iw2 = new C00IW("TT_GREET", 1, 1);
        TT_GREET = c00iw2;
        C00IW c00iw3 = new C00IW("TT_GREET_TOAST", 2, 2);
        TT_GREET_TOAST = c00iw3;
        C00IW c00iw4 = new C00IW("TT_GREET_FOLLOWTAB", 3, 3);
        TT_GREET_FOLLOWTAB = c00iw4;
        C00IW[] c00iwArr = {c00iw, c00iw2, c00iw3, c00iw4};
        LLILLJJLI = c00iwArr;
        LLILLL = new C2254308sP(c00iwArr);
    }

    public static C00IW[] values() {
        return (C00IW[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C00IW valueOf(String str) {
        return (C00IW) C08FF.LIZ(C00IW.class, str);
    }

    public C00IW(String str, int i, int i2) {
        this.LL = i2;
    }
}
