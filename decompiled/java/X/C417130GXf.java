package X;

import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GXf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417130GXf extends View {
    public static final Interpolator LLJILJILJ = C0GY9.LIZIZ(0.3f, 0.15f, 0.7f, 0.85f);
    public EnumC429090Gs7 LL;
    public float LLILLJJLI;
    public final float LLILLL;
    public final Paint LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int[] LLIZ;
    public final float[] LLIZLLLIL;
    public SweepGradient LLJ;
    public float LLJI;
    public ValueAnimator LLJIJIL;
    public final RectF LLJILJIL;

    public C417130GXf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZ() {
        ValueAnimator valueAnimator;
        if (getVisibility() == 8) {
            ValueAnimator valueAnimator2 = this.LLJIJIL;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator3 = this.LLJIJIL;
        if (valueAnimator3 != null) {
            if (valueAnimator3.isRunning() || (valueAnimator = this.LLJIJIL) == null) {
                return;
            }
            valueAnimator.start();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(LLJILJILJ);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 22));
        valueAnimatorOfFloat.start();
        this.LLJIJIL = valueAnimatorOfFloat;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LL == EnumC429090Gs7.ROTATE) {
            LIZ();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LLJIJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LLJIJIL;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        this.LLJIJIL = null;
    }

    public final EnumC429090Gs7 getDisplayMode() {
        return this.LL;
    }

    public final float getProgress() {
        return this.LLILLJJLI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = C417140GXg.LIZ[this.LL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                canvas.save();
                this.LLILZ.setShader(null);
                this.LLILZ.setColor(this.LLILZIL);
                this.LLILZ.setAlpha(Color.alpha(this.LLILZLL));
                canvas.drawArc(this.LLJILJIL, 0.0f, 360.0f, false, this.LLILZ);
                this.LLILZ.setAlpha(Color.alpha(this.LLILZIL));
                canvas.drawArc(this.LLJILJIL, -90.0f, this.LLILLJJLI * 360.0f, false, this.LLILZ);
                canvas.restore();
                return;
            }
            throw new C1954807lC();
        }
        canvas.save();
        canvas.rotate(this.LLJI, getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.drawOval(this.LLJILJIL, this.LLILZ);
        canvas.restore();
    }

    public final void setDisplayMode(EnumC429090Gs7 enumC429090Gs7) {
        if (this.LL != enumC429090Gs7) {
            this.LL = enumC429090Gs7;
            int i = C417140GXg.LIZ[enumC429090Gs7.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    ValueAnimator valueAnimator = this.LLJIJIL;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        return;
                    }
                    return;
                }
                throw new C1954807lC();
            }
            this.LLILZ.setShader(this.LLJ);
        }
    }

    public final void setProgress(float f) {
        if (this.LLILLJJLI != f) {
            this.LLILLJJLI = C13LZ.LIZLLL(f, 0.0f, 1.0f);
            if (this.LL == EnumC429090Gs7.PROGRESS) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        ValueAnimator valueAnimator;
        super.onVisibilityChanged(view, i);
        if (!Intrinsics.LJFF(view, this)) {
            return;
        }
        if (i == 0) {
            if (this.LL == EnumC429090Gs7.ROTATE) {
                LIZ();
            }
        } else {
            if (i != 8 || (valueAnimator = this.LLJIJIL) == null) {
                return;
            }
            valueAnimator.cancel();
        }
    }

    public C417130GXf(Context context, AttributeSet attributeSet, int i) {
        int iIntValue;
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LL = EnumC429090Gs7.ROTATE;
        float f = getResources().getDisplayMetrics().density * 3.0f;
        this.LLILLL = f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        paint.setDither(true);
        setLayerType(2, paint);
        this.LLILZ = paint;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLILZIL = iIntValue;
        int iArgb = Color.argb((int) (Color.alpha(iIntValue) * 0.15f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        this.LLILZLL = iArgb;
        this.LLIZ = new int[]{iIntValue, iArgb, iIntValue, iArgb, iIntValue};
        this.LLIZLLLIL = new float[]{0.0f, 0.5f, 0.5f, 1.0f, 1.0f};
        this.LLJILJIL = new RectF();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i;
        float f2 = f / 2.0f;
        float f3 = i2;
        float f4 = f3 / 2.0f;
        SweepGradient sweepGradient = new SweepGradient(f2, f4, this.LLIZ, this.LLIZLLLIL);
        this.LLJ = sweepGradient;
        this.LLILZ.setShader(sweepGradient);
        float fMin = (Math.min(f, f3) - this.LLILLL) / 2;
        this.LLJILJIL.set(f2 - fMin, f4 - fMin, f2 + fMin, f4 + fMin);
    }
}
