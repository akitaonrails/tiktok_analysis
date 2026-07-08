package Y;

import X.C0SIL;
import X.C0STE;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.feed.assem.desc.LandscapeDescAssem;

/* JADX INFO: loaded from: classes12.dex */
public class ALAdapterS3S0110000_11 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (2 - this.$t != 0) {
            super.onAnimationCancel(animator);
        } else {
            this.z1 = true;
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
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            case 3:
                onAnimationEnd$3(this, animator);
                break;
            case 4:
                onAnimationEnd$4(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (1 - this.$t != 0) {
            super.onAnimationStart(animator);
        } else {
            onAnimationStart$0(this, animator);
        }
    }

    public ALAdapterS3S0110000_11(C0STE c0ste, int i) {
        this.$t = i;
        this.l0 = c0ste;
    }

    public static final void onAnimationEnd$0(ALAdapterS3S0110000_11 aLAdapterS3S0110000_11, Animator animator) {
        if (aLAdapterS3S0110000_11.z1) {
            C786410Ut5.LJLLLLLL(8, (View) aLAdapterS3S0110000_11.l0);
        }
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$1(ALAdapterS3S0110000_11 aLAdapterS3S0110000_11, Animator animator) {
        C0SIL c0sil = ((LandscapeDescAssem) aLAdapterS3S0110000_11.l0).LLJLLL;
        if (c0sil != null && !aLAdapterS3S0110000_11.z1) {
            c0sil.LIZLLL(false);
        }
        ((LandscapeDescAssem) aLAdapterS3S0110000_11.l0).up().getClass();
        C786410Ut5.LLLLZLL(((LandscapeDescAssem) aLAdapterS3S0110000_11.l0).tp(), 0);
    }

    public static final void onAnimationEnd$2(ALAdapterS3S0110000_11 aLAdapterS3S0110000_11, Animator animator) {
        ViewGroup viewGroup;
        C0STE c0ste = (C0STE) aLAdapterS3S0110000_11.l0;
        if (c0ste.LLLILZJ == animator) {
            c0ste.LLLILZJ = null;
        }
        if (aLAdapterS3S0110000_11.z1) {
            return;
        }
        ViewParent parent = c0ste.LJIIJJI().getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(((C0STE) aLAdapterS3S0110000_11.l0).LJIIJJI(), viewGroup);
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS3S0110000_11 aLAdapterS3S0110000_11, Animator animator) {
        if (aLAdapterS3S0110000_11.z1) {
            C786410Ut5.LJLLLLLL(8, (View) aLAdapterS3S0110000_11.l0);
        }
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$4(ALAdapterS3S0110000_11 aLAdapterS3S0110000_11, Animator animator) {
        if (aLAdapterS3S0110000_11.z1) {
            C786410Ut5.LJLLLLLL(8, (View) aLAdapterS3S0110000_11.l0);
        }
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationStart$0(ALAdapterS3S0110000_11 aLAdapterS3S0110000_11, Animator animator) {
        C0SIL c0sil = ((LandscapeDescAssem) aLAdapterS3S0110000_11.l0).LLJLLL;
        if (c0sil != null && aLAdapterS3S0110000_11.z1) {
            c0sil.LIZLLL(true);
        }
        ((LandscapeDescAssem) aLAdapterS3S0110000_11.l0).up().getClass();
        if (aLAdapterS3S0110000_11.z1) {
            ((LandscapeDescAssem) aLAdapterS3S0110000_11.l0).tp().setText(2131834550);
        } else {
            ((LandscapeDescAssem) aLAdapterS3S0110000_11.l0).tp().setText(2131834551);
        }
        C786410Ut5.LLLLZLL(((LandscapeDescAssem) aLAdapterS3S0110000_11.l0).tp(), 4);
    }

    public ALAdapterS3S0110000_11(Object obj, boolean z, int i) {
        this.$t = i;
        this.z1 = z;
        this.l0 = obj;
    }
}
