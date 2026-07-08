package X;

import Y.AUListenerS277S0100000_29;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: renamed from: X.12TF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12TF extends View implements C12T0 {
    public final Paint LL;
    public float LLILLJJLI;
    public final RectF LLILLL;
    public final ValueAnimator LLILZ;
    public final ValueAnimator LLILZIL;

    @Override // X.C12T0
    public final void LIZ(int i, int i2) {
    }

    @Override // X.C12T0
    public void setRecordingTintRes(int i) {
    }

    @Override // X.C12T0
    public void setStopTintColorRes(int i) {
    }

    @Override // X.C12T0
    public final void LIZIZ() {
        this.LLILZ.end();
        this.LLILZIL.start();
    }

    @Override // X.C12T0
    public final void LIZJ() {
        this.LLILZIL.end();
        this.LLILZ.start();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LLILZ.isRunning()) {
            this.LLILZ.end();
        }
        if (this.LLILZIL.isRunning()) {
            this.LLILZIL.end();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LLILLL.set(0.0f, 0.0f, getWidth(), getHeight());
        RectF rectF = this.LLILLL;
        float f = this.LLILLJJLI;
        canvas.drawRoundRect(rectF, f, f, this.LL);
    }

    public C12TF(Context context, float f) {
        super(context);
        Paint paint = new Paint();
        this.LL = paint;
        float fLIZJ = C12ES.LIZJ(2.0f, context);
        float f2 = f / 2;
        this.LLILLJJLI = f2;
        this.LLILLL = new RectF();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fLIZJ, f2);
        this.LLILZ = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f2, fLIZJ);
        this.LLILZIL = valueAnimatorOfFloat2;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 30));
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS277S0100000_29(this, 31));
        valueAnimatorOfFloat2.setDuration(250L);
    }
}
