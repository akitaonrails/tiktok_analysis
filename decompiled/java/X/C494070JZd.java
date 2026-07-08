package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingDialogVM;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JZd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494070JZd extends C09AY implements Function1<C410401ig, Unit> {
    public final /* synthetic */ SubOnlyLiveSettingDialogVM LL;
    public final /* synthetic */ C19EG LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C494070JZd(SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM, C19EG c19eg) {
        super(1);
        this.LL = subOnlyLiveSettingDialogVM;
        this.LLILLJJLI = c19eg;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C410401ig c410401ig) {
        Long lValueOf;
        User owner;
        C410401ig c410401ig2 = c410401ig;
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        boolean zW9 = iInteractService.w9();
        boolean zVp0 = iInteractService.vp0();
        boolean zO1 = iInteractService.o1();
        ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
        boolean zLIZIZ = C0U3P.LIZIZ(C0U3Q.KARAOKE);
        boolean zKw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(this.LL.vQ2().LLILLL);
        if (zVp0) {
            this.LL.runOnUIThread(new C494170JZn(zKw0));
        } else if (zW9) {
            this.LL.runOnUIThread(new C494180JZo(zKw0));
        } else if (zO1) {
            this.LL.runOnUIThread(new C494190JZp(zKw0));
        } else if (zLIZIZ) {
            this.LL.runOnUIThread(new C494200JZq(zKw0));
        } else if (c410401ig2.LL) {
            SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM = this.LL;
            subOnlyLiveSettingDialogVM.runOnUIThread(new C0JZK(subOnlyLiveSettingDialogVM, this.LLILLJJLI));
            C0JZH c0jzhVQ2 = this.LL.vQ2();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscriber_only_live_button_click");
            c474500IjALIZ.LJIJJLI(c0jzhVQ2.LLILLL);
            c474500IjALIZ.LJJII(c0jzhVQ2.LL, "click_position");
            int i = 0;
            c474500IjALIZ.LJJII(0, "is_shortcut_entrance");
            Room room = c0jzhVQ2.LLILLJJLI;
            if (room != null) {
                lValueOf = Long.valueOf(room.getOwnerUserId());
            } else {
                lValueOf = null;
            }
            c474500IjALIZ.LJJII(lValueOf, "anchor_id");
            Room room2 = c0jzhVQ2.LLILLJJLI;
            if (room2 != null && (owner = room2.getOwner()) != null && owner.isAnchorHasSubQualification()) {
                i = 1;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(i ^ 1), "is_opt_in");
            c474500IjALIZ.LJJII("open", "sub_live_status");
            c474500IjALIZ.LIZ();
        } else {
            SubOnlyLiveSettingDialogVM subOnlyLiveSettingDialogVM2 = this.LL;
            subOnlyLiveSettingDialogVM2.runOnUIThread(new C494080JZe(subOnlyLiveSettingDialogVM2, this.LLILLJJLI, c410401ig2));
        }
        return Unit.LIZ;
    }
}
