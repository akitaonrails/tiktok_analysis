package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0zXT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C1899850zXT extends FrameLayout {
    public final Context LL;
    public float LLILLJJLI;
    public View LLILLL;
    public InterfaceC1899870zXV LLILZ;
    public VelocityTracker LLILZIL;
    public ObjectAnimator LLILZLL;
    public InterfaceC1898670zVZ LLIZ;
    public final Boolean LLIZLLLIL;

    public void setAnimationListener(InterfaceC1899880zXW interfaceC1899880zXW) {
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
        InterfaceC1898670zVZ interfaceC1898670zVZ = this.LLIZ;
        if (interfaceC1898670zVZ != null) {
            interfaceC1898670zVZ.onTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (motionEvent.getAction() == 0) {
                this.LLILLJJLI = motionEvent.getY();
                return false;
            }
            if (motionEvent.getAction() != 2) {
                return false;
            }
            if (this.LLIZLLLIL.booleanValue()) {
                if (Math.abs(this.LLILLJJLI - motionEvent.getY()) <= 3.0f || this.LLILLJJLI - motionEvent.getY() <= ViewConfiguration.get(this.LL).getScaledTouchSlop() - C12ES.LJIIJJI(this.LL)) {
                    return false;
                }
            } else if (this.LLILLJJLI - motionEvent.getY() <= ViewConfiguration.get(this.LL).getScaledTouchSlop()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.LLILZIL.addMovement(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.LLILLJJLI = motionEvent.getY();
        }
        boolean z = false;
        if (motionEvent.getAction() == 2) {
            View view = this.LLILLL;
            if ((view == null || view.getTranslationY() <= 0.0f) && !onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            C786410Ut5.ed(this.LLILLL, (int) Math.min(0.0f, motionEvent.getY() - this.LLILLJJLI));
        } else if (motionEvent.getAction() == 1) {
            float translationY = this.LLILLL.getTranslationY();
            if (Math.abs(this.LLILLL.getTranslationY() / this.LLILLL.getHeight()) > 0.3f) {
                z = true;
            }
            LIZ(translationY, z);
            return true;
        }
        return true;
    }

    public void setInternalTouchEventListener(InterfaceC1898670zVZ interfaceC1898670zVZ) {
        this.LLIZ = interfaceC1898670zVZ;
    }

    public void setPullUpListener(InterfaceC1899870zXV interfaceC1899870zXV) {
        this.LLILZ = interfaceC1899870zXV;
    }

    public C1899850zXT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIZLLLIL = Boolean.FALSE;
        this.LL = context;
        this.LLILZIL = VelocityTracker.obtain();
        C1879340z0O c1879340z0OLIZ = C1619720sFe.LIZ.LIZ(6);
        if (c1879340z0OLIZ instanceof C1898650zVX) {
            this.LLIZLLLIL = Boolean.valueOf(((C1898650zVX) c1879340z0OLIZ).LIZJ());
        }
    }

    public final void LIZ(float f, final boolean z) {
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
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: X.0zXU
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    this.LLILLJJLI.getClass();
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    InterfaceC1899870zXV interfaceC1899870zXV = this.LLILLJJLI.LLILZ;
                    if (interfaceC1899870zXV != null) {
                        if (z) {
                            interfaceC1899870zXV.LIZIZ();
                        } else {
                            interfaceC1899870zXV.LIZ();
                        }
                    }
                    this.LLILLJJLI.getClass();
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    this.LLILLJJLI.getClass();
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    this.LLILLJJLI.getClass();
                }
            });
            animatorSet.start();
        }
    }
}
