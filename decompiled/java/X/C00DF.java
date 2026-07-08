package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00DF, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00DF {
    public static final C00DF FANS_CLUB_BADGE;
    public static final C00DF FANS_CLUB_POINTS;
    public static final C00DF FANS_CLUB_UNKNOWN;
    public static final /* synthetic */ C00DF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C00DF> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00DF c00df = new C00DF("FANS_CLUB_UNKNOWN", 0);
        FANS_CLUB_UNKNOWN = c00df;
        C00DF c00df2 = new C00DF("FANS_CLUB_POINTS", 1);
        FANS_CLUB_POINTS = c00df2;
        C00DF c00df3 = new C00DF("FANS_CLUB_BADGE", 2);
        FANS_CLUB_BADGE = c00df3;
        C00DF[] c00dfArr = {c00df, c00df2, c00df3};
        LL = c00dfArr;
        LLILLJJLI = new C2254308sP(c00dfArr);
    }

    public static C00DF[] values() {
        return (C00DF[]) LL.clone();
    }

    public static C00DF valueOf(String str) {
        return (C00DF) C08FF.LIZ(C00DF.class, str);
    }

    public C00DF(String str, int i) {
    }
}
