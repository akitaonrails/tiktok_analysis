package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.series.seriesdetail.serviceimpl.SeriesBlockServiceImpl;
import com.ss.android.ugc.aweme.service.IPaidSeriesBlockService;

/* JADX INFO: renamed from: X.04n0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1201604n0 {
    public static final /* synthetic */ C1201604n0 LIZ = new C1201604n0();
    public static final IPaidSeriesBlockService LIZIZ;

    static {
        Object c098200Yq;
        try {
            Object objLIZ = C04TD.LIZ(IPaidSeriesBlockService.class, false);
            c098200Yq = objLIZ != null ? (IPaidSeriesBlockService) objLIZ : new SeriesBlockServiceImpl();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        LIZIZ = (IPaidSeriesBlockService) c098200Yq;
    }
}
