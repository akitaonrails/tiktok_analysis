package com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.moderator;

import X.AbstractC19484711Kz;
import X.C01FQ;
import X.C09JN;
import X.C0UO0;
import X.C470590Icr;
import X.C516201zk;
import X.C948450amx;
import X.InterfaceC302601Fg;
import X.InterfaceC921620a5g;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.MidLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class LiveShowModeratorViewModel extends MidLiveShowViewModel {
    public static final /* synthetic */ int LLJJIII = 0;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.MidLiveShowViewModel
    public final InterfaceC921620a5g HQ2() {
        return (InterfaceC921620a5g) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_MODERATOR_USER_MANAGER");
    }

    public final void KQ2(long j, Function0<Unit> function0) {
        AbstractC19484711Kz<C470590Icr<FinishShowingGuestResponse.ResponseData>> abstractC19484711KzFinishGuest;
        FinishShowingGuestParams finishShowingGuestParams = new FinishShowingGuestParams();
        finishShowingGuestParams.roomId = this.LLJ;
        finishShowingGuestParams.channelId = getChannelId();
        finishShowingGuestParams.showId = BaseLiveShowViewModel.FQ2();
        finishShowingGuestParams.targetUserId = j;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null && (abstractC19484711KzFinishGuest = interfaceC302601FgLIZ.finishGuest(finishShowingGuestParams)) != null) {
            EQ2().LIZ(abstractC19484711KzFinishGuest.LJFF(new C0UO0()).LJJIIZ(new C516201zk(function0, 58), new C09JN() { // from class: X.01Fb
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("LiveShowModeratorViewModel@48fd.finishGuest$2");
                    C20441214yg.LIZIZ("LiveShowModeratorViewModel", "finish guest failed");
                    C1C7U.LIZIZ("LiveShowModeratorViewModel@48fd.finishGuest$2");
                }
            }));
        }
    }
}
