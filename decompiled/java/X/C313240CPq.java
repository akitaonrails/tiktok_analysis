package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.history.api.AdWebHistoryListApi;

/* JADX INFO: renamed from: X.0CPq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C313240CPq {
    public static final /* synthetic */ C313240CPq LIZ = new C313240CPq();

    public static AdWebHistoryListApi LIZ() {
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ);
        c1499850p8JCreateBuilder.LIZJ(C2336109Dj.LJI());
        return (AdWebHistoryListApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(AdWebHistoryListApi.class);
    }
}
