package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;

/* JADX INFO: renamed from: X.0zxk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1916140zxk {
    public static boolean LIZ() {
        if (C1916120zxi.LJI.getBoolean("consent_once_shown", false)) {
            return false;
        }
        return !((INewUserDebugService) ServiceManager.get().getService(INewUserDebugService.class)).LJIIIZ();
    }
}
