package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.049D, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C049D {
    public static final C049D FULL_SCREEN;
    public static final /* synthetic */ C049D[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C049D ONE_STEP;
    public final int LL;

    public static InterfaceC2044707zh<C049D> getEntries() {
        return LLILLL;
    }

    static {
        C049D c049d = new C049D("ONE_STEP", 0, 1);
        ONE_STEP = c049d;
        C049D c049d2 = new C049D("FULL_SCREEN", 1, 2);
        FULL_SCREEN = c049d2;
        C049D[] c049dArr = {c049d, c049d2};
        LLILLJJLI = c049dArr;
        LLILLL = new C2254308sP(c049dArr);
    }

    public static C049D[] values() {
        return (C049D[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C049D valueOf(String str) {
        return (C049D) C08FF.LIZ(C049D.class, str);
    }

    public C049D(String str, int i, int i2) {
        this.LL = i2;
    }
}
