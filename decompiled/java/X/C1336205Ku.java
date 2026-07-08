package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.saas.host.api.im.callback.IIMUnder16Proxy;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.impl.u16.controller.IMUnder16ProxyImpl;

/* JADX INFO: renamed from: X.05Ku, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1336205Ku {
    public static IIMUnder16Proxy LIZJ() {
        Object objLIZ = C04TD.LIZ(IIMUnder16Proxy.class, false);
        if (objLIZ != null) {
            return (IIMUnder16Proxy) objLIZ;
        }
        if (C04TD.h1 == null) {
            synchronized (IIMUnder16Proxy.class) {
                if (C04TD.h1 == null) {
                    C04TD.h1 = new IMUnder16ProxyImpl();
                }
            }
        }
        return C04TD.h1;
    }

    public static IIMService LIZ(boolean z) {
        return (IIMService) ServiceManager.get().getService(IIMService.class, z);
    }
}
