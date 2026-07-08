package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07XN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07XN extends C09AY implements Function0<C07XM> {
    public C07XN() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C07XM invoke() {
        try {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "a11y_reduce_transparency", true, false)) {
                return new C07XM(0);
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
