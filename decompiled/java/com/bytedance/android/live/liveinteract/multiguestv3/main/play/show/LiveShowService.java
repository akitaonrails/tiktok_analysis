package com.bytedance.android.live.liveinteract.multiguestv3.main.play.show;

import X.AbstractC19484711Kz;
import X.C01F9;
import X.C01FC;
import X.C01FJ;
import X.C01FK;
import X.C01FL;
import X.C01FN;
import X.C01FR;
import X.C01HE;
import X.C1954807lC;
import X.C20441214yg;
import X.C2188811AlT;
import X.C470590Icr;
import X.C923330a8R;
import X.InterfaceC302601Fg;
import X.InterfaceC948500an2;
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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC948500an2(name = "LIVE_SHOW_SERVICE")
public final class LiveShowService implements InterfaceC302601Fg {
    public static boolean LIZJ;
    public final DataChannel LIZ;
    public volatile C01FL LIZIZ;

    public LiveShowService() {
        this(null);
    }

    public static boolean LJIJJLI() {
        return LIZJ;
    }

    @Override // X.InterfaceC302601Fg
    public final Map<Integer, Boolean> LJIIJJI() {
        return this.LIZIZ.LJIIJJI();
    }

    @Override // X.InterfaceC302601Fg
    public final List<CreateShowParams.ListUser> LJIILIIL() {
        return this.LIZIZ.LJIILIIL();
    }

    @Override // X.InterfaceC302601Fg
    public final ShowContent getContent() {
        return this.LIZIZ.getContent();
    }

    @Override // X.InterfaceC302601Fg
    public final void LIZIZ() {
        if (LJIJJLI()) {
            C20441214yg.LJ("LiveShowService", "call updateMatchTotalScore after service disabled");
        } else {
            this.LIZIZ.LIZIZ();
        }
    }

    @Override // X.InterfaceC302601Fg
    public final Long LJII() {
        if (LJIJJLI()) {
            return 0L;
        }
        return this.LIZIZ.LJII();
    }

    @Override // X.InterfaceC302601Fg
    public final boolean LJIIJ() {
        if (LJIJJLI()) {
            return false;
        }
        return this.LIZIZ.LJIIJ();
    }

    @Override // X.InterfaceC302601Fg
    public final int LJIIL() {
        if (!LJIJJLI()) {
            return this.LIZIZ.LJIIL();
        }
        C20441214yg.LJ("LiveShowService", "call getCurrentLiveShowState after service disabled");
        return 0;
    }

    @Override // X.InterfaceC302601Fg
    public final ShowListUser LJIILL() {
        List<ShowListUser> list;
        ShowContent content = getContent();
        ShowListUser showListUser = null;
        if (content == null || (list = content.finishedList) == null || list.isEmpty()) {
            return null;
        }
        int i = Integer.MIN_VALUE;
        for (ShowListUser showListUser2 : list) {
            int i2 = showListUser2.order;
            if (i < i2) {
                showListUser = showListUser2;
                i = i2;
            }
        }
        return showListUser;
    }

    @Override // X.InterfaceC302601Fg
    public final ShowListUser LJIILLIIL() {
        List<ShowListUser> list;
        int i;
        ShowContent content = getContent();
        ShowListUser showListUser = null;
        if (content == null || (list = content.showingAndReadyList) == null || list.isEmpty()) {
            return null;
        }
        int i2 = Integer.MAX_VALUE;
        for (ShowListUser showListUser2 : list) {
            if (showListUser2.status == 1 && i2 > (i = showListUser2.order)) {
                showListUser = showListUser2;
                i2 = i;
            }
        }
        return showListUser;
    }

    @Override // X.InterfaceC302601Fg
    public final boolean LJIJI() {
        return !LJIJJLI() && LJIIL() > 0;
    }

    @Override // X.InterfaceC302601Fg
    public final DataChannel LJIJ() {
        return this.LIZ;
    }

