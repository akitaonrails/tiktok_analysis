package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.19bA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21569419bA extends View {
    public boolean LL;
    public int LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public boolean LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public float LLJJIJIL;
    public float LLJJJ;
    public ValueAnimator LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    public static float LIZ(float f, float f2) {
        if (f2 < 1.0f) {
            if (f >= 0.0f && f < 1.0f - f2) {
                return f + f2;
            }
            if (f >= 1.0f - f2 && f < 2.0f - f2) {
                return ((-f) + 2.0f) - f2;
            }
            if (f >= 2.0f - f2 && f <= 2.0f) {
                return (f + f2) - 2.0f;
            }
        } else if (f2 >= 1.0f) {
            if (f >= 0.0f && f < 2.0f - f2) {
                return ((-f) + 2.0f) - f2;
            }
            if (f >= 2.0f - f2 && f < 3.0f - f2) {
                return (f + f2) - 2.0f;
            }
            if (f >= 3.0f - f2 && f <= 2.0f) {
                return ((-f) + 4.0f) - f2;
            }
        }
        return 0.0f;
    }

    public void LIZLLL(Canvas canvas) {
    }

    private final PathInterpolator getInterpolator() {
        return (PathInterpolator) this.LLJJIJIIJIL.getValue();
    }

    private final Paint getPaint() {
        return (Paint) this.LLJJJJLIIL.getValue();
    }

    public final void LIZIZ() {
        ValueAnimator valueAnimator = this.LLJJJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void LJ() {
        ValueAnimator valueAnimator = this.LLJJJIL;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
    }

    public final void LJFF() {
        if (this.LL) {
            return;
        }
        ValueAnimator valueAnimator = this.LLJJJIL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.LLJJJIL;
            if (valueAnimator2 != null) {
                valueAnimator2.resume();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator3 = this.LLJJJIL;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLJJJIL = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setRepeatCount(-1);
        }
        ValueAnimator valueAnimator4 = this.LLJJJIL;
        if (valueAnimator4 != null) {
            valueAnimator4.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator5 = this.LLJJJIL;
        if (valueAnimator5 != null) {
            valueAnimator5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.19bC
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator6) {
                    C21569419bA c21569419bA = this.LL;
                    int i = c21569419bA.LLIZ + 1;
                    c21569419bA.LLIZ = i;
                    if (i == c21569419bA.LLILLJJLI) {
                        c21569419bA.LLIZ = 0;
                        c21569419bA.LLJ = ((Float) valueAnimator6.getAnimatedValue()).floatValue();
                        this.LL.invalidate();
                    }
                }
            });
        }
        ValueAnimator valueAnimator6 = this.LLJJJIL;
        if (valueAnimator6 != null) {
            valueAnimator6.setDuration(1000L);
        }
        ValueAnimator valueAnimator7 = this.LLJJJIL;
        if (valueAnimator7 != null) {
            valueAnimator7.setRepeatCount(-1);
        }
        ValueAnimator valueAnimator8 = this.LLJJJIL;
        if (valueAnimator8 != null) {
            valueAnimator8.start();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LLJJJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void LIZJ(EnumC21569519bB enumC21569519bB) {
        this.LLJILJILJ = enumC21569519bB.getBarWidthRatio();
        this.LLJILLL = enumC21569519bB.getBarRadiusRatio();
        this.LLJJ = enumC21569519bB.getHorizontalSpaceRatio();
        this.LLJJI = enumC21569519bB.getTopSpaceRatio();
        this.LLJJIII = enumC21569519bB.getBottomSpaceRatio();
        this.LLIZLLLIL = enumC21569519bB.getBarColor();
        this.LLJJIJI = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        LIZLLL(canvas);
        float f = this.LLJ * 2.0f;
        float fLIZ = LIZ(f, 0.0f);
        float fLIZ2 = LIZ(f, 0.46f);
        float fLIZ3 = LIZ(f, 0.92f);
        this.LLJI = getInterpolator().getInterpolation(fLIZ);
        this.LLJIJIL = getInterpolator().getInterpolation(fLIZ2);
        this.LLJILJIL = getInterpolator().getInterpolation(fLIZ3);
        if (this.LLJJJJ != getHeight() || this.LLJJIJI || this.LLJJJJJIL != getWidth()) {
            float height = getHeight();
            float f2 = 1.0f - this.LLJJI;
            float f3 = this.LLJJIII;
            this.LLILZLL = (height * (f2 - f3)) / 2.0f;
            this.LLILZ = (1.0f - f3) * getHeight();
            this.LLILLL = this.LLJJI * getHeight();
            this.LLILZIL = this.LLJILJILJ * getWidth();
            this.LLJJJJJIL = getWidth();
            float f4 = this.LLJJ + (this.LLJILJILJ / 2.0f);
            this.LLJJIJIL = f4;
            this.LLJJJ = 1 - f4;
            getPaint().setColor(this.LLIZLLLIL);
            this.LLJJIJI = false;
            this.LLJJJJ = getHeight();
            this.LLJJJJJIL = getWidth();
        }
        float width = this.LLJILLL * getWidth();
        canvas.drawRoundRect((this.LLJJIJIL * getWidth()) - (this.LLILZIL / 2.0f), (this.LLILZLL * this.LLJI) + this.LLILLL, (this.LLJJIJIL * getWidth()) + (this.LLILZIL / 2.0f), this.LLILZ, width, width, getPaint());
        canvas.drawRoundRect((getWidth() * 0.5f) - (this.LLILZIL / 2.0f), this.LLILLL + (this.LLILZLL * this.LLJIJIL), (getWidth() * 0.5f) + (this.LLILZIL / 2.0f), this.LLILZ, width, width, getPaint());
        canvas.drawRoundRect((this.LLJJJ * getWidth()) - (this.LLILZIL / 2.0f), (this.LLILZLL * this.LLJILJIL) + this.LLILLL, (this.LLJJJ * getWidth()) + (this.LLILZIL / 2.0f), this.LLILZ, width, width, getPaint());
    }

    public final void setDisableAnim(boolean z) {
        this.LL = z;
    }

    public final void setRenderInterval(int i) {
        this.LLILLJJLI = i;
        this.LLIZ = 0;
    }

    public C21569419bA(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C21569419bA(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, -1);
        this.LLILLJJLI = 1;
        this.LLIZLLLIL = -1;
        this.LLJIJIL = 0.46f;
        this.LLJILJIL = 0.92f;
        this.LLJILJILJ = 0.160625f;
        this.LLJILLL = 0.027083332f;
        this.LLJJ = 0.125f;
        this.LLJJI = 0.125f;
        this.LLJJIII = 0.14583333f;
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(596));
        float f = this.LLJJ + (this.LLJILJILJ / 2.0f);
        this.LLJJIJIL = f;
        this.LLJJJ = 1 - f;
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4060));
    }
}
