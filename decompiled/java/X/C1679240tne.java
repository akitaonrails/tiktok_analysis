package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: renamed from: X.0tne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679240tne {
    public static final C13DR LIZ = new C13DR(AFwS214S0000000_25.get$arr$(58));
    public static final float LIZIZ = 16;

    /* JADX WARN: Removed duplicated region for block: B:60:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(boolean r14, final int r15, kotlin.jvm.functions.Function2 r16, X.InterfaceC1631620sYq r17, kotlin.jvm.functions.Function2 r18, kotlin.jvm.functions.Function2 r19, kotlin.jvm.functions.Function2 r20, X.InterfaceC1680500tpg r21, int r22) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1679240tne.LIZIZ(boolean, int, kotlin.jvm.functions.Function2, X.0sYq, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, X.0tpg, int):void");
    }

    public static final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, C1679310tnl c1679310tnl, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22, InterfaceC1631620sYq<? super C1675080tgw, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function23, int i, boolean z, InterfaceC1631620sYq<? super InterfaceC1686920u02, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq2, boolean z2, InterfaceC1680710tq1 interfaceC1680710tq1, float f, long j, long j2, long j3, long j4, long j5, InterfaceC1631620sYq<? super InterfaceC1679150tnV, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq3, InterfaceC1680500tpg interfaceC1680500tpg, int i2, int i3, int i4) {
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
        boolean z3;
        int i18;
        int i19;
        int i20;
        int i21;
        long jLIZIZ = j5;
        long jLIZ = j4;
        long jLIZIZ2 = j2;
        long jLJII = j;
        InterfaceC1680710tq1 interfaceC1680710tq12 = interfaceC1680710tq1;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        InterfaceC1631620sYq<? super InterfaceC1686920u02, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq4 = interfaceC1631620sYq2;
        Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function24 = function23;
        long jLIZ2 = j3;
        InterfaceC1631620sYq<? super C1675080tgw, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq5 = interfaceC1631620sYq;
        float f2 = f;
        int i22 = i;
        Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function25 = function2;
        Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function26 = function22;
        C1679310tnl c1679310tnl2 = c1679310tnl;
        boolean z4 = z;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1037492569);
        int i23 = i4 & 1;
        if (i23 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i5 = i6 | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 112) == 0) {
            if ((i4 & 2) == 0 && c13zcLJIIJ.LJJIIJ(c1679310tnl2)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i5 |= i21;
        }
        int i24 = i4 & 4;
        if (i24 != 0) {
            i5 |= 384;
        } else if ((i2 & 896) == 0) {
            if (c13zcLJIIJ.LJII(function25)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i5 |= i7;
        }
        int i25 = i4 & 8;
        int i26 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        if (i25 != 0) {
            i5 |= 3072;
        } else if ((i2 & 7168) == 0) {
            if (c13zcLJIIJ.LJII(function26)) {
                i8 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i8 = 1024;
            }
            i5 |= i8;
        }
        int i27 = i4 & 16;
        int i28 = 8192;
        if (i27 != 0) {
            i5 |= 24576;
        } else if ((i2 & 57344) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631620sYq5)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i5 |= i9;
        }
        int i29 = i4 & 32;
        if (i29 != 0) {
            i5 |= 196608;
        } else if ((i2 & 458752) == 0) {
            if (c13zcLJIIJ.LJII(function24)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i5 |= i10;
        }
        int i30 = i4 & 64;
        int i31 = 1048576;
        if (i30 != 0) {
            i5 |= 1572864;
        } else if ((i2 & 3670016) == 0) {
            if (c13zcLJIIJ.LJIJI(i22)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i5 |= i11;
        }
        int i32 = i4 & 128;
        if (i32 != 0) {
            i5 |= 12582912;
        } else if ((i2 & 29360128) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z4)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i5 |= i12;
        }
        int i33 = i4 & 256;
        if (i33 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 234881024) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631620sYq4)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i5 |= i13;
        }
        int i34 = i4 & 512;
        if (i34 != 0) {
            i5 |= 805306368;
        } else if ((1879048192 & i2) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i5 |= i14;
        }
        if ((i3 & 14) == 0) {
            if ((i4 & 1024) == 0 && c13zcLJIIJ.LJJIIJ(interfaceC1680710tq12)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i15 = i3 | i20;
        } else {
            i15 = i3;
        }
        int i35 = i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        if (i35 != 0) {
            i15 |= 48;
        } else if ((i3 & 112) == 0) {
            if (c13zcLJIIJ.LJIJ(f2)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i15 |= i16;
        }
        if ((i3 & 896) == 0) {
            if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 && c13zcLJIIJ.LJIJJ(jLJII)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i15 |= i19;
        }
        if ((i3 & 7168) == 0) {
            if ((i4 & 8192) != 0 || !c13zcLJIIJ.LJIJJ(jLIZIZ2)) {
                i26 = 1024;
            }
            i15 |= i26;
        }
        if ((i3 & 57344) == 0) {
            if ((i4 & 16384) == 0 && c13zcLJIIJ.LJIJJ(jLIZ2)) {
                i28 = 16384;
            }
            i15 |= i28;
        }
        if ((i3 & 458752) == 0) {
            if ((i4 & 32768) == 0 && c13zcLJIIJ.LJIJJ(jLIZ)) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i15 |= i18;
        }
        if ((i3 & 3670016) == 0) {
            if ((i4 & 65536) != 0 || !c13zcLJIIJ.LJIJJ(jLIZIZ)) {
                i31 = 524288;
            }
            i15 |= i31;
        }
        if ((i4 & 131072) != 0) {
            i15 |= 12582912;
        } else if ((i3 & 29360128) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631620sYq3)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i15 |= i17;
        }
        if ((i5 & 1533916891) == 306783378 && (i15 & 23967451) == 4793490 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
            z3 = z2;
        } else {
            c13zcLJIIJ.LJLI();
            if ((i2 & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                if ((i4 & 2) != 0) {
                    i5 &= -113;
                }
                if ((i4 & 1024) != 0) {
                    i15 &= -15;
                }
                if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
                    i15 &= -897;
                }
                if ((i4 & 8192) != 0) {
                    i15 &= -7169;
                }
                if ((i4 & 16384) != 0) {
                    i15 &= -57345;
                }
                if ((i4 & 32768) != 0) {
                    i15 &= -458753;
                }
                if ((i4 & 65536) != 0) {
                    i15 &= -3670017;
                }
                z3 = z2;
            } else {
                if (i23 != 0) {
                    interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
                }
                if ((i4 & 2) != 0) {
                    c13zcLJIIJ.LJJIJIIJIL(1569641925);
                    C1678560tmY c1678560tmYLIZJ = C1678520tmU.LIZJ(EnumC1678550tmX.Closed, c13zcLJIIJ);
                    c13zcLJIIJ.LJJIJIIJIL(-492369756);
                    Object objLJJ = c13zcLJIIJ.LJJ();
                    InterfaceC1680500tpg.LIZ.getClass();
                    C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
                    if (objLJJ == c1680520tpi) {
                        objLJJ = new C1675080tgw();
                        c13zcLJIIJ.LJJIJIIJI(objLJJ);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    C1675080tgw c1675080tgw = (C1675080tgw) objLJJ;
                    c13zcLJIIJ.LJJIJIIJIL(-492369756);
                    Object objLJJ2 = c13zcLJIIJ.LJJ();
                    if (objLJJ2 == c1680520tpi) {
                        objLJJ2 = new C1679310tnl(c1678560tmYLIZJ, c1675080tgw);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    c1679310tnl2 = (C1679310tnl) objLJJ2;
                    c13zcLJIIJ.LJJJJL(false);
                    i5 &= -113;
                }
                if (i24 != 0) {
                    function25 = C1679300tnk.LIZ;
                }
                if (i25 != 0) {
                    function26 = C1679300tnk.LIZIZ;
                }
                if (i27 != 0) {
                    interfaceC1631620sYq5 = C1679300tnk.LIZJ;
                }
                if (i29 != 0) {
                    function24 = C1679300tnk.LIZLLL;
                }
                z3 = true;
                if (i30 != 0) {
                    i22 = 1;
                }
                if (i32 != 0) {
                    z4 = false;
                }
                if (i33 != 0) {
                    interfaceC1631620sYq4 = null;
                }
                if (i34 == 0) {
                    z3 = z2;
                }
                if ((i4 & 1024) != 0) {
                    interfaceC1680710tq12 = C1680090tp1.LIZIZ(c13zcLJIIJ).LIZJ;
                    i15 &= -15;
                }
                if (i35 != 0) {
                    f2 = C1678540tmW.LIZ;
                }
                if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
                    jLJII = C1680090tp1.LIZ(c13zcLJIIJ).LJII();
                    i15 &= -897;
                }
                if ((i4 & 8192) != 0) {
                    jLIZIZ2 = C1680070toz.LIZIZ(jLJII, c13zcLJIIJ);
                    i15 &= -7169;
                }
                if ((i4 & 16384) != 0) {
                    jLIZ2 = C1678540tmW.LIZ(c13zcLJIIJ);
                    i15 &= -57345;
                }
                if ((i4 & 32768) != 0) {
                    jLIZ = C1680090tp1.LIZ(c13zcLJIIJ).LIZ();
                    i15 = (-458753) & i15;
                }
                if ((i4 & 65536) != 0) {
                    jLIZIZ = C1680070toz.LIZIZ(jLIZ, c13zcLJIIJ);
                    i15 = (-3670017) & i15;
                }
            }
            c13zcLJIIJ.LJJJJLI();
            C19719212De c19719212DeLIZIZ = C13Z4.LIZIZ(c13zcLJIIJ, 1823402604, new C1679250tnf(jLIZ, jLIZIZ, i15, z4, i22, function25, interfaceC1631620sYq3, function24, function26, i5, interfaceC1631620sYq5, c1679310tnl2));
            if (interfaceC1631620sYq4 != null) {
                c13zcLJIIJ.LJJIJIIJIL(-1013848234);
                int i36 = i15 << 12;
                boolean z5 = z3;
                C1678520tmU.LIZ(interfaceC1631620sYq4, interfaceC1685750ty92, c1679310tnl2.LIZ, z5, interfaceC1680710tq12, f2, jLJII, jLIZIZ2, jLIZ2, C13Z4.LIZIZ(c13zcLJIIJ, 100842932, new AwS639S0100000_25(c19719212DeLIZIZ, 5)), c13zcLJIIJ, ((i5 >> 24) & 14) | 805306368 | ((i5 << 3) & 112) | ((i5 >> 18) & 7168) | (i36 & 57344) | (i36 & 458752) | (i36 & 3670016) | (i36 & 29360128) | (i36 & 234881024), 0);
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIJIIJIL(-1013847725);
                c19719212DeLIZIZ.invoke(interfaceC1685750ty92, c13zcLJIIJ, Integer.valueOf((i5 & 14) | 48));
                c13zcLJIIJ.LJJJJL(false);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1679260tng(interfaceC1685750ty92, c1679310tnl2, function25, function26, interfaceC1631620sYq5, function24, i22, z4, interfaceC1631620sYq4, z3, interfaceC1680710tq12, f2, jLJII, jLIZIZ2, jLIZ2, jLIZ, jLIZIZ, interfaceC1631620sYq3, i2, i3, i4);
        }
    }
}
