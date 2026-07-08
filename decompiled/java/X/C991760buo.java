package X;

import Y.ALAdapterS12S0100000_16;
import Y.ARunnableS116S0100000_16;
import Y.AUListenerS265S0100000_16;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import nv7.c0;

/* JADX INFO: renamed from: X.0buo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991760buo implements Animator.AnimatorListener {
    public final ViewGroup LL;
    public final EnumC992040bvG LLILLJJLI;
    public final C1295960jpS LLILLL;
    public ValueAnimator LLILZ;
    public final long LLILZIL;
    public final float LLILZLL;
    public final long LLIZ;
    public final long LLIZLLLIL;
    public final long LLJ;
    public float LLJI;
    public Function2<? super Float, ? super Float, Unit> LLJIJIL;
    public Function0<Unit> LLJILJIL;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public final void LIZ() {
        int i = C991770bup.LIZ[this.LLILLJJLI.ordinal()];
        if (i == 1) {
            C1637780sim c1637780sim = C1651690t5D.LIZ;
            if (c1637780sim.LIZIZ == null) {
                c1637780sim.LIZIZ = c1637780sim.LIZ.edit();
            }
            c1637780sim.LIZIZ.putBoolean("duet_layout_up_down_drag_gesture_hint", false).apply();
            return;
        }
        if (i == 2) {
            C1637780sim c1637780sim2 = C1651690t5D.LIZ;
            if (c1637780sim2.LIZIZ == null) {
                c1637780sim2.LIZIZ = c1637780sim2.LIZ.edit();
            }
            c1637780sim2.LIZIZ.putBoolean("duet_layout_three_screen_drag_gesture_hint", false).apply();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(this.LLIZLLLIL);
        duration.removeAllUpdateListeners();
        duration.addUpdateListener(new AUListenerS265S0100000_16(this, 23));
        duration.addListener(new ALAdapterS12S0100000_16(this, 9));
        duration.start();
        LIZ();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        this.LLILLL.pauseAnimation();
        HandlerHook.viewPostDelay(this.LLILLL, new ARunnableS116S0100000_16(this, 73), this.LLJ);
    }

    public C991760buo(ViewGroup viewGroup, EnumC992040bvG enumC992040bvG) {
        this.LL = viewGroup;
        this.LLILLJJLI = enumC992040bvG;
        C1295960jpS c1295960jpS = (C1295960jpS) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fuw, viewGroup, false);
        this.LLILLL = c1295960jpS;
        this.LLILZIL = 880L;
        this.LLIZ = 680L;
        this.LLIZLLLIL = 520L;
        this.LLJ = 300L;
        viewGroup.addView(c1295960jpS);
        this.LLILZLL = c0.LIZ.LIZJ();
    }
}
