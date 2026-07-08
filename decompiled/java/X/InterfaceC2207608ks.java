package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.RecommendListResponse;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.VideoDetailResponse;
import java.util.Map;

/* JADX INFO: renamed from: X.08ks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC2207608ks {
    public static final C2207808ku LIZ = C2207808ku.LIZ;

    @InterfaceC1501240pAY("/api/v1/shop/pdp_creator_video/video_detail")
    Object LIZ(@C040I Map<String, Object> map, InterfaceC1364105Vn<? super Response<VideoDetailResponse>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/shop/pdp_creator_video/recommend_card")
    Object LIZIZ(@C040I Map<String, Object> map, InterfaceC1364105Vn<? super Response<RecommendListResponse>> interfaceC1364105Vn);
}
