package X;

import androidx.compose.foundation.layout.c;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS18S0202000_8;
import kotlin.jvm.internal.AwS22S0202000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tXP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669170tXP {
    public static final void LIZ(SocialMediaPickerViewModel socialMediaPickerViewModel, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1468501982);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(socialMediaPickerViewModel)) {
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
            c13zcLJIIJ.LJJIIJZLJL(-1813827772);
            float f = 28;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIJ = c.LJIJ(c.LJI(interfaceC1685750ty92, f), 0.0f, 120, 1);
            if (socialMediaPickerViewModel.wQ2()) {
                c13zcLJIIJ.LJJIIJZLJL(968184302);
                C1683760tuw c1683760tuwLIZ = C1668200tVq.LIZ(C1697810uHb.LJIIJJI(new C1685910tyP(C1670400tZO.LIZIZ(c13zcLJIIJ).U3()), new C1685910tyP(((C1685910tyP) ((C13FE) C1670400tZO.LIZIZ(c13zcLJIIJ).l4).getValue()).LIZ)), 0.0f, 14);
                C1669040tXC c1669040tXC = new C1669040tXC(f);
                interfaceC1685750ty9LIZIZ = C1675980tiO.LIZ(interfaceC1685750ty9LJIJ, c1683760tuwLIZ, new C1669400tXm(c1669040tXC, c1669040tXC, c1669040tXC, c1669040tXC), 4);
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(968627850);
                long j = ((C1685910tyP) ((C13FE) C1670400tZO.LIZIZ(c13zcLJIIJ).D2).getValue()).LIZ;
                C1669040tXC c1669040tXC2 = new C1669040tXC(f);
                interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(interfaceC1685750ty9LJIJ, j, new C1669400tXm(c1669040tXC2, c1669040tXC2, c1669040tXC2, c1669040tXC2));
                c13zcLJIIJ.LJJJJL(false);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1679920tok c1679920tok = C1679930tol.LIZ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(c1679920tok, C1668040tVa.LJIIJJI, c13zcLJIIJ, 54);
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
                C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                if (socialMediaPickerViewModel.wQ2()) {
                    c13zcLJIIJ.LJJIIJZLJL(1191555323);
                    C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                    int i7 = (i3 & 14) | 48;
                    LIZJ(socialMediaPickerViewModel, C1682520tsw.LJIIL(c1685760tyA, 7, 0.0f, 3, 0.0f, 10), c13zcLJIIJ, i7, 0);
                    LIZIZ(socialMediaPickerViewModel, C1682520tsw.LJIIL(c1685760tyA, 0.0f, 0.0f, 2, 0.0f, 11), c13zcLJIIJ, i7, 0);
                    c13zcLJIIJ.LJJJJL(false);
                } else {
                    c13zcLJIIJ.LJJIIJZLJL(1191859867);
                    C1685760tyA c1685760tyA2 = InterfaceC1685750ty9.LIZ;
                    int i8 = (i3 & 14) | 48;
                    LIZIZ(socialMediaPickerViewModel, C1682520tsw.LJIIL(c1685760tyA2, 2, 0.0f, 3, 0.0f, 10), c13zcLJIIJ, i8, 0);
                    LIZJ(socialMediaPickerViewModel, C1682520tsw.LJIIL(c1685760tyA2, 0.0f, 0.0f, 7, 0.0f, 11), c13zcLJIIJ, i8, 0);
                    c13zcLJIIJ.LJJJJL(false);
                }
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS18S0202000_8(socialMediaPickerViewModel, interfaceC1685750ty92, i, i2, 3);
        }
    }

    public static final void LIZIZ(SocialMediaPickerViewModel socialMediaPickerViewModel, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        long jV2;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-302262857);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(socialMediaPickerViewModel)) {
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
            long jB2 = C1670400tZO.LIZIZ(c13zcLJIIJ).B2();
            float f = 24;
            C1669040tXC c1669040tXC = new C1669040tXC(f);
            InterfaceC1685750ty9 interfaceC1685750ty9LJI = c.LJI(c.LJIILLIIL(C1675980tiO.LIZIZ(interfaceC1685750ty92, jB2, new C1669400tXm(c1669040tXC, c1669040tXC, c1669040tXC, c1669040tXC)), f), f);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
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
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1672220tcK.LIZ.LIZIZ(InterfaceC1685750ty9.LIZ, C1668040tVa.LJFF);
                C1668880tWw c1668880tWw = C1669660tYC.LLLL;
                float f2 = 16;
                if (socialMediaPickerViewModel.wQ2()) {
                    c13zcLJIIJ.LJJIIJZLJL(-1289621334);
                    jV2 = ((C1685910tyP) ((C13FE) C1670400tZO.LIZIZ(c13zcLJIIJ).F3).getValue()).LIZ;
                    c13zcLJIIJ.LJJJJL(false);
                } else {
                    c13zcLJIIJ.LJJIIJZLJL(-1289545074);
                    jV2 = C1670400tZO.LIZIZ(c13zcLJIIJ).v2();
                    c13zcLJIIJ.LJJJJL(false);
                }
                C1668930tX1.LIZIZ(c1668880tWw, "AI Live Switch", interfaceC1685750ty9LIZIZ, jV2, f2, f2, false, c13zcLJIIJ, 221232, 64);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS22S0202000_25(socialMediaPickerViewModel, interfaceC1685750ty92, i, i2, 12);
        }
    }

    public static final void LIZJ(SocialMediaPickerViewModel socialMediaPickerViewModel, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        long jE2;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1607645333);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(socialMediaPickerViewModel)) {
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
            C1693430uAX c1693430uAX = C1670400tZO.LJ(c13zcLJIIJ).LJIILLIIL;
            C1693430uAX c1693430uAX2 = C1670400tZO.LJ(c13zcLJIIJ).LJJIFFI;
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(c1693430uAX);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LJIJ = c.LJIJ(interfaceC1685750ty92, 0.0f, 84, 1);
            String strLIZIZ = C0MBB.LIZIZ(2131820681, c13zcLJIIJ);
            if (socialMediaPickerViewModel.wQ2()) {
                c13zcLJIIJ.LJJIIJZLJL(-181255143);
                jE2 = ((C1685910tyP) ((C13FE) C1670400tZO.LIZIZ(c13zcLJIIJ).z2).getValue()).LIZ;
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(-181187687);
                jE2 = C1670400tZO.LIZIZ(c13zcLJIIJ).E2();
                c13zcLJIIJ.LJJJJL(false);
            }
            C1693430uAX c1693430uAX3 = (C1693430uAX) c05p0.getValue();
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(c1693430uAX2);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS391S0200000_25(c05p0, c1693430uAX2, 218);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1685190txF.LIZ(strLIZIZ, interfaceC1685750ty9LJIJ, jE2, c1693430uAX3, 0L, 0, 2, false, 1, null, (Function1) objLJJ2, c13zcLJIIJ, 102236160, 0, 688);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS22S0202000_25(socialMediaPickerViewModel, interfaceC1685750ty92, i, i2, 13);
        }
    }
}
