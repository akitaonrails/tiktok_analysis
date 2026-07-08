package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedRequest;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.05Wa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1365405Wa {
    public static final /* synthetic */ C1365405Wa LIZ = new C1365405Wa();
    public static final InterfaceC2661011f LIZIZ = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com/").build();

    public static C11NZ LIZ(CommonFeedRequest commonFeedRequest) {
        String str;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ec_recommend_feed_path_switch", true, false)) {
            str = "/api/v1/recommend/video_in_stream/get";
        } else {
            str = "/api/v1/shop/recommend/feed/get";
        }
        return ((InterfaceC1365505Wb) LIZIZ.create(InterfaceC1365505Wb.class)).LIZ(str, commonFeedRequest);
    }
}
