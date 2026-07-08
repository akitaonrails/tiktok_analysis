package com.bytedance.android.live.effect.api;

import X.C0X76;
import X.C11NZ;
import X.C470590Icr;
import X.C480460Ism;
import X.C792600V7i;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffectResponse;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
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
public final class EffectRelatedApiTryModeProxy implements EffectRelatedApi {
    @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
    public final C11NZ<C470590Icr<SoundEffectResponse>> fetchSoundEffect(long j) {
        C480460Ism.LIZ().getClass();
        return ((EffectRelatedApi) C480460Ism.LIZLLL(EffectRelatedApi.class)).fetchSoundEffect(j);
    }

    @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
    public final C11NZ<C470590Icr<Unit>> finishEffectTask(int i) {
        return C11NZ.LJJJJZ(new C470590Icr());
    }

    @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
    public final C11NZ<C470590Icr<Void>> uploadEffectRelatedUseLog(ModificationUploadRequest modificationUploadRequest) {
        return C11NZ.LJJJJZ(new C470590Icr());
    }

    @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
    public final C11NZ<C470590Icr<Void>> uploadSoundEffectOrder(PinSoundEffectRequest pinSoundEffectRequest) {
        C480460Ism.LIZ().getClass();
        return ((EffectRelatedApi) C480460Ism.LIZLLL(EffectRelatedApi.class)).uploadSoundEffectOrder(pinSoundEffectRequest);
    }

