package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.0IaU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C469120IaU {
    public static String LIZ(long j) {
        return j < 0 ? "[-∞, 0)" : j < Mp4ScreenVideoLoadTimeout.CONTROL ? "[0, 5s)" : j < 12000 ? "[5s, 12s)" : j < 30000 ? "[12s, 30s)" : j < 60000 ? "[30s, 1min)" : j < 180000 ? "[1min, 3min)" : j < 900000 ? "[3min, 15min)" : j < 1800000 ? "[15min, 0.5h)" : j < 3600000 ? "[0.5h, 1h)" : "[1h, +∞)";
    }
}
