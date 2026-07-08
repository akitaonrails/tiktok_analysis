package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.innerfeed.VideoDetailResponse;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.WriteImpressionRequest;
import java.util.Map;

/* JADX INFO: renamed from: X.09YL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public interface C09YL {
    public static final C09YK LIZ = C09YK.LIZ;

    @InterfaceC1501240pAY("/api/v1/shop/pdp_creator_video/video_detail")
    Object LIZ(@C040I Map<String, Object> map, InterfaceC1364105Vn<? super Response<VideoDetailResponse>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/shop/recommend/impression/write")
    Object LIZIZ(@C040I WriteImpressionRequest writeImpressionRequest, InterfaceC1364105Vn<? super Response<Object>> interfaceC1364105Vn);
}
