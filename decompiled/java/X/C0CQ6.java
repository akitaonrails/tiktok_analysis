package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.compliance.business.region.api.RegionChangeUpdatedApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0CQ6, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CQ6 {
    public static final /* synthetic */ C0CQ6 LIZ = new C0CQ6();
    public static final RegionChangeUpdatedApi LIZIZ = (RegionChangeUpdatedApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(RegionChangeUpdatedApi.class);
}
