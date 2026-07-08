package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07Hf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1836507Hf extends C09AY implements Function0<ISeriesFeedService> {
    public C1836507Hf() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.ss.android.ugc.aweme.series.feed.ISeriesFeedService, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.jvm.functions.Function0
    public final ISeriesFeedService invoke() {
        ?? r1;
        try {
            ISeriesFeedService iSeriesFeedService = (ISeriesFeedService) ServiceManager.get().getService(ISeriesFeedService.class);
            C189200o6.m2constructorimpl(iSeriesFeedService);
            r1 = iSeriesFeedService;
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
