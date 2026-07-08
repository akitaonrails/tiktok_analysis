package X;

import Y.ARunnableS106S0100000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0Gb0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418480Gb0 extends View {
    public final TextPaint LL;
    public String LLILLJJLI;
    public int LLILLL;
    public float LLILZ;
    public int LLILZIL;
    public float LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public ValueAnimator LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;

    public final void LIZ() {
        if (!this.LLJILJILJ && this.LLJI > (getWidth() - getPaddingLeft()) - getPaddingRight()) {
            float f = getResources().getDisplayMetrics().density;
            float f2 = this.LLILZLL;
            if (Float.isNaN(f2) || Float.isInfinite(f2) || f2 <= 0.0f) {
                f2 = 20.0f;
            }
            float f3 = this.LLJI + this.LLJIJIL;
            long jMax = Math.max(1L, (long) ((f3 / (f2 * f)) * 1000.0f));
            int i = this.LLIZLLLIL;
            int i2 = -1;
            if (i != -1) {
                if (i <= 0) {
                    return;
                } else {
                    i2 = i - 1;
                }
            }
            this.LLJILJILJ = true;
            ValueAnimator valueAnimator = this.LLJILJIL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -f3);
            valueAnimatorOfFloat.setDuration(jMax);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setRepeatCount(i2);
            valueAnimatorOfFloat.setRepeatMode(1);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 116));
            valueAnimatorOfFloat.start();
            this.LLJILJIL = valueAnimatorOfFloat;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LLJILJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJILJILJ = false;
    }

    public final boolean getAutoStart() {
        return this.LLIZ;
    }

    public final int getRepeatLimit() {
        return this.LLIZLLLIL;
    }

    public final float getSpeedDpPerSec() {
        return this.LLILZLL;
    }

    public final String getText() {
        return this.LLILLJJLI;
    }

    public final int getTextColor() {
        return this.LLILLL;
    }

    public final float getTextSizePx() {
        return this.LLILZ;
    }

    public final int getTuxFont() {
        return this.LLILZIL;
    }

    public C418480Gb0(Context context) {
        super(context, null, 0);
        this.LL = new TextPaint(1);
        this.LLILLJJLI = "";
        this.LLILLL = -13421773;
        this.LLILZ = getResources().getDisplayMetrics().density * 14.0f;
        this.LLILZIL = 61;
        this.LLILZLL = 20.0f;
        this.LLIZLLLIL = -1;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LLILLJJLI.length() == 0) {
            return;
        }
        float paddingTop = getPaddingTop() - this.LL.ascent();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        if (!this.LLJILJILJ) {
            canvas.drawText(TextUtils.ellipsize(this.LLILLJJLI, this.LL, width, TextUtils.TruncateAt.END).toString(), getPaddingLeft(), paddingTop, this.LL);
            return;
        }
        canvas.save();
        canvas.translate(getPaddingLeft() + this.LLJ, 0.0f);
        canvas.drawText(this.LLILLJJLI, 0.0f, paddingTop, this.LL);
        canvas.drawText(this.LLILLJJLI, this.LLJI + this.LLJIJIL, paddingTop, this.LL);
        canvas.restore();
    }

    public final void setAutoStart(boolean z) {
        this.LLIZ = z;
    }

    public final void setRepeatLimit(int i) {
        this.LLIZLLLIL = i;
    }

    public final void setSpeedDpPerSec(float f) {
        this.LLILZLL = f;
    }

    public final void setText(String str) {
        this.LLILLJJLI = str;
        if (this.LLJILJILJ) {
            ValueAnimator valueAnimator = this.LLJILJIL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.LLJ = 0.0f;
            this.LLJILJILJ = false;
            invalidate();
        }
        requestLayout();
        invalidate();
    }

    public final void setTextColor(int i) {
        this.LLILLL = i;
        this.LL.setColor(i);
        invalidate();
    }

    public final void setTextColorRes(int i) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        setTextColor(typedValue.data);
    }

    public final void setTextSizePx(float f) {
        this.LLILZ = f;
        this.LL.setTextSize(f);
        requestLayout();
        invalidate();
    }

    public final void setTuxFont(int i) {
        float f;
        int i2;
        this.LLILZIL = i;
        int i3 = i / 10;
        int i4 = i % 10;
        TextPaint textPaint = this.LL;
        switch (i3) {
            case 1:
                f = 24.0f;
                break;
            case 2:
                f = 20.0f;
                break;
            case 3:
                f = 17.0f;
                break;
            case 4:
                f = 15.0f;
                break;
            case 5:
                f = 14.0f;
                break;
            case 6:
            default:
                f = 13.0f;
                break;
            case 7:
                f = 12.0f;
                break;
            case 8:
                f = 11.0f;
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                f = 10.0f;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
                f = 16.0f;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                f = 32.0f;
                break;
        }
        textPaint.setTextSize(f * getResources().getDisplayMetrics().density);
        if (Build.VERSION.SDK_INT >= 28) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        i2 = 400;
                    } else {
                        i2 = OppoPermissionPopupMaskDelayExp.DEFAULT;
                    }
                } else {
                    i2 = 600;
                }
            } else {
                i2 = 500;
            }
            TextPaint textPaint2 = this.LL;
            textPaint2.setTypeface(Typeface.create(textPaint2.getTypeface(), i2, false));
        }
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        this.LLJI = this.LL.measureText(this.LLILLJJLI);
        this.LLJIJIL = getResources().getDisplayMetrics().density * 16.0f;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int iDescent = (int) ((this.LL.descent() - this.LL.ascent()) + getPaddingTop() + getPaddingBottom());
        int paddingLeft = (int) (this.LLJI + getPaddingLeft() + getPaddingRight());
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                size = paddingLeft;
            }
        } else {
            size = Math.min(paddingLeft, size);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                size2 = iDescent;
            }
        } else {
            size2 = Math.min(iDescent, size2);
        }
        setMeasuredDimension(size, size2);
        if (!this.LLJILLL) {
            this.LLJILLL = true;
            if (this.LLIZ && this.LLJI > (size - getPaddingLeft()) - getPaddingRight()) {
                HandlerHook.viewPost(this, new ARunnableS106S0100000_6((Object) this, 231));
            }
        }
    }
}
