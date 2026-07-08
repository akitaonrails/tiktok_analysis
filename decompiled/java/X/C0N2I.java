package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.ogc.news.INewsService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0N2I, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N2I extends C09AY implements Function0<INewsService> {
    public C0N2I() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.ss.android.ugc.aweme.ogc.news.INewsService, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.jvm.functions.Function0
    public final INewsService invoke() {
        ?? r1;
        try {
            INewsService iNewsService = (INewsService) PluggableExtentionKt.pluggableSpi$default(INewsService.class, false, false, false, 14, null);
            C189200o6.m2constructorimpl(iNewsService);
            r1 = iNewsService;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            r1 = c098200Yq;
        }
        if (C189200o6.m7isFailureimpl(r1)) {
            return null;
        }
        return r1;
    }
}
