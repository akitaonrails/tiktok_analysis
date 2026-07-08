package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.074Q, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C074Q extends C09AY implements Function0<Integer> {
    public C074Q() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iLJIIZILJ;
        try {
            iLJIIZILJ = C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 2, "delay_smart_service_preload_opt", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            iLJIIZILJ = 0;
        }
        return Integer.valueOf(iLJIIZILJ);
    }
}
