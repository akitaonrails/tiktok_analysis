package X;

import Y.ARunnableS106S0100000_6;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.19Ud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21546919Ud extends LinearLayout {
    public int LL;
    public int LLILLJJLI;
    public final Paint LLILLL;
    public final GradientDrawable LLILZ;
    public int LLILZIL;
    public float LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public ValueAnimator LLJ;
    public final ARunnableS106S0100000_6 LLJI;
    public final /* synthetic */ C21546719Ub LLJIJIL;

    public final void LIZLLL() {
        int right;
        View childAt = getChildAt(this.LLILZIL);
        int i = -1;
        if (childAt == null || childAt.getWidth() <= 0) {
            right = -1;
        } else {
            int left = childAt.getLeft();
            right = childAt.getRight();
            C21546719Ub c21546719Ub = this.LLJIJIL;
            if (!c21546719Ub.LLLF && (childAt instanceof C21546819Uc)) {
                LIZIZ((C21546819Uc) childAt, c21546719Ub.LLILLL);
                RectF rectF = this.LLJIJIL.LLILLL;
                left = (int) rectF.left;
                right = (int) rectF.right;
            }
            if (this.LLILLJJLI > -1) {
                int left2 = (childAt.getLeft() + childAt.getRight()) / 2;
                int i2 = this.LLILLJJLI;
                left = left2 - (i2 / 2);
                right = (i2 / 2) + left2;
            }
            if (this.LLILZLL <= 0.0f || this.LLILZIL >= getChildCount() - 1) {
                i = left;
            } else {
                View childAt2 = getChildAt(this.LLILZIL + 1);
                int left3 = childAt2.getLeft();
                int right2 = childAt2.getRight();
                C21546719Ub c21546719Ub2 = this.LLJIJIL;
                if (!c21546719Ub2.LLLF && (childAt2 instanceof C21546819Uc)) {
                    LIZIZ((C21546819Uc) childAt2, c21546719Ub2.LLILLL);
                    RectF rectF2 = this.LLJIJIL.LLILLL;
                    left3 = (int) rectF2.left;
                    right2 = (int) rectF2.right;
                }
                if (this.LLILLJJLI > -1) {
                    int left4 = (childAt2.getLeft() + childAt2.getRight()) / 2;
                    int i3 = this.LLILLJJLI;
                    left3 = left4 - (i3 / 2);
                    right2 = left4 + (i3 / 2);
                }
                float f = this.LLILZLL;
                i = (int) ((left3 * f) + ((1.0f - f) * left));
                right = (int) ((right2 * f) + ((1.0f - f) * right));
            }
        }
        LIZJ(i, right);
    }

    public float getIndicatorPosition() {
        return this.LLILZIL + this.LLILZLL;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        int i;
        Drawable drawable = this.LLJIJIL.LLJJIII;
        int height2 = 0;
        if (drawable != null) {
            height = drawable.getIntrinsicHeight();
        } else {
            height = 0;
        }
        int i2 = this.LL;
        if (i2 >= 0) {
            height = i2;
        }
        int i3 = this.LLJIJIL.LLJLLIL;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            height = 0;
                        } else {
                            height2 = (getHeight() - height) - this.LLJIJIL.LLJLLL;
                            height = getHeight() - this.LLJIJIL.LLJLLL;
                        }
                    } else {
                        height = getHeight();
                    }
                }
            } else {
                height2 = (getHeight() - height) / 2;
                height = (getHeight() + height) / 2;
            }
        } else {
            height2 = getHeight() - height;
            height = getHeight();
        }
        int i4 = this.LLIZ;
        if (i4 >= 0 && (i = this.LLIZLLLIL) > i4) {
            Drawable drawable2 = this.LLJIJIL.LLJJIII;
            if (drawable2 == null) {
                drawable2 = this.LLILZ;
            }
            drawable2.setBounds(i4, height2, i, height);
            Paint paint = this.LLILLL;
            if (paint != null) {
                C16GF.LJI(drawable2, paint.getColor());
            }
            drawable2.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
    }

    public void setSelectedIndicatorColor(int i) {
        if (this.LLILLL.getColor() != i) {
            this.LLILLL.setColor(i);
            postInvalidateOnAnimation();
        }
    }

    public void setSelectedIndicatorHeight(int i) {
        if (this.LL != i) {
            this.LL = i;
            postInvalidateOnAnimation();
        }
    }

    public void setSelectedIndicatorWidth(int i) {
        if (this.LLILLJJLI != i) {
            this.LLILLJJLI = i;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21546919Ud(C21546719Ub c21546719Ub, Context context) {
        super(context);
        this.LLJIJIL = c21546719Ub;
        this.LLILLJJLI = -1;
        this.LLILZIL = -1;
        this.LLIZ = -1;
        this.LLIZLLLIL = -1;
        this.LLJI = new ARunnableS106S0100000_6((Object) this, 19);
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.LLILLL = new Paint();
        this.LLILZ = new GradientDrawable();
    }

    public final void LIZ(final int i, int i2) {
        final int left;
        final int right;
        ValueAnimator valueAnimator = this.LLJ;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LLJ.cancel();
        }
        View childAt = getChildAt(i);
        if (childAt == null) {
            LIZLLL();
            return;
        }
        if (this.LLILLJJLI > 0) {
            int left2 = (childAt.getLeft() + childAt.getRight()) / 2;
            int i3 = this.LLILLJJLI / 2;
            left = left2 - i3;
            right = left2 + i3;
        } else {
            left = childAt.getLeft();
            right = childAt.getRight();
            C21546719Ub c21546719Ub = this.LLJIJIL;
            if (!c21546719Ub.LLLF && (childAt instanceof C21546819Uc)) {
                LIZIZ((C21546819Uc) childAt, c21546719Ub.LLILLL);
                RectF rectF = this.LLJIJIL.LLILLL;
                left = (int) rectF.left;
                right = (int) rectF.right;
            }
        }
        final int i4 = this.LLIZ;
        final int i5 = this.LLIZLLLIL;
        if (i4 == left && i5 == right) {
            return;
        }
        ValueAnimator valueAnimator2 = new ValueAnimator();
        this.LLJ = valueAnimator2;
        valueAnimator2.setInterpolator(C194V.LIZIZ);
        if (this.LLJIJIL.LLLJL) {
            i2 = Math.max(i2 / 2, 150);
        }
        valueAnimator2.setDuration(i2);
        valueAnimator2.setFloatValues(0.0f, 1.0f);
        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.19Ue
            public int LL;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                if (this.LLILZLL.LLJIJIL.LLLJL) {
                    int i6 = this.LL + 1;
                    this.LL = i6;
                    if (i6 % 2 != 0) {
                        return;
                    }
                }
                float animatedFraction = valueAnimator3.getAnimatedFraction();
                this.LLILZLL.LIZJ(C194V.LIZ(animatedFraction, i4, left), C194V.LIZ(animatedFraction, i5, right));
            }
        });
        valueAnimator2.addListener(new AnimatorListenerAdapter() { // from class: X.19Uf
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C21546919Ud c21546919Ud = this.LLILZ;
                c21546919Ud.LLILZIL = i;
                c21546919Ud.LLILZLL = 0.0f;
                c21546919Ud.LIZJ(left, right);
            }
        });
        valueAnimator2.start();
    }

    public final void LIZIZ(C21546819Uc c21546819Uc, RectF rectF) {
        int contentWidth = c21546819Uc.getContentWidth();
        if (contentWidth < this.LLJIJIL.LJIIIIZZ(24)) {
            contentWidth = this.LLJIJIL.LJIIIIZZ(24);
        }
        int left = (c21546819Uc.getLeft() + c21546819Uc.getRight()) / 2;
        int i = contentWidth / 2;
        rectF.set(left - i, 0.0f, left + i, 0.0f);
    }

    public final void LIZJ(int i, int i2) {
        if (i != this.LLIZ || i2 != this.LLIZLLLIL) {
            this.LLIZ = i;
            this.LLIZLLLIL = i2;
            if (this.LLJIJIL.LLLJL) {
                HandlerHook.viewRemoveCallbacks(this, this.LLJI);
                C21546719Ub c21546719Ub = this.LLJIJIL;
                if (!c21546719Ub.LLLL) {
                    c21546719Ub.LLLL = true;
                    c21546719Ub.LLLLII = new ChoreographerFrameCallbackC2189671Amr(this, 2);
                    C786410Ut5.v2().postFrameCallback(this.LLJIJIL.LLLLII);
                    return;
                }
                return;
            }
            postInvalidateOnAnimation();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        C21546719Ub c21546719Ub = this.LLJIJIL;
        if (c21546719Ub.LLJLILLLLZIIL == 1 || c21546719Ub.LLJZIJLIL == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (((int) C21551419Vw.LIZIZ(16, getContext())) * 2)) {
                boolean z = false;
                for (int i4 = 0; i4 < childCount; i4++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z = true;
                    }
                }
                if (!z) {
                    return;
                }
            } else {
                C21546719Ub c21546719Ub2 = this.LLJIJIL;
                c21546719Ub2.LLJLILLLLZIIL = 0;
                c21546719Ub2.LJIJI(false);
            }
            super.onMeasure(i, i2);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.LLJ;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LLJ.cancel();
            LIZ(this.LLILZIL, Math.round((1.0f - this.LLJ.getAnimatedFraction()) * this.LLJ.getDuration()));
            return;
        }
        LIZLLL();
    }
}
