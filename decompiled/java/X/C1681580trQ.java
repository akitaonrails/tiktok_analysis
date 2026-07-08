package X;

import android.graphics.Shader;
import android.graphics.SweepGradient;
import androidx.compose.foundation.layout.c;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0trQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681580trQ {
    public static final float LIZ = 32;
    public static final float LIZIZ = 20;
    public static final float LIZJ = 1;
    public static final C1683730tut LIZLLL = new AbstractC1682800ttO() { // from class: X.0tut
        @Override // X.AbstractC1682800ttO
        public final Shader LIZIZ(long j) {
            int i = (int) (j & 4294967295L);
            float fIntBitsToFloat = Float.intBitsToFloat(i) / 2.0f;
            double d = fIntBitsToFloat;
            int i2 = (int) (j >> 32);
            float fIntBitsToFloat2 = (Float.intBitsToFloat(i2) / 2.0f) - fIntBitsToFloat;
            if (fIntBitsToFloat2 < 1.0f) {
                fIntBitsToFloat2 = 1.0f;
            }
            float fAtan2 = (float) (Math.atan2(d, fIntBitsToFloat2) / 6.283185307179586d);
            long j2 = C1685910tyP.LJ;
            long jLIZJ = C1685910tyP.LIZJ(0.56f, j2);
            long jLIZJ2 = C1685910tyP.LIZJ(0.14f, j2);
            float f = 0.5f - (fAtan2 * 2.0f);
            if (f < 0.0f) {
                f = 0.0f;
            }
            float f2 = (0.15f * f) + fAtan2;
            float f3 = (f * 0.85f) + fAtan2;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i) / 2.0f)) & 4294967295L);
            List listLJIIJJI = C1697810uHb.LJIIJJI(new C1685910tyP(jLIZJ2), new C1685910tyP(jLIZJ), new C1685910tyP(jLIZJ), new C1685910tyP(jLIZJ2), new C1685910tyP(jLIZJ2), new C1685910tyP(jLIZJ), new C1685910tyP(jLIZJ), new C1685910tyP(jLIZJ2), new C1685910tyP(jLIZJ2));
            List listLJIIJJI2 = C1697810uHb.LJIIJJI(Float.valueOf(0.0f), Float.valueOf(fAtan2), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(0.5f), Float.valueOf(fAtan2 + 0.5f), Float.valueOf(f2 + 0.5f), Float.valueOf(f3 + 0.5f), Float.valueOf(1.0f));
            C1683740tuu.LIZLLL(listLJIIJJI, listLJIIJJI2);
            int iLIZ = C1683740tuu.LIZ(listLJIIJJI);
            return new SweepGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits)), C1683740tuu.LIZIZ(iLIZ, listLJIIJJI), C1683740tuu.LIZJ(iLIZ, listLJIIJJI2, listLJIIJJI));
        }
    };
    public static final float LJ = 28;

    public static final void LJ(C05P1<C1396005dG> c05p1, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        Function1<Object, Unit> function1LJ;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(191077356);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c05p1)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i6 != 0) {
                interfaceC1685750ty9 = InterfaceC1685750ty9.LIZ;
            }
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                C13YG c13ygLIZ = C13YI.LIZ();
                if (c13ygLIZ != null) {
                    function1LJ = c13ygLIZ.LJ();
                } else {
                    function1LJ = null;
                }
                C13YG c13ygLIZIZ = C13YI.LIZIZ(c13ygLIZ);
                try {
                    float fLIZLLL = C13LZ.LIZLLL(c05p1.getValue().LIZIZ, 0.0f, 1.0f);
                    C13YI.LJ(c13ygLIZ, c13ygLIZIZ, function1LJ);
                    objLJJ = C1677470tkn.LIZ(fLIZLLL);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C13YI.LJ(c13ygLIZ, c13ygLIZIZ, function1LJ);
                    throw th;
                }
            }
            C1677480tko c1677480tko = (C1677480tko) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            Unit unit = Unit.LIZ;
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            if ((i3 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            boolean zLJII = z | c13zcLJIIJ.LJII(c1677480tko);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJII || objLJJ2 == c1680520tpi) {
                objLJJ2 = new C05SV(c1677480tko, c05p1, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(unit, (Function2) objLJJ2, c13zcLJIIJ);
            InterfaceC1685750ty9 interfaceC1685750ty9LJI = c.LJI(c.LJIILLIIL(interfaceC1685750ty9, 142), 2);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            boolean zLJII2 = c13zcLJIIJ.LJII(c1677480tko);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (zLJII2 || objLJJ3 == c1680520tpi) {
                objLJJ3 = new C1681360tr4(c1677480tko);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            k.LIZ(C1680910tqL.LIZ(interfaceC1685750ty9LJI, (Function1) objLJJ3), c13zcLJIIJ, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1681370tr5(c05p1, interfaceC1685750ty9, i, i2);
        }
    }

    public static final void LJFF(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, Function0 function0) {
        int i3;
        int i4;
        int i5;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(416921636);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
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
            if (c13zcLJIIJ.LJII(function0)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i6 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LIZJ = C634380OuS.LIZJ(C1675980tiO.LIZIZ(C1667200tUE.LIZ(c.LJIILIIL(interfaceC1685750ty92, LIZ), C1669050tXD.LIZ), C1685910tyP.LIZJ(0.12f, C1685910tyP.LIZIZ), C1669430tXp.LIZ), false, null, function0, 7);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LJFF, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZJ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1668930tX1.LIZIZ(C1669660tYC.LLZLLLL, "Help", c.LJIILIIL(InterfaceC1685750ty9.LIZ, LIZIZ), C1685910tyP.LJ, 0.0f, 0.0f, false, c13zcLJIIJ, 3504, 112);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1681900trw(i, i2, interfaceC1685750ty92, function0);
        }
    }

    public static final void LIZJ(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, Function0 function0, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        C1668880tWw c1668880tWw;
        float f;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-621237260);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
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
            if (c13zcLJIIJ.LJII(function0)) {
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
            if (z) {
                c1668880tWw = C1669660tYC.LLLZL;
            } else {
                c1668880tWw = C1669660tYC.LLLZIL;
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIIIZZ = C1682520tsw.LJIIIIZZ(C634380OuS.LIZJ(C1667200tUE.LIZ(c.LJIILIIL(interfaceC1685750ty92, 24), C1669050tXD.LIZ), false, null, function0, 7), 2);
            long j = C1685910tyP.LJ;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.75f;
            }
            C1668930tX1.LIZIZ(c1668880tWw, null, interfaceC1685750ty9LJIIIIZZ, C1685910tyP.LIZJ(f, j), 0.0f, 0.0f, false, c13zcLJIIJ, 48, 112);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1681880tru(i, i2, interfaceC1685750ty92, function0, z);
        }
    }

    public static final void LIZLLL(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, Function0 function0, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        C1668880tWw c1668880tWw;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1750734092);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
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
            if (c13zcLJIIJ.LJII(function0)) {
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
            if (z) {
                c1668880tWw = C1669660tYC.LLLLLLZZ;
            } else {
                c1668880tWw = C1669660tYC.LLLZLZ;
            }
            C1668930tX1.LIZIZ(c1668880tWw, null, C1682520tsw.LJIIIIZZ(C634380OuS.LIZJ(C1667200tUE.LIZ(c.LJIILIIL(interfaceC1685750ty92, 28), C1669050tXD.LIZ), false, null, function0, 7), 2), C1685910tyP.LIZJ(0.75f, C1685910tyP.LJ), 0.0f, 0.0f, false, c13zcLJIIJ, 3120, 112);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1681890trv(i, i2, interfaceC1685750ty92, function0, z);
        }
    }

    public static final void LJI(C1147620fyC c1147620fyC, InterfaceC1685750ty9 interfaceC1685750ty9, Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1539928827);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1147620fyC)) {
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
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
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
            float f = 100;
            float f2 = 12;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIIZ = C1682520tsw.LJIIIZ(C634380OuS.LIZJ(C1675890tiF.LIZIZ(LIZJ, C1667200tUE.LIZ(interfaceC1685750ty92, C1669050tXD.LIZIZ(f)), LIZLLL, C1669050tXD.LIZIZ(f)), false, null, function0, 7), f2, 10);
            InterfaceC1668050tVb.LIZ.getClass();
            C1296880jqw c1296880jqw = C1668040tVa.LJIIJJI;
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LJI(6), c1296880jqw, c13zcLJIIJ, 54);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIIZ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJI;
                C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                C1666950tTp c1666950tTpLJI = C1679930tol.LJI(4);
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                C1688120u1y c1688120u1yLIZ2 = C1665750tRt.LIZ(c1666950tTpLJI, c1296880jqw, c13zcLJIIJ, 54);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, c1685760tyA);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ2, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    c13zcLJIIJ.LJJIIJZLJL(1466476273);
                    if (C1681540trM.LIZ(c1147620fyC.LIZLLL)) {
                        C1682110tsH.LIZJ(c1147620fyC.LIZLLL, C1665900tS8.LIZ(C1667200tUE.LIZ(c.LJIILIIL(c1685760tyA, 20), C1669050tXD.LIZ), 0.7f), null, false, null, null, c13zcLJIIJ, 0, 60);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    String str = c1147620fyC.LIZJ;
                    if (a0.LJJJIL(str)) {
                        str = c1147620fyC.LIZIZ;
                    }
                    long j = C1685910tyP.LJ;
                    C1685190txF.LIZ(str, null, j, C1670400tZO.LJ(c13zcLJIIJ).LJJIII, 0L, 0, 2, false, 1, null, null, c13zcLJIIJ, 102236544, 0, 1714);
                    c13zcLJIIJ.LJJJJL(true);
                    C1668930tX1.LIZIZ(C1669660tYC.LJJI, null, c.LJIILIIL(c1685760tyA, f2), j, 0.0f, 0.0f, false, c13zcLJIIJ, 3504, 112);
                    c13zcLJIIJ.LJJJJL(true);
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1681790trl(c1147620fyC, interfaceC1685750ty92, function0, i, i2);
        }
    }

    public static final void LIZ(String str, long j, ImageModel imageModel, Function0<Unit> function0, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(365649578);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
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
            if (c13zcLJIIJ.LJIJJ(j)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        ImageModel imageModel2 = imageModel;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(imageModel2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i3 & 9363) == 9362 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i9 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LJI = c.LJI(interfaceC1685750ty92, LJ);
            InterfaceC1668050tVb.LIZ.getClass();
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LIZ, C1668040tVa.LJIIJJI, c13zcLJIIJ, 48);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJI);
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
                InterfaceC1685750ty9 interfaceC1685750ty9LIZJ = InterfaceC1685750ty9.LIZ;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIILIIL = c.LJIILIIL(interfaceC1685750ty9LIZJ, 20);
                C1669400tXm c1669400tXm = C1669050tXD.LIZ;
                InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1667200tUE.LIZ(interfaceC1685750ty9LJIILIIL, c1669400tXm);
                long j2 = C1685910tyP.LJ;
                imageModel2 = imageModel2;
                C1682110tsH.LIZJ(imageModel2, C1675890tiF.LIZ(C1675980tiO.LIZIZ(interfaceC1685750ty9LIZ, C1685910tyP.LIZJ(0.24f, j2), C1669430tXp.LIZ), 1, C1685910tyP.LIZJ(0.5f, j2), c1669400tXm), null, false, Integer.valueOf(R.drawable.eze), null, c13zcLJIIJ, (i3 >> 6) & 14, 44);
                C1693430uAX c1693430uAX = C1670400tZO.LJ(c13zcLJIIJ).LJIJI;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(interfaceC1685750ty9LIZJ, 4, 0.0f, 0.0f, 0.0f, 14);
                if (j > 0) {
                    interfaceC1685750ty9LIZJ = C634380OuS.LIZJ(interfaceC1685750ty9LIZJ, false, null, function0, 7);
                }
                C1685190txF.LIZ(str, interfaceC1685750ty9LJIIL.LIZ(interfaceC1685750ty9LIZJ), j2, c1693430uAX, 0L, 0, 2, false, 1, null, null, c13zcLJIIJ, (i3 & 14) | 102236544, 0, 1712);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1681700trc(str, j, imageModel2, function0, interfaceC1685750ty92, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(int r15, int r16, X.InterfaceC1680500tpg r17, X.InterfaceC1685750ty9 r18, kotlin.jvm.functions.Function0 r19, kotlin.jvm.functions.Function0 r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1681580trQ.LIZIZ(int, int, X.0tpg, X.0ty9, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:441:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJII(X.C1147620fyC r61, long r62, java.lang.String r64, java.lang.String r65, java.lang.String r66, long r67, com.bytedance.android.live.base.model.ImageModel r69, com.bytedance.android.live.base.model.ImageModel r70, com.bytedance.android.live.base.model.ImageModel r71, long r72, boolean r74, boolean r75, boolean r76, X.C05P1<X.C1396005dG> r77, long r78, long r80, kotlin.jvm.functions.Function0<java.lang.Float> r82, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> r83, kotlin.jvm.functions.Function0<kotlin.Unit> r84, kotlin.jvm.functions.Function0<kotlin.Unit> r85, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> r86, kotlin.jvm.functions.Function0<kotlin.Unit> r87, X.InterfaceC1685750ty9 r88, X.InterfaceC1680500tpg r89, int r90, int r91, int r92, int r93) {
        /*
            Method dump skipped, instruction units count: 2257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1681580trQ.LJII(X.0fyC, long, java.lang.String, java.lang.String, java.lang.String, long, com.bytedance.android.live.base.model.ImageModel, com.bytedance.android.live.base.model.ImageModel, com.bytedance.android.live.base.model.ImageModel, long, boolean, boolean, boolean, X.05P1, long, long, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, X.0ty9, X.0tpg, int, int, int, int):void");
    }
}
