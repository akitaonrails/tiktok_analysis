package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Arrays;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS181S0101000_25;

/* JADX INFO: renamed from: X.0tRY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1665540tRY {
    public static final void LIZ(EnumC1308705Af enumC1308705Af, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(232947869);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(enumC1308705Af.ordinal())) {
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
        } else {
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(0L);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJI(null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C05P0 c05p02 = (C05P0) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            C05P0 c05p03 = (C05P0) objLJJ3;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            if ((i2 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (z || objLJJ4 == c1680520tpi) {
                objLJJ4 = new C05AX(enumC1308705Af, c05p0, c05p03, c05p02, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(enumC1308705Af, (Function2) objLJJ4, c13zcLJIIJ);
            if (((Boolean) c05p03.getValue()).booleanValue()) {
                int iLongValue = (int) (((Number) c05p0.getValue()).longValue() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                C1685190txF.LIZ(C786410Ut5.j4("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iLongValue / 60), Integer.valueOf(iLongValue % 60)}, 2)), C1682520tsw.LJIIL(InterfaceC1685750ty9.LIZ, 0.0f, 0.0f, 0.0f, 18, 7), C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), C1670400tZO.LJ(c13zcLJIIJ).LJJIII, 0L, 3, 0, false, 0, null, null, c13zcLJIIJ, 48, 0, 2000);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(enumC1308705Af, i, 31);
        }
    }
}
