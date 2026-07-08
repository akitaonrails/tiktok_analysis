package X;

/* JADX INFO: renamed from: X.0COV, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0COV {
    public static final C01GW LIZ;
    public static final boolean LIZIZ;
    public static final boolean LIZJ;
    public static final float LIZLLL;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C0COO());
        LIZ = c01gwLIZIZ;
        LIZIZ = C1697810uHb.LJIIJJI(1, 3, 4, 5).contains(Integer.valueOf(((Number) c01gwLIZIZ.getValue()).intValue()));
        LIZJ = C1697810uHb.LJIIJJI(2, 3, 4, 5).contains(Integer.valueOf(((Number) c01gwLIZIZ.getValue()).intValue()));
        int iIntValue = ((Number) c01gwLIZIZ.getValue()).intValue();
        LIZLLL = C1697810uHb.LJIIJJI(2, 3).contains(Integer.valueOf(iIntValue)) ? C0COX.LIZJ : iIntValue == 4 ? C0COX.LIZLLL : iIntValue == 5 ? C0COX.LJ : -1.0f;
    }
}
