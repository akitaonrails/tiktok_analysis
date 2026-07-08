package X;

import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.SubSplitStatus;

/* JADX INFO: renamed from: X.0JZe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494080JZe extends C09AY implements Function1<InterfaceC497601wk, Unit> {
    public final /* synthetic */ SubOnlyLiveSettingDialogVM LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ C410401ig LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C494080JZe(SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM, C19EG c19eg, C410401ig c410401ig) {
        super(1);
        this.LL = subOnlyLiveSettingDialogVM;
        this.LLILLJJLI = c19eg;
        this.LLILLL = c410401ig;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC497601wk interfaceC497601wk) {
        User owner;
        User owner2;
        int i;
        User owner3;
        SubscribeInfo subscribeInfo;
        SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM = this.LL;
        C19EG c19eg = this.LLILLJJLI;
        LiveSubOnlyConfig liveSubOnlyConfig = this.LLILLL.LLILZ;
        Long lValueOf = null;
        subSplitStatus = null;
        subSplitStatus = null;
        SubSplitStatus subSplitStatus = null;
        lValueOf = null;
        Long lValueOf2 = null;
        lValueOf = null;
        if (C494680Jac.LJIILJJIL(subOnlyLiveSettingDialogVM.vQ2().LLILLJJLI)) {
            IFansClubService iFansClubService = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
            Room room = subOnlyLiveSettingDialogVM.vQ2().LLILLJJLI;
            if (room != null && (owner3 = room.getOwner()) != null && (subscribeInfo = owner3.getSubscribeInfo()) != null) {
                subSplitStatus = subscribeInfo.subSplitStatus;
            }
            if (iFansClubService.pY1(subSplitStatus)) {
                i = 2131856634;
            } else {
                i = 2131844464;
            }
            C766270U4b.LIZLLL(i);
        } else if (liveSubOnlyConfig != null && liveSubOnlyConfig.disabled) {
            if (Intrinsics.LJFF(liveSubOnlyConfig.disabledReason, "violation")) {
                C766270U4b.LJIIL(R.drawable.eqq, c19eg, liveSubOnlyConfig.disabledToast);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_violation_toast");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII("anchor", "user_type");
                c474500IjALIZ.LJJII("subscription", "scene_type");
                c474500IjALIZ.LJJII("ban", "violation_type");
                Room room2 = subOnlyLiveSettingDialogVM.vQ2().LLILLJJLI;
                if (room2 != null && (owner2 = room2.getOwner()) != null) {
                    lValueOf2 = Long.valueOf(owner2.getId());
                }
                c474500IjALIZ.LJJII(lValueOf2, "violation_anchor_id");
                c474500IjALIZ.LIZ();
            } else {
                C766270U4b.LJIIJJI(liveSubOnlyConfig.disabledToast);
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_subscriber_only_live_ban_toast");
                Room room3 = subOnlyLiveSettingDialogVM.vQ2().LLILLJJLI;
                if (room3 != null && (owner = room3.getOwner()) != null) {
                    lValueOf = Long.valueOf(owner.getId());
                }
                c474500IjALIZ2.LJJII(lValueOf, "anchor_id");
                c474500IjALIZ2.LJJII(liveSubOnlyConfig.disabledReason, "toast_type");
                c474500IjALIZ2.LIZ();
            }
        }
        return Unit.LIZ;
    }
}
