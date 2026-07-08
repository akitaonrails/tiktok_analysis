package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07GZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07GZ extends C09AY implements Function0<Boolean> {
    public C07GZ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean zLJIIIZ = false;
        try {
            zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "search_photo_mode_bug_fix", true, false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Boolean.valueOf(zLJIIIZ);
    }
}
