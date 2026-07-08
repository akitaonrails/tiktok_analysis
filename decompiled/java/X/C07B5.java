package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07B5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07B5 extends C09AY implements Function0<Boolean> {
    public C07B5() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean zLJIIIZ = false;
        try {
            zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "ec_shop_use_custom_dot_ability_enable", true, false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return Boolean.valueOf(zLJIIIZ);
    }
}
