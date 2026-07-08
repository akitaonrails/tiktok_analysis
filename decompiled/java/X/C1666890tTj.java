package X;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tTj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666890tTj {
    public static final String LJFF(long j) {
        return C786410Ut5.j4("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(j / 1.073741824E9d)}, 1));
    }

    public static final void LJ(String str, String str2, InterfaceC1631630sYr<? super String, ? super String, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631630sYr, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(287646612);
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
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631630sYr)) {
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
            C1669400tXm c1669400tXmLIZIZ = C1669050tXD.LIZIZ(18);
            long j = C1685910tyP.LIZIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1675890tiF.LIZ(C1675980tiO.LIZIZ(C1667200tUE.LIZ(C1679640toI.LIZ(c.LJIIJJI(interfaceC1685750ty92, 73, 98), 7, c1669400tXmLIZIZ, false, C1685910tyP.LIZJ(0.528f, j), C1685910tyP.LIZJ(0.528f, j)), c1669400tXmLIZIZ), C1670400tZO.LIZIZ(c13zcLJIIJ).G2(), C1669430tXp.LIZ), 3, C1670400tZO.LIZIZ(c13zcLJIIJ).G3(), c1669400tXmLIZIZ);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ);
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
                interfaceC1631630sYr.invoke(str, str2, c13zcLJIIJ, Integer.valueOf((i3 & 896) | (i3 & 14) | (i3 & 112)));
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C562530M4l(str, str2, interfaceC1631630sYr, interfaceC1685750ty92, i, i2);
        }
    }

    public static final void LIZ(C0M22 c0m22, int i, long j, int i2, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        String strLIZLLL;
        long jG3;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-107002067);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c0m22)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i5 = i6 | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i5 |= i7;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            if (c13zcLJIIJ.LJIJJ(j)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i5 |= i8;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            if (c13zcLJIIJ.LJIJI(i2)) {
                i9 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i9 = 1024;
            }
            i5 |= i9;
        }
        int i11 = i4 & 16;
        if (i11 != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i5 |= i10;
        }
        if ((i5 & 9363) == 9362 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i11 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (c0m22 instanceof C0M20) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(i);
                sbLIZ.append(" Drafts");
                strLIZLLL = C2188811AlT.LIZIZ(sbLIZ);
            } else if (c0m22 instanceof C561890M1z) {
                strLIZLLL = C1666770tTX.LIZLLL(j);
            } else {
                throw new C1954807lC();
            }
            c13zcLJIIJ.LJJIIJZLJL(250242975);
            C1692230u8b c1692230u8b = new C1692230u8b();
            int iLJIIJJI = c1692230u8b.LJIIJJI(new C1693450uAZ(C1670400tZO.LIZIZ(c13zcLJIIJ).K3(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            try {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(i2);
                sbLIZ2.append(" Months ago · ");
                c1692230u8b.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
                c1692230u8b.LJII(iLJIIJJI);
                iLJIIJJI = c1692230u8b.LJIIJJI(new C1693450uAZ(C1670400tZO.LIZIZ(c13zcLJIIJ).V2(), 0L, C1680190tpB.LLIZLLLIL, null, null, null, null, 0L, null, null, null, 0L, null, null, 65530));
                try {
                    c1692230u8b.LIZLLL(strLIZLLL);
                    c1692230u8b.LJII(iLJIIJJI);
                    C1692220u8a c1692220u8aLJIIL = c1692230u8b.LJIIL();
                    c13zcLJIIJ.LJJJJL(false);
                    if ((((Configuration) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZ)).uiMode & 48) == 32) {
                        c13zcLJIIJ.LJJIIJZLJL(250271004);
                        jG3 = ((C1685910tyP) ((C13FE) C1670400tZO.LIZIZ(c13zcLJIIJ).Y3).getValue()).LIZ;
                    } else {
                        c13zcLJIIJ.LJJIIJZLJL(250272185);
                        jG3 = C1670400tZO.LIZIZ(c13zcLJIIJ).G3();
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    InterfaceC1685750ty9 interfaceC1685750ty9LJIIIZ = c.LJIIIZ(interfaceC1685750ty92, (float) 78.755d);
                    InterfaceC1668050tVb.LIZ.getClass();
                    C1296870jqv c1296870jqv = C1668040tVa.LIZIZ;
                    InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(c1296870jqv, false);
                    int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIIZ);
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
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, aFwS311S0000000_25);
                        AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                        C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                        AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                        if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                            c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                            c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                        }
                        AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                        C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                        C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                        InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1666440tT0.LIZ(c.LJIIIZ(c1672220tcK.LIZIZ(c1685760tyA, c1296870jqv), (float) 43.274d), 12.8f);
                        InterfaceC20053113dB interfaceC20053113dBLIZLLL2 = k.LIZLLL(c1296870jqv, false);
                        int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                        C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                        InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ);
                        if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                            c13zcLJIIJ.LJJIII();
                            if (c13zcLJIIJ.LJJJI) {
                                c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                            } else {
                                c13zcLJIIJ.LJIILJJIL();
                            }
                            C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL2, aFwS311S0000000_25);
                            C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                            if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                                c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                                c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                            }
                            C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                            float f = 12;
                            C1669400tXm c1669400tXmLIZIZ = C1669050tXD.LIZIZ(f);
                            long j2 = C1685910tyP.LIZIZ;
                            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(C1679640toI.LIZ(c.LJI(c1672220tcK.LIZIZ(c1685760tyA, c1296870jqv), (float) 32.744d), 7, c1669400tXmLIZIZ, false, C1685910tyP.LIZJ(0.528f, j2), C1685910tyP.LIZJ(0.528f, j2)), jG3, C1669050tXD.LIZIZ(f));
                            InterfaceC20053113dB interfaceC20053113dBLIZLLL3 = k.LIZLLL(c1296870jqv, false);
                            int iLIZ3 = C0MXE.LIZ(c13zcLJIIJ);
                            C13D2 c13d2LJJJIL3 = c13zcLJIIJ.LJJJIL();
                            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZIZ);
                            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                                c13zcLJIIJ.LJJIII();
                                if (c13zcLJIIJ.LJJJI) {
                                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                                } else {
                                    c13zcLJIIJ.LJIILJJIL();
                                }
                                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL3, aFwS311S0000000_25);
                                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL3, aFwS311S0000000_252);
                                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ3))) {
                                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ3));
                                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ3), aFwS311S0000000_253);
                                }
                                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL3, aFwS311S0000000_254);
                                C1685190txF.LIZIZ(c1692220u8aLJIIL, C1682520tsw.LJIIIZ(c1672220tcK.LIZIZ(c1685760tyA, C1668040tVa.LJFF), f, 8), 0L, C1693430uAX.LIZ(0, 0, 16777207, 0L, 0L, 0L, 0L, null, C1670400tZO.LJ(c13zcLJIIJ).LJIJ, new C1693240uAE(1), null), 0L, 3, 0, false, 1, null, null, c13zcLJIIJ, 113246208, 0, 1620);
                                c13zcLJIIJ.LJJJJL(true);
                                AbstractC1676270tir abstractC1676270tirLIZ = C1A46.LIZ(R.drawable.biw, c13zcLJIIJ, 0);
                                InterfaceC1671600tbK.LIZ.getClass();
                                C1668230tVt.LIZ(abstractC1676270tirLIZ, null, C1666440tT0.LIZ(c.LJIIJJI(C1688600u2k.LIZLLL(c1672220tcK.LIZIZ(c1685760tyA, C1668040tVa.LJIIIIZZ), 0.0f, (float) (-2.5d), 1), 13, 10), -12.8f), null, C1671610tbL.LJFF, 0.0f, null, c13zcLJIIJ, 24624, 104);
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
                    } else {
                        C0MXE.LIZIZ();
                        throw null;
                    }
                } finally {
                }
            } finally {
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1666760tTW(c0m22, i, j, i2, interfaceC1685750ty92, i3, i4);
        }
    }

    public static final void LIZLLL(C0M22 c0m22, List<C0M0P> list, int i, long j, int i2, float f, InterfaceC1631630sYr<? super String, ? super String, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631630sYr, InterfaceC1680500tpg interfaceC1680500tpg, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-643897280);
        C0M22 c0m222 = c0m22;
        if ((i3 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c0m222)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i4 = i11 | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            if (c13zcLJIIJ.LJII(list)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i4 |= i10;
        }
        if ((i3 & 384) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i4 |= i9;
        }
        if ((i3 & 3072) == 0) {
            if (c13zcLJIIJ.LJIJJ(j)) {
                i8 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        if ((i3 & 24576) == 0) {
            if (c13zcLJIIJ.LJIJI(i2)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i4 |= i7;
        }
        if ((196608 & i3) == 0) {
            if (c13zcLJIIJ.LJIJ(f)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i4 |= i6;
        }
        if ((1572864 & i3) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631630sYr)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i4 |= i5;
        }
        if ((i4 & 599187) == 599186 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            float f2 = 342;
            float f3 = 146;
            float f4 = f - 4;
            float f5 = f4 / f2;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1688600u2k.LIZLLL(c.LJIIJJI(InterfaceC1685750ty9.LIZ, f4, f3 * f5), 0.0f, 6 * f5, 1);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZLLL);
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
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, g.a.LIZLLL);
                c0m222 = c0m222;
                C13ZT.LIZ(C20055113dV.LJIILIIL.LIZJ(EnumC1671200tag.Ltr), C13Z4.LIZJ(1854779270, new C1666750tTV(f2, f3, f5, list, interfaceC1631630sYr, c0m222, i, j, i2), c13zcLJIIJ), c13zcLJIIJ, 56);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C562460M4e(c0m222, list, i, j, i2, f, interfaceC1631630sYr, i3);
        }
    }

    public static final void LIZJ(C0M22 c0m22, int i, int i2, long j, long j2, int i3, List<C0M0P> list, InterfaceC1631630sYr<? super String, ? super String, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631630sYr, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, InterfaceC1680500tpg interfaceC1680500tpg, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1069996959);
        int i18 = 4;
        C0M22 c0m222 = c0m22;
        if ((i4 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c0m222)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i6 = i17 | i4;
        } else {
            i6 = i4;
        }
        int i19 = i;
        if ((i4 & 48) == 0) {
            if (c13zcLJIIJ.LJIJI(i19)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i6 |= i16;
        }
        if ((i4 & 384) == 0) {
            if (c13zcLJIIJ.LJIJI(i2)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i6 |= i15;
        }
        if ((i4 & 3072) == 0) {
            if (c13zcLJIIJ.LJIJJ(j)) {
                i14 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i14 = 1024;
            }
            i6 |= i14;
        }
        if ((i4 & 24576) == 0) {
            if (c13zcLJIIJ.LJIJJ(j2)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i6 |= i13;
        }
        if ((196608 & i4) == 0) {
            if (c13zcLJIIJ.LJIJI(i3)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i6 |= i12;
        }
        if ((1572864 & i4) == 0) {
            if (c13zcLJIIJ.LJII(list)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i6 |= i11;
        }
        if ((12582912 & i4) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631630sYr)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i6 |= i10;
        }
        if ((100663296 & i4) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i6 |= i9;
        }
        if ((805306368 & i4) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i6 |= i8;
        }
        if ((i5 & 6) == 0) {
            if (!c13zcLJIIJ.LJII(function03)) {
                i18 = 2;
            }
            i7 = i5 | i18;
        } else {
            i7 = i5;
        }
        if ((i6 & 306783379) == 306783378 && (i7 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            float f = 16;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIIZ = C1682520tsw.LJIIIZ(c.LJ(InterfaceC1685750ty9.LIZ, 1.0f), f, f);
            InterfaceC1668050tVb.LIZ.getClass();
            i19 = i19;
            c0m222 = c0m222;
            C1668160tVm.LIZ(interfaceC1685750ty9LJIIIZ, C1668040tVa.LJFF, false, C13Z4.LIZJ(-1415801463, new C1666720tTS(i2, i3, i19, j2, j, c0m222, list, function0, function02, function03, interfaceC1631630sYr), c13zcLJIIJ), c13zcLJIIJ, 3126, 4);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C0M42(c0m222, i19, i2, j, j2, i3, list, interfaceC1631630sYr, function0, function02, function03, i4, i5);
        }
    }

    public static final void LIZIZ(C0M22 c0m22, int i, int i2, long j, long j2, int i3, List<C0M0P> list, InterfaceC1631630sYr<? super String, ? super String, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631630sYr, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, InterfaceC1680500tpg interfaceC1680500tpg, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1468103267);
        C0M22 c0m222 = c0m22;
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c0m222)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i4;
        } else {
            i7 = i4;
        }
        int i21 = i;
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            if (c13zcLJIIJ.LJIJI(i21)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i7 |= i9;
        }
        int i22 = i2;
        if ((i6 & 4) != 0) {
            i7 |= 384;
        } else if ((i4 & 384) == 0) {
            if (c13zcLJIIJ.LJIJI(i22)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i7 |= i10;
        }
        if ((i6 & 8) != 0) {
            i7 |= 3072;
        } else if ((i4 & 3072) == 0) {
            if (c13zcLJIIJ.LJIJJ(j)) {
                i11 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i11 = 1024;
            }
            i7 |= i11;
        }
        if ((i6 & 16) != 0) {
            i7 |= 24576;
        } else if ((i4 & 24576) == 0) {
            if (c13zcLJIIJ.LJIJJ(j2)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i7 |= i12;
        }
        int i23 = i6 & 32;
        if (i23 != 0) {
            i7 |= 196608;
        } else if ((196608 & i4) == 0) {
            if (c13zcLJIIJ.LJIJI(i20)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i7 |= i13;
        }
        if ((i6 & 64) != 0) {
            i7 |= 1572864;
        } else if ((1572864 & i4) == 0) {
            if (c13zcLJIIJ.LJII(list)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i7 |= i14;
        }
        if ((i6 & 128) != 0) {
            i7 |= 12582912;
        } else if ((i4 & 12582912) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631630sYr)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i7 |= i15;
        }
        if ((i6 & 256) != 0) {
            i7 |= 100663296;
        } else if ((100663296 & i4) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i16 = 67108864;
            } else {
                i16 = 33554432;
            }
            i7 |= i16;
        }
        if ((i6 & 512) != 0) {
            i7 |= 805306368;
        } else if ((805306368 & i4) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i17 = 536870912;
            } else {
                i17 = 268435456;
            }
            i7 |= i17;
        }
        if ((i6 & 1024) != 0) {
            i18 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            if (c13zcLJIIJ.LJII(function03)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i18 = i5 | i19;
        } else {
            i18 = i5;
        }
        if ((i7 & 306783379) == 306783378 && (i18 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i23 != 0) {
                i20 = 6;
            }
            i21 = i21;
            i22 = i22;
            c0m222 = c0m222;
            C1672790tdF.LIZIZ(new C0NWK(), false, false, false, false, false, null, C1685910tyP.LJIIIZ, null, function0, false, 0L, 0L, null, C13Z4.LIZJ(-1961519763, new C0M43(i21, i22, i20, j, j2, c0m222, list, function0, function02, function03, interfaceC1631630sYr), c13zcLJIIJ), c13zcLJIIJ, 12582912 | (1879048192 & (i7 << 3)), 24582, 14718);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C0M41(c0m222, i21, i22, j, j2, i20, list, interfaceC1631630sYr, function0, function02, function03, i4, i5, i6);
        }
    }
}
