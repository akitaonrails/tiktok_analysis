package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.TTRetrofit;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.interceptor.GecNetInterceptor;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.WriteImpressionRequest;
import com.ss.android.ugc.aweme.ecommerce.service.IGecNetInterceptorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.09YK, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09YK {
    public static final /* synthetic */ C09YK LIZ = new C09YK();
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

    public static Object LIZ(WriteImpressionRequest writeImpressionRequest, InterfaceC1364105Vn interfaceC1364105Vn) {
        C09YL c09yl;
        InterfaceC2661011f interfaceC2661011f = LIZIZ;
        if (interfaceC2661011f != null && (c09yl = (C09YL) interfaceC2661011f.create(C09YL.class)) != null) {
            Object objLIZIZ = c09yl.LIZIZ(writeImpressionRequest, interfaceC1364105Vn);
            if (objLIZIZ == C099R.LJFF()) {
                return objLIZIZ;
            }
            return objLIZIZ;
        }
        return null;
    }
}
