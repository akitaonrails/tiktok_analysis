package X;

import Y.AUListenerS256S0100000_6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: X.0GW5, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GW5 extends View {
    public static final float LLILZ = C418440Gaw.LIZIZ(Double.valueOf(2.5d));
    public final Paint LL;
    public Animator LLILLJJLI;
    public float LLILLL;

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 83));
        valueAnimatorOfFloat.start();
        this.LLILLJJLI = valueAnimatorOfFloat;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.LLILLJJLI;
        if (animator != null) {
            animator.cancel();
        }
    }

    public C0GW5(Context context) {
        super(context, null, 0);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.LL = paint;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        float f = LLILZ;
        float height2 = (getHeight() / 2.0f) - f;
        float f2 = 2;
        canvas.drawCircle(f, (((float) Math.sin(((double) (this.LLILLL * f2)) * 3.141592653589793d)) * height2) + height, f, this.LL);
        canvas.drawCircle(canvas.getWidth() / 2.0f, (((float) Math.sin(((double) ((this.LLILLL - 0.1f) * f2)) * 3.141592653589793d)) * height2) + height, f, this.LL);
        canvas.drawCircle(canvas.getWidth() - f, height + (height2 * ((float) Math.sin(((double) ((this.LLILLL - 0.2f) * f2)) * 3.141592653589793d))), f, this.LL);
    }

    public final void setTintColor(int i) {
        this.LL.setColor(i);
    }
}
