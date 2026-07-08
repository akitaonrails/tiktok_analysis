package X;

import Y.ALAdapterS26S0200000_32;
import Y.AUListenerS279S0100000_32;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.191C, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C191C implements Cloneable {
    public View LL;
    public View LLILLJJLI;
    public View LLILLL;
    public InterpolatorC448120Hhi LLILZ;

    public abstract void LIZIZ(boolean z);

    public abstract C191E LIZJ(boolean z);

    public void LJ(View view) {
    }

    public void LJFF(View view) {
    }

    public final Object clone() {
        try {
            C191C c191c = (C191C) super.clone();
            c191c.LL = null;
            c191c.LLILLJJLI = null;
            c191c.LLILLL = null;
            return c191c;
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public Animator LIZLLL(boolean z) {
        C191E c191eLIZJ = LIZJ(z);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS279S0100000_32(c191eLIZJ, 4));
        valueAnimatorOfFloat.addListener(new ALAdapterS26S0200000_32(this, c191eLIZJ, 0));
        InterpolatorC448120Hhi interpolatorC448120Hhi = this.LLILZ;
        if (interpolatorC448120Hhi != null) {
            valueAnimatorOfFloat.setInterpolator(interpolatorC448120Hhi);
        }
        return valueAnimatorOfFloat;
    }

    public void LIZ(View view, View view2, View view3) {
        if (view3 != null) {
            this.LL = view;
            this.LLILLJJLI = view2;
            this.LLILLL = view3;
            return;
        }
        throw new IllegalArgumentException("animationView cant be null");
    }
}
