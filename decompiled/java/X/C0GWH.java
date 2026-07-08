package X;

import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0GWH, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GWH extends View {
    public static long LLJJJJLIIL;
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final RectF LLILLL;
    public final Path LLILZ;
    public float LLILZIL;
    public int LLILZLL;
    public long LLIZ;
    public float LLIZLLLIL;
    public int LLJ;
    public ValueAnimator LLJI;
    public float LLJIJIL;
    public LinearGradient LLJILJIL;
    public final Matrix LLJILJILJ;
    public final float LLJILLL;
    public WeakReference<View> LLJJ;
    public LinearGradient LLJJI;
    public float LLJJIII;
    public final int[] LLJJIJI;
    public final int[] LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public final C0GWI LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;

    public final void LIZJ() {
        float fWidth = this.LLILLL.width();
        if (fWidth <= 0.0f) {
            this.LLJILJIL = null;
            this.LLILLJJLI.setShader(null);
        } else {
            LinearGradient linearGradientLIZ = LIZ(fWidth);
            this.LLJILJIL = linearGradientLIZ;
            this.LLILLJJLI.setShader(linearGradientLIZ);
        }
    }

    public final void LIZLLL() {
        if (!C467860IWi.LIZ(getContext())) {
            this.LLJ = C2441009hQ.LJIIIIZZ(this.LLILZLL) > 0.5d ? -16777216 : -1;
        } else {
            this.LLJ = -1;
            this.LLIZLLLIL = 0.035f;
        }
    }

    public final void LJ() {
        if (!(isAttachedToWindow() && this.LLJJJ && this.LLJJJJ && this.LLJJJJJIL)) {
            ValueAnimator valueAnimator = this.LLJI;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.LLJI = null;
            return;
        }
        ValueAnimator valueAnimator2 = this.LLJI;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            Float fValueOf = Float.valueOf(this.LLILLL.width());
            float fFloatValue = fValueOf.floatValue() > 0.0f ? fValueOf.floatValue() : getWidth();
            if (fFloatValue > 0.0f) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(-fFloatValue, fFloatValue);
                valueAnimatorOfFloat.setDuration(this.LLIZ);
                valueAnimatorOfFloat.setRepeatCount(-1);
                valueAnimatorOfFloat.setRepeatMode(1);
                valueAnimatorOfFloat.setInterpolator(this.LLJJJIL);
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 88));
                valueAnimatorOfFloat.start();
                this.LLJI = valueAnimatorOfFloat;
            }
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LJ();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LLJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJI = null;
    }

    public final boolean getShimmerEnabled() {
        return this.LLJJJJJIL;
    }

    public final LinearGradient LIZ(float f) {
        int i = this.LLJ & 16777215;
        int iLIZLLL = (int) (C13LZ.LIZLLL(this.LLIZLLLIL, 0.0f, 1.0f) * 255);
        int[] iArr = new int[17];
        float[] fArr = new float[17];
        int i2 = 0;
        do {
            float f2 = i2 / 16;
            fArr[i2] = f2;
            iArr[i2] = (C13LZ.LJ((int) (iLIZLLL * ((float) ((1.0d - Math.cos(((double) f2) * 6.283185307179586d)) / 2.0d))), 0, 255) << 24) | i;
            i2++;
        } while (i2 < 17);
        return new LinearGradient(0.0f, 0.0f, f, 0.0f, iArr, fArr, Shader.TileMode.CLAMP);
    }

    public final void LIZIZ(Canvas canvas) {
        this.LLILZ.reset();
        Path path = this.LLILZ;
        RectF rectF = this.LLILLL;
        float f = this.LLILZIL;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        int iSave = canvas.save();
        canvas.clipPath(this.LLILZ);
        canvas.drawRect(this.LLILLL, this.LLILLJJLI);
        canvas.restoreToCount(iSave);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0118, code lost:
    
        if (r8 == null) goto L41;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0GWH.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        if (this.LLJJJ == z) {
            return;
        }
        this.LLJJJ = z;
        LJ();
    }

    public final void setCornerRadius(float f) {
        if (this.LLILZIL == f) {
            return;
        }
        this.LLILZIL = f;
        invalidate();
    }

    public final void setLoading(boolean z) {
        if (this.LLJJJJ == z) {
            return;
        }
        this.LLJJJJ = z;
        LJ();
        invalidate();
    }

    public final void setPlaceholderColor(int i) {
        if (this.LLILZLL == i) {
            return;
        }
        this.LLILZLL = i;
        LIZLLL();
        LIZJ();
        invalidate();
    }

    public final void setShimmerEnabled(boolean z) {
        if (this.LLJJJJJIL == z) {
            return;
        }
        this.LLJJJJJIL = z;
        LJ();
        invalidate();
    }

    public C0GWH(Context context, AttributeSet attributeSet) {
        int iLJIIL;
        super(context, attributeSet, 0);
        this.LL = new Paint(1);
        this.LLILLJJLI = new Paint(1);
        this.LLILLL = new RectF();
        this.LLILZ = new Path();
        this.LLILZIL = context.getResources().getDisplayMetrics().density * 12.0f;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context);
        if (numLIZJ != null) {
            iLJIIL = numLIZJ.intValue();
        } else {
            iLJIIL = C2441009hQ.LJIIL(-16777216, 31);
        }
        this.LLILZLL = iLJIIL;
        this.LLIZ = 3000L;
        this.LLIZLLLIL = 0.4f;
        this.LLJ = -1;
        this.LLJILJILJ = new Matrix();
        this.LLJILLL = (float) Math.tan(Math.toRadians(-25.0d));
        this.LLJJIJI = new int[2];
        this.LLJJIJIIJIL = new int[2];
        this.LLJJJ = true;
        this.LLJJJIL = C0GWI.LIZ;
        this.LLJJJJJIL = true;
        setLayerType(2, null);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.TakoShimmerSkeletonView);
            try {
                this.LLILZIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.TakoShimmerSkeletonView_tako_skeleton_radius, this.LLILZIL);
                this.LLILZLL = typedArrayObtainStyledAttributes.getColor(R$styleable.TakoShimmerSkeletonView_tako_skeleton_placeholderColor, this.LLILZLL);
                setShimmerEnabled(typedArrayObtainStyledAttributes.getBoolean(R$styleable.TakoShimmerSkeletonView_tako_skeleton_shimmer, this.LLJJJJJIL));
                this.LLIZ = typedArrayObtainStyledAttributes.getInt(R$styleable.TakoShimmerSkeletonView_tako_skeleton_shimmerDurationMs, (int) this.LLIZ);
                this.LLIZLLLIL = typedArrayObtainStyledAttributes.getFloat(R$styleable.TakoShimmerSkeletonView_tako_skeleton_highlightAlpha, this.LLIZLLLIL);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        LIZLLL();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLILLL.set(0.0f, 0.0f, i, i2);
        LIZJ();
        LJ();
    }
}
