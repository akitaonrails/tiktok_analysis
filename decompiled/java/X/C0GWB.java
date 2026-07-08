package X;

import Y.AUListenerS256S0100000_6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: renamed from: X.0GWB, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GWB extends View {
    public long LL;
    public float LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public final Paint LLILZIL;
    public Animator LLILZLL;
    public float LLIZ;

    public C0GWB(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZIZ() {
        Animator animator = this.LLILZLL;
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 45));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(this.LL);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.start();
        this.LLILZLL = valueAnimatorOfFloat;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LIZIZ();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.LLILZLL;
        if (animator != null) {
            animator.cancel();
        }
    }

    public static float LIZ(float f) {
        float f2;
        float f3 = 40 * f;
        if (f < 0.25f) {
            f2 = 20 * (f / 0.25f);
        } else {
            float fSin = (float) Math.sin(((f - 0.25f) * 1.5707964f) / 0.75f);
            f2 = (DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL * fSin * fSin) + 20;
        }
        return f3 + f2;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float fLIZ = LIZ(this.LLIZ);
        float f = (this.LLIZ + 0.2f) % 1.0f;
        if (f != 0.0f && Math.signum(f) != Math.signum(1.0f)) {
            f += 1.0f;
        }
        float fLIZ2 = LIZ(f);
        if (fLIZ2 < fLIZ) {
            fLIZ2 += 360;
        }
        float f2 = 360;
        if (fLIZ2 > fLIZ + f2) {
            fLIZ2 -= f2;
        }
        float f3 = this.LLILLJJLI;
        float f4 = f3 / 2;
        this.LLILZIL.setStrokeWidth(f3);
        this.LLILZIL.setColor(this.LLILLL);
        canvas.drawOval(f4, f4, getWidth() - f4, getHeight() - f4, this.LLILZIL);
        this.LLILZIL.setColor(this.LLILZ);
        canvas.drawArc(f4, f4, getWidth() - f4, getHeight() - f4, fLIZ - 90, fLIZ2 - fLIZ, false, this.LLILZIL);
    }

    public final void setDuration(long j) {
        this.LL = j;
        LIZIZ();
    }

    public C0GWB(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LL = 1200L;
        this.LLILLJJLI = C418440Gaw.LIZIZ(10);
        this.LLILLL = 570425344;
        this.LLILZ = -2013265920;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.LLILZIL = paint;
    }
}
