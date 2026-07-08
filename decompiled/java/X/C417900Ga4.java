package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.0Ga4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417900Ga4 implements InterfaceC417910Ga5 {
    @Override // X.InterfaceC417910Ga5
    public final Matrix LIZ(Rect rect, RectF rectF) {
        Matrix matrix = new Matrix();
        float fWidth = rectF.width() / rect.width();
        float fHeight = rectF.height() / rect.height();
        if (fWidth > fHeight) {
            fWidth = fHeight;
        }
        float f = 1.0f / fWidth;
        matrix.setScale(f, f, rectF.centerX(), rectF.centerY());
        matrix.postTranslate(rect.centerX() - rectF.centerX(), rect.centerY() - rectF.centerY());
        return matrix;
    }
}
