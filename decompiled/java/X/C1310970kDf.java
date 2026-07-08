package X;

import com.bytedance.lynx.service.reporter.performance.LynxMemoryUsageGlobalReporter;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0kDf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1310970kDf extends C09AY implements InterfaceC1631620sYq<Long, Integer, Long, Unit> {
    public final /* synthetic */ LynxMemoryUsageGlobalReporter LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1310970kDf(LynxMemoryUsageGlobalReporter lynxMemoryUsageGlobalReporter) {
        super(3);
        this.LL = lynxMemoryUsageGlobalReporter;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Long l, Integer num, Long l2) {
        l.longValue();
        num.intValue();
        l2.longValue();
        this.LL.reportWithTriggerMode$LynxService_noasanRelease("timer");
        return Unit.LIZ;
    }
}
