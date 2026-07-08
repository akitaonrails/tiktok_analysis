package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00B1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00B1 {
    public static final C00B1 HIDE;
    public static final /* synthetic */ C00B1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00B1 SHOW;
    public static final C00B1 UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<C00B1> getEntries() {
        return LLILLL;
    }

    static {
        C00B1 c00b1 = new C00B1("UNKNOWN", 0, 0);
        UNKNOWN = c00b1;
        C00B1 c00b12 = new C00B1("SHOW", 1, 1);
        SHOW = c00b12;
        C00B1 c00b13 = new C00B1("HIDE", 2, 2);
        HIDE = c00b13;
        C00B1[] c00b1Arr = {c00b1, c00b12, c00b13};
        LLILLJJLI = c00b1Arr;
        LLILLL = new C2254308sP(c00b1Arr);
    }

    public static C00B1[] values() {
        return (C00B1[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static C00B1 valueOf(String str) {
        return (C00B1) C08FF.LIZ(C00B1.class, str);
    }

    public C00B1(String str, int i, int i2) {
        this.LL = i2;
    }
}
