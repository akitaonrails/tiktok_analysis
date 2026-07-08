package X;

import Y.AAListenerS323S0100000_12;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.bytedance.android.live.effect.livegoal.LiveGoalBackgroundDialogFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastPictureMemOpt;

/* JADX INFO: renamed from: X.0UFO, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UFO implements C0UFV {
    public boolean LIZ;
    public final /* synthetic */ LiveGoalBackgroundDialogFragment LIZIZ;

    @Override // X.C0UFV
    public final void LIZ() {
        LiveGoalBackgroundDialogFragment liveGoalBackgroundDialogFragment = this.LIZIZ;
        if (liveGoalBackgroundDialogFragment.PR() != null) {
            C500260Jjc.LJLJL(60, liveGoalBackgroundDialogFragment.PR());
            C500260Jjc.LJIILLIIL(liveGoalBackgroundDialogFragment.PR());
            C473410IhP.LJFF(LiveBroadcastPictureMemOpt.getCleanFrescoAnimationCacheTask(), LiveBroadcastPictureMemOpt.optGeckoWebPAnimationCache());
            C1143920fsE c1143920fsE = liveGoalBackgroundDialogFragment.LLJJLIIIJLLLLLLLZ;
            c1143920fsE.LIZ = liveGoalBackgroundDialogFragment.PR();
            c1143920fsE.LIZIZ = C0IPN.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1");
            c1143920fsE.LIZJ = "ttlive_live_goal_first_use_guide.webp";
            c1143920fsE.LJFF = false;
            c1143920fsE.LJIILIIL = true;
            c1143920fsE.LJ = new C786380Ut2(liveGoalBackgroundDialogFragment, 0);
            c1143920fsE.LIZLLL();
        }
    }

    @Override // X.C0UFV
    public final void LIZJ() {
        LiveGoalBackgroundDialogFragment liveGoalBackgroundDialogFragment = this.LIZIZ;
        if (liveGoalBackgroundDialogFragment.PR() != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(liveGoalBackgroundDialogFragment.PR(), (Property<C1324720kZq, Float>) View.TRANSLATION_Y, 0.0f, -60.0f).setDuration(560L);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(liveGoalBackgroundDialogFragment.PR(), (Property<C1324720kZq, Float>) View.TRANSLATION_Y, -60.0f, 60.0f).setDuration(880L);
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(liveGoalBackgroundDialogFragment.PR(), (Property<C1324720kZq, Float>) View.TRANSLATION_Y, 60.0f, 0.0f).setDuration(520L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(duration, duration2, duration3);
            animatorSet.setStartDelay(560L);
            ObjectAnimator duration4 = ObjectAnimator.ofFloat(liveGoalBackgroundDialogFragment.LLJJIJIL, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(360L);
            ObjectAnimator duration5 = ObjectAnimator.ofFloat(liveGoalBackgroundDialogFragment.LLJJIJIL, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(240L);
            ObjectAnimator duration6 = ObjectAnimator.ofFloat(liveGoalBackgroundDialogFragment.LLJJJ, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(360L);
            ObjectAnimator duration7 = ObjectAnimator.ofFloat(liveGoalBackgroundDialogFragment.LLJJJ, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(240L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(duration4, duration6);
            animatorSet2.setStartDelay(560L);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(duration5, duration7);
            animatorSet3.setStartDelay(2760L);
            liveGoalBackgroundDialogFragment.LLJILLL.playTogether(animatorSet, animatorSet2, animatorSet3);
            liveGoalBackgroundDialogFragment.LLJILLL.addListener(new AAListenerS323S0100000_12(liveGoalBackgroundDialogFragment, 1));
        }
    }

    @Override // X.C0UFV
    public final void LIZLLL() {
        this.LIZIZ.LLJJLIIIJLLLLLLLZ.LIZ();
    }

    @Override // X.C0UFV
    public final boolean LIZIZ() {
        return this.LIZ;
    }

    public C0UFO(LiveGoalBackgroundDialogFragment liveGoalBackgroundDialogFragment) {
        this.LIZIZ = liveGoalBackgroundDialogFragment;
    }
}
