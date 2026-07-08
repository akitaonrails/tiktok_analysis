package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS68S0001000_19;

/* JADX INFO: renamed from: X.0iVC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1244960iVC {
    public static final boolean LIZIZ(C05P0<Boolean> c05p0) {
        return c05p0.getValue().booleanValue();
    }

    public static final void LIZ(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1554229137);
        if (i == 0 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = Keva.getRepo("keva_a11y_settings_unit");
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            Keva keva = (Keva) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJI(Boolean.valueOf(keva.getBoolean("keva_is_hdr_off", false)));
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C05P0 c05p0 = (C05P0) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            keva.storeBoolean("keva_has_show_a11y_hdr_switch", true);
            String strLIZIZ = C0MBB.LIZIZ(2131823148, c13zcLJIIJ);
            String strLIZIZ2 = C0MBB.LIZIZ(2131823147, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJII = c13zcLJIIJ.LJII(keva);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (zLJII || objLJJ3 == c1680520tpi) {
                objLJJ3 = new AwS420S0200000_19(keva, (Keva) c05p0, (C05P0<Boolean>) 180);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1673210tdv.LIZ(null, strLIZIZ, 0, strLIZIZ2, false, false, null, false, null, false, null, false, false, null, null, null, null, null, (Function0) objLJJ3, null, null, null, null, false, C13Z4.LIZJ(982843730, new AwS633S0100000_19(c05p0, (C05P0<Boolean>) 279), c13zcLJIIJ), c13zcLJIIJ, 0, 432, 24576, 16508917);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS68S0001000_19(i, 3);
        }
    }
}
