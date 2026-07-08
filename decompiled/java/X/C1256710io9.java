package X;

import android.animation.Animator;
import android.transition.Transition;
import com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarActivity;

/* JADX INFO: renamed from: X.0io9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1256710io9 implements Transition.TransitionListener {
    public final /* synthetic */ EnlargeAvatarActivity LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        EnlargeAvatarActivity enlargeAvatarActivity = this.LIZ;
        String str = this.LIZIZ;
        enlargeAvatarActivity.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str2 = enlargeAvatarActivity.LLJJIII;
        if (str2 == null) {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", enlargeAvatarActivity.LLJJI);
        c2344009Gk.LJIIIIZZ("exit_method", str);
        c2344009Gk.LJ(Boolean.TRUE, "is_avatar");
        c2344009Gk.LJIIIIZZ("local_time_ms", String.valueOf(System.currentTimeMillis()));
        C20684815ws.LJIILLIIL("cancel_profile_photo", c2344009Gk.LIZ);
        Animator animator = this.LIZ.LLJ;
        if (animator != null) {
            animator.start();
        }
    }

    public C1256710io9(EnlargeAvatarActivity enlargeAvatarActivity, String str) {
        this.LIZ = enlargeAvatarActivity;
        this.LIZIZ = str;
    }
}
