package X;

import android.graphics.Bitmap;
import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS16S0200001_25;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tUS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667340tUS {
    public static final float LIZ;
    public static final float LIZIZ = 52;
    public static final float LIZJ = 0;
    public static final float LIZLLL = 10;
    public static final float LJ = 44;
    public static final float LJFF;

    static {
        float f = 16;
        LIZ = f;
        LJFF = f;
    }

    public static final void LIZ(Bitmap bitmap, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1828772783);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(bitmap)) {
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
            InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII);
            C1668160tVm.LIZ(c.LJ(InterfaceC1685750ty9.LIZ, 1.0f), null, false, C13Z4.LIZJ(-1714020825, new AwS16S0200001_25(interfaceC1690500u5o, bitmap, interfaceC1690500u5o.LJJJJLL(LJFF), 0), c13zcLJIIJ), c13zcLJIIJ, 3078, 6);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(bitmap, i, 0);
        }
    }

    public static final void LIZIZ(Bitmap bitmap, int i, float f, Function0<Unit> function0, Function0<Unit> function02, InterfaceC1680500tpg interfaceC1680500tpg, int i2) {
        int i3;
        boolean z;
        boolean z2;
        float f2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(899967848);
        if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJII(bitmap)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & 384) == 0) {
            if (c13zcLJIIJ.LJIJ(f)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i5 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i2 & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) == 9362 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C1677470tkn.LIZ(0.0f);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C1677480tko c1677480tko = (C1677480tko) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C05P0 c05p0 = (C05P0) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            Unit unit = Unit.LIZ;
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            boolean zLJII = c13zcLJIIJ.LJII(c1677480tko);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (zLJII || objLJJ3 == c1680520tpi) {
                objLJJ3 = new C05SY(c1677480tko, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(unit, (Function2) objLJJ3, c13zcLJIIJ);
            Integer numValueOf = Integer.valueOf(i);
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            if ((i3 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            boolean zLJII2 = z | c13zcLJIIJ.LJII(c1677480tko);
            if ((i3 & 57344) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = zLJII2 | z2;
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (z3 || objLJJ4 == c1680520tpi) {
                objLJJ4 = new C05SX(i, c1677480tko, function02, c05p0, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(numValueOf, (Function2) objLJJ4, c13zcLJIIJ);
            float fLIZLLL = C13LZ.LIZLLL(((Number) c1677480tko.LIZLLL()).floatValue(), 0.0f, 1.0f);
            if (f > 0.0f) {
                f2 = f + 0.0f;
            } else {
                f2 = LIZJ;
            }
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(C1675980tiO.LIZIZ(C1665900tS8.LIZ(c.LIZLLL(c1685760tyA), fLIZLLL), C1670400tZO.LIZIZ(c13zcLJIIJ).F2(), C1669430tXp.LIZ), C1670400tZO.LIZIZ(c13zcLJIIJ).U2(), C1669430tXp.LIZ);
            InterfaceC1668050tVb.LIZ.getClass();
            C1296870jqv c1296870jqv = C1668040tVa.LIZIZ;
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(c1296870jqv, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZIZ);
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
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1671840tbi.LIZ(C1671840tbi.LIZIZ(c.LIZJ));
                float f3 = LIZ;
                InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ2 = C1667200tUE.LIZIZ(C1682520tsw.LJIIJJI(interfaceC1685750ty9LIZ, f3, LIZIZ, f3, f2));
                C1296870jqv c1296870jqv2 = C1668040tVa.LJFF;
                InterfaceC20053113dB interfaceC20053113dBLIZLLL2 = k.LIZLLL(c1296870jqv2, false);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZIZ2);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL2, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    LIZ(bitmap, c13zcLJIIJ, i3 & 14);
                    c13zcLJIIJ.LJJJJL(true);
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ3 = C1671840tbi.LIZIZ(c1672220tcK.LIZIZ(c1685760tyA, c1296870jqv));
                    float f4 = LIZLLL;
                    InterfaceC1685750ty9 interfaceC1685750ty9LJIJJ = c.LJIJJ(c.LJIILIIL(C1682520tsw.LJIIL(interfaceC1685750ty9LIZIZ3, f4, f4, 0.0f, 0.0f, 12), LJ), c1296870jqv2, 2);
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ5 = c13zcLJIIJ.LJJ();
                    if (objLJJ5 == c1680520tpi) {
                        objLJJ5 = AFwS266S0000000_25.get$arr$(5);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ5);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZ2 = C1685330txT.LIZ(interfaceC1685750ty9LJIJJ, (Function1) objLJJ5);
                    InterfaceC20053113dB interfaceC20053113dBLIZLLL3 = k.LIZLLL(c1296870jqv, false);
                    int iLIZ3 = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL3 = c13zcLJIIJ.LJJJIL();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ2);
                    if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                        c13zcLJIIJ.LJJIII();
                        if (c13zcLJIIJ.LJJJI) {
                            c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                        } else {
                            c13zcLJIIJ.LJIILJJIL();
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL3, aFwS311S0000000_25);
                        C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL3, aFwS311S0000000_252);
                        if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ3))) {
                            c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ3));
                            c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ3), aFwS311S0000000_253);
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL3, aFwS311S0000000_254);
                        C1668060tVc.LIZLLL(C1669660tYC.Z, null, false, null, function0, c13zcLJIIJ, (i3 << 3) & 57344, 14);
                        c13zcLJIIJ.LJJJJL(true);
                        c13zcLJIIJ.LJJJJL(true);
                    } else {
                        C0MXE.LIZIZ();
                        throw null;
                    }
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
            c20030013YsLJJJJZI.LIZLLL = new C1667350tUT(bitmap, i, f, function0, function02, i2);
        }
    }
}
