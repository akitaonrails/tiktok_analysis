package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: X.0kSl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1320330kSl extends AbstractC1320320kSk {
    public static final C1320330kSl LJIILIIL = new C1320330kSl();

    public final String toString() {
        return "fit_xy";
    }

    @Override // X.AbstractC1320320kSk
    public final void LIZIZ(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float f5 = rect.left;
        float f6 = rect.top;
        matrix.setScale(f3, f4);
        matrix.postTranslate((int) (f5 + 0.5f), (int) (f6 + 0.5f));
    }
}
