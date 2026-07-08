package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.19m2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21636819m2 extends View {
    public C1664690tQB<C21637119m5> LL;
    public LifecycleOwner LLILLJJLI;
    public final Paint LLILLL;
    public final Paint LLILZ;
    public final DashPathEffect LLILZIL;

    public C21636819m2(Context context) {
        super(context, null, 0);
        this.LLILLL = new Paint();
        this.LLILZ = new Paint();
        this.LLILZIL = new DashPathEffect(new float[]{C418440Gaw.LIZIZ(Float.valueOf(2.0f)), C418440Gaw.LIZIZ(Float.valueOf(1.0f))}, 0.0f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C21637119m5 c21637119m5;
        super.onDraw(canvas);
        C1664690tQB<C21637119m5> c1664690tQB = this.LL;
        if (c1664690tQB != null && (c21637119m5 = c1664690tQB.LIZ) != null) {
            LIZ(canvas, c21637119m5.LIZ, null);
            LIZ(canvas, c21637119m5.LIZIZ, null);
            LIZ(canvas, c21637119m5.LIZJ, null);
            LIZ(canvas, c21637119m5.LIZLLL, null);
            LIZ(canvas, c21637119m5.LJ, null);
            LIZ(canvas, c21637119m5.LJFF, null);
            LIZ(canvas, c21637119m5.LJI, this.LLILZIL);
            LIZIZ(canvas, c21637119m5.LJII);
            LIZIZ(canvas, c21637119m5.LJIIIIZZ);
        }
    }

    public final void LIZIZ(Canvas canvas, C21636919m3 c21636919m3) {
        if (c21636919m3.LIZ) {
            Paint paint = this.LLILZ;
            float fCenterX = c21636919m3.LIZJ.centerX();
            RectF rectF = c21636919m3.LIZJ;
            paint.setShader(new LinearGradient(fCenterX, rectF.top, rectF.centerX(), c21636919m3.LIZJ.bottom, C13LP.LLII(c21636919m3.LIZLLL), (float[]) null, Shader.TileMode.CLAMP));
            this.LLILZ.setStrokeWidth(0.0f);
            canvas.save();
            canvas.clipRect(c21636919m3.LIZJ);
            RectF rectF2 = c21636919m3.LIZJ;
            float fWidth = rectF2.top - rectF2.width();
            Path path = new Path();
            float f = c21636919m3.LJ * 1.41421f;
            path.moveTo(c21636919m3.LIZJ.left, fWidth);
            RectF rectF3 = c21636919m3.LIZJ;
            path.lineTo(rectF3.right, rectF3.width() + fWidth);
            RectF rectF4 = c21636919m3.LIZJ;
            path.lineTo(rectF4.right, rectF4.width() + fWidth + f);
            path.lineTo(c21636919m3.LIZJ.left, fWidth + f);
            path.close();
            Path path2 = new Path();
            path2.addPath(new Path(path));
            while (fWidth < c21636919m3.LIZJ.bottom) {
                path.offset(0.0f, c21636919m3.LJFF + f);
                path2.addPath(new Path(path));
                fWidth += c21636919m3.LJFF + f;
            }
            canvas.drawPath(path2, this.LLILZ);
            canvas.restore();
        }
    }

    public final void LIZ(Canvas canvas, C21637019m4 c21637019m4, PathEffect pathEffect) {
        if (c21637019m4.LIZ && c21637019m4.LIZLLL.size() >= 2) {
            this.LLILLL.setPathEffect(pathEffect);
            RectF rectF = c21637019m4.LIZJ;
            this.LLILLL.setShader(new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, C13LP.LLII(c21637019m4.LIZLLL), (float[]) null, Shader.TileMode.CLAMP));
            this.LLILLL.setAlpha((int) (c21637019m4.LIZIZ * 255));
            this.LLILLL.setStrokeWidth(c21637019m4.LJ);
            canvas.drawLine(rectF.left, rectF.top, rectF.right, rectF.bottom, this.LLILLL);
        }
    }
}
