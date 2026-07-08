package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.discover.repo.fetcher.DiscoveryTimeGapInterceptor;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.09UY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09UY {
    public static final /* synthetic */ C09UY LIZ = new C09UY();
    public static final InterfaceC19253510Ub LIZIZ;

    static {
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ);
        c1499850p8JCreateBuilder.LIZ(new DiscoveryTimeGapInterceptor());
        LIZIZ = (InterfaceC19253510Ub) c1499850p8JCreateBuilder.build().retrofit.LIZ(InterfaceC19253510Ub.class);
    }
}
