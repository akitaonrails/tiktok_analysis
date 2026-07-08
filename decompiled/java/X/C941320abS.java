package X;

import Y.AAListenerS326S0100000_15;
import Y.AUListenerS264S0100000_15;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0abS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C941320abS extends Drawable {
    public final int LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public float LJ;
    public float LJFF;
    public float LJI;
    public float LJII = 16.0f;
    public float LJIIIIZZ = 16.0f;
    public final Paint LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public final ValueAnimator LJIIL;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.LJIIIZ.setStrokeWidth(this.LJIIIIZZ);
        canvas.drawCircle(bounds.width() / 2.0f, bounds.height() / 2.0f, this.LJ, this.LJIIIZ);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LJIIIZ.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LJIIIZ.setColorFilter(colorFilter);
    }

    public C941320abS(int i, long j, long j2, long j3) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        Paint paint = new Paint();
        this.LJIIIZ = paint;
        this.LJIIJJI = System.currentTimeMillis();
        paint.setColor(-3355444);
        paint.setAlpha(200);
        paint.setStyle(Paint.Style.STROKE);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(j3);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS264S0100000_15(this, 9));
        valueAnimatorOfFloat.addListener(new AAListenerS326S0100000_15(this, 12));
        valueAnimatorOfFloat.addListener(new AAListenerS326S0100000_15(this, 11));
        this.LJIIL = valueAnimatorOfFloat;
    }
}
