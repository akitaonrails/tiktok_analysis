package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: X.0kSv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1320430kSv extends AbstractC1320320kSk {
    public static final C1320430kSv LJIILIIL = new C1320430kSv();

    @Override // X.AbstractC1320320kSk
    public final void LIZIZ(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        int i3;
        int i4 = 0;
        if (rect != null) {
            i3 = rect.left;
            i4 = rect.top;
        } else {
            i3 = 0;
        }
        if (matrix != null) {
            matrix.setScale(f3, f3);
            matrix.postTranslate(i3, i4);
        }
    }
}
