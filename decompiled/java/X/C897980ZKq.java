package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0ZKq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897980ZKq {
    public static boolean LIZ() {
        return ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser() != null && C10EU.LJIIIIZZ();
    }
}
