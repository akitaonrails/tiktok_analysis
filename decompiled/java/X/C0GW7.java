package X;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0GW7, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GW7 extends Drawable implements ValueAnimator.AnimatorUpdateListener {
    public final float LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public int LLILZIL;
    public int LLILZLL;
    public final float LLIZ;
    public float LLIZLLLIL;
    public int LLJ;
    public final Paint LLJIJIL;
    public final ValueAnimator LLJILJIL;
    public Function0<Unit> LLJILJILJ;
    public Path LLJILLL;
    public final float LLILZ = -0.5f;
    public final RectF LLJI = new RectF();

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.LLILZLL;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.LLILZIL;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        float f = this.LLILZLL;
        float f2 = 2;
        float f3 = f / f2;
        Path pathLIZ = C0GW9.LIZ(this.LLJILLL, this.LLILZIL, f, f3, f3);
        this.LLJILLL = pathLIZ;
        canvas.drawPath(pathLIZ, this.LLJIJIL);
        canvas.drawColor(this.LLILLL);
        canvas.skew(this.LLILZ, 0.0f);
        this.LLJIJIL.setColor(this.LLILLJJLI);
        int i = this.LLJ;
        for (int i2 = 0; i2 < i; i2++) {
            float f4 = this.LLIZ;
            this.LLJI.offsetTo(((i2 * f4) - (f4 / f2)) + this.LLIZLLLIL, 0.0f);
            canvas.drawRect(this.LLJI, this.LLJIJIL);
        }
        canvas.restore();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f = (Float) valueAnimator.getAnimatedValue();
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        this.LLIZLLLIL = fFloatValue % this.LLIZ;
        invalidateSelf();
        Function0<Unit> function0 = this.LLJILJILJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.LLILZIL = rect.width();
        this.LLILZLL = rect.height();
        this.LLJ = ((int) Math.ceil(((double) this.LLILZIL) / ((double) this.LLIZ))) + 2;
        this.LLJI.set(0.0f, 0.0f, this.LL, this.LLILZLL);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LLJIJIL.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LLJIJIL.setColorFilter(colorFilter);
    }

    public C0GW7(float f, int i, float f2, int i2) {
        this.LL = f;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        float f3 = f + f2;
        this.LLIZ = f3;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.LLJIJIL = paint;
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setFloatValues(0.0f, f3);
        valueAnimator.setDuration(500L);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setRepeatMode(1);
        valueAnimator.setInterpolator(new LinearInterpolator());
        this.LLJILJIL = valueAnimator;
    }
}
