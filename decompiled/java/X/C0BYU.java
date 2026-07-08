package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BYU, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BYU extends C09AY implements Function0<Integer> {
    public C0BYU() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iLJFF = 1;
        try {
            iLJFF = C19252910Tv.LIZIZ.LIZLLL().LIZ().LJFF(C0C64.LJIILLIIL().LJIJ(31744, 1, "playback_speed", true));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Integer.valueOf(iLJFF);
    }
}
