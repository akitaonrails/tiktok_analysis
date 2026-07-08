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
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GXc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417100GXc extends View {
    public static final Interpolator LLJILLL = C0GY9.LIZIZ(0.3f, 0.15f, 0.7f, 0.85f);
    public EnumC429100Gs8 LL;
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
    public Function1<? super Float, Unit> LLJILJIL;
    public final RectF LLJILJILJ;

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
        valueAnimatorOfFloat.setInterpolator(LLJILLL);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 23));
        valueAnimatorOfFloat.start();
        this.LLJIJIL = valueAnimatorOfFloat;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LL == EnumC429100Gs8.ROTATE) {
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
        this.LLJILJIL = null;
    }

    public final EnumC429100Gs8 getDisplayMode() {
        return this.LL;
    }

    public final Function1<Float, Unit> getOnProgressChanged() {
        return this.LLJILJIL;
    }

    public final float getProgress() {
        return this.LLILLJJLI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = C417110GXd.LIZ[this.LL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                canvas.save();
                this.LLILZ.setShader(null);
                this.LLILZ.setColor(this.LLILZIL);
                this.LLILZ.setAlpha(Color.alpha(this.LLILZLL));
                canvas.drawArc(this.LLJILJILJ, 0.0f, 360.0f, false, this.LLILZ);
                this.LLILZ.setAlpha(Color.alpha(this.LLILZIL));
                canvas.drawArc(this.LLJILJILJ, -90.0f, this.LLILLJJLI * 360.0f, false, this.LLILZ);
                canvas.restore();
                return;
            }
            throw new C1954807lC();
        }
        canvas.save();
        canvas.rotate(this.LLJI, getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.drawOval(this.LLJILJILJ, this.LLILZ);
        canvas.restore();
    }

    public final void setDisplayMode(EnumC429100Gs8 enumC429100Gs8) {
        if (this.LL != enumC429100Gs8) {
            this.LL = enumC429100Gs8;
            int i = C417110GXd.LIZ[enumC429100Gs8.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    ValueAnimator valueAnimator = this.LLJIJIL;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                this.LLILZ.setShader(this.LLJ);
                if (isAttachedToWindow() && getVisibility() == 0) {
                    LIZ();
                }
            }
            invalidate();
        }
    }

    public final void setOnProgressChanged(Function1<? super Float, Unit> function1) {
        this.LLJILJIL = function1;
    }

    public final void setProgress(float f) {
        float fLIZLLL = C13LZ.LIZLLL(f, 0.0f, 1.0f);
        if (this.LLILLJJLI != fLIZLLL) {
            this.LLILLJJLI = fLIZLLL;
            if (this.LL == EnumC429100Gs8.PROGRESS) {
                invalidate();
            }
            Function1<? super Float, Unit> function1 = this.LLJILJIL;
            if (function1 != null) {
                function1.invoke(Float.valueOf(fLIZLLL));
            }
        }
    }

    public C417100GXc(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, 0);
        this.LL = EnumC429100Gs8.ROTATE;
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
        this.LLJILJILJ = new RectF();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        ValueAnimator valueAnimator;
        super.onVisibilityChanged(view, i);
        if (!Intrinsics.LJFF(view, this)) {
            return;
        }
        if (i == 0) {
            if (this.LL == EnumC429100Gs8.ROTATE) {
                LIZ();
            }
        } else {
            if (i != 8 || (valueAnimator = this.LLJIJIL) == null) {
                return;
            }
            valueAnimator.cancel();
        }
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
        this.LLJILJILJ.set(f2 - fMin, f4 - fMin, f2 + fMin, f4 + fMin);
    }
}
