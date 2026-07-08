package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.074S, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C074S extends C09AY implements Function0<Integer> {
    public C074S() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iLJIIZILJ;
        try {
            iLJIIZILJ = C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 2, "cold_boot_hook_thread_create_switch", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            iLJIIZILJ = 0;
        }
        return Integer.valueOf(iLJIIZILJ);
    }
}
