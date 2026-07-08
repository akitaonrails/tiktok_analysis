package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08QG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08QG {
    public static final /* synthetic */ C08QG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C08QG SKIP;
    public static final C08QG TERMINATE;

    public static InterfaceC2044707zh<C08QG> getEntries() {
        return LLILLJJLI;
    }

    static {
        C08QG c08qg = new C08QG("SKIP", 0);
        SKIP = c08qg;
        C08QG c08qg2 = new C08QG("TERMINATE", 1);
        TERMINATE = c08qg2;
        C08QG[] c08qgArr = {c08qg, c08qg2};
        LL = c08qgArr;
        LLILLJJLI = new C2254308sP(c08qgArr);
    }

    public static C08QG[] values() {
        return (C08QG[]) LL.clone();
    }

    public static C08QG valueOf(String str) {
        return (C08QG) C08FF.LIZ(C08QG.class, str);
    }

    public C08QG(String str, int i) {
    }
}
