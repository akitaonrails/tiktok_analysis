package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.api.RegionStatusApi;

/* JADX INFO: renamed from: X.0CQI, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CQI {
    public static final /* synthetic */ C0CQI LIZ = new C0CQI();
    public static final RegionStatusApi LIZIZ = (RegionStatusApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(RegionStatusApi.class);
}
