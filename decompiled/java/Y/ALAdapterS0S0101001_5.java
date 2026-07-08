package Y;

import X.C1602160rnK;
import X.C368060Ebs;
import X.C368080Ebu;
import X.C368420EcS;
import X.C368690Ect;
import X.C376310EpB;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ALAdapterS0S0101001_5 extends AnimatorListenerAdapter {
    public final int $t;
    public float f2;
    public int i1;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

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

    public static final void onAnimationCancel$0(ALAdapterS0S0101001_5 aLAdapterS0S0101001_5, Animator animator) {
        C368420EcS c368420EcS = ((C368060Ebs) aLAdapterS0S0101001_5.l0).LL;
        int i = aLAdapterS0S0101001_5.i1;
        int visibility = c368420EcS.getVisibility();
        c368420EcS.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c368420EcS);
        List<C368690Ect> dropList = ((C368060Ebs) aLAdapterS0S0101001_5.l0).LL.getDropList();
        float f = aLAdapterS0S0101001_5.f2;
        Iterator<C368690Ect> it2 = dropList.iterator();
        while (it2.hasNext()) {
            C376310EpB c376310EpBLIZ = it2.next().LIZ();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c376310EpBLIZ);
            c376310EpBLIZ.setScaleX(f);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c376310EpBLIZ);
            c376310EpBLIZ.setScaleY(f);
        }
    }

    public static final void onAnimationCancel$1(ALAdapterS0S0101001_5 aLAdapterS0S0101001_5, Animator animator) {
        C368080Ebu c368080Ebu = ((C368060Ebs) aLAdapterS0S0101001_5.l0).LLILLJJLI;
        int i = aLAdapterS0S0101001_5.i1;
        int visibility = c368080Ebu.getVisibility();
        c368080Ebu.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c368080Ebu);
        C368080Ebu c368080Ebu2 = ((C368060Ebs) aLAdapterS0S0101001_5.l0).LLILLJJLI;
        float f = aLAdapterS0S0101001_5.f2;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c368080Ebu2);
        c368080Ebu2.setAlpha(f);
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0101001_5 aLAdapterS0S0101001_5, Animator animator) {
        C368420EcS c368420EcS = ((C368060Ebs) aLAdapterS0S0101001_5.l0).LL;
        int i = aLAdapterS0S0101001_5.i1;
        int visibility = c368420EcS.getVisibility();
        c368420EcS.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c368420EcS);
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0101001_5 aLAdapterS0S0101001_5, Animator animator) {
        C368080Ebu c368080Ebu = ((C368060Ebs) aLAdapterS0S0101001_5.l0).LLILLJJLI;
        int i = aLAdapterS0S0101001_5.i1;
        int visibility = c368080Ebu.getVisibility();
        c368080Ebu.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c368080Ebu);
    }

    public static final void onAnimationStart$0(ALAdapterS0S0101001_5 aLAdapterS0S0101001_5, Animator animator) {
        int i = aLAdapterS0S0101001_5.i1;
        if (i == 0) {
            C368420EcS c368420EcS = ((C368060Ebs) aLAdapterS0S0101001_5.l0).LL;
            int visibility = c368420EcS.getVisibility();
            c368420EcS.setVisibility(i);
            C1602160rnK.LIZIZ(visibility, i, c368420EcS);
        }
    }

    public static final void onAnimationStart$1(ALAdapterS0S0101001_5 aLAdapterS0S0101001_5, Animator animator) {
        int i = aLAdapterS0S0101001_5.i1;
        if (i == 0) {
            C368080Ebu c368080Ebu = ((C368060Ebs) aLAdapterS0S0101001_5.l0).LLILLJJLI;
            int visibility = c368080Ebu.getVisibility();
            c368080Ebu.setVisibility(i);
            C1602160rnK.LIZIZ(visibility, i, c368080Ebu);
        }
    }

    public ALAdapterS0S0101001_5(int i, C368060Ebs c368060Ebs, float f, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = c368060Ebs;
        this.f2 = f;
    }
}
