package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00B0, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00B0 {
    public static final C00B0 DIGG;
    public static final C00B0 ENTER_COMMENT;
    public static final C00B0 IGNORE;
    public static final /* synthetic */ C00B0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00B0 SHOOT;
    public final int LL;

    public static InterfaceC2044707zh<C00B0> getEntries() {
        return LLILLL;
    }

    static {
        C00B0 c00b0 = new C00B0("IGNORE", 0, 0);
        IGNORE = c00b0;
        C00B0 c00b02 = new C00B0("DIGG", 1, 1);
        DIGG = c00b02;
        C00B0 c00b03 = new C00B0("ENTER_COMMENT", 2, 2);
        ENTER_COMMENT = c00b03;
        C00B0 c00b04 = new C00B0("SHOOT", 3, 3);
        SHOOT = c00b04;
        C00B0[] c00b0Arr = {c00b0, c00b02, c00b03, c00b04};
        LLILLJJLI = c00b0Arr;
        LLILLL = new C2254308sP(c00b0Arr);
    }

    public static C00B0[] values() {
        return (C00B0[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C00B0 valueOf(String str) {
        return (C00B0) C08FF.LIZ(C00B0.class, str);
    }

    public C00B0(String str, int i, int i2) {
        this.LL = i2;
    }
}
