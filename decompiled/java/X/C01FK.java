package X;

import com.bytedance.android.live.liveinteract.multilive.model.CreateShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowSettingsParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowSettingsResponse;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateUserPlaySettingsParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateUserPlaySettingsResponse;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tikcast.linkmic.common.LinkerMediaChangeOperator;
import webcast.data.multi_guest_play.ShowContent;
import webcast.im.LiveShowMessage;

/* JADX INFO: renamed from: X.01FK, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01FK implements C01FL {
    public final DataChannel LIZ;
    public C01FJ LIZIZ;
    public C01F9 LIZJ;
    public C01FV LIZLLL;

    public C01FK() {
        this(null);
    }

    @Override // X.C01FL
    public final void LJ() {
    }

    @Override // X.C01FL
    public final void LJI(List<String> list) {
    }

    @Override // X.C01FL
    public final void destroy() {
    }

    @Override // X.C01FL
    public final void LIZIZ() {
        C01F9 c01f9 = this.LIZJ;
        if (c01f9 != null) {
            c01f9.LIZIZ();
        }
        this.LIZIZ.LIZIZ();
    }

    @Override // X.C01FL
    public final Long LJII() {
        Long lLJII;
        C923330a8R c923330a8R = C923330a8R.LIZ;
        C923330a8R.LJIILIIL("LiveShowModeratorModelAdapter_getShowId");
        C01F9 c01f9 = this.LIZJ;
        return Long.valueOf(((c01f9 == null || (lLJII = c01f9.LJII()) == null) && (lLJII = this.LIZIZ.LJII()) == null) ? 0L : lLJII.longValue());
    }

    @Override // X.C01FL
    public final boolean LJIIJ() {
        C01FJ c01fj = this.LIZJ;
        if (c01fj == null) {
            c01fj = this.LIZIZ;
        }
        return c01fj.LJ;
    }

    @Override // X.C01FL
    public final Map<Integer, Boolean> LJIIJJI() {
        Map<Integer, Boolean> mapLJIIJJI;
        C01F9 c01f9 = this.LIZJ;
        return (c01f9 == null || (mapLJIIJJI = c01f9.LJIIJJI()) == null) ? this.LIZIZ.LJIIJJI() : mapLJIIJJI;
    }

    @Override // X.C01FL
    public final int LJIIL() {
        C01FL c01fl = this.LIZJ;
        if (c01fl == null) {
            c01fl = this.LIZIZ;
        }
        return c01fl.LJIIL();
    }

    @Override // X.C01FL
    public final List<CreateShowParams.ListUser> LJIILIIL() {
        return new ArrayList();
    }

    @Override // X.C01FL
    public final ShowContent getContent() {
        ShowContent showContent;
        C01F9 c01f9 = this.LIZJ;
        return (c01f9 == null || (showContent = c01f9.LIZJ) == null) ? this.LIZIZ.LIZJ : showContent;
    }

    public C01FK(DataChannel dataChannel) {
        this.LIZ = dataChannel;
        this.LIZIZ = new C01FB(dataChannel);
    }

    @Override // X.C01FL
    public final void LIZ(SeiAppData seiAppData) {
        C923330a8R c923330a8R = C923330a8R.LIZ;
        C923330a8R.LJIILIIL("LiveShowModeratorModelAdapter_parseSeiToModel ");
        C01F9 c01f9 = this.LIZJ;
        if (c01f9 != null) {
            c01f9.LJJIII(seiAppData);
        }
        this.LIZIZ.LIZ(seiAppData);
    }

    @Override // X.C01FL
    public final long LIZJ(long j) {
        C01FL c01fl = this.LIZJ;
        if (c01fl == null) {
            c01fl = this.LIZIZ;
        }
        return c01fl.LIZJ(j);
    }

    @Override // X.C01FL
    public final void LIZLLL(String str) {
        C923330a8R c923330a8R = C923330a8R.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveShowModeratorModelAdapter_clearCache source:");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        C923330a8R.LJIILIIL(C2188811AlT.LIZIZ(sbLIZ));
        C01F9 c01f9 = this.LIZJ;
        if (c01f9 != null) {
            c01f9.LIZLLL(str);
        }
        this.LIZIZ.LIZLLL(str);
    }

    @Override // X.C01FL
    public final void LJFF(C01FR c01fr) {
        C923330a8R c923330a8R = C923330a8R.LIZ;
        C923330a8R.LJIILIIL("LiveShowModeratorModelAdapter_addLiveShowStateChangeListener");
        C01F9 c01f9 = this.LIZJ;
        if (c01f9 != null) {
            c01f9.LJFF(c01fr);
            return;
        }
        C01FJ c01fj = this.LIZIZ;
        if (c01fj == null) {
            return;
        }
        c01fj.LJFF(c01fr);
    }

    @Override // X.C01FL
    public final void LJIIIIZZ(ShowContent showContent) {
        C01F9 c01f9 = this.LIZJ;
        if (c01f9 != null) {
            c01f9.LJIIIIZZ(showContent);
        }
        this.LIZIZ.LJIIIIZZ(showContent);
    }

    @Override // X.C01FL
    public final void LJIIIZ(C01FR c01fr) {
        C923330a8R c923330a8R = C923330a8R.LIZ;
        C923330a8R.LJIILIIL("LiveShowModeratorModelAdapter_removeLiveShowStateChangeListener");
        C01F9 c01f9 = this.LIZJ;
        if (c01f9 != null) {
            c01f9.LJIIIZ(c01fr);
        }
        C01FJ c01fj = this.LIZIZ;
        if (c01fj != null) {
            c01fj.LJIIIZ(c01fr);
        }
    }

    @Override // X.C01FL
    public final long LJIILL(String str) {
        C01FL c01fl = this.LIZJ;
        if (c01fl == null) {
            c01fl = this.LIZIZ;
        }
        return c01fl.LJIILL(str);
    }

    @Override // X.C01FL
    public final AbstractC19484711Kz<C470590Icr<FinishShowingGuestResponse.ResponseData>> LJIJ(FinishShowingGuestParams finishShowingGuestParams) {
        C01F9 c01f9 = this.LIZJ;
        if (c01f9 != null) {
            return c01f9.LJIJ(finishShowingGuestParams);
        }
        return this.LIZIZ.LJIJ(finishShowingGuestParams);
    }

    @Override // X.C01FL
    public final void LJIJI(LiveShowMessage liveShowMessage) {
        C01F9 c01f9 = this.LIZJ;
        if (c01f9 != null) {
            c01f9.LJIJI(liveShowMessage);
        }
        this.LIZIZ.LJIJI(liveShowMessage);
    }

    @Override // X.C01FL
    public final void LJJ(LiveShowMessage liveShowMessage) {
        C01F9 c01f9 = this.LIZJ;
        if (c01f9 != null) {
            c01f9.LJJ(liveShowMessage);
        }
        this.LIZIZ.LJJ(liveShowMessage);
    }

    @Override // X.C01FL
    public final AbstractC19484711Kz<C470590Icr<CreateShowResponse.ResponseData>> createShow(CreateShowParams createShowParams) {
        C923330a8R c923330a8R = C923330a8R.LIZ;
        C923330a8R.LJIILIIL("LiveShowModeratorModelAdapter_createShow");
        C01F9 c01f9 = this.LIZJ;
        if (c01f9 != null) {
            return c01f9.createShow(createShowParams);
        }
        return this.LIZIZ.createShow(createShowParams);
    }

    @Override // X.C01FL
    public final AbstractC19484711Kz<C470590Icr<EndShowResponse.ResponseData>> endShow(EndShowParams endShowParams) {
        C01F9 c01f9 = this.LIZJ;
        if (c01f9 != null) {
            return c01f9.endShow(endShowParams);
        }
        return AbstractC19484711Kz.LJIILLIIL(new Throwable("endShow not handle as currentModeratorLiveShowModel is null,please check!"));
    }

    @Override // X.C01FL
    public final AbstractC19484711Kz<C470590Icr<GetShowContentResponse.ResponseData>> getShowContent(GetShowContentParams getShowContentParams) {
        C01F9 c01f9 = this.LIZJ;
        if (c01f9 != null) {
            return c01f9.getShowContent(getShowContentParams);
        }
        return this.LIZIZ.getShowContent(getShowContentParams);
    }

    @Override // X.C01FL
    public final AbstractC19484711Kz<C470590Icr<GetShowSettingsResponse.ResponseData>> getShowSetting(GetShowSettingsParams getShowSettingsParams) {
        C01F9 c01f9 = this.LIZJ;
        if (c01f9 != null) {
            return c01f9.getShowSetting(getShowSettingsParams);
        }
        return AbstractC19484711Kz.LJIILLIIL(new Throwable("getShowSetting not handle as currentModeratorLiveShowModel is null,please check!"));
    }

    @Override // X.C01FL
    public final AbstractC19484711Kz<C470590Icr<ShowAgainGuestResponse.ResponseData>> showAgainGuest(ShowAgainGuestParams showAgainGuestParams) {
        C01F9 c01f9 = this.LIZJ;
        if (c01f9 != null) {
            return c01f9.showAgainGuest(showAgainGuestParams);
        }
        return AbstractC19484711Kz.LJIILLIIL(new Throwable("showAgainGuest not handle as currentModeratorLiveShowModel is null,please check!"));
    }

    @Override // X.C01FL
    public final AbstractC19484711Kz<C470590Icr<UpdateShowContentResponse.ResponseData>> updateShowContent(UpdateShowContentParams updateShowContentParams) {
        C01F9 c01f9 = this.LIZJ;
        if (c01f9 != null) {
            return c01f9.updateShowContent(updateShowContentParams);
        }
        return this.LIZIZ.updateShowContent(updateShowContentParams);
    }

    @Override // X.C01FL
    public final AbstractC19484711Kz<C470590Icr<UpdateUserPlaySettingsResponse.ResponseData>> updateUserPlaySettings(UpdateUserPlaySettingsParams updateUserPlaySettingsParams) {
        return AbstractC19484711Kz.LJIJJLI(new C470590Icr());
    }

    @Override // X.C01FL
    public final void LJIILJJIL(LiveShowMessage liveShowMessage, LinkerMediaChangeOperator linkerMediaChangeOperator) {
        C01F9 c01f9 = this.LIZJ;
        if (c01f9 != null) {
            c01f9.LJIILJJIL(liveShowMessage, linkerMediaChangeOperator);
        }
        this.LIZIZ.LJIILJJIL(liveShowMessage, linkerMediaChangeOperator);
    }

    @Override // X.C01FL
    public final void LJIILLIIL(LiveShowMessage liveShowMessage, LinkerMediaChangeOperator linkerMediaChangeOperator) {
        C01F9 c01f9 = this.LIZJ;
        if (c01f9 != null) {
            c01f9.LJIILLIIL(liveShowMessage, linkerMediaChangeOperator);
        }
        this.LIZIZ.LJIILLIIL(liveShowMessage, linkerMediaChangeOperator);
    }

    @Override // X.C01FL
    public final void LJIIZILJ(ShowContent showContent, LinkerMediaChangeOperator linkerMediaChangeOperator) {
        C01F9 c01f9 = this.LIZJ;
        if (c01f9 != null) {
            c01f9.LJIIZILJ(showContent, linkerMediaChangeOperator);
        }
        this.LIZIZ.LJIIZILJ(showContent, linkerMediaChangeOperator);
    }

    @Override // X.C01FL
    public final void LJIJJ(ShowContent showContent, LinkerMediaChangeOperator linkerMediaChangeOperator) {
        C01F9 c01f9 = this.LIZJ;
        if (c01f9 != null) {
            c01f9.LJIJJ(showContent, linkerMediaChangeOperator);
        }
        this.LIZIZ.LJIJJ(showContent, linkerMediaChangeOperator);
    }

    @Override // X.C01FL
    public final void LJIL(ShowContent showContent, LinkerMediaChangeOperator linkerMediaChangeOperator) {
        C01F9 c01f9 = this.LIZJ;
        if (c01f9 != null) {
            c01f9.LJIL(showContent, linkerMediaChangeOperator);
        }
        this.LIZIZ.LJIL(showContent, linkerMediaChangeOperator);
    }

    @Override // X.C01FL
    public final void LJIJJLI(long j, long j2, String str) {
        C01F9 c01f9 = this.LIZJ;
        if (c01f9 != null) {
            c01f9.LJIJJLI(j, j2, "LinkMicFanTicketMethod");
        }
        this.LIZIZ.LJIJJLI(j, j2, "LinkMicFanTicketMethod");
    }
}
