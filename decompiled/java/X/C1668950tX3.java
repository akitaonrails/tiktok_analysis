package X;

import androidx.compose.foundation.layout.c;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS234S0300000_25;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: renamed from: X.0tX3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668950tX3 {
    public static final void LIZ(SocialMediaPickerViewModel socialMediaPickerViewModel, boolean z, InterfaceC1685750ty9 interfaceC1685750ty9, Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        boolean z2;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1845544815);
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
            if (c13zcLJIIJ.LJII(function0)) {
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
            if (z) {
                f = 180.0f;
            } else {
                f = 0.0f;
            }
            C05P1 c05p1LIZIZ = C1675660ths.LIZIZ(f, C1671550tbF.LIZLLL(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 0, null, 6), 0.0f, null, null, c13zcLJIIJ, 48, 28);
            C1693430uAX c1693430uAX = C1670400tZO.LJ(c13zcLJIIJ).LJII;
            C1693430uAX c1693430uAX2 = C1670400tZO.LJ(c13zcLJIIJ).LJIIJ;
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
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJII = c13zcLJIIJ.LJII(socialMediaPickerViewModel);
            if ((i3 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = z2 | zLJII;
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (z3 || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS409S0200000_8(socialMediaPickerViewModel, (SocialMediaPickerViewModel) function0, (Function0<Unit>) 118);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZJ = C634380OuS.LIZJ(interfaceC1685750ty92, false, null, (Function0) objLJJ2, 7);
            InterfaceC1668050tVb.LIZ.getClass();
            C1296880jqw c1296880jqw = C1668040tVa.LJIIJJI;
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LJ, c1296880jqw, c13zcLJIIJ, 54);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZJ);
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
                C1687980u1k c1687980u1k = C1687980u1k.LIZ;
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = c1687980u1k.LIZIZ(c1687980u1k.LIZ(c1685760tyA, 1.0f, false), c1296880jqw);
                long jK3 = C1670400tZO.LIZIZ(c13zcLJIIJ).K3();
                C1693430uAX c1693430uAX3 = (C1693430uAX) c05p0.getValue();
                String str = socialMediaPickerViewModel.zQ2().LIZ.LIZIZ;
                c13zcLJIIJ.LJJIIJZLJL(-1746271574);
                boolean zLJII2 = c13zcLJIIJ.LJII(socialMediaPickerViewModel) | c13zcLJIIJ.LJJIIJ(c1693430uAX2);
                Object objLJJ3 = c13zcLJIIJ.LJJ();
                if (zLJII2 || objLJJ3 == c1680520tpi) {
                    objLJJ3 = new AwS234S0300000_25(socialMediaPickerViewModel, (SocialMediaPickerViewModel) c1693430uAX2, (C1693430uAX) c05p0, (C05P0<C1693430uAX>) 38);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1685190txF.LIZ(str, interfaceC1685750ty9LIZIZ, jK3, c1693430uAX3, 0L, 3, 2, false, 1, null, (Function1) objLJJ3, c13zcLJIIJ, 102236160, 0, 656);
                C1665790tRx.LIZ(c.LJIILLIIL(c1685760tyA, 4), c13zcLJIIJ);
                float f2 = 16;
                InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ2 = c.LIZIZ(c.LJIILLIIL(c1685760tyA, f2), 1.0f);
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(c05p1LIZIZ);
                Object objLJJ4 = c13zcLJIIJ.LJJ();
                if (zLJJIIJ || objLJJ4 == c1680520tpi) {
                    objLJJ4 = new AwS604S0100000_25(c05p1LIZIZ, (C05P1<Float>) 625);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ4);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1668930tX1.LIZIZ(C1669660tYC.LJJJJZI, "", C1679660toK.LIZ(interfaceC1685750ty9LIZIZ2, (Function1) objLJJ4), C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), f2, f2, false, c13zcLJIIJ, 221232, 64);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C0M9G(socialMediaPickerViewModel, z, interfaceC1685750ty92, function0, i, i2);
        }
    }
}
