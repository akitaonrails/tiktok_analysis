package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS1S0312000_25;
import kotlin.jvm.internal.AwS7S1102000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tSF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1665970tSF {
    public static final C13DQ LIZ = C13ZT.LIZJ(AFwS214S0000000_25.get$arr$(424));
    public static final boolean LIZIZ;

    static {
        LIZIZ = C0C64.LJIILLIIL().LJIJ(31744, 0, "story_edit_compose_toolbar_opt", true) == 1 || C0C64.LJIILLIIL().LJIJ(31744, 0, "story_edit_compose_toolbar_opt", true) == 2;
    }

    public static final void LIZJ(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, String str) {
        int i3;
        int i4;
        int i5;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(911805566);
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
            C1665990tSH c1665990tSH = (C1665990tSH) c13zcLJIIJ.LJJIL(LIZ);
            C1693430uAX c1693430uAXLIZ = null;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIJJ = c.LJIJJ(interfaceC1685750ty92, null, 3);
            C1677050tk7 c1677050tk7 = C1666870tTh.LIZ;
            long jLIZLLL = C1685850tyJ.LIZLLL(3875536895L);
            if (c1665990tSH != null) {
                c1693430uAXLIZ = c1665990tSH.LIZJ;
            }
            c13zcLJIIJ.LJJIIJZLJL(71829417);
            if (c1693430uAXLIZ == null) {
                c1693430uAXLIZ = C1666870tTh.LIZ(c13zcLJIIJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1685190txF.LIZ(str, interfaceC1685750ty9LJIJJ, jLIZLLL, c1693430uAXLIZ, 0L, 3, 2, false, 2, null, null, c13zcLJIIJ, (i3 & 14) | 1572864, 0, 1680);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS7S1102000_25(i, i2, interfaceC1685750ty92, str, 1);
        }
    }

    public static final void LIZ(C1668880tWw c1668880tWw, InterfaceC1685750ty9 interfaceC1685750ty9, C1668880tWw c1668880tWw2, boolean z, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        boolean zLJII;
        int i4;
        int i5;
        boolean zLJII2;
        int i6;
        int i7;
        AbstractC1676270tir abstractC1676270tirLIZ;
        long jLIZIZ;
        boolean z2 = z;
        C1668880tWw c1668880tWw3 = c1668880tWw2;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1540301062);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(c1668880tWw);
            } else {
                zLJII = c13zcLJIIJ.LJII(c1668880tWw);
            }
            if (zLJII) {
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
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
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
            if ((i & 512) == 0) {
                zLJII2 = c13zcLJIIJ.LJJIIJ(c1668880tWw3);
            } else {
                zLJII2 = c13zcLJIIJ.LJII(c1668880tWw3);
            }
            if (zLJII2) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
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
                c1668880tWw3 = null;
            }
            if (i9 != 0) {
                z2 = false;
            }
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
            C1665990tSH c1665990tSH = (C1665990tSH) c13zcLJIIJ.LJJIL(LIZ);
            c13zcLJIIJ.LJJIIJZLJL(1534409061);
            if (c1665990tSH != null) {
                LIZIZ(c1668880tWw, interfaceC1685750ty9, c1668880tWw3, z2, j, c1665990tSH, c13zcLJIIJ, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168));
                c13zcLJIIJ.LJJJJL(false);
                C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
                if (c20030013YsLJJJJZI != null) {
                    c20030013YsLJJJJZI.LIZLLL = new AwS1S0312000_25(c1668880tWw, interfaceC1685750ty9, c1668880tWw3, z2, i, i2, 2);
                    return;
                }
                return;
            }
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = context.getDrawable(R.drawable.au5);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            Drawable drawable = (Drawable) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            C1677050tk7 c1677050tk7 = C1666870tTh.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJI = c.LJI(c.LJIILLIIL(interfaceC1685750ty9, 56), 52);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LJFF, false);
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
                if (LIZIZ) {
                    c13zcLJIIJ.LJJIIJZLJL(996683671);
                    abstractC1676270tirLIZ = C1668830tWr.LIZIZ(drawable, c13zcLJIIJ);
                } else {
                    c13zcLJIIJ.LJJIIJZLJL(996685047);
                    abstractC1676270tirLIZ = C1A46.LIZ(R.drawable.au5, c13zcLJIIJ, 0);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                float f = 4;
                C1668230tVt.LIZ(abstractC1676270tirLIZ, null, C1682520tsw.LJIIL(c.LJIILIIL(c1685760tyA, 48), f, 0.0f, f, f, 2), null, null, 0.0f, null, c13zcLJIIJ, 432, 120);
                if (!z2) {
                    j = C1685910tyP.LJIIJ;
                }
                float f2 = 32;
                float f3 = 28;
                c13zcLJIIJ = c13zcLJIIJ;
                C1668930tX1.LIZIZ(c1668880tWw, null, c.LJIILIIL(c1685760tyA, f2), j, f3, f3, false, c13zcLJIIJ, (i3 & 14) | 221616, 64);
                c13zcLJIIJ.LJJIIJZLJL(996703548);
                if (c1668880tWw3 != null) {
                    c13zcLJIIJ = c13zcLJIIJ;
                    C1668930tX1.LIZIZ(c1668880tWw3, null, c.LJIILIIL(c1685760tyA, f2), 0L, f3, f3, false, c13zcLJIIJ, 221616, 72);
                }
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI2 = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI2 != null) {
            c20030013YsLJJJJZI2.LIZLLL = new AwS1S0312000_25(c1668880tWw, interfaceC1685750ty9, c1668880tWw3, z2, i, i2, 3);
        }
    }

    public static final void LIZIZ(C1668880tWw c1668880tWw, InterfaceC1685750ty9 interfaceC1685750ty9, C1668880tWw c1668880tWw2, boolean z, long j, C1665990tSH c1665990tSH, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z2;
        AbstractC1676270tir abstractC1676270tirLIZ;
        long j2;
        int i3;
        int i4;
        int i5;
        boolean zLJII;
        int i6;
        int i7;
        boolean zLJII2;
        int i8;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1067172611);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zLJII2 = c13zcLJIIJ.LJJIIJ(c1668880tWw);
            } else {
                zLJII2 = c13zcLJIIJ.LJII(c1668880tWw);
            }
            if (zLJII2) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(c1668880tWw2);
            } else {
                zLJII = c13zcLJIIJ.LJII(c1668880tWw2);
            }
            if (zLJII) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i5 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJIJJ(j)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1665990tSH)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((74899 & i2) == 74898 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ == C1680510tph.LIZIZ) {
                objLJJ = context.getDrawable(R.drawable.au5);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            Drawable drawable = (Drawable) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            C1677050tk7 c1677050tk7 = C1666870tTh.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJI = c.LJI(c.LJIILLIIL(interfaceC1685750ty9, 56), c1665990tSH.LIZIZ);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LJFF, false);
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
                if (LIZIZ) {
                    c13zcLJIIJ.LJJIIJZLJL(-1031128608);
                    abstractC1676270tirLIZ = C1668830tWr.LIZIZ(drawable, c13zcLJIIJ);
                    z2 = false;
                } else {
                    c13zcLJIIJ.LJJIIJZLJL(-1031127232);
                    z2 = false;
                    abstractC1676270tirLIZ = C1A46.LIZ(R.drawable.au5, c13zcLJIIJ, 0);
                }
                c13zcLJIIJ.LJJJJL(z2);
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                float f = 4;
                C1668230tVt.LIZ(abstractC1676270tirLIZ, null, C1682520tsw.LJIIL(c.LJIIJ(c1685760tyA, 50), f, 0.0f, f, f, 2), null, null, 0.0f, null, c13zcLJIIJ, 432, 120);
                if (z) {
                    j2 = j;
                } else {
                    j2 = C1685910tyP.LJIIJ;
                }
                InterfaceC1685750ty9 interfaceC1685750ty9LJIILIIL = c.LJIILIIL(c1685760tyA, c1665990tSH.LIZ);
                float f2 = c1665990tSH.LIZ;
                C1668930tX1.LIZIZ(c1668880tWw, null, interfaceC1685750ty9LJIILIIL, j2, f2, f2, false, c13zcLJIIJ, (i2 & 14) | 48, 64);
                c13zcLJIIJ.LJJIIJZLJL(-1031107354);
                if (c1668880tWw2 != null) {
                    InterfaceC1685750ty9 interfaceC1685750ty9LJIILIIL2 = c.LJIILIIL(c1685760tyA, c1665990tSH.LIZ);
                    float f3 = c1665990tSH.LIZ;
                    C1668930tX1.LIZIZ(c1668880tWw2, null, interfaceC1685750ty9LJIILIIL2, 0L, f3, f3, false, c13zcLJIIJ, 48, 72);
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
            c20030013YsLJJJJZI.LIZLLL = new C1665980tSG(c1668880tWw, interfaceC1685750ty9, c1668880tWw2, z, j, c1665990tSH, i);
        }
    }
}
