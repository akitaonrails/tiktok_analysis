package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00BM, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00BM {
    public static final /* synthetic */ C00BM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00BM ORDER_PUDO_CHANGE;
    public final int LL = 5;

    public static InterfaceC2044707zh<C00BM> getEntries() {
        return LLILLL;
    }

    static {
        C00BM c00bm = new C00BM();
        ORDER_PUDO_CHANGE = c00bm;
        C00BM[] c00bmArr = {c00bm};
        LLILLJJLI = c00bmArr;
        LLILLL = new C2254308sP(c00bmArr);
    }

    public static C00BM[] values() {
        return (C00BM[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C00BM valueOf(String str) {
        return (C00BM) C08FF.LIZ(C00BM.class, str);
    }
}
