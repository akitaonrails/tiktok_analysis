package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07Cf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1823507Cf extends C09AY implements Function0<Integer> {
    public C1823507Cf() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Integer invoke() {
        int iLJIJ = 5;
        try {
            iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 5, "photomode_finish_et_threshold", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Integer.valueOf(iLJIJ);
    }
}
