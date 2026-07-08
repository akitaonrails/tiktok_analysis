package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C32, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C32 extends C09AY implements Function0<Boolean> {
    public C0C32() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Boolean invoke() {
        boolean zLIZ;
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("motion_event_monitor_settings", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C0C33.LIZ.getClass();
            zLIZ = C0C33.LIZIZ;
        }
        return Boolean.valueOf(zLIZ);
    }
}
