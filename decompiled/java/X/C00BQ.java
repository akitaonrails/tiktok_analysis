package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00BQ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00BQ {
    public static final /* synthetic */ C00BQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00BQ SCENE_HALF_PDP;
    public final String LL = "pdp_half";

    public static InterfaceC2044707zh<C00BQ> getEntries() {
        return LLILLL;
    }

    static {
        C00BQ c00bq = new C00BQ();
        SCENE_HALF_PDP = c00bq;
        C00BQ[] c00bqArr = {c00bq};
        LLILLJJLI = c00bqArr;
        LLILLL = new C2254308sP(c00bqArr);
    }

    public static C00BQ[] values() {
        return (C00BQ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C00BQ valueOf(String str) {
        return (C00BQ) C08FF.LIZ(C00BQ.class, str);
    }
}
