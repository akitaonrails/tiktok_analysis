package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Bsd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C302010Bsd extends C09AY implements Function0<Boolean> {
    public C302010Bsd() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Boolean invoke() {
        boolean zLJIIIZ = false;
        try {
            zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "live_preview_card_animation_opt", true, false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C302020Bse.LIZ.getClass();
        }
        return Boolean.valueOf(zLJIIIZ);
    }
}
