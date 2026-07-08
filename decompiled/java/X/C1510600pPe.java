package X;

import com.ss.android.ugc.aweme.ml.ab.SmartIdleDetectionConfig;

/* JADX INFO: renamed from: X.0pPe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510600pPe {
    public static volatile boolean LIZ;
    public static volatile SmartIdleDetectionConfig LIZIZ;

    public static SmartIdleDetectionConfig LIZ() {
        if (!LIZ) {
            LIZIZ = (SmartIdleDetectionConfig) C0C64.LJIILLIIL().LJJII(SmartIdleDetectionConfig.class, null, "client_ai_idle_detection_config", true);
            LIZ = true;
        }
        return LIZIZ;
    }
}
