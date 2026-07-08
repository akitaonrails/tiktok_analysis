package Y;

import X.C20581915gH;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.story.note.StoryThoughtCreationFragment;
import com.ss.android.ugc.profile.business.common.ProfilePageFragment;

/* JADX INFO: loaded from: classes17.dex */
public class AObserverS180S0200000_16 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS180S0200000_16 aObserverS180S0200000_16, Object obj) {
        ProfilePageFragment profilePageFragment = (ProfilePageFragment) aObserverS180S0200000_16.l0;
        ScrollSwitchStateManager scrollSwitchStateManager = (ScrollSwitchStateManager) aObserverS180S0200000_16.l1;
        profilePageFragment.getClass();
        if ("page_profile".equals(scrollSwitchStateManager.CQ2(((Integer) obj).intValue()))) {
            profilePageFragment.rS(scrollSwitchStateManager, scrollSwitchStateManager.LLJ.getValue());
        }
    }

    public static final void onChanged$1(AObserverS180S0200000_16 aObserverS180S0200000_16, Object obj) {
        ((ProfilePageFragment) aObserverS180S0200000_16.l0).rS((ScrollSwitchStateManager) aObserverS180S0200000_16.l1, (Integer) obj);
    }

    public static final void onChanged$2(AObserverS180S0200000_16 aObserverS180S0200000_16, Object obj) {
        ProfilePageFragment profilePageFragment = (ProfilePageFragment) aObserverS180S0200000_16.l0;
        ScrollSwitchStateManager scrollSwitchStateManager = (ScrollSwitchStateManager) aObserverS180S0200000_16.l1;
        profilePageFragment.getClass();
        if ("page_profile".equals(scrollSwitchStateManager.CQ2(((Integer) obj).intValue()))) {
            profilePageFragment.uT(scrollSwitchStateManager, scrollSwitchStateManager.LLJ.getValue());
        }
    }

    public static final void onChanged$3(AObserverS180S0200000_16 aObserverS180S0200000_16, Object obj) {
        ((ProfilePageFragment) aObserverS180S0200000_16.l0).uT((ScrollSwitchStateManager) aObserverS180S0200000_16.l1, (Integer) obj);
    }

    public static final void onChanged$4(AObserverS180S0200000_16 aObserverS180S0200000_16, Object obj) {
        float f;
        Boolean bool = (Boolean) obj;
        float[] fArr = new float[2];
        float f2 = 0.0f;
        if (bool.booleanValue()) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (bool.booleanValue()) {
            f2 = 1.0f;
        }
        fArr[1] = f2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS233S0200000_31((StoryThoughtCreationFragment) aObserverS180S0200000_16.l0, (C20581915gH) aObserverS180S0200000_16.l1, 8));
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.start();
    }

    public AObserverS180S0200000_16(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
