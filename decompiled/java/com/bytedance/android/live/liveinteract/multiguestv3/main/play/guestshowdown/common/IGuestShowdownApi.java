package com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.liveinteract.multilive.model.GuestShowdownCloseParams;
import com.bytedance.android.live.liveinteract.multilive.model.GuestShowdownCloseResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GuestShowdownFinishToPunishmentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GuestShowdownFinishToPunishmentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GuestShowdownGetContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GuestShowdownGetContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GuestShowdownStartParams;
import com.bytedance.android.live.liveinteract.multilive.model.GuestShowdownStartResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GuestShowdownUpdateParams;
import com.bytedance.android.live.liveinteract.multilive.model.GuestShowdownUpdateResponse;

/* JADX INFO: loaded from: classes.dex */
public interface IGuestShowdownApi {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/guest_showdown/close/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<GuestShowdownCloseResponse.ResponseData>> close(@InterfaceC1485405rg GuestShowdownCloseParams guestShowdownCloseParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/guest_showdown/finish_to_punishment/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<GuestShowdownFinishToPunishmentResponse.ResponseData>> finishToPunishment(@InterfaceC1485405rg GuestShowdownFinishToPunishmentParams guestShowdownFinishToPunishmentParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/guest_showdown/get_content/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<GuestShowdownGetContentResponse.ResponseData>> getContent(@InterfaceC1485405rg GuestShowdownGetContentParams guestShowdownGetContentParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/guest_showdown/start/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<GuestShowdownStartResponse.ResponseData>> start(@InterfaceC1485405rg GuestShowdownStartParams guestShowdownStartParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/guest_showdown/update/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<GuestShowdownUpdateResponse.ResponseData>> update(@InterfaceC1485405rg GuestShowdownUpdateParams guestShowdownUpdateParams);
}
