package X;

import Y.AObjectS38S0100100_25;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tZp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670670tZp {
    public static final void LIZ(final Function0<Unit> function0, final C1686740tzk c1686740tzk, final long j, final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-584903721);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1686740tzk)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIJJ(j)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i3 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1680660tpw.LIZ(function0, c1686740tzk, C13Z4.LIZJ(-992174994, new AObjectS38S0100100_25(j, function2, 1), c13zcLJIIJ), c13zcLJIIJ, (i2 & 14) | 384 | (i2 & 112), 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0tZo
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Function0 function02 = function0;
                    C1686740tzk c1686740tzk2 = c1686740tzk;
                    long j2 = j;
                    Function2 function22 = function2;
                    int i7 = i;
                    ((Integer) obj2).intValue();
                    C1670670tZp.LIZ(function02, c1686740tzk2, j2, function22, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i7 | 1));
                    return Unit.LIZ;
                }
            };
        }
    }
}
