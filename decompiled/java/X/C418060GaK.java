package X;

import Y.AAListenerS317S0100000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0GaK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418060GaK extends View {
    public static final float LLJIJIL = C418440Gaw.LIZIZ(Float.valueOf(1.5f));
    public static final float LLJILJIL = C418440Gaw.LIZIZ(Float.valueOf(18.0f));
    public static final float LLJILJILJ = C418440Gaw.LIZIZ(Float.valueOf(8.0f));
    public ValueAnimator LL;
    public final int[] LLILLJJLI;
    public LinearGradient LLILLL;
    public final Matrix LLILZ;
    public final RectF LLILZIL;
    public float LLILZLL;
    public EnumC429380Gsa LLIZ;
    public final List<Paint> LLIZLLLIL;
    public final Paint LLJ;
    public final Paint LLJI;

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LL = null;
    }

    public final void LIZ(EnumC429380Gsa enumC429380Gsa) {
        ValueAnimator valueAnimator = this.LL;
        int i = 0;
        if (valueAnimator != null && valueAnimator.isRunning() && 1 != 0 && enumC429380Gsa == EnumC429380Gsa.LOOP) {
            ValueAnimator valueAnimator2 = this.LL;
            if (valueAnimator2 != null) {
                valueAnimator2.setRepeatCount(-1);
            }
            this.LLIZ = enumC429380Gsa;
            return;
        }
        ValueAnimator valueAnimator3 = this.LL;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(2400L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        if (enumC429380Gsa == EnumC429380Gsa.LOOP) {
            i = -1;
        }
        valueAnimatorOfFloat.setRepeatCount(i);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 19));
        valueAnimatorOfFloat.addListener(new AAListenerS317S0100000_6(this, 8));
        valueAnimatorOfFloat.addListener(new AAListenerS317S0100000_6(this, 9));
        this.LLIZ = enumC429380Gsa;
        this.LL = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r15) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C418060GaK.onDraw(android.graphics.Canvas):void");
    }

    public final void setContentColor(int i) {
        this.LLJI.setColor(i);
        invalidate();
    }

    public C418060GaK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = new int[0];
        this.LLILZ = new Matrix();
        this.LLILZIL = new RectF();
        Paint paint = new Paint(1);
        float f = LLJIJIL;
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.STROKE);
        float f2 = LLJILJIL;
        paint.setMaskFilter(new BlurMaskFilter(0.7f * f2, BlurMaskFilter.Blur.OUTER));
        Paint paint2 = new Paint(1);
        paint2.setStrokeWidth(f);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setMaskFilter(new BlurMaskFilter(f2, BlurMaskFilter.Blur.OUTER));
        this.LLIZLLLIL = C1697810uHb.LJIIJJI(paint, paint2);
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(f);
        this.LLJ = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(Paint.Style.FILL);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zr, context);
        if (numLIZJ != null) {
            paint4.setColor(numLIZJ.intValue());
        }
        this.LLJI = paint4;
        Integer numLIZ = C2469809m4.LIZ("#C66BFA");
        Integer numLIZ2 = C2469809m4.LIZ("#00BAB4");
        if (numLIZ != null && numLIZ2 != null) {
            this.LLILLJJLI = new int[]{numLIZ.intValue(), numLIZ2.intValue()};
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLILLL = new LinearGradient(0.0f, 0.0f, i, i2, this.LLILLJJLI, (float[]) null, Shader.TileMode.CLAMP);
    }
}
