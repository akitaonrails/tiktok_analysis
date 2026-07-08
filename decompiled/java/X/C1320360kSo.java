package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: X.0kSo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1320360kSo extends AbstractC1320320kSk {
    public static final C1320360kSo LJIILIIL = new C1320360kSo();

    public final String toString() {
        return "focus_crop";
    }

    @Override // X.AbstractC1320320kSk
    public final void LIZIZ(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float fMax;
        float fMax2;
        if (f4 > f3) {
            float f5 = i * f4;
            fMax = rect.left + Math.max(Math.min((rect.width() * 0.5f) - (f * f5), 0.0f), rect.width() - f5);
            fMax2 = rect.top;
            f3 = f4;
        } else {
            fMax = rect.left;
            float f6 = i2 * f3;
            fMax2 = Math.max(Math.min((rect.height() * 0.5f) - (f2 * f6), 0.0f), rect.height() - f6) + rect.top;
        }
        matrix.setScale(f3, f3);
        matrix.postTranslate((int) (fMax + 0.5f), (int) (fMax2 + 0.5f));
    }
}
