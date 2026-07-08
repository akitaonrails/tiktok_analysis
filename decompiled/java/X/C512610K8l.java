package X;

import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeUserInfoResponse;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.repository.PrivilegeRepository;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.SubscriptionTrialLiveCardWidget;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.n;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0K8l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512610K8l extends C09AY implements Function1<SubscribeUserInfoResponse, Unit> {
    public final /* synthetic */ SubscriptionTrialLiveCardWidget LL;
    public final /* synthetic */ IMessage LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C512610K8l(SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget, IMessage iMessage) {
        super(1);
        this.LL = subscriptionTrialLiveCardWidget;
        this.LLILLJJLI = iMessage;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SubscribeUserInfoResponse subscribeUserInfoResponse) {
        String idStr;
        long j;
        SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget = this.LL;
        PrivilegeRepository privilegeRepository = subscriptionTrialLiveCardWidget.LLJILLL;
        if (privilegeRepository != null) {
            Room room = subscriptionTrialLiveCardWidget.LLIZLLLIL;
            if (room == null || (idStr = room.getIdStr()) == null) {
                idStr = "";
            }
            InterfaceC510100JzU interfaceC510100JzU = new InterfaceC510100JzU() { // from class: X.0JzW
                @Override // X.InterfaceC510100JzU
                public final void QP(C470590Icr<n> c470590Icr) {
                }

                @Override // X.InterfaceC510100JzU
                public final void hj(C509160Jxy c509160Jxy) {
                }

                @Override // X.InterfaceC510100JzU
                public final void yO(C509170Jxz c509170Jxz, boolean z) {
                }
            };
            Map<String, String> mapLIZJ = C2097908Jt.LIZJ(new Pair("cancelledKey", "-12345"));
            Room room2 = this.LL.LLIZLLLIL;
            if (room2 != null) {
                j = room2.liveSubOnlyTier;
            } else {
                j = 0;
            }
            privilegeRepository.LIZ(idStr, true, "sub_only_preview_card", true, interfaceC510100JzU, mapLIZJ, j);
        }
        this.LL.H1((MemberMessage) this.LLILLJJLI);
        return Unit.LIZ;
    }
}
