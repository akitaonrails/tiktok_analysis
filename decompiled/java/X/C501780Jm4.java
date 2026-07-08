package X;

import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.view.fragment.SubOnlySpacePostTopicFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Jm4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501780Jm4 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubOnlySpacePostTopicFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C501780Jm4(SubOnlySpacePostTopicFragment subOnlySpacePostTopicFragment) {
        super(0);
        this.LL = subOnlySpacePostTopicFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SubOnlySpacePostTopicFragment subOnlySpacePostTopicFragment = this.LL;
        FrameLayout frameLayout = subOnlySpacePostTopicFragment.LLIZ;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        FrameLayout frameLayout2 = subOnlySpacePostTopicFragment.LLIZ;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(8, frameLayout2);
        }
        return Unit.LIZ;
    }
}
