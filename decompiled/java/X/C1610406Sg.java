package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ab.MemoryControlConfig;

/* JADX INFO: renamed from: X.06Sg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1610406Sg {
    public static final MemoryControlConfig LIZ = new MemoryControlConfig(false, 0, null, 7, null);

    public static MemoryControlConfig LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            MemoryControlConfig memoryControlConfig = LIZ;
            MemoryControlConfig memoryControlConfig2 = (MemoryControlConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_memory_control_config", MemoryControlConfig.class, memoryControlConfig);
            return memoryControlConfig2 != null ? memoryControlConfig2 : memoryControlConfig;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LIZ;
        }
    }
}
