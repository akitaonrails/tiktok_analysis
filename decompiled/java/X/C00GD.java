package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00GD, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00GD {
    public static final C00GD FAIL;
    public static final /* synthetic */ C00GD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00GD SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<C00GD> getEntries() {
        return LLILLL;
    }

    static {
        C00GD c00gd = new C00GD("SUCCESS", 0, 1);
        SUCCESS = c00gd;
        C00GD c00gd2 = new C00GD("FAIL", 1, 0);
        FAIL = c00gd2;
        C00GD[] c00gdArr = {c00gd, c00gd2};
        LLILLJJLI = c00gdArr;
        LLILLL = new C2254308sP(c00gdArr);
    }

    public static C00GD[] values() {
        return (C00GD[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C00GD valueOf(String str) {
        return (C00GD) C08FF.LIZ(C00GD.class, str);
    }

    public C00GD(String str, int i, int i2) {
        this.LL = i2;
    }
}
