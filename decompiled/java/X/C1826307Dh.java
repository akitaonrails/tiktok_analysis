package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07Dh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1826307Dh extends C09AY implements Function0<Integer> {
    public C1826307Dh() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iIntValue = 0;
        try {
            Integer numLIZ = C1844307Kf.LIZ("search_root_fragment_experiment_search_context_part");
            iIntValue = numLIZ != null ? numLIZ.intValue() : C0C64.LJIILLIIL().LJIJ(31744, 0, "search_root_fragment_experiment_search_context_part", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return Integer.valueOf(iIntValue);
    }
}
