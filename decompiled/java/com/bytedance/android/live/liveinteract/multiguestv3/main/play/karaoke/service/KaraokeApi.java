package com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.service;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C926820aE4;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.liveinteract.multilive.model.CancelViewerSingReq;
import com.bytedance.android.live.liveinteract.multilive.model.CancelViewerSingResp;
import com.bytedance.android.live.liveinteract.multilive.model.LetViewerSingReq;
import com.bytedance.android.live.liveinteract.multilive.model.LetViewerSingResp;
import com.bytedance.android.live.liveinteract.multilive.model.ManageViewerSingReq;
import com.bytedance.android.live.liveinteract.multilive.model.ManageViewerSingResp;

/* JADX INFO: loaded from: classes.dex */
public interface KaraokeApi {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/let_viewer_sing/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<LetViewerSingResp>> applyViewerSing(@InterfaceC1485405rg LetViewerSingReq letViewerSingReq);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/cancel_viewer_sing/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<CancelViewerSingResp>> cancelViewerSing(@InterfaceC1485405rg CancelViewerSingReq cancelViewerSingReq);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/manage_viewer_sing/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<ManageViewerSingResp>> manageViewerSing(@InterfaceC1485405rg ManageViewerSingReq manageViewerSingReq);
}
