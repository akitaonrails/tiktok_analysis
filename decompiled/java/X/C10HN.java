package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.utils.StorageCleanConfig;

/* JADX INFO: renamed from: X.10HN, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10HN {
    public static StorageCleanConfig LIZ() {
        StorageCleanConfig storageCleanConfig;
        try {
            SettingsManager.LIZLLL().getClass();
            storageCleanConfig = (StorageCleanConfig) SettingsManager.LJII("disk_space_threshold", StorageCleanConfig.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (storageCleanConfig != null) {
            return storageCleanConfig;
        }
        StorageCleanConfig storageCleanConfig2 = new StorageCleanConfig();
        storageCleanConfig2.diskFreeSpaceThreshold = 440;
        storageCleanConfig2.appUsageValueThreshold = 1370;
        return storageCleanConfig2;
    }
}
