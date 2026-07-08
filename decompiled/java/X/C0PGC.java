package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PGC, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PGC {
    public static final C0PGC CUSTOM_GRADIENT_COLOR;
    public static final C0PGC GRADIENT_COLOR;
    public static final /* synthetic */ C0PGC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0PGC SOLID_COLOR;
    public final int LL;

    public static InterfaceC2044707zh<C0PGC> getEntries() {
        return LLILLL;
    }

    static {
        C0PGC c0pgc = new C0PGC("GRADIENT_COLOR", 0, 0);
        GRADIENT_COLOR = c0pgc;
        C0PGC c0pgc2 = new C0PGC("SOLID_COLOR", 1, 1);
        SOLID_COLOR = c0pgc2;
        C0PGC c0pgc3 = new C0PGC("CUSTOM_GRADIENT_COLOR", 2, 2);
        CUSTOM_GRADIENT_COLOR = c0pgc3;
        C0PGC[] c0pgcArr = {c0pgc, c0pgc2, c0pgc3};
        LLILLJJLI = c0pgcArr;
        LLILLL = new C2254308sP(c0pgcArr);
    }

    public static C0PGC[] values() {
        return (C0PGC[]) LLILLJJLI.clone();
    }

    public final int getMode() {
        return this.LL;
    }

    public static C0PGC valueOf(String str) {
        return (C0PGC) C08FF.LIZ(C0PGC.class, str);
    }

    public C0PGC(String str, int i, int i2) {
        this.LL = i2;
    }
}
