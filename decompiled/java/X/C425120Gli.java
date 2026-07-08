package X;

import Y.ARunnableS104S0100000_4;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import defpackage.r1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Gli, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425120Gli extends FrameLayout {
    public Rect LL;
    public Function2<? super EnumC452820HpI, ? super Float, Unit> LLILLJJLI;
    public EnumC452820HpI LLILLL;
    public final TuxIconView LLILZ;
    public final TuxIconView LLILZIL;

    public final Function2<EnumC452820HpI, Float, Unit> getOnRequestRestore() {
        return this.LLILLJJLI;
    }

    public final Rect getSafeArea() {
        return this.LL;
    }

    public final EnumC452820HpI getSettledEdge() {
        return this.LLILLL;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    return true;
                }
                return super.onTouchEvent(motionEvent);
            }
            float y = getY() + (getHeight() / 2.0f);
            if (getVisibility() == 0) {
                clearAnimation();
                ViewPropertyAnimator viewPropertyAnimatorAlpha = animate().alpha(0.0f);
                long j = r1.LIZ().notchAnimationDurationMs;
                if (j < 0) {
                    j = 0;
                }
                viewPropertyAnimatorAlpha.setDuration(j).setInterpolator(new AccelerateInterpolator()).withEndAction(new ARunnableS104S0100000_4(this, 150)).start();
            }
            Function2<? super EnumC452820HpI, ? super Float, Unit> function2 = this.LLILLJJLI;
            if (function2 != null) {
                function2.invoke(this.LLILLL, Float.valueOf(y));
            }
            return true;
        }
        motionEvent.getRawX();
        motionEvent.getRawY();
        return true;
    }

    public final void setOnRequestRestore(Function2<? super EnumC452820HpI, ? super Float, Unit> function2) {
        this.LLILLJJLI = function2;
    }

    public final void setSafeArea(Rect rect) {
        this.LL = rect;
    }

    public C425120Gli(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLL = EnumC452820HpI.RIGHT;
        FrameLayout.inflate(context, R.layout.btj, this);
        this.LLILZ = (TuxIconView) findViewById(R.id.gfj);
        this.LLILZIL = (TuxIconView) findViewById(R.id.gfk);
    }

    public final void LIZ(EnumC452820HpI enumC452820HpI, float f) {
        View view;
        FrameLayout.LayoutParams layoutParams;
        int i;
        int i2;
        this.LLILLL = enumC452820HpI;
        Object parent = getParent();
        if (parent instanceof ViewGroup) {
            view = (View) parent;
        } else {
            view = null;
        }
        if (view != null) {
            Rect rect = this.LL;
            if (rect == null) {
                rect = new Rect(0, 0, view.getWidth(), view.getHeight());
            }
            float fLIZLLL = C13LZ.LIZLLL(f, rect.top + (getHeight() / 2.0f), rect.bottom - (getHeight() / 2.0f));
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if (!(layoutParams2 instanceof FrameLayout.LayoutParams) || (layoutParams = (FrameLayout.LayoutParams) layoutParams2) == null) {
                ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
                int i3 = -2;
                if (layoutParams3 != null) {
                    i = layoutParams3.width;
                } else {
                    i = -2;
                }
                ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
                if (layoutParams4 != null) {
                    i3 = layoutParams4.height;
                }
                layoutParams = new FrameLayout.LayoutParams(i, i3);
            }
            int i4 = C425130Glj.LIZ[enumC452820HpI.ordinal()];
            if (i4 != 1 && i4 == 2) {
                i2 = 8388613;
            } else {
                i2 = 8388611;
            }
            layoutParams.gravity = i2 | 48;
            layoutParams.topMargin = (int) (fLIZLLL - (getHeight() / 2.0f));
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams);
        }
        int i5 = C425130Glj.LIZ[enumC452820HpI.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                setBackgroundResource(R.drawable.b7a);
            } else {
                setBackgroundResource(R.drawable.b7a);
                C786410Ut5.LLLLLLZZ(this.LLILZ, 0);
                C786410Ut5.LLLLLLZZ(this.LLILZIL, 8);
            }
        } else {
            setBackgroundResource(R.drawable.b7_);
            C786410Ut5.LLLLLLZZ(this.LLILZ, 8);
            C786410Ut5.LLLLLLZZ(this.LLILZIL, 0);
        }
        clearAnimation();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(0.0f);
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        ViewPropertyAnimator viewPropertyAnimatorAlpha = animate().alpha(1.0f);
        long j = r1.LIZ().notchAnimationDurationMs;
        if (j < 0) {
            j = 0;
        }
        viewPropertyAnimatorAlpha.setDuration(j).setInterpolator(new AccelerateInterpolator()).start();
    }
}
