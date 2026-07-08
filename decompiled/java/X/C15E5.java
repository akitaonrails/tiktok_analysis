package X;

import Y.ARunnableS131S0100000_31;
import Y.AUListenerS278S0100000_31;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.VelocityTracker;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15E5, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15E5 extends ConstraintLayout {
    public EnumC1779510wPN LL;
    public EnumC1779510wPN LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public final float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public boolean LLJ;
    public InterfaceC782440Umg LLJI;
    public VelocityTracker LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public boolean LLJILLL;
    public Function1<? super Float, Unit> LLJJ;
    public Function0<Unit> LLJJI;
    public Function0<Boolean> LLJJIII;

    private final ObjectAnimator getForceCloseAnimator() {
        return (ObjectAnimator) this.LLJILJIL.getValue();
    }

    private final ObjectAnimator getForceOpenAnimator() {
        return (ObjectAnimator) this.LLJILJILJ.getValue();
    }

    public final void close() {
        n0();
        C786410Ut5.Pd(getForceCloseAnimator());
    }

    public final void i0() {
        n0();
        C786410Ut5.Pd(getForceOpenAnimator());
    }

    public final void j0() {
        n0();
        getForceOpenAnimator().addListener(new C464420IJc() { // from class: X.15E6
            @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                float f;
                C15E5 c15e5 = this.LL;
                if (c15e5.LLILZ) {
                    f = 1.0f;
                } else {
                    f = -1.0f;
                }
                Function1<Float, Unit> onScrollListener = c15e5.getOnScrollListener();
                if (onScrollListener != null) {
                    onScrollListener.invoke(Float.valueOf(f));
                }
                this.LL.setOnScrollListener(null);
            }
        });
        C786410Ut5.Pd(getForceOpenAnimator());
    }

    public final void n0() {
        if (getForceCloseAnimator().isRunning()) {
            getForceCloseAnimator().cancel();
        }
        if (getForceOpenAnimator().isRunning()) {
            getForceOpenAnimator().cancel();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLJIJIL = VelocityTracker.obtain();
        HandlerHook.viewPost(this, new ARunnableS131S0100000_31(this, 15));
        this.LLILZ = C497740JfY.LJJ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VelocityTracker velocityTracker = this.LLJIJIL;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.LLJIJIL = null;
    }

    public final Function0<Boolean> getOnScrollInterceptor() {
        return this.LLJJIII;
    }

    public final Function1<Float, Unit> getOnScrollListener() {
        return this.LLJJ;
    }

    public final Function0<Unit> getOnSlideBackToMainAfterDrag() {
        return this.LLJJI;
    }

    public final void h0(long j) {
        Unit unit;
        if (this.LLILLJJLI == EnumC1779510wPN.LLILLL) {
            try {
                Function0<Unit> function0 = this.LLJJI;
                if (function0 != null) {
                    function0.invoke();
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        e0(j, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l0(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15E5.l0(android.view.MotionEvent):boolean");
    }

    public final void setDownTouched(boolean z) {
        this.LLJILLL = z;
    }

    public final void setGestureDetectLayout(InterfaceC782440Umg interfaceC782440Umg) {
        this.LLJI = interfaceC782440Umg;
    }

    public final void setOnScrollInterceptor(Function0<Boolean> function0) {
        this.LLJJIII = function0;
    }

    public final void setOnScrollListener(Function1<? super Float, Unit> function1) {
        this.LLJJ = function1;
    }

    public final void setOnSlideBackToMainAfterDrag(Function0<Unit> function0) {
        this.LLJJI = function0;
    }

    public C15E5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void e0(long j, boolean z) {
        final float f;
        EnumC1779510wPN enumC1779510wPN = this.LL;
        EnumC1779510wPN enumC1779510wPN2 = EnumC1779510wPN.LLILLL;
        if (enumC1779510wPN == enumC1779510wPN2) {
            return;
        }
        if (this.LLILZ) {
            f = this.LLILZIL;
        } else {
            f = -this.LLILZIL;
        }
        if (z) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(this, (Property<C15E5, Float>) View.TRANSLATION_X, f).setDuration(j);
            duration.addUpdateListener(new AUListenerS278S0100000_31(this, 17));
            duration.addListener(new C464420IJc() { // from class: X.15E9
                @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Function1<Float, Unit> onScrollListener = this.LL.getOnScrollListener();
                    if (onScrollListener != null) {
                        onScrollListener.invoke(Float.valueOf(f));
                    }
                }
            });
            C786410Ut5.Pd(duration);
        } else {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setTranslationX(f);
            Function1<? super Float, Unit> function1 = this.LLJJ;
            if (function1 != null) {
                function1.invoke(Float.valueOf(getTranslationX()));
            }
        }
        this.LL = enumC1779510wPN2;
        this.LLJ = false;
        this.LLJILLL = false;
    }

    public final void p0(long j, boolean z) {
        EnumC1779510wPN enumC1779510wPN = this.LL;
        EnumC1779510wPN enumC1779510wPN2 = EnumC1779510wPN.LL;
        if (enumC1779510wPN == enumC1779510wPN2) {
            return;
        }
        if (z) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(this, (Property<C15E5, Float>) View.TRANSLATION_X, 0.0f).setDuration(j);
            duration.addUpdateListener(new AUListenerS278S0100000_31(this, 18));
            duration.addListener(new C464420IJc() { // from class: X.15EA
                @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Function1<Float, Unit> onScrollListener = this.LL.getOnScrollListener();
                    if (onScrollListener != null) {
                        onScrollListener.invoke(Float.valueOf(0.0f));
                    }
                }
            });
            C786410Ut5.Pd(duration);
        } else {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setTranslationX(0.0f);
            Function1<? super Float, Unit> function1 = this.LLJJ;
            if (function1 != null) {
                function1.invoke(Float.valueOf(getTranslationX()));
            }
        }
        this.LL = enumC1779510wPN2;
    }

    public C15E5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        EnumC1779510wPN enumC1779510wPN = EnumC1779510wPN.LLILLL;
        this.LL = enumC1779510wPN;
        this.LLILLJJLI = enumC1779510wPN;
        this.LLILZIL = C497740JfY.LJIIZILJ();
        this.LLJILJIL = C292401Bi.LIZ(new AwS575S0100000_31(this, 86));
        this.LLJILJILJ = C292401Bi.LIZ(new AwS575S0100000_31(this, 87));
    }
}
