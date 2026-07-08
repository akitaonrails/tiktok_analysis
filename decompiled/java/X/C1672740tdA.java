package X;

import Y.AObjectS0S0440001_25;
import Y.AObjectS108S0101000_25;
import Y.AObjectS1S0212000_25;
import Y.AObjectS368S0100000_25;
import Y.AObjectS399S0100000_25;
import Y.AObjectS533S0100000_25;
import androidx.compose.foundation.layout.c;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tdA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1672740tdA {
    public static final float LIZ = 36;
    public static final float LIZIZ = 16;
    public static final float LIZJ = 24;
    public static final float LIZLLL = 28;
    public static final float LJ = 20;
    public static final float LJFF;
    public static final float LJI;

    static {
        float f = 40;
        LJFF = f;
        LJI = f;
    }

    public static final void LIZLLL(Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1811374102);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
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
            k.LIZ(C634380OuS.LIZJ(c.LIZLLL(InterfaceC1685750ty9.LIZ), false, null, function0, 7), c13zcLJIIJ, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AObjectS108S0101000_25(i, function0, 0);
        }
    }

    public static final void LIZIZ(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, Function2 function2, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1431996545);
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
            if (c13zcLJIIJ.LJII(function2)) {
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
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIIIZZ = C1682520tsw.LJIIIIZZ(c.LJ(interfaceC1685750ty92, 1.0f), LIZIZ);
            if (!z) {
                final EnumC1685670ty1 enumC1685670ty1 = EnumC1685670ty1.Floating;
                final float f = LIZ;
                interfaceC1685750ty9LJIIIIZZ = C1685720ty6.LIZIZ(interfaceC1685750ty9LJIIIIZZ, new InterfaceC1631620sYq<InterfaceC1685750ty9, InterfaceC1680500tpg, Integer, InterfaceC1685750ty9>() { // from class: X.0txz
                    /* JADX WARN: Removed duplicated region for block: B:16:0x01b3  */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x0211  */
                    @Override // X.InterfaceC1631620sYq
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final X.InterfaceC1685750ty9 invoke(X.InterfaceC1685750ty9 r10, X.InterfaceC1680500tpg r11, java.lang.Integer r12) {
                        /*
                            Method dump skipped, instruction units count: 582
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1685650txz.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                });
            }
            C1669040tXC c1669040tXC = new C1669040tXC(LIZ);
            C1668270tVx.LIZ(interfaceC1685750ty9LJIIIIZZ, new C1669150tXN(c1669040tXC, c1669040tXC, c1669040tXC, c1669040tXC), C1670400tZO.LIZIZ(c13zcLJIIJ).G3(), null, 0.0f, function2, c13zcLJIIJ, (i3 << 9) & 458752, 24);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AObjectS1S0212000_25(i, i2, interfaceC1685750ty92, function2, z, 0);
        }
    }

    public static final void LIZ(final Function1<? super Boolean, Unit> function1, final boolean z, final float f, final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22, InterfaceC1680500tpg interfaceC1680500tpg, final int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1471704090);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIJ(f)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i4 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function22)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) == 9362 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1689390u41 c1689390u41LIZIZ = C1689370u3z.LIZIZ(c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C1696870uG5.LIZ(0);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            final InterfaceC1676320tiw interfaceC1676320tiw = (InterfaceC1676320tiw) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII);
            float f2 = LJFF;
            final int iLJLLJ = interfaceC1690500u5o.LJLLJ(f2);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1296870jqv c1296870jqv = C1668040tVa.LIZIZ;
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(c1296870jqv, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, c1685760tyA);
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
                    InterfaceC1685750ty9 interfaceC1685750ty9LJIIIIZZ = c.LJIIIIZZ(C1687990u1l.LIZ.LIZ(c1685760tyA, 1.0f, false), 0.0f, f, 1);
                    c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                    boolean zLJIJI = c13zcLJIIJ.LJIJI(iLJLLJ);
                    Object objLJJ2 = c13zcLJIIJ.LJJ();
                    if (zLJIJI || objLJJ2 == c1680520tpi) {
                        objLJJ2 = new Function1() { // from class: X.0tdE
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                interfaceC1676320tiw.LJIIJ(((int) (((InterfaceC1692950u9l) obj).LIZ() & 4294967295L)) - iLJLLJ);
                                return Unit.LIZ;
                            }
                        };
                        c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = C1689370u3z.LIZLLL(C1685330txT.LIZ(interfaceC1685750ty9LJIIIIZZ, (Function1) objLJJ2), c1689390u41LIZIZ, false, 14);
                    InterfaceC20053113dB interfaceC20053113dBLIZLLL2 = k.LIZLLL(c1296870jqv, false);
                    int iLIZ3 = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL3 = c13zcLJIIJ.LJJJIL();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL4 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZLLL3);
                    if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                        c13zcLJIIJ.LJJIII();
                        if (c13zcLJIIJ.LJJJI) {
                            c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                        } else {
                            c13zcLJIIJ.LJIILJJIL();
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL2, aFwS311S0000000_25);
                        C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL3, aFwS311S0000000_252);
                        if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ3))) {
                            c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ3));
                            c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ3), aFwS311S0000000_253);
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL4, aFwS311S0000000_254);
                        function22.invoke(c13zcLJIIJ, Integer.valueOf((i2 >> 12) & 14));
                        c13zcLJIIJ.LJJJJL(true);
                        c13zcLJIIJ.LJJIIJZLJL(1042062009);
                        if (c1689390u41LIZIZ.LJI() != 0) {
                            C1665790tRx.LIZ(C1675980tiO.LIZIZ(c.LJI(c.LJ(c1685760tyA, 1.0f), (float) 0.5d), C1670400tZO.LIZIZ(c13zcLJIIJ).T2(), C1669430tXp.LIZ), c13zcLJIIJ);
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        c13zcLJIIJ.LJJIIJZLJL(1042071562);
                        if (function2 != null) {
                            function2.invoke(c13zcLJIIJ, Integer.valueOf((i2 >> 9) & 14));
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        c13zcLJIIJ.LJJJJL(true);
                        int iLIZLLL = interfaceC1676320tiw.LIZLLL();
                        InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c1685760tyA, 0.0f, f2, 0.0f, 0.0f, 13);
                        C1296870jqv c1296870jqv2 = C1668040tVa.LIZLLL;
                        boolean z3 = false;
                        C1673000tda.LIZ(c1689390u41LIZIZ, iLIZLLL, c1672220tcK.LIZIZ(interfaceC1685750ty9LJIIL, c1296870jqv2), c13zcLJIIJ, 0, 0);
                        c13zcLJIIJ.LJJIIJZLJL(70094209);
                        if (z) {
                            C1668880tWw c1668880tWw = C1670400tZO.LIZLLL(c13zcLJIIJ).LJIJI;
                            c13zcLJIIJ.LJJIIJZLJL(5004770);
                            if ((i2 & 14) == 4) {
                                z3 = true;
                            }
                            Object objLJJ3 = c13zcLJIIJ.LJJ();
                            if (z3 || objLJJ3 == c1680520tpi) {
                                objLJJ3 = new AObjectS399S0100000_25(function1, 27);
                                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                            }
                            c13zcLJIIJ.LJJJJL(false);
                            InterfaceC1685750ty9 interfaceC1685750ty9LIZJ = C634380OuS.LIZJ(c1685760tyA, false, null, (Function0) objLJJ3, 7);
                            float f3 = LIZJ;
                            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(C1682520tsw.LJIIL(interfaceC1685750ty9LIZJ, 0.0f, f3, f3, 0.0f, 9), C1670400tZO.LIZIZ(c13zcLJIIJ).U2(), C1669050tXD.LIZ);
                            float f4 = LIZLLL;
                            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ2 = c1672220tcK.LIZIZ(c.LJI(c.LJIILLIIL(interfaceC1685750ty9LIZIZ, f4), f4), c1296870jqv2);
                            long jN3 = C1670400tZO.LIZIZ(c13zcLJIIJ).N3();
                            float f5 = LJ;
                            z2 = true;
                            C1668930tX1.LIZIZ(c1668880tWw, null, interfaceC1685750ty9LIZIZ2, jN3, f5, f5, false, c13zcLJIIJ, 221232, 64);
                        } else {
                            z2 = true;
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        c13zcLJIIJ.LJJJJL(z2);
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
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0tdD
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Function1 function12 = function1;
                    boolean z4 = z;
                    float f6 = f;
                    Function2 function23 = function2;
                    Function2 function24 = function22;
                    int i8 = i;
                    ((Integer) obj2).intValue();
                    C1672740tdA.LIZ(function12, z4, f6, function23, function24, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i8 | 1));
                    return Unit.LIZ;
                }
            };
        }
    }

    public static final void LJFF(final Function1<? super Boolean, Unit> function1, final boolean z, final boolean z2, final float f, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22, InterfaceC1680500tpg interfaceC1680500tpg, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function23 = function2;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1176751193);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
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
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIJ(f)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i10 = i2 & 16;
        if (i10 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function23)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(function22)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((74899 & i3) == 74898 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i10 != 0) {
                function23 = null;
            }
            int i11 = i3 >> 3;
            LIZJ(function1, z, z2, function23, function22, f, null, c13zcLJIIJ, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i11 & 7168) | (i11 & 57344) | ((i3 << 6) & 458752), 64);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function24 = function23;
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0tUc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Function1 function12 = function1;
                    boolean z3 = z;
                    boolean z4 = z2;
                    float f2 = f;
                    Function2 function25 = function24;
                    Function2 function26 = function22;
                    int i12 = i;
                    int i13 = i2;
                    ((Integer) obj2).intValue();
                    C1672740tdA.LJFF(function12, z3, z4, f2, function25, function26, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i12 | 1), i13);
                    return Unit.LIZ;
                }
            };
        }
    }

    public static final void LIZJ(final Function1<? super Boolean, Unit> function1, final boolean z, final boolean z2, final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22, final float f, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        final InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1903442610);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
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
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
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
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function22)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJIJ(f)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        int i11 = i2 & 64;
        if (i11 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        if ((599187 & i3) == 599186 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i11 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LJIJI = c.LJIJI(c.LJ(c.LJIJ(interfaceC1685750ty92, 0.0f, 420, 1), 1.0f), null, 3);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIJI);
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
                LIZIZ(((i3 >> 6) & 14) | 384, 2, c13zcLJIIJ, null, C13Z4.LIZJ(312802618, new Function2<InterfaceC1680500tpg, Integer, Unit>() { // from class: X.0tdB
                    @Override // kotlin.jvm.functions.Function2
                    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg2, Integer num) {
                        InterfaceC1680500tpg interfaceC1680500tpg3 = interfaceC1680500tpg2;
                        if ((num.intValue() & 3) == 2 && interfaceC1680500tpg3.LIZ()) {
                            interfaceC1680500tpg3.LIZJ();
                        } else {
                            C1672740tdA.LIZ(function1, z, f, function2, function22, interfaceC1680500tpg3, 0);
                        }
                        return Unit.LIZ;
                    }
                }, c13zcLJIIJ), z2);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0tdC
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Function1 function12 = function1;
                    boolean z3 = z;
                    boolean z4 = z2;
                    Function2 function23 = function2;
                    Function2 function24 = function22;
                    float f2 = f;
                    InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
                    int i12 = i;
                    int i13 = i2;
                    ((Integer) obj2).intValue();
                    C1672740tdA.LIZJ(function12, z3, z4, function23, function24, f2, interfaceC1685750ty93, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i12 | 1), i13);
                    return Unit.LIZ;
                }
            };
        }
    }

    public static final void LJ(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function0<Unit> function0, float f, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22, InterfaceC1680500tpg interfaceC1680500tpg, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function23;
        float f2 = f;
        boolean z6 = z5;
        boolean z7 = z3;
        boolean z8 = z4;
        Function0<Unit> function02 = function0;
        boolean z9 = z2;
        boolean z10 = z;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1379887553);
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z10)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z9)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i15 = i2 & 4;
        if (i15 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z7)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i16 = i2 & 8;
        if (i16 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z8)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i17 = i2 & 16;
        if (i17 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z6)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        int i18 = i2 & 32;
        if (i18 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        int i19 = i2 & 64;
        if (i19 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJIJ(f2)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        int i20 = i2 & 128;
        if (i20 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i3 |= i11;
        }
        if ((i2 & 256) != 0) {
            i3 |= 100663296;
        } else if ((100663296 & i) == 0) {
            if (c13zcLJIIJ.LJII(function22)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i3 |= i12;
        }
        if ((i3 & 38347923) == 38347922 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
            function23 = function2;
        } else {
            if (i13 != 0) {
                z10 = true;
            }
            if (i14 != 0) {
                z9 = true;
            }
            if (i15 != 0) {
                z7 = true;
            }
            if (i16 != 0) {
                z8 = false;
            }
            if (i17 != 0) {
                z6 = true;
            }
            function23 = null;
            if (i18 != 0) {
                function02 = null;
            }
            if (i19 != 0) {
                f2 = Float.NaN;
            }
            if (i20 == 0) {
                function23 = function2;
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
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = new AObjectS399S0100000_25(c05p0, 26);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1670630tZl.LIZ((Function0) objLJJ2, new C1686740tzk(z9, z10, false, true, 4), 0.0f, C13Z4.LIZJ(-656736632, new AObjectS0S0440001_25(z6, function02, c05p0, z10, z8, f2, function23, function22, z7, 0), c13zcLJIIJ), c13zcLJIIJ, 3462);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            final Function0<Unit> function03 = function02;
            final float f3 = f2;
            final boolean z11 = z10;
            final boolean z12 = z9;
            final boolean z13 = z7;
            final boolean z14 = z8;
            final boolean z15 = z6;
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0tbT
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    boolean z16 = z11;
                    boolean z17 = z12;
                    boolean z18 = z13;
                    boolean z19 = z14;
                    boolean z20 = z15;
                    Function0 function04 = function03;
                    float f4 = f3;
                    Function2 function24 = function23;
                    Function2 function25 = function22;
                    int i21 = i;
                    int i22 = i2;
                    ((Integer) obj2).intValue();
                    C1672740tdA.LJ(z16, z17, z18, z19, z20, function04, f4, function24, function25, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i21 | 1), i22);
                    return Unit.LIZ;
                }
            };
        }
    }

    public static final void LJI(boolean z, final Function1<? super Float, Unit> function1, final Function1<? super Boolean, Unit> function12, final Function0<Unit> function0, final boolean z2, boolean z3, float f, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22, InterfaceC1680500tpg interfaceC1680500tpg, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z4;
        boolean z5;
        C13ZC c13zc;
        boolean z6;
        boolean z7 = z3;
        Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function23 = function2;
        float f2 = f;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-910737961);
        boolean z8 = z;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z8)) {
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
            if (c13zcLJIIJ.LJII(function12)) {
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
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        int i13 = i2 & 32;
        if (i13 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z7)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        int i14 = i2 & 64;
        if (i14 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJIJ(f2)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        int i15 = i2 & 128;
        if (i15 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJII(function23)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i3 |= i11;
        }
        Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function24 = function22;
        if ((i2 & 256) != 0) {
            i3 |= 100663296;
        } else if ((100663296 & i) == 0) {
            if (c13zcLJIIJ.LJII(function24)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i3 |= i12;
        }
        if ((i3 & 38347923) == 38347922 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
            c13zc = c13zcLJIIJ;
        } else {
            if (i13 != 0) {
                z7 = false;
            }
            if (i14 != 0) {
                f2 = Float.NaN;
            }
            if (i15 != 0) {
                function23 = null;
            }
            InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII);
            InterfaceC1686200tys interfaceC1686200tys = C1670400tZO.LIZ(c13zcLJIIJ).LJFF;
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            Object obj = objLJJ;
            if (objLJJ == c1680520tpi) {
                C0NWC c0nwc = C0NWC.LIZ;
                AObjectS368S0100000_25 aObjectS368S0100000_25 = new AObjectS368S0100000_25(interfaceC1690500u5o, 5);
                AObjectS399S0100000_25 aObjectS399S0100000_25 = new AObjectS399S0100000_25(interfaceC1690500u5o, 16);
                C1677050tk7 c1677050tk7LIZLLL = C1671550tbF.LIZLLL(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 0, interfaceC1686200tys, 2);
                C1677900tlU c1677900tlULIZIZ = C1677880tlS.LIZIZ();
                C594920NVa c594920NVa = new C594920NVa(AFwS266S0000000_25.get$arr$(461), c0nwc);
                c594920NVa.LIZIZ = aObjectS368S0100000_25;
                c594920NVa.LIZJ = aObjectS399S0100000_25;
                c594920NVa.LIZLLL = c1677050tk7LIZLLL;
                c594920NVa.LJ = c1677900tlULIZIZ;
                c13zcLJIIJ.LJJIJIIJI(c594920NVa);
                obj = c594920NVa;
            }
            C594920NVa c594920NVa2 = (C594920NVa) obj;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(954179779);
            boolean z9 = true;
            if (z8) {
                Boolean bool = Boolean.TRUE;
                c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                if ((i3 & 112) == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                if (z6 || objLJJ2 == c1680520tpi) {
                    objLJJ2 = new C0NVG(c594920NVa2, function1, null);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                z4 = false;
                c13zcLJIIJ.LJJJJL(false);
                C1680540tpk.LJFF(bool, (Function2) objLJJ2, c13zcLJIIJ);
            } else {
                z4 = false;
            }
            c13zcLJIIJ.LJJJJL(z4);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            C05P0 c05p0 = (C05P0) objLJJ3;
            c13zcLJIIJ.LJJJJL(z4);
            Boolean bool2 = Boolean.TRUE;
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (objLJJ4 == c1680520tpi) {
                objLJJ4 = new C0NVB(c594920NVa2, c05p0, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(bool2, (Function2) objLJJ4, c13zcLJIIJ);
            Boolean boolValueOf = Boolean.valueOf(((Boolean) c05p0.getValue()).booleanValue());
            c13zcLJIIJ.LJJIIJZLJL(-1746271574);
            if ((i3 & 7168) != 2048) {
                z9 = false;
            }
            Object objLJJ5 = c13zcLJIIJ.LJJ();
            if (z9 || objLJJ5 == c1680520tpi) {
                objLJJ5 = new C0NVC(c05p0, c594920NVa2, function0, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ5);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(boolValueOf, (Function2) objLJJ5, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(954239002);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = InterfaceC1685750ty9.LIZ;
            c13zcLJIIJ.LJJIIJZLJL(954239550);
            if (z2) {
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                Object objLJJ6 = c13zcLJIIJ.LJJ();
                if (objLJJ6 == c1680520tpi) {
                    objLJJ6 = new C1681260tqu(c594920NVa2, EnumC1684030tvN.Vertical);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ6);
                }
                z5 = false;
                c13zcLJIIJ.LJJJJL(false);
                interfaceC1685750ty9LIZ = C1686320tz4.LIZ(interfaceC1685750ty9LIZ, (InterfaceC20086513iZ) objLJJ6, null);
            } else {
                z5 = false;
            }
            c13zcLJIIJ.LJJJJL(z5);
            c13zcLJIIJ.LJJJJL(z5);
            EnumC1684030tvN enumC1684030tvN = EnumC1684030tvN.Vertical;
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            Object objLJJ7 = c13zcLJIIJ.LJJ();
            if (objLJJ7 == c1680520tpi) {
                objLJJ7 = new AObjectS533S0100000_25(c594920NVa2, 0);
                c13zcLJIIJ.LJJIJIIJI(objLJJ7);
            }
            c13zcLJIIJ.LJJJJL(z5);
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = C1677950tlZ.LJ(C1672990tdZ.LIZ(interfaceC1685750ty9LIZ, c594920NVa2, enumC1684030tvN, (Function2) objLJJ7), c594920NVa2, enumC1684030tvN, z2, 56);
            int i16 = i3 >> 12;
            c13zc = c13zcLJIIJ;
            z8 = z8;
            function24 = function24;
            LIZJ(function12, z7, z8, function23, function24, f2, interfaceC1685750ty9LJ, c13zcLJIIJ, ((i3 >> 6) & 14) | (i16 & 112) | ((i3 << 6) & 896) | (i16 & 7168) | (i16 & 57344) | ((i3 >> 3) & 458752), 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zc.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function25 = function23;
            final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function26 = function24;
            final boolean z10 = z7;
            final float f3 = f2;
            final boolean z11 = z8;
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0Oqe
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    boolean z12 = z11;
                    Function1 function13 = function1;
                    Function1 function14 = function12;
                    Function0 function02 = function0;
                    boolean z13 = z2;
                    boolean z14 = z10;
                    float f4 = f3;
                    Function2 function27 = function25;
                    Function2 function28 = function26;
                    int i17 = i;
                    int i18 = i2;
                    ((Integer) obj3).intValue();
                    C1672740tdA.LJI(z12, function13, function14, function02, z13, z14, f4, function27, function28, (InterfaceC1680500tpg) obj2, C341440Da2.LIZ(i17 | 1), i18);
                    return Unit.LIZ;
                }
            };
        }
    }
}
