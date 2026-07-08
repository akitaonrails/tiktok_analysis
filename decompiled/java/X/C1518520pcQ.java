package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.compliance.business.fbv.FBVApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0pcQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518520pcQ {
    public final FBVApi LIZ;

    public C1518520pcQ() {
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ);
        c1499850p8JCreateBuilder.LIZJ(C2336109Dj.LJI());
        this.LIZ = (FBVApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(FBVApi.class);
    }
}
