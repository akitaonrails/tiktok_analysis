package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.liveinteract.multilive.model.GetNoticeboardMaterialContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetNoticeboardMaterialContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetNoticeboardTemplateParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetNoticeboardTemplateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetRunningNoticeboardMaterialContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetRunningNoticeboardMaterialContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetUploadAuthParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetUploadAuthResponse;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardCreateParams;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardCreateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardEndParams;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardEndResponse;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardGetContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardGetContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardGetUserRestrictedHistoryParams;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardGetUserRestrictedHistoryResponse;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardMaterialCreateParams;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardMaterialCreateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardOfficialTemplateCreateParams;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardOfficialTemplateCreateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardOfficialTemplateUpdateParams;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardOfficialTemplateUpdateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateCreateParams;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateCreateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateDeleteParams;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateDeleteResponse;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateFetchListParams;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateFetchListResponse;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateSaveParams;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateSaveResponse;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateUpdateParams;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateUpdateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardUpdateParams;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardUpdateResponse;

/* JADX INFO: loaded from: classes.dex */
public interface INoticeboardApi {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/noticeboard/create/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<NoticeboardCreateResponse.ResponseData>> createNoticeboard(@InterfaceC1485405rg NoticeboardCreateParams noticeboardCreateParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/noticeboard/material_create/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<NoticeboardMaterialCreateResponse.ResponseData>> createNoticeboardMaterial(@InterfaceC1485405rg NoticeboardMaterialCreateParams noticeboardMaterialCreateParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/noticeboard/official_template/create/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<NoticeboardOfficialTemplateCreateResponse.ResponseData>> createOfficialTemplate(@InterfaceC1485405rg NoticeboardOfficialTemplateCreateParams noticeboardOfficialTemplateCreateParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/noticeboard/template/create/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<NoticeboardTemplateCreateResponse.ResponseData>> createTemplate(@InterfaceC1485405rg NoticeboardTemplateCreateParams noticeboardTemplateCreateParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/noticeboard/template/delete/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<NoticeboardTemplateDeleteResponse.ResponseData>> deleteTemplate(@InterfaceC1485405rg NoticeboardTemplateDeleteParams noticeboardTemplateDeleteParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/noticeboard/end/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<NoticeboardEndResponse.ResponseData>> endNoticeboard(@InterfaceC1485405rg NoticeboardEndParams noticeboardEndParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/get_upload_auth/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    C11NZ<C470590Icr<GetUploadAuthResponse.ResponseData>> fetchImageUploadToken(@InterfaceC1485405rg GetUploadAuthParams getUploadAuthParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/noticeboard/template/fetch_list/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<NoticeboardTemplateFetchListResponse.ResponseData>> fetchTemplateList(@InterfaceC1485405rg NoticeboardTemplateFetchListParams noticeboardTemplateFetchListParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/noticeboard/get_content/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<NoticeboardGetContentResponse.ResponseData>> getNoticeboardContent(@InterfaceC1485405rg NoticeboardGetContentParams noticeboardGetContentParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/noticeboard/get_material_content/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<GetNoticeboardMaterialContentResponse.ResponseData>> getNoticeboardMaterial(@InterfaceC1485405rg GetNoticeboardMaterialContentParams getNoticeboardMaterialContentParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/noticeboard/get_template/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<GetNoticeboardTemplateResponse.ResponseData>> getNoticeboardTemplate(@InterfaceC1485405rg GetNoticeboardTemplateParams getNoticeboardTemplateParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/noticeboard/get_running_material_content/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<GetRunningNoticeboardMaterialContentResponse.ResponseData>> getRunningMaterialContent(@InterfaceC1485405rg GetRunningNoticeboardMaterialContentParams getRunningNoticeboardMaterialContentParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/noticeboard/get_user_restricted_history/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<NoticeboardGetUserRestrictedHistoryResponse.ResponseData>> getUserRestrictedHistory(@InterfaceC1485405rg NoticeboardGetUserRestrictedHistoryParams noticeboardGetUserRestrictedHistoryParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/noticeboard/template/save/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<NoticeboardTemplateSaveResponse.ResponseData>> saveTemplate(@InterfaceC1485405rg NoticeboardTemplateSaveParams noticeboardTemplateSaveParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/noticeboard/update/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<NoticeboardUpdateResponse.ResponseData>> updateNoticeboard(@InterfaceC1485405rg NoticeboardUpdateParams noticeboardUpdateParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/noticeboard/official_template/update/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<NoticeboardOfficialTemplateUpdateResponse.ResponseData>> updateOfficialTemplate(@InterfaceC1485405rg NoticeboardOfficialTemplateUpdateParams noticeboardOfficialTemplateUpdateParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/noticeboard/template/update/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<NoticeboardTemplateUpdateResponse.ResponseData>> updateTemplate(@InterfaceC1485405rg NoticeboardTemplateUpdateParams noticeboardTemplateUpdateParams);
}
