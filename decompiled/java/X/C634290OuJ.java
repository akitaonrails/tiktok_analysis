package X;

import androidx.compose.foundation.layout.c;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS5S0302000_9;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: renamed from: X.0OuJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C634290OuJ {
    public static final void LIZ(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, Function0 function0, Function0 function02) {
        int i3;
        int i4;
        int i5;
        int i6;
        long jLIZIZ;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-88130347);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i7 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            C05P0 c05p0LJIIIIZZ = C20028913Yh.LJIIIIZZ(function0, c13zcLJIIJ);
            C05P0 c05p0LJIIIIZZ2 = C20028913Yh.LJIIIIZZ(function02, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new C612270Nzt();
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            InterfaceC595010NVj interfaceC595010NVj = (InterfaceC595010NVj) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            C05P0 c05p0LIZ = C631880OqQ.LIZ(interfaceC595010NVj, c13zcLJIIJ, 6);
            c13zcLJIIJ.LJJIIJZLJL(1206096660);
            if (((Boolean) c05p0LIZ.getValue()).booleanValue()) {
                jLIZIZ = C1670810ta3.LIZIZ(R.attr.bs, c13zcLJIIJ);
            } else {
                jLIZIZ = C1685910tyP.LJIIIZ;
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LJIJI = c.LJIJI(c.LJ(interfaceC1685750ty92, 1.0f), null, 3);
            C20279814Wu c20279814Wu = new C20279814Wu(0);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(c05p0LJIIIIZZ);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS553S0100000_9(c05p0LJIIIIZZ, (C05P0<Boolean>) 1811);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1668270tVx.LIZ(C1670810ta3.LIZ(interfaceC1685750ty9LJIJI, interfaceC595010NVj, c20279814Wu, (Function0) objLJJ2, c13zcLJIIJ, 3456, 1), null, jLIZIZ, null, 0.0f, C13Z4.LIZJ(-1890254350, new AwS639S0100000_25(c05p0LJIIIIZZ2, (C05P0<Boolean>) 143), c13zcLJIIJ), c13zcLJIIJ, 196608, 26);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS5S0302000_9(i, i2, interfaceC1685750ty92, function0, function02, 4);
        }
    }
}
