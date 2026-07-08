package X;

import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.view.fragment.SubOnlySpacePostTopicFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jly, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501720Jly extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ SubOnlySpacePostTopicFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C501720Jly(SubOnlySpacePostTopicFragment subOnlySpacePostTopicFragment) {
        super(1);
        this.LL = subOnlySpacePostTopicFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        C501540Jlg.LIZJ(this.LL.getContext(), th);
        this.LL.dismissAllowingStateLoss();
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
