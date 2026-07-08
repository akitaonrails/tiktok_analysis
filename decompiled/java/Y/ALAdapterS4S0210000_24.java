package Y;

import X.C718540SGm;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3NavBarAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public class ALAdapterS4S0210000_24 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final void onAnimationEnd$0(ALAdapterS4S0210000_24 aLAdapterS4S0210000_24, Animator animator) {
        if (!aLAdapterS4S0210000_24.z2) {
            C718540SGm.LIZ((ViewGroup) aLAdapterS4S0210000_24.l0);
        }
        ((Function0) aLAdapterS4S0210000_24.l1).invoke();
    }

    public static final void onAnimationEnd$1(ALAdapterS4S0210000_24 aLAdapterS4S0210000_24, Animator animator) {
        ((FriendsV3NavBarAssem) aLAdapterS4S0210000_24.l0).LLIZLLLIL = null;
        if (!aLAdapterS4S0210000_24.z2) {
            ((Function0) aLAdapterS4S0210000_24.l1).invoke();
        }
    }

    public ALAdapterS4S0210000_24(Object obj, boolean z, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z2 = z;
        this.l1 = obj2;
    }
}
