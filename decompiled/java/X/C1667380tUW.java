package X;

import Y.AObjectS85S1200000_25;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tUW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667380tUW {
    public static final float LIZ = 32;

    public static final void LIZ(final String str, AbstractC1676270tir abstractC1676270tir, long j, boolean z, boolean z2, InterfaceC1631620sYq<? super InterfaceC1665870tS5, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        final Function0<Unit> function02;
        int i10;
        Function0<Unit> function03 = function0;
        boolean z3 = z2;
        boolean z4 = z;
        long jLJI = j;
        InterfaceC1631620sYq<? super InterfaceC1665870tS5, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
        AbstractC1676270tir abstractC1676270tir2 = abstractC1676270tir;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-540047545);
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
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(abstractC1676270tir2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0 && c13zcLJIIJ.LJIJJ(jLJI)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i3 |= i10;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z4)) {
                i6 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        int i13 = i2 & 16;
        if (i13 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z3)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        int i14 = i2 & 32;
        if (i14 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631620sYq2)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        int i15 = i2 & 64;
        if (i15 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJII(function03)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        if ((i3 & 599187) == 599186 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
            } else {
                function02 = null;
                if (i11 != 0) {
                    abstractC1676270tir2 = null;
                }
                if ((i2 & 4) != 0) {
                    jLJI = C19990313Jl.LJI(3.6d, EnumC19990213Jk.SECONDS);
                }
                if (i12 != 0) {
                    z4 = true;
                }
                if (i13 != 0) {
                    z3 = true;
                }
                if (i14 != 0) {
                    interfaceC1631620sYq2 = null;
                }
                if (i15 == 0) {
                }
                c13zcLJIIJ.LJJJJLI();
                function03 = function02;
                final long j2 = jLJI;
                final boolean z5 = z4;
                final boolean z6 = z3;
                final InterfaceC1631620sYq<? super InterfaceC1665870tS5, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq3 = interfaceC1631620sYq2;
                final AbstractC1676270tir abstractC1676270tir3 = abstractC1676270tir2;
                C1670410tZP.LIZ(C1ETL.LIZLLL(false, c13zcLJIIJ), null, null, null, null, null, C13Z4.LIZJ(721380514, new Function2<InterfaceC1680500tpg, Integer, Unit>() { // from class: X.0tUV
                    @Override // kotlin.jvm.functions.Function2
                    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg2, Integer num) {
                        InterfaceC1680500tpg interfaceC1680500tpg3 = interfaceC1680500tpg2;
                        if ((num.intValue() & 3) == 2 && interfaceC1680500tpg3.LIZ()) {
                            interfaceC1680500tpg3.LIZJ();
                        } else {
                            C1669340tXg.LIZ(j2, function02, C13Z4.LIZJ(-1224004867, new AObjectS85S1200000_25(interfaceC1631620sYq3, abstractC1676270tir3, str, 1), interfaceC1680500tpg3), z5, z6, false, interfaceC1680500tpg3, 384, 32);
                        }
                        return Unit.LIZ;
                    }
                }, c13zcLJIIJ), c13zcLJIIJ, 1572864, 62);
            }
            function02 = function03;
            c13zcLJIIJ.LJJJJLI();
            function03 = function02;
            final long j22 = jLJI;
            final boolean z52 = z4;
            final boolean z62 = z3;
            final InterfaceC1631620sYq<? super InterfaceC1665870tS5, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq32 = interfaceC1631620sYq2;
            final AbstractC1676270tir abstractC1676270tir32 = abstractC1676270tir2;
            C1670410tZP.LIZ(C1ETL.LIZLLL(false, c13zcLJIIJ), null, null, null, null, null, C13Z4.LIZJ(721380514, new Function2<InterfaceC1680500tpg, Integer, Unit>() { // from class: X.0tUV
                @Override // kotlin.jvm.functions.Function2
                public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg2, Integer num) {
                    InterfaceC1680500tpg interfaceC1680500tpg3 = interfaceC1680500tpg2;
                    if ((num.intValue() & 3) == 2 && interfaceC1680500tpg3.LIZ()) {
                        interfaceC1680500tpg3.LIZJ();
                    } else {
                        C1669340tXg.LIZ(j22, function02, C13Z4.LIZJ(-1224004867, new AObjectS85S1200000_25(interfaceC1631620sYq32, abstractC1676270tir32, str, 1), interfaceC1680500tpg3), z52, z62, false, interfaceC1680500tpg3, 384, 32);
                    }
                    return Unit.LIZ;
                }
            }, c13zcLJIIJ), c13zcLJIIJ, 1572864, 62);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            final boolean z7 = z4;
            final boolean z8 = z3;
            final InterfaceC1631620sYq<? super InterfaceC1665870tS5, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq4 = interfaceC1631620sYq2;
            final Function0<Unit> function04 = function03;
            final AbstractC1676270tir abstractC1676270tir4 = abstractC1676270tir2;
            final long j3 = jLJI;
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0iSP
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    AbstractC1676270tir abstractC1676270tir5 = abstractC1676270tir4;
                    long j4 = j3;
                    boolean z9 = z7;
                    boolean z10 = z8;
                    InterfaceC1631620sYq interfaceC1631620sYq5 = interfaceC1631620sYq4;
                    Function0 function05 = function04;
                    int i16 = i;
                    int i17 = i2;
                    ((Integer) obj2).intValue();
                    C1667380tUW.LIZ(str2, abstractC1676270tir5, j4, z9, z10, interfaceC1631620sYq5, function05, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i16 | 1), i17);
                    return Unit.LIZ;
                }
            };
        }
    }
}
