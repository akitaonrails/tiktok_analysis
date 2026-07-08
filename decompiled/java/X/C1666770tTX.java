package X;

import androidx.compose.foundation.layout.c;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS4S0112000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tTX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666770tTX {
    public static final String LIZLLL(long j) {
        if (j <= 0) {
            return "0MB";
        }
        double d = j;
        double d2 = d / 1.073741824E9d;
        if (d2 >= 1.0d) {
            return C786410Ut5.j4("%.1fGB", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1));
        }
        double d3 = d / 1048576.0d;
        if (d3 >= 10.0d) {
            return C786410Ut5.j4("%.0fMB", Arrays.copyOf(new Object[]{Double.valueOf(d3)}, 1));
        }
        return C786410Ut5.j4("%.1fMB", Arrays.copyOf(new Object[]{Double.valueOf(d3)}, 1));
    }

    public static final void LIZIZ(boolean z, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        long jV2;
        long jT2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1375009130);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
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
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIILIIL = c.LJIILIIL(c1685760tyA, 22);
            C1669400tXm c1669400tXm = C1669050tXD.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1667200tUE.LIZ(interfaceC1685750ty9LJIILIIL, c1669400tXm);
            c13zcLJIIJ.LJJIIJZLJL(1466159097);
            if (z) {
                jV2 = C1670400tZO.LIZIZ(c13zcLJIIJ).V2();
            } else {
                jV2 = C1685910tyP.LJIIIZ;
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(interfaceC1685750ty9LIZ, jV2, C1669430tXp.LIZ);
            float f = (float) 1.5d;
            if (z) {
                c13zcLJIIJ.LJJIIJZLJL(1466164164);
                jT2 = C1670400tZO.LIZIZ(c13zcLJIIJ).V2();
            } else {
                c13zcLJIIJ.LJJIIJZLJL(1466165317);
                jT2 = C1670400tZO.LIZIZ(c13zcLJIIJ).T2();
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ2 = C1675890tiF.LIZ(interfaceC1685750ty9LIZIZ, f, jT2, c1669400tXm);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LJFF, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ2);
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
                c13zcLJIIJ.LJJIIJZLJL(1295930767);
                if (z) {
                    LIZ(48, 0, C1670400tZO.LIZIZ(c13zcLJIIJ).p3(), c13zcLJIIJ, c.LJIILIIL(c1685760tyA, 13));
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1666790tTZ(z, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(int r11, int r12, long r13, X.InterfaceC1680500tpg r15, X.InterfaceC1685750ty9 r16) {
        /*
            r10 = r16
            r0 = -1952573759(0xffffffff8b9e16c1, float:-6.089362E-32)
            X.13ZC r2 = r15.LJIIJ(r0)
            r7 = r12
            r0 = r7 & 1
            r3 = 4
            r8 = r13
            r6 = r11
            if (r0 == 0) goto L7f
            r0 = r6 | 6
        L13:
            r5 = r7 & 2
            if (r5 == 0) goto L6e
            r0 = r0 | 48
        L19:
            r4 = r0 & 19
            r1 = 18
            if (r4 != r1) goto L36
            boolean r1 = r2.LIZ()
            if (r1 == 0) goto L36
            r2.LIZJ()
        L28:
            X.13Ys r0 = r2.LJJJJZI()
            if (r0 == 0) goto L35
            X.0tTY r5 = new X.0tTY
            r5.<init>(r6, r7, r8, r10)
            r0.LIZLLL = r5
        L35:
            return
        L36:
            if (r5 == 0) goto L3a
            X.0tyA r10 = X.InterfaceC1685750ty9.LIZ
        L3a:
            r1 = 5004770(0x4c5de2, float:7.013177E-39)
            r2.LJJIIJZLJL(r1)
            r1 = r0 & 14
            r4 = 0
            if (r1 != r3) goto L6c
            r1 = 1
        L46:
            java.lang.Object r3 = r2.LJJ()
            if (r1 != 0) goto L55
            X.0tph r1 = X.InterfaceC1680500tpg.LIZ
            r1.getClass()
            X.0tpi r1 = X.C1680510tph.LIZIZ
            if (r3 != r1) goto L5f
        L55:
            kotlin.jvm.internal.AwS39S0000100_25 r3 = new kotlin.jvm.internal.AwS39S0000100_25
            r1 = 13
            r3.<init>(r8, r1)
            r2.LJJIJIIJI(r3)
        L5f:
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r2.LJJJJL(r4)
            int r0 = r0 >> 3
            r0 = r0 & 14
            X.C1668170tVn.LIZ(r10, r3, r2, r0)
            goto L28
        L6c:
            r1 = 0
            goto L46
        L6e:
            r1 = r6 & 48
            if (r1 != 0) goto L19
            boolean r1 = r2.LJJIIJ(r10)
            if (r1 == 0) goto L7c
            r1 = 32
        L7a:
            r0 = r0 | r1
            goto L19
        L7c:
            r1 = 16
            goto L7a
        L7f:
            r0 = r6 & 6
            if (r0 != 0) goto L8e
            boolean r0 = r2.LJIJJ(r8)
            if (r0 == 0) goto L8c
            r0 = 4
        L8a:
            r0 = r0 | r6
            goto L13
        L8c:
            r0 = 2
            goto L8a
        L8e:
            r0 = r6
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1666770tTX.LIZ(int, int, long, X.0tpg, X.0ty9):void");
    }

    public static final void LIZJ(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z) {
        int i3;
        int i4;
        int i5;
        long jLIZJ;
        long jLIZJ2;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1406461098);
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
            InterfaceC1685750ty9 interfaceC1685750ty9LJIILIIL = c.LJIILIIL(interfaceC1685750ty92, 26);
            C1669400tXm c1669400tXm = C1669050tXD.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1667200tUE.LIZ(interfaceC1685750ty9LJIILIIL, c1669400tXm);
            if (z) {
                c13zcLJIIJ.LJJIIJZLJL(1305591300);
                jLIZJ = C1670400tZO.LIZIZ(c13zcLJIIJ).V2();
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(1305593705);
                jLIZJ = C1685910tyP.LIZJ(0.38f, C1670400tZO.LIZIZ(c13zcLJIIJ).x2());
                c13zcLJIIJ.LJJJJL(false);
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(interfaceC1685750ty9LIZ, jLIZJ, C1669430tXp.LIZ);
            float f = (float) 1.5d;
            c13zcLJIIJ.LJJIIJZLJL(1305597378);
            if (z) {
                jLIZJ2 = C1685910tyP.LJIIIZ;
            } else {
                jLIZJ2 = C1685910tyP.LIZJ(0.88f, C1670400tZO.LIZIZ(c13zcLJIIJ).B2());
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ2 = C1675890tiF.LIZ(interfaceC1685750ty9LIZIZ, f, jLIZJ2, c1669400tXm);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LJFF, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ2);
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
                c13zcLJIIJ.LJJIIJZLJL(-581935205);
                if (z) {
                    LIZ(48, 0, C1670400tZO.LIZIZ(c13zcLJIIJ).p3(), c13zcLJIIJ, c.LJIILIIL(InterfaceC1685750ty9.LIZ, 14));
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS4S0112000_25(i, i2, interfaceC1685750ty92, z, 3);
        }
    }
}
