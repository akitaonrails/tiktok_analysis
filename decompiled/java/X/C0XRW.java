package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0XRW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XRW {
    public static final C0XRW LIZ = new C0XRW();
    public static final C0XRX LIZIZ = (C0XRX) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CHQ.LIZ().getNetworkService().getApiHost()).build().retrofit.LIZ(C0XRX.class);
}
