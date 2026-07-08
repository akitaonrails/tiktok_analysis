package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00BI, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00BI {
    public static final C00BI DEFAULT_ERROR;
    public static final /* synthetic */ C00BI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL = -1;

    public static InterfaceC2044707zh<C00BI> getEntries() {
        return LLILLL;
    }

    static {
        C00BI c00bi = new C00BI();
        DEFAULT_ERROR = c00bi;
        C00BI[] c00biArr = {c00bi};
        LLILLJJLI = c00biArr;
        LLILLL = new C2254308sP(c00biArr);
    }

    public static C00BI[] values() {
        return (C00BI[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static C00BI valueOf(String str) {
        return (C00BI) C08FF.LIZ(C00BI.class, str);
    }
}
