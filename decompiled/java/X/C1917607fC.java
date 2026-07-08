package X;

import com.aweme.storage.cleaner.experiment.ExtremeStorageCleanConfig;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07fC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1917607fC extends C09AY implements Function0<ExtremeStorageCleanConfig> {
    public C1917607fC() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ExtremeStorageCleanConfig invoke() {
        try {
            ExtremeStorageCleanConfig extremeStorageCleanConfig = (ExtremeStorageCleanConfig) C08JS.LIZ(((Keva) C2250201D5m.LIZIZ.getValue()).getString("extreme_storage_clean", null), ExtremeStorageCleanConfig.class);
            return extremeStorageCleanConfig == null ? C2250201D5m.LIZJ : extremeStorageCleanConfig;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C2250201D5m.LIZJ;
        }
    }
}
