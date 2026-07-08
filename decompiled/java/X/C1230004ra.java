package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04ra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1230004ra extends C09AY implements Function0<Long> {
    public C1230004ra() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        Object c098200Yq;
        try {
            c098200Yq = Long.valueOf(C0C64.LJIILLIIL().LJIJJ(31744, 2, true, "init_ttnet_deterioration", 0L));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = 0L;
        }
        return Long.valueOf(((Number) c098200Yq).longValue());
    }
}
