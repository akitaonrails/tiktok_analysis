package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.settingpage.SubscriptionCommunityFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.SubUnPinResponse;

/* JADX INFO: renamed from: X.0Jz9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509890Jz9 extends C09AY implements Function1<SubUnPinResponse, Unit> {
    public final /* synthetic */ SubscriptionCommunityFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C509890Jz9(SubscriptionCommunityFragment subscriptionCommunityFragment) {
        super(1);
        this.LL = subscriptionCommunityFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SubUnPinResponse subUnPinResponse) {
        C766270U4b.LIZLLL(2131855124);
        this.LL.dismiss();
        return Unit.LIZ;
    }
}
