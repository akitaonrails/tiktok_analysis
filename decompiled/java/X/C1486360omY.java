package X;

import android.graphics.Rect;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0omY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1486360omY {
    public static final Rect LIZ = new Rect(7, 50, 284, 105);
    public static final Rect LIZIZ = new Rect(0, 0, 292, 117);

    public static float LIZ(Pair pair) {
        Pair<Integer, Integer> pair2 = C15BC.LIZLLL;
        return Math.min((76.0f / pair2.getFirst().floatValue()) * ((Number) pair.getFirst()).floatValue(), (76.0f / pair2.getSecond().floatValue()) * ((Number) pair.getSecond()).floatValue());
    }

    public static Rect LIZIZ(Rect rect, Pair pair) {
        float f = rect.left * 1.0f;
        Pair<Integer, Integer> pair2 = C15BC.LIZLLL;
        return new Rect((int) ((f / pair2.getFirst().floatValue()) * ((Number) pair.getFirst()).floatValue()), (int) (((rect.top * 1.0f) / pair2.getSecond().floatValue()) * ((Number) pair.getSecond()).floatValue()), (int) (((rect.right * 1.0f) / pair2.getFirst().floatValue()) * ((Number) pair.getFirst()).floatValue()), (int) (((rect.bottom * 1.0f) / pair2.getSecond().floatValue()) * ((Number) pair.getSecond()).floatValue()));
    }

    public static Rect LIZJ(Pair pair, boolean z) {
        Rect rect;
        Pair<Integer, Integer> pair2 = C15BC.LIZLLL;
        float fMin = Math.min((132.0f / pair2.getFirst().floatValue()) * ((Number) pair.getFirst()).floatValue(), (132.0f / pair2.getSecond().floatValue()) * ((Number) pair.getSecond()).floatValue());
        if (z) {
            rect = LIZ;
        } else {
            rect = LIZIZ;
        }
        Rect rectLIZIZ = LIZIZ(rect, pair);
        float f = fMin / 2.0f;
        float fFloatValue = (((Number) pair.getFirst()).floatValue() / 2.0f) - f;
        float fHeight = (rectLIZIZ.top + (rectLIZIZ.height() / 2.0f)) - f;
        return new Rect((int) fFloatValue, (int) fHeight, (int) (fFloatValue + fMin), (int) (fHeight + fMin));
    }

    public static Rect LIZLLL(Pair pair, boolean z, boolean z2) {
        float fLIZ;
        Rect rect;
        if (z) {
            fLIZ = LIZ(pair);
        } else {
            fLIZ = LIZ(pair) * 0.83f;
        }
        if (z2) {
            rect = LIZ;
        } else {
            rect = LIZIZ;
        }
        Rect rectLIZIZ = LIZIZ(rect, pair);
        float fFloatValue = (((Number) pair.getFirst()).floatValue() - fLIZ) / 2.0f;
        float fHeight = rectLIZIZ.top + ((rectLIZIZ.height() - fLIZ) / 2.0f);
        return new Rect((int) fFloatValue, (int) fHeight, (int) (fFloatValue + fLIZ), (int) (fHeight + fLIZ));
    }

    public static Rect LJ(boolean z, boolean z2, Pair pair, int i) {
        float fLIZ;
        float fFloatValue;
        float fFloatValue2;
        float fLIZ2;
        float fFloatValue3;
        float fFloatValue4;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                if (z) {
                    fLIZ2 = LIZ(pair);
                } else {
                    fLIZ2 = LIZ(pair) * 0.83f;
                }
                Rect rectLIZLLL = LIZLLL(pair, z, z2);
                Pair<Integer, Integer> pair2 = C15BC.LIZLLL;
                float fFloatValue5 = rectLIZLLL.right + ((10.0f / pair2.getFirst().floatValue()) * ((Number) pair.getFirst()).floatValue());
                float f = rectLIZLLL.top;
                if (z) {
                    fFloatValue3 = 5.0f / pair2.getSecond().floatValue();
                    fFloatValue4 = ((Number) pair.getSecond()).floatValue();
                } else {
                    fFloatValue3 = 8.0f / pair2.getSecond().floatValue();
                    fFloatValue4 = ((Number) pair.getSecond()).floatValue();
                }
                float f2 = f + (fFloatValue3 * fFloatValue4);
                return new Rect((int) fFloatValue5, (int) f2, (int) (fFloatValue5 + fLIZ2), (int) (f2 + fLIZ2));
            }
            if (z) {
                fLIZ = LIZ(pair);
            } else {
                fLIZ = LIZ(pair) * 0.83f;
            }
            Rect rectLIZLLL2 = LIZLLL(pair, z, z2);
            Pair<Integer, Integer> pair3 = C15BC.LIZLLL;
            float fFloatValue6 = (rectLIZLLL2.left - ((10.0f / pair3.getFirst().floatValue()) * ((Number) pair.getFirst()).floatValue())) - fLIZ;
            float f3 = rectLIZLLL2.top;
            if (z) {
                fFloatValue = 5.0f / pair3.getSecond().floatValue();
                fFloatValue2 = ((Number) pair.getSecond()).floatValue();
            } else {
                fFloatValue = 8.0f / pair3.getSecond().floatValue();
                fFloatValue2 = ((Number) pair.getSecond()).floatValue();
            }
            float f4 = f3 + (fFloatValue * fFloatValue2);
            return new Rect((int) fFloatValue6, (int) f4, (int) (fFloatValue6 + fLIZ), (int) (f4 + fLIZ));
        }
        return LIZLLL(pair, z, z2);
    }
}
