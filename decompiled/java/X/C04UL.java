package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04UL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04UL extends C09AY implements Function0<Boolean> {
    public C04UL() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean zLIZ = false;
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("advance_omsdk_session_start_timing", false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        return Boolean.valueOf(zLIZ);
    }
}
