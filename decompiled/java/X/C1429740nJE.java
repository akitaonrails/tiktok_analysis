package X;

import android.graphics.Matrix;
import android.view.TextureView;

/* JADX INFO: renamed from: X.0nJE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429740nJE {
    public static final void LIZ(float f, TextureView textureView) {
        float f2;
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (f != 0.0f && 0 == 0 && width > 0.0f && height > 0.0f) {
            float f3 = height / width;
            if (f3 != f) {
                float f4 = 1.0f;
                if (f3 < f) {
                    f2 = f / f3;
                } else {
                    f2 = 1.0f;
                }
                if (f3 > f) {
                    f4 = f3 / f;
                }
                float f5 = 2;
                float f6 = width / f5;
                float f7 = height / f5;
                Matrix matrix = new Matrix();
                matrix.setScale(f4, f2, f6, f7);
                textureView.setTransform(matrix);
            }
        }
    }
}
