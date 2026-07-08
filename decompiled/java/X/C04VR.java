package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04VR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04VR extends C09AY implements Function0<Integer> {
    public C04VR() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iLJIJ = 0;
        try {
            iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "seekbar_show_thumbnail_when_drag", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Integer.valueOf(iLJIJ);
    }
}
