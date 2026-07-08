package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.ICredentialManagerService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.10h9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19313310h9 {
    public static final C19313310h9 LIZ = new C19313310h9();

    public static boolean LIZ(Activity activity) {
        ICredentialManagerService iCredentialManagerService = (ICredentialManagerService) ServiceManager.get().getService(ICredentialManagerService.class);
        if (iCredentialManagerService != null && iCredentialManagerService.LIZLLL(activity.getTaskId())) {
            return true;
        }
        return false;
    }
}
