package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.tako.debug.ITakoDebugService;
import com.ss.android.ugc.aweme.tako.experiment.TakoAIVideoAnimationConfig;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS22S0202000_25;
import kotlin.jvm.internal.AwS391S0200000_25;

/* JADX INFO: renamed from: X.0uG7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696890uG7 {
    public static final int[] LIZ = {-12045709, -10991977, -11771454, -16749877, -16753244, -16758404, -16759950};
    public static final float[] LIZIZ;
    public static final float LIZJ;
    public static final float LIZLLL;
    public static final List<C1696920uGA> LJ;

    static {
        float[] fArr = new float[7];
        int i = 0;
        do {
            fArr[i] = i * 0.16666667f;
            i++;
        } while (i < 7);
        LIZIZ = fArr;
        double d = 0.067319855f;
        LIZJ = (float) Math.sin(d);
        LIZLLL = (float) Math.cos(d);
        LJ = C1697810uHb.LJIIJJI(new C1696920uGA(-12045709, 0.88f, 0.42f, 2.2f, 0.0f, 0.16666667f), new C1696920uGA(-16414977, 0.76f, 0.62f, 2.8f, 2.2f, 0.5f), new C1696920uGA(-16683383, 0.68f, 0.52f, 3.25f, 4.4f, 0.8333333f));
    }

    public static final int LIZLLL(float f, int i) {
        return (((int) (C13LZ.LIZLLL(f, 0.0f, 1.0f) * 255.0f)) << 24) | (i & 16777215);
    }

    public static final void LIZ(C05P1<Float> c05p1, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(787756412);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c05p1)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i6 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ == C1680510tph.LIZIZ) {
                ITakoDebugService iTakoDebugService = (ITakoDebugService) PluggableExtentionKt.pluggableSpi$default(ITakoDebugService.class, false, false, false, 14, null);
                if (iTakoDebugService != null) {
                    iTakoDebugService.LJIIIIZZ();
                }
                C1895107bZ.LIZ.getClass();
                TakoAIVideoAnimationConfig takoAIVideoAnimationConfig = (TakoAIVideoAnimationConfig) C1895107bZ.LIZJ.getValue();
                objLJJ = new TakoAIVideoAnimationConfig(takoAIVideoAnimationConfig.animationDrawInterval, takoAIVideoAnimationConfig.enableOptimizedWaveEffect, takoAIVideoAnimationConfig.animationBlurSize);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            TakoAIVideoAnimationConfig takoAIVideoAnimationConfig2 = (TakoAIVideoAnimationConfig) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            if (takoAIVideoAnimationConfig2.enableOptimizedWaveEffect) {
                c13zcLJIIJ.LJJIIJZLJL(350656780);
                interfaceC1685750ty92 = interfaceC1685750ty92;
                c13zcLJIIJ = c13zcLJIIJ;
                LIZJ(c05p1, takoAIVideoAnimationConfig2.animationDrawInterval, interfaceC1685750ty92, c13zcLJIIJ, (i3 & 14) | 48 | ((i3 << 3) & 896), 0);
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(350880972);
                LIZIZ(c05p1, takoAIVideoAnimationConfig2.animationDrawInterval, takoAIVideoAnimationConfig2.animationBlurSize, interfaceC1685750ty92, c13zcLJIIJ, (i3 & 14) | 432 | ((i3 << 6) & 7168), 0);
                c13zcLJIIJ.LJJJJL(false);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS22S0202000_25((C05P1) c05p1, (C05P1<Float>) interfaceC1685750ty92, (InterfaceC1685750ty9) i, i2, 4);
        }
    }

    public static final void LIZJ(C05P1<Float> c05p1, int i, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-367007152);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c05p1)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        if ((i4 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i8 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new C1696970uGF();
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C1696970uGF c1696970uGF = (C1696970uGF) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C1696980uGG.LIZ(0L);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            InterfaceC1675750ti1 interfaceC1675750ti1 = (InterfaceC1675750ti1) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            boolean z2 = true;
            if ((i4 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            if ((i4 & 14) != 4) {
                z2 = false;
            }
            boolean zLJII = z | z2 | c13zcLJIIJ.LJII(c1696970uGF);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (zLJII || objLJJ3 == c1680520tpi) {
                objLJJ3 = new C1696900uG8(i, c05p1, c1696970uGF, interfaceC1675750ti1, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(c05p1, (Function2) objLJJ3, c13zcLJIIJ);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1667200tUE.LIZIZ(interfaceC1685750ty92);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJII2 = c13zcLJIIJ.LJII(c1696970uGF);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (zLJII2 || objLJJ4 == c1680520tpi) {
                objLJJ4 = new AwS391S0200000_25(interfaceC1675750ti1, c1696970uGF, 185);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1665790tRx.LIZ(C1680910tqL.LIZIZ(interfaceC1685750ty9LIZIZ, (Function1) objLJJ4), c13zcLJIIJ);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1696940uGC(c05p1, i, interfaceC1685750ty92, i2, i3);
        }
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public static final void LIZIZ(C05P1<Float> c05p1, int i, int i2, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1338400533);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c05p1)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i5 = i6 | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i5 |= i7;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            if (c13zcLJIIJ.LJIJI(i2)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i5 |= i8;
        }
        int i10 = i4 & 8;
        if (i10 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i9 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i9 = 1024;
            }
            i5 |= i9;
        }
        if ((i5 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i10 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new C1696970uGF();
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C1696970uGF c1696970uGF = (C1696970uGF) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C1696980uGG.LIZ(0L);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            InterfaceC1675750ti1 interfaceC1675750ti1 = (InterfaceC1675750ti1) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            boolean z2 = true;
            if ((i5 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            if ((i5 & 14) != 4) {
                z2 = false;
            }
            boolean zLJII = z | z2 | c13zcLJIIJ.LJII(c1696970uGF);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (zLJII || objLJJ3 == c1680520tpi) {
                objLJJ3 = new C1696910uG9(i, c05p1, c1696970uGF, interfaceC1675750ti1, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(c05p1, (Function2) objLJJ3, c13zcLJIIJ);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = C1671680tbS.LIZIZ(interfaceC1685750ty92, i2);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJII2 = c13zcLJIIJ.LJII(c1696970uGF);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (zLJII2 || objLJJ4 == c1680520tpi) {
                objLJJ4 = new AwS391S0200000_25(interfaceC1675750ti1, c1696970uGF, 184);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1665790tRx.LIZ(C1680910tqL.LIZIZ(interfaceC1685750ty9LIZIZ, (Function1) objLJJ4), c13zcLJIIJ);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1696930uGB(c05p1, i, i2, interfaceC1685750ty92, i3, i4);
        }
    }

    public static final void LJ(Canvas canvas, Path path, Paint paint, C1696950uGD c1696950uGD, float f, float f2, long j) {
        boolean z;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat > 0.0f && fIntBitsToFloat2 > 0.0f) {
            float f3 = fIntBitsToFloat / 390.0f;
            float f4 = 40.0f * f3;
            float f5 = 132.0f * f3;
            float f6 = 69.0f * f3;
            float fLIZLLL = C13LZ.LIZLLL(f, 0.0f, 1.0f);
            float f7 = (0.39999998f * fLIZLLL) + 1.0f;
            float f8 = ((0.20000005f * fLIZLLL) + 1.0f) * 0.28f;
            float f9 = (0.79999995f * fLIZLLL) + 1.0f;
            if (fLIZLLL > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            float fMin = Math.min(1.0f, 1.08f);
            float fMin2 = 0.6f;
            if (z) {
                fMin2 = Math.min(fMin, Math.max(0.6f, f9 * 0.6f));
            }
            float f10 = 2.22f * f2;
            float fSin = (((float) Math.sin(0.58f * f10)) * 0.08f) + 0.92f;
            float fMax = Math.max(0.18f, f8 * 2.7f);
            float fLIZLLL2 = C13LZ.LIZLLL(0.88235295f, 0.0f, 1.8f);
            if (fLIZLLL2 <= 0.0f) {
                return;
            }
            int i = 25;
            int i2 = 25;
            do {
                float f11 = i2;
                float f12 = f11 / i;
                float fMin3 = (((1.0f - f12) * 0.13f) + 0.032f) * Math.min(1.35f, fLIZLLL2);
                float f13 = (0.56f * f12 * fLIZLLL2) + 1.0f;
                float f14 = (18.0f - (((f12 * 1.72f) + 0.04f) * 30.0f)) * f3;
                float f15 = (f11 * 0.055f) + f10;
                path.reset();
                paint.setAlpha((int) (C13LZ.LIZLLL(Math.min(0.7733333f * fMin2 * fSin, fMin) * fMin3, 0.0f, 1.0f) * 255.0f));
                float[] fArr = c1696950uGD.LIZ;
                float[] fArr2 = c1696950uGD.LIZIZ;
                float[] fArr3 = c1696950uGD.LIZJ;
                double d = 6.2831855f * fMax * 0.017857144f;
                float fSin2 = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                double d2 = f15;
                float fSin3 = (float) Math.sin(d2);
                float fCos2 = (float) Math.cos(d2);
                double d3 = 7.539823f * fMax * 0.017857144f;
                float fSin4 = (float) Math.sin(d3);
                float fCos3 = (float) Math.cos(d3);
                double d4 = f15 * 0.74f;
                float fSin5 = (float) Math.sin(d4);
                float fCos4 = (float) Math.cos(d4);
                double d5 = f15 * 1.2f;
                float fSin6 = (float) Math.sin(d5);
                float fCos5 = (float) Math.cos(d5);
                int i3 = 0;
                do {
                    fArr3[i3] = C13LZ.LIZLLL(((fIntBitsToFloat2 - f4) - ((((((0.71f * f5) * 0.4f) * f7) * f13) * C13LZ.LIZLLL(((((0.42f * fSin3) + (0.22f * fCos4)) + (0.12f * fSin6)) * 0.32f) + 0.74f, 0.28f, 1.08f)) * fArr[i3])) + f6 + f14, 0.0f, fIntBitsToFloat2);
                    float f16 = (fSin3 * fCos) + (fCos2 * fSin2);
                    fCos2 = (fCos2 * fCos) - (fSin3 * fSin2);
                    float f18 = (fSin5 * fCos3) + (fCos4 * fSin4);
                    fCos4 = (fCos4 * fCos3) - (fSin5 * fSin4);
                    float f19 = LIZLLL;
                    float f20 = LIZJ;
                    float f21 = (fSin6 * f19) + (fCos5 * f20);
                    fCos5 = (f19 * fCos5) - (fSin6 * f20);
                    i3++;
                    fSin5 = f18;
                    fSin6 = f21;
                    fSin3 = f16;
                } while (i3 < 57);
                path.moveTo(0.0f, fIntBitsToFloat2);
                path.lineTo(fArr2[0], fArr3[0]);
                int i4 = 1;
                do {
                    int i5 = i4 - 1;
                    float f22 = fArr2[i5];
                    float f23 = fArr3[i5];
                    path.quadTo(f22, f23, (fArr2[i4] + f22) / 2.0f, (fArr3[i4] + f23) / 2.0f);
                    i4++;
                } while (i4 < 57);
                path.lineTo(fArr2[56], fArr3[56]);
                path.lineTo(fIntBitsToFloat, fIntBitsToFloat2);
                path.close();
                canvas.drawPath(path, paint);
                i2--;
                i = 25;
            } while (i2 > 0);
        }
    }
}
