package X;

import Y.AUListenerS277S0100000_29;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.mt.protector.impl.color.ColorProtector;

/* JADX INFO: renamed from: X.12UF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12UF extends View {
    public final Paint LL;
    public float LLILLJJLI;
    public final ValueAnimator LLILLL;
    public final ValueAnimator LLILZ;

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LLILLL.isRunning()) {
            this.LLILLL.end();
        }
        if (this.LLILZ.isRunning()) {
            this.LLILZ.end();
        }
    }

    public C12UF(Context context) {
        super(context);
        Paint paint = new Paint();
        this.LL = paint;
        float fLIZJ = C12ES.LIZJ(3.5f, context);
        float fLIZJ2 = C12ES.LIZJ(13.0f, context);
        this.LLILLJJLI = fLIZJ2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fLIZJ, fLIZJ2);
        this.LLILLL = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fLIZJ2, fLIZJ);
        this.LLILZ = valueAnimatorOfFloat2;
        paint.setAntiAlias(true);
        paint.setColor(ColorProtector.parseColor("#fe2c55"));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 4));
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS277S0100000_29(this, 5));
        valueAnimatorOfFloat2.setDuration(250L);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        float f = this.LLILLJJLI;
        canvas.drawRoundRect(rectF, f, f, this.LL);
    }
}
