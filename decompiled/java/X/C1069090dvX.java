package X;

import Y.ARunnableS116S0100000_16;
import android.view.VelocityTracker;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0dvX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1069090dvX {
    public final Function0<FrameLayout> LIZ;
    public final Function0<LinearLayout> LIZIZ;
    public final Function0<WebView> LIZJ;
    public final Function0<C1035880d3y> LIZLLL;
    public final Function0<Boolean> LJ;
    public final Function0<Integer> LJFF;
    public final Function0<Boolean> LJI;
    public final Function0<Unit> LJII;
    public final Function0<Boolean> LJIIIIZZ;
    public final Function0<Unit> LJIIIZ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public float LJIJ;
    public float LJIJI;
    public VelocityTracker LJIJJ;
    public boolean LJIJJLI;
    public int LJIL;
    public boolean LJJII;
    public EnumC1069130dvb LJIIJ = EnumC1069130dvb.DISABLED;
    public final ARunnableS116S0100000_16 LJJ = new ARunnableS116S0100000_16(this, 238);
    public final ARunnableS116S0100000_16 LJJI = new ARunnableS116S0100000_16(this, 241);
    public final ARunnableS116S0100000_16 LJJIFFI = new ARunnableS116S0100000_16(this, 239);
    public final float LJIIZILJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    public final float LJIILJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
    public final float LJIILL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
    public final float LJIILLIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));

    public final void LIZIZ() {
        FrameLayout frameLayoutInvoke = this.LIZ.invoke();
        if (frameLayoutInvoke != null) {
            HandlerHook.viewRemoveCallbacks(frameLayoutInvoke, this.LJJ);
        }
        FrameLayout frameLayoutInvoke2 = this.LIZ.invoke();
        if (frameLayoutInvoke2 != null) {
            HandlerHook.viewRemoveCallbacks(frameLayoutInvoke2, this.LJJI);
        }
        this.LJJII = false;
        this.LJIIJ = EnumC1069130dvb.DISABLED;
        LinearLayout linearLayoutInvoke = this.LIZIZ.invoke();
        if (linearLayoutInvoke == null || !this.LJIIJJI) {
            LIZLLL();
        } else {
            if (this.LJIIL) {
                return;
            }
            this.LJIIL = true;
            linearLayoutInvoke.animate().cancel();
            linearLayoutInvoke.animate().translationY(-this.LJIILJJIL).alpha(0.0f).setDuration(300L).setInterpolator(C1619980sG4.LJIIJJI()).withEndAction(new ARunnableS116S0100000_16(this, 237)).start();
        }
    }

    public final void LIZJ() {
        C1035880d3y c1035880d3yInvoke;
        if (this.LIZJ.invoke() == null || (c1035880d3yInvoke = this.LIZLLL.invoke()) == null) {
            return;
        }
        c1035880d3yInvoke.setPullRefreshCssProbeReady(false);
        LJ(false);
    }

    public final void LIZLLL() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        FrameLayout frameLayoutInvoke = this.LIZ.invoke();
        if (frameLayoutInvoke != null) {
            HandlerHook.viewRemoveCallbacks(frameLayoutInvoke, this.LJJ);
        }
        FrameLayout frameLayoutInvoke2 = this.LIZ.invoke();
        if (frameLayoutInvoke2 != null) {
            HandlerHook.viewRemoveCallbacks(frameLayoutInvoke2, this.LJJIFFI);
        }
        if (this.LJJII) {
            FrameLayout frameLayoutInvoke3 = this.LIZ.invoke();
            if (frameLayoutInvoke3 != null) {
                C786410Ut5.LJZ(0, frameLayoutInvoke3);
            }
            this.LJIIJJI = true;
            this.LJIIL = false;
            LinearLayout linearLayoutInvoke = this.LIZIZ.invoke();
            if (linearLayoutInvoke != null) {
                C786410Ut5.W4(linearLayoutInvoke, 1.0f);
            }
            this.LJIIJ = EnumC1069130dvb.ENABLED;
            return;
        }
        this.LJIJJLI = false;
        VelocityTracker velocityTracker = this.LJIJJ;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.LJIJJ = null;
        this.LJIIJ = EnumC1069130dvb.DISABLED;
        this.LJIIJJI = false;
        this.LJIIL = false;
        FrameLayout frameLayoutInvoke4 = this.LIZ.invoke();
        if (frameLayoutInvoke4 != null) {
            C786410Ut5.LJZ(8, frameLayoutInvoke4);
        }
        LinearLayout linearLayoutInvoke2 = this.LIZIZ.invoke();
        if (linearLayoutInvoke2 != null && (viewPropertyAnimatorAnimate = linearLayoutInvoke2.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        LinearLayout linearLayoutInvoke3 = this.LIZIZ.invoke();
        if (linearLayoutInvoke3 != null) {
            C786410Ut5.hd(linearLayoutInvoke3, -this.LJIILJJIL);
        }
        LinearLayout linearLayoutInvoke4 = this.LIZIZ.invoke();
        if (linearLayoutInvoke4 != null) {
            C786410Ut5.W4(linearLayoutInvoke4, 0.0f);
        }
    }

    public final void LJI() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iIntValue = this.LJFF.invoke().intValue();
        if (this.LJIL == iIntValue) {
            return;
        }
        this.LJIL = iIntValue;
        FrameLayout frameLayoutInvoke = this.LIZ.invoke();
        ViewGroup.LayoutParams layoutParams = frameLayoutInvoke != null ? frameLayoutInvoke.getLayoutParams() : null;
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return;
        }
        marginLayoutParams.topMargin = iIntValue;
        FrameLayout frameLayoutInvoke2 = this.LIZ.invoke();
        if (frameLayoutInvoke2 != null) {
            C786410Ut5.a6(frameLayoutInvoke2, marginLayoutParams);
        }
    }

    public final void LIZ(Integer num) {
        FrameLayout frameLayoutInvoke = this.LIZ.invoke();
        if (frameLayoutInvoke != null) {
            HandlerHook.viewRemoveCallbacks(frameLayoutInvoke, this.LJJ);
        }
        FrameLayout frameLayoutInvoke2 = this.LIZ.invoke();
        if (frameLayoutInvoke2 != null) {
            HandlerHook.viewRemoveCallbacks(frameLayoutInvoke2, this.LJJI);
        }
        FrameLayout frameLayoutInvoke3 = this.LIZ.invoke();
        if (frameLayoutInvoke3 != null) {
            HandlerHook.viewRemoveCallbacks(frameLayoutInvoke3, this.LJJIFFI);
        }
        this.LJIIJ = EnumC1069130dvb.DISABLED;
        LinearLayout linearLayoutInvoke = this.LIZIZ.invoke();
        if (linearLayoutInvoke != null && this.LJIIJJI) {
            if (this.LJIIL) {
                return;
            }
            this.LJIIL = true;
            linearLayoutInvoke.animate().cancel();
            linearLayoutInvoke.animate().translationY(-this.LJIILJJIL).alpha(0.0f).setDuration(300L).setInterpolator(C1619980sG4.LJIIJJI()).withEndAction(new ARunnableS116S0100000_16(this, 236)).start();
            if (num != null) {
                num.intValue();
                this.LJII.invoke();
                return;
            }
            return;
        }
        LIZLLL();
    }

    public final void LJ(boolean z) {
        this.LJIILIIL = z;
        C1035880d3y c1035880d3yInvoke = this.LIZLLL.invoke();
        if (c1035880d3yInvoke != null) {
            c1035880d3yInvoke.setPullRefreshCssSuppressed(z);
        }
        C1035880d3y c1035880d3yInvoke2 = this.LIZLLL.invoke();
        if (c1035880d3yInvoke2 != null) {
            c1035880d3yInvoke2.setPullRefreshCssProbeReady(true);
        }
        if (z) {
            LIZLLL();
        }
    }

    public final void LJFF(boolean z) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        if (z) {
            if (this.LJIIJJI) {
                this.LJJII = true;
                this.LJIIJ = EnumC1069130dvb.ENABLED;
                this.LJIIJJI = true;
                this.LJIIL = false;
                FrameLayout frameLayoutInvoke = this.LIZ.invoke();
                if (frameLayoutInvoke != null) {
                    C786410Ut5.LJZ(0, frameLayoutInvoke);
                }
                LinearLayout linearLayoutInvoke = this.LIZIZ.invoke();
                if (linearLayoutInvoke != null && (viewPropertyAnimatorAnimate = linearLayoutInvoke.animate()) != null) {
                    viewPropertyAnimatorAnimate.cancel();
                }
                LinearLayout linearLayoutInvoke2 = this.LIZIZ.invoke();
                if (linearLayoutInvoke2 != null) {
                    C786410Ut5.W4(linearLayoutInvoke2, 1.0f);
                }
                FrameLayout frameLayoutInvoke2 = this.LIZ.invoke();
                if (frameLayoutInvoke2 != null) {
                    HandlerHook.viewRemoveCallbacks(frameLayoutInvoke2, this.LJJI);
                }
                FrameLayout frameLayoutInvoke3 = this.LIZ.invoke();
                if (frameLayoutInvoke3 != null) {
                    HandlerHook.viewPostDelay(frameLayoutInvoke3, this.LJJI, 7500L);
                    return;
                }
                return;
            }
            this.LJJII = true;
            return;
        }
        this.LJJII = false;
        if (this.LJIIL) {
            return;
        }
        if (this.LJIIJJI) {
            LIZIZ();
        } else {
            LIZLLL();
        }
    }

    public C1069090dvX(AwS560S0100000_16 awS560S0100000_16, AwS560S0100000_16 awS560S0100000_162, AwS560S0100000_16 awS560S0100000_163, AwS560S0100000_16 awS560S0100000_164, AwS560S0100000_16 awS560S0100000_165, AwS417S0200000_16 awS417S0200000_16, AwS560S0100000_16 awS560S0100000_166, AwS560S0100000_16 awS560S0100000_167, AwS560S0100000_16 awS560S0100000_168, AwS560S0100000_16 awS560S0100000_169) {
        this.LIZ = awS560S0100000_16;
        this.LIZIZ = awS560S0100000_162;
        this.LIZJ = awS560S0100000_163;
        this.LIZLLL = awS560S0100000_164;
        this.LJ = awS560S0100000_165;
        this.LJFF = awS417S0200000_16;
        this.LJI = awS560S0100000_166;
        this.LJII = awS560S0100000_167;
        this.LJIIIIZZ = awS560S0100000_168;
        this.LJIIIZ = awS560S0100000_169;
        LJI();
        LIZLLL();
    }
}
