package X;

import Y.AAListenerS69S0110000_21;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0m1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1380390m1d extends FrameLayout {
    public final Context LL;
    public float LLILLJJLI;
    public View LLILLL;
    public InterfaceC1380420m1g LLILZ;
    public VelocityTracker LLILZIL;
    public ObjectAnimator LLILZLL;
    public InterfaceC1380410m1f LLIZ;

    public void setAnimationListener(InterfaceC1380430m1h interfaceC1380430m1h) {
    }

    public final void LIZIZ() {
        View view = this.LLILLL;
        if (view != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLILLL, "translationY", view.getTranslationY(), 0.0f);
            objectAnimatorOfFloat.setDuration(300L);
            C786410Ut5.Pd(objectAnimatorOfFloat);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLILZIL = VelocityTracker.obtain();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VelocityTracker velocityTracker = this.LLILZIL;
        if (velocityTracker != null) {
            velocityTracker.clear();
            this.LLILZIL.recycle();
            this.LLILZIL = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC1380410m1f interfaceC1380410m1f = this.LLIZ;
        if (interfaceC1380410m1f != null) {
            interfaceC1380410m1f.onTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.LLILLJJLI = motionEvent.getY();
        } else if (motionEvent.getAction() == 2 && this.LLILLJJLI - motionEvent.getY() > ViewConfiguration.get(this.LL).getScaledTouchSlop()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        View view;
        this.LLILZIL.addMovement(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.LLILLJJLI = motionEvent.getY();
        }
        boolean z = false;
        if (motionEvent.getAction() == 2) {
            View view2 = this.LLILLL;
            if (((view2 == null || view2.getTranslationY() <= 0.0f) && !onInterceptTouchEvent(motionEvent)) || this.LLILLL == null) {
                return false;
            }
            C786410Ut5.ed(this.LLILLL, (int) Math.min(0.0f, motionEvent.getY() - this.LLILLJJLI));
        } else if (motionEvent.getAction() == 1 && (view = this.LLILLL) != null) {
            float translationY = view.getTranslationY();
            if (Math.abs(this.LLILLL.getTranslationY() / this.LLILLL.getHeight()) > 0.3f) {
                z = true;
            }
            LIZ(translationY, z);
            return true;
        }
        return true;
    }

    public void setInternalTouchEventListener(InterfaceC1380410m1f interfaceC1380410m1f) {
        this.LLIZ = interfaceC1380410m1f;
    }

    public void setPullUpListener(InterfaceC1380420m1g interfaceC1380420m1g) {
        this.LLILZ = interfaceC1380420m1g;
    }

    public C1380390m1d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void LIZ(float f, boolean z) {
        long jAbs;
        if (this.LLILLL != null) {
            this.LLILZIL.computeCurrentVelocity(2);
            long jAbs2 = 300;
            if (z) {
                if (this.LLILZIL.getYVelocity() != 0.0f) {
                    jAbs = (long) ((this.LLILLL.getHeight() + f) / Math.abs(this.LLILZIL.getYVelocity()));
                } else {
                    jAbs = 300;
                }
                this.LLILZLL = ObjectAnimator.ofFloat(this.LLILLL, "translationY", f, -r8.getHeight());
            } else {
                if (this.LLILZIL.getYVelocity() != 0.0f) {
                    jAbs = (long) (f / Math.abs(this.LLILZIL.getYVelocity()));
                } else {
                    jAbs = 300;
                }
                this.LLILZLL = ObjectAnimator.ofFloat(this.LLILLL, "translationY", f, 0.0f);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            if (Math.abs(jAbs) <= 300) {
                jAbs2 = Math.abs(jAbs);
            }
            animatorSet.setDuration(jAbs2);
            animatorSet.play(this.LLILZLL);
            animatorSet.addListener(new AAListenerS69S0110000_21(this, z, 3));
            animatorSet.start();
        }
    }

    public C1380390m1d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = context;
        this.LLILZIL = VelocityTracker.obtain();
    }
}
