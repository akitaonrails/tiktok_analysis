package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.075q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C18064075q extends C09AY implements Function0<Boolean> {
    public C18064075q() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean zLJIIIZ = false;
        try {
            zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "saf_shell_start", true, false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return Boolean.valueOf(zLJIIIZ);
    }
}
