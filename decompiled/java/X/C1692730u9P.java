package X;

/* JADX INFO: renamed from: X.0u9P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692730u9P {
    public static C1692730u9P LJII;
    public final EnumC1671200tag LIZ;
    public final C1693430uAX LIZIZ;
    public final InterfaceC1690500u5o LIZJ;
    public final InterfaceC594710NUf LIZLLL;
    public final C1693430uAX LJ;
    public float LJFF = Float.NaN;
    public float LJI = Float.NaN;

    public final long LIZ(int i, long j) {
        float height = this.LJI;
        float height2 = this.LJFF;
        int iLJIIIZ = 0;
        if (Float.isNaN(height) || Float.isNaN(height2)) {
            height = C1692770u9T.LIZ(C0TI9.LIZ, this.LJ, C1682390tsj.LIZ(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE), this.LIZJ, this.LIZLLL, null, 1, 96).getHeight();
            height2 = C1692770u9T.LIZ(C0TI9.LIZIZ, this.LJ, C1682390tsj.LIZ(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE), this.LIZJ, this.LIZLLL, null, 2, 96).getHeight() - height;
            this.LJI = height;
            this.LJFF = height2;
        }
        if (i != 1) {
            int iRound = Math.round(height + (height2 * (i - 1)));
            if (iRound >= 0) {
                iLJIIIZ = iRound;
            }
            int iLJII = C1682380tsi.LJII(j);
            if (iLJIIIZ > iLJII) {
                iLJIIIZ = iLJII;
            }
        } else {
            iLJIIIZ = C1682380tsi.LJIIIZ(j);
        }
        return C1682390tsj.LIZ(C1682380tsi.LJIIJ(j), C1682380tsi.LJIIIIZZ(j), iLJIIIZ, C1682380tsi.LJII(j));
    }

    public C1692730u9P(EnumC1671200tag enumC1671200tag, C1693430uAX c1693430uAX, C1516420pZ2 c1516420pZ2, InterfaceC594710NUf interfaceC594710NUf) {
        this.LIZ = enumC1671200tag;
        this.LIZIZ = c1693430uAX;
        this.LIZJ = c1516420pZ2;
        this.LIZLLL = interfaceC594710NUf;
        this.LJ = C1693460uAa.LIZ(c1693430uAX, enumC1671200tag);
    }
}
