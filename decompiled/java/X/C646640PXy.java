package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchContextService;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.communicate.spi.SearchContextService;

/* JADX INFO: renamed from: X.0PXy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C646640PXy {
    public static final C646640PXy LIZ = new C646640PXy();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C07IY());

    public static ISearchContextService LIZ() {
        if (((Number) LIZIZ.getValue()).intValue() != 1) {
            return (ISearchContextService) ServiceManager.get().getService(ISearchService.class);
        }
        int i = SearchContextService.LIZIZ;
        Object objLIZ = C04TD.LIZ(ISearchContextService.class, false);
        if (objLIZ != null) {
            return (ISearchContextService) objLIZ;
        }
        if (C04TD.I3 == null) {
            synchronized (ISearchContextService.class) {
                if (C04TD.I3 == null) {
                    C04TD.I3 = new SearchContextService();
                }
            }
        }
        return C04TD.I3;
    }
}
