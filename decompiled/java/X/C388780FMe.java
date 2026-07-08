package X;

import Y.AUListenerS255S0100000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0FMe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C388780FMe extends LinearLayout {
    public final float LL;
    public final float LLILLJJLI;
    public final float LLILLL;
    public final int[] LLILZ;
    public final Paint LLILZIL;
    public final Paint LLILZLL;
    public LinearGradient LLIZ;
    public final Matrix LLIZLLLIL;
    public final ValueAnimator LLJ;
    public boolean LLJI;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LLJ.cancel();
        super.onDetachedFromWindow();
    }

    public C388780FMe(Context context) {
        super(context, null, 0);
        setWillNotDraw(false);
        this.LL = 20.0f;
        this.LLILLJJLI = 0.42f;
        this.LLILLL = 0.15f;
        this.LLILZ = new int[]{-14888193, -4593440, -528172};
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.LLILZIL = paint;
        Paint paint2 = new Paint(1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.LLILZLL = paint2;
        this.LLIZLLLIL = new Matrix();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(2400L);
        valueAnimatorOfFloat.setRepeatCount(1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.45f, 0.0f, 0.55f, 1.0f));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(this, 39));
        this.LLJ = valueAnimatorOfFloat;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        if (width != 0.0f && height != 0.0f && this.LLJI) {
            int iSaveLayer = canvas.saveLayer(null, null);
            super.dispatchDraw(canvas);
            this.LLILZIL.setShader(new LinearGradient(0.0f, 0.0f, width, 0.0f, this.LLILZ, new float[]{0.0f, 0.72f, 1.0f}, Shader.TileMode.CLAMP));
            canvas.drawRect(0.0f, 0.0f, width, height, this.LLILZIL);
            if (this.LLJ.isRunning()) {
                this.LLILZLL.setShader(this.LLIZ);
                canvas.drawRect(0.0f, 0.0f, width, height, this.LLILZLL);
            }
            canvas.restoreToCount(iSaveLayer);
            return;
        }
        super.dispatchDraw(canvas);
    }
}
