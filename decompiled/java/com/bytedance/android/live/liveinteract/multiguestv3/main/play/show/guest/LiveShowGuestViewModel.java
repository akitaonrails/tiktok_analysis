package com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.guest;

import X.AbstractC19484711Kz;
import X.C01FQ;
import X.C09JN;
import X.C0UO0;
import X.C11QI;
import X.C13LE;
import X.C19487111Lx;
import X.C2217381BqS;
import X.C304201Fw;
import X.C470590Icr;
import X.C515501zd;
import X.C516201zk;
import X.C5183020f;
import X.C948450amx;
import X.InterfaceC2217461Bqa;
import X.InterfaceC302601Fg;
import X.InterfaceC921620a5g;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowAudienceAndGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowZoomEvent;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class LiveShowGuestViewModel extends BaseLiveShowAudienceAndGuestViewModel {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public C19487111Lx LLJILLL;
    public final C304201Fw LLJJ = new C304201Fw("ZOOM_SERVICE");

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveShowGuestViewModel.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/common/IZoomInterface;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel
    public final void onInit() {
        super.onInit();
        InterfaceC921620a5g interfaceC921620a5g = (InterfaceC921620a5g) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
        if (interfaceC921620a5g != null) {
            interfaceC921620a5g.LJJIJIL(this.LLJILJILJ);
        }
        DataChannel dataChannel = this.LLJI;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LLJIJIL, LiveShowZoomEvent.class, new C5183020f(this, 64));
        }
    }

    public final void HQ2(boolean z) {
        AbstractC19484711Kz<C470590Icr<GetShowContentResponse.ResponseData>> showContent;
        this.LLJILJIL.setValue(GQ2());
        GetShowContentParams getShowContentParams = new GetShowContentParams();
        getShowContentParams.showId = BaseLiveShowViewModel.FQ2();
        getShowContentParams.channelId = getChannelId();
        getShowContentParams.roomId = this.LLJ;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null && (showContent = interfaceC302601FgLIZ.getShowContent(getShowContentParams)) != null) {
            EQ2().LIZ(showContent.LJFF(new C0UO0()).LJJIIZ(new C515501zd(this, z, 3), new C09JN() { // from class: X.01Fh
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("LiveShowGuestViewModel@6827.getShowList$2");
                    C20441214yg.LIZIZ("LiveShowGuestViewModel", "getShowList failed");
                    C1C7U.LIZIZ("LiveShowGuestViewModel@6827.getShowList$2");
                }
            }));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel
    public final void yQ2(int i) {
        MultiGuestLiveShowConfigSetting multiGuestLiveShowConfigSetting = MultiGuestLiveShowConfigSetting.INSTANCE;
        if (multiGuestLiveShowConfigSetting.getSettingValue().calibrateContentTime < 0 && !multiGuestLiveShowConfigSetting.isBackUpIm()) {
            return;
        }
        this.LLJILLL = (C19487111Lx) new C11QI(AbstractC19484711Kz.LJIJJLI(1).LJIIIIZZ(i + r1, TimeUnit.SECONDS).LJIIIZ(new C516201zk(this, 57))).LJIILL().LJIIZILJ();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel
    public final void zQ2(String str) {
        super.zQ2(str);
        this.LLILLJJLI.setValue(null);
        C19487111Lx c19487111Lx = this.LLJILLL;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        this.LLJILLL = null;
    }
}
