package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04Wi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1111404Wi extends C09AY implements Function0<Boolean> {
    public C1111404Wi() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean zLJIIIZ = false;
        try {
            zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "bottom_label_container_visibility", true, false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Boolean.valueOf(zLJIIIZ);
    }
}
