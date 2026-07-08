package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem.SubSpaceFeedAssem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.pollist.view.fragment.SubSpacePollMemberFragment;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Joc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C503360Joc extends C09AY implements Function2<UIAssem, C291001Au<? extends C503080JoA>, Unit> {
    public final /* synthetic */ SubSpaceFeedAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C503360Joc(SubSpaceFeedAssem subSpaceFeedAssem) {
        super(2);
        this.LL = subSpaceFeedAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends C503080JoA> c291001Au) {
        C503080JoA c503080JoA;
        FragmentManager childFragmentManager;
        UIAssem uIAssem2 = uIAssem;
        C291001Au<? extends C503080JoA> c291001Au2 = c291001Au;
        if (c291001Au2 != null && (c503080JoA = (C503080JoA) c291001Au2.LIZ) != null) {
            SubSpaceFeedAssem subSpaceFeedAssem = this.LL;
            Fragment fragmentLJI = C724240Sb0.LJI(uIAssem2);
            if (fragmentLJI != null && (childFragmentManager = fragmentLJI.getChildFragmentManager()) != null) {
                C503070Jo9 c503070Jo9 = SubSpacePollMemberFragment.LLILZLL;
                boolean zZQ2 = subSpaceFeedAssem.kp().zQ2();
                c503070Jo9.getClass();
                SubSpacePollMemberFragment subSpacePollMemberFragment = new SubSpacePollMemberFragment();
                subSpacePollMemberFragment.LLILZ = c503080JoA;
                subSpacePollMemberFragment.LL = zZQ2;
                subSpacePollMemberFragment.show(childFragmentManager, "SubSpacePollMemberFragment");
            }
        }
        return Unit.LIZ;
    }
}
