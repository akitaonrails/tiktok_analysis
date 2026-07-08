package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS124S0201000_25;

/* JADX INFO: renamed from: X.0tsc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682320tsc {
    public static final C13DQ LIZ = new C13DQ(C595410NWx.LIZ, AFwS214S0000000_25.get$arr$(61));

    public static final void LIZ(C1693430uAX c1693430uAX, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1772272796);
        if ((i & 14) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1693430uAX)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C13DQ c13dq = LIZ;
            C13ZT.LIZIZ(new C13DO[]{c13dq.LIZJ(((C1693430uAX) c13zcLJIIJ.LJJIL(c13dq)).LJFF(c1693430uAX))}, function2, c13zcLJIIJ, (i2 & 112) | 8);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(c1693430uAX, (C1693430uAX) function2, (Function2<? super InterfaceC1680500tpg, ? super Integer, Unit>) i, 16);
        }
    }

    public static final void LIZIZ(String str, InterfaceC1685750ty9 interfaceC1685750ty9, long j, long j2, C1693240uAE c1693240uAE, C1680190tpB c1680190tpB, AbstractC1696400uFK abstractC1696400uFK, long j3, C1693510uAf c1693510uAf, C1692070u8L c1692070u8L, long j4, int i, boolean z, int i2, int i3, Function1<? super C1692150u8T, Unit> function1, C1693430uAX c1693430uAX, InterfaceC1680500tpg interfaceC1680500tpg, int i4, int i5, int i6) {
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
        int i20;
        int i21;
        Function1<? super C1692150u8T, Unit> function12;
        final long jLIZJ;
        int i22;
        C1693430uAX c1693430uAX2;
        int i23;
        C1693430uAX c1693430uAX3 = c1693430uAX;
        int i24 = i3;
        int i25 = i2;
        boolean z2 = z;
        int i26 = i;
        long j5 = j4;
        long j6 = j3;
        AbstractC1696400uFK abstractC1696400uFK2 = abstractC1696400uFK;
        C1680190tpB c1680190tpB2 = c1680190tpB;
        long j7 = j2;
        C1693240uAE c1693240uAE2 = c1693240uAE;
        C1692070u8L c1692070u8L2 = c1692070u8L;
        long j8 = j;
        C1693510uAf c1693510uAf2 = c1693510uAf;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1028090691);
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i4;
        } else {
            i7 = i4;
        }
        int i27 = i6 & 2;
        if (i27 != 0) {
            i7 |= 48;
        } else if ((i4 & 112) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i7 |= i9;
        }
        int i28 = i6 & 4;
        if (i28 != 0) {
            i7 |= 384;
        } else if ((i4 & 896) == 0) {
            if (c13zcLJIIJ.LJIJJ(j8)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i7 |= i10;
        }
        int i29 = i6 & 8;
        int i30 = 1024;
        if (i29 != 0) {
            i7 |= 3072;
        } else if ((i4 & 7168) == 0) {
            if (c13zcLJIIJ.LJIJJ(j7)) {
                i11 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i11 = 1024;
            }
            i7 |= i11;
        }
        int i31 = i6 & 16;
        int i32 = 8192;
        if (i31 != 0) {
            i7 |= 24576;
        } else if ((i4 & 57344) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1693240uAE2)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i7 |= i12;
        }
        int i33 = i6 & 32;
        int i34 = 131072;
        if (i33 != 0) {
            i7 |= 196608;
        } else if ((i4 & 458752) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1680190tpB2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i7 |= i13;
        }
        int i35 = i6 & 64;
        if (i35 != 0) {
            i7 |= 1572864;
        } else if ((i4 & 3670016) == 0) {
            if (c13zcLJIIJ.LJJIIJ(abstractC1696400uFK2)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i7 |= i14;
        }
        int i36 = i6 & 128;
        if (i36 != 0) {
            i7 |= 12582912;
        } else if ((29360128 & i4) == 0) {
            if (c13zcLJIIJ.LJIJJ(j6)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i7 |= i15;
        }
        int i37 = i6 & 256;
        if (i37 != 0) {
            i7 |= 100663296;
        } else if ((234881024 & i4) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1693510uAf2)) {
                i16 = 67108864;
            } else {
                i16 = 33554432;
            }
            i7 |= i16;
        }
        int i38 = i6 & 512;
        if (i38 != 0) {
            i7 |= 805306368;
        } else if ((1879048192 & i4) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1692070u8L2)) {
                i17 = 536870912;
            } else {
                i17 = 268435456;
            }
            i7 |= i17;
        }
        int i39 = i6 & 1024;
        if (i39 != 0) {
            i18 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            if (c13zcLJIIJ.LJIJJ(j5)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i18 = i19 | i5;
        } else {
            i18 = i5;
        }
        int i40 = i6 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        if (i40 != 0) {
            i18 |= 48;
        } else if ((i5 & 112) == 0) {
            if (c13zcLJIIJ.LJIJI(i26)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i18 |= i20;
        }
        int i41 = i6 & SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        if (i41 != 0) {
            i18 |= 384;
        } else if ((i5 & 896) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i21 = 256;
            } else {
                i21 = 128;
            }
            i18 |= i21;
        }
        int i42 = i6 & 8192;
        if (i42 != 0) {
            i18 |= 3072;
        } else if ((i5 & 7168) == 0) {
            if (c13zcLJIIJ.LJIJI(i25)) {
                i30 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            }
            i18 |= i30;
        }
        int i43 = i6 & 16384;
        if (i43 != 0) {
            i18 |= 24576;
        } else if ((i5 & 57344) == 0) {
            i43 = 0;
            if (c13zcLJIIJ.LJIJI(i24)) {
                i32 = 16384;
            }
            i18 |= i32;
        }
        int i44 = i6 & 32768;
        if (i44 != 0) {
            i18 |= 196608;
        } else if ((i5 & 458752) == 0) {
            if (!c13zcLJIIJ.LJII(function1)) {
                i34 = 65536;
            }
            i18 |= i34;
        }
        if ((i5 & 3670016) == 0) {
            if ((i6 & 65536) == 0 && c13zcLJIIJ.LJJIIJ(c1693430uAX3)) {
                i23 = 1048576;
            } else {
                i23 = 524288;
            }
            i18 |= i23;
        }
        if ((1533916891 & i7) == 306783378 && (2995931 & i18) == 599186 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
            function12 = function1;
        } else {
            c13zcLJIIJ.LJLI();
            if ((i4 & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                if ((i6 & 65536) != 0) {
                    i18 &= -3670017;
                }
                function12 = function1;
            } else {
                if (i27 != 0) {
                    interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
                }
                if (i28 != 0) {
                    j8 = C1685910tyP.LJIIJ;
                }
                if (i29 != 0) {
                    j7 = C1682440tso.LIZJ;
                }
                function12 = null;
                if (i31 != 0) {
                    c1693240uAE2 = null;
                }
                if (i33 != 0) {
                    c1680190tpB2 = null;
                }
                if (i35 != 0) {
                    abstractC1696400uFK2 = null;
                }
                if (i36 != 0) {
                    j6 = C1682440tso.LIZJ;
                }
                if (i37 != 0) {
                    c1693510uAf2 = null;
                }
                if (i38 != 0) {
                    c1692070u8L2 = null;
                }
                if (i39 != 0) {
                    j5 = C1682440tso.LIZJ;
                }
                if (i40 != 0) {
                    i26 = 1;
                }
                if (i41 != 0) {
                    z2 = true;
                }
                if (i42 != 0) {
                    i25 = Integer.MAX_VALUE;
                }
                if (i43 != 0) {
                    i24 = 1;
                }
                if (i44 == 0) {
                    function12 = function1;
                }
                if ((i6 & 65536) != 0) {
                    c1693430uAX3 = (C1693430uAX) c13zcLJIIJ.LJJIL(LIZ);
                    i18 &= -3670017;
                }
            }
            c13zcLJIIJ.LJJJJLI();
            long j9 = ((C1685910tyP) c13zcLJIIJ.LJJIL(C1680350tpR.LIZ)).LIZ;
            float fFloatValue = ((Number) c13zcLJIIJ.LJJIL(C1680340tpQ.LIZ)).floatValue();
            long j10 = C1685910tyP.LJIIJ;
            if (j8 != j10) {
                jLIZJ = j8;
            } else if (c1693430uAX3.LIZJ() != j10) {
                jLIZJ = c1693430uAX3.LIZJ();
            } else {
                jLIZJ = C1685910tyP.LIZJ(fFloatValue, j9);
            }
            C1693430uAX c1693430uAX4 = C1693430uAX.LIZLLL;
            c1693240uAE2 = c1693240uAE2;
            abstractC1696400uFK2 = abstractC1696400uFK2;
            c1693510uAf2 = c1693510uAf2;
            C1693450uAZ c1693450uAZLIZ = C1693470uAb.LIZ(c1693430uAX3.LIZ, j10, null, Float.NaN, j7, c1680190tpB2, c1693240uAE2, null, abstractC1696400uFK2, null, j6, null, null, null, j10, c1693510uAf2, null, null, null);
            C1693480uAc c1693480uAc = c1693430uAX3.LIZIZ;
            if (c1692070u8L2 != null) {
                i22 = c1692070u8L2.LIZ;
            } else {
                i22 = Integer.MIN_VALUE;
            }
            C1693480uAc c1693480uAcLIZ = C1683300tuC.LIZ(c1693480uAc, i22, Integer.MIN_VALUE, j5, null, null, null, 0, Integer.MIN_VALUE, null);
            if (c1693430uAX3.LIZ == c1693450uAZLIZ && c1693430uAX3.LIZIZ == c1693480uAcLIZ) {
                c1693430uAX2 = c1693430uAX3;
            } else {
                c1693430uAX2 = new C1693430uAX(c1693450uAZLIZ, c1693480uAcLIZ);
            }
            int i45 = i18 << 9;
            C1691640u7e.LIZLLL(str, interfaceC1685750ty92, c1693430uAX2, function12, i26, z2, i25, i24, new InterfaceC1691620u7c() { // from class: X.0tse
                @Override // X.InterfaceC1691620u7c
                public final long LIZ() {
                    return jLIZJ;
                }
            }, c13zcLJIIJ, (i7 & 112) | (i7 & 14) | ((i18 >> 6) & 7168) | (i45 & 57344) | (i45 & 458752) | (i45 & 3670016) | (i45 & 29360128), 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1682330tsd(str, interfaceC1685750ty92, j8, j7, c1693240uAE2, c1680190tpB2, abstractC1696400uFK2, j6, c1693510uAf2, c1692070u8L2, j5, i26, z2, i25, i24, function12, c1693430uAX3, i4, i5, i6);
        }
    }
}
