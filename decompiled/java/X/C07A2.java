package X;

/* JADX INFO: renamed from: X.07A2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07A2 {
    public static final C01GW LIZ;
    public static final boolean LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;
    public static final boolean LJ;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C07A1());
        LIZ = c01gwLIZIZ;
        int iIntValue = ((Number) c01gwLIZIZ.getValue()).intValue();
        LIZIZ = (iIntValue & 1) != 0;
        LIZJ = (iIntValue & 2) != 0;
        LIZLLL = (iIntValue & 4) != 0;
        LJ = (iIntValue & 8) != 0;
    }
}
