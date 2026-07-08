package X;

import com.bytedance.android.livesdk.performance.LiveColdBootOptConfig;

/* JADX INFO: renamed from: X.0J6s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C486680J6s {
    public static final LiveColdBootOptConfig LIZ = new LiveColdBootOptConfig(0, false, false, false, false, false, false);
    public static final LiveColdBootOptConfig LIZIZ = new LiveColdBootOptConfig(10000, true, true, true, true, true, true);

    public static LiveColdBootOptConfig LIZ() {
        if (C1856507Ox.LIZ()) {
            return LIZIZ;
        }
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        LiveColdBootOptConfig liveColdBootOptConfig = LIZ;
        LiveColdBootOptConfig liveColdBootOptConfig2 = (LiveColdBootOptConfig) c0c64LJIILLIIL.LJJII(LiveColdBootOptConfig.class, liveColdBootOptConfig, "live_cold_boot_opt", true);
        return liveColdBootOptConfig2 == null ? liveColdBootOptConfig : liveColdBootOptConfig2;
    }
}
