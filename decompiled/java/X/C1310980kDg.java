package X;

import com.lynx.tasm.LynxEnv;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kDg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1310980kDg extends C09AY implements Function0<Long> {
    public C1310980kDg() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(LynxEnv.inst().getGlobalMemoryReportThresholdMB() * 1024 * 1024);
    }
}
