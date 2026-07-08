package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NMC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NMC {
    public static final /* synthetic */ C0NMC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0NMC LOADMORE;
    public static final C0NMC REFRESH;
    public final int LL;

    public static InterfaceC2044707zh<C0NMC> getEntries() {
        return LLILLL;
    }

    static {
        C0NMC c0nmc = new C0NMC("REFRESH", 0, 1);
        REFRESH = c0nmc;
        C0NMC c0nmc2 = new C0NMC("LOADMORE", 1, 2);
        LOADMORE = c0nmc2;
        C0NMC[] c0nmcArr = {c0nmc, c0nmc2};
        LLILLJJLI = c0nmcArr;
        LLILLL = new C2254308sP(c0nmcArr);
    }

    public static C0NMC[] values() {
        return (C0NMC[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C0NMC valueOf(String str) {
        return (C0NMC) C08FF.LIZ(C0NMC.class, str);
    }

    public C0NMC(String str, int i, int i2) {
        this.LL = i2;
    }
}
