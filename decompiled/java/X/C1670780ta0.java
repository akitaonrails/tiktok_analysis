package X;

import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: renamed from: X.0ta0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670780ta0 {
    /* JADX WARN: Removed duplicated region for block: B:53:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C631630Oq1 r23, com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel r24, com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel r25, X.InterfaceC1680500tpg r26) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1670780ta0.LIZ(X.0Oq1, com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel, com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel, X.0tpg):void");
    }

    public static final void LIZIZ(C631630Oq1 c631630Oq1, boolean z, Function0<Unit> function0, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1951496289);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c631630Oq1)) {
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
            if (c13zcLJIIJ.LJII(function0)) {
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
            C05P0 c05p0LJIIIIZZ = C20028913Yh.LJIIIIZZ(function0, c13zcLJIIJ);
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c.LJ(interfaceC1685750ty92, 1.0f), 16, 8, 12, 0.0f, 8);
            InterfaceC1668050tVb.LIZ.getClass();
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LIZ, C1668040tVa.LJIIJJI, c13zcLJIIJ, 48);
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
                C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1687980u1k c1687980u1k = C1687980u1k.LIZ;
                String strLIZIZ = C0MBB.LIZIZ(c631630Oq1.LL, c13zcLJIIJ);
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                float f = 28;
                boolean z2 = false;
                C1685190txF.LIZ(strLIZIZ, c.LJIIIIZZ(c1687980u1k.LIZ(c1685760tyA, 1.0f, true), f, 0.0f, 2), C1670810ta3.LIZIZ(R.attr.a1h, c13zcLJIIJ), C1670400tZO.LJ(c13zcLJIIJ).LJIIJ, 0L, 0, 2, false, 1, null, null, c13zcLJIIJ, 102236160, 0, 1712);
                c13zcLJIIJ.LJJIIJZLJL(1425137200);
                if (z) {
                    C1668880tWw c1668880tWw = C1669660tYC.LLILIL;
                    float f2 = 20;
                    long jLIZIZ = C1670810ta3.LIZIZ(R.attr.a1h, c13zcLJIIJ);
                    InterfaceC1685750ty9 interfaceC1685750ty9LJIILIIL = c.LJIILIIL(c1685760tyA, f);
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ = c13zcLJIIJ.LJJ();
                    InterfaceC1680500tpg.LIZ.getClass();
                    C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
                    if (objLJJ == c1680520tpi) {
                        objLJJ = new C612270Nzt();
                        c13zcLJIIJ.LJJIJIIJI(objLJJ);
                    }
                    InterfaceC595010NVj interfaceC595010NVj = (InterfaceC595010NVj) objLJJ;
                    c13zcLJIIJ.LJJJJL(false);
                    C20279814Wu c20279814Wu = new C20279814Wu(0);
                    c13zcLJIIJ.LJJIIJZLJL(5004770);
                    boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(c05p0LJIIIIZZ);
                    Object objLJJ2 = c13zcLJIIJ.LJJ();
                    if (zLJJIIJ || objLJJ2 == c1680520tpi) {
                        objLJJ2 = new AwS553S0100000_9(c05p0LJIIIIZZ, (C05P0<Boolean>) 1817);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C634380OuS.LIZ(interfaceC1685750ty9LJIILIIL, interfaceC595010NVj, null, true, null, c20279814Wu, (Function0) objLJJ2);
                    z2 = false;
                    C1668930tX1.LIZIZ(c1668880tWw, null, interfaceC1685750ty9LIZ, jLIZIZ, f2, f2, false, c13zcLJIIJ, 221232, 64);
                }
                c13zcLJIIJ.LJJJJL(z2);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C634600Ouo(c631630Oq1, z, function0, interfaceC1685750ty92, i, i2);
        }
    }
}
