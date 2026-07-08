package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.SubscriptionTrialLiveCardWidget;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0K93, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K93 extends C09AY implements Function1<C512060K6i, Unit> {
    public final /* synthetic */ SubscriptionTrialLiveCardWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0K93(SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget) {
        super(1);
        this.LL = subscriptionTrialLiveCardWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C512060K6i c512060K6i) {
        Room room;
        long j;
        long j2;
        long j3;
        long j4;
        C512060K6i c512060K6i2 = c512060K6i;
        long j5 = 0;
        if (c512060K6i2.LIZJ != null) {
            SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget = this.LL;
            C0K94 c0k94 = subscriptionTrialLiveCardWidget.LLJ;
            if (c0k94 != null) {
                c0k94.cancel();
            }
            EnumC512800K9e enumC512800K9e = EnumC512800K9e.OTHERS;
            subscriptionTrialLiveCardWidget.F1(false);
            subscriptionTrialLiveCardWidget.z1(enumC512800K9e, false);
            if (C494680Jac.LJIILJJIL(subscriptionTrialLiveCardWidget.LLIZLLLIL)) {
                Room room2 = subscriptionTrialLiveCardWidget.LLIZLLLIL;
                if (room2 != null && (room2.liveSubOnlyMonth > 0 || (room2 != null && room2.liveSubOnlyTier > 0))) {
                    if (room2 != null) {
                        j3 = room2.liveSubOnlyMonth;
                        j4 = room2.liveSubOnlyTier;
                    } else {
                        j3 = 0;
                        j4 = 0;
                    }
                    subscriptionTrialLiveCardWidget.I1(1, j3, j4, new C0K91(subscriptionTrialLiveCardWidget));
                } else {
                    subscriptionTrialLiveCardWidget.dataChannel.zW(SubOnlyLiveAudienceStatusChannel.class, C0II9.SUBSCRIBER_NORMAL_LIVE);
                    C1113800f5e.LJIIIIZZ = true;
                    Room room3 = subscriptionTrialLiveCardWidget.LLIZLLLIL;
                    if (room3 != null) {
                        j2 = room3.allowPreviewTime;
                    } else {
                        j2 = 0;
                    }
                    subscriptionTrialLiveCardWidget.LLJIJIL = j2;
                    if (room3 != null) {
                        room3.allowPreviewTime = -1L;
                        C0IU0.LJII(new C0IU1(room3.allowPreviewTime, room3.getId()));
                    }
                    subscriptionTrialLiveCardWidget.G1();
                }
            }
        }
        if (c512060K6i2.LJ != null) {
            SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget2 = this.LL;
            if (C494680Jac.LJIILJJIL(subscriptionTrialLiveCardWidget2.LLIZLLLIL) && (room = subscriptionTrialLiveCardWidget2.LLIZLLLIL) != null && (room.liveSubOnlyMonth > 0 || (room != null && room.liveSubOnlyTier > 0))) {
                if (room != null) {
                    j = room.liveSubOnlyMonth;
                    j5 = room.liveSubOnlyTier;
                } else {
                    j = 0;
                }
                subscriptionTrialLiveCardWidget2.I1(1, j, j5, new C0K92(subscriptionTrialLiveCardWidget2));
            }
            return Unit.LIZ;
        }
        return null;
    }
}
