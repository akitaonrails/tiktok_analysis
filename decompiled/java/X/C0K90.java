package X;

import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeUserInfoResponse;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.SubscriptionTrialLiveCardWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0K90, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K90 extends C09AY implements Function1<SubscribeUserInfoResponse, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ SubscriptionTrialLiveCardWidget LLILLL;
    public final /* synthetic */ Function1<SubscribeUserInfoResponse, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0K90(long j, long j2, SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget, Function1<? super SubscribeUserInfoResponse, Unit> function1) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLILLL = subscriptionTrialLiveCardWidget;
        this.LLILZ = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SubscribeUserInfoResponse subscribeUserInfoResponse) {
        boolean z;
        boolean z2;
        Room room;
        User owner;
        SubscribeInfo subscribeInfo;
        User owner2;
        SubscribeInfo subscribeInfo2;
        String str;
        User owner3;
        SubscribeInfo subscribeInfo3;
        SubscribeInfo subscribeInfo4;
        SubscribeUserInfoResponse subscribeUserInfoResponse2 = subscribeUserInfoResponse;
        long j = this.LL;
        if (j <= 0 && this.LLILLJJLI <= 0) {
            z = false;
        } else {
            z = true;
        }
        Room room2 = this.LLILLL.LLIZLLLIL;
        if (room2 != null) {
            room2.liveSubOnlyMonth = j;
            room2.liveSubOnlyTier = this.LLILLJJLI;
            User owner4 = room2.getOwner();
            if (owner4 != null && (subscribeInfo4 = owner4.getSubscribeInfo()) != null) {
                subscribeInfo4.solRoomDisplayText = subscribeUserInfoResponse2.subOnlyLiveInfo.solRoomDisplayText;
            }
        }
        Room room3 = this.LLILLL.LLIZLLLIL;
        if (room3 != null && (owner3 = room3.getOwner()) != null && (subscribeInfo3 = owner3.getSubscribeInfo()) != null) {
            subscribeInfo3.isSolEligible = subscribeUserInfoResponse2.subOnlyLiveInfo.isSolEligible;
        }
        Room room4 = this.LLILLL.LLIZLLLIL;
        if (room4 != null && (owner2 = room4.getOwner()) != null && (subscribeInfo2 = owner2.getSubscribeInfo()) != null && (str = subscribeInfo2.solRoomDisplayText) != null && str.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C16F5 c16f5 = this.LLILLL.LLILZIL;
            if (c16f5 != null) {
                c16f5.setText("");
            }
            C16F5 c16f52 = this.LLILLL.LLILZIL;
            if (c16f52 != null) {
                C786410Ut5.LLJJJJ(c16f52, 8);
            }
        } else {
            C16F5 c16f53 = this.LLILLL.LLILZIL;
            if (c16f53 != null) {
                c16f53.setText("");
            }
            C16F5 c16f54 = this.LLILLL.LLILZIL;
            if (c16f54 != null) {
                C786410Ut5.LLJJJJ(c16f54, 8);
            }
        }
        if (this.LLILLL.E1() && z && (room = this.LLILLL.LLIZLLLIL) != null && (owner = room.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null && !subscribeInfo.isSolEligible) {
            C16FS c16fs = this.LLILLL.LLILZLL;
            if (c16fs != null) {
                c16fs.setText(C497740JfY.LJIJI(2131856674));
            }
        } else {
            C16FS c16fs2 = this.LLILLL.LLILZLL;
            if (c16fs2 != null) {
                c16fs2.setText(C497740JfY.LJIJI(2131856674));
            }
        }
        this.LLILZ.invoke(subscribeUserInfoResponse2);
        return Unit.LIZ;
    }
}
