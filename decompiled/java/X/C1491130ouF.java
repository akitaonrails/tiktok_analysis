package X;

import android.graphics.Rect;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ouF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1491130ouF {
    public static Rect LIZ(int i, int i2, Pair pair) {
        float f;
        float f2;
        float f3 = C1491140ouG.LIZIZ * 1.0f;
        Pair<Integer, Integer> pair2 = C15BC.LIZLLL;
        float fMin = Math.min((f3 / pair2.getFirst().floatValue()) * ((Number) pair.getFirst()).floatValue(), (f3 / pair2.getSecond().floatValue()) * ((Number) pair.getSecond()).floatValue());
        float f4 = C1491140ouG.LIZLLL * 1.0f;
        float fMin2 = Math.min((f4 / pair2.getFirst().floatValue()) * ((Number) pair.getFirst()).floatValue(), (f4 / pair2.getSecond().floatValue()) * ((Number) pair.getSecond()).floatValue());
        Rect rect = C1491140ouG.LIZ;
        Rect rect2 = new Rect((int) (((rect.left * 1.0f) / pair2.getFirst().floatValue()) * ((Number) pair.getFirst()).floatValue()), (int) (((rect.top * 1.0f) / pair2.getSecond().floatValue()) * ((Number) pair.getSecond()).floatValue()), (int) (((rect.right * 1.0f) / pair2.getFirst().floatValue()) * ((Number) pair.getFirst()).floatValue()), (int) (((rect.bottom * 1.0f) / pair2.getSecond().floatValue()) * ((Number) pair.getSecond()).floatValue()));
        float fFloatValue = ((C1491140ouG.LIZJ * 1.0f) / pair2.getFirst().floatValue()) * ((Number) pair.getFirst()).floatValue();
        float fFloatValue2 = ((C1491140ouG.LJ * 1.0f) / pair2.getFirst().floatValue()) * ((Number) pair.getFirst()).floatValue();
        if (i == 1) {
            f = fMin;
        } else {
            f = fMin + fFloatValue + (((i - 1) - 1) * fFloatValue2) + fMin2;
        }
        float f5 = 2;
        float fWidth = (rect2.width() - f) / f5;
        if (i2 == 0) {
            f2 = 0.0f;
        } else {
            if (i2 == 1) {
                f2 = fMin + fFloatValue;
            } else {
                if (i2 != 1) {
                    fMin = fFloatValue + fMin + (((i2 - 1) - 1) * fFloatValue2) + fMin2;
                }
                f2 = fMin - (fMin2 - fFloatValue2);
            }
            fMin = fMin2;
        }
        float fHeight = rect2.top + ((rect2.height() - fMin) / f5);
        float f6 = rect2.left + fWidth + f2;
        return new Rect((int) f6, (int) fHeight, (int) (f6 + fMin), (int) (fHeight + fMin));
    }
}
