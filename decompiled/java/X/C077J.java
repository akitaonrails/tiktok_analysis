package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.077J, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C077J extends C09AY implements Function0<Integer> {
    public C077J() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iLJIIZILJ;
        try {
            iLJIIZILJ = C0C64.LJIILLIIL().LJIIZILJ(31744, 20, 2, "feed_monitor_split_time_exp", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            iLJIIZILJ = 20;
        }
        return Integer.valueOf(iLJIIZILJ);
    }
}
