package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.077R, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C077R extends C09AY implements Function0<Integer> {
    public C077R() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iLJIJ = 200;
        try {
            iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 200, "feed_global_consume_count", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return Integer.valueOf(iLJIJ);
    }
}
