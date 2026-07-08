package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.unifiedauth.api.PushServerIntelligentApi;

/* JADX INFO: renamed from: X.01wV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C496101wV {
    public static final /* synthetic */ C496101wV LIZ = new C496101wV();
    public static final PushServerIntelligentApi LIZIZ;

    static {
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ);
        c1499850p8JCreateBuilder.LIZJ(C2336109Dj.LJI());
        LIZIZ = (PushServerIntelligentApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(PushServerIntelligentApi.class);
    }
}
