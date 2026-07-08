package X;

/* JADX INFO: renamed from: X.0s0E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1610160s0E {
    public static volatile boolean LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1610210s0J());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1610220s0K());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1610180s0G());
    public static final C01GW LJ = C452501pT.LIZIZ(new C1610170s0F());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C1610200s0I());
    public static final C01GW LJI = C452501pT.LIZIZ(new C1610190s0H());

    public static int LIZ() {
        C01GW c01gw = LIZLLL;
        boolean z = true;
        if (!((Boolean) c01gw.getValue()).booleanValue() && !((Boolean) LJ.getValue()).booleanValue() && !((Boolean) LJFF.getValue()).booleanValue() && !((Boolean) LJI.getValue()).booleanValue()) {
            if (((Boolean) LIZJ.getValue()).booleanValue()) {
                LIZ = true;
            }
            return C301820BsK.LIZ;
        }
        C104100aN.LIZ().getAverageSpeedInKBps();
        int iLJIJJ = C104100aN.LIZ().LJIJJ();
        int i = ((((Boolean) c01gw.getValue()).booleanValue() && iLJIJJ == 2) || (((Boolean) LJFF.getValue()).booleanValue() && iLJIJJ == 1)) ? 3 : C301820BsK.LIZ;
        if (((Boolean) LIZJ.getValue()).booleanValue()) {
            if (((Boolean) c01gw.getValue()).booleanValue() && iLJIJJ == 2) {
                z = false;
            }
            LIZ = z;
        }
        return i;
    }
}
