package X;

import Y.ARunnableS120S0100000_20;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Typeface;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kuL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1337430kuL implements InterfaceC20482815Cw {
    public View LIZ;
    public AnimatorSet LIZIZ;
    public boolean LIZJ;
    public Function0<Unit> LIZLLL;
    public AnimatorSet LJFF;
    public boolean LJII;
    public Object LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public long LJIILLIIL;
    public boolean LJIIZILJ;
    public final BPEAHandler LJ = new BPEAHandler(Looper.getMainLooper());
    public float LJI = 28.0f;
    public final int LJIIIIZZ = 900;
    public final float LJIIIZ = 17.0f;
    public final float LJIIJ = 1.0f;
    public final float LJIIJJI = -6.0f;
    public final int LJIIL = 100;

    @Override // X.InterfaceC20482815Cw
    public abstract long LJFF();

    public final Typeface LJIIJJI() {
        return C1697580uHE.LIZIZ(0.0f, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, null, this.LJIIJJI, this.LJIIL, null, 144);
    }

    public abstract void LJIILIIL();

    public abstract void LJIILJJIL();

    @Override // X.InterfaceC20482815Cw
    public final void LJII() {
        AnimatorSet animatorSet = this.LIZIZ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LIZJ = true;
        LJIILIIL();
        if (this.LJIIZILJ) {
            return;
        }
        Object obj = this.LJIILIIL;
        LJFF();
        C15CY.LJIILJJIL(obj, SystemClock.uptimeMillis() - this.LJIILLIIL, "others", this.LJIILJJIL, this.LJIILL);
        this.LJIIZILJ = true;
    }

    public final void LJIIIZ() {
        C786410Ut5.LJLIIL(30L, this.LJ, new ARunnableS120S0100000_20(this, 255));
    }

    public final void LJIIL() {
        C20441214yg.LIZIZ("WeakContainerComponent", "finalizeToEndState()");
        try {
            AnimatorSet animatorSet = this.LIZIZ;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            AnimatorSet animatorSet2 = this.LJFF;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        this.LJFF = null;
        this.LJ.removeCallbacksAndMessages(null);
        LJIILIIL();
        View view = this.LIZ;
        if (view != null) {
            C786410Ut5.T4(view, 1.0f);
            C786410Ut5.LJLLLLLL(0, view);
        }
        this.LIZJ = true;
    }

    @Override // X.InterfaceC20482815Cw
    public final void release() {
        AnimatorSet animatorSet = this.LIZIZ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LIZJ = true;
        if (!this.LJIIZILJ && this.LJIILLIIL > 0) {
            try {
                Object obj = this.LJIILIIL;
                LJFF();
                C15CY.LJIILJJIL(obj, SystemClock.uptimeMillis() - this.LJIILLIIL, "others", this.LJIILJJIL, this.LJIILL);
                this.LJIIZILJ = true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LIZIZ = null;
        this.LIZ = null;
        this.LIZLLL = null;
        this.LJ.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC20482815Cw
    public void LJI() {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            LJIIL();
        } else {
            C786410Ut5.LJJZZIII(this.LJ, new ARunnableS120S0100000_20(this, 256));
        }
    }

    @Override // X.InterfaceC20482815Cw
    public final boolean LIZJ() {
        return this.LIZJ;
    }

    public static AnimatorSet LJIIJ(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 110.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(250L);
        objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LIZLLL());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        return animatorSet;
    }

    @Override // X.InterfaceC20482815Cw
    public final void LJ(AwS432S0200000_31 awS432S0200000_31) {
        this.LIZLLL = awS432S0200000_31;
        this.LIZJ = false;
        this.LJIILLIIL = SystemClock.uptimeMillis();
        this.LJIIZILJ = false;
        LJIILJJIL();
    }

    @Override // X.InterfaceC20482815Cw
    public void LIZIZ(int i, int i2, Object obj) {
        this.LJIILIIL = obj;
        int i3 = i + 1;
        this.LJIILJJIL = i3;
        this.LJIILL = i3 + i2;
    }
}
