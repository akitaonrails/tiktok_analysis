package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07EZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07EZ extends C09AY implements Function0<Integer> {
    public C07EZ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iLJIJ = 0;
        try {
            iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "search_bar_on_feed_style", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return Integer.valueOf(iLJIJ);
    }
}
