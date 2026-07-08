package X;

import com.ss.android.ugc.aweme.search.performance.metrics.SearchMiddleMonitor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QIV, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QIV extends C09AY implements Function0<Boolean> {
    public C0QIV() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((Boolean) C0QMQ.LIZLLL.getValue()).booleanValue() && SearchMiddleMonitor.INSTANCE.getHitCpuMonitorSample());
    }
}
