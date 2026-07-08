package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07RJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07RJ extends C09AY implements Function0<Boolean> {
    public C07RJ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z = false;
        try {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "search_saf_preload_root_new", true) == 1) {
                if (C07RK.LIZ()) {
                    z = true;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return Boolean.valueOf(z);
    }
}
