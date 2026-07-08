package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.api.ICommercializeComplianceApi;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0TPL, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TPL {
    public static final /* synthetic */ C0TPL LIZ = new C0TPL();

    public static ICommercializeComplianceApi LIZ() {
        return (ICommercializeComplianceApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(ICommercializeComplianceApi.class);
    }
}
