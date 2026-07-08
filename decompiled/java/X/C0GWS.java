package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: renamed from: X.0GWS, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0GWS extends View {
    public Paint LL;
    public int LLILLJJLI;
    public int LLILLL;
    public Path LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public final float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public ValueAnimator LLJILJILJ;
    public float LLJILLL;

    public final void LIZ(Canvas canvas) {
        Path path = this.LLILZ;
        if (path == null) {
            return;
        }
        path.reset();
        Path path2 = this.LLILZ;
        float f = this.LLILZIL / 2.0f;
        float f2 = this.LLIZLLLIL;
        path2.moveTo(f - ((this.LLJ * f2) / 2.0f), (((this.LLILZLL / 2.0f) + f2) - this.LLIZ) + this.LLJILLL);
        Path path3 = this.LLILZ;
        float f3 = this.LLILZIL;
        float f4 = this.LLIZLLLIL;
        float f5 = this.LLJ;
        float f6 = this.LLILZLL;
        float f7 = this.LLJILLL;
        float f8 = this.LLIZ;
        path3.quadTo((f3 / 2.0f) - ((f4 * f5) / 2.0f), (f6 / 2.0f) + f4 + f7, ((f3 / 2.0f) - ((f4 * f5) / 2.0f)) + (f5 * f8), (((f6 / 2.0f) + f4) - f8) + f7);
        Path path4 = this.LLILZ;
        float f9 = this.LLILZIL / 2.0f;
        float f10 = this.LLIZLLLIL;
        float f11 = this.LLJ;
        float f12 = f9 + ((f10 * f11) / 2.0f);
        float f13 = this.LLIZ;
        path4.lineTo(f12 - ((f11 * f13) / 2.0f), (this.LLILZLL / 2.0f) + (f13 / 2.0f) + this.LLJILLL);
        Path path5 = this.LLILZ;
        float f14 = this.LLILZIL;
        float f15 = this.LLIZLLLIL;
        float f16 = this.LLJ;
        float f18 = this.LLILZLL;
        float f19 = this.LLJILLL;
        float f20 = this.LLIZ;
        path5.quadTo((f14 / 2.0f) + ((f15 * f16) / 2.0f), (f18 / 2.0f) + f19, ((f14 / 2.0f) + ((f15 * f16) / 2.0f)) - ((f16 * f20) / 2.0f), ((f18 / 2.0f) - (f20 / 2.0f)) + f19);
        Path path6 = this.LLILZ;
        float f21 = this.LLILZIL / 2.0f;
        float f22 = this.LLIZLLLIL;
        float f23 = this.LLJ;
        float f24 = this.LLIZ;
        path6.lineTo((f21 - ((f22 * f23) / 2.0f)) + (f23 * f24), ((this.LLILZLL / 2.0f) - f22) + f24 + this.LLJILLL);
        Path path7 = this.LLILZ;
        float f25 = this.LLILZIL;
        float f26 = this.LLIZLLLIL;
        float f27 = this.LLJ;
        float f28 = this.LLILZLL;
        float f29 = this.LLJILLL;
        path7.quadTo((f25 / 2.0f) - ((f26 * f27) / 2.0f), ((f28 / 2.0f) - f26) + f29, (f25 / 2.0f) - ((f27 * f26) / 2.0f), ((f28 / 2.0f) - f26) + this.LLIZ + f29);
        canvas.drawPath(this.LLILZ, this.LL);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LL.setColor(this.LLILLJJLI);
        canvas.translate(this.LLJI, 0.0f);
        LIZ(canvas);
        canvas.translate(0.0f, this.LLILZLL);
        LIZ(canvas);
        canvas.translate(-this.LLJI, -this.LLILZLL);
        this.LL.setColor(this.LLILLL);
        this.LL.setStrokeWidth(this.LLJIJIL);
        float f = this.LLJILLL;
        float f2 = this.LLILZLL;
        if (f > (-f2)) {
            float f3 = this.LLJILJIL;
            if (f > (-f2) + f3) {
                canvas.drawLine(0.0f, f2 + f, this.LLILZIL, f2 + f, this.LL);
            } else {
                canvas.drawLine(f3, f2 + f, this.LLILZIL - f3, f2 + f, this.LL);
            }
        }
    }

    public C0GWS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJ = 1.5f;
        this.LL = new Paint();
        this.LLILLJJLI = Color.argb(191, 255, 255, 255);
        this.LLILLL = Color.argb(30, 100, 100, 100);
        this.LLILZ = new Path();
        this.LLJIJIL = (int) TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics());
        this.LLIZLLLIL = (int) TypedValue.applyDimension(1, 25.0f, context.getResources().getDisplayMetrics());
        float f = this.LLJIJIL;
        this.LLJILJIL = 3.0f * f;
        this.LLIZ = 10.0f * f;
        this.LLJI = f * 8.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLJILJILJ = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(1000L);
        this.LLJILJILJ.setInterpolator(new DecelerateInterpolator(1.5f));
        this.LLJILJILJ.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0GWT
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C0GWS c0gws = this.LL;
                c0gws.LLJILLL = (-c0gws.LLILZLL) * fFloatValue;
                c0gws.invalidate();
            }
        });
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLILZIL = i;
        this.LLILZLL = i2;
    }
}
