package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CFG, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CFG {
    public static final C0CFG HIGH;
    public static final /* synthetic */ C0CFG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0CFG LOW;

    public static InterfaceC2044707zh<C0CFG> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0CFG c0cfg = new C0CFG("LOW", 0);
        LOW = c0cfg;
        C0CFG c0cfg2 = new C0CFG("HIGH", 1);
        HIGH = c0cfg2;
        C0CFG[] c0cfgArr = {c0cfg, c0cfg2};
        LL = c0cfgArr;
        LLILLJJLI = new C2254308sP(c0cfgArr);
    }

    public static C0CFG[] values() {
        return (C0CFG[]) LL.clone();
    }

    public static C0CFG valueOf(String str) {
        return (C0CFG) C08FF.LIZ(C0CFG.class, str);
    }

    public C0CFG(String str, int i) {
    }
}
