package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.bytedance.android.livesdk.performance.emote.EmotePerformanceTrackerViewModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Jx0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C508560Jx0 extends C09AY implements Function0<EmotePerformanceTrackerViewModel> {
    public final /* synthetic */ SubscriptionPrivilegeDetailFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C508560Jx0(SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment) {
        super(0);
        this.LL = subscriptionPrivilegeDetailFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final EmotePerformanceTrackerViewModel invoke() {
        return C508920Jxa.LIZIZ(this.LL);
    }
}
