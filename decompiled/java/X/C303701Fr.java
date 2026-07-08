package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.anchor.LiveShowAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.anchor.LiveShowAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.MidLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentResponse;
import webcast.data.multi_guest_play.ShowConfig;

/* JADX INFO: renamed from: X.01Fr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C303701Fr implements InterfaceC430901lz {
    public final /* synthetic */ LiveShowAnchorWidget LIZ;

    @Override // X.InterfaceC430901lz
    public final void LIZ() {
    }

    @Override // X.InterfaceC430901lz
    public final void LIZLLL(String str) {
    }

    @Override // X.InterfaceC430901lz
    public final void LJFF(ShowConfig showConfig) {
    }

    @Override // X.InterfaceC430901lz
    public final void LIZIZ() {
        this.LIZ.N1();
    }

    public C303701Fr(LiveShowAnchorWidget liveShowAnchorWidget) {
        this.LIZ = liveShowAnchorWidget;
    }

    @Override // X.InterfaceC430901lz
    public final void LIZJ(ShowConfig showConfig) {
        MidLiveShowViewModel midLiveShowViewModel = (MidLiveShowViewModel) this.LIZ.LLILLJJLI;
        if (midLiveShowViewModel != null) {
            midLiveShowViewModel.JQ2(showConfig);
        }
    }

    @Override // X.InterfaceC430901lz
    public final void LJ(int i) {
        MidLiveShowViewModel midLiveShowViewModel = (MidLiveShowViewModel) this.LIZ.LLILLJJLI;
        if (midLiveShowViewModel != null) {
            midLiveShowViewModel.LLJILLL = i;
        }
    }

    @Override // X.InterfaceC430901lz
    public final void LJI(ShowConfig showConfig) {
        AbstractC19484711Kz<C470590Icr<UpdateShowContentResponse.ResponseData>> abstractC19484711KzUpdateShowContent;
        LiveShowAnchorViewModel liveShowAnchorViewModel = (LiveShowAnchorViewModel) this.LIZ.LLILLJJLI;
        if (liveShowAnchorViewModel != null) {
            boolean z = showConfig.allowOpenMicFreely;
            UpdateShowContentParams updateShowContentParams = new UpdateShowContentParams();
            updateShowContentParams.roomId = liveShowAnchorViewModel.LLJ;
            updateShowContentParams.channelId = liveShowAnchorViewModel.getChannelId();
            updateShowContentParams.allowOpenMicFreely = z;
            updateShowContentParams.showId = BaseLiveShowViewModel.FQ2();
            updateShowContentParams.updateType = 1;
            ShowConfig value = liveShowAnchorViewModel.LLILZ.getValue();
            if (value != null) {
                updateShowContentParams.transitionDurationOfConfig = value.transitionDurationOfConfig;
            }
            InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
            if (interfaceC302601FgLIZ != null && (abstractC19484711KzUpdateShowContent = interfaceC302601FgLIZ.updateShowContent(updateShowContentParams)) != null) {
                liveShowAnchorViewModel.EQ2().LIZ(abstractC19484711KzUpdateShowContent.LJFF(new C0UO0()).LJJIIZ(new C515501zd(liveShowAnchorViewModel, z, 7), new C09JN() { // from class: X.00S9
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("LiveShowAnchorViewModel@f562.updateShowConfig$2");
                        C20441214yg.LIZIZ("LiveShowAnchorViewModel", "updateShowList failed");
                        C1C7U.LIZIZ("LiveShowAnchorViewModel@f562.updateShowConfig$2");
                    }
                }));
            }
        }
    }
}
