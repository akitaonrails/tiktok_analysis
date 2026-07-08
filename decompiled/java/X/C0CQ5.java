package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.compliance.business.policynotice.api.PolicyNoticeApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0CQ5, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CQ5 {
    public static final /* synthetic */ C0CQ5 LIZ = new C0CQ5();
    public static final PolicyNoticeApi LIZIZ = (PolicyNoticeApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(PolicyNoticeApi.class);
}
