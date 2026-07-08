package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.fragment.NavHostFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingHostFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xar, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825070xar extends C09AY implements Function1<AbstractC2173821A5s, Unit> {
    public final /* synthetic */ PcsOnboardingHostFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1825070xar(PcsOnboardingHostFragment pcsOnboardingHostFragment) {
        super(1);
        this.LL = pcsOnboardingHostFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC2173821A5s abstractC2173821A5s) {
        PcsOnboardingStepFragment pcsOnboardingStepFragment;
        FragmentManager childFragmentManager;
        Fragment fragmentLJJJJZ = this.LL.getChildFragmentManager().LJJJJZ(R.id.drj);
        Fragment fragmentLJJLJ = null;
        if ((fragmentLJJJJZ instanceof NavHostFragment) && fragmentLJJJJZ != null && (childFragmentManager = fragmentLJJJJZ.getChildFragmentManager()) != null) {
            fragmentLJJLJ = childFragmentManager.LJJLJ();
        }
        if ((fragmentLJJLJ instanceof PcsOnboardingStepFragment) && (pcsOnboardingStepFragment = (PcsOnboardingStepFragment) fragmentLJJLJ) != null) {
            pcsOnboardingStepFragment.VS();
        } else {
            C1845220y7M c1845220y7M = this.LL.LLJLLL;
            if (c1845220y7M == null || !c1845220y7M.LJIIZILJ()) {
                PcsOnboardingHostFragment pcsOnboardingHostFragment = this.LL;
                if (pcsOnboardingHostFragment.LLLF) {
                    C19EG activity = pcsOnboardingHostFragment.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                } else {
                    pcsOnboardingHostFragment.close(1);
                }
            }
        }
        return Unit.LIZ;
    }
}
