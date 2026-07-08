package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0771, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0771 extends C09AY implements Function0<Boolean> {
    public AnonymousClass0771() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z;
        try {
            z = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 2, "milo_new_core_thread_pool_exp", true) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
