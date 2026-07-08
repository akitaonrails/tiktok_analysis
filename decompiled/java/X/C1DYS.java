package X;

import Y.ALAdapterS28S0100000_35;
import Y.ARunnableS135S0100000_35;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.1DYS, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DYS {
    public final View LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public float LIZLLL;
    public float LJ = 1.0f;
    public float LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public Animator LJIIIZ;
    public final ALAdapterS28S0100000_35 LJIIJ;
    public final C12DM LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public final C01GW LJIILL;
    public final C01GW LJIILLIIL;
    public final ARunnableS135S0100000_35 LJIIZILJ;
    public EnumC1159870gHx LJIJ;
    public final LinearInterpolator LJIJI;

    public final void LIZ() {
        if (this.LJIJ == EnumC1159870gHx.LLILLJJLI) {
            HandlerHook.viewRemoveCallbacks(this.LIZ, this.LJIIZILJ);
            Animator animator = this.LJIIIZ;
            if (animator != null) {
                animator.cancel();
            }
            ValueAnimator valueAnimator = (ValueAnimator) this.LJIILL.getValue();
            valueAnimator.setFloatValues(this.LJFF, this.LJII);
            float f = this.LIZLLL;
            float f2 = this.LJFF;
            float f3 = this.LJII;
            LIZIZ(valueAnimator, f3 == f2 ? 0.0f : (f - f2) / (f3 - f2));
            this.LJIIIZ = valueAnimator;
        }
    }

    public final void LIZIZ(ValueAnimator valueAnimator, float f) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        valueAnimator.setInterpolator(this.LJIJI);
        valueAnimator.setCurrentFraction(f);
        valueAnimator.setInterpolator(interpolator);
        valueAnimator.start();
    }

    public C1DYS(View view, boolean z, boolean z2) {
        float f;
        this.LIZ = view;
        this.LIZIZ = z;
        this.LIZJ = z2;
        if (z) {
            f = 0.5f;
        } else {
            f = -0.5f;
        }
        this.LJII = f;
        this.LJIIIIZZ = z ? 1.0f : -1.0f;
        this.LJIIJ = new ALAdapterS28S0100000_35(this, 2);
        this.LJIIJJI = new C12DM();
        this.LJIIL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 373));
        this.LJIILIIL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 372));
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 371));
        this.LJIILL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 369));
        this.LJIILLIIL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 370));
        this.LJIIZILJ = new ARunnableS135S0100000_35(this, 29);
        this.LJIJ = EnumC1159870gHx.LL;
        this.LJIJI = new LinearInterpolator();
    }
}
