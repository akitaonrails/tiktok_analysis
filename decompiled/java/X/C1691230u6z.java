package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS185S0400000_30;
import kotlin.jvm.internal.AwS6S0402000_25;

/* JADX INFO: renamed from: X.0u6z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691230u6z {
    public static final void LIZ(Function0<? extends InterfaceC1690480u5m> function0, InterfaceC1685750ty9 interfaceC1685750ty9, C20044113bj c20044113bj, Function2<? super InterfaceC1690470u5l, ? super C1682380tsi, ? extends InterfaceC1690350u5Z> function2, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        C20044113bj c20044113bj2 = c20044113bj;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(2002163445);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c20044113bj2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i3 & 1, z)) {
            if (i8 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i9 != 0) {
                c20044113bj2 = null;
            }
            C20042913bX.LIZ(C13Z4.LIZJ(-1488997347, new AwS185S0400000_30(c20044113bj2, interfaceC1685750ty92, function2, C20028913Yh.LJIIIIZZ(function0, c13zcLJIIJ), 0), c13zcLJIIJ), c13zcLJIIJ, 6);
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS6S0402000_25((Function0) function0, (Function0<? extends InterfaceC1690480u5m>) interfaceC1685750ty92, (InterfaceC1685750ty9) c20044113bj2, (C20044113bj) function2, (Function2<? super InterfaceC1690470u5l, ? super C1682380tsi, ? extends InterfaceC1690350u5Z>) i, i2, 0);
        }
    }
}
