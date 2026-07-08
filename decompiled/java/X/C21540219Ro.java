package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: renamed from: X.19Ro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21540219Ro extends AbstractC21539319Rf {
    public final C21540519Rr LIZIZ;

    public C21540219Ro(C21540519Rr c21540519Rr) {
        this.LIZIZ = c21540519Rr;
    }

    @Override // X.AbstractC21539319Rf
    public final void LIZ(Matrix matrix, C21540419Rq c21540419Rq, int i, Canvas canvas) {
        boolean z;
        C21540519Rr c21540519Rr = this.LIZIZ;
        float f = c21540519Rr.LJFF;
        float f2 = c21540519Rr.LJI;
        C21540519Rr c21540519Rr2 = this.LIZIZ;
        RectF rectF = new RectF(c21540519Rr2.LIZIZ, c21540519Rr2.LIZJ, c21540519Rr2.LIZLLL, c21540519Rr2.LJ);
        c21540419Rq.getClass();
        if (f2 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        Path path = c21540419Rq.LJI;
        int[] iArr = C21540419Rq.LJIIJ;
        if (z) {
            iArr[0] = 0;
            iArr[1] = c21540419Rq.LJFF;
            iArr[2] = c21540419Rq.LJ;
            iArr[3] = c21540419Rq.LIZLLL;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = c21540419Rq.LIZLLL;
            iArr[2] = c21540419Rq.LJ;
            iArr[3] = c21540419Rq.LJFF;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth > 0.0f) {
            float f4 = 1.0f - (i / fWidth);
            float[] fArr = C21540419Rq.LJIIJJI;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            c21540419Rq.LIZIZ.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, c21540419Rq.LJII);
            }
            canvas.drawArc(rectF, f, f2, true, c21540419Rq.LIZIZ);
            canvas.restore();
        }
    }
}
