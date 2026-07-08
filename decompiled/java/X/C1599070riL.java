package X;

/* JADX INFO: renamed from: X.0riL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599070riL {
    public static C1599080riM LIZ;
    public static int LIZIZ = 1;

    public static void LIZJ() {
        C1599080riM c1599080riM;
        String andSet = C1599100riO.LIZ.getAndSet("");
        C1599080riM c1599080riM2 = LIZ;
        if (c1599080riM2 != null && c1599080riM2.LJII == 0) {
            c1599080riM2.LJIIIZ = andSet;
        }
        if (!((Boolean) C139400g4.LIZ.getValue()).booleanValue() && (c1599080riM = LIZ) != null) {
            long j = C1599100riO.LIZIZ.get();
            c1599080riM.LJIIJ = j > 0 ? System.currentTimeMillis() - j : -1L;
        }
        C1599080riM c1599080riM3 = LIZ;
        if (c1599080riM3 != null) {
            c1599080riM3.LJIILL = LIZIZ;
            c1599080riM3.LJII();
        }
        LIZ = null;
        LIZIZ = 0;
    }

    public static void LIZIZ(boolean z) {
        if (z) {
            C1599080riM c1599080riM = LIZ;
            if (c1599080riM != null) {
                c1599080riM.LJIIJJI = 0;
                return;
            }
            return;
        }
        C1599080riM c1599080riM2 = LIZ;
        if (c1599080riM2 == null) {
            return;
        }
        c1599080riM2.LJIIJJI = 1;
    }

    public static void LIZ(int i, int i2, int i3, boolean z) {
        C1599080riM c1599080riM = LIZ;
        if (c1599080riM != null) {
            c1599080riM.LJIIIIZZ = i;
            c1599080riM.LJIILIIL = i2;
            c1599080riM.LJIILJJIL = i3;
        }
        LIZIZ(z);
        LIZJ();
    }
}
