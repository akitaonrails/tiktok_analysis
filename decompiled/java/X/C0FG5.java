package X;

import Y.AUListenerS255S0100000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0FG5, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FG5 extends FrameLayout {
    public final float LL;
    public final float LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final Paint LLILZIL;
    public float LLILZLL;
    public final ValueAnimator LLIZ;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LLIZ.cancel();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        if (width != 0.0f && height != 0.0f) {
            super.dispatchDraw(canvas);
            int iSaveLayer = canvas.saveLayer(null, null);
            super.dispatchDraw(canvas);
            float f = this.LLILLJJLI * width;
            float f2 = (this.LLILZLL * (width + f)) - f;
            double radians = Math.toRadians(this.LL);
            float fCos = (float) Math.cos(radians);
            float fSin = (float) Math.sin(radians);
            Paint paint = this.LLILZIL;
            int i = this.LLILLL;
            int i2 = this.LLILZ;
            paint.setShader(new LinearGradient(f2, 0.0f, f2 + (f * fCos), height * fSin, new int[]{i & 16777215, i, i2, i2 & 16777215}, new float[]{0.0f, 0.33f, 0.67f, 1.0f}, Shader.TileMode.CLAMP));
            canvas.drawRect(0.0f, 0.0f, width, height, this.LLILZIL);
            canvas.restoreToCount(iSaveLayer);
            return;
        }
        super.dispatchDraw(canvas);
    }

    public C0FG5(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        super(context, attributeSet);
        this.LL = 20.0f;
        this.LLILLJJLI = 0.3f;
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(23));
        if (C960203pA.LIZIZ(context)) {
            i = -14811197;
        } else {
            i = -16731953;
        }
        this.LLILLL = i;
        if (C960203pA.LIZIZ(context)) {
            i2 = -15868929;
        } else {
            i2 = -16720478;
        }
        this.LLILZ = i2;
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.LLILZIL = paint;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(-1.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(2000L);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJFF());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(this, 4));
        this.LLIZ = valueAnimatorOfFloat;
    }
}