    @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
    public final Object fetchEffectListV2(EffectListV2Request effectListV2Request, InterfaceC1364105Vn<? super C470590Icr<EffectListV2Response.Data>> interfaceC1364105Vn) {
        C480460Ism.LIZ().getClass();
        return ((EffectRelatedApi) C480460Ism.LIZLLL(EffectRelatedApi.class)).fetchEffectListV2(effectListV2Request, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
    public final Object fetchPreloadEffectList(GetPreloadEffectListReq getPreloadEffectListReq, InterfaceC1364105Vn<? super C470590Icr<GetPreloadEffectListResp.ResponseData>> interfaceC1364105Vn) {
        C480460Ism.LIZ().getClass();
        return ((EffectRelatedApi) C480460Ism.LIZLLL(EffectRelatedApi.class)).fetchPreloadEffectList(getPreloadEffectListReq, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
    public Object finishInteractiveEffect(@InterfaceC1485405rg FinishInteractiveEffectReq finishInteractiveEffectReq, InterfaceC1364105Vn<? super FinishInteractiveEffectResp> interfaceC1364105Vn) {
        C480460Ism.LIZ().getClass();
        return ((EffectRelatedApi) C480460Ism.LIZLLL(EffectRelatedApi.class)).finishInteractiveEffect(finishInteractiveEffectReq, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
    public Object startInteractiveEffect(@InterfaceC1485405rg StartInteractiveEffectReq startInteractiveEffectReq, InterfaceC1364105Vn<? super StartInteractiveEffectResp> interfaceC1364105Vn) {
        C480460Ism.LIZ().getClass();
        return ((EffectRelatedApi) C480460Ism.LIZLLL(EffectRelatedApi.class)).startInteractiveEffect(startInteractiveEffectReq, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
    public final Object uploadImage(C0X76 c0x76, InterfaceC1364105Vn<? super C470590Icr<CoverImageModel>> interfaceC1364105Vn) {
        C480460Ism.LIZ().getClass();
        return ((EffectRelatedApi) C480460Ism.LIZLLL(EffectRelatedApi.class)).uploadImage(c0x76, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
    public final Object checkEffectListIsUpdate(String str, String str2, String str3, InterfaceC1364105Vn<? super CheckUpdateResponse> interfaceC1364105Vn) {
        C480460Ism.LIZ().getClass();
        return ((EffectRelatedApi) C480460Ism.LIZLLL(EffectRelatedApi.class)).checkEffectListIsUpdate(str, str2, str3, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
    public final Object checkPanelIsUpdate(String str, String str2, String str3, InterfaceC1364105Vn<? super PanelCheckResponse> interfaceC1364105Vn) {
        C480460Ism.LIZ().getClass();
        return ((EffectRelatedApi) C480460Ism.LIZLLL(EffectRelatedApi.class)).checkPanelIsUpdate(str, str2, str3, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
    public final Object checkCategoryIsUpdate(String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super CategoryCheckResponse> interfaceC1364105Vn) {
        C480460Ism.LIZ().getClass();
        return ((EffectRelatedApi) C480460Ism.LIZLLL(EffectRelatedApi.class)).checkCategoryIsUpdate(str, str2, str3, str4, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
    public final Object fetchAIBeauty(String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super C470590Icr<EffectBeautySuggestionResponse.ResponseData>> interfaceC1364105Vn) {
        C480460Ism.LIZ().getClass();
        return ((EffectRelatedApi) C480460Ism.LIZLLL(EffectRelatedApi.class)).fetchAIBeauty(str, str2, str3, str4, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
    public final Object fetchFavoriteList(String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super C470590Icr<EffectUserFavouriteEffectsResponse.Data>> interfaceC1364105Vn) {
        C480460Ism.LIZ().getClass();
        return ((EffectRelatedApi) C480460Ism.LIZLLL(EffectRelatedApi.class)).fetchFavoriteList(str, str2, str3, str4, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
    public final Object fetchPanelInfo(String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super C470590Icr<PanelInfoResponse.Data>> interfaceC1364105Vn) {
        C480460Ism.LIZ().getClass();
        return ((EffectRelatedApi) C480460Ism.LIZLLL(EffectRelatedApi.class)).fetchPanelInfo(str, str2, str3, str4, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
    public final Object fetchRecentUsedEffect(String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super C470590Icr<EffectUserUsedEffectsResponse.Data>> interfaceC1364105Vn) {
        C480460Ism.LIZ().getClass();
        return ((EffectRelatedApi) C480460Ism.LIZLLL(EffectRelatedApi.class)).fetchRecentUsedEffect(str, str2, str3, str4, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
    public final C11NZ<EffectSearchResponse> requestSearchEffectList(String str, int i, int i2, String str2, String str3) {
        C480460Ism.LIZ().getClass();
        return ((EffectRelatedApi) C480460Ism.LIZLLL(EffectRelatedApi.class)).requestSearchEffectList(str, i, i2, str2, ((IHostCreativeTool) C792600V7i.LIZ(IHostCreativeTool.class)).getEPVersion());
    }

    @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
    public final Object fetchEffectList(String str, String str2, String str3, String str4, String str5, InterfaceC1364105Vn<? super C470590Icr<EffectListResponse.Data>> interfaceC1364105Vn) {
        C480460Ism.LIZ().getClass();
        return ((EffectRelatedApi) C480460Ism.LIZLLL(EffectRelatedApi.class)).fetchEffectList(str, str2, str3, str4, str5, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
    public final Object modifyFavoriteList(String str, String str2, String str3, String str4, int i, InterfaceC1364105Vn<? super EffectUserFavouriteResponse> interfaceC1364105Vn) {
        C480460Ism.LIZ().getClass();
        return ((EffectRelatedApi) C480460Ism.LIZLLL(EffectRelatedApi.class)).modifyFavoriteList(str, str2, str3, str4, i, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
    public final Object fetchRewardList(String str, String str2, int i, int i2, String str3, String str4, InterfaceC1364105Vn<? super C470590Icr<EffectRewardResponse.Data>> interfaceC1364105Vn) {
        C480460Ism.LIZ().getClass();
        return ((EffectRelatedApi) C480460Ism.LIZLLL(EffectRelatedApi.class)).fetchRewardList(str, str2, i, i2, str3, str4, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
    public final Object updateUsedEffect(String str, String str2, String str3, String str4, int i, Long l, InterfaceC1364105Vn<? super EffectUserUseResponse> interfaceC1364105Vn) {
        C480460Ism.LIZ().getClass();
        return ((EffectRelatedApi) C480460Ism.LIZLLL(EffectRelatedApi.class)).updateUsedEffect(str, str2, str3, str4, i, l, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
    public final C11NZ<C470590Icr<Void>> uploadBeautyParams(long j, String str, int i, int i2, int i3, int i4, boolean z) {
        return C11NZ.LJJJJZ(new C470590Icr());
    }

    @Override // com.bytedance.android.live.effect.api.EffectRelatedApi
    public final Object fetchCategoryEffectList(String str, String str2, String str3, Integer num, Integer num2, Integer num3, String str4, String str5, String str6, InterfaceC1364105Vn<? super C470590Icr<CategoryEffectsResponse.Data>> interfaceC1364105Vn) {
        C480460Ism.LIZ().getClass();
        return ((EffectRelatedApi) C480460Ism.LIZLLL(EffectRelatedApi.class)).fetchCategoryEffectList(str, str2, str3, num, num2, num3, str4, str5, str6, interfaceC1364105Vn);
    }
}
