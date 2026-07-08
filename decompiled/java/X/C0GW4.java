package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: X.0GW4, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GW4 extends C1083340eIW {
    public float gradientFactor;
    public float gradientWidth;
    public boolean isRtl;
    public float slideFactor;

    public final RectF createCanvasRect() {
        return !this.isRtl ? new RectF(0.0f, 0.0f, getWidth() * this.slideFactor, getHeight()) : new RectF(getWidth() * (1.0f - this.slideFactor), 0.0f, getWidth(), getHeight());
    }

    public final float getSlideFactor() {
        return this.slideFactor;
    }

    public C0GW4(Context context) {
        this(context, null, 0);
    }

    private final void setGradientWidth(float f) {
        this.gradientWidth = this.gradientWidth;
        this.gradientFactor = f / getMeasuredWidth();
        if (this.slideFactor < 1.0f) {
            invalidate();
        }
    }

    public final Paint createGradient(RectF rectF) {
        int[] iArr = new int[3];
        float[] fArr = new float[3];
        if (this.isRtl) {
            iArr[0] = 0;
            iArr[1] = -1;
            iArr[2] = -1;
            fArr[0] = 0.0f;
            fArr[1] = this.gradientFactor / this.slideFactor;
            fArr[2] = 1.0f;
        } else {
            iArr[0] = -1;
            iArr[1] = -1;
            iArr[2] = 0;
            fArr[0] = 0.0f;
            float f = this.slideFactor;
            fArr[1] = (f - this.gradientFactor) / f;
            fArr[2] = 1.0f;
        }
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setShader(new LinearGradient(rectF.left, 0.0f, rectF.right, 0.0f, iArr, fArr, Shader.TileMode.CLAMP));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        return paint;
    }

    @Override // X.C1083340eIW, androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        RectF rectFCreateCanvasRect = createCanvasRect();
        canvas.clipRect(rectFCreateCanvasRect);
        super.dispatchDraw(canvas);
        if (this.slideFactor < 1.0f && this.gradientWidth > 0.0f) {
            canvas.drawRect(rectFCreateCanvasRect, createGradient(rectFCreateCanvasRect));
        }
        canvas.restoreToCount(iSaveLayer);
    }

    public final void setGradientDistance(float f) {
        if (this.gradientWidth != f) {
            setGradientWidth(f);
            invalidate();
        }
    }

    public final void setRtl(boolean z) {
        if (this.isRtl != z) {
            this.isRtl = z;
            invalidate();
        }
    }

    public final void setSlideFactor(float f) {
        this.slideFactor = f;
    }

    public C0GW4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void animateSlideFactor(float f, float f2) {
        setGradientWidth(f2);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.slideFactor, 1.0f - (f / getMeasuredWidth()));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.ies.sdk.widgets.GradientContraintLayout$animateSlideFactor$1$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.this$0.setSlideFactor(((Float) valueAnimator.getAnimatedValue()).floatValue());
                this.this$0.invalidate();
            }
        });
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.start();
    }

    public C0GW4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.slideFactor = 1.0f;
    }
}