    public LiveShowService(DataChannel dataChannel) {
        C01FL c01fc;
        this.LIZ = dataChannel;
        int i = C01FN.LIZ[C01HE.LJ().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new C1954807lC();
            }
            c01fc = new C01FK(dataChannel);
        } else {
            c01fc = new C01FC(dataChannel);
        }
        this.LIZIZ = c01fc;
    }

    @Override // X.InterfaceC302601Fg
    public final void LIZ(SeiAppData seiAppData) {
        if (LJIJJLI()) {
            return;
        }
        this.LIZIZ.LIZ(seiAppData);
    }

    @Override // X.InterfaceC302601Fg
    public final long LIZJ(long j) {
        if (LJIJJLI()) {
            C20441214yg.LJ("LiveShowService", "call updateMatchTotalScore after service disabled");
            return 0L;
        }
        return this.LIZIZ.LIZJ(j);
    }

    @Override // X.InterfaceC302601Fg
    public final void LIZLLL(String str) {
        this.LIZIZ.LIZLLL(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.01F9] */
    @Override // X.InterfaceC302601Fg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C01FV r6) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.LiveShowService.LJ(X.01FV):void");
    }

    @Override // X.InterfaceC302601Fg
    public final void LJFF(C01FR c01fr) {
        if (LJIJJLI()) {
            C20441214yg.LJ("LiveShowService", "call addLiveShowStateChangeListener after service disabled");
        } else {
            this.LIZIZ.LJFF(c01fr);
        }
    }

    @Override // X.InterfaceC302601Fg
    public final void LJI(List<String> list) {
        this.LIZIZ.LJI(list);
    }

    @Override // X.InterfaceC302601Fg
    public final void LJIIIIZZ(ShowContent showContent) {
        if (LJIJJLI()) {
            C20441214yg.LJ("LiveShowService", "call updateMatchTotalScore after service disabled");
        } else {
            this.LIZIZ.LJIIIIZZ(showContent);
        }
    }

    @Override // X.InterfaceC302601Fg
    public final void LJIIIZ(C01FR c01fr) {
        if (LJIJJLI()) {
            C20441214yg.LJ("LiveShowService", "call addLiveShowStateChangeListener after service disabled");
        } else {
            this.LIZIZ.LJIIIZ(c01fr);
        }
    }

    @Override // X.InterfaceC302601Fg
    public final void LJIILJJIL(ShowContent showContent) {
        LJIIIIZZ(showContent);
        this.LIZIZ.LJ();
    }

    @Override // X.InterfaceC302601Fg
    public final long LJIIZILJ(String str) {
        return this.LIZIZ.LJIILL(str);
    }

    @Override // X.InterfaceC302601Fg
    public final void LLD(boolean z) {
        C01FL c01fl = this.LIZIZ;
        if (c01fl instanceof C01FK) {
            C01FK c01fk = (C01FK) c01fl;
            c01fk.getClass();
            C923330a8R c923330a8R = C923330a8R.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LiveShowModeratorModelAdapter_destroy:isModerator");
            sbLIZ.append(z);
            sbLIZ.append(' ');
            C923330a8R.LJIILIIL(C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                C01F9 c01f9 = c01fk.LIZJ;
                if (c01f9 != null) {
                    c01f9.destroy();
                    return;
                }
                return;
            }
            C01FJ c01fj = c01fk.LIZIZ;
            if (c01fj == null) {
                return;
            }
            c01fj.destroy();
            return;
        }
        c01fl.destroy();
    }

    @Override // X.InterfaceC302601Fg
    public final AbstractC19484711Kz<C470590Icr<CreateShowResponse.ResponseData>> createShow(CreateShowParams createShowParams) {
        if (LJIJJLI()) {
            C20441214yg.LJ("LiveShowService", "call createShow after service disabled");
            return AbstractC19484711Kz.LJIJJLI(new C470590Icr());
        }
        Map<Integer, Boolean> mapLJIIJJI = this.LIZIZ.LJIIJJI();
        Iterator<Map.Entry<Integer, Boolean>> it2 = mapLJIIJJI.entrySet().iterator();
        while (it2.hasNext()) {
            mapLJIIJJI.put(it2.next().getKey(), Boolean.FALSE);
        }
        return this.LIZIZ.createShow(createShowParams);
    }

    @Override // X.InterfaceC302601Fg
    public final AbstractC19484711Kz<C470590Icr<EndShowResponse.ResponseData>> endShow(EndShowParams endShowParams) {
        if (LJIJJLI()) {
            C20441214yg.LJ("LiveShowService", "call endShow after service disabled");
            return AbstractC19484711Kz.LJIJJLI(new C470590Icr());
        }
        Map<Integer, Boolean> mapLJIIJJI = this.LIZIZ.LJIIJJI();
        Iterator<Map.Entry<Integer, Boolean>> it2 = mapLJIIJJI.entrySet().iterator();
        while (it2.hasNext()) {
            mapLJIIJJI.put(it2.next().getKey(), Boolean.FALSE);
        }
        return this.LIZIZ.endShow(endShowParams);
    }

    @Override // X.InterfaceC302601Fg
    public final AbstractC19484711Kz<C470590Icr<FinishShowingGuestResponse.ResponseData>> finishGuest(FinishShowingGuestParams finishShowingGuestParams) {
        if (LJIJJLI()) {
            C20441214yg.LJ("LiveShowService", "call finishGuest after service disabled");
            return AbstractC19484711Kz.LJIJJLI(new C470590Icr());
        }
        return this.LIZIZ.LJIJ(finishShowingGuestParams);
    }

    @Override // X.InterfaceC302601Fg
    public final AbstractC19484711Kz<C470590Icr<GetShowContentResponse.ResponseData>> getShowContent(GetShowContentParams getShowContentParams) {
        if (LJIJJLI()) {
            C20441214yg.LJ("LiveShowService", "call getShowContent after service disabled");
            return AbstractC19484711Kz.LJIJJLI(new C470590Icr());
        }
        return this.LIZIZ.getShowContent(getShowContentParams);
    }

    @Override // X.InterfaceC302601Fg
    public final AbstractC19484711Kz<C470590Icr<GetShowSettingsResponse.ResponseData>> getShowSetting(GetShowSettingsParams getShowSettingsParams) {
        if (LJIJJLI()) {
            C20441214yg.LJ("LiveShowService", "call getShowSetting after service disabled");
            return AbstractC19484711Kz.LJIJJLI(new C470590Icr());
        }
        return this.LIZIZ.getShowSetting(getShowSettingsParams);
    }

    @Override // X.InterfaceC302601Fg
    public final AbstractC19484711Kz<C470590Icr<ShowAgainGuestResponse.ResponseData>> showAgainGuest(ShowAgainGuestParams showAgainGuestParams) {
        if (LJIJJLI()) {
            C20441214yg.LJ("LiveShowService", "call showAgainGuest after service disabled");
            return AbstractC19484711Kz.LJIJJLI(new C470590Icr());
        }
        return this.LIZIZ.showAgainGuest(showAgainGuestParams);
    }

    @Override // X.InterfaceC302601Fg
    public final AbstractC19484711Kz<C470590Icr<UpdateShowContentResponse.ResponseData>> updateShowContent(UpdateShowContentParams updateShowContentParams) {
        if (LJIJJLI()) {
            C20441214yg.LJ("LiveShowService", "call updateShowContent after service disabled");
            return AbstractC19484711Kz.LJIJJLI(new C470590Icr());
        }
        return this.LIZIZ.updateShowContent(updateShowContentParams);
    }

    @Override // X.InterfaceC302601Fg
    public final AbstractC19484711Kz<C470590Icr<UpdateUserPlaySettingsResponse.ResponseData>> updateUserPlaySettings(UpdateUserPlaySettingsParams updateUserPlaySettingsParams) {
        return this.LIZIZ.updateUserPlaySettings(updateUserPlaySettingsParams);
    }

    @Override // X.InterfaceC302601Fg
    public final void LJIJJ(long j, long j2) {
        if (LJIJJLI()) {
            C20441214yg.LJ("LiveShowService", "call updateMatchTotalScore after service disabled");
        } else {
            this.LIZIZ.LJIJJLI(j, j2, "LinkMicFanTicketMethod");
        }
    }
}
