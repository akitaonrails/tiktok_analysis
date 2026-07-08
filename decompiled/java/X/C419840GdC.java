package X;

import Y.AUListenerS216S0200000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GdC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419840GdC extends View {
    public float LL;
    public long LLILLJJLI;
    public final Paint LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final float[] LLILZLL;
    public final ValueAnimator LLIZ;
    public LinearGradient LLIZLLLIL;
    public float LLJ;

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = C2187451AjH.LIZ;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = C2187451AjH.LIZ;
    }

    public C419840GdC(Context context) {
        int iIntValue;
        super(context, null, 0);
        this.LLILLJJLI = 1500L;
        this.LLILLL = new Paint(1);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zk, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLILZ = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.za, context);
        this.LLILZIL = numLIZJ2 != null ? numLIZJ2.intValue() : 0;
        this.LLILZLL = new float[]{0.0f, 0.5f, 1.0f};
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(-1.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(this.LLILLJJLI);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS216S0200000_6(this, context, 10));
        this.LLIZ = valueAnimatorOfFloat;
        setLayerType(2, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        LinearGradient linearGradient;
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        if (width != 0.0f && height != 0.0f && (linearGradient = this.LLIZLLLIL) != null) {
            this.LLILLL.setShader(linearGradient);
            int iSave = canvas.save();
            try {
                canvas.drawRect(0.0f, 0.0f, width, height, this.LLILLL);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
    }

    public final void setAnimDuration(long j) {
        this.LLILLJJLI = j;
        ValueAnimator valueAnimator = this.LLIZ;
        if (valueAnimator != null) {
            valueAnimator.setDuration(j);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLJ = i;
    }
}
