package Y;

import X.AnonymousClass1853;
import X.AnonymousClass1855;
import X.C212219183d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes33.dex */
public class ALAdapterS5S0101000_32 extends AnimatorListenerAdapter {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator, z);
                break;
            case 1:
                onAnimationEnd$1(this, animator, z);
                break;
            case 2:
                onAnimationEnd$2(this, animator, z);
                break;
            default:
                super.onAnimationEnd(animator, z);
                break;
        }
    }

    public ALAdapterS5S0101000_32(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }

    public static final void onAnimationEnd$0(ALAdapterS5S0101000_32 aLAdapterS5S0101000_32, Animator animator, boolean z) {
        ((C212219183d) aLAdapterS5S0101000_32.l0).T0();
        if (!((C212219183d) aLAdapterS5S0101000_32.l0).LLLFFI.LJI()) {
            ((C212219183d) aLAdapterS5S0101000_32.l0).LLLFFI.LJIIJ(true);
        }
        ((C212219183d) aLAdapterS5S0101000_32.l0).LLLFFI.LJIIJJI(aLAdapterS5S0101000_32.i1);
    }

    public static final void onAnimationEnd$1(ALAdapterS5S0101000_32 aLAdapterS5S0101000_32, Animator animator, boolean z) {
        ((AnonymousClass1853) aLAdapterS5S0101000_32.l0).b1();
        if (!((AnonymousClass1853) aLAdapterS5S0101000_32.l0).LLLIILIL.LJFF()) {
            ((AnonymousClass1853) aLAdapterS5S0101000_32.l0).LLLIILIL.LJIIIZ(true);
        }
        ((AnonymousClass1853) aLAdapterS5S0101000_32.l0).LLLIILIL.LJIIJ(aLAdapterS5S0101000_32.i1);
    }

    public static final void onAnimationEnd$2(ALAdapterS5S0101000_32 aLAdapterS5S0101000_32, Animator animator, boolean z) {
        AnonymousClass1853.z1((AnonymousClass1853) aLAdapterS5S0101000_32.l0);
        if (!((AnonymousClass1853) aLAdapterS5S0101000_32.l0).LLLIL.LJFF()) {
            ((AnonymousClass1853) aLAdapterS5S0101000_32.l0).LLLIL.LJIIIZ(true);
        }
        AnonymousClass1855 anonymousClass1855 = ((AnonymousClass1853) aLAdapterS5S0101000_32.l0).LLLIL;
        int i = aLAdapterS5S0101000_32.i1;
        if (anonymousClass1855.LJ != i) {
            anonymousClass1855.LJ = i;
            anonymousClass1855.LJIJJ();
        }
    }
}
