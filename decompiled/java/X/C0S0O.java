package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0S0O, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S0O extends C09AY implements Function0<Boolean> {
    public C0S0O() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Boolean invoke() {
        boolean zLIZ;
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("detail_cell_enable_anole", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0S0N.LIZ.getClass();
            zLIZ = C0S0N.LIZIZ;
        }
        return Boolean.valueOf(zLIZ);
    }
}
