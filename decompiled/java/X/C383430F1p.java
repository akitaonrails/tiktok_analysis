package X;

import android.graphics.Color;
import com.ss.ugc.android.editor.core.model.StrokeParams;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0F1p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383430F1p {
    public static final boolean LIZ(C380780EwO c380780EwO) {
        if (c380780EwO == null || c380780EwO.LIZLLL.length() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [float[]] */
    /* JADX WARN: Type inference failed for: r12v1, types: [float[]] */
    /* JADX WARN: Type inference failed for: r12v2, types: [float[]] */
    /* JADX WARN: Type inference failed for: r12v3, types: [float[]] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r13v4, types: [float[]] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r16v4, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v2, types: [float[]] */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r17v5, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r17v6, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r17v7, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r17v8, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r18v5, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r19v5, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.Float] */
    public static final StrokeParams LIZIZ(C380780EwO c380780EwO) {
        ?? r17 = 0;
        StrokeParams strokeParams = new StrokeParams(null, null, null, null, null, null, null);
        for (C0F26 c0f26 : c380780EwO.LJIIJ) {
            r17 = r17;
            if (c0f26 instanceof C383480F1u) {
                int i = ((C383480F1u) c0f26).LIZIZ;
                r17 = 0;
                strokeParams = StrokeParams.LIZ(strokeParams, new float[]{Color.red(i) / 255.0f, Color.green(i) / 255.0f, Color.blue(i) / 255.0f, Color.alpha(i) / 255.0f}, null, null, null, null, null, null, 126);
            }
            if ((c0f26 instanceof C383450F1r) && c0f26 != null) {
                C383450F1r c383450F1r = (C383450F1r) c0f26;
                switch (C383520F1y.LIZ[c383450F1r.LIZ.ordinal()]) {
                    case 1:
                        ?? r12 = r17;
                        ?? r14 = r17;
                        ?? r15 = r17;
                        ?? r16 = r17;
                        r17 = r17;
                        strokeParams = StrokeParams.LIZ(strokeParams, r12, Float.valueOf(c383450F1r.LIZIZ), r14, r15, r16, r17, r17, 125);
                        break;
                    case 2:
                        ?? r122 = r17;
                        ?? r13 = r17;
                        ?? r152 = r17;
                        ?? r162 = r17;
                        r17 = r17;
                        strokeParams = StrokeParams.LIZ(strokeParams, r122, r13, Float.valueOf(c383450F1r.LIZIZ), r152, r162, r17, r17, 123);
                        break;
                    case 3:
                        ?? r123 = r17;
                        ?? r132 = r17;
                        ?? r142 = r17;
                        ?? r163 = r17;
                        r17 = r17;
                        strokeParams = StrokeParams.LIZ(strokeParams, r123, r132, r142, Float.valueOf(c383450F1r.LIZIZ), r163, r17, r17, 119);
                        break;
                    case 4:
                        ?? r124 = r17;
                        ?? r133 = r17;
                        ?? r143 = r17;
                        ?? r153 = r17;
                        r17 = r17;
                        strokeParams = StrokeParams.LIZ(strokeParams, r124, r133, r143, r153, Float.valueOf(c383450F1r.LIZIZ), r17, r17, 111);
                        break;
                    case 5:
                        ?? r134 = r17;
                        ?? r144 = r17;
                        ?? r154 = r17;
                        ?? r164 = r17;
                        r17 = r17;
                        strokeParams = StrokeParams.LIZ(strokeParams, r134, r144, r154, r164, r17, Float.valueOf(c383450F1r.LIZIZ), r17, 95);
                        break;
                    case 6:
                        strokeParams = StrokeParams.LIZ(strokeParams, r17, r17, r17, r17, r17, r17, Float.valueOf(c383450F1r.LIZIZ), 63);
                        break;
                }
            }
        }
        return strokeParams;
    }

    public static final C380780EwO LIZJ(C380780EwO c380780EwO, StrokeParams strokeParams) {
        float[] fArr;
        if (strokeParams == null) {
            return c380780EwO;
        }
        ArrayList arrayList = new ArrayList();
        for (C0F26 c0f26 : c380780EwO.LJIIJ) {
            if ((c0f26 instanceof C383480F1u) && (fArr = strokeParams.color) != null) {
                float f = 255;
                arrayList.add(new C383480F1u(((C383480F1u) c0f26).LIZ, Color.argb((int) (fArr[3] * f), (int) (fArr[0] * f), (int) (fArr[1] * f), (int) (fArr[2] * f))));
            }
            if ((c0f26 instanceof C383450F1r) && c0f26 != null) {
                C383450F1r c383450F1r = (C383450F1r) c0f26;
                switch (C383520F1y.LIZ[c383450F1r.LIZ.ordinal()]) {
                    case 1:
                        Float f2 = strokeParams.size;
                        if (f2 != null) {
                            arrayList.add(C383450F1r.LIZIZ(c383450F1r, f2.floatValue()));
                        }
                        break;
                    case 2:
                        Float f3 = strokeParams.distance;
                        if (f3 != null) {
                            arrayList.add(C383450F1r.LIZIZ(c383450F1r, f3.floatValue()));
                        }
                        break;
                    case 3:
                        Float f4 = strokeParams.alpha;
                        if (f4 != null) {
                            arrayList.add(C383450F1r.LIZIZ(c383450F1r, f4.floatValue()));
                        }
                        break;
                    case 4:
                        Float f5 = strokeParams.horizontalShift;
                        if (f5 != null) {
                            arrayList.add(C383450F1r.LIZIZ(c383450F1r, f5.floatValue()));
                        }
                        break;
                    case 5:
                        Float f6 = strokeParams.verticalShift;
                        if (f6 != null) {
                            arrayList.add(C383450F1r.LIZIZ(c383450F1r, f6.floatValue()));
                        }
                        break;
                    case 6:
                        Float f7 = strokeParams.texture;
                        if (f7 != null) {
                            arrayList.add(C383450F1r.LIZIZ(c383450F1r, f7.floatValue()));
                        }
                        break;
                }
            }
        }
        return C380780EwO.LIZ(c380780EwO, null, false, null, null, 0, arrayList, 1023);
    }
}
