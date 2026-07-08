package X;

import Y.ACListenerS141S0100000_6;
import Y.ALAdapterS3S0100000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import avg.f;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import mf.a;

/* JADX INFO: renamed from: X.0GY5, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GY5 extends FrameLayout {
    public Function0<Unit> LL;
    public final float LLILLJJLI;
    public final ImageView LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public final Paint LLILZLL;
    public final Paint LLIZ;

    public final void LIZIZ() {
        int i = this.LLILZ ? R.raw.icon_pen_fill : R.raw.icon_repost_fill;
        int i2 = (int) (this.LLILLJJLI * 14.0f);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LIZIZ = i2;
        c419910GdJ.LIZJ = i2;
        c419910GdJ.LIZLLL = -1;
        this.LLILLL.setImageDrawable(c419910GdJ.LIZ(getContext()));
    }

    public final Function0<Unit> getOnTap() {
        return this.LL;
    }

    public C0GY5(Context context) {
        super(context, null, 0);
        float f = getResources().getDisplayMetrics().density;
        this.LLILLJJLI = f;
        ImageView imageView = new ImageView(context);
        this.LLILLL = imageView;
        this.LLILZIL = true;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.LLILZLL = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(0.5f * f);
        this.LLIZ = paint2;
        setLayerType(1, null);
        setWillNotDraw(false);
        setClipChildren(false);
        int i = (int) (f * 14.0f);
        addView(imageView, new FrameLayout.LayoutParams(i, i, 17));
        LIZ(false, false);
        this.LLILZIL = true;
        invalidate();
        View.OnClickListener aCListenerS141S0100000_6 = new ACListenerS141S0100000_6(this, 141);
        View.OnClickListener aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS141S0100000_6) : aCListenerS141S0100000_6);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iIntValue;
        float width = getWidth();
        float height = getHeight();
        if (width > 0.0f && height > 0.0f) {
            float f = height / 2.0f;
            Paint paint = this.LLILZLL;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.im, getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            paint.setColor(iIntValue);
            canvas.drawRoundRect(new RectF(0.0f, 0.0f, width, height), f, f, this.LLILZLL);
            if (this.LLILZIL) {
                float strokeWidth = this.LLIZ.getStrokeWidth() / 2.0f;
                float f2 = 255;
                this.LLIZ.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, height, new int[]{Color.argb((int) (0.51f * f2), 255, 255, 255), Color.argb((int) (0.15f * f2), 255, 255, 255)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                float f3 = f - strokeWidth;
                canvas.drawRoundRect(new RectF(strokeWidth, strokeWidth, width - strokeWidth, height - strokeWidth), f3, f3, this.LLIZ);
            }
            super.onDraw(canvas);
        }
    }

    public final void setOnTap(Function0<Unit> function0) {
        this.LL = function0;
    }

    public final void LIZ(boolean z, boolean z2) {
        this.LLILZ = z;
        if (z2) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.72f);
            valueAnimatorOfFloat.setDuration(120L);
            valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 148));
            valueAnimatorOfFloat.addListener(new ALAdapterS3S0100000_6(this, 54));
            valueAnimatorOfFloat.start();
            return;
        }
        LIZIZ();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f = this.LLILLJJLI;
        setMeasuredDimension((int) (32.0f * f), (int) (f * 28.0f));
        measureChildren(i, i2);
    }
}
