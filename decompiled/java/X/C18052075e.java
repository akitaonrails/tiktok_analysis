package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.075e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C18052075e extends C09AY implements Function0<Boolean> {
    public C18052075e() {
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
        if (C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 2, "milo_start_up_state_callback_opt", true) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
