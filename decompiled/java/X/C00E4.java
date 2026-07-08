package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00E4, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00E4 {
    public static final /* synthetic */ C00E4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00E4 NORMAL;
    public static final C00E4 ON_GOING;
    public final int LL;

    public static InterfaceC2044707zh<C00E4> getEntries() {
        return LLILLL;
    }

    static {
        C00E4 c00e4 = new C00E4("NORMAL", 0, 0);
        NORMAL = c00e4;
        C00E4 c00e42 = new C00E4("ON_GOING", 1, 1);
        ON_GOING = c00e42;
        C00E4[] c00e4Arr = {c00e4, c00e42};
        LLILLJJLI = c00e4Arr;
        LLILLL = new C2254308sP(c00e4Arr);
    }

    public static C00E4[] values() {
        return (C00E4[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C00E4 valueOf(String str) {
        return (C00E4) C08FF.LIZ(C00E4.class, str);
    }

    public C00E4(String str, int i, int i2) {
        this.LL = i2;
    }
}
