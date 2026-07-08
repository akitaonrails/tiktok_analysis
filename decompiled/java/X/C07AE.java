package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07AE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07AE extends C09AY implements Function0<Boolean> {
    public C07AE() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean zLJIIIZ = false;
        try {
            zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "live_safe_view_tree_opt", true, false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return Boolean.valueOf(zLJIIIZ);
    }
}
