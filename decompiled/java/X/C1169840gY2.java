package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0gY2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1169840gY2 {
    public static final void LIZ(C422840Gi2 c422840Gi2) {
        UrlModel urlModelLIZ = C848410XPz.LIZ(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser());
        if (urlModelLIZ != null) {
            C1324840ka2.LJFF(c422840Gi2, urlModelLIZ);
        }
    }
}
