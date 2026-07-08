package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00GE, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00GE {
    public static final C00GE HIGH;
    public static final /* synthetic */ C00GE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00GE NORMAL;

    public static InterfaceC2044707zh<C00GE> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00GE c00ge = new C00GE("HIGH", 0);
        HIGH = c00ge;
        C00GE c00ge2 = new C00GE("NORMAL", 1);
        NORMAL = c00ge2;
        C00GE[] c00geArr = {c00ge, c00ge2};
        LL = c00geArr;
        LLILLJJLI = new C2254308sP(c00geArr);
    }

    public static C00GE[] values() {
        return (C00GE[]) LL.clone();
    }

    public static C00GE valueOf(String str) {
        return (C00GE) C08FF.LIZ(C00GE.class, str);
    }

    public C00GE(String str, int i) {
    }
}
