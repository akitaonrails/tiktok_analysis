package X;

import androidx.compose.foundation.layout.c;
import com.ss.android.ugc.aweme.subscription.preview.PreviewRangeSelectorViewModel;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS43S1101000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0u2X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688470u2X {
    public static final void LIZIZ(PreviewRangeSelectorViewModel previewRangeSelectorViewModel, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1287207051);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(previewRangeSelectorViewModel)) {
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
            C1296860jqu c1296860jqu = C1668040tVa.LJIILJJIL;
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c1685760tyA, 0.0f, 0.0f, 0.0f, 16, 7);
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, c1296860jqu, c13zcLJIIJ, 48);
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
                C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1665790tRx.LIZ(c.LJI(c1685760tyA, 25), c13zcLJIIJ);
                int i4 = i2 & 14;
                LIZJ(previewRangeSelectorViewModel, c13zcLJIIJ, i4);
                LJ(previewRangeSelectorViewModel, c13zcLJIIJ, i4);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(previewRangeSelectorViewModel, i, 34);
        }
    }

    public static final void LIZJ(PreviewRangeSelectorViewModel previewRangeSelectorViewModel, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        String strLIZJ;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(587077849);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(previewRangeSelectorViewModel)) {
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
            C443120HZe c443120HZe = (C443120HZe) C1687970u1j.LIZ(previewRangeSelectorViewModel.LLIZ, c13zcLJIIJ).getValue();
            if (c443120HZe == null) {
                c443120HZe = new C443120HZe("", "", "");
            }
            String str = (String) c443120HZe.getSecond();
            Object third = c443120HZe.getThird();
            if (!a0.LJJJIL(str)) {
                c13zcLJIIJ.LJJIIJZLJL(529633129);
                strLIZJ = C0MBB.LIZJ(2131830335, new Object[]{str, third}, c13zcLJIIJ);
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(529797181);
                strLIZJ = C0MBB.LIZJ(2131830336, new Object[]{third}, c13zcLJIIJ);
                c13zcLJIIJ.LJJJJL(false);
            }
            InterfaceC1668050tVb.LIZ.getClass();
            C1296880jqw c1296880jqw = C1668040tVa.LJIIJJI;
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LIZ, c1296880jqw, c13zcLJIIJ, 48);
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
                C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1685190txF.LIZ(C0MBB.LIZIZ(2131830334, c13zcLJIIJ), null, C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), C1670400tZO.LJ(c13zcLJIIJ).LJJIIJ, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2034);
                C1665790tRx.LIZ(c.LJIILLIIL(c1685760tyA, 11), c13zcLJIIJ);
                C1685190txF.LIZ(strLIZJ, null, C1670400tZO.LIZIZ(c13zcLJIIJ).R3(), C1670400tZO.LJ(c13zcLJIIJ).LJJIII, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2034);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(previewRangeSelectorViewModel, i, 35);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(com.ss.android.ugc.aweme.subscription.preview.PreviewRangeSelectorViewModel r34, X.InterfaceC1680500tpg r35, int r36) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1688470u2X.LJ(com.ss.android.ugc.aweme.subscription.preview.PreviewRangeSelectorViewModel, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(com.ss.android.ugc.aweme.subscription.preview.PreviewRangeSelectorViewModel r12, X.AbstractC19215010Fg r13, X.InterfaceC1680500tpg r14, int r15) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1688470u2X.LIZ(com.ss.android.ugc.aweme.subscription.preview.PreviewRangeSelectorViewModel, X.10Fg, X.0tpg, int):void");
    }

    public static final void LIZLLL(int i, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, String str) {
        int i2;
        String str2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1808460367);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
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
                objLJJ = C20028913Yh.LJI(new C1668650tWZ(0));
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII);
            C1691540u7U c1691540u7ULIZ = C1672580tcu.LIZ(0, 0, 1, c13zcLJIIJ);
            String str3 = "";
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            float fLJJI = interfaceC1690500u5o.LJJI((int) (C1691540u7U.LIZIZ(c1691540u7ULIZ, new C1692220u8a(str2), null, 0, false, 1, null, C1682390tsj.LIZ(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE), null, null, null, false, 1958).LIZJ >> 32));
            C1668650tWZ c1668650tWZ = new C1668650tWZ(fLJJI);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJIJ = c13zcLJIIJ.LJIJ(fLJJI);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJIJ || objLJJ2 == c1680520tpi) {
                objLJJ2 = new C05U7(fLJJI, c05p0, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(c1668650tWZ, (Function2) objLJJ2, c13zcLJIIJ);
            InterfaceC1685750ty9 interfaceC1685750ty9LJIILLIIL = c.LJIILLIIL(interfaceC1685750ty9, ((C1668650tWZ) c05p0.getValue()).LL + 8);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LJI, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIILLIIL);
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
                long jN3 = C1670400tZO.LIZIZ(c13zcLJIIJ).N3();
                if (str != null) {
                    str3 = str;
                }
                C1685190txF.LIZ(str3, null, jN3, C1670400tZO.LJ(c13zcLJIIJ).LJIJJ, 0L, 0, 0, false, 1, null, null, c13zcLJIIJ, 113246208, 0, 1650);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS43S1101000_25(i, interfaceC1685750ty9, str, 2);
        }
    }
}
