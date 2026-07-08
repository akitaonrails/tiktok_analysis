package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy;

/* JADX INFO: renamed from: X.0nhC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444600nhC {
    public static final C1444600nhC LIZ = new C1444600nhC();

    public static boolean LIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "creation_privacy_setting_set_as_default", false) == 1 && ((IFoundationAVServiceProxy) ServiceManager.get().getService(IFoundationAVServiceProxy.class)).getAccountService().isLogin();
    }
}
