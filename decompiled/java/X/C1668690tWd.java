package X;

import Y.AObjectS0S0112001_25;
import androidx.compose.foundation.layout.c;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tWd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668690tWd {
    public static final float LIZ = 36;

    public static final void LIZ(final float f, int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        boolean z2;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(544407477);
        final boolean z3 = z;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z3)) {
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
            if (c13zcLJIIJ.LJIJ(f)) {
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
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C1695550uDx.LIZ();
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            final InterfaceC1695240uDS interfaceC1695240uDS = (InterfaceC1695240uDS) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            if (f < 0.5d) {
                f2 = 2.0f * f;
            } else {
                float f3 = 2;
                f2 = f3 - (f * f3);
            }
            final float fLJJJJLL = ((InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII)).LJJJJLL(LIZ);
            final long j = ((C1685910tyP) ((C13FE) C1670400tZO.LIZIZ(c13zcLJIIJ).w4).getValue()).LIZ;
            final long j2 = ((C1685910tyP) ((C13FE) C1670400tZO.LIZIZ(c13zcLJIIJ).x4).getValue()).LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = c.LIZLLL(interfaceC1685750ty92);
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            boolean zLJIJ = c13zcLJIIJ.LJIJ(fLJJJJLL);
            boolean z4 = true;
            if ((i3 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zLJII = z2 | zLJIJ | c13zcLJIIJ.LJII(interfaceC1695240uDS);
            if ((i3 & 14) != 4) {
                z4 = false;
            }
            boolean zLJIJJ = zLJII | z4 | c13zcLJIIJ.LJIJJ(j2) | c13zcLJIIJ.LJIJJ(j) | c13zcLJIIJ.LJIJ(f2);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJIJJ || objLJJ2 == c1680520tpi) {
                final float f4 = f2;
                z3 = z3;
                objLJJ2 = new Function1() { // from class: X.0tiG
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        long j3;
                        float f5 = fLJJJJLL;
                        float f6 = f;
                        InterfaceC1695240uDS interfaceC1695240uDS2 = interfaceC1695240uDS;
                        boolean z5 = z3;
                        long j4 = j2;
                        long j5 = j;
                        float f7 = f4;
                        InterfaceC1675870tiD interfaceC1675870tiD = (InterfaceC1675870tiD) obj;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() >> 32));
                        if (fIntBitsToFloat > f5) {
                            fIntBitsToFloat = f5;
                        }
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() & 4294967295L));
                        if (fIntBitsToFloat2 <= f5) {
                            f5 = fIntBitsToFloat2;
                        }
                        float f8 = fIntBitsToFloat / 2.0f;
                        float f9 = 0.32f * f8;
                        float f10 = (0.16f * fIntBitsToFloat) + f9;
                        float f11 = ((fIntBitsToFloat - (2.0f * f10)) * f6) + f10;
                        InterfaceC1686290tz1 interfaceC1686290tz1LIZ = interfaceC1675870tiD.LJLJI().LIZ();
                        interfaceC1686290tz1LIZ.LIZLLL(new C1683130ttv(0.0f, 0.0f, fIntBitsToFloat, f5), interfaceC1695240uDS2);
                        if (z5) {
                            j3 = j4;
                        } else {
                            j3 = j5;
                        }
                        interfaceC1695240uDS2.LJIIIZ(j3);
                        interfaceC1686290tz1LIZ.LIZIZ((0.25f * f7 * f9) + f9, (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), interfaceC1695240uDS2);
                        interfaceC1695240uDS2.LJIIJ(16);
                        if (!z5) {
                            j5 = j4;
                        }
                        interfaceC1695240uDS2.LJIIIZ(j5);
                        interfaceC1686290tz1LIZ.LIZIZ(f9 - ((f7 * 0.375f) * f9), (((long) Float.floatToRawIntBits(fIntBitsToFloat - f11)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), interfaceC1695240uDS2);
                        interfaceC1695240uDS2.LJIIJ(3);
                        interfaceC1686290tz1LIZ.LJIIJ();
                        return Unit.LIZ;
                    }
                };
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1668170tVn.LIZ(interfaceC1685750ty9LIZLLL, (Function1) objLJJ2, c13zcLJIIJ, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AObjectS0S0112001_25(f, i, i2, interfaceC1685750ty92, z3, 1);
        }
    }

    public static final void LIZIZ(float f, int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        Pair pair;
        float f2;
        boolean z2;
        float f3 = f;
        boolean z3 = z;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1936479983);
        int i7 = i2 & 1;
        if (i7 != 0) {
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
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z3)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIJ(f3)) {
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
                z3 = true;
            }
            if (i9 != 0) {
                f3 = 0.0f;
            }
            float f4 = LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIIIZZ = c.LJIIIIZZ(c.LJIJ(interfaceC1685750ty92, 0.0f, f4, 1), 0.0f, f4, 1);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIIIZZ);
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
                c13zcLJIIJ.LJJIIJZLJL(-1709762965);
                if (z3) {
                    C1677800tlK c1677800tlKLIZ = C1675690thv.LIZ(C1675690thv.LIZJ(1, c13zcLJIIJ, null), 0.0f, 2.0f, C1671550tbF.LIZ(C1671550tbF.LIZLLL(800, 0, C05Y0.LIZLLL, 2), C0N66.Restart, 0L, 4), null, c13zcLJIIJ, 4536, 8);
                    if (((Number) c1677800tlKLIZ.getValue()).floatValue() > 1.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    pair = new Pair(Boolean.valueOf(z2), Float.valueOf(((Number) c1677800tlKLIZ.getValue()).floatValue()));
                } else {
                    pair = new Pair(Boolean.FALSE, Float.valueOf(f3));
                }
                c13zcLJIIJ.LJJJJL(false);
                boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
                float fFloatValue = ((Number) pair.getSecond()).floatValue();
                if (fFloatValue > 1.0f) {
                    fFloatValue -= 1.0f;
                }
                if (fFloatValue < 0.5d) {
                    f2 = 2 * fFloatValue * fFloatValue;
                } else {
                    float f5 = 2;
                    f2 = ((f5 * fFloatValue) * (f5 - fFloatValue)) - 1;
                }
                LIZ(f2, 384, 0, c13zcLJIIJ, InterfaceC1685750ty9.LIZ, zBooleanValue);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AObjectS0S0112001_25(f3, i, i2, interfaceC1685750ty92, z3, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(X.InterfaceC1685750ty9 r22, X.C1668880tWw r23, X.C1685910tyP r24, X.InterfaceC1680500tpg r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1668690tWd.LIZJ(X.0ty9, X.0tWw, X.0tyP, X.0tpg, int, int):void");
    }
}
