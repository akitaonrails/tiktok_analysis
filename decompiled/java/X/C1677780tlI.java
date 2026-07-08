package X;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS181S0101000_25;

/* JADX INFO: renamed from: X.0tlI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677780tlI {
    public final C19968013Aw<C1677800tlK<?, ?>> LIZ = new C19968013Aw<>(new C1677800tlK[16]);
    public final C05P0 LIZIZ = C20028913Yh.LJI(Boolean.FALSE);
    public long LIZJ = Long.MIN_VALUE;
    public final C05P0 LIZLLL = C20028913Yh.LJI(Boolean.TRUE);

    public final void LIZ(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-318043801);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i2 & 1, z)) {
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            if (!((Boolean) ((C13FE) this.LIZLLL).getValue()).booleanValue() && !((Boolean) ((C13FE) this.LIZIZ).getValue()).booleanValue()) {
                c13zcLJIIJ.LJJIIJZLJL(1721270456);
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(1719883733);
                boolean zLJII = c13zcLJIIJ.LJII(this);
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                if (zLJII || objLJJ2 == c1680520tpi) {
                    objLJJ2 = new C1677790tlJ(c05p0, this, null);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                C1680540tpk.LJFF(this, (Function2) objLJJ2, c13zcLJIIJ);
                c13zcLJIIJ.LJJJJL(false);
            }
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(this, i, 51);
        }
    }
}
