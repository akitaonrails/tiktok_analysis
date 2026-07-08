package X;

import Y.ARunnableS135S0100000_35;
import android.animation.Animator;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.1Ded, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261011Ded extends C2261051Deh {
    public Animator LIZLLL;

    @Override // X.AbstractC2260961DeY
    public final void LIZIZ() {
        this.LIZ.LIZJ("popupbadge");
        ARunnableS135S0100000_35 aRunnableS135S0100000_35 = new ARunnableS135S0100000_35(this, 32);
        this.LIZIZ = aRunnableS135S0100000_35;
        HandlerHook.viewPost(this.LIZ.LIZ, aRunnableS135S0100000_35);
    }

    @Override // X.AbstractC2260961DeY
    public final void LJ() {
        Animator animator = this.LIZJ;
        if (animator != null) {
            animator.cancel();
        }
        LJI(null);
        Animator animator2 = this.LIZLLL;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.LIZLLL = null;
    }

    public C2261011Ded(C2260931DeV c2260931DeV) {
        super(c2260931DeV);
    }
}
