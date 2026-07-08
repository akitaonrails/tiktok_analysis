package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.19PV, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19PV extends AbstractC21576319cH implements InterfaceC21576219cG {
    public int LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final boolean LLJ;
    public final Path LLJI;
    public final Paint LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public final float LLJJIJI;
    public float LLJJIJIIJIL;
    public int LLJJIJIL;
    public final float LLJJJ;
    public final float LLJJJIL;
    public float LLJJJJ;
    public Animator LLJJJJJIL;
    public final RectF LLJJJJLIIL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.LLJJJJJIL;
        if (animator != null) {
            animator.removeAllListeners();
            this.LLJJJJJIL.end();
            this.LLJJJJJIL = null;
        }
    }

    @Override // X.AbstractC21576319cH, X.InterfaceC21576419cI
    public final boolean LJII() {
        return this.LLJ;
    }

    public C19PV(Context context) {
        super(context);
        this.LLJILLL = -1;
        this.LLJJJJLIIL = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.LLILLJJLI = C19PY.LIZLLL;
        this.LLJI = new Path();
        Paint paint = new Paint();
        this.LLJIJIL = paint;
        paint.setAntiAlias(true);
        this.LLJJIJI = C19ZZ.LIZJ(7.0f);
        this.LLJJJ = C19ZZ.LIZJ(20.0f);
        this.LLJJJIL = C19ZZ.LIZJ(7.0f);
        paint.setStrokeWidth(C19ZZ.LIZJ(3.0f));
        setMinimumHeight(C19ZZ.LIZJ(100.0f));
        if (isInEditMode()) {
            this.LLJILJIL = LSPassThroughRecordSizeConfig.DEFAULT;
            this.LLJJJJ = 1.0f;
            this.LLJJIJIL = 270;
        } else {
            this.LLJJJJ = 0.0f;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, R$styleable.BezierRadarHeader);
        this.LLJ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BezierRadarHeader_srlEnableHorizontalDrag, this.LLJ);
        this.LLILZ = typedArrayObtainStyledAttributes.getColor(R$styleable.BezierRadarHeader_srlAccentColor, -1);
        this.LLIZ = true;
        this.LLILZIL = typedArrayObtainStyledAttributes.getColor(R$styleable.BezierRadarHeader_srlPrimaryColor, -14540254);
        this.LLILZLL = true;
        this.LLIZ = typedArrayObtainStyledAttributes.hasValue(R$styleable.BezierRadarHeader_srlAccentColor);
        this.LLILZLL = typedArrayObtainStyledAttributes.hasValue(R$styleable.BezierRadarHeader_srlPrimaryColor);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int height;
        float f;
        float f2;
        float f3;
        int width = getWidth();
        if (isInEditMode()) {
            height = getHeight();
        } else {
            height = this.LLJJ;
        }
        this.LLJI.reset();
        this.LLJI.lineTo(0.0f, this.LLJILJIL);
        Path path = this.LLJI;
        int i = this.LLJILLL;
        float f4 = 2.0f;
        if (i >= 0) {
            f = i;
        } else {
            f = width / 2.0f;
        }
        float f5 = width;
        path.quadTo(f, this.LLJILJILJ + r3, f5, this.LLJILJIL);
        this.LLJI.lineTo(f5, 0.0f);
        this.LLJIJIL.setColor(this.LLILZIL);
        canvas.drawPath(this.LLJI, this.LLJIJIL);
        if (this.LLJJI > 0.0f) {
            this.LLJIJIL.setColor(this.LLILZ);
            float f6 = height;
            float f7 = f6 / C19ZZ.LIZIZ;
            float f8 = 1.0f;
            float f9 = 7.0f;
            float f10 = (f5 * 1.0f) / 7.0f;
            float f11 = this.LLJJIII;
            float f12 = f10 * f11;
            if (f11 > 1.0f) {
                f2 = ((f11 - 1.0f) * f10) / f11;
            } else {
                f2 = 0.0f;
            }
            float f13 = f12 - f2;
            if (f11 > 1.0f) {
                f3 = (((f11 - 1.0f) * f6) / 2.0f) / f11;
            } else {
                f3 = 0.0f;
            }
            float f14 = f6 - f3;
            int i2 = 0;
            do {
                float f15 = (i2 + f8) - 4.0f;
                this.LLJIJIL.setAlpha((int) (((double) (this.LLJJI * (f8 - ((Math.abs(f15) / f9) * f4)) * 255.0f)) * (1.0d - (1.0d / Math.pow((((double) f7) / 800.0d) + 1.0d, 15.0d)))));
                float f16 = this.LLJJIJI * (1.0f - (1.0f / ((f7 / 10.0f) + 1.0f)));
                canvas.drawCircle(((f5 / 2.0f) - (f16 / 2.0f)) + (f15 * f13), f14 / 2.0f, f16, this.LLJIJIL);
                i2++;
                f8 = 1.0f;
                f9 = 7.0f;
                f4 = 2.0f;
            } while (i2 < 7);
            this.LLJIJIL.setAlpha(255);
        }
        if (this.LLJJJJJIL != null || isInEditMode()) {
            float f18 = this.LLJJJ;
            float f19 = this.LLJJJJ;
            float f20 = f18 * f19;
            float f21 = this.LLJJJIL * f19;
            this.LLJIJIL.setColor(this.LLILZ);
            this.LLJIJIL.setStyle(Paint.Style.FILL);
            float f22 = f5 / f4;
            float f23 = height / f4;
            canvas.drawCircle(f22, f23, f20, this.LLJIJIL);
            this.LLJIJIL.setStyle(Paint.Style.STROKE);
            float f24 = f21 + f20;
            canvas.drawCircle(f22, f23, f24, this.LLJIJIL);
            this.LLJIJIL.setColor((this.LLILZIL & 16777215) | 1426063360);
            this.LLJIJIL.setStyle(Paint.Style.FILL);
            this.LLJJJJLIIL.set(f22 - f20, f23 - f20, f22 + f20, f20 + f23);
            canvas.drawArc(this.LLJJJJLIIL, 270.0f, this.LLJJIJIL, true, this.LLJIJIL);
            this.LLJIJIL.setStyle(Paint.Style.STROKE);
            this.LLJJJJLIIL.set(f22 - f24, f23 - f24, f22 + f24, f23 + f24);
            canvas.drawArc(this.LLJJJJLIIL, 270.0f, this.LLJJIJIL, false, this.LLJIJIL);
            this.LLJIJIL.setStyle(Paint.Style.FILL);
        }
        if (this.LLJJIJIIJIL > 0.0f) {
            this.LLJIJIL.setColor(this.LLILZ);
            canvas.drawCircle(f5 / 2.0f, height / 2.0f, this.LLJJIJIIJIL, this.LLJIJIL);
        }
        super.dispatchDraw(canvas);
    }

    @Override // X.AbstractC21576319cH, X.InterfaceC21576419cI
    public void setPrimaryColors(int... iArr) {
        if (iArr.length > 0 && !this.LLILZLL) {
            this.LLILZIL = iArr[0];
            this.LLILZLL = false;
        }
        if (iArr.length > 1 && !this.LLIZ) {
            this.LLILZ = iArr[1];
            this.LLIZ = false;
        }
    }

    @Override // X.AbstractC21576319cH, X.InterfaceC21576419cI
    public final int LJIILL(C21576919cN c21576919cN, boolean z) {
        Animator animator = this.LLJJJJJIL;
        if (animator != null) {
            animator.removeAllListeners();
            this.LLJJJJJIL.end();
            this.LLJJJJJIL = null;
        }
        int width = getWidth();
        int i = this.LLJJ;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.LLJJJ, (float) Math.sqrt((width * width) + (i * i)));
        valueAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.addUpdateListener(new C19PW(this, (byte) 3));
        valueAnimatorOfFloat.start();
        return 400;
    }

    @Override // X.AbstractC21576319cH, X.InterfaceC21576419cI
    public final void LIZJ(C19PU c19pu, int i, int i2) {
        this.LLJILJIL = i - 1;
        this.LLIZLLLIL = false;
        C19ZZ c19zz = new C19ZZ(1);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(c19zz);
        valueAnimatorOfFloat.addUpdateListener(new C19PW(this, (byte) 2));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(c19zz);
        valueAnimatorOfFloat2.addUpdateListener(new C19PW(this, (byte) 0));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 360);
        valueAnimatorOfInt.setDuration(720L);
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new C19PW(this, (byte) 4));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfInt);
        animatorSet.start();
        int i3 = this.LLJILJILJ;
        float f = i3;
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i3, 0, -((int) (0.8f * f)), 0, -((int) (f * 0.4f)), 0);
        valueAnimatorOfInt2.addUpdateListener(new C19PW(this, (byte) 1));
        valueAnimatorOfInt2.setInterpolator(new C19ZZ(1));
        valueAnimatorOfInt2.setDuration(800L);
        valueAnimatorOfInt2.start();
        this.LLJJJJJIL = animatorSet;
    }

    @Override // X.AbstractC21576319cH, X.InterfaceC21576519cJ
    public final void LJIIJ(C19PU c19pu, EnumC21577619cU enumC21577619cU, EnumC21577619cU enumC21577619cU2) {
        int i = C19PX.LIZ[enumC21577619cU2.ordinal()];
        if (i != 1 && i != 2) {
            return;
        }
        this.LLJJI = 1.0f;
        this.LLJJJJ = 0.0f;
        this.LLJJIJIIJIL = 0.0f;
    }

    @Override // X.AbstractC21576319cH, X.InterfaceC21576419cI
    public final void LJIIZILJ(float f, int i, int i2) {
        this.LLJILLL = i;
        invalidate();
    }

    @Override // X.AbstractC21576319cH, X.InterfaceC21576419cI
    public final void LJIIL(boolean z, float f, int i, int i2, int i3) {
        this.LLJJ = i;
        if (z || this.LLIZLLLIL) {
            this.LLIZLLLIL = true;
            this.LLJILJIL = Math.min(i2, i);
            this.LLJILJILJ = (int) (Math.max(0, i - i2) * 1.9f);
            this.LLJJIII = f;
            invalidate();
        }
    }
}
