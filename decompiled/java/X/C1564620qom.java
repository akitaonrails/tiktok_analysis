package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;

/* JADX INFO: renamed from: X.0qom, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1564620qom {
    public static void LIZ(C19EG c19eg) {
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().hideProgress(c19eg);
    }

    public static void LIZIZ(C19EG c19eg) {
        if (c19eg == null) {
            return;
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().showProgress(c19eg, true);
    }
}
