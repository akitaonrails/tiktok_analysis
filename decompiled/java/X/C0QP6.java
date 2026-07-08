package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;

/* JADX INFO: renamed from: X.0QP6, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QP6 {
    public static final C0QP6 LIZ = new C0QP6();

    public static boolean LIZ(C19EG c19eg) {
        if (((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJJLIIIJJI(c19eg)) {
            return false;
        }
        ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJJIJIIJIL();
        return true;
    }
}
