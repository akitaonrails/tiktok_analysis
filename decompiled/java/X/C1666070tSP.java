package X;

import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS102S0110000_15;
import kotlin.jvm.internal.AwS129S1100000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;
import tikcast.linkmic.common.AnchorPanelLayoutTypeSetting;

/* JADX INFO: renamed from: X.0tSP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666070tSP {
    public static final C948300ami LIZIZ(C05P1<C948300ami> c05p1) {
        return c05p1.getValue();
    }

    public static final void LIZ(C948300ami c948300ami, boolean z, Function2<? super C948400ams, ? super Integer, Unit> function2, Function2<? super Integer, ? super Integer, Unit> function22, Function0<Unit> function0, Function1<? super Integer, AnchorPanelLayoutTypeSetting> function1, String str, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        C13ZC c13zc;
        boolean z3;
        boolean z4;
        int i12;
        boolean z5;
        boolean z6;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(429997916);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(c948300ami)) {
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
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function22)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        int i13 = i2 & 128;
        if (i13 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i3 |= i11;
        }
        if ((i3 & 4793491) == 4793490 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
            c13zc = c13zcLJIIJ;
        } else {
            if (i13 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C05P0 c05p02 = (C05P0) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            C05P0 c05p0LJIIIIZZ = C20028913Yh.LJIIIIZZ(c948300ami, c13zcLJIIJ);
            C05P0 c05p0LJIIIIZZ2 = C20028913Yh.LJIIIIZZ(function2, c13zcLJIIJ);
            C05P0 c05p0LJIIIIZZ3 = C20028913Yh.LJIIIIZZ(function22, c13zcLJIIJ);
            C05P0 c05p0LJIIIIZZ4 = C20028913Yh.LJIIIIZZ(function1, c13zcLJIIJ);
            InterfaceC1685750ty9 interfaceC1685750ty9LJIJI = c.LJIJI(c.LJ(interfaceC1685750ty92, 1.0f), null, 3);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            int i14 = i3 & 3670016;
            if (i14 == 1048576) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (z2 || objLJJ3 == c1680520tpi) {
                objLJJ3 = new AwS129S1100000_15(c05p0, str, 13);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1685330txT.LIZ(interfaceC1685750ty9LJIJI, (Function1) objLJJ3);
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ);
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
                C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                float f = 16;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIJ = C1682520tsw.LJIIJ(c.LJ(c1685760tyA, 1.0f), f, 0.0f, 2);
                C1296880jqw c1296880jqw = C1668040tVa.LJIIJJI;
                C1679920tok c1679920tok = C1679930tol.LIZ;
                C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(c1679920tok, c1296880jqw, c13zcLJIIJ, 48);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIJ);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    C1687980u1k c1687980u1k = C1687980u1k.LIZ;
                    C1685190txF.LIZ(C497740JfY.LJIJI(2131842393), null, C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), C1670400tZO.LJ(c13zcLJIIJ).LJJIIJ, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2034);
                    C1665790tRx.LIZ(c1687980u1k.LIZ(c1685760tyA, 1.0f, true), c13zcLJIIJ);
                    c13zcLJIIJ.LJJIIJZLJL(938340079);
                    if (C934960aRC.LIZIZ() && z) {
                        c13zcLJIIJ.LJJIIJZLJL(5004770);
                        if ((i3 & 57344) == 16384) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        Object objLJJ4 = c13zcLJIIJ.LJJ();
                        if (z6 || objLJJ4 == c1680520tpi) {
                            objLJJ4 = new AwS559S0100000_15(function0, (Function0<Unit>) 1021);
                            c13zcLJIIJ.LJJIJIIJI(objLJJ4);
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        InterfaceC1685750ty9 interfaceC1685750ty9LIZJ = C634380OuS.LIZJ(c1685760tyA, false, null, (Function0) objLJJ4, 7);
                        C1688120u1y c1688120u1yLIZ2 = C1665750tRt.LIZ(c1679920tok, c1296880jqw, c13zcLJIIJ, 48);
                        int iLIZ3 = C0MXE.LIZ(c13zcLJIIJ);
                        C13D2 c13d2LJJJIL3 = c13zcLJIIJ.LJJJIL();
                        InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZJ);
                        if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                            c13zcLJIIJ.LJJIII();
                            if (c13zcLJIIJ.LJJJI) {
                                c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                            } else {
                                c13zcLJIIJ.LJIILJJIL();
                            }
                            C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ2, aFwS311S0000000_25);
                            C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL3, aFwS311S0000000_252);
                            if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ3))) {
                                c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ3));
                                c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ3), aFwS311S0000000_253);
                            }
                            C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL3, aFwS311S0000000_254);
                            C1685190txF.LIZ(C497740JfY.LJIJI(2131854592), null, C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), C1670400tZO.LJ(c13zcLJIIJ).LJIILJJIL, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2034);
                            c13zcLJIIJ.LJJJJL(true);
                        } else {
                            C0MXE.LIZIZ();
                            throw null;
                        }
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    c13zcLJIIJ.LJJJJL(true);
                    if (z) {
                        c13zcLJIIJ.LJJIIJZLJL(1077233493);
                        InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c.LJIJI(c.LJ(c1685760tyA, 1.0f), null, 3), 0.0f, f, 0.0f, 10, 5);
                        c13zcLJIIJ.LJJIIJZLJL(-1224400529);
                        boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(c05p0LJIIIIZZ) | c13zcLJIIJ.LJJIIJ(c05p0LJIIIIZZ4) | c13zcLJIIJ.LJJIIJ(c05p0LJIIIIZZ2) | c13zcLJIIJ.LJJIIJ(c05p0LJIIIIZZ3);
                        if (i14 == 1048576) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean z7 = zLJJIIJ | z4;
                        Object objLJJ5 = c13zcLJIIJ.LJJ();
                        if (!z7 && objLJJ5 != c1680520tpi) {
                            c13zc = c13zcLJIIJ;
                            i12 = 32;
                        } else {
                            i12 = 32;
                            c13zc = c13zcLJIIJ;
                            objLJJ5 = new C948320amk(c05p0LJIIIIZZ, c05p0LJIIIIZZ4, c05p0LJIIIIZZ2, str, c05p0LJIIIIZZ3, c05p02);
                            c13zc.LJJIJIIJI(objLJJ5);
                        }
                        Function1 function12 = (Function1) objLJJ5;
                        c13zc.LJJJJL(false);
                        c13zc.LJJIIJZLJL(-1633490746);
                        boolean zLJJIIJ2 = c13zc.LJJIIJ(c05p0LJIIIIZZ);
                        if ((i3 & 112) == i12) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        boolean z8 = zLJJIIJ2 | z5;
                        Object objLJJ6 = c13zc.LJJ();
                        if (z8 || objLJJ6 == c1680520tpi) {
                            objLJJ6 = new AwS102S0110000_15(c05p0LJIIIIZZ, z, 6);
                            c13zc.LJJIJIIJI(objLJJ6);
                        }
                        c13zc.LJJJJL(false);
                        C20084413iE.LIZ(48, 0, c13zc, interfaceC1685750ty9LJIIL, function12, (Function1) objLJJ6);
                        c13zc.LJJJJL(false);
                        z3 = true;
                    } else {
                        c13zc = c13zcLJIIJ;
                        c13zc.LJJIIJZLJL(1083273130);
                        InterfaceC1685750ty9 interfaceC1685750ty9LJI = c.LJI(c.LJ(c1685760tyA, 1.0f), 100);
                        InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LJFF, false);
                        int iLIZ4 = C0MXE.LIZ(c13zc);
                        C13D2 c13d2LJJJIL4 = c13zc.LJJJIL();
                        InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL4 = C1685720ty6.LIZLLL(c13zc, interfaceC1685750ty9LJI);
                        if (c13zc.LIZIZ instanceof InterfaceC20032213Zo) {
                            c13zc.LJJIII();
                            if (c13zc.LJJJI) {
                                c13zc.LJJI(aFwS214S0000000_25);
                            } else {
                                c13zc.LJIILJJIL();
                            }
                            C1665930tSB.LIZ(c13zc, interfaceC20053113dBLIZLLL, aFwS311S0000000_25);
                            C1665930tSB.LIZ(c13zc, c13d2LJJJIL4, aFwS311S0000000_252);
                            if (c13zc.LJJJI || !Intrinsics.LJFF(c13zc.LJJ(), Integer.valueOf(iLIZ4))) {
                                c13zc.LJJIJIIJI(Integer.valueOf(iLIZ4));
                                c13zc.LIZIZ(Integer.valueOf(iLIZ4), aFwS311S0000000_253);
                            }
                            C1665930tSB.LIZ(c13zc, interfaceC1685750ty9LIZLLL4, aFwS311S0000000_254);
                            C1668690tWd.LIZIZ(0.0f, 54, 4, c13zc, c.LJIILIIL(c1685760tyA, 48), true);
                            z3 = true;
                            c13zc.LJJJJL(true);
                            c13zc.LJJJJL(false);
                        } else {
                            C0MXE.LIZIZ();
                            throw null;
                        }
                    }
                    c13zc.LJJJJL(z3);
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zc.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C951460aro(c948300ami, z, function2, function22, function0, function1, str, interfaceC1685750ty92, i, i2);
        }
    }
}
