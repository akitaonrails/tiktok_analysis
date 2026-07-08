package X;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: renamed from: X.0uFG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696360uFG {
    public static final boolean LIZIZ(C05P0<Boolean> c05p0) {
        return c05p0.getValue().booleanValue();
    }

    public static final void LIZ(Context context, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(716990136);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(context)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else if (!C20595415iS.LIZIZ() && !C19252910Tv.LIZIZ.LIZLLL().LIZ().LIZJ()) {
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(Boolean.valueOf(C1620190sGP.LIZ()));
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            String strLIZIZ = C0MBB.LIZIZ(2131845881, c13zcLJIIJ);
            String strLIZIZ2 = C0MBB.LIZIZ(2131845882, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJII = c13zcLJIIJ.LJII(context);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJII || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS568S0100000_24(context, c05p0, 1820);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1673210tdv.LIZ(null, strLIZIZ, 0, strLIZIZ2, false, false, null, false, null, false, null, false, false, null, null, null, null, null, (Function0) objLJJ2, null, null, null, null, false, C13Z4.LIZJ(-579998377, new AwS639S0100000_25(c05p0, (C05P0<Boolean>) 134), c13zcLJIIJ), c13zcLJIIJ, 0, 432, 24576, 16508917);
        } else {
            C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
            if (c20030013YsLJJJJZI != null) {
                c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(context, i, 74);
                return;
            }
            return;
        }
        C20030013Ys c20030013YsLJJJJZI2 = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI2 != null) {
            c20030013YsLJJJJZI2.LIZLLL = new AwS181S0101000_25(context, i, 75);
        }
    }
}
