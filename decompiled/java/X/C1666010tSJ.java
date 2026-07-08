package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS3S1202000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: renamed from: X.0tSJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666010tSJ {
    public static final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, C1668880tWw c1668880tWw, String str, int i, InterfaceC1680500tpg interfaceC1680500tpg, int i2) {
        int i3;
        int i4;
        int i5;
        boolean zLJII;
        int i6;
        int i7;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1843345403);
        if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i2 & 64) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(c1668880tWw);
            } else {
                zLJII = c13zcLJIIJ.LJII(c1668880tWw);
            }
            if (zLJII) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i4 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1679920tok c1679920tok = C1679930tol.LIZ;
            InterfaceC1668050tVb.LIZ.getClass();
            int i8 = (i3 & 14) >> 3;
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(c1679920tok, C1668040tVa.LJIIJ, c13zcLJIIJ, (i8 & 112) | (i8 & 14));
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9);
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
                float f = 24;
                int i9 = i3 >> 3;
                C1668930tX1.LIZIZ(c1668880tWw, str, C1682520tsw.LJIIL(InterfaceC1685750ty9.LIZ, 0.0f, 0.0f, 12, 0.0f, 11), 0L, f, f, false, c13zcLJIIJ, (i9 & 14) | 221568 | (i9 & 112), 72);
                C1685190txF.LIZ(C0MBB.LIZIZ(i, c13zcLJIIJ), null, C1670400tZO.LIZIZ(c13zcLJIIJ).M3(), C1670400tZO.LJ(c13zcLJIIJ).LJIIJJI, 0L, 1, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2002);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS3S1202000_25(interfaceC1685750ty9, c1668880tWw, str, i, i2, 8);
        }
    }
}
