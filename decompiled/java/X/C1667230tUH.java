package X;

import android.content.Context;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS111S0210000_25;
import kotlin.jvm.internal.AwS49S0102000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tUH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667230tUH {
    public static final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        boolean z;
        long jLIZIZ;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(484270397);
        if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context);
                if (numLIZJ != null) {
                    jLIZIZ = C1685850tyJ.LIZIZ(numLIZJ.intValue());
                } else {
                    jLIZIZ = C1685910tyP.LJ;
                }
                objLJJ = new C1685910tyP(jLIZIZ);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            long j = ((C1685910tyP) objLJJ).LIZ;
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LJIILIIL = c.LJIILIIL(interfaceC1685750ty9, 24);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            if ((i3 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (z || objLJJ2 == c1680520tpi) {
                objLJJ2 = new C1667240tUI(j, i);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1668170tVn.LIZ(interfaceC1685750ty9LJIILIIL, (Function1) objLJJ2, c13zcLJIIJ, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS49S0102000_25(i, i2, interfaceC1685750ty9, 11);
        }
    }

    public static final void LIZIZ(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1741505430);
        if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1679920tok c1679920tok = C1679930tol.LIZ;
            InterfaceC1668050tVb.LIZ.getClass();
            int i6 = ((i3 >> 3) & 14) >> 3;
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(c1679920tok, C1668040tVa.LJIIJ, c13zcLJIIJ, (i6 & 112) | (i6 & 14));
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
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJI;
                C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                C1687980u1k c1687980u1k = C1687980u1k.LIZ;
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                C1296880jqw c1296880jqw = C1668040tVa.LJIIJJI;
                int i7 = i3 & 14;
                LIZJ(c1687980u1k.LIZIZ(c1685760tyA, c1296880jqw), c13zcLJIIJ, i, i7);
                C1677050tk7 c1677050tk7 = C1666870tTh.LIZ;
                InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = c1687980u1k.LIZIZ(c.LJIILJJIL(c1685760tyA, 56, 52), c1296880jqw);
                InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LJFF, false);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZIZ);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    LIZ(c1685760tyA, c13zcLJIIJ, i, i7 | 48);
                    c13zcLJIIJ.LJJJJL(true);
                    c13zcLJIIJ.LJJJJL(true);
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
            c20030013YsLJJJJZI.LIZLLL = new AwS49S0102000_25(i, i2, interfaceC1685750ty9, 12);
        }
    }

    public static final void LIZJ(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(946705026);
        if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append(" %");
            C1665970tSF.LIZJ(i3 & 112, 0, c13zcLJIIJ, interfaceC1685750ty9, C2188811AlT.LIZIZ(sbLIZ));
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS49S0102000_25(i, i2, interfaceC1685750ty9, 13);
        }
    }

    public static final void LIZLLL(boolean z, String str, String str2, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        String str3;
        int i3;
        int i4;
        int i5;
        int i6;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1943429884);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i3 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1679920tok c1679920tok = C1679930tol.LIZ;
            InterfaceC1668050tVb.LIZ.getClass();
            int i7 = ((i2 >> 9) & 14) >> 3;
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(c1679920tok, C1668040tVa.LJIIJ, c13zcLJIIJ, (i7 & 112) | (i7 & 14));
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
                C1687980u1k c1687980u1k = C1687980u1k.LIZ;
                if (z) {
                    str3 = str;
                } else {
                    str3 = str2;
                }
                C1665970tSF.LIZJ(0, 0, c13zcLJIIJ, c1687980u1k.LIZIZ(InterfaceC1685750ty9.LIZ, C1668040tVa.LJIIJJI), str3);
                C1668880tWw c1668880tWw = C1669660tYC.k;
                EnumC1669110tXJ enumC1669110tXJ = EnumC1669110tXJ.Clockwise;
                C1677050tk7 c1677050tk7 = C1666870tTh.LIZ;
                C1665970tSF.LIZ(c1668880tWw, C1685720ty6.LIZIZ(interfaceC1685750ty9, new AwS111S0210000_25(z, (boolean) enumC1669110tXJ, (EnumC1669110tXJ) C1671550tbF.LIZ(C1671550tbF.LIZLLL(LSPassThroughRecordSizeConfig.DEFAULT, 0, C05Y0.LIZLLL, 2), C0N66.Restart, 0L, 4), (C1677040tk6<Float>) 0)), null, true, c13zcLJIIJ, 3072, 4);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1667250tUJ(z, str, str2, interfaceC1685750ty9, i);
        }
    }
}
