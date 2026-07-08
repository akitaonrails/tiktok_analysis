package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0F7G, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F7G extends Drawable {
    public final Paint LIZ;
    public final Path LIZIZ;
    public final RectF LIZJ;
    public float LIZLLL;
    public float LJ;
    public int[] LJFF;
    public float[] LJI;
    public float LJII;
    public float LJIIIIZZ;
    public Function2<? super Integer, ? super Integer, float[]> LJIIIZ;
    public boolean LJIIJ;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public C0F7G() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        this.LIZ = paint;
        this.LIZIZ = new Path();
        this.LIZJ = new RectF();
        this.LJFF = new int[]{0};
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.LIZIZ, this.LIZ);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.LIZJ.set(rect);
        RectF rectF = this.LIZJ;
        float f = this.LIZLLL / 2.0f;
        rectF.inset(f, f);
        this.LIZIZ.reset();
        Path path = this.LIZIZ;
        RectF rectF2 = this.LIZJ;
        float f2 = this.LJ;
        path.addRoundRect(rectF2, f2, f2, Path.Direction.CW);
        LIZIZ(0.0f, true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LIZ.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LIZ.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void LIZIZ(float f, boolean z) {
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        if (iWidth > 0 && iHeight > 0) {
            float[] fArrLLI = this.LJI;
            Function2<? super Integer, ? super Integer, float[]> function2 = this.LJIIIZ;
            if (function2 != null) {
                fArrLLI = function2.invoke(Integer.valueOf(iWidth), Integer.valueOf(iHeight));
            }
            if (this.LJIIJ) {
                float f2 = f / 360.0f;
                if (fArrLLI != null) {
                    ArrayList arrayList = new ArrayList(fArrLLI.length);
                    for (float f3 : fArrLLI) {
                        arrayList.add(Float.valueOf((f3 + f2) % 1.0f));
                    }
                    fArrLLI = C13LP.LLI(arrayList);
                } else {
                    fArrLLI = null;
                }
            }
            this.LIZ.setShader(new SweepGradient(getBounds().exactCenterX() + this.LJII, getBounds().exactCenterY() + this.LJIIIIZZ, this.LJFF, fArrLLI));
            if (z) {
                invalidateSelf();
            }
        }
    }

    public final void LIZ(float f, float f2, int[] iArr, float[] fArr, float f3, float f4, Function2<? super Integer, ? super Integer, float[]> function2, int i, boolean z) {
        this.LIZLLL = f;
        this.LJ = f2;
        this.LJFF = iArr;
        this.LJI = fArr;
        this.LJII = f3;
        this.LJIIIIZZ = f4;
        this.LJIIIZ = function2;
        this.LJIIJ = z;
        this.LIZ.setStrokeWidth(f);
        this.LIZ.setAlpha(i);
        LIZIZ(0.0f, true);
        this.LIZIZ.reset();
        if (getBounds().width() > 0 && getBounds().height() > 0) {
            Path path = this.LIZIZ;
            RectF rectF = this.LIZJ;
            float f5 = this.LJ;
            path.addRoundRect(rectF, f5, f5, Path.Direction.CW);
        }
        invalidateSelf();
    }
}
