package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00FE, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00FE {
    public static final /* synthetic */ C00FE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00FE ON_START_SUCCESS;
    public static final C00FE ON_USER_JOINED;

    public static InterfaceC2044707zh<C00FE> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00FE c00fe = new C00FE("ON_START_SUCCESS", 0);
        ON_START_SUCCESS = c00fe;
        C00FE c00fe2 = new C00FE("ON_USER_JOINED", 1);
        ON_USER_JOINED = c00fe2;
        C00FE[] c00feArr = {c00fe, c00fe2};
        LL = c00feArr;
        LLILLJJLI = new C2254308sP(c00feArr);
    }

    public static C00FE[] values() {
        return (C00FE[]) LL.clone();
    }

    public static C00FE valueOf(String str) {
        return (C00FE) C08FF.LIZ(C00FE.class, str);
    }

    public C00FE(String str, int i) {
    }
}
