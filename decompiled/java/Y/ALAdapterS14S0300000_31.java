package Y;

import X.AbstractC21673719rz;
import X.AbstractC21674919sB;
import X.C1295960jpS;
import X.C20575915fJ;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragmentV2;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.explore.assem.ExploreFeedCell;
import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackButtonAssem;
import tikcast.api.anchor_data.FinishEncourageRanking;

/* JADX INFO: loaded from: classes32.dex */
public class ALAdapterS14S0300000_31 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 2:
                onAnimationCancel$0(this, animator);
                break;
            case 3:
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
            default:
                super.onAnimationStart(animator);
                break;
            case 2:
                onAnimationStart$1(this, animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS14S0300000_31 aLAdapterS14S0300000_31, Animator animator) {
        super.onAnimationCancel(animator);
        ((C20575915fJ) aLAdapterS14S0300000_31.l0).LIZ.setBackground((Drawable) aLAdapterS14S0300000_31.l2);
    }

    public static final void onAnimationCancel$1(ALAdapterS14S0300000_31 aLAdapterS14S0300000_31, Animator animator) {
        ((EarlyFeedbackButtonAssem) aLAdapterS14S0300000_31.l1).Tp((View) aLAdapterS14S0300000_31.l2);
    }

    public static final void onAnimationEnd$0(ALAdapterS14S0300000_31 aLAdapterS14S0300000_31, Animator animator) {
        super.onAnimationEnd(animator);
        ((EndIncentiveSettlementFragmentV2) aLAdapterS14S0300000_31.l1).OC(340L);
    }

    public static final void onAnimationEnd$1(ALAdapterS14S0300000_31 aLAdapterS14S0300000_31, Animator animator) {
        RecyclerView recyclerView;
        AbstractC21674919sB abstractC21674919sB;
        ((ViewGroup) aLAdapterS14S0300000_31.l0).getOverlay().remove((GradientDrawable) aLAdapterS14S0300000_31.l1);
        ExploreFeedCell exploreFeedCell = (ExploreFeedCell) aLAdapterS14S0300000_31.l2;
        exploreFeedCell.LLJJJ = null;
        exploreFeedCell.LLJJIJIL = null;
        ViewParent parent = exploreFeedCell.itemView.getParent();
        if ((parent instanceof RecyclerView) && (recyclerView = (RecyclerView) parent) != null) {
            AbstractC21673719rz itemAnimator = recyclerView.getItemAnimator();
            if ((itemAnimator instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator) != null) {
                abstractC21674919sB.LLIZ = true;
            }
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS14S0300000_31 aLAdapterS14S0300000_31, Animator animator) {
        super.onAnimationEnd(animator);
        ((C20575915fJ) aLAdapterS14S0300000_31.l0).LIZ.setBackground((Drawable) aLAdapterS14S0300000_31.l2);
    }

    public static final void onAnimationEnd$3(ALAdapterS14S0300000_31 aLAdapterS14S0300000_31, Animator animator) {
        C786410Ut5.T4((View) aLAdapterS14S0300000_31.l0, 1.0f);
        ((EarlyFeedbackButtonAssem) aLAdapterS14S0300000_31.l1).Tp((View) aLAdapterS14S0300000_31.l2);
        ((EarlyFeedbackButtonAssem) aLAdapterS14S0300000_31.l1).LLLIIII = null;
    }

    public static final void onAnimationStart$0(ALAdapterS14S0300000_31 aLAdapterS14S0300000_31, Animator animator) {
        HandlerHook.viewPostDelay((C1295960jpS) aLAdapterS14S0300000_31.l0, new ARunnableS100S0200000_31((EndIncentiveSettlementFragmentV2) aLAdapterS14S0300000_31.l1, (FinishEncourageRanking) aLAdapterS14S0300000_31.l2, 8), 1500L);
    }

    public static final void onAnimationStart$1(ALAdapterS14S0300000_31 aLAdapterS14S0300000_31, Animator animator) {
        super.onAnimationStart(animator);
        ((C20575915fJ) aLAdapterS14S0300000_31.l0).LIZ.setBackground((LayerDrawable) aLAdapterS14S0300000_31.l1);
    }

    public ALAdapterS14S0300000_31(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
        this.l2 = obj3;
    }
}
