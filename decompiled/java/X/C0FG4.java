package X;

import Y.ARunnableS105S0100000_5;
import Y.AUListenerS255S0100000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FG4, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FG4 extends View implements ValueAnimator.AnimatorUpdateListener {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public float LLILZIL;
    public final float LLILZLL;
    public final float LLIZ;
    public final float LLIZLLLIL;
    public final Paint LLJ;
    public boolean LLJI;
    public final ValueAnimator LLJIJIL;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int i = this.LL;
        int i2 = this.LLILLL;
        if (i != i2 && this.LLILLJJLI != this.LLILZ) {
            if (this.LLILZIL < 1.0f) {
                float f = height / 2;
                float f2 = 2;
                canvas.drawText(String.valueOf(i2), this.LLILZLL, ((f - (this.LLJ.descent() / f2)) - (this.LLJ.ascent() / f2)) + (this.LLIZLLLIL * this.LLILZIL), this.LLJ);
                canvas.drawText(String.valueOf(this.LLILZ), this.LLIZ, ((f - (this.LLJ.descent() / f2)) - (this.LLJ.ascent() / f2)) + (this.LLIZLLLIL * this.LLILZIL), this.LLJ);
            }
            float f3 = height / 2;
            float f4 = 2;
            float f5 = 1;
            canvas.drawText(String.valueOf(this.LL), this.LLILZLL, ((f3 - (this.LLJ.descent() / f4)) - (this.LLJ.ascent() / f4)) - (this.LLIZLLLIL * (f5 - this.LLILZIL)), this.LLJ);
            canvas.drawText(String.valueOf(this.LLILLJJLI), this.LLIZ, ((f3 - (this.LLJ.descent() / f4)) - (this.LLJ.ascent() / f4)) - (this.LLIZLLLIL * (f5 - this.LLILZIL)), this.LLJ);
            return;
        }
        if (this.LLILLJJLI != this.LLILZ) {
            float f6 = height / 2;
            float f7 = 2;
            canvas.drawText(String.valueOf(i), this.LLILZLL, (f6 - (this.LLJ.descent() / f7)) - (this.LLJ.ascent() / f7), this.LLJ);
            if (this.LLILZIL < 1.0f) {
                canvas.drawText(String.valueOf(this.LLILZ), this.LLIZ, ((f6 - (this.LLJ.descent() / f7)) - (this.LLJ.ascent() / f7)) + (this.LLIZLLLIL * this.LLILZIL), this.LLJ);
            }
            canvas.drawText(String.valueOf(this.LLILLJJLI), this.LLIZ, ((f6 - (this.LLJ.descent() / f7)) - (this.LLJ.ascent() / f7)) - (this.LLIZLLLIL * (1 - this.LLILZIL)), this.LLJ);
            return;
        }
        float f8 = height / 2;
        float f9 = 2;
        canvas.drawText(String.valueOf(i), this.LLILZLL, (f8 - (this.LLJ.descent() / f9)) - (this.LLJ.ascent() / f9), this.LLJ);
        canvas.drawText(String.valueOf(this.LLILLJJLI), this.LLIZ, (f8 - (this.LLJ.descent() / f9)) - (this.LLJ.ascent() / f9), this.LLJ);
    }

    public C0FG4(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet);
        this.LLILLL = 1;
        this.LLILZ = 1;
        this.LLILZIL = 1.0f;
        this.LLIZLLLIL = 71.0f;
        Paint paint = new Paint();
        this.LLJ = paint;
        this.LLJI = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        this.LLJIJIL = valueAnimatorOfFloat;
        float fLIZJ = C12ES.LIZJ(37.0f, getContext());
        this.LLIZLLLIL = fLIZJ;
        paint.setTextSize(fLIZJ);
        paint.setColor(-1);
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1a, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        paint.setShadowLayer(2.0f, -0.5f, 0.5f, iIntValue);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(this, 22));
        this.LLILZLL = paint.measureText(CardStruct.IStatusCode.DEFAULT) * 0.5f;
        this.LLIZ = paint.measureText(CardStruct.IStatusCode.DEFAULT) * 1.5f;
    }

    public final void LIZ(int i, int i2) {
        if (i == this.LLILLL && i2 == this.LLILZ) {
            if (i == this.LL && i2 == this.LLILLJJLI) {
                return;
            }
            this.LL = i;
            this.LLILLJJLI = i2;
        } else if (this.LLJI) {
            this.LLILLL = i;
            this.LL = i;
            this.LLILZ = i2;
            this.LLILLJJLI = i2;
            this.LLJI = false;
        } else {
            this.LLILLL = this.LL;
            this.LL = i;
            this.LLILZ = this.LLILLJJLI;
            this.LLILLJJLI = i2;
        }
        HandlerHook.viewPost(this, new ARunnableS105S0100000_5(this, 24));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            if (mode2 == Integer.MIN_VALUE) {
                setMeasuredDimension((int) (this.LLJ.measureText(CardStruct.IStatusCode.DEFAULT) * 2), (int) (this.LLJ.getFontMetrics().bottom - this.LLJ.getFontMetrics().top));
                return;
            }
        } else if (mode != Integer.MIN_VALUE) {
            if (mode2 != Integer.MIN_VALUE) {
                return;
            }
            setMeasuredDimension(size, (int) (this.LLJ.measureText(CardStruct.IStatusCode.DEFAULT) * 2));
            return;
        }
        setMeasuredDimension((int) (this.LLJ.measureText(CardStruct.IStatusCode.DEFAULT) * 2), size2);
    }
}
