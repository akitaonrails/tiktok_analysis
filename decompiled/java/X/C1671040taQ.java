package X;

import Y.AObjectS124S0000000_25;
import Y.AObjectS368S0100000_25;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0taQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671040taQ {
    public static final void LIZ(final String str, InterfaceC1685750ty9 interfaceC1685750ty9, long j, C1693430uAX c1693430uAX, int i, int i2, boolean z, int i3, Function1<? super C1692150u8T, Unit> function1, float f, boolean z2, InterfaceC1671020taO interfaceC1671020taO, float f2, float f3, InterfaceC1680500tpg interfaceC1680500tpg, final int i4, final int i5, final int i6) {
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
        boolean zLJII;
        int i17;
        int i18;
        boolean z3;
        int i19;
        int i20;
        int i21;
        float f4 = f3;
        long jK3 = j;
        float f5 = f2;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        boolean z4 = z2;
        int i22 = i3;
        float f6 = f;
        int i23 = i2;
        int i24 = i;
        C1693430uAX c1693430uAX2 = c1693430uAX;
        InterfaceC1671020taO interfaceC1671020taO2 = interfaceC1671020taO;
        Function1<? super C1692150u8T, Unit> function12 = function1;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1754271706);
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i4;
        } else {
            i7 = i4;
        }
        int i25 = i6 & 2;
        if (i25 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i7 |= i9;
        }
        if ((i4 & 384) == 0) {
            if ((i6 & 4) == 0 && c13zcLJIIJ.LJIJJ(jK3)) {
                i21 = 256;
            } else {
                i21 = 128;
            }
            i7 |= i21;
        }
        int i26 = 1024;
        if ((i4 & 3072) == 0) {
            if ((i6 & 8) == 0 && c13zcLJIIJ.LJJIIJ(c1693430uAX2)) {
                i20 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i20 = 1024;
            }
            i7 |= i20;
        }
        if ((i4 & 24576) == 0) {
            if ((i6 & 16) == 0 && c13zcLJIIJ.LJIJI(i24)) {
                i19 = 16384;
            } else {
                i19 = 8192;
            }
            i7 |= i19;
        }
        int i27 = i6 & 32;
        if (i27 != 0) {
            i7 |= 196608;
        } else if ((196608 & i4) == 0) {
            if (c13zcLJIIJ.LJIJI(i23)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i7 |= i10;
        }
        int i28 = i6 & 64;
        if (i28 != 0) {
            i7 |= 1572864;
        } else if ((1572864 & i4) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i7 |= i11;
        }
        int i29 = i6 & 128;
        if (i29 != 0) {
            i7 |= 12582912;
        } else if ((12582912 & i4) == 0) {
            if (c13zcLJIIJ.LJIJI(i22)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i7 |= i12;
        }
        int i30 = i6 & 256;
        if (i30 != 0) {
            i7 |= 100663296;
        } else if ((100663296 & i4) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i7 |= i13;
        }
        int i31 = i6 & 512;
        if (i31 != 0) {
            i7 |= 805306368;
        } else if ((805306368 & i4) == 0) {
            if (c13zcLJIIJ.LJIJ(f6)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i7 |= i14;
        }
        int i32 = i6 & 1024;
        if (i32 != 0) {
            i15 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z4)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i15 = i5 | i16;
        } else {
            i15 = i5;
        }
        int i33 = i6 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        if (i33 != 0) {
            i15 |= 48;
        } else if ((i5 & 48) == 0) {
            if ((i5 & 64) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(interfaceC1671020taO2);
            } else {
                zLJII = c13zcLJIIJ.LJII(interfaceC1671020taO2);
            }
            if (zLJII) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i15 |= i17;
        }
        int i34 = i6 & SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        if (i34 != 0) {
            i15 |= 384;
        } else if ((i5 & 384) == 0) {
            if (c13zcLJIIJ.LJIJ(f5)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i15 |= i18;
        }
        int i35 = i6 & 8192;
        if (i35 != 0) {
            i15 |= 3072;
        } else if ((i5 & 3072) == 0) {
            if (c13zcLJIIJ.LJIJ(f4)) {
                i26 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            }
            i15 |= i26;
        }
        if ((i7 & 306783379) == 306783378 && (i15 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
            z3 = z;
        } else {
            c13zcLJIIJ.LJLI();
            if ((i4 & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                if ((i6 & 4) != 0) {
                    i7 &= -897;
                }
                if ((i6 & 8) != 0) {
                    i7 &= -7169;
                }
                if ((i6 & 16) != 0) {
                    i7 &= -57345;
                }
                z3 = z;
            } else {
                if (i25 != 0) {
                    interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
                }
                if ((i6 & 4) != 0) {
                    jK3 = C1670400tZO.LIZIZ(c13zcLJIIJ).K3();
                    i7 &= -897;
                }
                if ((i6 & 8) != 0) {
                    c1693430uAX2 = C1670400tZO.LJ(c13zcLJIIJ).LJIILJJIL;
                    i7 &= -7169;
                }
                if ((i6 & 16) != 0) {
                    i7 &= -57345;
                    i24 = Integer.MIN_VALUE;
                }
                z3 = true;
                if (i27 != 0) {
                    i23 = 1;
                }
                if (i28 == 0) {
                    z3 = z;
                }
                if (i29 != 0) {
                    i22 = Integer.MAX_VALUE;
                }
                if (i30 != 0) {
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ = c13zcLJIIJ.LJJ();
                    InterfaceC1680500tpg.LIZ.getClass();
                    if (objLJJ == C1680510tph.LIZIZ) {
                        objLJJ = new AObjectS124S0000000_25(7);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ);
                    }
                    function12 = (Function1) objLJJ;
                    c13zcLJIIJ.LJJJJL(false);
                }
                if (i31 != 0) {
                    f6 = 0.0f;
                }
                if (i32 != 0) {
                    z4 = false;
                }
                if (i33 != 0) {
                    InterfaceC1671020taO.LIZ.getClass();
                    interfaceC1671020taO2 = C1670980taK.LIZJ;
                }
                if (i34 != 0) {
                    f5 = 0.0f;
                }
                if (i35 != 0) {
                    f4 = 0.001f;
                }
            }
            c13zcLJIIJ.LJJJJLI();
            long j2 = jK3;
            c1693430uAX2 = c1693430uAX2;
            int i36 = i24;
            int i37 = i23;
            int i38 = i22;
            Function1<? super C1692150u8T, Unit> function13 = function12;
            float f7 = f6;
            boolean z5 = z4;
            InterfaceC1671020taO interfaceC1671020taO3 = interfaceC1671020taO2;
            float f8 = f5;
            float f9 = f4;
            InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            LIZIZ(new C1692220u8a(str), interfaceC1685750ty93, j2, c1693430uAX2, i36, i37, z3, i38, function13, f7, z5, interfaceC1671020taO3, f8, f9, c13zcLJIIJ, (i7 & 896) | (i7 & 112) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (3670016 & i7) | (29360128 & i7) | (234881024 & i7) | (i7 & 1879048192), (i15 & 14) | (i15 & 112) | (i15 & 896) | (i15 & 7168), 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            final InterfaceC1685750ty9 interfaceC1685750ty94 = interfaceC1685750ty92;
            final long j3 = jK3;
            final C1693430uAX c1693430uAX3 = c1693430uAX2;
            final int i39 = i24;
            final int i40 = i23;
            final boolean z6 = z3;
            final int i41 = i22;
            final Function1<? super C1692150u8T, Unit> function14 = function12;
            final float f10 = f6;
            final boolean z7 = z4;
            final InterfaceC1671020taO interfaceC1671020taO4 = interfaceC1671020taO2;
            final float f11 = f5;
            final float f12 = f4;
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0taP
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    InterfaceC1685750ty9 interfaceC1685750ty95 = interfaceC1685750ty94;
                    long j4 = j3;
                    C1693430uAX c1693430uAX4 = c1693430uAX3;
                    int i42 = i39;
                    int i43 = i40;
                    boolean z8 = z6;
                    int i44 = i41;
                    Function1 function15 = function14;
                    float f13 = f10;
                    boolean z9 = z7;
                    InterfaceC1671020taO interfaceC1671020taO5 = interfaceC1671020taO4;
                    float f14 = f11;
                    float f15 = f12;
                    int i45 = i4;
                    int i46 = i5;
                    int i47 = i6;
                    ((Integer) obj2).intValue();
                    C1671040taQ.LIZ(str2, interfaceC1685750ty95, j4, c1693430uAX4, i42, i43, z8, i44, function15, f13, z9, interfaceC1671020taO5, f14, f15, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i45 | 1), C341440Da2.LIZ(i46), i47);
                    return Unit.LIZ;
                }
            };
        }
    }

    public static final void LIZIZ(final C1692220u8a c1692220u8a, InterfaceC1685750ty9 interfaceC1685750ty9, long j, C1693430uAX c1693430uAX, int i, int i2, boolean z, int i3, Function1<? super C1692150u8T, Unit> function1, float f, boolean z2, InterfaceC1671020taO interfaceC1671020taO, float f2, float f3, InterfaceC1680500tpg interfaceC1680500tpg, final int i4, final int i5, final int i6) {
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
        boolean zLJII;
        int i17;
        int i18;
        final float f4;
        int i19;
        int i20;
        int i21;
        float f5 = f3;
        boolean z3 = z2;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        InterfaceC1671020taO interfaceC1671020taO2 = interfaceC1671020taO;
        final boolean z4 = z;
        int i22 = i3;
        int i23 = i2;
        float f6 = f;
        int i24 = i;
        final C1693430uAX c1693430uAX2 = c1693430uAX;
        Function1<? super C1692150u8T, Unit> function12 = function1;
        long jK3 = j;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1342579390);
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1692220u8a)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i4;
        } else {
            i7 = i4;
        }
        int i25 = i6 & 2;
        if (i25 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i7 |= i9;
        }
        if ((i4 & 384) == 0) {
            if ((i6 & 4) == 0 && c13zcLJIIJ.LJIJJ(jK3)) {
                i21 = 256;
            } else {
                i21 = 128;
            }
            i7 |= i21;
        }
        int i26 = 1024;
        if ((i4 & 3072) == 0) {
            if ((i6 & 8) == 0 && c13zcLJIIJ.LJJIIJ(c1693430uAX2)) {
                i20 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i20 = 1024;
            }
            i7 |= i20;
        }
        if ((i4 & 24576) == 0) {
            if ((i6 & 16) == 0 && c13zcLJIIJ.LJIJI(i24)) {
                i19 = 16384;
            } else {
                i19 = 8192;
            }
            i7 |= i19;
        }
        int i27 = i6 & 32;
        if (i27 != 0) {
            i7 |= 196608;
        } else if ((196608 & i4) == 0) {
            if (c13zcLJIIJ.LJIJI(i23)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i7 |= i10;
        }
        int i28 = i6 & 64;
        if (i28 != 0) {
            i7 |= 1572864;
        } else if ((1572864 & i4) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z4)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i7 |= i11;
        }
        int i29 = i6 & 128;
        if (i29 != 0) {
            i7 |= 12582912;
        } else if ((12582912 & i4) == 0) {
            if (c13zcLJIIJ.LJIJI(i22)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i7 |= i12;
        }
        int i30 = i6 & 256;
        if (i30 != 0) {
            i7 |= 100663296;
        } else if ((100663296 & i4) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i7 |= i13;
        }
        int i31 = i6 & 512;
        if (i31 != 0) {
            i7 |= 805306368;
        } else if ((805306368 & i4) == 0) {
            if (c13zcLJIIJ.LJIJ(f6)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i7 |= i14;
        }
        int i32 = i6 & 1024;
        if (i32 != 0) {
            i15 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z3)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i15 = i5 | i16;
        } else {
            i15 = i5;
        }
        int i33 = i6 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        if (i33 != 0) {
            i15 |= 48;
        } else if ((i5 & 48) == 0) {
            if ((i5 & 64) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(interfaceC1671020taO2);
            } else {
                zLJII = c13zcLJIIJ.LJII(interfaceC1671020taO2);
            }
            if (zLJII) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i15 |= i17;
        }
        int i34 = i6 & SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        if (i34 != 0) {
            i15 |= 384;
        } else if ((i5 & 384) == 0) {
            if (c13zcLJIIJ.LJIJ(f2)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i15 |= i18;
        }
        int i35 = i6 & 8192;
        if (i35 != 0) {
            i15 |= 3072;
        } else if ((i5 & 3072) == 0) {
            if (c13zcLJIIJ.LJIJ(f5)) {
                i26 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            }
            i15 |= i26;
        }
        if ((i7 & 306783379) == 306783378 && (i15 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
            f4 = f2;
        } else {
            c13zcLJIIJ.LJLI();
            if ((i4 & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                f4 = f2;
            } else {
                if (i25 != 0) {
                    interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
                }
                if ((i6 & 4) != 0) {
                    jK3 = C1670400tZO.LIZIZ(c13zcLJIIJ).K3();
                }
                if ((i6 & 8) != 0) {
                    c1693430uAX2 = C1670400tZO.LJ(c13zcLJIIJ).LJIILJJIL;
                }
                if ((i6 & 16) != 0) {
                    i24 = Integer.MIN_VALUE;
                }
                boolean z5 = true;
                if (i27 != 0) {
                    i23 = 1;
                }
                if (i28 == 0) {
                    z5 = z4;
                }
                if (i29 != 0) {
                    i22 = Integer.MAX_VALUE;
                }
                if (i30 != 0) {
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ = c13zcLJIIJ.LJJ();
                    InterfaceC1680500tpg.LIZ.getClass();
                    if (objLJJ == C1680510tph.LIZIZ) {
                        objLJJ = new AObjectS124S0000000_25(10);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ);
                    }
                    function12 = (Function1) objLJJ;
                    c13zcLJIIJ.LJJJJL(false);
                }
                f4 = 0.0f;
                if (i31 != 0) {
                    f6 = 0.0f;
                }
                if (i32 != 0) {
                    z3 = false;
                }
                if (i33 != 0) {
                    InterfaceC1671020taO.LIZ.getClass();
                    interfaceC1671020taO2 = C1670980taK.LIZJ;
                }
                if (i34 == 0) {
                    f4 = f2;
                }
                if (i35 != 0) {
                    f5 = 0.001f;
                    z4 = z5;
                } else {
                    z4 = z5;
                }
            }
            c13zcLJIIJ.LJJJJLI();
            final C1691540u7U c1691540u7ULIZ = C1672580tcu.LIZ(128, 6, 0, c13zcLJIIJ);
            final C259800zU c259800zU = new C259800zU();
            c1693430uAX2 = c1693430uAX2;
            final long j2 = jK3;
            final int i36 = i24;
            final int i37 = i23;
            z4 = z4;
            final int i38 = i22;
            final InterfaceC1671020taO interfaceC1671020taO3 = interfaceC1671020taO2;
            final float f7 = f5;
            final float f8 = f6;
            final boolean z6 = z3;
            final Function1<? super C1692150u8T, Unit> function13 = function12;
            C1668170tVn.LIZ(C1672700td6.LIZ(interfaceC1685750ty92, new InterfaceC1631620sYq() { // from class: X.0tll
                /* JADX WARN: Type inference failed for: r4v11, types: [T, X.0u8T, java.lang.Object] */
                @Override // X.InterfaceC1631620sYq
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    long j3;
                    InterfaceC1665500tRU<Pair<C1682440tso, C1682440tso>> interfaceC1665500tRULIZ;
                    C1693430uAX c1693430uAXLIZ;
                    int i39;
                    float fLIZLLL;
                    long j4;
                    C1691540u7U c1691540u7U = c1691540u7ULIZ;
                    C1692220u8a c1692220u8a2 = c1692220u8a;
                    C1693430uAX c1693430uAX3 = c1693430uAX2;
                    long j5 = j2;
                    int i40 = i36;
                    int i41 = i37;
                    boolean z7 = z4;
                    int i42 = i38;
                    InterfaceC1671020taO interfaceC1671020taO4 = interfaceC1671020taO3;
                    float f9 = f4;
                    float f10 = f7;
                    float f11 = f8;
                    boolean z8 = z6;
                    C259800zU c259800zU2 = c259800zU;
                    Function1 function14 = function13;
                    InterfaceC1689940u4u interfaceC1689940u4u = (InterfaceC1689940u4u) obj;
                    InterfaceC1673370teB interfaceC1673370teB = (InterfaceC1673370teB) obj2;
                    final C1682380tsi c1682380tsi = (C1682380tsi) obj3;
                    C1693430uAX c1693430uAXLIZ2 = C1693430uAX.LIZ(i40, 0, 16744446, j5, 0L, 0L, 0L, null, c1693430uAX3, null, null);
                    C1678080tlm c1678080tlm = new C1678080tlm(c1691540u7U, c1692220u8a2, c1693430uAXLIZ2, i41, z7, i42, c1682380tsi.LIZ, null);
                    C1678130tlr c1678130tlr = new C1678130tlr(interfaceC1671020taO4);
                    if (interfaceC1671020taO4 instanceof C1670990taL) {
                        interfaceC1665500tRULIZ = ((C1670990taL) interfaceC1671020taO4).LIZIZ;
                    } else if (interfaceC1671020taO4 instanceof C1678090tln) {
                        C1678090tln c1678090tln = (C1678090tln) interfaceC1671020taO4;
                        if (C1682440tso.LIZ(c1678090tln.LIZIZ, C1682440tso.LIZJ)) {
                            j3 = c1693430uAXLIZ2.LIZ.LIZIZ;
                        } else {
                            j3 = c1678090tln.LIZIZ;
                        }
                        ArrayList<Pair> arrayList = new ArrayList();
                        int i43 = 0;
                        do {
                            long jLIZJ = C1682430tsn.LIZJ((((double) C1682440tso.LIZLLL(j3)) * 0.857354474131783d) + 1.38832501234431d);
                            long jLIZLLL = C1682430tsn.LIZLLL(C1682440tso.LIZLLL(j3) - C1682440tso.LIZLLL(C1682430tsn.LIZJ((((double) ((float) Math.log(C1682440tso.LIZLLL(j3)))) * 1.32113155603272d) - 2.72287181827213d)));
                            arrayList.add(new Pair(new C1682440tso(jLIZJ), new C1682440tso(j3)));
                            i43++;
                            j3 = jLIZLLL;
                        } while (i43 < 3);
                        if (C1682440tso.LIZ(((C1678090tln) c1678130tlr.LIZ).LIZJ, C1682440tso.LIZJ)) {
                            interfaceC1665500tRULIZ = C1687430u0r.LIZ(arrayList);
                        } else {
                            long j6 = ((C1678090tln) c1678130tlr.LIZ).LIZJ;
                            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                            for (Pair pair : arrayList) {
                                float fLIZLLL2 = C1682440tso.LIZLLL(j6);
                                float fLIZLLL3 = C1682440tso.LIZLLL(((C1682440tso) pair.getFirst()).LIZ);
                                if (fLIZLLL3 < fLIZLLL2) {
                                    fLIZLLL3 = fLIZLLL2;
                                }
                                C1682440tso c1682440tso = new C1682440tso(C1682430tsn.LIZLLL(fLIZLLL3));
                                float fLIZLLL4 = C1682440tso.LIZLLL(((C1682440tso) pair.getSecond()).LIZ);
                                if (fLIZLLL4 >= fLIZLLL2) {
                                    fLIZLLL2 = fLIZLLL4;
                                }
                                arrayList2.add(new Pair(c1682440tso, new C1682440tso(C1682430tsn.LIZLLL(fLIZLLL2))));
                            }
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            long j7 = ((C1682440tso) ((Pair) ListProtector.get(arrayList3, 2)).getFirst()).LIZ;
                            C1682430tsn.LIZIZ(j7, j6);
                            if (Float.compare(C1682440tso.LIZLLL(j7), C1682440tso.LIZLLL(j6)) > 0) {
                                int iCeil = (int) Math.ceil((C1691540u7U.LIZIZ(c1678080tlm.LIZ, c1678080tlm.LIZIZ, C1693430uAX.LIZ(0, 0, 16777213, 0L, j7, 0L, 0L, null, c1678080tlm.LIZJ, null, null), c1678080tlm.LIZLLL, c1678080tlm.LJ, c1678080tlm.LJFF, null, c1678080tlm.LJI, null, null, null, false, 1952).LIZIZ.LJ * 1.0f) / C1691540u7U.LIZIZ(c1678080tlm.LIZ, c1678080tlm.LIZIZ, C1693430uAX.LIZ(0, 0, 16777213, 0L, j6, 0L, 0L, null, c1678080tlm.LIZJ, null, null), c1678080tlm.LIZLLL, c1678080tlm.LJ, c1678080tlm.LJFF, null, c1678080tlm.LJI, null, null, null, false, 1952).LIZIZ.LJ);
                                int iFloor = (int) Math.floor(((C1682440tso.LIZLLL(j7) - C1682440tso.LIZLLL(j6)) * 1.0f) / iCeil);
                                float fFloor = (float) Math.floor(C1682440tso.LIZLLL(j6) / 17.0f);
                                for (int i44 = 0; i44 < iCeil; i44++) {
                                    fFloor /= i44 + 1.0f;
                                    arrayList3.add(new Pair(new C1682440tso(C1682430tsn.LIZLLL(((iCeil - r9) * iFloor) + C1682440tso.LIZLLL(j6))), new C1682440tso(C1682430tsn.LIZLLL(((iCeil - i44) * iFloor) + C1682440tso.LIZLLL(j6) + C814420VxA.LIZIZ(fFloor)))));
                                }
                            }
                            interfaceC1665500tRULIZ = C1687430u0r.LIZ(arrayList3);
                        }
                    } else {
                        throw new C1954807lC();
                    }
                    if (!interfaceC1665500tRULIZ.isEmpty()) {
                        C1691540u7U c1691540u7U2 = c1678080tlm.LIZ;
                        C1692220u8a c1692220u8a3 = c1678080tlm.LIZIZ;
                        C1693430uAX c1693430uAX4 = c1678080tlm.LIZJ;
                        int i45 = c1678080tlm.LIZLLL;
                        boolean z9 = c1678080tlm.LJ;
                        long j8 = c1678080tlm.LJI;
                        Iterator<Pair<C1682440tso, C1682440tso>> it2 = interfaceC1665500tRULIZ.iterator();
                        C1682440tso c1682440tso2 = null;
                        int i46 = 0;
                        while (true) {
                            if (it2.hasNext()) {
                                Pair<C1682440tso, C1682440tso> next = it2.next();
                                int i47 = i46 + 1;
                                if (i46 >= 0) {
                                    Pair<C1682440tso, C1682440tso> pair2 = next;
                                    long jLIZLLL2 = pair2.getFirst().LIZ;
                                    long jLIZLLL3 = pair2.getSecond().LIZ;
                                    while (true) {
                                        C1682430tsn.LIZIZ(jLIZLLL2, jLIZLLL3);
                                        if (Float.compare(C1682440tso.LIZLLL(jLIZLLL2), C1682440tso.LIZLLL(jLIZLLL3)) > 0) {
                                            break;
                                        }
                                        long jLIZLLL4 = C1682430tsn.LIZLLL((C1682440tso.LIZLLL(jLIZLLL2) + C1682440tso.LIZLLL(jLIZLLL3)) / 2);
                                        c1693430uAX4 = c1693430uAX4;
                                        c1691540u7U2 = c1691540u7U2;
                                        c1692220u8a3 = c1692220u8a3;
                                        if (C1691540u7U.LIZIZ(c1691540u7U2, c1692220u8a3, C1693430uAX.LIZ(0, 0, 16777213, 0L, jLIZLLL4, 0L, 0L, null, c1693430uAX4, null, null), i45, z9, Integer.MAX_VALUE, null, j8, null, null, null, false, 1952).LIZIZ.LJFF <= i47) {
                                            jLIZLLL2 = C1682430tsn.LIZLLL(C1682440tso.LIZLLL(jLIZLLL4) + 1);
                                            c1682440tso2 = new C1682440tso(jLIZLLL4);
                                        } else {
                                            jLIZLLL3 = C1682430tsn.LIZLLL(C1682440tso.LIZLLL(jLIZLLL4) - 1);
                                        }
                                    }
                                    if (c1682440tso2 != null) {
                                        j4 = c1682440tso2.LIZ;
                                        break;
                                    }
                                    i46 = i47;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            } else {
                                j4 = interfaceC1665500tRULIZ.get(interfaceC1665500tRULIZ.size() - 1).getFirst().LIZ;
                                break;
                            }
                        }
                        c1693430uAXLIZ = C1693430uAX.LIZ(0, 0, 16777213, 0L, j4, 0L, 0L, null, c1678080tlm.LIZJ, null, null);
                    } else {
                        c1693430uAXLIZ = c1678080tlm.LIZJ;
                    }
                    C1678080tlm c1678080tlmLIZ = C1678080tlm.LIZ(c1678080tlm, c1693430uAXLIZ, 0L, C1691540u7U.LIZIZ(c1678080tlm.LIZ, c1678080tlm.LIZIZ, c1693430uAXLIZ, c1678080tlm.LIZLLL, c1678080tlm.LJ, c1678080tlm.LJFF, null, c1678080tlm.LJI, null, null, null, false, 1952), 123);
                    C1678120tlq c1678120tlq = new C1678120tlq(f9, f10);
                    C1692150u8T c1692150u8T = c1678080tlmLIZ.LJII;
                    if (c1692150u8T != null) {
                        boolean zLJ = c1692150u8T.LJ();
                        if (f9 < 0.0f && f10 > 0.0f && zLJ) {
                            C1693430uAX c1693430uAX5 = c1678080tlmLIZ.LIZJ;
                            if (C1682440tso.LIZ(c1693430uAX5.LIZ.LJII, C1682440tso.LIZJ)) {
                                fLIZLLL = 0.0f;
                            } else {
                                fLIZLLL = C1682440tso.LIZLLL(c1693430uAX5.LIZ.LJII);
                            }
                            if (C1691540u7U.LIZIZ(c1678080tlmLIZ.LIZ, c1678080tlmLIZ.LIZIZ, C1693430uAX.LIZ(0, 0, 16777087, 0L, 0L, C1682430tsn.LIZLLL((f9 / C1682440tso.LIZLLL(c1693430uAX5.LIZ.LIZIZ)) + fLIZLLL), 0L, null, c1693430uAX5, null, null), c1678080tlmLIZ.LIZLLL, c1678080tlmLIZ.LJ, Integer.MAX_VALUE, null, c1678080tlmLIZ.LJI, null, null, null, false, 1952).LIZIZ.LJFF == 1) {
                                float f12 = fLIZLLL;
                                while (true) {
                                    if (f12 < c1678120tlq.LIZ + fLIZLLL) {
                                        break;
                                    }
                                    f12 -= c1678120tlq.LIZIZ;
                                    C1693430uAX c1693430uAXLIZ3 = C1693430uAX.LIZ(0, 0, 16777087, 0L, 0L, C1682430tsn.LIZLLL(f12), 0L, null, c1693430uAX5, null, null);
                                    C1692150u8T c1692150u8TLIZIZ = C1691540u7U.LIZIZ(c1678080tlmLIZ.LIZ, c1678080tlmLIZ.LIZIZ, c1693430uAXLIZ3, c1678080tlmLIZ.LIZLLL, c1678080tlmLIZ.LJ, Integer.MAX_VALUE, null, c1678080tlmLIZ.LJI, null, null, null, false, 1952);
                                    if (c1692150u8TLIZIZ.LIZIZ.LJFF == 1) {
                                        c1678080tlmLIZ = C1678080tlm.LIZ(c1678080tlmLIZ, c1693430uAXLIZ3, 0L, c1692150u8TLIZIZ, 123);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    C1678140tls c1678140tls = new C1678140tls(f11);
                    int iLJIIIIZZ = C1682380tsi.LJIIIIZZ(c1678080tlmLIZ.LJI);
                    C1692150u8T c1692150u8T2 = c1678080tlmLIZ.LJII;
                    if (c1692150u8T2 != null && f11 != 0.0f && iLJIIIIZZ != Integer.MAX_VALUE && (i39 = c1692150u8T2.LIZIZ.LJFF) > 1) {
                        C531650Kt9 it3 = C13LZ.LJIILJJIL(0, i39).iterator();
                        int iAbs = 0;
                        while (it3.LLILLL) {
                            int iNextInt = it3.nextInt();
                            iAbs += (int) (iLJIIIIZZ - Math.abs(c1692150u8T2.LJIIJ(iNextInt) - c1692150u8T2.LJIIIZ(iNextInt)));
                        }
                        int i48 = iLJIIIIZZ - (iAbs / i39);
                        int iLJIIJ = C1682380tsi.LJIIJ(c1678080tlmLIZ.LJI);
                        if (i48 < iLJIIJ) {
                            i48 = iLJIIJ;
                        }
                        int i49 = iLJIIIIZZ;
                        int i50 = iLJIIIIZZ;
                        while (i48 <= i49) {
                            int i51 = (i48 + i49) / 2;
                            long j9 = c1678080tlmLIZ.LJI;
                            if (C1691540u7U.LIZIZ(c1678080tlmLIZ.LIZ, c1678080tlmLIZ.LIZIZ, c1678080tlmLIZ.LIZJ, c1678080tlmLIZ.LIZLLL, c1678080tlmLIZ.LJ, Integer.MAX_VALUE, null, C1682380tsi.LIZ(i51, i51, C1682380tsi.LJIIIZ(j9), C1682380tsi.LJII(j9)), null, null, null, false, 1952).LIZIZ.LJFF == i39) {
                                i50 = i49;
                                i49 = i51 - 1;
                            } else {
                                i50 = i51 + 1;
                                i48 = i50;
                            }
                        }
                        int i52 = (int) (iLJIIIIZZ - ((iLJIIIIZZ - i50) * c1678140tls.LIZ));
                        long j10 = c1678080tlmLIZ.LJI;
                        long jLIZ = C1682380tsi.LIZ(i52, i52, C1682380tsi.LJIIIZ(j10), C1682380tsi.LJII(j10));
                        c1678080tlmLIZ = C1678080tlm.LIZ(c1678080tlmLIZ, null, jLIZ, C1691540u7U.LIZIZ(c1678080tlmLIZ.LIZ, c1678080tlmLIZ.LIZIZ, c1678080tlmLIZ.LIZJ, c1678080tlmLIZ.LIZLLL, c1678080tlmLIZ.LJ, c1678080tlmLIZ.LJFF, null, jLIZ, null, null, null, false, 1952), 63);
                    }
                    C1692150u8T c1692150u8T3 = c1678080tlmLIZ.LJII;
                    if (c1692150u8T3 != null && z8) {
                        C531650Kt9 it4 = C13LZ.LJIILJJIL(0, c1692150u8T3.LIZIZ.LJFF).iterator();
                        if (it4.LLILLL) {
                            int iNextInt2 = it4.nextInt();
                            float fAbs = ((int) (c1692150u8T3.LIZJ >> 32)) - Math.abs(c1692150u8T3.LJIIJ(iNextInt2) - c1692150u8T3.LJIIIZ(iNextInt2));
                            while (it4.LLILLL) {
                                int iNextInt3 = it4.nextInt();
                                fAbs = Math.min(fAbs, ((int) (c1692150u8T3.LIZJ >> 32)) - Math.abs(c1692150u8T3.LJIIJ(iNextInt3) - c1692150u8T3.LJIIIZ(iNextInt3)));
                            }
                            if (fAbs > 0.0f) {
                                int i53 = ((int) (c1692150u8T3.LIZJ >> 32)) - ((int) fAbs);
                                long j11 = c1678080tlmLIZ.LJI;
                                long jLIZ2 = C1682380tsi.LIZ(i53, i53, C1682380tsi.LJIIIZ(j11), C1682380tsi.LJII(j11));
                                c1678080tlmLIZ = C1678080tlm.LIZ(c1678080tlmLIZ, null, jLIZ2, C1691540u7U.LIZIZ(c1678080tlmLIZ.LIZ, c1678080tlmLIZ.LIZIZ, c1678080tlmLIZ.LIZJ, c1678080tlmLIZ.LIZLLL, c1678080tlmLIZ.LJ, c1678080tlmLIZ.LJFF, null, jLIZ2, null, null, null, false, 1952), 63);
                            }
                        } else {
                            throw new NoSuchElementException();
                        }
                    }
                    ?? r4 = c1678080tlmLIZ.LJII;
                    c259800zU2.element = r4;
                    long j12 = r4.LIZJ;
                    final int i54 = (int) (j12 >> 32);
                    final int i55 = (int) (j12 & 4294967295L);
                    final AbstractC1686530tzP abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(C1682390tsj.LIZ(i54, i54, i55, i55));
                    function14.invoke(r4);
                    return interfaceC1689940u4u.LJLJJL(abstractC1686530tzPLJJJJZ.LL, abstractC1686530tzPLJJJJZ.LLILLJJLI, C2097608Jq.LJ(), new Function1() { // from class: X.0tlo
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            int i56 = i54;
                            C1682380tsi c1682380tsi2 = c1682380tsi;
                            int i57 = i55;
                            AbstractC1683310tuD.LJFF((AbstractC1683310tuD) obj4, abstractC1686530tzPLJJJJZ, (-(C13LZ.LJ(i56, C1682380tsi.LJIIJ(c1682380tsi2.LIZ), C1682380tsi.LJIIIIZZ(c1682380tsi2.LIZ)) - i56)) / 2, (-(C13LZ.LJ(i57, C1682380tsi.LJIIIZ(c1682380tsi2.LIZ), C1682380tsi.LJII(c1682380tsi2.LIZ)) - i57)) / 2);
                            return Unit.LIZ;
                        }
                    });
                }
            }), new AObjectS368S0100000_25(c259800zU, 15), c13zcLJIIJ, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            final InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            final long j3 = jK3;
            final C1693430uAX c1693430uAX3 = c1693430uAX2;
            final int i39 = i24;
            final int i40 = i23;
            final boolean z7 = z4;
            final int i41 = i22;
            final Function1<? super C1692150u8T, Unit> function14 = function12;
            final float f9 = f6;
            final boolean z8 = z3;
            final InterfaceC1671020taO interfaceC1671020taO4 = interfaceC1671020taO2;
            final float f10 = f5;
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0taR
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C1692220u8a c1692220u8a2 = c1692220u8a;
                    InterfaceC1685750ty9 interfaceC1685750ty94 = interfaceC1685750ty93;
                    long j4 = j3;
                    C1693430uAX c1693430uAX4 = c1693430uAX3;
                    int i42 = i39;
                    int i43 = i40;
                    boolean z9 = z7;
                    int i44 = i41;
                    Function1 function15 = function14;
                    float f11 = f9;
                    boolean z10 = z8;
                    InterfaceC1671020taO interfaceC1671020taO5 = interfaceC1671020taO4;
                    float f12 = f4;
                    float f13 = f10;
                    int i45 = i4;
                    int i46 = i5;
                    int i47 = i6;
                    ((Integer) obj2).intValue();
                    C1671040taQ.LIZIZ(c1692220u8a2, interfaceC1685750ty94, j4, c1693430uAX4, i42, i43, z9, i44, function15, f11, z10, interfaceC1671020taO5, f12, f13, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i45 | 1), C341440Da2.LIZ(i46), i47);
                    return Unit.LIZ;
                }
            };
        }
    }
}
