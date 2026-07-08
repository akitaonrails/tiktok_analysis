package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00CG, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00CG {
    public static final /* synthetic */ C00CG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00CG NONE;
    public static final C00CG SEARCHING;

    public static InterfaceC2044707zh<C00CG> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00CG c00cg = new C00CG("SEARCHING", 0);
        SEARCHING = c00cg;
        C00CG c00cg2 = new C00CG("NONE", 1);
        NONE = c00cg2;
        C00CG[] c00cgArr = {c00cg, c00cg2};
        LL = c00cgArr;
        LLILLJJLI = new C2254308sP(c00cgArr);
    }

    public static C00CG[] values() {
        return (C00CG[]) LL.clone();
    }

    public static C00CG valueOf(String str) {
        return (C00CG) C08FF.LIZ(C00CG.class, str);
    }

    public C00CG(String str, int i) {
    }
}
