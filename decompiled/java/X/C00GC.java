package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00GC, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00GC {
    public static final C00GC FAIL;
    public static final /* synthetic */ C00GC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00GC SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<C00GC> getEntries() {
        return LLILLL;
    }

    static {
        C00GC c00gc = new C00GC("FAIL", 0, 0);
        FAIL = c00gc;
        C00GC c00gc2 = new C00GC("SUCCESS", 1, 1);
        SUCCESS = c00gc2;
        C00GC[] c00gcArr = {c00gc, c00gc2};
        LLILLJJLI = c00gcArr;
        LLILLL = new C2254308sP(c00gcArr);
    }

    public static C00GC[] values() {
        return (C00GC[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C00GC valueOf(String str) {
        return (C00GC) C08FF.LIZ(C00GC.class, str);
    }

    public C00GC(String str, int i, int i2) {
        this.LL = i2;
    }
}
