package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.AwS69S0001000_25;

/* JADX INFO: renamed from: X.0uFh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696630uFh {
    public static final boolean LIZIZ(C05P0<Boolean> c05p0) {
        return c05p0.getValue().booleanValue();
    }

    public static final void LIZ(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(744642101);
        if (i == 0 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (ComplianceServiceProvider.LJI().LJJJJIZL() <= 0) {
                C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
                if (c20030013YsLJJJJZI != null) {
                    c20030013YsLJJJJZI.LIZLLL = new AwS69S0001000_25(i, 27);
                    return;
                }
                return;
            }
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                boolean z = true;
                if (ComplianceServiceProvider.LJI().LJIJ() != 1) {
                    z = false;
                }
                objLJJ = C20028913Yh.LJI(Boolean.valueOf(z));
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            if (C0BOG.LIZ()) {
                i2 = 2131839869;
            } else {
                i2 = 2131845888;
            }
            if (C0BOG.LIZ()) {
                i3 = 2131839868;
            } else {
                i3 = 2131845889;
            }
            String strLIZIZ = C0MBB.LIZIZ(i2, c13zcLJIIJ);
            String strLIZIZ2 = C0MBB.LIZIZ(i3, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS569S0100000_25(c05p0, (C05P0<Boolean>) 992);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1673210tdv.LIZ(null, strLIZIZ, 0, strLIZIZ2, false, false, null, false, null, false, null, false, false, null, null, null, null, null, (Function0) objLJJ2, null, null, null, null, false, C13Z4.LIZJ(-1119913674, new AwS639S0100000_25(c05p0, (C05P0<Boolean>) 138), c13zcLJIIJ), c13zcLJIIJ, 0, 100663728, 24576, 16508917);
        }
        C20030013Ys c20030013YsLJJJJZI2 = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI2 != null) {
            c20030013YsLJJJJZI2.LIZLLL = new AwS69S0001000_25(i, 28);
        }
    }
}
