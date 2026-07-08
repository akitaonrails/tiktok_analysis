package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.df.api.visualsearch.IVisualSearchDetailPageShareVMService;

/* JADX INFO: renamed from: X.04vd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1255104vd {
    public static final C1255104vd LIZ = new C1255104vd();
    public static volatile IVisualSearchDetailPageShareVMService LIZIZ = LIZ();

    public static IVisualSearchDetailPageShareVMService LIZ() {
        Object c098200Yq;
        C1255604vi.LIZ.getClass();
        if (!C1255604vi.LIZIZ.LIZ()) {
            return null;
        }
        try {
            c098200Yq = (IVisualSearchDetailPageShareVMService) PluggableExtentionKt.pluggableSpiForReal(IVisualSearchDetailPageShareVMService.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (IVisualSearchDetailPageShareVMService) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }
}
