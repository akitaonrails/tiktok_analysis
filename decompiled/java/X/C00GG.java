package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00GG, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00GG {
    public static final C00GG HIGH;
    public static final /* synthetic */ C00GG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00GG LOW;
    public static final C00GG NORMAL;

    public static InterfaceC2044707zh<C00GG> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00GG c00gg = new C00GG("HIGH", 0);
        HIGH = c00gg;
        C00GG c00gg2 = new C00GG("NORMAL", 1);
        NORMAL = c00gg2;
        C00GG c00gg3 = new C00GG("LOW", 2);
        LOW = c00gg3;
        C00GG[] c00ggArr = {c00gg, c00gg2, c00gg3};
        LL = c00ggArr;
        LLILLJJLI = new C2254308sP(c00ggArr);
    }

    public static C00GG[] values() {
        return (C00GG[]) LL.clone();
    }

    public static C00GG valueOf(String str) {
        return (C00GG) C08FF.LIZ(C00GG.class, str);
    }

    public C00GG(String str, int i) {
    }
}
