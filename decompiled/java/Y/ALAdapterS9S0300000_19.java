package Y;

import X.C291001Au;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;

/* JADX INFO: loaded from: classes20.dex */
public class ALAdapterS9S0300000_19 extends AnimatorListenerAdapter {
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
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS9S0300000_19 aLAdapterS9S0300000_19, Animator animator) {
        ((FeedAvatarDefaultAssem) aLAdapterS9S0300000_19.l0).ep().UB1();
        ((FeedAvatarDefaultAssem) aLAdapterS9S0300000_19.l0).Fp((Aweme) aLAdapterS9S0300000_19.l1, (FollowStatus) aLAdapterS9S0300000_19.l2);
        ((FeedAvatarDefaultAssem) aLAdapterS9S0300000_19.l0).ep().xQ2(new C291001Au<>(1));
    }

    public static final void onAnimationEnd$1(ALAdapterS9S0300000_19 aLAdapterS9S0300000_19, Animator animator) {
        ((FeedAvatarDefaultAssem) aLAdapterS9S0300000_19.l0).ep().UB1();
        ((FeedAvatarDefaultAssem) aLAdapterS9S0300000_19.l0).Fp((Aweme) aLAdapterS9S0300000_19.l1, (FollowStatus) aLAdapterS9S0300000_19.l2);
        ((FeedAvatarDefaultAssem) aLAdapterS9S0300000_19.l0).ep().xQ2(new C291001Au<>(1));
    }

    public ALAdapterS9S0300000_19(FeedAvatarDefaultAssem feedAvatarDefaultAssem, Aweme aweme, FollowStatus followStatus, int i) {
        this.$t = i;
        this.l0 = feedAvatarDefaultAssem;
        this.l1 = aweme;
        this.l2 = followStatus;
    }
}
