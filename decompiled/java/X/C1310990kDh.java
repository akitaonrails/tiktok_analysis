package X;

import com.bytedance.lynx.service.reporter.performance.LynxMemoryUsageGlobalReporter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1310990kDh extends C09AY implements Function0<LynxMemoryUsageGlobalReporter> {
    public final /* synthetic */ C1310900kDY LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1310990kDh(C1310900kDY c1310900kDY) {
        super(0);
        this.LL = c1310900kDY;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LynxMemoryUsageGlobalReporter invoke() {
        LynxMemoryUsageGlobalReporter lynxMemoryUsageGlobalReporter = new LynxMemoryUsageGlobalReporter();
        lynxMemoryUsageGlobalReporter.onInitialize(this.LL.LJ);
        return lynxMemoryUsageGlobalReporter;
    }
}
