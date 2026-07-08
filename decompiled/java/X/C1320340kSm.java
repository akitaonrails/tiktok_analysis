package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: X.0kSm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1320340kSm extends AbstractC1320320kSk {
    public static final C1320340kSm LJIILIIL = new C1320340kSm();

    public final String toString() {
        return "center_crop";
    }

    @Override // X.AbstractC1320320kSk
    public final void LIZIZ(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float fWidth;
        float fHeight;
        if (f4 > f3) {
            fWidth = rect.left + ((rect.width() - (i * f4)) * 0.5f);
            fHeight = rect.top;
            f3 = f4;
        } else {
            fWidth = rect.left;
            fHeight = ((rect.height() - (i2 * f3)) * 0.5f) + rect.top;
        }
        matrix.setScale(f3, f3);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
    }
}
