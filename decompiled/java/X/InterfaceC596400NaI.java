package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.share.dislike.FilteredKeywords;
import java.util.Map;

/* JADX INFO: renamed from: X.0NaI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC596400NaI {
    @InterfaceC1501240pAY("/tiktok/v1/mute/create/")
    @InterfaceC1485505rh
    C11NZ<BaseResponse> LIZ(@InterfaceC1501100pAK("texts") String str, @InterfaceC1501100pAK("scenes") String str2);

    @InterfaceC1501200pAU("/tiktok/v1/mute/query/")
    C11NZ<FilteredKeywords> LIZIZ();

    @InterfaceC1501240pAY("/aweme/v1/commit/dislike/item/")
    @InterfaceC1485505rh
    C11NZ<BaseResponse> LIZJ(@InterfaceC1501120pAM("aweme_id") String str, @InterfaceC1501120pAM("request_id") String str2, @InterfaceC1501190pAT Map<String, String> map, @InterfaceC1501100pAK("dislike_hashtags") String str3, @InterfaceC1501100pAK("dislike_reason_ids") String str4);
}
