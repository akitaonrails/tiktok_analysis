package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.im.saas.host.api.debug.IMSaasHostOfflineDebugService;

/* JADX INFO: renamed from: X.0Yeg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879400Yeg {
    public static boolean LIZ() {
        C0I0B c0i0b = C0I0B.LJFF;
        c0i0b.LIZJ();
        if (!C894660Z7w.LIZJ()) {
            c0i0b.LIZJ();
            if (!TextUtils.equals(C894660Z7w.LIZIZ(), "local_test")) {
                return false;
            }
        }
        IMSaasHostOfflineDebugService.LIZ.getClass();
        IMSaasHostOfflineDebugService iMSaasHostOfflineDebugServiceLIZIZ = C0Z40.LIZIZ();
        return iMSaasHostOfflineDebugServiceLIZIZ != null && iMSaasHostOfflineDebugServiceLIZIZ.LJIIJ();
    }
}
