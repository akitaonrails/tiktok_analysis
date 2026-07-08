package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0REx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C692650REx extends C09AY implements Function0<Boolean> {
    public C692650REx() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Boolean invoke() {
        boolean zLIZ;
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("enable_anole_abnormal_status_fix", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C692640REw.LIZ.getClass();
            zLIZ = C692640REw.LIZIZ;
        }
        return Boolean.valueOf(zLIZ);
    }
}
