package Y;

import X.C1628270sTR;
import X.C1637490siJ;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C998110c53;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes17.dex */
public class ALAdapterS5S0110000_16 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS5S0110000_16 aLAdapterS5S0110000_16, Animator animator) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showWithAnim onAnimationEnd expand: ");
        sbLIZ.append(((C1637490siJ) aLAdapterS5S0110000_16.l0).LLJLLIL);
        C1628270sTR.LIZIZ("CameraEffectCarouselBottomFuncComponentScene", C2188811AlT.LIZIZ(sbLIZ));
        C1637490siJ c1637490siJ = (C1637490siJ) aLAdapterS5S0110000_16.l0;
        if (c1637490siJ.LLJLLIL) {
            ViewGroup viewGroupLLLLLJLJLL = c1637490siJ.LLLLLJLJLL();
            if (viewGroupLLLLLJLJLL != null) {
                C786410Ut5.LJLZ(0, viewGroupLLLLLJLJLL);
            }
        } else {
            ViewGroup viewGroupLLLLLJLJLL2 = c1637490siJ.LLLLLJLJLL();
            if (viewGroupLLLLLJLJLL2 != null) {
                C786410Ut5.LJLZ(8, viewGroupLLLLLJLJLL2);
            }
        }
        ((C1637490siJ) aLAdapterS5S0110000_16.l0).LLLLIL().LJ.invoke(Boolean.valueOf(((C1637490siJ) aLAdapterS5S0110000_16.l0).LLJLLIL));
        ((C1637490siJ) aLAdapterS5S0110000_16.l0).LLJZIJLIL = null;
    }

    public static final void onAnimationEnd$1(ALAdapterS5S0110000_16 aLAdapterS5S0110000_16, Animator animator) {
        if (!aLAdapterS5S0110000_16.z1) {
            ((C998110c53) aLAdapterS5S0110000_16.l0).LIZ.LIZIZ(8);
        }
    }

    public static final void onAnimationStart$0(ALAdapterS5S0110000_16 aLAdapterS5S0110000_16, Animator animator) {
        if (aLAdapterS5S0110000_16.z1) {
            ViewGroup viewGroupLLLLLJLJLL = ((C1637490siJ) aLAdapterS5S0110000_16.l0).LLLLLJLJLL();
            if (viewGroupLLLLLJLJLL != null) {
                C786410Ut5.LJLZ(0, viewGroupLLLLLJLJLL);
            }
            ((C1637490siJ) aLAdapterS5S0110000_16.l0).LLLLIL().LJ.invoke(Boolean.TRUE);
        }
    }

    public static final void onAnimationStart$1(ALAdapterS5S0110000_16 aLAdapterS5S0110000_16, Animator animator) {
        if (aLAdapterS5S0110000_16.z1) {
            ((C998110c53) aLAdapterS5S0110000_16.l0).LIZ.LIZIZ(0);
        }
    }

    public ALAdapterS5S0110000_16(Object obj, boolean z, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = obj;
    }
}
