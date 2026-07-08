package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.image.LsResBystander;
import com.ss.android.ugc.aweme.net.LocationNetRequestInfoCommonInterceptor;
import com.ss.android.ugc.aweme.net.LsPreloadCheckerBystander;

/* JADX INFO: renamed from: X.0gcd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1172690gcd {
    public static final /* synthetic */ C1172690gcd LIZ = new C1172690gcd();

    public static C09WW LIZ() {
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(Api.LIZ);
        c1499850p8JCreateBuilder.LIZ(new LocationNetRequestInfoCommonInterceptor());
        c1499850p8JCreateBuilder.LIZIZ(LsResBystander.LIZ);
        c1499850p8JCreateBuilder.LIZIZ(LsPreloadCheckerBystander.LIZ);
        c1499850p8JCreateBuilder.LJIIIZ = 0;
        return (C09WW) c1499850p8JCreateBuilder.build().retrofit.LIZ(C09WW.class);
    }
}
