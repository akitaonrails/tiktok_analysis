package X;

import Y.AObjectS38S0100100_25;
import Y.AObjectS75S0000000_25;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tZl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670630tZl {
    public static final C13DR LIZ = new C13DR(new AObjectS75S0000000_25(10));

    public static final void LIZ(final Function0<Unit> function0, final C1686740tzk c1686740tzk, final float f, final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-2115323654);
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
            if (c13zcLJIIJ.LJIJ(f)) {
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
            long jLIZJ = C1685910tyP.LIZJ(f, C1685910tyP.LIZIZ);
            if (((Boolean) c13zcLJIIJ.LJJIL(C1674190tfV.LIZ)).booleanValue()) {
                c13zcLJIIJ.LJJIIJZLJL(-1846534895);
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ == C1680510tph.LIZIZ) {
                    objLJJ = new InterfaceC1668320tW2() { // from class: X.0tZn
                        @Override // X.InterfaceC1668320tW2
                        public final void LIZ(float f2) {
                        }

                        @Override // X.InterfaceC1668320tW2
                        public final void LIZIZ() {
                        }
                    };
                    c13zcLJIIJ.LJJIJIIJI(objLJJ);
                }
                c13zcLJIIJ.LJJJJL(false);
                C13ZT.LIZ(LIZ.LIZJ(objLJJ), C13Z4.LIZJ(1993086911, new AObjectS38S0100100_25(jLIZJ, function2, 0), c13zcLJIIJ), c13zcLJIIJ, 56);
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(-1846104584);
                C1670670tZp.LIZ(function0, c1686740tzk, jLIZJ, function2, c13zcLJIIJ, (i2 & 14) | (i2 & 112) | (i2 & 7168));
                c13zcLJIIJ.LJJJJL(false);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0tZm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Function0 function02 = function0;
                    C1686740tzk c1686740tzk2 = c1686740tzk;
                    float f2 = f;
                    Function2 function22 = function2;
                    int i7 = i;
                    ((Integer) obj2).intValue();
                    C1670630tZl.LIZ(function02, c1686740tzk2, f2, function22, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i7 | 1));
                    return Unit.LIZ;
                }
            };
        }
    }
}
