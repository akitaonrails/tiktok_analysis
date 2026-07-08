package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07Gl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1834507Gl extends C09AY implements Function0<Boolean> {
    public C1834507Gl() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z = false;
        try {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "single_activity_reuse_recycle_threshold", true) == 2) {
                z = true;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return Boolean.valueOf(z);
    }
}
