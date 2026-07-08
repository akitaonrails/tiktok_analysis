package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.SubUnPinResponse;

/* JADX INFO: renamed from: X.0Jys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509720Jys extends C09AY implements Function1<SubUnPinResponse, Unit> {
    public final /* synthetic */ SubscriptionPrivilegeDetailFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C509720Jys(SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment) {
        super(1);
        this.LL = subscriptionPrivilegeDetailFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SubUnPinResponse subUnPinResponse) {
        this.LL.LLILZ.invoke();
        return Unit.LIZ;
    }
}
