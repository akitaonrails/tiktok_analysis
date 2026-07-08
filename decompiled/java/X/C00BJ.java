package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00BJ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00BJ {
    public static final /* synthetic */ C00BJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00BJ PROFILE_RIT;
    public final int LL = 1;

    public static InterfaceC2044707zh<C00BJ> getEntries() {
        return LLILLL;
    }

    static {
        C00BJ c00bj = new C00BJ();
        PROFILE_RIT = c00bj;
        C00BJ[] c00bjArr = {c00bj};
        LLILLJJLI = c00bjArr;
        LLILLL = new C2254308sP(c00bjArr);
    }

    public static C00BJ[] values() {
        return (C00BJ[]) LLILLJJLI.clone();
    }

    public final int getTYPE() {
        return this.LL;
    }

    public static C00BJ valueOf(String str) {
        return (C00BJ) C08FF.LIZ(C00BJ.class, str);
    }
}
