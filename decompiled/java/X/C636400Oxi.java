package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS0S0722000_9;
import kotlin.jvm.internal.AwS0S0822000_9;

/* JADX INFO: renamed from: X.0Oxi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C636400Oxi {
    @InterfaceC1294060jmO
    public static final void LIZIZ(InterfaceC1685750ty9 interfaceC1685750ty9, C1690080u58 c1690080u58, InterfaceC1679150tnV interfaceC1679150tnV, boolean z, InterfaceC1688160u22 interfaceC1688160u22, InterfaceC1666960tTq interfaceC1666960tTq, InterfaceC633750OtR interfaceC633750OtR, boolean z2, Function1 function1, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        int i10;
        int i11;
        int i12;
        InterfaceC1679150tnV c1682530tsx = interfaceC1679150tnV;
        InterfaceC633750OtR interfaceC633750OtRLIZ = interfaceC633750OtR;
        InterfaceC1666960tTq interfaceC1666960tTq2 = interfaceC1666960tTq;
        InterfaceC1688160u22 interfaceC1688160u222 = interfaceC1688160u22;
        boolean z4 = z;
        C1690080u58 c1690080u58LIZ = c1690080u58;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-740714857);
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0 && c13zcLJIIJ.LJJIIJ(c1690080u58LIZ)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i3 |= i12;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1682530tsx)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        int i15 = i2 & 8;
        if (i15 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z4)) {
                i6 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0 && c13zcLJIIJ.LJJIIJ(interfaceC1688160u222)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i3 |= i11;
        }
        int i16 = i2 & 32;
        if (i16 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1666960tTq2)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0 && c13zcLJIIJ.LJJIIJ(interfaceC633750OtRLIZ)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        int i17 = i2 & 128;
        if (i17 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i3 |= i8;
        }
        Function1 function12 = function1;
        if ((i2 & 256) != 0) {
            i3 |= 100663296;
        } else if ((100663296 & i) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i3 |= i9;
        }
        boolean z5 = true;
        if ((i3 & 38347923) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i3 & 1, z3)) {
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                }
                z5 = z2;
            } else {
                if (i13 != 0) {
                    interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
                }
                if ((i2 & 2) != 0) {
                    c1690080u58LIZ = C1690130u5D.LIZ(0, 0, c13zcLJIIJ, 0, 3);
                    i3 &= -113;
                }
                if (i14 != 0) {
                    float f = 0;
                    c1682530tsx = new C1682530tsx(f, f, f, f);
                }
                if (i15 != 0) {
                    z4 = false;
                }
                if ((i2 & 16) != 0) {
                    if (!z4) {
                        interfaceC1688160u222 = C1679930tol.LIZJ;
                    } else {
                        interfaceC1688160u222 = C1679930tol.LIZLLL;
                    }
                    i3 &= -57345;
                }
                if (i16 != 0) {
                    InterfaceC1668050tVb.LIZ.getClass();
                    interfaceC1666960tTq2 = C1668040tVa.LJIILIIL;
                }
                if ((i2 & 64) != 0) {
                    interfaceC633750OtRLIZ = C1675560thi.LIZ(c13zcLJIIJ);
                    i3 &= -3670017;
                }
                if (i17 == 0) {
                    z5 = z2;
                }
            }
            c13zcLJIIJ.LJJJJLI();
            function12 = function12;
            LIZ(interfaceC1685750ty92, c1690080u58LIZ, c1682530tsx, z4, interfaceC1688160u222, interfaceC1666960tTq2, interfaceC633750OtRLIZ, z5, C1670290tZD.LIZ(c13zcLJIIJ), function12, c13zcLJIIJ, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | ((i3 << 3) & 1879048192), 0);
        } else {
            c13zcLJIIJ.LIZJ();
            z5 = z2;
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S0722000_9(interfaceC1685750ty92, (InterfaceC1685750ty9) c1690080u58LIZ, (C1690080u58) c1682530tsx, (InterfaceC1679150tnV) z4, (boolean) interfaceC1688160u222, (InterfaceC1688160u22) interfaceC1666960tTq2, (InterfaceC1666960tTq) interfaceC633750OtRLIZ, (InterfaceC633750OtR) z5, (boolean) function12, (Function1<? super C0MAE, Unit>) i, i2, 0);
        }
    }

    @InterfaceC1294060jmO
    public static final void LIZLLL(InterfaceC1685750ty9 interfaceC1685750ty9, C1690080u58 c1690080u58, InterfaceC1679150tnV interfaceC1679150tnV, boolean z, InterfaceC1672520tco interfaceC1672520tco, InterfaceC1682270tsX interfaceC1682270tsX, InterfaceC633750OtR interfaceC633750OtR, boolean z2, Function1 function1, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        int i10;
        int i11;
        int i12;
        InterfaceC1679150tnV c1682530tsx = interfaceC1679150tnV;
        InterfaceC633750OtR interfaceC633750OtRLIZ = interfaceC633750OtR;
        InterfaceC1682270tsX interfaceC1682270tsX2 = interfaceC1682270tsX;
        InterfaceC1672520tco interfaceC1672520tco2 = interfaceC1672520tco;
        boolean z4 = z;
        C1690080u58 c1690080u58LIZ = c1690080u58;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1724297413);
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0 && c13zcLJIIJ.LJJIIJ(c1690080u58LIZ)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i3 |= i12;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1682530tsx)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        int i15 = i2 & 8;
        if (i15 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z4)) {
                i6 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0 && c13zcLJIIJ.LJJIIJ(interfaceC1672520tco2)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i3 |= i11;
        }
        int i16 = i2 & 32;
        if (i16 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1682270tsX2)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0 && c13zcLJIIJ.LJJIIJ(interfaceC633750OtRLIZ)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        int i17 = i2 & 128;
        if (i17 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i3 |= i8;
        }
        Function1 function12 = function1;
        if ((i2 & 256) != 0) {
            i3 |= 100663296;
        } else if ((100663296 & i) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i3 |= i9;
        }
        boolean z5 = true;
        if ((i3 & 38347923) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i3 & 1, z3)) {
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                }
                z5 = z2;
            } else {
                if (i13 != 0) {
                    interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
                }
                if ((i2 & 2) != 0) {
                    c1690080u58LIZ = C1690130u5D.LIZ(0, 0, c13zcLJIIJ, 0, 3);
                    i3 &= -113;
                }
                if (i14 != 0) {
                    float f = 0;
                    c1682530tsx = new C1682530tsx(f, f, f, f);
                }
                if (i15 != 0) {
                    z4 = false;
                }
                if ((i2 & 16) != 0) {
                    if (!z4) {
                        interfaceC1672520tco2 = C1679930tol.LIZ;
                    } else {
                        interfaceC1672520tco2 = C1679930tol.LIZIZ;
                    }
                    i3 &= -57345;
                }
                if (i16 != 0) {
                    InterfaceC1668050tVb.LIZ.getClass();
                    interfaceC1682270tsX2 = C1668040tVa.LJIIJ;
                }
                if ((i2 & 64) != 0) {
                    interfaceC633750OtRLIZ = C1675560thi.LIZ(c13zcLJIIJ);
                    i3 &= -3670017;
                }
                if (i17 == 0) {
                    z5 = z2;
                }
            }
            c13zcLJIIJ.LJJJJLI();
            function12 = function12;
            LIZJ(interfaceC1685750ty92, c1690080u58LIZ, c1682530tsx, z4, interfaceC1672520tco2, interfaceC1682270tsX2, interfaceC633750OtRLIZ, z5, C1670290tZD.LIZ(c13zcLJIIJ), function12, c13zcLJIIJ, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (29360128 & i3) | ((i3 << 3) & 1879048192), 0);
        } else {
            c13zcLJIIJ.LIZJ();
            z5 = z2;
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S0722000_9(interfaceC1685750ty92, (InterfaceC1685750ty9) c1690080u58LIZ, (C1690080u58) c1682530tsx, (InterfaceC1679150tnV) z4, (boolean) interfaceC1672520tco2, (InterfaceC1672520tco) interfaceC1682270tsX2, (InterfaceC1682270tsX) interfaceC633750OtRLIZ, (InterfaceC633750OtR) z5, (boolean) function12, (Function1<? super C0MAE, Unit>) i, i2, 1);
        }
    }

    public static final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, C1690080u58 c1690080u58, InterfaceC1679150tnV interfaceC1679150tnV, boolean z, InterfaceC1688160u22 interfaceC1688160u22, InterfaceC1666960tTq interfaceC1666960tTq, InterfaceC633750OtR interfaceC633750OtR, boolean z2, InterfaceC1681290tqx interfaceC1681290tqx, Function1<? super C0MAE, Unit> function1, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        int i10;
        int i11;
        int i12;
        int i13;
        InterfaceC1681290tqx interfaceC1681290tqxLIZ = interfaceC1681290tqx;
        InterfaceC1688160u22 interfaceC1688160u222 = interfaceC1688160u22;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        InterfaceC633750OtR interfaceC633750OtRLIZ = interfaceC633750OtR;
        boolean z4 = z;
        InterfaceC1679150tnV c1682530tsx = interfaceC1679150tnV;
        InterfaceC1666960tTq interfaceC1666960tTq2 = interfaceC1666960tTq;
        C1690080u58 c1690080u58LIZ = c1690080u58;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(53695811);
        int i14 = i2 & 1;
        if (i14 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0 && c13zcLJIIJ.LJJIIJ(c1690080u58LIZ)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i3 |= i13;
        }
        int i15 = i2 & 4;
        if (i15 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1682530tsx)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        int i16 = i2 & 8;
        if (i16 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z4)) {
                i6 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0 && c13zcLJIIJ.LJJIIJ(interfaceC1688160u222)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i3 |= i12;
        }
        int i17 = i2 & 32;
        if (i17 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1666960tTq2)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0 && c13zcLJIIJ.LJJIIJ(interfaceC633750OtRLIZ)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i3 |= i11;
        }
        int i18 = i2 & 128;
        if (i18 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i3 |= i8;
        }
        if ((100663296 & i) == 0) {
            if ((i2 & 256) == 0 && c13zcLJIIJ.LJJIIJ(interfaceC1681290tqxLIZ)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i3 |= i10;
        }
        Function1<? super C0MAE, Unit> function12 = function1;
        if ((i2 & 512) != 0) {
            i3 |= 805306368;
        } else if ((805306368 & i) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i3 |= i9;
        }
        boolean z5 = true;
        if ((i3 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i3 & 1, z3)) {
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                }
                z5 = z2;
            } else {
                if (i14 != 0) {
                    interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
                }
                if ((i2 & 2) != 0) {
                    c1690080u58LIZ = C1690130u5D.LIZ(0, 0, c13zcLJIIJ, 0, 3);
                    i3 &= -113;
                }
                if (i15 != 0) {
                    float f = 0;
                    c1682530tsx = new C1682530tsx(f, f, f, f);
                }
                if (i16 != 0) {
                    z4 = false;
                }
                if ((i2 & 16) != 0) {
                    if (!z4) {
                        interfaceC1688160u222 = C1679930tol.LIZJ;
                    } else {
                        interfaceC1688160u222 = C1679930tol.LIZLLL;
                    }
                    i3 &= -57345;
                }
                if (i17 != 0) {
                    InterfaceC1668050tVb.LIZ.getClass();
                    interfaceC1666960tTq2 = C1668040tVa.LJIILIIL;
                }
                if ((i2 & 64) != 0) {
                    interfaceC633750OtRLIZ = C1675560thi.LIZ(c13zcLJIIJ);
                    i3 &= -3670017;
                }
                if (i18 == 0) {
                    z5 = z2;
                }
                if ((i2 & 256) != 0) {
                    interfaceC1681290tqxLIZ = C1670290tZD.LIZ(c13zcLJIIJ);
                    i3 &= -234881025;
                }
            }
            c13zcLJIIJ.LJJJJLI();
            int i19 = i3 >> 3;
            function12 = function12;
            C1689770u4d.LIZ(interfaceC1685750ty92, c1690080u58LIZ, c1682530tsx, z4, true, interfaceC633750OtRLIZ, z5, interfaceC1681290tqxLIZ, 0, interfaceC1666960tTq2, interfaceC1688160u222, null, null, function12, c13zcLJIIJ, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i19) | (3670016 & i19) | (i19 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
        } else {
            c13zcLJIIJ.LIZJ();
            z5 = z2;
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S0822000_9(interfaceC1685750ty92, (InterfaceC1685750ty9) c1690080u58LIZ, (C1690080u58) c1682530tsx, (InterfaceC1679150tnV) z4, (boolean) interfaceC1688160u222, (InterfaceC1688160u22) interfaceC1666960tTq2, (InterfaceC1666960tTq) interfaceC633750OtRLIZ, (InterfaceC633750OtR) z5, (boolean) interfaceC1681290tqxLIZ, (InterfaceC1681290tqx) function12, (Function1<? super C0MAE, Unit>) i, i2, 0);
        }
    }

    public static final void LIZJ(InterfaceC1685750ty9 interfaceC1685750ty9, C1690080u58 c1690080u58, InterfaceC1679150tnV interfaceC1679150tnV, boolean z, InterfaceC1672520tco interfaceC1672520tco, InterfaceC1682270tsX interfaceC1682270tsX, InterfaceC633750OtR interfaceC633750OtR, boolean z2, InterfaceC1681290tqx interfaceC1681290tqx, Function1<? super C0MAE, Unit> function1, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        int i10;
        int i11;
        int i12;
        int i13;
        InterfaceC1681290tqx interfaceC1681290tqxLIZ = interfaceC1681290tqx;
        InterfaceC1672520tco interfaceC1672520tco2 = interfaceC1672520tco;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        InterfaceC633750OtR interfaceC633750OtRLIZ = interfaceC633750OtR;
        boolean z4 = z;
        InterfaceC1679150tnV c1682530tsx = interfaceC1679150tnV;
        InterfaceC1682270tsX interfaceC1682270tsX2 = interfaceC1682270tsX;
        C1690080u58 c1690080u58LIZ = c1690080u58;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1884325601);
        int i14 = i2 & 1;
        if (i14 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0 && c13zcLJIIJ.LJJIIJ(c1690080u58LIZ)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i3 |= i13;
        }
        int i15 = i2 & 4;
        if (i15 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1682530tsx)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        int i16 = i2 & 8;
        if (i16 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z4)) {
                i6 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0 && c13zcLJIIJ.LJJIIJ(interfaceC1672520tco2)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i3 |= i12;
        }
        int i17 = i2 & 32;
        if (i17 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1682270tsX2)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0 && c13zcLJIIJ.LJJIIJ(interfaceC633750OtRLIZ)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i3 |= i11;
        }
        int i18 = i2 & 128;
        if (i18 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i3 |= i8;
        }
        if ((100663296 & i) == 0) {
            if ((i2 & 256) == 0 && c13zcLJIIJ.LJJIIJ(interfaceC1681290tqxLIZ)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i3 |= i10;
        }
        Function1<? super C0MAE, Unit> function12 = function1;
        if ((i2 & 512) != 0) {
            i3 |= 805306368;
        } else if ((805306368 & i) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i3 |= i9;
        }
        boolean z5 = true;
        if ((i3 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i3 & 1, z3)) {
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                }
                z5 = z2;
            } else {
                if (i14 != 0) {
                    interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
                }
                if ((i2 & 2) != 0) {
                    c1690080u58LIZ = C1690130u5D.LIZ(0, 0, c13zcLJIIJ, 0, 3);
                    i3 &= -113;
                }
                if (i15 != 0) {
                    float f = 0;
                    c1682530tsx = new C1682530tsx(f, f, f, f);
                }
                if (i16 != 0) {
                    z4 = false;
                }
                if ((i2 & 16) != 0) {
                    if (!z4) {
                        interfaceC1672520tco2 = C1679930tol.LIZ;
                    } else {
                        interfaceC1672520tco2 = C1679930tol.LIZIZ;
                    }
                    i3 &= -57345;
                }
                if (i17 != 0) {
                    InterfaceC1668050tVb.LIZ.getClass();
                    interfaceC1682270tsX2 = C1668040tVa.LJIIJ;
                }
                if ((i2 & 64) != 0) {
                    interfaceC633750OtRLIZ = C1675560thi.LIZ(c13zcLJIIJ);
                    i3 &= -3670017;
                }
                if (i18 == 0) {
                    z5 = z2;
                }
                if ((i2 & 256) != 0) {
                    interfaceC1681290tqxLIZ = C1670290tZD.LIZ(c13zcLJIIJ);
                    i3 &= -234881025;
                }
            }
            c13zcLJIIJ.LJJJJLI();
            int i19 = i3 >> 3;
            function12 = function12;
            C1689770u4d.LIZ(interfaceC1685750ty92, c1690080u58LIZ, c1682530tsx, z4, false, interfaceC633750OtRLIZ, z5, interfaceC1681290tqxLIZ, 0, null, null, interfaceC1682270tsX2, interfaceC1672520tco2, function12, c13zcLJIIJ, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i19) | (3670016 & i19) | (i19 & 29360128), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
        } else {
            c13zcLJIIJ.LIZJ();
            z5 = z2;
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S0822000_9(interfaceC1685750ty92, (InterfaceC1685750ty9) c1690080u58LIZ, (C1690080u58) c1682530tsx, (InterfaceC1679150tnV) z4, (boolean) interfaceC1672520tco2, (InterfaceC1672520tco) interfaceC1682270tsX2, (InterfaceC1682270tsX) interfaceC633750OtRLIZ, (InterfaceC633750OtR) z5, (boolean) interfaceC1681290tqxLIZ, (InterfaceC1681290tqx) function12, (Function1<? super C0MAE, Unit>) i, i2, 1);
        }
    }
}
