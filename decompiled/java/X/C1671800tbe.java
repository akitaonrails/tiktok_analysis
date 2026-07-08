package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: renamed from: X.0tbe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671800tbe {
    public static final void LIZ(boolean z, boolean z2, Function0<Unit> function0, String str, C1668880tWw c1668880tWw, String str2, Function0<Unit> function02, String str3, Function0<Unit> function03, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean zLJII;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Function0<Unit> function04;
        int i13;
        String str4 = str;
        String str5 = str3;
        Function0<Unit> function05 = function02;
        C1668880tWw c1668880tWw2 = c1668880tWw;
        String str6 = str2;
        Function0<Unit> function06 = function0;
        boolean z3 = z2;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1860104108);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
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
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z3)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i15 = i2 & 4;
        if (i15 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function06)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i16 = i2 & 8;
        if (i16 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str4)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i17 = i2 & 16;
        if (i17 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if ((32768 & i) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(c1668880tWw2);
            } else {
                zLJII = c13zcLJIIJ.LJII(c1668880tWw2);
            }
            if (zLJII) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        int i18 = i2 & 32;
        if (i18 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str6)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0 && c13zcLJIIJ.LJII(function05)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i3 |= i13;
        }
        int i19 = i2 & 128;
        if (i19 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str5)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i3 |= i10;
        }
        int i20 = i2 & 256;
        if (i20 != 0) {
            i3 |= 100663296;
        } else if ((100663296 & i) == 0) {
            if (c13zcLJIIJ.LJII(function03)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i3 |= i11;
        }
        if ((i2 & 512) != 0) {
            i3 |= 805306368;
        } else if ((805306368 & i) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i3 |= i12;
        }
        if ((i3 & 306783379) == 306783378 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
            function04 = function03;
        } else {
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                }
                function04 = function03;
            } else {
                if (i14 != 0) {
                    z3 = false;
                }
                function04 = null;
                if (i15 != 0) {
                    function06 = null;
                }
                if (i16 != 0) {
                    str4 = null;
                }
                if (i17 != 0) {
                    c1668880tWw2 = null;
                }
                if (i18 != 0) {
                    str6 = null;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    function05 = function06;
                }
                if (i19 != 0) {
                    str5 = null;
                }
                if (i20 == 0) {
                    function04 = function03;
                }
            }
            c13zcLJIIJ.LJJJJLI();
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = AFwS266S0000000_25.get$arr$(444);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1676540tjI c1676540tjILJIILJJIL = C1676510tjF.LJIILJJIL((Function1) objLJJ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = AFwS266S0000000_25.get$arr$(445);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            str6 = str6;
            C1676630tjR.LJI(z, null, c1676540tjILJIILJJIL, C1676510tjF.LJIIZILJ((Function1) objLJJ2), null, C13Z4.LIZJ(856370644, new C1671770tbb(z3, function06, c1668880tWw2, function05, str6, str5, function04, str4, function2), c13zcLJIIJ), c13zcLJIIJ, (i3 & 14) | 200064, 18);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1671810tbf(z, z3, function06, str4, c1668880tWw2, str6, function05, str5, function04, function2, i, i2);
        }
    }
}
