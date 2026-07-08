package X;

import androidx.compose.foundation.layout.c;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS11S0211000_25;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS19S1001000_25;
import kotlin.jvm.internal.AwS1S0312000_25;
import kotlin.jvm.internal.AwS211S0300000_2;
import kotlin.jvm.internal.AwS22S0202000_25;
import kotlin.jvm.internal.AwS2S0601000_25;
import kotlin.jvm.internal.AwS302S0300000_25;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS3S1302000_25;
import kotlin.jvm.internal.AwS5S0302000_9;
import kotlin.jvm.internal.AwS76S0210000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tSb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666190tSb {
    public static final long LJIJ(InterfaceC1680500tpg interfaceC1680500tpg) {
        interfaceC1680500tpg.LJJIIJZLJL(1371018958);
        long jK3 = C1670400tZO.LIZIZ(interfaceC1680500tpg).K3();
        interfaceC1680500tpg.LJ();
        return jK3;
    }

    public static final void LIZJ(int i, InterfaceC1680500tpg interfaceC1680500tpg, String str) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-870249183);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
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
            C1685190txF.LIZ(str, null, C1670400tZO.LIZIZ(c13zcLJIIJ).N3(), C1670400tZO.LJ(c13zcLJIIJ).LJIILIIL, 0L, 0, 0, false, 1, null, null, c13zcLJIIJ, (i2 & 14) | 100663296, 0, 1778);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS19S1001000_25(str, i, 8);
        }
    }

    public static final void LIZLLL(int i, InterfaceC1680500tpg interfaceC1680500tpg, String str) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-680178712);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
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
            InterfaceC1668050tVb.LIZ.getClass();
            C1296870jqv c1296870jqv = C1668040tVa.LJFF;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIILIIL = c.LJIILIIL(C1675980tiO.LIZIZ(InterfaceC1685750ty9.LIZ, C1670400tZO.LIZIZ(c13zcLJIIJ).S2(), C1669050tXD.LIZ), 18);
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(c1296870jqv, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIILIIL);
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
                C1685190txF.LIZ(str, null, C1670400tZO.LIZIZ(c13zcLJIIJ).o3(), C1670400tZO.LJ(c13zcLJIIJ).LJIL, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, i2 & 14, 0, 2034);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS19S1001000_25(str, i, 9);
        }
    }

    public static final void LJIIIZ(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-166904638);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
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
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(interfaceC1685750ty9, C1670400tZO.LIZIZ(c13zcLJIIJ).U2(), C1669050tXD.LIZIZ(4));
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
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
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1685190txF.LIZ(C0MBB.LIZIZ(2131821853, c13zcLJIIJ), C1672220tcK.LIZ.LIZIZ(InterfaceC1685750ty9.LIZ, C1668040tVa.LJFF), C1670400tZO.LIZIZ(c13zcLJIIJ).N3(), C1670400tZO.LJ(c13zcLJIIJ).LJIJI, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2032);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(interfaceC1685750ty9, i, 55);
        }
    }

    public static final void LJIIJ(InterfaceC1665870tS5 interfaceC1665870tS5, float f, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1970207540);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1665870tS5)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIJ(f)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(InterfaceC1685750ty9.LIZ, C1685850tyJ.LIZIZ(1207932160), C1669430tXp.LIZ);
            InterfaceC1668050tVb.LIZ.getClass();
            k.LIZ(c.LJ(c.LJI(interfaceC1665870tS5.LIZIZ(interfaceC1685750ty9LIZIZ, C1668040tVa.LJI), 56), 1.0f - f), c13zcLJIIJ, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1666220tSe(interfaceC1665870tS5, f, i);
        }
    }

    public static final void LJIIZILJ(InterfaceC1665870tS5 interfaceC1665870tS5, final Function1<? super Float, Unit> function1, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-721951923);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1665870tS5)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            final InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(Float.valueOf(0.0f));
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            final C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = interfaceC1665870tS5.LIZ(InterfaceC1685750ty9.LIZ);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(interfaceC1690500u5o);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS368S0200000_2(interfaceC1690500u5o, (InterfaceC1690500u5o) c05p0, (C05P0<C1668650tWZ>) 112);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ2 = C1685330txT.LIZ(interfaceC1685750ty9LIZ, (Function1) objLJJ2);
            c13zcLJIIJ.LJJIIJZLJL(-1746271574);
            boolean zLJJIIJ2 = c13zcLJIIJ.LJJIIJ(interfaceC1690500u5o);
            if ((i2 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = z | zLJJIIJ2;
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (z2 || objLJJ3 == c1680520tpi) {
                objLJJ3 = new PointerInputEventHandler() { // from class: X.05Vb
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                        Object objLJ = C2296808zG.LJ(new C05U3(interfaceC1369205Xm, new AwS211S0300000_2(interfaceC1690500u5o, (InterfaceC1690500u5o) function1, (Function1<? super Float, Unit>) c05p0, (C05P0<Float>) 17), null), interfaceC1364105Vn);
                        if (objLJ != C099R.LJFF()) {
                            objLJ = Unit.LIZ;
                        }
                        if (objLJ == C099R.LJFF()) {
                            return objLJ;
                        }
                        return Unit.LIZ;
                    }
                };
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            k.LIZ(C1679720toQ.LIZ(interfaceC1685750ty9LIZ2, function1, (PointerInputEventHandler) objLJJ3), c13zcLJIIJ, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(interfaceC1665870tS5, (InterfaceC1665870tS5) function1, (Function1<? super Float, Unit>) i, 85);
        }
    }

    public static final void LJIILJJIL(C1665120tQs c1665120tQs, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        boolean zLJII;
        int i4;
        int i5;
        boolean z;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1579556347);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(c1665120tQs);
            } else {
                zLJII = c13zcLJIIJ.LJII(c1665120tQs);
            }
            if (zLJII) {
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
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
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
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty92);
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
                String str = c1665120tQs.LIZ;
                long jN3 = C1670400tZO.LIZIZ(c13zcLJIIJ).N3();
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                C1296870jqv c1296870jqv = C1668040tVa.LJ;
                LJIIJJI(str, jN3, c1672220tcK.LIZIZ(c1685760tyA, c1296870jqv), c13zcLJIIJ, 0, 0);
                LJIIJJI(c1665120tQs.LIZIZ, C1670400tZO.LIZIZ(c13zcLJIIJ).N3(), c1672220tcK.LIZIZ(c1685760tyA, C1668040tVa.LJI), c13zcLJIIJ, 0, 0);
                InterfaceC1665140tQu interfaceC1665140tQu = c1665120tQs.LIZJ;
                c13zcLJIIJ.LJJIIJZLJL(-171091231);
                if (interfaceC1665140tQu instanceof C1665060tQm) {
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = c1672220tcK.LIZIZ(c1685760tyA, c1296870jqv);
                    C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LIZ, C1668040tVa.LJIIJ, c13zcLJIIJ, 0);
                    int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZIZ);
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
                        C1665060tQm c1665060tQm = (C1665060tQm) interfaceC1665140tQu;
                        C1665790tRx.LIZ(c.LJ(c1685760tyA, c1665060tQm.LIZIZ), c13zcLJIIJ);
                        z = true;
                        LJIIJJI(c1665060tQm.LIZ, LJIJ(c13zcLJIIJ), c1685760tyA, c13zcLJIIJ, 384, 0);
                        c13zcLJIIJ.LJJJJL(true);
                    } else {
                        C0MXE.LIZIZ();
                        throw null;
                    }
                } else {
                    z = true;
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJJJL(z);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS22S0202000_25(c1665120tQs, interfaceC1685750ty92, i, i2, 11);
        }
    }

    public static final void LJIILLIIL(InterfaceC1665870tS5 interfaceC1665870tS5, C19457311Al c19457311Al, boolean z, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z2;
        int i3;
        boolean zLJII;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1579231467);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1665870tS5)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(c19457311Al);
            } else {
                zLJII = c13zcLJIIJ.LJII(c19457311Al);
            }
            if (zLJII) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = AFwS266S0000000_25.get$arr$(465);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            Function1 function1 = (Function1) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LJI = c.LJI(c.LJ(InterfaceC1685750ty9.LIZ, 1.0f), 56);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = interfaceC1665870tS5.LIZIZ(interfaceC1685750ty9LJI, C1668040tVa.LJFF);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = AFwS266S0000000_25.get$arr$(466);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            Function1 function12 = (Function1) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(-1746271574);
            boolean z3 = true;
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && c13zcLJIIJ.LJII(c19457311Al))) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zLJII2 = z2 | c13zcLJIIJ.LJII(lifecycleOwner);
            if ((i2 & 896) != 256) {
                z3 = false;
            }
            boolean z4 = zLJII2 | z3;
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (z4 || objLJJ3 == c1680520tpi) {
                objLJJ3 = new AwS76S0210000_25(c19457311Al, lifecycleOwner, z, 2);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            C20084413iE.LIZIZ(function1, interfaceC1685750ty9LIZIZ, null, function12, (Function1) objLJJ3, c13zcLJIIJ, 3078, 4);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS11S0211000_25(interfaceC1665870tS5, c19457311Al, z, i, 7);
        }
    }

    public static final void LIZIZ(String str, String str2, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1710357496);
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
            if (c13zcLJIIJ.LJJIIJ(str2)) {
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
            C1666950tTp c1666950tTpLJI = C1679930tol.LJI(8);
            InterfaceC1668050tVb.LIZ.getClass();
            int i8 = (((i3 >> 6) & 14) | 48) >> 3;
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(c1666950tTpLJI, C1668040tVa.LJIIJ, c13zcLJIIJ, (i8 & 112) | (i8 & 14));
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty92);
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
                LIZLLL(i3 & 14, c13zcLJIIJ, str);
                LIZJ((i3 >> 3) & 14, c13zcLJIIJ, str2);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1666230tSf(str, str2, interfaceC1685750ty92, i, i2);
        }
    }

    public static final void LJ(Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1685750ty9 interfaceC1685750ty9, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1727820030);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
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
            if (c13zcLJIIJ.LJII(function22)) {
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
            float f = 12;
            float f2 = 0;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(C1667200tUE.LIZ(c.LJ(interfaceC1685750ty92, 1.0f), C1669050tXD.LIZJ(f, f, f2, f2)), ((C1685910tyP) ((C13FE) C1670400tZO.LIZIZ(c13zcLJIIJ).R3).getValue()).LIZ, C1669430tXp.LIZ);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
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
                InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(InterfaceC1685750ty9.LIZ, 1.0f);
                C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJ);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    function2.invoke(c13zcLJIIJ, Integer.valueOf(i3 & 14));
                    function22.invoke(c13zcLJIIJ, Integer.valueOf((i3 >> 6) & 14));
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
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS5S0302000_9((Function2) function2, (Function2<? super InterfaceC1680500tpg, ? super Integer, Unit>) interfaceC1685750ty92, (InterfaceC1685750ty9) function22, (Function2<? super InterfaceC1680500tpg, ? super Integer, Unit>) i, i2, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(X.C1668880tWw r18, kotlin.jvm.functions.Function0<kotlin.Unit> r19, java.lang.String r20, X.InterfaceC1680500tpg r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1666190tSb.LJFF(X.0tWw, kotlin.jvm.functions.Function0, java.lang.String, X.0tpg, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJII(X.C1665110tQr r21, X.InterfaceC1685750ty9 r22, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r23, kotlin.jvm.functions.Function0<kotlin.Unit> r24, X.InterfaceC1680500tpg r25, int r26) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1666190tSb.LJII(X.0tQr, X.0ty9, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, X.0tpg, int):void");
    }

    public static final void LJIIJJI(String str, long j, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1257990895);
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
            C1685190txF.LIZ(str, interfaceC1685750ty92, j, C1670400tZO.LJ(c13zcLJIIJ).LJJIFFI, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 0, 2032);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1666240tSg(str, j, interfaceC1685750ty92, i, i2);
        }
    }

    public static final void LJIIL(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, String str, Function0 function0) {
        int i3;
        int i4;
        int i5;
        int i6;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-495583144);
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
            C1673400teE.LIZJ(function0, str, c.LJIIIIZZ(interfaceC1685750ty92, 44, 0.0f, 2), false, 0L, false, null, C1669660tYC.LLLLLLIL, null, C1666920tTm.LIZ(0.0f, null, 0.0f, c13zcLJIIJ, 0, 15), C1666340tSq.LIZ(LJIJ(c13zcLJIIJ), C1685850tyJ.LIZIZ(704643071), 0.0f, LJIJ(c13zcLJIIJ), c13zcLJIIJ, 48, 12), null, false, c13zcLJIIJ, ((i3 >> 6) & 14) | ((i3 << 3) & 112), 0, 6520);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C633740OtQ(i, i2, interfaceC1685750ty92, str, function0);
        }
    }

    public static final void LIZ(String str, String str2, InterfaceC1685750ty9 interfaceC1685750ty9, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(337393423);
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
            if (c13zcLJIIJ.LJJIIJ(str2)) {
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
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i8 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            int i9 = ((i3 >> 6) & 14) >> 3;
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, c13zcLJIIJ, (i9 & 112) | (i9 & 14));
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty92);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                LIZIZ(str, str2, null, c13zcLJIIJ, (i3 & 14) | (i3 & 112), 4);
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                float f = 12;
                C1665790tRx.LIZ(c.LJI(c1685760tyA, f), c13zcLJIIJ);
                function2.invoke(c13zcLJIIJ, Integer.valueOf((i3 >> 9) & 14));
                C1665790tRx.LIZ(c.LJI(c1685760tyA, f), c13zcLJIIJ);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1666180tSa(str, str2, interfaceC1685750ty92, function2, i, i2);
        }
    }

    public static final void LJIIIIZZ(String str, Function0<Unit> function0, Function0<Unit> function02, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1906196810);
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
            if (c13zcLJIIJ.LJII(function0)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i8 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            InterfaceC1668050tVb.LIZ.getClass();
            int i9 = (((i3 >> 9) & 14) | 432) >> 3;
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LJI, C1668040tVa.LJIIJJI, c13zcLJIIJ, (i9 & 112) | (i9 & 14));
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty92);
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
                LJFF(C1669660tYC.Z, function0, null, c13zcLJIIJ, i3 & 112, 4);
                C1685190txF.LIZ(str, null, LJIJ(c13zcLJIIJ), C1670400tZO.LJ(c13zcLJIIJ).LJIIIZ, 0L, 0, 0, false, 1, null, null, c13zcLJIIJ, (i3 & 14) | 100663296, 0, 1778);
                LJFF(C1669660tYC.H, function02, null, c13zcLJIIJ, (i3 >> 3) & 112, 4);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS3S1302000_25(str, (String) function0, function02, (Function0<Unit>) interfaceC1685750ty92, (InterfaceC1685750ty9) i, i2, 5);
        }
    }

    public static final void LJIILIIL(C1665120tQs c1665120tQs, boolean z, InterfaceC1685750ty9 interfaceC1685750ty9, Function1<? super Float, Unit> function1, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        boolean zLJII;
        int i4;
        int i5;
        int i6;
        int i7;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-616429798);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(c1665120tQs);
            } else {
                zLJII = c13zcLJIIJ.LJII(c1665120tQs);
            }
            if (zLJII) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
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
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i8 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            int i9 = i3 >> 6;
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty92);
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
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
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
                    C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    LJIILJJIL(c1665120tQs, c.LJ(c1685760tyA, 1.0f), c13zcLJIIJ, (i3 & 14) | 56, 0);
                    InterfaceC1665140tQu interfaceC1665140tQu = c1665120tQs.LIZJ;
                    if (Intrinsics.LJFF(interfaceC1665140tQu, C1665170tQx.LIZ)) {
                        c13zcLJIIJ.LJJIIJZLJL(1362982181);
                        LJIIIZ(c.LJI(c.LJ(c1685760tyA, 1.0f), 64), c13zcLJIIJ, 6);
                        c13zcLJIIJ.LJJJJL(false);
                    } else if (interfaceC1665140tQu instanceof C1665060tQm) {
                        c13zcLJIIJ.LJJIIJZLJL(1363230398);
                        C1665060tQm c1665060tQm = (C1665060tQm) interfaceC1665140tQu;
                        z2 = z2;
                        LJIILL(c1665060tQm.LIZIZ, function1, c1665060tQm.LIZJ, z2, c.LJ(c1685760tyA, 1.0f), c13zcLJIIJ, (i9 & 112) | 24576 | 512 | ((i3 << 6) & 7168), 0);
                        c13zcLJIIJ.LJJJJL(false);
                    } else {
                        c13zcLJIIJ.LJJIIJZLJL(2122174816);
                        c13zcLJIIJ.LJJJJL(false);
                        throw new C1954807lC();
                    }
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
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS1S0312000_25(c1665120tQs, (C1665120tQs) z2, (boolean) interfaceC1685750ty92, (InterfaceC1685750ty9) function1, (Function1<? super Float, Unit>) i, i2, 4);
        }
    }

    public static final void LJI(C1665110tQr c1665110tQr, InterfaceC1685750ty9 interfaceC1685750ty9, Function1<? super Float, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean zLJII;
        int i8;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-572324168);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(c1665110tQr);
            } else {
                zLJII = c13zcLJIIJ.LJII(c1665110tQr);
            }
            if (zLJII) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i5 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(function03)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((74899 & i2) == 74898 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            LJ(C13Z4.LIZJ(323404093, new AwS302S0300000_25(c1665110tQr, (C1665110tQr) function03, function02, (Function0<Unit>) 11), c13zcLJIIJ), interfaceC1685750ty9, C13Z4.LIZJ(929178875, new AwS302S0300000_25(c1665110tQr, (C1665110tQr) function1, (Function1<? super Float, Unit>) function0, (Function0<Unit>) 12), c13zcLJIIJ), c13zcLJIIJ, (i2 & 112) | 390, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS2S0601000_25(c1665110tQr, (C1665110tQr) interfaceC1685750ty9, (InterfaceC1685750ty9) function1, (Function1<? super Float, Unit>) function0, function02, function03, (Function0<Unit>) i, 6);
        }
    }

    public static final void LJIILL(float f, Function1<? super Float, Unit> function1, C19457311Al c19457311Al, boolean z, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean zLJII;
        int i6;
        int i7;
        int i8;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1023140504);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIJ(f)) {
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
            if (c13zcLJIIJ.LJII(function1)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(c19457311Al);
            } else {
                zLJII = c13zcLJIIJ.LJII(c19457311Al);
            }
            if (zLJII) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
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
            int i10 = (i3 >> 12) & 14;
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty92);
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
                C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                int i11 = (((i10 >> 6) & 112) | 6) & 14;
                LJIIZILJ(c1672220tcK, function1, c13zcLJIIJ, (i3 & 112) | i11);
                int i12 = i3 >> 3;
                LJIILLIIL(c1672220tcK, c19457311Al, z, c13zcLJIIJ, i11 | 64 | (i12 & 112) | (i12 & 896));
                LJIIJ(c1672220tcK, f, c13zcLJIIJ, ((i3 << 3) & 112) | i11);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1666210tSd(f, function1, c19457311Al, z, interfaceC1685750ty92, i, i2);
        }
    }
}
