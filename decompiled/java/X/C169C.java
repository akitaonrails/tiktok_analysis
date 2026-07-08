package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.psp.action.IMPSPNetworkApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.169C, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C169C extends C09AY implements Function0<IMPSPNetworkApi> {
    public C169C() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.ss.android.ugc.aweme.im.sdk.psp.action.IMPSPNetworkApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMPSPNetworkApi invoke() {
        C1499850p8J c1499850p8JCreateBuilder;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        if (iRetrofitFactory == null || (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(C0CQT.LIZJ)) == null) {
            return null;
        }
        return c1499850p8JCreateBuilder.build().retrofit.LIZ(IMPSPNetworkApi.class);
    }
}
