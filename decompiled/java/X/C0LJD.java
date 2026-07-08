package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LJD, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LJD {
    public static final C0LJD FIXED_TOP;
    public static final C0LJD FLOAT_BOTTOM;
    public static final /* synthetic */ C0LJD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C0LJD> getEntries() {
        return LLILLL;
    }

    static {
        C0LJD c0ljd = new C0LJD("FIXED_TOP", 0, 0);
        FIXED_TOP = c0ljd;
        C0LJD c0ljd2 = new C0LJD("FLOAT_BOTTOM", 1, 1);
        FLOAT_BOTTOM = c0ljd2;
        C0LJD[] c0ljdArr = {c0ljd, c0ljd2};
        LLILLJJLI = c0ljdArr;
        LLILLL = new C2254308sP(c0ljdArr);
    }

    public static C0LJD[] values() {
        return (C0LJD[]) LLILLJJLI.clone();
    }

    public final int getStyle() {
        return this.LL;
    }

    public static C0LJD valueOf(String str) {
        return (C0LJD) C08FF.LIZ(C0LJD.class, str);
    }

    public C0LJD(String str, int i, int i2) {
        this.LL = i2;
    }
}
