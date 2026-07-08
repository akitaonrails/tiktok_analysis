package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04U6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04U6 extends C09AY implements Function0<Boolean> {
    public C04U6() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean zLIZ = false;
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("swipe_refresh_layout_log_settings", false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        return Boolean.valueOf(zLIZ);
    }
}
