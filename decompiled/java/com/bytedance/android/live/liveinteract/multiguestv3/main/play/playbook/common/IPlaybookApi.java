package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.liveinteract.multilive.model.MaterialsGetImagesParams;
import com.bytedance.android.live.liveinteract.multilive.model.MaterialsGetImagesResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookAsyncUpdateParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookAsyncUpdateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookCreateInfoParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookCreateInfoResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookEndParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookEndResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookFavoriteParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookFavoriteResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookFetchDetailParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookFetchDetailResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookFetchListParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookFetchListResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookGetAIGenHistoryParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookGetAIGenHistoryResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookGetActiveContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookGetActiveContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookImageAIGenParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookImageAIGenResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookPopulateParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookPopulateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookPublishParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookPublishResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookRepublishParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookRepublishResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookReviewParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookReviewResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookStartParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookStartResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookUnfavoriteParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookUnfavoriteResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookUnpublishParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookUnpublishResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookUpdateActiveContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookUpdateActiveContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookUpdateUserSettingParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookUpdateUserSettingResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookUpdateVisibilityParams;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookUpdateVisibilityResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UserFeedbackParams;
import com.bytedance.android.live.liveinteract.multilive.model.UserFeedbackResponse;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public interface IPlaybookApi {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/playbook/async_update/ ")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<PlaybookAsyncUpdateResponse.ResponseData>> asyncUpdate(@InterfaceC1485405rg PlaybookAsyncUpdateParams playbookAsyncUpdateParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/playbook/end/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<PlaybookEndResponse.ResponseData>> end(@InterfaceC1485405rg PlaybookEndParams playbookEndParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/playbook/favorite/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<PlaybookFavoriteResponse.ResponseData>> favorite(@InterfaceC1485405rg PlaybookFavoriteParams playbookFavoriteParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/playbook/fetch_detail/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<PlaybookFetchDetailResponse.ResponseData>> fetchDetail(@InterfaceC1485405rg PlaybookFetchDetailParams playbookFetchDetailParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/playbook/fetch_list/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<PlaybookFetchListResponse.ResponseData>> fetchList(@InterfaceC1485405rg PlaybookFetchListParams playbookFetchListParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/playbook/get_ai_gen_history/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<PlaybookGetAIGenHistoryResponse.ResponseData>> fetchPlaybookAIList(@InterfaceC1485405rg PlaybookGetAIGenHistoryParams playbookGetAIGenHistoryParams);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/live_center/task/event_report/")
    C11NZ<C470590Icr<Unit>> finishPlaybookTask(@InterfaceC1501050pAF("event_type") int i);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/playbook/image_ai_gen/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<PlaybookImageAIGenResponse.ResponseData>> genPlaybookAIImage(@InterfaceC1485405rg PlaybookImageAIGenParams playbookImageAIGenParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/playbook/get_active_content/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<PlaybookGetActiveContentResponse.ResponseData>> getActiveContent(@InterfaceC1485405rg PlaybookGetActiveContentParams playbookGetActiveContentParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/playbook/create_info/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<PlaybookCreateInfoResponse.ResponseData>> getCreateInfo(@InterfaceC1485405rg PlaybookCreateInfoParams playbookCreateInfoParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/materials/get_images/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<MaterialsGetImagesResponse.ResponseData>> getImages(@InterfaceC1485405rg MaterialsGetImagesParams materialsGetImagesParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/playbook/populate/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<PlaybookPopulateResponse.ResponseData>> populate(@InterfaceC1485405rg PlaybookPopulateParams playbookPopulateParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/playbook/publish/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<PlaybookPublishResponse.ResponseData>> publish(@InterfaceC1485405rg PlaybookPublishParams playbookPublishParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/playbook/republish/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<PlaybookRepublishResponse.ResponseData>> republish(@InterfaceC1485405rg PlaybookRepublishParams playbookRepublishParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/playbook/review/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<PlaybookReviewResponse.ResponseData>> review(@InterfaceC1485405rg PlaybookReviewParams playbookReviewParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/user_feedback/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<UserFeedbackResponse.ResponseData>> sendUserFeedback(@InterfaceC1485405rg UserFeedbackParams userFeedbackParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/playbook/start/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<PlaybookStartResponse.ResponseData>> start(@InterfaceC1485405rg PlaybookStartParams playbookStartParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/playbook/unfavorite/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<PlaybookUnfavoriteResponse.ResponseData>> unFavorite(@InterfaceC1485405rg PlaybookUnfavoriteParams playbookUnfavoriteParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/playbook/unpublish/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<PlaybookUnpublishResponse.ResponseData>> unpublish(@InterfaceC1485405rg PlaybookUnpublishParams playbookUnpublishParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/playbook/update_active_content/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<PlaybookUpdateActiveContentResponse.ResponseData>> updateActiveContent(@InterfaceC1485405rg PlaybookUpdateActiveContentParams playbookUpdateActiveContentParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/playbook/update_user_setting/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<PlaybookUpdateUserSettingResponse.ResponseData>> updateUserSetting(@InterfaceC1485405rg PlaybookUpdateUserSettingParams playbookUpdateUserSettingParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/playbook/update_visibility/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<PlaybookUpdateVisibilityResponse.ResponseData>> updateVisibility(@InterfaceC1485405rg PlaybookUpdateVisibilityParams playbookUpdateVisibilityParams);
}
