package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.AwS69S0001000_25;

/* JADX INFO: renamed from: X.0uFJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696390uFJ {
    public static final boolean LIZIZ(C05P0<Boolean> c05p0) {
        return c05p0.getValue().booleanValue();
    }

    public static final void LIZ(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        String strLIZIZ;
        String strLIZIZ2;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(976112317);
        if (i == 0 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (C0B07.LIZ()) {
                c13zcLJIIJ.LJJIIJZLJL(-1861419478);
                strLIZIZ = C0MBB.LIZIZ(2131848344, c13zcLJIIJ);
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(-1861322913);
                strLIZIZ = C0MBB.LIZIZ(2131845883, c13zcLJIIJ);
                c13zcLJIIJ.LJJJJL(false);
            }
            if (C0B07.LIZ()) {
                c13zcLJIIJ.LJJIIJZLJL(-1861162550);
                strLIZIZ2 = C0MBB.LIZIZ(2131848343, c13zcLJIIJ);
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(-1861065830);
                strLIZIZ2 = C0MBB.LIZIZ(2131845884, c13zcLJIIJ);
                c13zcLJIIJ.LJJJJL(false);
            }
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = Keva.getRepo("accessibility_setting");
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            Keva keva = (Keva) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                boolean z = true;
                boolean z2 = keva.getBoolean("faster_paging_duration", true);
                if (C0B07.LIZ()) {
                    if (z2) {
                        z = false;
                    }
                } else {
                    z = z2;
                }
                objLJJ2 = C20028913Yh.LJI(Boolean.valueOf(z));
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C05P0 c05p0 = (C05P0) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJII = c13zcLJIIJ.LJII(keva);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (zLJII || objLJJ3 == c1680520tpi) {
                objLJJ3 = new AwS426S0200000_25(keva, (Keva) c05p0, (C05P0<Boolean>) 163);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1673210tdv.LIZ(null, strLIZIZ, 0, strLIZIZ2, false, false, null, false, null, false, null, false, false, null, null, null, null, null, (Function0) objLJJ3, null, null, null, null, false, C13Z4.LIZJ(-888443458, new AwS639S0100000_25(c05p0, (C05P0<Boolean>) 137), c13zcLJIIJ), c13zcLJIIJ, 0, 432, 24576, 16508917);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS69S0001000_25(i, 26);
        }
    }
}
