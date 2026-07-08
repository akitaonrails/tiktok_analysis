package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.lynx.serval.svg.SVGRender;
import com.lynx.serval.svg.SVGRenderEngine;

/* JADX INFO: renamed from: X.0kG1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1312430kG1 implements InterfaceC1312380kFw {
    public final /* synthetic */ float LIZ;
    public final /* synthetic */ float LIZIZ;
    public final /* synthetic */ float LIZJ;
    public final /* synthetic */ float LIZLLL;
    public final /* synthetic */ int LJ;
    public final /* synthetic */ int LJFF;
    public final /* synthetic */ int LJI;
    public final /* synthetic */ SVGRender LJII;

    public final void LIZ(Bitmap bitmap) {
        SVGRenderEngine sVGRenderEngine;
        float[] fArrCalculateViewBoxTransform;
        if (bitmap == null) {
            return;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float f = this.LIZ;
        if (f > 0.0f) {
            float f2 = this.LIZIZ;
            if (f2 > 0.0f && width > 0.0f && height > 0.0f && (sVGRenderEngine = this.LJII.mSVGRenderEngineNG) != null && (fArrCalculateViewBoxTransform = sVGRenderEngine.calculateViewBoxTransform(this.LIZJ, this.LIZLLL, f, f2, 0.0f, 0.0f, width, height, this.LJ, this.LJFF, this.LJI)) != null && fArrCalculateViewBoxTransform.length == 6 && this.LJII.mPictureCanvas != null) {
                float[] fArr = {fArrCalculateViewBoxTransform[0], fArrCalculateViewBoxTransform[2], fArrCalculateViewBoxTransform[4], fArrCalculateViewBoxTransform[1], fArrCalculateViewBoxTransform[3], fArrCalculateViewBoxTransform[5], 0.0f, 0.0f, 1.0f};
                Matrix matrix = new Matrix();
                matrix.setValues(fArr);
                this.LJII.mPictureCanvas.concat(matrix);
                this.LJII.mPictureCanvas.drawBitmap(bitmap, 0.0f, 0.0f, new Paint(2));
            }
        }
    }

    public C1312430kG1(SVGRender sVGRender, float f, float f2, float f3, float f4, int i, int i2, int i3) {
        this.LJII = sVGRender;
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = i3;
    }
}
