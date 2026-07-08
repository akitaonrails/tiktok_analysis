package X;

import android.content.Context;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: renamed from: X.0tS7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1665890tS7 {
    public static final void LIZ(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, Function0 function0, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        long jLIZIZ;
        float f;
        boolean z2 = z;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(567219116);
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
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
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
            if (i8 != 0) {
                z2 = true;
            }
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
            if (numLIZJ != null) {
                jLIZIZ = C1685850tyJ.LIZIZ(numLIZJ.intValue());
            } else {
                jLIZIZ = C1685910tyP.LIZIZ;
            }
            boolean zLIZ = C423170GiZ.LIZ(context);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ == C1680510tph.LIZIZ) {
                objLJJ = new C612270Nzt();
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c.LJI(C634380OuS.LIZ(interfaceC1685750ty92, (InterfaceC595010NVj) objLJJ, null, z2, null, null, function0), 52), 16, 0.0f, 0.0f, 0.0f, 14);
            C1666950tTp c1666950tTpLJI = C1679930tol.LJI(4);
            InterfaceC1668050tVb.LIZ.getClass();
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(c1666950tTpLJI, C1668040tVa.LJIIJJI, c13zcLJIIJ, 54);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIL);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1668880tWw c1668880tWw = C1669660tYC.LJIIL;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIILIIL = c.LJIILIIL(InterfaceC1685750ty9.LIZ, 14);
                if (zLIZ) {
                    f = -1.0f;
                } else {
                    f = 1.0f;
                }
                C1668930tX1.LIZIZ(c1668880tWw, null, C1679660toK.LIZIZ(interfaceC1685750ty9LJIILIIL, f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0, 131070), jLIZIZ, 0.0f, 0.0f, false, c13zcLJIIJ, 48, 112);
                C1685190txF.LIZ(C0MBB.LIZIZ(2131825199, c13zcLJIIJ), null, C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), C1670400tZO.LJ(c13zcLJIIJ).LJIILLIIL, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2034);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1243110iSD(i, i2, interfaceC1685750ty92, function0, z2);
        }
    }
}
