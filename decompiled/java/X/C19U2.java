package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.19U2, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19U2 extends LinearLayout {
    public ValueAnimator indicatorAnimator;
    public int layoutDirection;
    public int selectedPosition;
    public float selectionOffset;
    public final /* synthetic */ C19U1 this$0;

    private void jumpIndicatorToSelectedPosition() {
        View childAt = getChildAt(this.selectedPosition);
        C19U1 c19u1 = this.this$0;
        C19U3 c19u3 = c19u1.tabIndicatorInterpolator;
        Drawable drawable = c19u1.tabSelectedIndicator;
        c19u3.getClass();
        RectF rectFLIZ = C19U3.LIZ(c19u1, childAt);
        drawable.setBounds((int) rectFLIZ.left, drawable.getBounds().top, (int) rectFLIZ.right, drawable.getBounds().bottom);
    }

    public float getIndicatorPosition() {
        return this.selectedPosition + this.selectionOffset;
    }

    public boolean childrenNeedLayout() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).getWidth() <= 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int height;
        int iHeight = this.this$0.tabSelectedIndicator.getBounds().height();
        if (iHeight < 0) {
            iHeight = this.this$0.tabSelectedIndicator.getIntrinsicHeight();
        }
        int i = this.this$0.tabIndicatorGravity;
        if (i != 0) {
            if (i != 1) {
                height = 0;
                if (i != 2) {
                    if (i != 3) {
                        iHeight = 0;
                    } else {
                        iHeight = getHeight();
                    }
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
        } else {
            height = getHeight() - iHeight;
            iHeight = getHeight();
        }
        if (this.this$0.tabSelectedIndicator.getBounds().width() > 0) {
            Rect bounds = this.this$0.tabSelectedIndicator.getBounds();
            this.this$0.tabSelectedIndicator.setBounds(bounds.left, height, bounds.right, iHeight);
            C19U1 c19u1 = this.this$0;
            Drawable drawable = c19u1.tabSelectedIndicator;
            int i2 = c19u1.tabSelectedIndicatorColor;
            if (i2 != 0) {
                C16GF.LJI(drawable, i2);
            }
            drawable.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
    }

    public void setSelectedIndicatorHeight(int i) {
        Rect bounds = this.this$0.tabSelectedIndicator.getBounds();
        this.this$0.tabSelectedIndicator.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19U2(C19U1 c19u1, Context context) {
        super(context);
        this.this$0 = c19u1;
        this.selectedPosition = -1;
        this.layoutDirection = -1;
        setWillNotDraw(false);
    }

    public void animateIndicatorToPosition(int i, int i2) {
        ValueAnimator valueAnimator = this.indicatorAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.indicatorAnimator.cancel();
        }
        updateOrRecreateIndicatorAnimation(true, i, i2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        C19U1 c19u1 = this.this$0;
        if (c19u1.tabGravity == 1 || c19u1.mode == 2) {
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
                C19U1 c19u12 = this.this$0;
                c19u12.tabGravity = 0;
                c19u12.updateTabViews(false);
            }
            super.onMeasure(i, i2);
        }
    }

    public void setIndicatorPositionFromTabPosition(int i, float f) {
        ValueAnimator valueAnimator = this.indicatorAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.indicatorAnimator.cancel();
        }
        this.selectedPosition = i;
        this.selectionOffset = f;
        tweenIndicatorPosition(getChildAt(i), getChildAt(this.selectedPosition + 1), this.selectionOffset);
    }

    private void updateOrRecreateIndicatorAnimation(boolean z, final int i, int i2) {
        final View childAt = getChildAt(this.selectedPosition);
        final View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            jumpIndicatorToSelectedPosition();
            return;
        }
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: X.19UB
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.LLILLL.tweenIndicatorPosition(childAt, childAt2, valueAnimator.getAnimatedFraction());
            }
        };
        if (z) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.indicatorAnimator = valueAnimator;
            valueAnimator.setInterpolator(C194V.LIZIZ);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(animatorUpdateListener);
            valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: X.19UC
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    this.LLILLJJLI.selectedPosition = i;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    this.LLILLJJLI.selectedPosition = i;
                }
            });
            valueAnimator.start();
            return;
        }
        this.indicatorAnimator.removeAllUpdateListeners();
        this.indicatorAnimator.addUpdateListener(animatorUpdateListener);
    }

    public void tweenIndicatorPosition(View view, View view2, float f) {
        if (view != null && view.getWidth() > 0) {
            C19U1 c19u1 = this.this$0;
            c19u1.tabIndicatorInterpolator.LIZIZ(c19u1, view, view2, f, c19u1.tabSelectedIndicator);
        } else {
            Drawable drawable = this.this$0.tabSelectedIndicator;
            drawable.setBounds(-1, drawable.getBounds().top, -1, this.this$0.tabSelectedIndicator.getBounds().bottom);
        }
        postInvalidateOnAnimation();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.indicatorAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            updateOrRecreateIndicatorAnimation(false, this.selectedPosition, -1);
        } else {
            jumpIndicatorToSelectedPosition();
        }
    }
}
