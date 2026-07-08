package X;

import android.content.Context;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS125S1000000_19;
import kotlin.jvm.internal.AwS2S0212000_25;
import kotlin.jvm.internal.AwS32S1201000_19;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS455S0200000_19;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0u4K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689580u4K {
    public static final void LIZIZ(Context context, String str, Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-248949970);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(context)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1668060tVc.LIZ(null, false, 0L, C1670400tZO.LIZIZ(c13zcLJIIJ).I2(), null, C13Z4.LIZJ(-690646395, new AwS455S0200000_19(context, (Context) function0, (Function0<Unit>) 57), c13zcLJIIJ), C13Z4.LIZJ(-1442195548, new AwS125S1000000_19(str, 7), c13zcLJIIJ), null, c13zcLJIIJ, 1769472, 151);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS32S1201000_19(i, context, str, function0, 1);
        }
    }

    public static final void LIZ(C20696015yg c20696015yg, boolean z, InterfaceC1631620sYq<? super InterfaceC1686920u02, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2 = z;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1084608510);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(c20696015yg)) {
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
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631620sYq)) {
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
                z2 = false;
            }
            Iterator<AbstractC20694715yT> it2 = c20696015yg.LIZIZ.iterator();
            while (it2.hasNext()) {
                if (it2.next().LIZ()) {
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
                    C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                    float f = 8;
                    InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c1685760tyA, f, 0.0f, f, 0.0f, 10);
                    InterfaceC1668050tVb.LIZ.getClass();
                    InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
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
                        C1680030tov c1680030tov = C1679930tol.LIZJ;
                        C1296860jqu c1296860jqu = C1668040tVa.LJIILIIL;
                        C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, c1296860jqu, c13zcLJIIJ, 0);
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
                            C1687990u1l c1687990u1l = C1687990u1l.LIZ;
                            c13zcLJIIJ.LJJIIJZLJL(-1608792953);
                            if (c20696015yg.LIZ.length() > 0) {
                                String str = c20696015yg.LIZ;
                                boolean z3 = c20696015yg.LJ;
                                c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                                boolean zLJII = c13zcLJIIJ.LJII(c20696015yg);
                                Object objLJJ2 = c13zcLJIIJ.LJJ();
                                if (zLJII || objLJJ2 == c1680520tpi) {
                                    objLJJ2 = new AwS426S0200000_25(c20696015yg, (C20696015yg) c05p0, (C05P0<Boolean>) 194);
                                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                                }
                                c13zcLJIIJ.LJJJJL(false);
                                C1688900u3E.LIZJ(str, true, z3, z2, (Function0) objLJJ2, c13zcLJIIJ, ((i3 << 6) & 7168) | 48, 0);
                            }
                            c13zcLJIIJ.LJJJJL(false);
                            float f2 = 6;
                            InterfaceC1685750ty9 interfaceC1685750ty9LJIIL2 = C1682520tsw.LJIIL(C1675980tiO.LIZIZ(c1685760tyA, C1670400tZO.LIZIZ(c13zcLJIIJ).J2(), C1669050tXD.LIZIZ(f)), 0.0f, f2, 0.0f, f2, 5);
                            int i8 = (i3 << 3) & 7168;
                            int i9 = i8 >> 3;
                            C1688130u1z c1688130u1zLIZ2 = C1665740tRs.LIZ(c1680030tov, c1296860jqu, c13zcLJIIJ, (i9 & 112) | (i9 & 14));
                            int iLIZ3 = C0MXE.LIZ(c13zcLJIIJ);
                            C13D2 c13d2LJJJIL3 = c13zcLJIIJ.LJJJIL();
                            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIL2);
                            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                                c13zcLJIIJ.LJJIII();
                                if (c13zcLJIIJ.LJJJI) {
                                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                                } else {
                                    c13zcLJIIJ.LJIILJJIL();
                                }
                                C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ2, aFwS311S0000000_25);
                                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL3, aFwS311S0000000_252);
                                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ3))) {
                                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ3));
                                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ3), aFwS311S0000000_253);
                                }
                                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL3, aFwS311S0000000_254);
                                interfaceC1631620sYq.invoke(c1687990u1l, c13zcLJIIJ, Integer.valueOf(((i8 >> 6) & 112) | 6));
                                c13zcLJIIJ.LJJJJL(true);
                                c13zcLJIIJ.LJJJJL(true);
                                c13zcLJIIJ.LJJJJL(true);
                                if (((Boolean) c05p0.getValue()).booleanValue()) {
                                    String str2 = c20696015yg.LIZLLL;
                                    c13zcLJIIJ.LJJIIJZLJL(5004770);
                                    Object objLJJ3 = c13zcLJIIJ.LJJ();
                                    if (objLJJ3 == c1680520tpi) {
                                        objLJJ3 = new AwS553S0100000_9(c05p0, (C05P0<Boolean>) 1841);
                                        c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                                    }
                                    c13zcLJIIJ.LJJJJL(false);
                                    C1668330tW3.LJI((Function0) objLJJ3, false, null, false, null, null, str2, null, null, C13Z4.LIZJ(-1319020127, new AwS623S0100000_9(c05p0, (C05P0<Boolean>) 227), c13zcLJIIJ), null, c13zcLJIIJ, 805309446, 0, 1462);
                                }
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
            }
            C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
            if (c20030013YsLJJJJZI != null) {
                c20030013YsLJJJJZI.LIZLLL = new AwS2S0212000_25(c20696015yg, (C20696015yg) z2, (boolean) interfaceC1631620sYq, (InterfaceC1631620sYq<? super InterfaceC1686920u02, ? super InterfaceC1680500tpg, ? super Integer, Unit>) i, i2, 2);
                return;
            }
            return;
        }
        C20030013Ys c20030013YsLJJJJZI2 = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI2 != null) {
            c20030013YsLJJJJZI2.LIZLLL = new AwS2S0212000_25(c20696015yg, (C20696015yg) z2, (boolean) interfaceC1631620sYq, (InterfaceC1631620sYq<? super InterfaceC1686920u02, ? super InterfaceC1680500tpg, ? super Integer, Unit>) i, i2, 3);
        }
    }
}
