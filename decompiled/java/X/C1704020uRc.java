package X;

/* JADX INFO: renamed from: X.0uRc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1704020uRc {
    public static volatile String LIZIZ;
    public static volatile boolean LJIIJ;
    public static volatile boolean LJIIJJI;
    public static volatile boolean LJIIL;
    public static volatile String LJIILIIL;
    public static volatile String LJIILJJIL;
    public static final C1704020uRc LIZ = new C1704020uRc();
    public static volatile long LIZJ = -1;
    public static volatile long LIZLLL = -1;
    public static volatile long LJ = -1;
    public static volatile long LJFF = -1;
    public static volatile long LJI = -1;
    public static volatile long LJII = -1;
    public static volatile long LJIIIIZZ = -1;
    public static volatile long LJIIIZ = -1;

    public final synchronized void LIZ() {
        LIZJ = -1L;
        LIZLLL = -1L;
        LJ = -1L;
        LJFF = -1L;
        LJIIIIZZ = -1L;
        LJIIIZ = -1L;
        LJII = -1L;
        LJI = -1L;
        LIZIZ(null);
        LJIIJ = false;
        LJIIJJI = false;
        LJIIL = false;
        LJIILIIL = null;
        LJIILJJIL = null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MallLandingPerfContext, perfId: ");
        sbLIZ.append(LIZIZ);
        sbLIZ.append(", userEntryClickTimeStamp: ");
        sbLIZ.append(LIZJ);
        sbLIZ.append(", jumpToMallTimeStamp: ");
        sbLIZ.append(LIZLLL);
        sbLIZ.append(", switchToMallTimeStamp: ");
        sbLIZ.append(LJ);
        sbLIZ.append(", jumpLandingTimeStamp: ");
        sbLIZ.append(LJFF);
        sbLIZ.append(", ladingContainerReadyTimeStamp: ");
        sbLIZ.append(LJIIIIZZ);
        sbLIZ.append(", isMallTabSelected: ");
        sbLIZ.append(LJIIJ);
        sbLIZ.append(", isMallTabRendered: ");
        sbLIZ.append(LJIIJJI);
        sbLIZ.append(", enterFrom: ");
        sbLIZ.append(LJIILIIL);
        sbLIZ.append(", pageName: ");
        sbLIZ.append(LJIILJJIL);
        sbLIZ.append(", isColdStart: ");
        sbLIZ.append(LJIIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZIZ(String str) {
        if (C123100dR.LIZ(LIZIZ) && str != null) {
            LIZ();
        }
        LIZIZ = str;
    }
}
