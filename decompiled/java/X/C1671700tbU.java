package X;

import androidx.compose.foundation.layout.c;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import h0.n2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS8S0200001_2;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tbU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671700tbU {
    public static final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, final C1377105aD c1377105aD, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        Throwable th;
        C1677480tko c1677480tko;
        C1677480tko c1677480tko2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1871438450);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1377105aD)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C1677470tkn.LIZ(1.0f);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            final C1677480tko c1677480tko3 = (C1677480tko) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C1677470tkn.LIZ(1.0f);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            final C1677480tko c1677480tko4 = (C1677480tko) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = new C1677480tko(new C1378605aS(0L), n2.LJFF, null, 12);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            final C1677480tko c1677480tko5 = (C1677480tko) objLJJ3;
            c13zcLJIIJ.LJJJJL(false);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (objLJJ4 == c1680520tpi) {
                objLJJ4 = C1680540tpk.LJIIIIZZ(C23271099x.INSTANCE, c13zcLJIIJ);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            final InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) objLJJ4;
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ5 = c13zcLJIIJ.LJJ();
            if (objLJJ5 == c1680520tpi) {
                objLJJ5 = C20028913Yh.LJI(null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ5);
            }
            final C05P0 c05p0 = (C05P0) objLJJ5;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ6 = c13zcLJIIJ.LJJ();
            if (objLJJ6 == c1680520tpi) {
                objLJJ6 = C20028913Yh.LJI(null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ6);
            }
            final C05P0 c05p02 = (C05P0) objLJJ6;
            c13zcLJIIJ.LJJJJL(false);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            int i5 = i2 & 112;
            if (i5 == 32) {
                z = true;
            } else {
                z = false;
            }
            boolean zLJII = z | c13zcLJIIJ.LJII(c1677480tko4) | c13zcLJIIJ.LJII(c1677480tko5) | c13zcLJIIJ.LJII(interfaceC497601wk) | c13zcLJIIJ.LJII(c1677480tko3);
            Object objLJJ7 = c13zcLJIIJ.LJJ();
            if (!zLJII && objLJJ7 != c1680520tpi) {
                c1677480tko = c1677480tko4;
                c1677480tko2 = c1677480tko5;
                th = null;
                z2 = false;
            } else {
                th = null;
                c1677480tko = c1677480tko4;
                c1677480tko2 = c1677480tko5;
                z2 = false;
                objLJJ7 = new PointerInputEventHandler() { // from class: X.05Ts
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                        Object objLIZIZ = C1363905Vl.LIZIZ(interfaceC1369205Xm, new C1359005To(c05p0, c05p02, c1377105aD, c1677480tko4, c1677480tko5, interfaceC497601wk, c1677480tko3, null), interfaceC1364105Vn);
                        if (objLIZIZ == C099R.LJFF()) {
                            return objLIZIZ;
                        }
                        return Unit.LIZ;
                    }
                };
                c13zcLJIIJ.LJJIJIIJI(objLJJ7);
            }
            c13zcLJIIJ.LJJJJL(z2);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1679720toQ.LIZ(c1685760tyA, c1377105aD, (PointerInputEventHandler) objLJJ7);
            long jF2 = C1670400tZO.LIZIZ(c13zcLJIIJ).F2();
            float fLJJJJLL = ((InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII)).LJJJJLL(32.0f);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            if (i5 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object objLJJ8 = c13zcLJIIJ.LJJ();
            if (z3 || objLJJ8 == c1680520tpi) {
                objLJJ8 = new PointerInputEventHandler() { // from class: X.05Zj
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                        Object objLIZIZ = C1363905Vl.LIZIZ(interfaceC1369205Xm, new C1373805Zg(false, new C1770206wW(c1377105aD, 4), null), interfaceC1364105Vn);
                        if (objLIZIZ != C099R.LJFF()) {
                            objLIZIZ = Unit.LIZ;
                        }
                        if (objLIZIZ == C099R.LJFF()) {
                            return objLIZIZ;
                        }
                        return Unit.LIZ;
                    }
                };
                c13zcLJIIJ.LJJIJIIJI(objLJJ8);
            }
            c13zcLJIIJ.LJJJJL(z2);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ2 = C1679720toQ.LIZ(c1685760tyA, c1377105aD, (PointerInputEventHandler) objLJJ8);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ9 = c13zcLJIIJ.LJJ();
            if (objLJJ9 == c1680520tpi) {
                objLJJ9 = C1691250u71.LIZ(1.0f);
                c13zcLJIIJ.LJJIJIIJI(objLJJ9);
            }
            C05ZL c05zl = (C05ZL) objLJJ9;
            c13zcLJIIJ.LJJJJL(z2);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ3 = interfaceC1685750ty9.LIZ(interfaceC1685750ty9LIZ).LIZ(interfaceC1685750ty9LIZ2);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, z2);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ3);
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
                c13zcLJIIJ.LJJIIJZLJL(-1984546386);
                if (c1377105aD.LIZ != null) {
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1667200tUE.LIZIZ(c.LIZJ);
                    c13zcLJIIJ.LJJIIJZLJL(-1746271574);
                    if (i5 == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean zLJIJ = z5 | c13zcLJIIJ.LJIJ(fLJJJJLL);
                    Object objLJJ10 = c13zcLJIIJ.LJJ();
                    if (zLJIJ || objLJJ10 == c1680520tpi) {
                        objLJJ10 = new AwS8S0200001_2(c1377105aD, fLJJJJLL, c05zl, 1);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ10);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZ4 = C1674000tfC.LIZ(interfaceC1685750ty9LIZIZ, (Function1) objLJJ10);
                    c13zcLJIIJ.LJJIIJZLJL(-1224400529);
                    if (i5 == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean zLJII2 = z6 | c13zcLJIIJ.LJII(c1677480tko) | c13zcLJIIJ.LJII(c1677480tko2) | c13zcLJIIJ.LJIJJ(jF2) | c13zcLJIIJ.LJII(c1677480tko3);
                    Object objLJJ11 = c13zcLJIIJ.LJJ();
                    if (zLJII2 || objLJJ11 == c1680520tpi) {
                        objLJJ11 = new C1675830ti9(c1377105aD, c05p02, c1677480tko, c1677480tko2, jF2, c1677480tko3);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ11);
                    }
                    z4 = false;
                    c13zcLJIIJ.LJJJJL(false);
                    C1668170tVn.LIZ(interfaceC1685750ty9LIZ4, (Function1) objLJJ11, c13zcLJIIJ, 0);
                } else {
                    z4 = false;
                }
                c13zcLJIIJ.LJJJJL(z4);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw th;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(interfaceC1685750ty9, c1377105aD, i, 83);
        }
    }
}
