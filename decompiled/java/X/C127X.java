package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto.CommonFeedRequest;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto.CommonFeedResponse;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto.WriteImpressionRequest;
import java.util.Map;

/* JADX INFO: renamed from: X.127X, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public interface C127X {
    public static final C119H LIZ = C119H.LIZ;

    @InterfaceC1501240pAY("/api/v1/shop/recommend/feed/generic_feed")
    C11NZ<CommonFeedResponse> LIZ(@C040I CommonFeedRequest commonFeedRequest);

    @InterfaceC1501240pAY("/api/v1/shop/recommend/impression/write")
    C11NZ<Response<Object>> LIZIZ(@C040I WriteImpressionRequest writeImpressionRequest);

    @InterfaceC1501240pAY("{path}")
    C11NZ<Response<Object>> LIZJ(@C040I Map<String, Object> map, @InterfaceC1501110pAL(encoded = true, value = "path") String str);

    @InterfaceC1501240pAY("{path}")
    C11NZ<CommonFeedResponse> LIZLLL(@C040I Map<String, Object> map, @InterfaceC1501110pAL(encoded = true, value = "path") String str);
}
