package X;

import com.lynx.tasm.LynxEnv;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kDa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1310920kDa extends C09AY implements Function0<Long> {
    public C1310920kDa() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(LynxEnv.inst().getMemoryReportIntervalSec());
    }
}
