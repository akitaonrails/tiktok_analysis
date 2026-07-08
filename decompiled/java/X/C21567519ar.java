package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.19ar, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21567519ar implements InterfaceC21567619as {
    @Override // X.InterfaceC21567619as
    public final Matrix LIZ(Rect rect, RectF rectF) {
        Matrix matrix = new Matrix();
        float fMin = 1.0f / Math.min(rectF.width() / rect.width(), rectF.height() / rect.height());
        matrix.setScale(fMin, fMin, rectF.centerX(), rectF.centerY());
        matrix.postTranslate(rect.centerX() - rectF.centerX(), rect.centerY() - rectF.centerY());
        return matrix;
    }
}
