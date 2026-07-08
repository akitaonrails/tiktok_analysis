package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.view.fragment.SubOnlySpacePostTopicFragment;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import webcast.api.sub.SpaceTip;

/* JADX INFO: renamed from: X.0Jlw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501700Jlw extends C09AY implements Function2<UIAssem, C291001Au<? extends SpaceTip>, Unit> {
    public C501700Jlw() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends SpaceTip> c291001Au) {
        SpaceTip spaceTip;
        Fragment fragmentLJI;
        FragmentManager childFragmentManager;
        UIAssem uIAssem2 = uIAssem;
        C291001Au<? extends SpaceTip> c291001Au2 = c291001Au;
        if (c291001Au2 != null && (spaceTip = (SpaceTip) c291001Au2.LIZ) != null && (fragmentLJI = C724240Sb0.LJI(uIAssem2)) != null && (childFragmentManager = fragmentLJI.getChildFragmentManager()) != null) {
            SubOnlySpacePostTopicFragment.LLIZLLLIL.getClass();
            SubOnlySpacePostTopicFragment subOnlySpacePostTopicFragment = new SubOnlySpacePostTopicFragment();
            subOnlySpacePostTopicFragment.LLILZ = "";
            subOnlySpacePostTopicFragment.LLILZLL = spaceTip;
            subOnlySpacePostTopicFragment.show(childFragmentManager, "SubOnlySpacePostTopicFragment");
        }
        return Unit.LIZ;
    }
}
