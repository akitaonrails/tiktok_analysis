package Y;

import X.C1295960jpS;
import X.C15DF;
import X.C15DG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C473410IhP;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.match.business.event.BattleDrawReMatchEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleResultAnimationEndEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes32.dex */
public class AAListenerS76S0201000_31 implements Animator.AnimatorListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    public static final void onAnimationCancel$0(AAListenerS76S0201000_31 aAListenerS76S0201000_31, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS76S0201000_31 aAListenerS76S0201000_31, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS76S0201000_31 aAListenerS76S0201000_31, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS76S0201000_31 aAListenerS76S0201000_31, Animator animator) {
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

    public static final void onAnimationCancel$1(AAListenerS76S0201000_31 aAListenerS76S0201000_31, Animator animator) {
        C15DG c15dg = (C15DG) aAListenerS76S0201000_31.l0;
        c15dg.LLIZLLLIL.removeCallbacks(c15dg.LLJILLL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAnimation canceled, result = ");
        sbLIZ.append(aAListenerS76S0201000_31.i2);
        C20441214yg.LJ("MatchResultComponent", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onAnimationEnd$0(AAListenerS76S0201000_31 aAListenerS76S0201000_31, Animator animator) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.1f, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS278S0100000_31((ConstraintLayout) aAListenerS76S0201000_31.l0, 21));
        valueAnimatorOfFloat.addListener(new AAListenerS93S0101000_31(aAListenerS76S0201000_31.i2, (C15DF) aAListenerS76S0201000_31.l1, 0));
        valueAnimatorOfFloat.start();
    }

    public static final void onAnimationEnd$1(AAListenerS76S0201000_31 aAListenerS76S0201000_31, Animator animator) {
        C15DG c15dg = (C15DG) aAListenerS76S0201000_31.l0;
        c15dg.LLIZLLLIL.removeCallbacks(c15dg.LLJILLL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAnimation end, result = ");
        sbLIZ.append(aAListenerS76S0201000_31.i2);
        C20441214yg.LJIIIZ("MatchResultComponent", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LLD(8, (C1295960jpS) aAListenerS76S0201000_31.l1);
        DataChannel dataChannel = ((C15DG) aAListenerS76S0201000_31.l0).LLIZ;
        if (dataChannel != null) {
            dataChannel.FQ2(BattleResultAnimationEndEvent.class);
        }
        int i = aAListenerS76S0201000_31.i2;
        if (i == 2) {
            DataChannel dataChannel2 = ((C15DG) aAListenerS76S0201000_31.l0).LLIZ;
            if (dataChannel2 != null) {
                dataChannel2.FQ2(BattleDrawReMatchEvent.class);
                return;
            }
            return;
        }
        if (i != 1) {
            return;
        }
        C15DG c15dg2 = (C15DG) aAListenerS76S0201000_31.l0;
        ARunnableS131S0100000_31 aRunnableS131S0100000_31 = new ARunnableS131S0100000_31(c15dg2, 105);
        c15dg2.LLJI = aRunnableS131S0100000_31;
        C473410IhP.LIZJ(aRunnableS131S0100000_31, 4000L);
    }

    public static final void onAnimationStart$1(AAListenerS76S0201000_31 aAListenerS76S0201000_31, Animator animator) {
        C15DG c15dg = (C15DG) aAListenerS76S0201000_31.l0;
        c15dg.LLIZLLLIL.removeCallbacks(c15dg.LLJILLL);
        C20441214yg.LIZIZ("MatchResultComponent", "onAnimationStart");
    }

    public AAListenerS76S0201000_31(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
