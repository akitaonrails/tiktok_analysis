package X;

import Y.ALAdapterS5S0210000_32;
import Y.AUListenerS279S0100000_32;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.190y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC214710190y implements Cloneable {
    public View LL;
    public ViewGroup LLILLJJLI;
    public long LLILLL = 300;

    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final AbstractC214710190y clone() {
        try {
            AbstractC214710190y abstractC214710190y = (AbstractC214710190y) super.clone();
            abstractC214710190y.LL = null;
            return abstractC214710190y;
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public abstract C191E LIZJ(boolean z);

    public abstract void LJ(boolean z);

    public final Animator LIZLLL(boolean z) {
        C191E c191eLIZJ = LIZJ(z);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS279S0100000_32(c191eLIZJ, 17));
        valueAnimatorOfFloat.addListener(new ALAdapterS5S0210000_32(this, c191eLIZJ, z, 2));
        valueAnimatorOfFloat.setDuration(this.LLILLL);
        return valueAnimatorOfFloat;
    }

    public void LIZ(View view, ViewGroup viewGroup) {
        this.LL = view;
        this.LLILLJJLI = viewGroup;
    }
}
