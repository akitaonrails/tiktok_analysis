package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: X.0kSp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1320370kSp extends AbstractC1320320kSk {
    public static final C1320370kSp LJIILIIL = new C1320370kSp();

    public final String toString() {
        return "fit_bottom_start";
    }

    @Override // X.AbstractC1320320kSk
    public final void LIZIZ(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float fMin = Math.min(f3, f4);
        float f5 = rect.left;
        float fHeight = rect.top + (rect.height() - (i2 * fMin));
        matrix.setScale(fMin, fMin);
        matrix.postTranslate((int) (f5 + 0.5f), (int) (fHeight + 0.5f));
    }
}
