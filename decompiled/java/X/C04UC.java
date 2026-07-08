package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04UC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04UC extends C09AY implements Function0<Integer> {
    public C04UC() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iLJIJ = 1;
        try {
            iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 1, "multi_anchor_enable_mob_refactor", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        return Integer.valueOf(iLJIJ);
    }
}
