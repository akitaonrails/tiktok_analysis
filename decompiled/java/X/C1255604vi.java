package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.df.api.visualsearch.ISearchVisualSearchService;
import com.ss.android.ugc.aweme.search.df.api.visualsearch.SearchVisualSearchServiceDefaultImpl;
import kotlin.Unit;

/* JADX INFO: renamed from: X.04vi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1255604vi {
    public static final C1255604vi LIZ = new C1255604vi();
    public static volatile ISearchVisualSearchService LIZIZ = LIZ(true);

    public static ISearchVisualSearchService LIZ(boolean z) {
        Object c098200Yq;
        boolean zLIZ;
        Object c098200Yq2;
        try {
            try {
                c098200Yq = (ISearchVisualSearchService) PluggableExtentionKt.pluggableSpi$default(ISearchVisualSearchService.class, false, false, false, 14, null);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            ISearchVisualSearchService iSearchVisualSearchService = (ISearchVisualSearchService) c098200Yq;
            if (iSearchVisualSearchService == null) {
                zLIZ = false;
            } else {
                try {
                    zLIZ = iSearchVisualSearchService.LIZ();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
            }
            c098200Yq2 = Boolean.valueOf(zLIZ);
            C189200o6.m2constructorimpl(c098200Yq2);
            Boolean bool = Boolean.FALSE;
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = bool;
            }
            if (!((Boolean) c098200Yq2).booleanValue()) {
                if (z) {
                    try {
                        C673090Qah.LIZIZ.LIZ();
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        C189200o6.m2constructorimpl(new C098200Yq(th3));
                    }
                }
                return new SearchVisualSearchServiceDefaultImpl();
            }
            if (iSearchVisualSearchService == null) {
                return new SearchVisualSearchServiceDefaultImpl();
            }
            return iSearchVisualSearchService;
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            return new SearchVisualSearchServiceDefaultImpl();
        }
    }
}
