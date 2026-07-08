package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.localnotify.api.LocalNotifyInfoApi;

/* JADX INFO: renamed from: X.0CQL, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CQL {
    public static final /* synthetic */ C0CQL LIZ = new C0CQL();
    public static final LocalNotifyInfoApi LIZIZ = (LocalNotifyInfoApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(LocalNotifyInfoApi.class);
}
