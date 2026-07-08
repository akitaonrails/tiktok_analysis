package com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.anchor;

import X.AbstractC19484711Kz;
import X.AbstractC928510aGn;
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
import X.C515801zg;
import X.C516201zk;
import X.C5183020f;
import X.C948450amx;
import X.InterfaceC2217461Bqa;
import X.InterfaceC302401Fe;
import X.InterfaceC302601Fg;
import X.InterfaceC921620a5g;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowNextGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowZoomEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.MidLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.ShowConfig;

/* JADX INFO: loaded from: classes.dex */
public final class LiveShowAnchorViewModel extends MidLiveShowViewModel {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public C19487111Lx LLJJIII;
    public C19487111Lx LLJJIJI;
    public final C304201Fw LLJJIJIIJIL = new C304201Fw("ZOOM_SERVICE");

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveShowAnchorViewModel.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/common/IZoomInterface;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.MidLiveShowViewModel
    public final InterfaceC921620a5g HQ2() {
        return (InterfaceC921620a5g) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel
    public final void wQ2() {
        ShowConfig value;
        int i = MultiGuestLiveShowConfigSetting.INSTANCE.getSettingValue().muteAudioImBackUp;
        if (i <= 0 || (value = this.LLILZ.getValue()) == null || value.allowOpenMicFreely) {
            return;
        }
        new C11QI(AbstractC19484711Kz.LJIJJLI(1).LJIIIIZZ(i, TimeUnit.SECONDS).LJIIIZ(new C516201zk(this, 48))).LJIILL().LJIIZILJ();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.MidLiveShowViewModel, com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel
    public final void onInit() {
        super.onInit();
        DataChannel dataChannel = this.LLJI;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LLJIJIL, LiveShowNextGuestEvent.class, new C5183020f(this, 49));
            dataChannel.BQ2(this.LLJIJIL, LiveShowZoomEvent.class, new C5183020f(this, 50));
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LQ2(boolean z) {
        AbstractC19484711Kz<C470590Icr<GetShowContentResponse.ResponseData>> showContent;
        ArrayList arrayList;
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJJIII;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null && interfaceC302601FgLIZ.LJIIL() == 0) {
            MutableLiveData<List<LinkPlayerInfo>> mutableLiveData = this.LLJILJIL;
            InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null && (listLJJIII = abstractC928510aGnLIZ.LJJIII()) != null) {
                arrayList = new ArrayList();
                for (Object obj : listLJJIII) {
                    if (((LinkPlayerInfo) obj).mUser.getId() != UserService.getInstance().user().getCurrentUserId()) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            mutableLiveData.postValue(arrayList);
            return;
        }
        GetShowContentParams getShowContentParams = new GetShowContentParams();
        getShowContentParams.showId = BaseLiveShowViewModel.FQ2();
        getShowContentParams.channelId = getChannelId();
        getShowContentParams.roomId = this.LLJ;
        InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
        if (interfaceC302601FgLIZ2 != null && (showContent = interfaceC302601FgLIZ2.getShowContent(getShowContentParams)) != null) {
            EQ2().LIZ(showContent.LJFF(new C0UO0()).LJJIIZ(new C515501zd(this, z, 2), new C09JN() { // from class: X.01Fa
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    C1C7U.LIZ("LiveShowAnchorViewModel@f562.getShowList$2");
                    C20441214yg.LIZIZ("LiveShowAnchorViewModel", "getShowList failed");
                    C1C7U.LIZIZ("LiveShowAnchorViewModel@f562.getShowList$2");
                }
            }));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel
    public final void xQ2(int i) {
        MultiGuestLiveShowConfigSetting multiGuestLiveShowConfigSetting = MultiGuestLiveShowConfigSetting.INSTANCE;
        if (multiGuestLiveShowConfigSetting.getSettingValue().calibrateContentTime < 0 && !multiGuestLiveShowConfigSetting.isBackUpIm()) {
            return;
        }
        this.LLJJIII = (C19487111Lx) new C11QI(AbstractC19484711Kz.LJIJJLI(1).LJIIIIZZ(i + r1, TimeUnit.SECONDS).LJIIIZ(new C516201zk(this, 49))).LJIILL().LJIIZILJ();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel
    public final void yQ2(int i) {
        MultiGuestLiveShowConfigSetting multiGuestLiveShowConfigSetting = MultiGuestLiveShowConfigSetting.INSTANCE;
        if (multiGuestLiveShowConfigSetting.getSettingValue().calibrateContentTime < 0 && !multiGuestLiveShowConfigSetting.isBackUpIm()) {
            return;
        }
        this.LLJJIJI = (C19487111Lx) new C11QI(AbstractC19484711Kz.LJIJJLI(1).LJIIIIZZ(i + r1, TimeUnit.SECONDS).LJIIIZ(new C516201zk(this, 50))).LJIILL().LJIIZILJ();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel
    public final void zQ2(String str) {
        super.zQ2(str);
        this.LLILLJJLI.setValue(null);
        this.LLILLL.setValue(null);
        C19487111Lx c19487111Lx = this.LLJJIII;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        this.LLJJIII = null;
        C19487111Lx c19487111Lx2 = this.LLJJIJI;
        if (c19487111Lx2 != null) {
            c19487111Lx2.dispose();
        }
        this.LLJJIJI = null;
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
            EQ2().LIZ(abstractC19484711KzFinishGuest.LJFF(new C0UO0()).LJJIIZ(new C515801zg(this, function0, 13), new C09JN() { // from class: X.01Fc
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("LiveShowAnchorViewModel@f562.finishGuest$2");
                    C20441214yg.LIZIZ("LiveShowAnchorViewModel", "finish guest failed");
                    C1C7U.LIZIZ("LiveShowAnchorViewModel@f562.finishGuest$2");
                }
            }));
        }
    }
}
