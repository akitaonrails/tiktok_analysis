package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05H8, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05H8 extends C09AY implements Function0<Boolean> {
    public C05H8() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean zLJIIIIZZ;
        try {
            zLJIIIIZZ = C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "first_feed_show_opt_mall_arch", true, false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            zLJIIIIZZ = false;
        }
        return Boolean.valueOf(zLJIIIIZZ);
    }
}
