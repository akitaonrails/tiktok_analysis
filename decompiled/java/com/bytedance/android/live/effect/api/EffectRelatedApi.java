package com.bytedance.android.live.effect.api;

import X.C092G;
import X.C09SO;
import X.C0X76;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501030pAD;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffectResponse;
import kotlin.Unit;
import tikcast.api.anchor.EffectSearchResponse;
import tikcast.api.anchor.PinSoundEffectRequest;
import tikcast.api.anchor_tool.CategoryCheckResponse;
import tikcast.api.anchor_tool.CategoryEffectsResponse;
import tikcast.api.anchor_tool.CheckUpdateResponse;
import tikcast.api.anchor_tool.EffectListResponse;
import tikcast.api.anchor_tool.EffectListV2Request;
import tikcast.api.anchor_tool.EffectListV2Response;
import tikcast.api.anchor_tool.EffectRewardResponse;
import tikcast.api.anchor_tool.EffectUserFavouriteEffectsResponse;
import tikcast.api.anchor_tool.EffectUserFavouriteResponse;
import tikcast.api.anchor_tool.EffectUserUseResponse;
import tikcast.api.anchor_tool.EffectUserUsedEffectsResponse;
import tikcast.api.anchor_tool.FinishInteractiveEffectReq;
import tikcast.api.anchor_tool.FinishInteractiveEffectResp;
import tikcast.api.anchor_tool.GetPreloadEffectListReq;
import tikcast.api.anchor_tool.GetPreloadEffectListResp;
import tikcast.api.anchor_tool.PanelCheckResponse;
import tikcast.api.anchor_tool.PanelInfoResponse;
import tikcast.api.anchor_tool.StartInteractiveEffectReq;
import tikcast.api.anchor_tool.StartInteractiveEffectResp;
import webcast.api.anchor_tool.EffectBeautySuggestionResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface EffectRelatedApi {
    @InterfaceC1501160pAQ("/webcast/anchor/effect/category/check/")
    Object checkCategoryIsUpdate(@InterfaceC1501070pAH("access_key") String str, @InterfaceC1501070pAH("panel") String str2, @InterfaceC1501070pAH("category") String str3, @InterfaceC1501070pAH("version") String str4, InterfaceC1364105Vn<? super CategoryCheckResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/anchor/effect/v1/check_update/")
    Object checkEffectListIsUpdate(@InterfaceC1501070pAH("access_key") String str, @InterfaceC1501070pAH("panel") String str2, @InterfaceC1501070pAH("version") String str3, InterfaceC1364105Vn<? super CheckUpdateResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/anchor/effect/panel/check/")
    Object checkPanelIsUpdate(@InterfaceC1501070pAH("access_key") String str, @InterfaceC1501070pAH("panel") String str2, @InterfaceC1501070pAH("version") String str3, InterfaceC1364105Vn<? super PanelCheckResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/anchor_tool/effect/beauty_suggestion/")
    @C09SO(EnumC1846380y9E.BROADCAST)
    Object fetchAIBeauty(@InterfaceC1501070pAH("url") String str, @InterfaceC1501070pAH("beauty_setting") String str2, @InterfaceC1501070pAH("unique_key") String str3, @InterfaceC1501070pAH("trace_data") String str4, InterfaceC1364105Vn<? super C470590Icr<EffectBeautySuggestionResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/anchor/effect/category/effects/")
    @C09SO(EnumC1846380y9E.BROADCAST)
    Object fetchCategoryEffectList(@InterfaceC1501070pAH("access_key") String str, @InterfaceC1501070pAH("panel") String str2, @InterfaceC1501070pAH("category") String str3, @InterfaceC1501070pAH("cursor") Integer num, @InterfaceC1501070pAH("count") Integer num2, @InterfaceC1501070pAH("sorting_position") Integer num3, @InterfaceC1501070pAH("version") String str4, @InterfaceC1501070pAH("extra") String str5, @InterfaceC1501070pAH("platform_sdk_version") String str6, InterfaceC1364105Vn<? super C470590Icr<CategoryEffectsResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/anchor/effect/v1/list/")
    @C09SO(EnumC1846380y9E.BROADCAST)
    Object fetchEffectList(@InterfaceC1501070pAH("access_key") String str, @InterfaceC1501070pAH("panel") String str2, @InterfaceC1501070pAH("version") String str3, @InterfaceC1501070pAH("extra_param") String str4, @InterfaceC1501070pAH("platform_sdk_version") String str5, InterfaceC1364105Vn<? super C470590Icr<EffectListResponse.Data>> interfaceC1364105Vn);

    @C09SO(EnumC1846380y9E.BROADCAST)
    @InterfaceC1501170pAR("/webcast/anchor/effect/v2/list/")
    Object fetchEffectListV2(@InterfaceC1485405rg EffectListV2Request effectListV2Request, InterfaceC1364105Vn<? super C470590Icr<EffectListV2Response.Data>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/anchor/effect/user/mine/")
    @C09SO(EnumC1846380y9E.BROADCAST)
    Object fetchFavoriteList(@InterfaceC1501070pAH("access_key") String str, @InterfaceC1501070pAH("panel") String str2, @InterfaceC1501070pAH("platform_sdk_version") String str3, @InterfaceC1501070pAH("grade_extra") String str4, InterfaceC1364105Vn<? super C470590Icr<EffectUserFavouriteEffectsResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/anchor/effect/panel/info/")
    @C09SO(EnumC1846380y9E.BROADCAST)
    Object fetchPanelInfo(@InterfaceC1501070pAH("access_key") String str, @InterfaceC1501070pAH("panel") String str2, @InterfaceC1501070pAH("version") String str3, @InterfaceC1501070pAH("extra") String str4, InterfaceC1364105Vn<? super C470590Icr<PanelInfoResponse.Data>> interfaceC1364105Vn);

    @C09SO(EnumC1846380y9E.BROADCAST)
    @InterfaceC1501170pAR("/webcast/anchor_tool/effect/preload/list")
    Object fetchPreloadEffectList(@InterfaceC1485405rg GetPreloadEffectListReq getPreloadEffectListReq, InterfaceC1364105Vn<? super C470590Icr<GetPreloadEffectListResp.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/anchor/effect/user/effects/")
    @C09SO(EnumC1846380y9E.BROADCAST)
    Object fetchRecentUsedEffect(@InterfaceC1501070pAH("access_key") String str, @InterfaceC1501070pAH("panel") String str2, @InterfaceC1501070pAH("platform_sdk_version") String str3, @InterfaceC1501070pAH("grade_extra") String str4, InterfaceC1364105Vn<? super C470590Icr<EffectUserUsedEffectsResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/anchor/effect/reward/")
    @C09SO(EnumC1846380y9E.BROADCAST)
    Object fetchRewardList(@InterfaceC1501070pAH("access_key") String str, @InterfaceC1501070pAH("panel") String str2, @InterfaceC1501070pAH("cursor") int i, @InterfaceC1501070pAH("count") int i2, @InterfaceC1501070pAH("grade_extra") String str3, @InterfaceC1501070pAH("platform_sdk_version") String str4, InterfaceC1364105Vn<? super C470590Icr<EffectRewardResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/room/sound_effect/")
    C11NZ<C470590Icr<SoundEffectResponse>> fetchSoundEffect(@InterfaceC1501070pAH("room_id") long j);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/live_center/task/event_report/")
    C11NZ<C470590Icr<Unit>> finishEffectTask(@InterfaceC1501050pAF("event_type") int i);

    @InterfaceC1501170pAR("/webcast/anchor_tool/interactive_effect/finish/")
    Object finishInteractiveEffect(@InterfaceC1485405rg FinishInteractiveEffectReq finishInteractiveEffectReq, InterfaceC1364105Vn<? super FinishInteractiveEffectResp> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/anchor/effect/user/favorite/")
    Object modifyFavoriteList(@InterfaceC1501050pAF("access_key") String str, @InterfaceC1501050pAF("panel") String str2, @InterfaceC1501050pAF("platform_sdk_version") String str3, @InterfaceC1501050pAF("effect_ids") String str4, @InterfaceC1501050pAF("type") int i, InterfaceC1364105Vn<? super EffectUserFavouriteResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/anchor/effect/search")
    C11NZ<EffectSearchResponse> requestSearchEffectList(@InterfaceC1501070pAH("keywords") String str, @InterfaceC1501070pAH("offset") int i, @InterfaceC1501070pAH("count") int i2, @InterfaceC1501070pAH("panel_key") String str2, @InterfaceC1501070pAH("ep_platform_sdk_version") String str3);

    @InterfaceC1501170pAR("/webcast/anchor_tool/interactive_effect/start/")
    Object startInteractiveEffect(@InterfaceC1485405rg StartInteractiveEffectReq startInteractiveEffectReq, InterfaceC1364105Vn<? super StartInteractiveEffectResp> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/anchor/effect/user/use/")
    Object updateUsedEffect(@InterfaceC1501050pAF("access_key") String str, @InterfaceC1501050pAF("panel") String str2, @InterfaceC1501050pAF("platform_sdk_version") String str3, @InterfaceC1501050pAF("effect_ids") String str4, @InterfaceC1501050pAF("type") int i, @InterfaceC1501050pAF("expiration_time") Long l, InterfaceC1364105Vn<? super EffectUserUseResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/internal_ci_info/")
    C11NZ<C470590Icr<Void>> uploadBeautyParams(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("filter_name") String str, @InterfaceC1501050pAF("brightening") int i, @InterfaceC1501050pAF("beauty_skin") int i2, @InterfaceC1501050pAF("big_eyes") int i3, @InterfaceC1501050pAF("face_lift") int i4, @InterfaceC1501050pAF("use_filter") boolean z);

    @InterfaceC1501170pAR("/webcast/room/modification/upload/")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    C11NZ<C470590Icr<Void>> uploadEffectRelatedUseLog(@InterfaceC1485405rg ModificationUploadRequest modificationUploadRequest);

    @C092G
    @InterfaceC1501170pAR("/webcast/room/upload/image/")
    Object uploadImage(@InterfaceC1501030pAD C0X76 c0x76, InterfaceC1364105Vn<? super C470590Icr<CoverImageModel>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/anchor/sound_effect/pin/")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    C11NZ<C470590Icr<Void>> uploadSoundEffectOrder(@InterfaceC1485405rg PinSoundEffectRequest pinSoundEffectRequest);
}
