package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.034T, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C034T extends C09AY implements Function0<Boolean> {
    public C034T() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean zLJIIIZ = false;
        try {
            zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "ecom_saas_switch_tt_spi", true, false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return Boolean.valueOf(zLJIIIZ);
    }
}
