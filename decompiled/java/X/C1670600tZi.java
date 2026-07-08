package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tZi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670600tZi {
    public static final void LIZ(final InterfaceC1670590tZh interfaceC1670590tZh, final String str, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1668050tVb interfaceC1668050tVb, InterfaceC1671600tbK interfaceC1671600tbK, InterfaceC1667140tU8 interfaceC1667140tU8, InterfaceC1667140tU8 interfaceC1667140tU82, InterfaceC1667140tU8 interfaceC1667140tU83, C1670570tZf c1670570tZf, C05AR c05ar, InterfaceC1680500tpg interfaceC1680500tpg, final int i, final int i2) {
        int i3;
        boolean zLJII;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        final C05AR c05ar2;
        boolean zLJII2;
        boolean zLJII3;
        boolean zLJII4;
        boolean zLJII5;
        C1670570tZf c1670570tZf2 = c1670570tZf;
        InterfaceC1667140tU8 interfaceC1667140tU84 = interfaceC1667140tU83;
        InterfaceC1667140tU8 interfaceC1667140tU85 = interfaceC1667140tU82;
        InterfaceC1667140tU8 interfaceC1667140tU86 = interfaceC1667140tU8;
        InterfaceC1671600tbK interfaceC1671600tbK2 = interfaceC1671600tbK;
        InterfaceC1668050tVb interfaceC1668050tVb2 = interfaceC1668050tVb;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1383623865);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(interfaceC1670590tZh);
            } else {
                zLJII = c13zcLJIIJ.LJII(interfaceC1670590tZh);
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
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1668050tVb2)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i12 = i2 & 16;
        if (i12 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1671600tbK2)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        int i13 = i2 & 32;
        int i14 = 196608;
        if (i13 == 0) {
            if ((196608 & i) == 0) {
                if ((262144 & i) == 0) {
                    zLJII5 = c13zcLJIIJ.LJJIIJ(interfaceC1667140tU86);
                } else {
                    zLJII5 = c13zcLJIIJ.LJII(interfaceC1667140tU86);
                }
                if (zLJII5) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i3 |= i14;
            }
        } else {
            i3 |= i14;
        }
        int i15 = i2 & 64;
        int i16 = 1572864;
        if (i15 == 0) {
            if ((1572864 & i) == 0) {
                if ((2097152 & i) == 0) {
                    zLJII4 = c13zcLJIIJ.LJJIIJ(interfaceC1667140tU85);
                } else {
                    zLJII4 = c13zcLJIIJ.LJII(interfaceC1667140tU85);
                }
                if (zLJII4) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i3 |= i16;
            }
        } else {
            i3 |= i16;
        }
        int i17 = i2 & 128;
        int i18 = 12582912;
        if (i17 == 0) {
            if ((12582912 & i) == 0) {
                if ((16777216 & i) == 0) {
                    zLJII3 = c13zcLJIIJ.LJJIIJ(interfaceC1667140tU84);
                } else {
                    zLJII3 = c13zcLJIIJ.LJII(interfaceC1667140tU84);
                }
                if (zLJII3) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i3 |= i18;
            }
        } else {
            i3 |= i18;
        }
        int i19 = i2 & 256;
        if (i19 != 0) {
            i3 |= 100663296;
        } else if ((100663296 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1670570tZf2)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i3 |= i9;
        }
        int i20 = i2 & 512;
        int i21 = 805306368;
        if (i20 == 0) {
            if ((805306368 & i) == 0) {
                if ((1073741824 & i) == 0) {
                    zLJII2 = c13zcLJIIJ.LJJIIJ(c05ar);
                } else {
                    zLJII2 = c13zcLJIIJ.LJII(c05ar);
                }
                if (zLJII2) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i3 |= i21;
            }
        } else {
            i3 |= i21;
        }
        if ((i3 & 306783379) == 306783378 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
            c05ar2 = c05ar;
        } else {
            if (i10 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i11 != 0) {
                InterfaceC1668050tVb.LIZ.getClass();
                interfaceC1668050tVb2 = C1668040tVa.LJFF;
            }
            if (i12 != 0) {
                InterfaceC1671600tbK.LIZ.getClass();
                interfaceC1671600tbK2 = C1671610tbL.LIZIZ;
            }
            if (i13 != 0) {
                interfaceC1667140tU86 = C1670620tZk.LIZ;
            }
            if (i15 != 0) {
                interfaceC1667140tU85 = C1670620tZk.LIZ;
            }
            if (i17 != 0) {
                interfaceC1667140tU84 = C1670620tZk.LIZ;
            }
            c05ar2 = null;
            if (i19 != 0) {
                c1670570tZf2 = null;
            }
            if (i20 == 0) {
                c05ar2 = c05ar;
            }
            int i22 = i3 >> 12;
            C1668230tVt.LIZ(C1670540tZc.LIZLLL(interfaceC1670590tZh, interfaceC1667140tU86, interfaceC1667140tU85, interfaceC1667140tU84, c1670570tZf2, c05ar2, c13zcLJIIJ, (i3 & 14) | (i22 & 112) | (i22 & 896) | (i22 & 7168) | (57344 & i22) | (i22 & 458752), 0), str, interfaceC1685750ty92, interfaceC1668050tVb2, interfaceC1671600tbK2, 0.0f, null, c13zcLJIIJ, (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344), 96);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            final InterfaceC1667140tU8 interfaceC1667140tU87 = interfaceC1667140tU86;
            final InterfaceC1667140tU8 interfaceC1667140tU88 = interfaceC1667140tU85;
            final InterfaceC1667140tU8 interfaceC1667140tU89 = interfaceC1667140tU84;
            final C1670570tZf c1670570tZf3 = c1670570tZf2;
            final InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            final InterfaceC1668050tVb interfaceC1668050tVb3 = interfaceC1668050tVb2;
            final InterfaceC1671600tbK interfaceC1671600tbK3 = interfaceC1671600tbK2;
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0tZj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC1670590tZh interfaceC1670590tZh2 = interfaceC1670590tZh;
                    String str2 = str;
                    InterfaceC1685750ty9 interfaceC1685750ty94 = interfaceC1685750ty93;
                    InterfaceC1668050tVb interfaceC1668050tVb4 = interfaceC1668050tVb3;
                    InterfaceC1671600tbK interfaceC1671600tbK4 = interfaceC1671600tbK3;
                    InterfaceC1667140tU8 interfaceC1667140tU810 = interfaceC1667140tU87;
                    InterfaceC1667140tU8 interfaceC1667140tU811 = interfaceC1667140tU88;
                    InterfaceC1667140tU8 interfaceC1667140tU812 = interfaceC1667140tU89;
                    C1670570tZf c1670570tZf4 = c1670570tZf3;
                    C05AR c05ar3 = c05ar2;
                    int i23 = i;
                    int i24 = i2;
                    ((Integer) obj2).intValue();
                    C1670600tZi.LIZ(interfaceC1670590tZh2, str2, interfaceC1685750ty94, interfaceC1668050tVb4, interfaceC1671600tbK4, interfaceC1667140tU810, interfaceC1667140tU811, interfaceC1667140tU812, c1670570tZf4, c05ar3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i23 | 1), i24);
                    return Unit.LIZ;
                }
            };
        }
    }
}
