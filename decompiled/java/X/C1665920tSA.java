package X;

import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: renamed from: X.0tSA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1665920tSA {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.C631680Oq6 r9, com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel r10, X.InterfaceC1680500tpg r11) {
        /*
            r0 = -642350856(0xffffffffd9b680f8, float:-6.421281E15)
            r3 = r11
            r3.LJJIIJZLJL(r0)
            int r0 = r9.LL
            java.lang.String r5 = X.C0MBB.LIZIZ(r0, r3)
            boolean r7 = r9.LLILLJJLI
            boolean r8 = r9.LLILLL
            r0 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
            r3.LJJIIJZLJL(r0)
            boolean r0 = r3.LJJIIJ(r10)
            r2 = 0
            if (r0 != 0) goto L50
            r1 = 0
        L1f:
            boolean r0 = r3.LJJIIJ(r9)
            if (r0 == 0) goto L26
            r2 = 1
        L26:
            r1 = r1 | r2
            java.lang.Object r6 = r3.LJJ()
            if (r1 != 0) goto L36
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L40
        L36:
            kotlin.jvm.internal.AwS410S0200000_9 r6 = new kotlin.jvm.internal.AwS410S0200000_9
            r0 = 105(0x69, float:1.47E-43)
            r6.<init>(r10, r9, r0)
            r3.LJJIJIIJI(r6)
        L40:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r3.LJ()
            r4 = 0
            r1 = 0
            r2 = 16
            LIZ(r1, r2, r3, r4, r5, r6, r7, r8)
            r3.LJ()
            return
        L50:
            r1 = 1
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1665920tSA.LIZIZ(X.0Oq6, com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel, X.0tpg):void");
    }

    public static final void LIZ(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, String str, Function0 function0, boolean z, boolean z2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C1668880tWw c1668880tWw;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(964321144);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
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
            if (c13zcLJIIJ.LJII(function0)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i3 & 9363) == 9362 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i9 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            C05P0 c05p0LJIIIIZZ = C20028913Yh.LJIIIIZZ(function0, c13zcLJIIJ);
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c.LJ(interfaceC1685750ty92, 1.0f), 16, 4, 12, 0.0f, 8);
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
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                float f = 28;
                C1685190txF.LIZ(str, c.LJIIIIZZ(c1687980u1k.LIZ(c1685760tyA, 1.0f, true), f, 0.0f, 2), C1670810ta3.LIZIZ(R.attr.a1h, c13zcLJIIJ), C1670400tZO.LJ(c13zcLJIIJ).LJIIJ, 0L, 0, 2, false, 1, null, null, c13zcLJIIJ, (i3 & 14) | 102236160, 0, 1712);
                c13zcLJIIJ.LJJIIJZLJL(1665089301);
                if (z2) {
                    if (z) {
                        c1668880tWw = C1669660tYC.LJJLIIIJLJLI;
                    } else {
                        c1668880tWw = C1669660tYC.LJJJJZ;
                    }
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
                        objLJJ2 = new AwS569S0100000_25(c05p0LJIIIIZZ, (C05P0<Boolean>) 1043);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    C1668930tX1.LIZIZ(c1668880tWw, null, C634380OuS.LIZ(interfaceC1685750ty9LJIILIIL, interfaceC595010NVj, null, true, null, c20279814Wu, (Function0) objLJJ2), jLIZIZ, f2, f2, false, c13zcLJIIJ, 221232, 64);
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
            c20030013YsLJJJJZI.LIZLLL = new C634410OuV(i, i2, interfaceC1685750ty92, str, function0, z, z2);
        }
    }
}
