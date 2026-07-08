package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.05NB, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05NB implements InterfaceC1770740wBE {
    @Override // X.InterfaceC1770740wBE
    public final User getCurrentUser() {
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null) {
            return iUserService.getCurrentUser();
        }
        return null;
    }
}
