package X;

import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.compliance.business.settings.ComplianceApi;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.102W, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C102W extends C09AY implements Function0<ComplianceApi> {
    public C102W() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.compliance.business.settings.ComplianceApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ComplianceApi invoke() {
        ComplianceApi.LIZ.getClass();
        return ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(ComplianceApi.class);
    }
}
