package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04VV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04VV extends C09AY implements Function0<Integer> {
    public C04VV() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iLJIJ = 0;
        try {
            iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "photo_mode_remove_surface_exp", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Integer.valueOf(iLJIJ);
    }
}
