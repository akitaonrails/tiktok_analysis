package X;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: X.19dM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21583019dM extends Animation {
    public final float LL;
    public final float LLILLJJLI;
    public final float LLILLL;
    public final float LLILZ;
    public final float LLILZIL = 0.0f;
    public final boolean LLILZLL = false;
    public Camera LLIZ;

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        float f2 = this.LL;
        float f3 = f2 + ((this.LLILLJJLI - f2) * f);
        float f4 = this.LLILLL;
        float f5 = this.LLILZ;
        Camera camera = this.LLIZ;
        Matrix matrix = transformation.getMatrix();
        if (camera != null) {
            camera.save();
        }
        if (this.LLILZLL) {
            if (camera != null) {
                camera.translate(0.0f, 0.0f, this.LLILZIL * f);
                camera.rotateX(f3);
                camera.getMatrix(matrix);
                camera.restore();
            }
        } else if (camera != null) {
            camera.translate(0.0f, 0.0f, this.LLILZIL * (1.0f - f));
            camera.rotateX(f3);
            camera.getMatrix(matrix);
            camera.restore();
        }
        matrix.preTranslate(-f4, -f5);
        matrix.postTranslate(f4, f5);
    }

    public C21583019dM(float f, float f2, float f3, float f4) {
        this.LL = f;
        this.LLILLJJLI = f2;
        this.LLILLL = f3;
        this.LLILZ = f4;
    }

    @Override // android.view.animation.Animation
    public final void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.LLIZ = new Camera();
    }
}
