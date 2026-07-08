package Y;

import X.C0J70;
import X.C0J72;
import X.C1143920fsE;
import X.C465560INm;
import X.C473410IhP;
import X.C500260Jjc;
import X.C786410Ut5;
import X.InterfaceC482890Iwh;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStatusWidget;
import com.bytedance.android.livesdk.widget.LiveSlideUpGuideWidget;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class ALAdapterS2S0300000_7 extends AnimatorListenerAdapter {
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
        if (2 - this.$t != 0) {
            super.onAnimationStart(animator);
        } else {
            onAnimationStart$0(this, animator);
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS2S0300000_7 aLAdapterS2S0300000_7, Animator animator) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aLAdapterS2S0300000_7.l0;
        LiveSlideUpGuideWidget liveSlideUpGuideWidget = livePlayFragment.M;
        if (liveSlideUpGuideWidget != null) {
            C1143920fsE c1143920fsE = liveSlideUpGuideWidget.LLILLL;
            if (c1143920fsE != null) {
                c1143920fsE.LIZ();
            }
            livePlayFragment.M.hide();
        }
        C465560INm c465560INm = (C465560INm) aLAdapterS2S0300000_7.l1;
        LivePlayFragment livePlayFragment2 = (LivePlayFragment) aLAdapterS2S0300000_7.l2;
        c465560INm.getClass();
        C465560INm.LIZLLL(0.0f, 0.0f, livePlayFragment2);
        C465560INm c465560INm2 = (C465560INm) aLAdapterS2S0300000_7.l1;
        LivePlayFragment livePlayFragment3 = (LivePlayFragment) aLAdapterS2S0300000_7.l0;
        c465560INm2.getClass();
        C465560INm.LIZLLL(0.0f, 0.0f, livePlayFragment3);
        ((C465560INm) aLAdapterS2S0300000_7.l1).LIZ.LIZ();
    }

    public static final void onAnimationEnd$1(ALAdapterS2S0300000_7 aLAdapterS2S0300000_7, Animator animator) {
        C786410Ut5.LJLIIL(3000L, C473410IhP.LIZ(), new ARunnableS40S0300000_7((C465560INm) aLAdapterS2S0300000_7.l0, (LivePlayFragment) aLAdapterS2S0300000_7.l1, (LivePlayFragment) aLAdapterS2S0300000_7.l2, 0));
    }

    public static final void onAnimationEnd$2(ALAdapterS2S0300000_7 aLAdapterS2S0300000_7, Animator animator) {
        super.onAnimationEnd(animator);
        C500260Jjc.LLFFF((View) aLAdapterS2S0300000_7.l0);
        View view = (View) aLAdapterS2S0300000_7.l0;
        if (view != null) {
            C786410Ut5.T4(view, 1.0f);
        }
        C500260Jjc.LJIILIIL((View) aLAdapterS2S0300000_7.l2);
        View view2 = (View) aLAdapterS2S0300000_7.l2;
        if (view2 != null) {
            C786410Ut5.T4(view2, 1.0f);
        }
        ((DrawGuessStatusWidget) aLAdapterS2S0300000_7.l1).getClass();
    }

    public static final void onAnimationEnd$3(ALAdapterS2S0300000_7 aLAdapterS2S0300000_7, Animator animator) {
        C786410Ut5.LJJJLZIJ((C0J72) aLAdapterS2S0300000_7.l1, (ViewGroup) ((View) aLAdapterS2S0300000_7.l0).getParent());
        Iterator<InterfaceC482890Iwh> it2 = ((C0J70) aLAdapterS2S0300000_7.l2).LJFF.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ();
        }
        ((C0J70) aLAdapterS2S0300000_7.l2).LJFF(false);
    }

    public static final void onAnimationStart$0(ALAdapterS2S0300000_7 aLAdapterS2S0300000_7, Animator animator) {
        super.onAnimationStart(animator);
        View view = (View) aLAdapterS2S0300000_7.l0;
        if (view != null) {
            C786410Ut5.T4(view, 0.0f);
        }
        C500260Jjc.LLFFF((View) aLAdapterS2S0300000_7.l0);
        ((DrawGuessStatusWidget) aLAdapterS2S0300000_7.l1).getClass();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ALAdapterS2S0300000_7(X.C465560INm r2, com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r3, com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            if (r5 == 0) goto Lf
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            r0.l2 = r4
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            r0.l2 = r4
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS2S0300000_7.<init>(X.0INm, com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment, com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment, int):void");
    }

    public ALAdapterS2S0300000_7(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
