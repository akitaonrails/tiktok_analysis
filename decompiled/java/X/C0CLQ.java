package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0CLQ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CLQ {
    public static boolean LIZ() {
        return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin();
    }
}
