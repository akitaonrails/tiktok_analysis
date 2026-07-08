package X;

import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.privacy.video.model.VideoPrivateUrlModel;

/* JADX INFO: renamed from: X.109z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC192013109z {
    @InterfaceC1501240pAY("/tiktok/privacy/item/settings/update/v1")
    @InterfaceC1485505rh
    C11NZ<BaseResponse> LIZ(@InterfaceC1501100pAK("aweme_id") String str, @InterfaceC1501100pAK("field") String str2, @InterfaceC1501100pAK("value") Integer num);

    @InterfaceC1501200pAU("/aweme/v1/aweme/modify/visibility/")
    C11NZ<VideoPrivateUrlModel> LIZIZ(@InterfaceC1501120pAM("aweme_id") String str, @InterfaceC1501120pAM("type") int i);
}
