package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.076B, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C076B extends C09AY implements Function0<Integer> {
    public C076B() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iLJIIZILJ;
        try {
            iLJIIZILJ = C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 2, "tt_reuse_memory_cache_opt", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            iLJIIZILJ = 0;
        }
        return Integer.valueOf(iLJIIZILJ);
    }
}
