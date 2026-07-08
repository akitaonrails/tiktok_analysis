package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS0S0402201_25;

/* JADX INFO: renamed from: X.0tmj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678670tmj {
    public static final InterfaceC1685750ty9 LIZJ(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680710tq1 interfaceC1680710tq1, long j, C1668470tWH c1668470tWH, float f) {
        InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ;
        InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ2 = C1679640toI.LIZIZ(interfaceC1685750ty9, f, interfaceC1680710tq1, 0L, 0L, 24);
        if (c1668470tWH != null) {
            interfaceC1685750ty9LIZIZ = C1675890tiF.LIZIZ(c1668470tWH.LIZ, InterfaceC1685750ty9.LIZ, c1668470tWH.LIZIZ, interfaceC1680710tq1);
        } else {
            interfaceC1685750ty9LIZIZ = InterfaceC1685750ty9.LIZ;
        }
        return C1667200tUE.LIZ(C1675980tiO.LIZIZ(interfaceC1685750ty9LIZIZ2.LIZ(interfaceC1685750ty9LIZIZ), j, interfaceC1680710tq1), interfaceC1680710tq1);
    }

    public static final long LIZLLL(long j, InterfaceC1678720tmo interfaceC1678720tmo, float f, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        long jLIZ = j;
        interfaceC1680500tpg.LJJIJIIJIL(1561611256);
        if (C1685910tyP.LJ(jLIZ, C1680090tp1.LIZ(interfaceC1680500tpg).LJII()) && interfaceC1678720tmo != null) {
            jLIZ = interfaceC1678720tmo.LIZ(f, (i & 14) | ((i >> 3) & 112) | ((i << 3) & 896), jLIZ, interfaceC1680500tpg);
        }
        interfaceC1680500tpg.LJJIJLIJ();
        return jLIZ;
    }

    public static final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680710tq1 interfaceC1680710tq1, long j, long j2, C1668470tWH c1668470tWH, float f, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f2 = f;
        long jLIZIZ = j2;
        long jLJII = j;
        C1668470tWH c1668470tWH2 = c1668470tWH;
        InterfaceC1680710tq1 interfaceC1680710tq12 = interfaceC1680710tq1;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1412203386);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1680710tq12)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0 && c13zcLJIIJ.LJIJJ(jLJII)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i3 |= i10;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0 && c13zcLJIIJ.LJIJJ(jLIZIZ)) {
                i9 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i9 = 1024;
            }
            i3 |= i9;
        }
        int i13 = i2 & 16;
        if (i13 != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1668470tWH2)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        int i14 = i2 & 32;
        if (i14 != 0) {
            i3 |= 196608;
        } else if ((458752 & i) == 0) {
            if (c13zcLJIIJ.LJIJ(f2)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22 = function2;
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((3670016 & i) == 0) {
            if (c13zcLJIIJ.LJII(function22)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i3 |= i8;
        }
        if ((i3 & 2995931) == 599186 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
            } else {
                if (i11 != 0) {
                    interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
                }
                if (i12 != 0) {
                    interfaceC1680710tq12 = C1669430tXp.LIZ;
                }
                if ((i2 & 4) != 0) {
                    jLJII = C1680090tp1.LIZ(c13zcLJIIJ).LJII();
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    jLIZIZ = C1680070toz.LIZIZ(jLJII, c13zcLJIIJ);
                    i3 &= -7169;
                }
                if (i13 != 0) {
                    c1668470tWH2 = null;
                }
                if (i14 != 0) {
                    f2 = 0;
                }
            }
            c13zcLJIIJ.LJJJJLI();
            C13DQ c13dq = C1678700tmm.LIZIZ;
            float f3 = ((C1668650tWZ) c13zcLJIIJ.LJJIL(c13dq)).LL + f2;
            interfaceC1685750ty92 = interfaceC1685750ty92;
            function22 = function22;
            C13ZT.LIZIZ(new C13DO[]{C1680350tpR.LIZ.LIZJ(new C1685910tyP(jLIZIZ)), c13dq.LIZJ(new C1668650tWZ(f3))}, C13Z4.LIZIZ(c13zcLJIIJ, -1822160838, new C1678690tml(interfaceC1685750ty92, interfaceC1680710tq12, jLJII, f3, i3, c1668470tWH2, f2, function22)), c13zcLJIIJ, 56);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S0402201_25(interfaceC1685750ty92, (InterfaceC1685750ty9) interfaceC1680710tq12, (InterfaceC1680710tq1) jLJII, jLIZIZ, (long) c1668470tWH2, (C1668470tWH) f2, (float) function22, (Function2<? super InterfaceC1680500tpg, ? super Integer, Unit>) i, i2, 0);
        }
    }

    public static final void LIZIZ(Function0<Unit> function0, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z, InterfaceC1680710tq1 interfaceC1680710tq1, long j, long j2, C1668470tWH c1668470tWH, float f, InterfaceC595010NVj interfaceC595010NVj, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
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
        InterfaceC595010NVj interfaceC595010NVj2 = interfaceC595010NVj;
        C1668470tWH c1668470tWH2 = c1668470tWH;
        long jLIZIZ = j2;
        InterfaceC1680710tq1 interfaceC1680710tq12 = interfaceC1680710tq1;
        boolean z2 = z;
        long jLJII = j;
        float f2 = f;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1560876237);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i15 = i2 & 4;
        if (i15 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i16 = i2 & 8;
        if (i16 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1680710tq12)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0 && c13zcLJIIJ.LJIJJ(jLJII)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i3 |= i13;
        }
        if ((458752 & i) == 0) {
            if ((i2 & 32) == 0 && c13zcLJIIJ.LJIJJ(jLIZIZ)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i3 |= i12;
        }
        int i17 = i2 & 64;
        if (i17 != 0) {
            i3 |= 1572864;
        } else if ((3670016 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1668470tWH2)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i3 |= i8;
        }
        int i18 = i2 & 128;
        if (i18 != 0) {
            i3 |= 12582912;
        } else if ((29360128 & i) == 0) {
            if (c13zcLJIIJ.LJIJ(f2)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i3 |= i9;
        }
        int i19 = i2 & 256;
        if (i19 != 0) {
            i3 |= 100663296;
        } else if ((234881024 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC595010NVj2)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i3 |= i10;
        }
        Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22 = function2;
        if ((i2 & 512) != 0) {
            i3 |= 805306368;
        } else if ((1879048192 & i) == 0) {
            if (c13zcLJIIJ.LJII(function22)) {
                i11 = 536870912;
            } else {
                i11 = 268435456;
            }
            i3 |= i11;
        }
        if ((i3 & 1533916891) == 306783378 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
            } else {
                if (i14 != 0) {
                    interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
                }
                if (i15 != 0) {
                    z2 = true;
                }
                if (i16 != 0) {
                    interfaceC1680710tq12 = C1669430tXp.LIZ;
                }
                if ((i2 & 16) != 0) {
                    jLJII = C1680090tp1.LIZ(c13zcLJIIJ).LJII();
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    jLIZIZ = C1680070toz.LIZIZ(jLJII, c13zcLJIIJ);
                    i3 &= -458753;
                }
                if (i17 != 0) {
                    c1668470tWH2 = null;
                }
                if (i18 != 0) {
                    f2 = 0;
                }
                if (i19 != 0) {
                    c13zcLJIIJ.LJJIJIIJIL(-492369756);
                    Object objLJJ = c13zcLJIIJ.LJJ();
                    InterfaceC1680500tpg.LIZ.getClass();
                    if (objLJJ == C1680510tph.LIZIZ) {
                        objLJJ = new C612270Nzt();
                        c13zcLJIIJ.LJJIJIIJI(objLJJ);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    interfaceC595010NVj2 = (InterfaceC595010NVj) objLJJ;
                }
            }
            c13zcLJIIJ.LJJJJLI();
            C13DQ c13dq = C1678700tmm.LIZIZ;
            float f3 = ((C1668650tWZ) c13zcLJIIJ.LJJIL(c13dq)).LL + f2;
            function22 = function22;
            C13ZT.LIZIZ(new C13DO[]{C1680350tpR.LIZ.LIZJ(new C1685910tyP(jLIZIZ)), c13dq.LIZJ(new C1668650tWZ(f3))}, C13Z4.LIZIZ(c13zcLJIIJ, 2031491085, new C1678680tmk(interfaceC1685750ty92, interfaceC1680710tq12, jLJII, f3, i3, c1668470tWH2, f2, interfaceC595010NVj2, z2, function0, function22)), c13zcLJIIJ, 56);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1678660tmi(function0, interfaceC1685750ty92, z2, interfaceC1680710tq12, jLJII, jLIZIZ, c1668470tWH2, f2, interfaceC595010NVj2, function22, i, i2);
        }
    }
}
