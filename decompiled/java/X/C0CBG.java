package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CBG, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CBG {
    public static final C0CBG CURRENT;
    public static final C0CBG LAST;
    public static final /* synthetic */ C0CBG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0CBG NONE;
    public final int LL;

    public static InterfaceC2044707zh<C0CBG> getEntries() {
        return LLILLL;
    }

    static {
        C0CBG c0cbg = new C0CBG("NONE", 0, -1);
        NONE = c0cbg;
        C0CBG c0cbg2 = new C0CBG("LAST", 1, 1);
        LAST = c0cbg2;
        C0CBG c0cbg3 = new C0CBG("CURRENT", 2, 2);
        CURRENT = c0cbg3;
        C0CBG[] c0cbgArr = {c0cbg, c0cbg2, c0cbg3};
        LLILLJJLI = c0cbgArr;
        LLILLL = new C2254308sP(c0cbgArr);
    }

    public static C0CBG[] values() {
        return (C0CBG[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static C0CBG valueOf(String str) {
        return (C0CBG) C08FF.LIZ(C0CBG.class, str);
    }

    public C0CBG(String str, int i, int i2) {
        this.LL = i2;
    }
}
