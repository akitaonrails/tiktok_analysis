package X;

import Y.ALAdapterS17S0100000_21;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IPostModeService;

/* JADX INFO: renamed from: X.0kyM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1339920kyM implements InterfaceC1339710ky1 {
    public final Context LIZ;
    public final C430440GuI LIZIZ;
    public final LifecycleOwner LIZJ;
    public final Aweme LIZLLL;
    public final String LJ;
    public final String LJFF;
    public AnimatorSet LJI;

    public final LifecycleOwner LIZIZ() {
        IDetailFeedSafService iDetailFeedSafService;
        Fragment fragmentLIZ;
        LifecycleOwner lifecycleOwner = this.LIZJ;
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        ComponentCallbacks2 componentCallbacks2LIZIZ = C737910Sx3.LIZIZ(this.LIZ);
        if (componentCallbacks2LIZIZ != null && (iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null)) != null && (fragmentLIZ = iDetailFeedSafService.LIZ(this.LIZIZ)) != null) {
            return fragmentLIZ;
        }
        IPostModeService iPostModeService = (IPostModeService) PluggableExtentionKt.pluggableSpi$default(IPostModeService.class, false, false, false, 14, null);
        return (iPostModeService == null || !iPostModeService.LJJ()) ? (LifecycleOwner) componentCallbacks2LIZIZ : SAFExtensionKt.LJJ(this.LIZIZ);
    }

    @Override // X.InterfaceC1339710ky1
    public final void LIZ(final Comment comment, CharSequence charSequence) {
        final String string;
        if (charSequence != null) {
            string = charSequence.toString();
        } else {
            string = null;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.LIZIZ, "alpha", 0.0f).setDuration(100L);
        duration.setInterpolator(new C21388418n4());
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.LIZIZ, "alpha", 0.0f, 1.0f).setDuration(100L);
        duration2.setInterpolator(new C21388418n4());
        duration.addListener(new AnimatorListenerAdapter() { // from class: X.0kyN
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C1339920kyM c1339920kyM = this.LL;
                c1339920kyM.LIZIZ.LJJJJJ(comment, string, c1339920kyM.LIZLLL, c1339920kyM.LJ, c1339920kyM.LJFF);
            }
        });
        AnimatorSet animatorSet = this.LJI;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.LJI = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.addListener(new ALAdapterS17S0100000_21(this, 3));
        animatorSet2.playSequentially(duration, duration2);
        this.LJI = animatorSet2;
        animatorSet2.start();
    }

    public C1339920kyM(Context context, C430440GuI c430440GuI, Fragment fragment, Aweme aweme, String str, String str2) {
        this.LIZ = context;
        this.LIZIZ = c430440GuI;
        this.LIZJ = fragment;
        this.LIZLLL = aweme;
        this.LJ = str;
        this.LJFF = str2;
    }
}
