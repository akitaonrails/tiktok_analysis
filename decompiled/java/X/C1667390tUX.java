package X;

import Y.AObjectS114S1100000_25;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tUX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667390tUX {
    public static final void LIZ(final EnumC1668010tVX enumC1668010tVX, final String str, final String str2, final String str3, final String str4, final Function0<Unit> function0, final Function0<Unit> function02, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-998133311);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(enumC1668010tVX.ordinal())) {
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
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str3)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str4)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        int i12 = i2 & 128;
        if (i12 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i3 |= i11;
        }
        if ((i3 & 4793491) == 4793490 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i12 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1675980tiO.LIZIZ(interfaceC1685750ty92, C1685910tyP.LJIIIZ, C1669430tXp.LIZ);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZIZ);
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
                C1670410tZP.LIZ(C1ETL.LIZ(c13zcLJIIJ), null, null, null, null, null, C13Z4.LIZJ(1496741260, new Function2<InterfaceC1680500tpg, Integer, Unit>() { // from class: X.0tUY
                    @Override // kotlin.jvm.functions.Function2
                    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg2, Integer num) {
                        InterfaceC1680500tpg interfaceC1680500tpg3 = interfaceC1680500tpg2;
                        if ((num.intValue() & 3) == 2 && interfaceC1680500tpg3.LIZ()) {
                            interfaceC1680500tpg3.LIZJ();
                        } else {
                            C1670950taH.LIZ(C13Z4.LIZJ(-1118856240, new AObjectS114S1100000_25(str, enumC1668010tVX, 1), interfaceC1680500tpg3), null, null, str2, str3, C13Z4.LIZJ(591883179, new AObjectS114S1100000_25(str4, function02, 2), interfaceC1680500tpg3), null, false, false, false, true, false, function0, interfaceC1680500tpg3, 196614, 6, 3014);
                        }
                        return Unit.LIZ;
                    }
                }, c13zcLJIIJ), c13zcLJIIJ, 1572864, 62);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            final InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0iXr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    EnumC1668010tVX enumC1668010tVX2 = enumC1668010tVX;
                    String str5 = str;
                    String str6 = str2;
                    String str7 = str3;
                    String str8 = str4;
                    Function0 function03 = function0;
                    Function0 function04 = function02;
                    InterfaceC1685750ty9 interfaceC1685750ty94 = interfaceC1685750ty93;
                    int i13 = i;
                    int i14 = i2;
                    ((Integer) obj2).intValue();
                    C1667390tUX.LIZ(enumC1668010tVX2, str5, str6, str7, str8, function03, function04, interfaceC1685750ty94, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i13 | 1), i14);
                    return Unit.LIZ;
                }
            };
        }
    }
}
