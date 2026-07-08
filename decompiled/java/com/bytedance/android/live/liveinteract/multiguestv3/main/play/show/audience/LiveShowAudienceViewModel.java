package com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.audience;

import X.AbstractC19484711Kz;
import X.C01FQ;
import X.C0UO0;
import X.C470590Icr;
import X.C515801zg;
import X.C516201zk;
import X.C5183020f;
import X.C948450amx;
import X.InterfaceC302601Fg;
import X.InterfaceC302801Fi;
import X.InterfaceC921620a5g;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowAudienceAndGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowEndWhenAnchorResumeLive;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowSeiUpdateStart;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes.dex */
public final class LiveShowAudienceViewModel extends BaseLiveShowAudienceAndGuestViewModel {
    public static final /* synthetic */ int LLJJ = 0;
    public final MutableLiveData<Boolean> LLJILLL = new MutableLiveData<>(Boolean.FALSE);

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel
    public final void onInit() {
        super.onInit();
        InterfaceC921620a5g interfaceC921620a5g = (InterfaceC921620a5g) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (interfaceC921620a5g != null) {
            interfaceC921620a5g.LJJIJIL(this.LLJILJILJ);
        }
        DataChannel dataChannel = this.LLJI;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LLJIJIL, LiveShowSeiUpdateStart.class, new C5183020f(this, 54));
            dataChannel.BQ2(this.LLJIJIL, LiveShowEndWhenAnchorResumeLive.class, new C5183020f(this, 55));
        }
    }

    public final void HQ2(InterfaceC302801Fi interfaceC302801Fi) {
        AbstractC19484711Kz<C470590Icr<GetShowContentResponse.ResponseData>> showContent;
        this.LLJILJIL.setValue(GQ2());
        GetShowContentParams getShowContentParams = new GetShowContentParams();
        getShowContentParams.showId = BaseLiveShowViewModel.FQ2();
        getShowContentParams.channelId = getChannelId();
        getShowContentParams.roomId = this.LLJ;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null && (showContent = interfaceC302601FgLIZ.getShowContent(getShowContentParams)) != null) {
            EQ2().LIZ(showContent.LJFF(new C0UO0()).LJJIIZ(new C515801zg(this, interfaceC302801Fi, 14), new C516201zk(interfaceC302801Fi, 51)));
        }
    }
}
