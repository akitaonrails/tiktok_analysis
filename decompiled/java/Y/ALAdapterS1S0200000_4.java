package Y;

import X.C0DEV;
import X.C0DEW;
import X.C0DEX;
import X.C1295960jpS;
import X.C2451409j6;
import X.C336590DHl;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.awemepushlib.ui.NotificationSettingPageAuthGuideActivity;

/* JADX INFO: loaded from: classes5.dex */
public class ALAdapterS1S0200000_4 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationCancel$0(this, animator);
                break;
            case 2:
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
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS1S0200000_4 aLAdapterS1S0200000_4, Animator animator) {
        C0DEW c0dew = (C0DEW) aLAdapterS1S0200000_4.l0;
        View view = ((C0DEX) aLAdapterS1S0200000_4.l1).LIZ;
        c0dew.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.height != -2) {
            layoutParams.height = -2;
            C786410Ut5.W5(view, layoutParams);
        }
        ((C0DEX) aLAdapterS1S0200000_4.l1).LJIIIIZZ = null;
    }

    public static final void onAnimationCancel$1(ALAdapterS1S0200000_4 aLAdapterS1S0200000_4, Animator animator) {
        C0DEV c0dev = (C0DEV) aLAdapterS1S0200000_4.l0;
        View view = (View) aLAdapterS1S0200000_4.l1;
        c0dev.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.height != -2) {
            layoutParams.height = -2;
            C786410Ut5.W5(view, layoutParams);
        }
        ((C0DEV) aLAdapterS1S0200000_4.l0).LJ = null;
    }

    public static final void onAnimationEnd$0(ALAdapterS1S0200000_4 aLAdapterS1S0200000_4, Animator animator) {
        String str;
        ((C1295960jpS) aLAdapterS1S0200000_4.l0).removeAnimatorListener(aLAdapterS1S0200000_4);
        C336590DHl c336590DHl = C336590DHl.LIZ;
        String str2 = (String) ((NotificationSettingPageAuthGuideActivity) aLAdapterS1S0200000_4.l1).LLILZ.getValue();
        if (C2451409j6.LIZ()) {
            str = "1";
        } else {
            str = "2";
        }
        c336590DHl.getClass();
        C336590DHl.LIZ(str2, str, true);
        ((NotificationSettingPageAuthGuideActivity) aLAdapterS1S0200000_4.l1).finish();
    }

    public static final void onAnimationEnd$1(ALAdapterS1S0200000_4 aLAdapterS1S0200000_4, Animator animator) {
        C0DEW c0dew = (C0DEW) aLAdapterS1S0200000_4.l0;
        View view = ((C0DEX) aLAdapterS1S0200000_4.l1).LIZ;
        c0dew.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.height != -2) {
            layoutParams.height = -2;
            C786410Ut5.W5(view, layoutParams);
        }
        ((C0DEX) aLAdapterS1S0200000_4.l1).LJIIIIZZ = null;
    }

    public static final void onAnimationEnd$2(ALAdapterS1S0200000_4 aLAdapterS1S0200000_4, Animator animator) {
        C0DEV c0dev = (C0DEV) aLAdapterS1S0200000_4.l0;
        View view = (View) aLAdapterS1S0200000_4.l1;
        c0dev.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.height != -2) {
            layoutParams.height = -2;
            C786410Ut5.W5(view, layoutParams);
        }
        ((C0DEV) aLAdapterS1S0200000_4.l0).LJ = null;
    }

    public ALAdapterS1S0200000_4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
