package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: X.0kSr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1320390kSr extends AbstractC1320320kSk {
    public static final C1320390kSr LJIILIIL = new C1320390kSr();

    public final String toString() {
        return "center_inside";
    }

    @Override // X.AbstractC1320320kSk
    public final void LIZIZ(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float fMin = Math.min(Math.min(f3, f4), 1.0f);
        float fWidth = rect.left + ((rect.width() - (i * fMin)) * 0.5f);
        float fHeight = rect.top + ((rect.height() - (i2 * fMin)) * 0.5f);
        matrix.setScale(fMin, fMin);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
    }
}
