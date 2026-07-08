package com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.api;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarCreateReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarCreateResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarDeleteReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarDeleteResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarGetReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarGetResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarListReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarListResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarLiveStartReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarLiveStartResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarLiveStopReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarLiveStopResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarReportReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarReportResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarStylizeReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarStylizeResp;

/* JADX INFO: loaded from: classes.dex */
public interface IAvatarAPI {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/avatar_create/")
    @InterfaceC1501310pAf({"content-type:application/json"})
    AbstractC19484711Kz<C470590Icr<AvatarCreateResp.ResponseData>> createAvatar(@InterfaceC1485405rg AvatarCreateReq avatarCreateReq);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/avatar_delete/")
    @InterfaceC1501310pAf({"content-type:application/json"})
    AbstractC19484711Kz<C470590Icr<AvatarDeleteResp.ResponseData>> deleteAvatar(@InterfaceC1485405rg AvatarDeleteReq avatarDeleteReq);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/avatar_list/")
    @InterfaceC1501310pAf({"content-type:application/json"})
    AbstractC19484711Kz<C470590Icr<AvatarListResp.ResponseData>> fetchAvatarList(@InterfaceC1485405rg AvatarListReq avatarListReq);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/avatar_get/")
    @InterfaceC1501310pAf({"content-type:application/json"})
    AbstractC19484711Kz<C470590Icr<AvatarGetResp.ResponseData>> getAvatar(@InterfaceC1485405rg AvatarGetReq avatarGetReq);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/avatar_report/")
    @InterfaceC1501310pAf({"content-type:application/json"})
    AbstractC19484711Kz<C470590Icr<AvatarReportResp.ResponseData>> reportIllegalAvatar(@InterfaceC1485405rg AvatarReportReq avatarReportReq);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/avatar_live_start/")
    @InterfaceC1501310pAf({"content-type:application/json"})
    AbstractC19484711Kz<C470590Icr<AvatarLiveStartResp.ResponseData>> startAvatarLive(@InterfaceC1485405rg AvatarLiveStartReq avatarLiveStartReq);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/avatar_live_stop/")
    @InterfaceC1501310pAf({"content-type:application/json"})
    AbstractC19484711Kz<C470590Icr<AvatarLiveStopResp.ResponseData>> stopAvatarLive(@InterfaceC1485405rg AvatarLiveStopReq avatarLiveStopReq);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_social/avatar_stylize/")
    @InterfaceC1501310pAf({"content-type:application/json"})
    AbstractC19484711Kz<C470590Icr<AvatarStylizeResp.ResponseData>> stylizedPicture(@InterfaceC1485405rg AvatarStylizeReq avatarStylizeReq);
}
