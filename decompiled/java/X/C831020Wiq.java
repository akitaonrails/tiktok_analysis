package X;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* JADX INFO: renamed from: X.0Wiq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C831020Wiq {
    public static C831020Wiq LIZIZ;
    public static final RootTelemetryConfiguration LIZJ = new RootTelemetryConfiguration(0, 0, 0, false, false);
    public RootTelemetryConfiguration LIZ;

    public static synchronized C831020Wiq LIZ() {
        if (LIZIZ == null) {
            LIZIZ = new C831020Wiq();
        }
        return LIZIZ;
    }
}
