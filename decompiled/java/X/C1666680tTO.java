package X;

import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS3S1202000_25;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS68S0001000_19;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tTO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666680tTO {
    public static final void LIZJ(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(438281577);
        if (i == 0 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C20084413iE.LIZ(0, 6, c13zcLJIIJ, null, new AwS598S0100000_19(new C013C(), 581), null);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS68S0001000_19(i, 1);
        }
    }

    public static final void LIZ(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, String str, Function0 function0) {
        int i3;
        int i4;
        int i5;
        int i6;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-236224177);
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
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
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
        if ((i3 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i7 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIIIZZ = C1682520tsw.LJIIIIZZ(C1675980tiO.LIZIZ(c.LJ(interfaceC1685750ty92, 1.0f), C1670400tZO.LIZIZ(c13zcLJIIJ).U2(), C1669430tXp.LIZ), 16);
            C1679960too c1679960too = C1679930tol.LJI;
            InterfaceC1668050tVb.LIZ.getClass();
            C1296880jqw c1296880jqw = C1668040tVa.LJIIJ;
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(c1679960too, c1296880jqw, c13zcLJIIJ, 54);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIIIZZ);
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
                C1685190txF.LIZ(str, c1687980u1k.LIZ(interfaceC1685750ty92, 1.0f, true), 0L, null, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, i3 & 14, 0, 2044);
                float f = 14;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIILIIL = c.LJIILIIL(C634380OuS.LIZJ(c1687980u1k.LIZIZ(InterfaceC1685750ty9.LIZ, c1296880jqw), false, null, function0, 7), f);
                InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LJFF, false);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIILIIL);
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
                    C1668930tX1.LIZIZ(C1669660tYC.Z, null, null, 0L, f, f, false, c13zcLJIIJ, 221232, 76);
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
            c20030013YsLJJJJZI.LIZLLL = new AwS3S1202000_25(i, i2, interfaceC1685750ty92, str, function0, 4);
        }
    }

    public static final void LIZIZ(String str, Boolean bool, String str2, boolean z, boolean z2, boolean z3, Function1<? super String, Unit> function1, Function0<Unit> function0, InterfaceC1685750ty9 interfaceC1685750ty9, List<C1666650tTL> list, List<String> list2, Function0<Unit> function02, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2, int i3) {
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
        int i17;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        List<String> list3 = list2;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        List<C1666650tTL> list4 = list;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-2029112490);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
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
            if (c13zcLJIIJ.LJJIIJ(bool)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i8 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i4 |= i9;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z3)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i4 |= i10;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i4 |= i11;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i4 |= i12;
        }
        int i18 = i3 & 256;
        if (i18 != 0) {
            i4 |= 100663296;
        } else if ((100663296 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i4 |= i13;
        }
        int i19 = i3 & 512;
        if (i19 != 0) {
            i4 |= 805306368;
        } else if ((805306368 & i) == 0) {
            if (c13zcLJIIJ.LJII(list4)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i4 |= i14;
        }
        int i20 = i3 & 1024;
        if (i20 != 0) {
            i15 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJII(list3)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i15 = i2 | i16;
        } else {
            i15 = i2;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i15 |= 48;
        } else if ((i2 & 48) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i15 |= i17;
        }
        if ((i4 & 306783379) == 306783378 && (i15 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i18 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i19 != 0) {
                list4 = C13BV.INSTANCE;
            }
            if (i20 != 0) {
                list3 = C13BV.INSTANCE;
            }
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(Boolean.valueOf(z3));
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            float f = 8;
            float f2 = 16;
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(interfaceC1685750ty92, 1.0f);
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1680030tov, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJ);
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
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                if (objLJJ2 == c1680520tpi) {
                    objLJJ2 = AFwS257S0000000_19.get$arr$(635);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                Function1 function12 = (Function1) objLJJ2;
                c13zcLJIIJ.LJJJJL(false);
                c13zcLJIIJ.LJJIIJZLJL(-1224400529);
                if ((i4 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((i4 & 112) == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z13 = z4 | z5;
                if ((i4 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z14 = z13 | z6;
                if ((i4 & 7168) == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z15 = z14 | z7;
                if ((i15 & 112) == 32) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z16 = z15 | z8;
                if ((57344 & i4) == 16384) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z17 = z16 | z9;
                if ((29360128 & i4) == 8388608) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z18 = z17 | z10;
                Object objLJJ3 = c13zcLJIIJ.LJJ();
                if (z18 || objLJJ3 == c1680520tpi) {
                    objLJJ3 = new C1800520wxG(str, bool, str2, z, z2, function02, function0);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                }
                c13zcLJIIJ.LJJJJL(false);
                C20084413iE.LIZ(6, 2, c13zcLJIIJ, null, function12, (Function1) objLJJ3);
                InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1686320tz4.LIZ(c.LJ(interfaceC1685750ty92, 1.0f), C1673990tfB.LIZLLL(c13zcLJIIJ), null);
                c13zcLJIIJ.LJJIIJZLJL(-1224400529);
                boolean zLJII = c13zcLJIIJ.LJII(list4);
                if ((234881024 & i4) == 67108864) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z19 = z11 | zLJII;
                if ((i4 & 3670016) == 1048576) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean zLJII2 = z19 | z12 | c13zcLJIIJ.LJII(list3);
                Object objLJJ4 = c13zcLJIIJ.LJJ();
                if (zLJII2 || objLJJ4 == c1680520tpi) {
                    objLJJ4 = new C1666670tTN(list4, c05p0, interfaceC1685750ty92, f, f, function1, list3, f2);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ4);
                }
                c13zcLJIIJ.LJJJJL(false);
                C636400Oxi.LIZ(interfaceC1685750ty9LIZ, null, null, false, null, null, null, false, null, (Function1) objLJJ4, c13zcLJIIJ, 0, 510);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1244950iVB(str, bool, str2, z, z2, z3, function1, function0, interfaceC1685750ty92, list4, list3, function02, i, i2, i3);
        }
    }
}
