package X;

import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeUserInfoResponse;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.SubscriptionTrialLiveCardWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0K92, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K92 extends C09AY implements Function1<SubscribeUserInfoResponse, Unit> {
    public final /* synthetic */ SubscriptionTrialLiveCardWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0K92(SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget) {
        super(1);
        this.LL = subscriptionTrialLiveCardWidget;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeUserInfoResponse r8) {
        /*
            r7 = this;
            com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeUserInfoResponse r8 = (com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeUserInfoResponse) r8
            com.bytedance.android.livesdk.subscribe.model.SubOnlyLiveInfo r0 = r8.subOnlyLiveInfo
            if (r0 == 0) goto L3b
            boolean r1 = r0.isSolEligible
            r0 = 1
            if (r1 != r0) goto L3b
        Lb:
            r5 = -1
            if (r0 == 0) goto L25
            com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.SubscriptionTrialLiveCardWidget r1 = r7.LL
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r1.LLIZLLLIL
            if (r0 == 0) goto L17
            r0.allowPreviewTime = r5
        L17:
            r1.LLJIJIL = r5
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r1.dataChannel
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel> r1 = com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel.class
            X.0II9 r0 = X.C0II9.SUBSCRIBER_NORMAL_LIVE
            r2.zW(r1, r0)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.SubscriptionTrialLiveCardWidget r4 = r7.LL
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r4.LLIZLLLIL
            if (r3 == 0) goto L22
            long r1 = r3.allowPreviewTime
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L35
            r0 = 0
            r3.allowPreviewTime = r0
        L35:
            long r0 = r3.allowPreviewTime
            r4.D1(r0)
            goto L22
        L3b:
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0K92.invoke(java.lang.Object):java.lang.Object");
    }
}
