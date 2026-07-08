package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.TTRetrofit;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.interceptor.GecNetInterceptor;
import com.ss.android.ugc.aweme.ecommerce.service.IGecNetInterceptorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.08ku, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2207808ku {
    public static final /* synthetic */ C2207808ku LIZ = new C2207808ku();
    public static final InterfaceC2661011f LIZIZ;

    static {
        TTRetrofit tTRetrofitBuild;
        C1499850p8J c1499850p8JCreateBuilder;
        GecNetInterceptor gecNetInterceptorLIZ;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        if (iRetrofitFactory == null || (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder("https://oec-api.tiktokv.com/")) == null) {
            tTRetrofitBuild = null;
        } else {
            IGecNetInterceptorService iGecNetInterceptorService = (IGecNetInterceptorService) PluggableExtentionKt.pluggableSpi$default(IGecNetInterceptorService.class, false, false, false, 14, null);
            if (iGecNetInterceptorService != null && (gecNetInterceptorLIZ = iGecNetInterceptorService.LIZ()) != null) {
                c1499850p8JCreateBuilder.LIZ(gecNetInterceptorLIZ);
            }
            tTRetrofitBuild = c1499850p8JCreateBuilder.build();
        }
        LIZIZ = tTRetrofitBuild;
    }
}
