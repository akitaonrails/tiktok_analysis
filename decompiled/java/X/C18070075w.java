package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.075w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C18070075w extends C09AY implements Function0<Boolean> {
    public C18070075w() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z = true;
        try {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "saf_fix_scene_config_leak", true) == 1) {
                z = false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return Boolean.valueOf(z);
    }
}
