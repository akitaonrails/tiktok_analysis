package X;

import Y.ALAdapterS28S0100000_35;
import android.animation.Animator;

/* JADX INFO: renamed from: X.1Deh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2261051Deh extends AbstractC2260961DeY {
    public Animator LIZJ;

    @Override // X.AbstractC2260961DeY
    public void LIZLLL() {
        Animator animator = this.LIZJ;
        if (animator != null) {
            animator.pause();
        }
    }

    @Override // X.AbstractC2260961DeY
    public void LJFF() {
        Animator animator = this.LIZJ;
        if (animator != null) {
            animator.resume();
        }
    }

    public C2261051Deh(C2260931DeV c2260931DeV) {
        super(c2260931DeV);
    }

    public final void LJI(Animator animator) {
        this.LIZJ = animator;
        if (animator != null) {
            animator.addListener(new ALAdapterS28S0100000_35(this, 5));
        }
    }
}
