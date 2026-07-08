package Y;

import X.C0W17;
import X.C291001Au;
import X.C736680Sv4;
import X.C786410Ut5;
import android.animation.Animator;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3JumpToTopCapsuleAssem;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public class AAListenerS140S0300000_19 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void onAnimationCancel$0(AAListenerS140S0300000_19 aAListenerS140S0300000_19, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS140S0300000_19 aAListenerS140S0300000_19, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS140S0300000_19 aAListenerS140S0300000_19, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS140S0300000_19 aAListenerS140S0300000_19, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS140S0300000_19 aAListenerS140S0300000_19, Animator animator) {
    }

    public static final void onAnimationRepeat$3(AAListenerS140S0300000_19 aAListenerS140S0300000_19, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS140S0300000_19 aAListenerS140S0300000_19, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS140S0300000_19 aAListenerS140S0300000_19, Animator animator) {
    }

    public static final void onAnimationStart$2(AAListenerS140S0300000_19 aAListenerS140S0300000_19, Animator animator) {
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
            case 2:
                onAnimationCancel$2(this, animator);
                break;
            case 3:
                onAnimationCancel$3(this, animator);
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
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            case 3:
                onAnimationEnd$3(this, animator);
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
            case 2:
                onAnimationRepeat$2(this, animator);
                break;
            case 3:
                onAnimationRepeat$3(this, animator);
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
            case 2:
                onAnimationStart$2(this, animator);
                break;
            case 3:
                onAnimationStart$3(this, animator);
                break;
        }
    }

    public static final void onAnimationCancel$2(AAListenerS140S0300000_19 aAListenerS140S0300000_19, Animator animator) {
        ((FriendsV3JumpToTopCapsuleAssem) aAListenerS140S0300000_19.l0).LLJJIJIIJIL = null;
        C786410Ut5.LJLLLLLL(8, (View) aAListenerS140S0300000_19.l2);
        C786410Ut5.T4((View) aAListenerS140S0300000_19.l2, 1.0f);
        C786410Ut5.ed((View) aAListenerS140S0300000_19.l2, 0.0f);
        C0W17.LIZJ("capsule", "hideCapsule animation cancelled");
    }

    public static final void onAnimationCancel$3(AAListenerS140S0300000_19 aAListenerS140S0300000_19, Animator animator) {
        ((FriendsV3JumpToTopCapsuleAssem) aAListenerS140S0300000_19.l0).LLJJIJI = null;
        C0W17.LIZJ("capsule", "showCapsule animation cancelled");
    }

    public static final void onAnimationEnd$0(AAListenerS140S0300000_19 aAListenerS140S0300000_19, Animator animator) {
        ((FeedAvatarDefaultAssem) aAListenerS140S0300000_19.l0).ep().UB1();
        ((FeedAvatarDefaultAssem) aAListenerS140S0300000_19.l0).Fp((Aweme) aAListenerS140S0300000_19.l1, (FollowStatus) aAListenerS140S0300000_19.l2);
        ((FeedAvatarDefaultAssem) aAListenerS140S0300000_19.l0).ep().xQ2(new C291001Au<>(1));
        C736680Sv4.LJIJJ(((FeedAvatarDefaultAssem) aAListenerS140S0300000_19.l0).kp(), new AwS598S0100000_19((FeedAvatarDefaultAssem) aAListenerS140S0300000_19.l0, 144));
    }

    public static final void onAnimationEnd$1(AAListenerS140S0300000_19 aAListenerS140S0300000_19, Animator animator) {
        ((FeedAvatarDefaultAssem) aAListenerS140S0300000_19.l0).ep().UB1();
        ((FeedAvatarDefaultAssem) aAListenerS140S0300000_19.l0).Fp((Aweme) aAListenerS140S0300000_19.l1, (FollowStatus) aAListenerS140S0300000_19.l2);
        ((FeedAvatarDefaultAssem) aAListenerS140S0300000_19.l0).ep().xQ2(new C291001Au<>(1));
        C736680Sv4.LJIJJ(((FeedAvatarDefaultAssem) aAListenerS140S0300000_19.l0).kp(), new AwS598S0100000_19((FeedAvatarDefaultAssem) aAListenerS140S0300000_19.l0, 146));
    }

    public static final void onAnimationEnd$2(AAListenerS140S0300000_19 aAListenerS140S0300000_19, Animator animator) {
        ((FriendsV3JumpToTopCapsuleAssem) aAListenerS140S0300000_19.l0).LLJJIJIIJIL = null;
        C786410Ut5.LJLLLLLL(8, (View) aAListenerS140S0300000_19.l1);
        C786410Ut5.T4((View) aAListenerS140S0300000_19.l1, 1.0f);
        C786410Ut5.ed((View) aAListenerS140S0300000_19.l1, 0.0f);
        C0W17.LIZJ("capsule", "hideCapsule animation ended");
    }

    public static final void onAnimationEnd$3(AAListenerS140S0300000_19 aAListenerS140S0300000_19, Animator animator) {
        ((FriendsV3JumpToTopCapsuleAssem) aAListenerS140S0300000_19.l0).LLJJIJI = null;
        C786410Ut5.T4((View) aAListenerS140S0300000_19.l1, 1.0f);
        C786410Ut5.ed((View) aAListenerS140S0300000_19.l1, 0.0f);
        HandlerHook.viewPostDelay((View) aAListenerS140S0300000_19.l1, (Runnable) ((FriendsV3JumpToTopCapsuleAssem) aAListenerS140S0300000_19.l0).LLJJJIL.getValue(), 3000L);
        C0W17.LIZJ("capsule", "showCapsule animation ended");
    }

    public static final void onAnimationStart$3(AAListenerS140S0300000_19 aAListenerS140S0300000_19, Animator animator) {
        C786410Ut5.LJLLLLLL(0, (View) aAListenerS140S0300000_19.l2);
        C0W17.LIZJ("capsule", "showCapsule animation started");
    }

    public AAListenerS140S0300000_19(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
