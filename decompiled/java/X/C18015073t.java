package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.073t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C18015073t extends C09AY implements Function0<Integer> {
    public C18015073t() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iLJIIZILJ;
        try {
            iLJIIZILJ = C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 2, "cold_boot_thread_adjust_switch", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            iLJIIZILJ = 0;
        }
        return Integer.valueOf(iLJIIZILJ);
    }
}
