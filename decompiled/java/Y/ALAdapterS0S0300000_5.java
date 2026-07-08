package Y;

import X.C0EF4;
import X.C0EF6;
import X.C0EK0;
import X.C0PEM;
import X.C1124290fMZ;
import X.C1295960jpS;
import X.C15438062q;
import X.C1619980sG4;
import X.C1697810uHb;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C362720EJy;
import X.C786410Ut5;
import X.C817503Hh;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftBottomWidget;
import com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class ALAdapterS0S0300000_5 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case 2:
            default:
                super.onAnimationStart(animator);
                break;
            case 3:
                onAnimationStart$2(this, animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0300000_5 aLAdapterS0S0300000_5, Animator animator) {
        super.onAnimationEnd(animator);
        View view = ((LiveNewGiftBottomWidget) aLAdapterS0S0300000_5.l2).LLILZLL;
        if (view == null) {
            view = null;
        }
        if (view.getVisibility() == 0) {
            TextView textView = (TextView) aLAdapterS0S0300000_5.l0;
            if (textView != null) {
                C786410Ut5.LLIL(textView, 8);
                return;
            }
            return;
        }
        TextView textView2 = (TextView) aLAdapterS0S0300000_5.l0;
        if (textView2 == null) {
            return;
        }
        C786410Ut5.LLIL(textView2, 4);
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0300000_5 aLAdapterS0S0300000_5, Animator animator) {
        ((C1295960jpS) aLAdapterS0S0300000_5.l2).animate().setDuration(500L).alpha(0.0f).withEndAction(new ARunnableS105S0100000_5((C1295960jpS) aLAdapterS0S0300000_5.l2, 43)).start();
        C786410Ut5.x5(((C0EF6) aLAdapterS0S0300000_5.l1).LLILLL, 0.0f);
        C786410Ut5.LLLLLLZZ(((C0EF6) aLAdapterS0S0300000_5.l1).LLILLL, 0);
        ((C0EF6) aLAdapterS0S0300000_5.l1).LLILLL.animate().setDuration(500L).alpha(1.0f).start();
    }

    public static final void onAnimationEnd$2(ALAdapterS0S0300000_5 aLAdapterS0S0300000_5, Animator animator) {
        ((Function0) aLAdapterS0S0300000_5.l0).invoke();
        List listLJIIJJI = C1697810uHb.LJIIJJI("scaleX", "scaleY");
        View view = (View) aLAdapterS0S0300000_5.l2;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJJI, 10));
        Iterator it2 = listLJIIJJI.iterator();
        while (it2.hasNext()) {
            arrayList.add(ObjectAnimator.ofFloat(view, (String) it2.next(), 1.0f));
        }
        ProfileAvatarAssem profileAvatarAssem = (ProfileAvatarAssem) aLAdapterS0S0300000_5.l1;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(C1619980sG4.LJIILIIL());
        animatorSet.setDuration(100L);
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        profileAvatarAssem.getClass();
    }

    public static final void onAnimationEnd$3(ALAdapterS0S0300000_5 aLAdapterS0S0300000_5, Animator animator) {
        super.onAnimationEnd(animator);
        View view = ((C1124290fMZ) aLAdapterS0S0300000_5.l2).LLJJJIL;
        if (view != null && view.getVisibility() == 0) {
            TextView textView = (TextView) aLAdapterS0S0300000_5.l0;
            if (textView != null) {
                C786410Ut5.LLIL(textView, 8);
                return;
            }
            return;
        }
        TextView textView2 = (TextView) aLAdapterS0S0300000_5.l0;
        if (textView2 == null) {
            return;
        }
        C786410Ut5.LLIL(textView2, 4);
    }

    public static final void onAnimationStart$0(ALAdapterS0S0300000_5 aLAdapterS0S0300000_5, Animator animator) {
        TextView textView = (TextView) aLAdapterS0S0300000_5.l0;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 0);
        }
        super.onAnimationStart(animator);
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C362720EJy((AnimatorSet) aLAdapterS0S0300000_5.l1, null), 2);
    }

    public static final void onAnimationStart$1(ALAdapterS0S0300000_5 aLAdapterS0S0300000_5, Animator animator) {
        ((C0EF4) aLAdapterS0S0300000_5.l0).LLILZ = false;
        C786410Ut5.LLLLLLZZ(((C0EF6) aLAdapterS0S0300000_5.l1).LLILLL, 4);
    }

    public static final void onAnimationStart$2(ALAdapterS0S0300000_5 aLAdapterS0S0300000_5, Animator animator) {
        TextView textView = (TextView) aLAdapterS0S0300000_5.l0;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 0);
        }
        super.onAnimationStart(animator);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0EK0((AnimatorSet) aLAdapterS0S0300000_5.l1, null), 3);
    }

    public ALAdapterS0S0300000_5(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
        this.l2 = obj3;
    }
}
