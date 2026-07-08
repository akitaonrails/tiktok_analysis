package X;

import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GW2, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GW2 extends View {
    public final Paint LL;
    public ValueAnimator LLILLJJLI;
    public float LLILLL;
    public final int[] LLILZ;
    public final float[] LLILZIL;
    public LinearGradient LLILZLL;
    public final RectF LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public float LLJI;

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ValueAnimator valueAnimator = this.LLILLJJLI;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LLILLJJLI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public C0GW2(Context context) {
        int iIntValue;
        super(context, null, 0);
        this.LL = new Paint(1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        this.LLILZ = new int[]{C0GW3.LIZ(0.0f, iIntValue), C0GW3.LIZ(0.3f, iIntValue), C0GW3.LIZ(0.5f, iIntValue), C0GW3.LIZ(0.3f, iIntValue), C0GW3.LIZ(0.0f, iIntValue)};
        this.LLILZIL = new float[]{0.0f, 0.35f, 0.5f, 0.65f, 1.0f};
        this.LLIZ = new RectF();
        setLayerType(2, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        LinearGradient linearGradient;
        super.onDraw(canvas);
        if (getWidth() != 0 && getHeight() != 0 && (linearGradient = this.LLILZLL) != null) {
            this.LL.setShader(linearGradient);
            int iSave = canvas.save();
            try {
                canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.LL);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLIZLLLIL = i;
        this.LLJ = i2;
        this.LLJI = (float) Math.sqrt((r1 * r1) + (r0 * r0));
        this.LLIZ.set(0.0f, 0.0f, this.LLIZLLLIL, this.LLJ);
        ValueAnimator valueAnimator = this.LLILLJJLI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f = this.LLJI;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(-f, f);
        valueAnimatorOfFloat.setDuration(2500L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 64));
        valueAnimatorOfFloat.start();
        this.LLILLJJLI = valueAnimatorOfFloat;
    }
}
