package Y;

import X.C0E48;
import X.C13E8;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C350870DpF;
import X.C362580EJk;
import X.C369630EeP;
import X.C372500Ej2;
import X.C786410Ut5;
import X.InterfaceC20236714Gf;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment;

/* JADX INFO: loaded from: classes6.dex */
public class AAListenerS49S0210000_5 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    public static final void onAnimationCancel$0(AAListenerS49S0210000_5 aAListenerS49S0210000_5, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS49S0210000_5 aAListenerS49S0210000_5, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS49S0210000_5 aAListenerS49S0210000_5, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS49S0210000_5 aAListenerS49S0210000_5, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS49S0210000_5 aAListenerS49S0210000_5, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animator);
                break;
            case 1:
                onAnimationRepeat$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(AAListenerS49S0210000_5 aAListenerS49S0210000_5, Animator animator) {
        if (!aAListenerS49S0210000_5.z2 && ((ObjectAnimator) aAListenerS49S0210000_5.l0) == null) {
            C786410Ut5.LJLZ(8, ((C372500Ej2) aAListenerS49S0210000_5.l1).LIZ);
        }
    }

    public static final void onAnimationEnd$1(AAListenerS49S0210000_5 aAListenerS49S0210000_5, Animator animator) {
        C19EG activity;
        FragmentManager supportFragmentManager;
        Fragment fragmentLJJJJZI;
        if (aAListenerS49S0210000_5.z2) {
            DTResourcePanelFragment dTResourcePanelFragment = (DTResourcePanelFragment) aAListenerS49S0210000_5.l0;
            if (dTResourcePanelFragment.getActivity() != null && (activity = dTResourcePanelFragment.getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (fragmentLJJJJZI = supportFragmentManager.LJJJJZI(dTResourcePanelFragment.getClass().getCanonicalName())) != null && fragmentLJJJJZI.isAdded()) {
                C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
                c19ehLJIIJ.LJIILL(fragmentLJJJJZI);
                c19ehLJIIJ.LJIIL();
                C13E8<Fragment> c13e8 = C369630EeP.LIZ;
                if (!c13e8.isEmpty()) {
                    c13e8.removeLast();
                }
            }
        } else {
            C362580EJk.LIZ((DTResourcePanelFragment) aAListenerS49S0210000_5.l0);
        }
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) aAListenerS49S0210000_5.l1;
        if (interfaceC20236714Gf != null && interfaceC20236714Gf.isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) aAListenerS49S0210000_5.l1;
            Boolean bool = Boolean.TRUE;
            C189200o6.m2constructorimpl(bool);
            interfaceC20236714Gf2.resumeWith(bool);
        }
    }

    public static final void onAnimationStart$1(AAListenerS49S0210000_5 aAListenerS49S0210000_5, Animator animator) {
        C0E48 c0e48;
        DTResourcePanelFragment dTResourcePanelFragment = (DTResourcePanelFragment) aAListenerS49S0210000_5.l0;
        dTResourcePanelFragment.ES(dTResourcePanelFragment.LLJJIJI);
        DTResourcePanelFragment dTResourcePanelFragment2 = (DTResourcePanelFragment) aAListenerS49S0210000_5.l0;
        if (dTResourcePanelFragment2.LLJJI && (c0e48 = dTResourcePanelFragment2.LL) != null) {
            C350870DpF.LJIIIZ(c0e48, "is_bottom_panel_showing", Boolean.FALSE);
        }
        ((DTResourcePanelFragment) aAListenerS49S0210000_5.l0).WR(false);
        ((DTResourcePanelFragment) aAListenerS49S0210000_5.l0).UR();
    }

    public AAListenerS49S0210000_5(Object obj, boolean z, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z2 = z;
        this.l1 = obj2;
    }
}
