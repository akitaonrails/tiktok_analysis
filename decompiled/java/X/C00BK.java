package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00BK, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00BK {
    public static final C00BK FAVORITE_VIDEO;
    public static final /* synthetic */ C00BK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL = 103;

    public static InterfaceC2044707zh<C00BK> getEntries() {
        return LLILLL;
    }

    static {
        C00BK c00bk = new C00BK();
        FAVORITE_VIDEO = c00bk;
        C00BK[] c00bkArr = {c00bk};
        LLILLJJLI = c00bkArr;
        LLILLL = new C2254308sP(c00bkArr);
    }

    public static C00BK[] values() {
        return (C00BK[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C00BK valueOf(String str) {
        return (C00BK) C08FF.LIZ(C00BK.class, str);
    }
}
