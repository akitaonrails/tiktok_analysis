package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07CV, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07CV extends C09AY implements Function0<Integer> {
    public C07CV() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iIntValue = 0;
        try {
            Integer numValueOf = Integer.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "ad_mask_refactor_experiment", true));
            if (!(numValueOf.intValue() >= 0)) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return Integer.valueOf(iIntValue);
    }
}
