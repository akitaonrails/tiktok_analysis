package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.AwS69S0001000_25;

/* JADX INFO: renamed from: X.0uFI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696380uFI {
    public static final boolean LIZIZ(C05P0<Boolean> c05p0) {
        return c05p0.getValue().booleanValue();
    }

    public static final void LIZ(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1709526833);
        if (i == 0 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            Keva repo = Keva.getRepo("a11y_setting");
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(Boolean.valueOf(repo.getBoolean("high_contrast_enabled", false)));
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            String strLIZIZ = C0MBB.LIZIZ(2131851137, c13zcLJIIJ);
            String strLIZIZ2 = C0MBB.LIZIZ(2131851136, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJII = c13zcLJIIJ.LJII(repo);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJII || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS426S0200000_25(repo, (Keva) c05p0, (C05P0<Boolean>) 162);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1673210tdv.LIZ(null, strLIZIZ, 0, strLIZIZ2, false, false, null, false, null, false, null, false, false, null, null, null, null, null, (Function0) objLJJ2, null, null, null, null, false, C13Z4.LIZJ(-1912521102, new AwS639S0100000_25(c05p0, (C05P0<Boolean>) 136), c13zcLJIIJ), c13zcLJIIJ, 0, 432, 24576, 16508917);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS69S0001000_25(i, 25);
        }
    }
}
