package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04Ux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1107704Ux extends C09AY implements Function0<Boolean> {
    public C1107704Ux() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z = false;
        try {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "time_utils_lazy_enable", true, false)) {
                z = true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Boolean.valueOf(z);
    }
}
