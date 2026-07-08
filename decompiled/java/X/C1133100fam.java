package X;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.performance.memory.MemoryOptConfig;

/* JADX INFO: renamed from: X.0fam, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("memory_size_opt_v3")
public final class C1133100fam {
    public static final C1133100fam LIZ = new C1133100fam();
    public static final MemoryOptConfig LIZIZ = new MemoryOptConfig(false, false, 0, 0, 0);

    public static MemoryOptConfig LIZ() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MemoryOptConfig memoryOptConfig = LIZIZ;
        MemoryOptConfig memoryOptConfig2 = (MemoryOptConfig) settingsManager.getValueSafely("memory_size_opt_v3", memoryOptConfig);
        return memoryOptConfig2 != null ? memoryOptConfig2 : memoryOptConfig;
    }
}
