package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;

/* JADX INFO: renamed from: X.0iot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1257170iot {
    public static final C1257170iot LIZ = new C1257170iot();

    public static final void LIZ(Activity activity, EnumC1609900rzo enumC1609900rzo, Exception exc, C1749280vcc c1749280vcc) {
        ((INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class)).triggerNetworkTips(activity, enumC1609900rzo, exc, c1749280vcc);
    }

    public static final void LIZIZ(Activity activity, String str, Exception exc, C1749280vcc c1749280vcc) {
        ((INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class)).triggerNetworkTips(activity, str, exc, c1749280vcc);
    }
}
