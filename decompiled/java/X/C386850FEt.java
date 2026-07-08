package X;

import Y.AUListenerS255S0100000_5;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FEt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C386850FEt extends View implements ValueAnimator.AnimatorUpdateListener {
    public final int LL;
    public final int LLILLJJLI;
    public float LLILLL;
    public final float LLILZ;
    public final float LLILZIL;
    public final float LLILZLL;
    public final Paint LLIZ;

    public final float getAnimProgress() {
        return this.LLILLL;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int i = this.LL;
        if (i != 0 && this.LLILLJJLI != 0) {
            if (this.LLILLL < 1.0f) {
                float f = height / 2;
                float f2 = 2;
                canvas.drawText(String.valueOf(i), this.LLILZ, ((f - (this.LLIZ.descent() / f2)) - (this.LLIZ.ascent() / f2)) + (this.LLILZLL * this.LLILLL), this.LLIZ);
                canvas.drawText(String.valueOf(this.LLILLJJLI), this.LLILZIL, ((f - (this.LLIZ.descent() / f2)) - (this.LLIZ.ascent() / f2)) + (this.LLILZLL * this.LLILLL), this.LLIZ);
            }
            float f3 = height / 2;
            float f4 = 2;
            float f5 = 1;
            canvas.drawText(String.valueOf(0), this.LLILZ, ((f3 - (this.LLIZ.descent() / f4)) - (this.LLIZ.ascent() / f4)) - (this.LLILZLL * (f5 - this.LLILLL)), this.LLIZ);
            canvas.drawText(String.valueOf(0), this.LLILZIL, ((f3 - (this.LLIZ.descent() / f4)) - (this.LLIZ.ascent() / f4)) - (this.LLILZLL * (f5 - this.LLILLL)), this.LLIZ);
            return;
        }
        if (this.LLILLJJLI != 0) {
            float f6 = height / 2;
            float f7 = 2;
            canvas.drawText(String.valueOf(0), this.LLILZ, (f6 - (this.LLIZ.descent() / f7)) - (this.LLIZ.ascent() / f7), this.LLIZ);
            if (this.LLILLL < 1.0f) {
                canvas.drawText(String.valueOf(this.LLILLJJLI), this.LLILZIL, ((f6 - (this.LLIZ.descent() / f7)) - (this.LLIZ.ascent() / f7)) + (this.LLILZLL * this.LLILLL), this.LLIZ);
            }
            canvas.drawText(String.valueOf(0), this.LLILZIL, ((f6 - (this.LLIZ.descent() / f7)) - (this.LLIZ.ascent() / f7)) - (this.LLILZLL * (1 - this.LLILLL)), this.LLIZ);
            return;
        }
        float f8 = height / 2;
        float f9 = 2;
        canvas.drawText(String.valueOf(0), this.LLILZ, (f8 - (this.LLIZ.descent() / f9)) - (this.LLIZ.ascent() / f9), this.LLIZ);
        canvas.drawText(String.valueOf(0), this.LLILZIL, (f8 - (this.LLIZ.descent() / f9)) - (this.LLIZ.ascent() / f9), this.LLIZ);
    }

    public final void setAnimProgress(float f) {
        this.LLILLL = f;
    }

    public C386850FEt(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet);
        this.LL = 1;
        this.LLILLJJLI = 1;
        this.LLILLL = 1.0f;
        this.LLILZLL = 71.0f;
        Paint paint = new Paint();
        this.LLIZ = paint;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "animProgress", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        float fLIZJ = C12ES.LIZJ(37.0f, getContext());
        this.LLILZLL = fLIZJ;
        paint.setTextSize(fLIZJ);
        paint.setColor(-1);
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setTypeface(C1697580uHE.LIZIZ(0.0f, OppoPermissionPopupMaskDelayExp.DEFAULT, 17.0f, 0.0f, Float.valueOf(16.0f), 0.0f, 0, null, 224));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1a, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        paint.setShadowLayer(2.0f, -0.5f, 0.5f, iIntValue);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        objectAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(this, 44));
        this.LLILZ = paint.measureText(CardStruct.IStatusCode.DEFAULT) * 0.5f;
        this.LLILZIL = paint.measureText(CardStruct.IStatusCode.DEFAULT) * 1.5f;
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
                setMeasuredDimension((int) (this.LLIZ.measureText(CardStruct.IStatusCode.DEFAULT) * 2), (int) (this.LLIZ.getFontMetrics().bottom - this.LLIZ.getFontMetrics().top));
                return;
            }
        } else if (mode != Integer.MIN_VALUE) {
            if (mode2 != Integer.MIN_VALUE) {
                return;
            }
            setMeasuredDimension(size, (int) (this.LLIZ.measureText(CardStruct.IStatusCode.DEFAULT) * 2));
            return;
        }
        setMeasuredDimension((int) (this.LLIZ.measureText(CardStruct.IStatusCode.DEFAULT) * 2), size2);
    }
}
