package Y;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C1253720ijK;
import X.C1255730imZ;
import X.C1720106oR;
import X.C1BCA;
import X.C1C7U;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C786410Ut5;
import android.animation.Animator;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.ss.android.ugc.profile.business.common.ProfilePageFragment;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS19S0100100_16 implements Runnable {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS19S0100100_16 aRunnableS19S0100100_16) {
        ProfilePageFragment profilePageFragment = (ProfilePageFragment) aRunnableS19S0100100_16.l0;
        long j = aRunnableS19S0100100_16.j1;
        profilePageFragment.getClass();
        C1C7U.LIZ("ProfilePageFragment@e348.onViewCreated$2L");
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cold start delayRunAfterFirstFeedCompleted get aweme cache delayTime: ");
        sbLIZ.append(j);
        C1720106oR.LJI("ProfilePageFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (profilePageFragment.LLLILZ) {
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            Object obj = C1253720ijK.LIZ;
            C1255730imZ.LIZLLL(curUserId, null);
        }
        if (profilePageFragment.LLLILZJ) {
            C1BCA.LJIL(profilePageFragment.LLLJIL);
        }
        if (profilePageFragment.LLLILZLLLI) {
            C1BCA.LJIIZILJ(profilePageFragment.LLLJL, true, 300L);
        }
        C1C7U.LIZIZ("ProfilePageFragment@e348.onViewCreated$2L");
    }

    public static final void run$1(ARunnableS19S0100100_16 aRunnableS19S0100100_16) {
        View view = (View) aRunnableS19S0100100_16.l0;
        long j = aRunnableS19S0100100_16.j1;
        C1C7U.LIZ("ViewExtensionKt@db89.circularRevealed$1L");
        if (view.isAttachedToWindow()) {
            C786410Ut5.LJLLLLLL(0, view);
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, (view.getLeft() + view.getRight()) / 2, (view.getTop() + view.getBottom()) / 2, 0.0f, Math.max(view.getWidth(), view.getHeight()));
            animatorCreateCircularReveal.setDuration(j);
            animatorCreateCircularReveal.start();
        }
        C1C7U.LIZIZ("ViewExtensionKt@db89.circularRevealed$1L");
    }

    public ARunnableS19S0100100_16(long j, Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }
}
