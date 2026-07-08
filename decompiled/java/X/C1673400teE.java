package X;

import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import p2.g;

/* JADX INFO: renamed from: X.0teE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1673400teE {
    public static final void LIZ(final C1668880tWw c1668880tWw, final float f, final float f2, final long j, InterfaceC1680500tpg interfaceC1680500tpg, final int i) {
        int i2;
        C1668880tWw c1668880tWw2;
        int i3;
        int i4;
        int i5;
        int i6;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-104438524);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1668880tWw)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIJ(f)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIJ(f2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIJJ(j)) {
                i3 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJJIIJZLJL(-1581169781);
            if (Intrinsics.LJFF(c1668880tWw, C1668100tVg.LIZ)) {
                c1668880tWw2 = C1670400tZO.LIZLLL(c13zcLJIIJ).LJIILIIL;
            } else {
                c1668880tWw2 = c1668880tWw;
            }
            c13zcLJIIJ.LJJJJL(false);
            int i7 = (i2 & 7168) | 48;
            int i8 = i2 << 9;
            C1668930tX1.LIZ(c1668880tWw2, "", null, j, f, f2, false, c13zcLJIIJ, i7 | (57344 & i8) | (i8 & 458752), 68);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0teH
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C1668880tWw c1668880tWw3 = c1668880tWw;
                    float f3 = f;
                    float f4 = f2;
                    long j2 = j;
                    int i9 = i;
                    ((Integer) obj2).intValue();
                    C1673400teE.LIZ(c1668880tWw3, f3, f4, j2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i9 | 1));
                    return Unit.LIZ;
                }
            };
        }
    }

    public static final void LIZIZ(final String str, final long j, final C1668880tWw c1668880tWw, final C1668880tWw c1668880tWw2, final InterfaceC1673420teG interfaceC1673420teG, final long j2, final long j3, InterfaceC1680500tpg interfaceC1680500tpg, final int i) {
        int i2;
        float f;
        C13ZC c13zc;
        boolean z;
        C443120HZe c443120HZe;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(561191261);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIJJ(j)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1668880tWw)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i2 |= i9;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1668880tWw2)) {
                i8 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1673420teG)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJIJJ(j2)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJIJJ(j3)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((i2 & 599187) == 599186 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
            c13zc = c13zcLJIIJ;
        } else {
            InterfaceC1679150tnV interfaceC1679150tnVLIZJ = interfaceC1673420teG.LIZJ();
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC1685750ty9 interfaceC1685750ty9LJII = C1682520tsw.LJII(c.LJIJJLI(c1685760tyA, C1668040tVa.LJIILJJIL, false), interfaceC1679150tnVLIZJ);
            C1679940tom c1679940tom = C1679930tol.LJ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(c1679940tom, C1668040tVa.LJIIJJI, c13zcLJIIJ, 54);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJII);
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
                if (str.length() == 0) {
                    f = 0;
                } else {
                    f = 4;
                }
                c13zcLJIIJ.LJJIIJZLJL(-1695078201);
                C1668880tWw c1668880tWw3 = C1668100tVg.LIZ;
                if (!Intrinsics.LJFF(c1668880tWw, c1668880tWw3)) {
                    int i12 = i2 >> 6;
                    int i13 = (i12 & 14) | 48 | (i12 & 7168);
                    c13zc = c13zcLJIIJ;
                    C1668930tX1.LIZIZ(c1668880tWw, "", C1682520tsw.LJIIL(c1685760tyA, 0.0f, 0.0f, f, 0.0f, 11), j2, interfaceC1673420teG.LJI(), interfaceC1673420teG.LIZ(), false, c13zcLJIIJ, i13, 64);
                } else {
                    c13zc = c13zcLJIIJ;
                }
                c13zc.LJJJJL(false);
                c13zc.LJJIIJZLJL(-1695064544);
                if (str.length() > 0) {
                    C1693430uAX c1693430uAXLJ = interfaceC1673420teG.LJ();
                    c13zc.LJJIIJZLJL(-1695060684);
                    long j4 = C1682440tso.LIZJ;
                    if (!C1682440tso.LIZ(j, j4)) {
                        EnumC1671200tag enumC1671200tag = EnumC1671200tag.Ltr;
                        float fLIZ = interfaceC1679150tnVLIZJ.LIZ(enumC1671200tag) + interfaceC1679150tnVLIZJ.LIZJ(enumC1671200tag);
                        if (Intrinsics.LJFF(c1668880tWw, c1668880tWw3)) {
                            i4 = 0;
                            i3 = 1;
                        } else {
                            i3 = 1;
                            i4 = (!Intrinsics.LJFF(c1668880tWw2, c1668880tWw3) ? 1 : 0) + 1;
                        }
                        float fLIZIZ = (interfaceC1673420teG.LIZIZ() - fLIZ) - ((interfaceC1673420teG.LJI() + f) * i4);
                        int iLJLLJ = ((InterfaceC1690500u5o) c13zc.LJJIL(C20055113dV.LJII)).LJLLJ(fLIZIZ);
                        float fLIZLLL = C1682440tso.LIZLLL(j);
                        if (fLIZLLL < 10.0f) {
                            fLIZLLL = 10.0f;
                        }
                        long jLIZLLL = C1682430tsn.LIZLLL(fLIZLLL);
                        C1691540u7U c1691540u7ULIZ = C1672580tcu.LIZ(0, 0, i3, c13zc);
                        C1693430uAX c1693430uAXLIZ = C1693430uAX.LIZ(0, 0, 16777213, 0L, jLIZLLL, 0L, 0L, null, c1693430uAXLJ, null, null);
                        if (C1691540u7U.LIZ(c1691540u7ULIZ, str, c1693430uAXLIZ, 1, C1682390tsj.LIZ(iLJLLJ, iLJLLJ, 0, Integer.MAX_VALUE), 972).LJ()) {
                            c443120HZe = new C443120HZe(c1687980u1k.LIZ(c1685760tyA, 1.0f, false), new C1682440tso(j4), c1693430uAXLIZ);
                        } else {
                            c443120HZe = new C443120HZe(c.LJIJ(c1685760tyA, 0.0f, fLIZIZ, 1), new C1682440tso(jLIZLLL), c1693430uAXLJ);
                        }
                    } else {
                        c443120HZe = new C443120HZe(c1687980u1k.LIZ(c1685760tyA, 1.0f, false), new C1682440tso(j4), c1693430uAXLJ);
                    }
                    c13zc.LJJJJL(false);
                    C1685190txF.LIZ(str, (InterfaceC1685750ty9) c443120HZe.getFirst(), j3, (C1693430uAX) c443120HZe.getThird(), ((C1682440tso) c443120HZe.getSecond()).LIZ, 3, 2, false, 1, null, null, c13zc, (i2 & 14) | 102236160 | ((i2 >> 12) & 896), 0, 1664);
                }
                c13zc.LJJJJL(false);
                c13zc.LJJIIJZLJL(-1694993499);
                if (!Intrinsics.LJFF(c1668880tWw2, c1668880tWw3)) {
                    z = true;
                    C1668930tX1.LIZIZ(c1668880tWw2, "", C1682520tsw.LJIIL(c1685760tyA, f, 0.0f, 0.0f, 0.0f, 14), j2, interfaceC1673420teG.LJI(), interfaceC1673420teG.LIZ(), false, c13zc, ((i2 >> 9) & 14) | 48 | ((i2 >> 6) & 7168), 64);
                } else {
                    z = true;
                }
                c13zc.LJJJJL(false);
                c13zc.LJJJJL(z);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zc.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0teI
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    long j5 = j;
                    C1668880tWw c1668880tWw4 = c1668880tWw;
                    C1668880tWw c1668880tWw5 = c1668880tWw2;
                    InterfaceC1673420teG interfaceC1673420teG2 = interfaceC1673420teG;
                    long j6 = j2;
                    long j7 = j3;
                    int i14 = i;
                    ((Integer) obj2).intValue();
                    C1673400teE.LIZIZ(str2, j5, c1668880tWw4, c1668880tWw5, interfaceC1673420teG2, j6, j7, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i14 | 1));
                    return Unit.LIZ;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0tpg, X.13ZC] */
    /* JADX WARN: Type inference failed for: r30v1, types: [X.0teJ] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.0teJ] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static final void LIZJ(final Function0<Unit> function0, final String str, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z, long j, boolean z2, InterfaceC595010NVj interfaceC595010NVj, C1668880tWw c1668880tWw, C1668880tWw c1668880tWw2, InterfaceC1673420teG interfaceC1673420teG, InterfaceC1673450teJ interfaceC1673450teJ, C1668880tWw c1668880tWw3, boolean z3, InterfaceC1680500tpg interfaceC1680500tpg, final int i, final int i2, final int i3) {
        int i4;
        int i5;
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
        boolean z4;
        ?? r3;
        int i17;
        int i18;
        boolean z5 = z3;
        C1668880tWw c1668880tWw4 = c1668880tWw3;
        ?? LIZ = interfaceC1673450teJ;
        C1668880tWw c1668880tWw5 = c1668880tWw2;
        C1668880tWw c1668880tWw6 = c1668880tWw;
        InterfaceC595010NVj interfaceC595010NVj2 = interfaceC595010NVj;
        boolean z6 = z2;
        boolean z7 = z;
        InterfaceC1673420teG interfaceC1673420teGLIZIZ = interfaceC1673420teG;
        long j2 = j;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        ?? LJIIJ = interfaceC1680500tpg.LJIIJ(-726780628);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            if (LJIIJ.LJII(function0)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            if (LJIIJ.LJJIIJ(str)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        int i19 = i3 & 4;
        if (i19 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            if (LJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        int i20 = i3 & 8;
        if (i20 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            if (LJIIJ.LJIIZILJ(z7)) {
                i8 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        int i21 = i3 & 16;
        if (i21 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            if (LJIIJ.LJIJJ(j2)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i4 |= i9;
        }
        int i22 = i3 & 32;
        if (i22 != 0) {
            i4 |= 196608;
        } else if ((196608 & i) == 0) {
            if (LJIIJ.LJIIZILJ(z6)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i4 |= i10;
        }
        int i23 = i3 & 64;
        if (i23 != 0) {
            i4 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (LJIIJ.LJJIIJ(interfaceC595010NVj2)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i4 |= i11;
        }
        int i24 = i3 & 128;
        if (i24 != 0) {
            i4 |= 12582912;
        } else if ((12582912 & i) == 0) {
            if (LJIIJ.LJJIIJ(c1668880tWw6)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i4 |= i12;
        }
        int i25 = i3 & 256;
        if (i25 != 0) {
            i4 |= 100663296;
        } else if ((100663296 & i) == 0) {
            if (LJIIJ.LJJIIJ(c1668880tWw5)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i4 |= i13;
        }
        if ((805306368 & i) == 0) {
            if ((i3 & 512) == 0 && LJIIJ.LJJIIJ(interfaceC1673420teGLIZIZ)) {
                i18 = 536870912;
            } else {
                i18 = 268435456;
            }
            i4 |= i18;
        }
        if ((i2 & 6) == 0) {
            if ((i3 & 1024) == 0 && LJIIJ.LJJIIJ(LIZ)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i14 = i2 | i17;
        } else {
            i14 = i2;
        }
        int i26 = i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        if (i26 != 0) {
            i14 |= 48;
        } else if ((i2 & 48) == 0) {
            if (LJIIJ.LJJIIJ(c1668880tWw4)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i14 |= i15;
        }
        int i27 = i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        if (i27 != 0) {
            i14 |= 384;
        } else if ((i2 & 384) == 0) {
            if (LJIIJ.LJIIZILJ(z5)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i14 |= i16;
        }
        if ((i4 & 306783379) == 306783378 && (i14 & 147) == 146 && LJIIJ.LIZ()) {
            LJIIJ.LIZJ();
            r3 = LIZ;
        } else {
            LJIIJ.LJLI();
            if ((i & 1) != 0 && !LJIIJ.LJJLIIIIJ()) {
                LJIIJ.LIZJ();
            } else {
                if (i19 != 0) {
                    interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
                }
                if (i20 != 0) {
                    z7 = true;
                }
                if (i21 != 0) {
                    j2 = C1682440tso.LIZJ;
                }
                if (i22 != 0) {
                    z6 = false;
                }
                if (i23 != 0) {
                    interfaceC595010NVj2 = null;
                }
                if (i24 != 0) {
                    c1668880tWw6 = C1668100tVg.LIZ;
                }
                if (i25 != 0) {
                    c1668880tWw5 = C1668100tVg.LIZ;
                }
                if ((i3 & 512) != 0) {
                    interfaceC1673420teGLIZIZ = C1666920tTm.LIZIZ(0.0f, 0.0f, null, 0.0f, LJIIJ, 24576, 15);
                }
                LIZ = LIZ;
                if ((i3 & 1024) != 0) {
                    LIZ = C1666340tSq.LIZ(0L, 0L, 0.0f, 0L, LJIIJ, 196608, 31);
                }
                if (i26 != 0) {
                    c1668880tWw4 = C1668100tVg.LIZ;
                }
                if (i27 != 0) {
                    z5 = false;
                }
            }
            LJIIJ.LJJJJLI();
            C05P0 c05p0LIZIZ = LIZ.LIZIZ(z7, LJIIJ);
            C05P0 c05p0LIZ = LIZ.LIZ(LJIIJ);
            final C05P0 c05p0LIZLLL = LIZ.LIZLLL(LJIIJ);
            final C05P0 c05p0LIZJ = LIZ.LIZJ(LJIIJ);
            float fLIZLLL = interfaceC1673420teGLIZIZ.LIZLLL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1665900tS8.LIZ(c.LJIIIIZZ(c.LJIIZILJ(interfaceC1685750ty92, interfaceC1673420teGLIZIZ.LIZIZ(), interfaceC1673420teGLIZIZ.LJFF()), interfaceC1673420teGLIZIZ.LJII(), 0.0f, 2), ((Number) c05p0LIZIZ.getValue()).floatValue());
            C1680230tpF c1680230tpFLIZIZ = C1673460teK.LIZIZ(fLIZLLL, LJIIJ, 0);
            if (!z7 && !z6) {
                z4 = false;
            } else {
                z4 = true;
            }
            final boolean z8 = z5;
            final boolean z9 = z7;
            final C1668880tWw c1668880tWw7 = c1668880tWw4;
            final InterfaceC1673420teG interfaceC1673420teG2 = interfaceC1673420teGLIZIZ;
            final long j3 = j2;
            final C1668880tWw c1668880tWw8 = c1668880tWw6;
            final C1668880tWw c1668880tWw9 = c1668880tWw5;
            C1668270tVx.LIZ(C634380OuS.LIZ(interfaceC1685750ty9LIZ, interfaceC595010NVj2, c1680230tpFLIZIZ, z4, null, new C20279814Wu(0), function0), C1669050tXD.LIZIZ(fLIZLLL), ((C1685910tyP) c05p0LIZ.getValue()).LIZ, null, 0, C13Z4.LIZJ(817863471, new Function2<InterfaceC1680500tpg, Integer, Unit>() { // from class: X.0teF
                @Override // kotlin.jvm.functions.Function2
                public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg2, Integer num) {
                    InterfaceC1680500tpg interfaceC1680500tpg3 = interfaceC1680500tpg2;
                    if ((num.intValue() & 3) == 2 && interfaceC1680500tpg3.LIZ()) {
                        interfaceC1680500tpg3.LIZJ();
                    } else if (z8 && z9) {
                        interfaceC1680500tpg3.LJJIIJZLJL(-378766275);
                        C1673400teE.LIZ(c1668880tWw7, interfaceC1673420teG2.LJI(), interfaceC1673420teG2.LIZ(), c05p0LIZLLL.getValue().LIZ, interfaceC1680500tpg3, 0);
                        interfaceC1680500tpg3.LJ();
                    } else {
                        interfaceC1680500tpg3.LJJIIJZLJL(-378643143);
                        C1673400teE.LIZIZ(str, j3, c1668880tWw8, c1668880tWw9, interfaceC1673420teG2, c05p0LIZLLL.getValue().LIZ, c05p0LIZJ.getValue().LIZ, interfaceC1680500tpg3, 0);
                        interfaceC1680500tpg3.LJ();
                    }
                    return Unit.LIZ;
                }
            }, LJIIJ), LJIIJ, 221184, 8);
            r3 = LIZ;
        }
        C20030013Ys c20030013YsLJJJJZI = LJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            final long j4 = j2;
            final boolean z10 = z6;
            final InterfaceC595010NVj interfaceC595010NVj3 = interfaceC595010NVj2;
            final C1668880tWw c1668880tWw10 = c1668880tWw6;
            final C1668880tWw c1668880tWw11 = c1668880tWw5;
            final InterfaceC1673420teG interfaceC1673420teG3 = interfaceC1673420teGLIZIZ;
            final ?? r30 = r3;
            final C1668880tWw c1668880tWw12 = c1668880tWw4;
            final boolean z11 = z5;
            final InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            final boolean z12 = z7;
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0MAC
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Function0 function02 = function0;
                    String str2 = str;
                    InterfaceC1685750ty9 interfaceC1685750ty94 = interfaceC1685750ty93;
                    boolean z13 = z12;
                    long j5 = j4;
                    boolean z14 = z10;
                    InterfaceC595010NVj interfaceC595010NVj4 = interfaceC595010NVj3;
                    C1668880tWw c1668880tWw13 = c1668880tWw10;
                    C1668880tWw c1668880tWw14 = c1668880tWw11;
                    InterfaceC1673420teG interfaceC1673420teG4 = interfaceC1673420teG3;
                    InterfaceC1673450teJ interfaceC1673450teJ2 = r30;
                    C1668880tWw c1668880tWw15 = c1668880tWw12;
                    boolean z15 = z11;
                    int i28 = i;
                    int i29 = i2;
                    int i30 = i3;
                    ((Integer) obj2).intValue();
                    C1673400teE.LIZJ(function02, str2, interfaceC1685750ty94, z13, j5, z14, interfaceC595010NVj4, c1668880tWw13, c1668880tWw14, interfaceC1673420teG4, interfaceC1673450teJ2, c1668880tWw15, z15, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i28 | 1), C341440Da2.LIZ(i29), i30);
                    return Unit.LIZ;
                }
            };
        }
    }
}
