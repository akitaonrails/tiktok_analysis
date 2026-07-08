package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto.CommonFeedRequest;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto.CommonFeedResponse;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto.MixFeedApiConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto.MixFeedApiConfigModel;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto.WriteImpressionRequest;
import java.util.Map;

/* JADX INFO: renamed from: X.127Y, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C127Y implements InterfaceC149400hg {
    public final /* synthetic */ C127Z LL;

    public C127Y(C127Z c127z) {
        this.LL = c127z;
    }

    public final C11NZ LJLZ(CommonFeedRequest commonFeedRequest, MixFeedApiConfig mixFeedApiConfig) {
        MixFeedApiConfigModel mixFeedApiConfigModel;
        Map<String, Object> map;
        if (mixFeedApiConfig != null && (mixFeedApiConfigModel = mixFeedApiConfig.fetchFeed) != null && (map = mixFeedApiConfigModel.requestParams) != null) {
            C127Z c127z = this.LL;
            String str = mixFeedApiConfigModel.path;
            c127z.getClass();
            Map<String, Object> mapLIZ = C127Z.LIZ(commonFeedRequest, map);
            C1953307kx.LIZ.getClass();
            if (C1953307kx.LIZLLL(str) && (!mapLIZ.isEmpty())) {
                C127X.LIZ.getClass();
                C11NZ<CommonFeedResponse> c11nzLIZLLL = ((C127X) C119H.LIZIZ.create(C127X.class)).LIZLLL(mapLIZ, str);
                if (c11nzLIZLLL != null) {
                    return c11nzLIZLLL;
                }
            }
        }
        C127X.LIZ.getClass();
        return ((C127X) C119H.LIZIZ.create(C127X.class)).LIZ(commonFeedRequest);
    }

    public final C11NZ LLJLILLLLZIIL(WriteImpressionRequest writeImpressionRequest, MixFeedApiConfig mixFeedApiConfig) {
        MixFeedApiConfigModel mixFeedApiConfigModel;
        Map<String, Object> map;
        if (mixFeedApiConfig != null && (mixFeedApiConfigModel = mixFeedApiConfig.impressionWrite) != null && (map = mixFeedApiConfigModel.requestParams) != null) {
            C127Z c127z = this.LL;
            String str = mixFeedApiConfigModel.path;
            c127z.getClass();
            Map<String, Object> mapLIZ = C127Z.LIZ(writeImpressionRequest, map);
            C1953307kx.LIZ.getClass();
            if (C1953307kx.LIZLLL(str) && (!mapLIZ.isEmpty())) {
                C127X.LIZ.getClass();
                C11NZ<Response<Object>> c11nzLIZJ = ((C127X) C119H.LIZIZ.create(C127X.class)).LIZJ(mapLIZ, str);
                if (c11nzLIZJ != null) {
                    return c11nzLIZJ;
                }
            }
        }
        C127X.LIZ.getClass();
        return ((C127X) C119H.LIZIZ.create(C127X.class)).LIZIZ(writeImpressionRequest);
    }
}
