package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.pns.feedsafety.filtervideo.api.FilterKeywordResp;

/* JADX INFO: renamed from: X.0NaJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC596410NaJ {
    @InterfaceC1501240pAY("/tiktok/v1/mute/create/")
    @InterfaceC1485505rh
    C11NZ<FilterKeywordResp> LIZ(@InterfaceC1501100pAK("texts") String str, @InterfaceC1501100pAK("scenes") String str2);

    @InterfaceC1501240pAY("/aweme/v1/commit/dislike/item/")
    C11NZ<BaseResponse> LIZIZ(@InterfaceC1501120pAM("aweme_id") String str, @InterfaceC1501120pAM("request_id") String str2);
}
