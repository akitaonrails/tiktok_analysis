package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.IPerformanceOptAppDiffService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07Fo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1832207Fo extends C09AY implements Function0<Long> {
    public C1832207Fo() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        IPerformanceOptAppDiffService iPerformanceOptAppDiffService = (IPerformanceOptAppDiffService) PluggableExtentionKt.pluggableSpi$default(IPerformanceOptAppDiffService.class, false, false, false, 14, null);
        if (iPerformanceOptAppDiffService != null) {
            return Long.valueOf(iPerformanceOptAppDiffService.LIZLLL());
        }
        return null;
    }
}
