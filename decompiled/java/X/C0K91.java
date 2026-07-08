package X;

import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeUserInfoResponse;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.SubscriptionTrialLiveCardWidget;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0K91, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K91 extends C09AY implements Function1<SubscribeUserInfoResponse, Unit> {
    public final /* synthetic */ SubscriptionTrialLiveCardWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0K91(SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget) {
        super(1);
        this.LL = subscriptionTrialLiveCardWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SubscribeUserInfoResponse subscribeUserInfoResponse) {
        long j = 0;
        if (subscribeUserInfoResponse.subOnlyLiveInfo.isSolEligible) {
            this.LL.dataChannel.zW(SubOnlyLiveAudienceStatusChannel.class, C0II9.SUBSCRIBER_NORMAL_LIVE);
            C1113800f5e.LJIIIIZZ = true;
            SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget = this.LL;
            Room room = subscriptionTrialLiveCardWidget.LLIZLLLIL;
            if (room != null) {
                j = room.allowPreviewTime;
            }
            subscriptionTrialLiveCardWidget.LLJIJIL = j;
            if (room != null) {
                room.allowPreviewTime = -1L;
                C0IU0.LJII(new C0IU1(room.allowPreviewTime, room.getId()));
            }
            this.LL.G1();
        } else {
            SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget2 = this.LL;
            Room room2 = subscriptionTrialLiveCardWidget2.LLIZLLLIL;
            if (room2 != null) {
                if (room2.allowPreviewTime == -1) {
                    room2.allowPreviewTime = 0L;
                }
                subscriptionTrialLiveCardWidget2.D1(room2.allowPreviewTime);
            }
        }
        return Unit.LIZ;
    }
}
