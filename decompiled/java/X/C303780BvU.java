package X;

import com.ss.android.ugc.aweme.net.settings.NetworkMonitorConfig;

/* JADX INFO: renamed from: X.0BvU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C303780BvU {
    public static final NetworkMonitorConfig LIZ = new NetworkMonitorConfig(true, true, true, true, true, true);
    public static Long LIZIZ;
    public static NetworkMonitorConfig LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x000c, B:8:0x0013, B:11:0x0038, B:13:0x003c, B:10:0x001b), top: B:20:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.net.settings.NetworkMonitorConfig LIZ() {
        /*
            com.ss.android.ugc.aweme.net.settings.NetworkMonitorConfig r0 = X.C303780BvU.LIZJ     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L1b
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3f
            java.lang.Long r0 = X.C303780BvU.LIZIZ     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L11
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L3f
            goto L13
        L11:
            r0 = 0
        L13:
            long r3 = r3 - r0
            r1 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L38
        L1b:
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "network_monitor_manager_config"
            java.lang.Class<com.ss.android.ugc.aweme.net.settings.NetworkMonitorConfig> r0 = com.ss.android.ugc.aweme.net.settings.NetworkMonitorConfig.class
            r2.getClass()     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r0 = com.bytedance.ies.abmock.SettingsManager.LJII(r1, r0)     // Catch: java.lang.Throwable -> L3f
            com.ss.android.ugc.aweme.net.settings.NetworkMonitorConfig r0 = (com.ss.android.ugc.aweme.net.settings.NetworkMonitorConfig) r0     // Catch: java.lang.Throwable -> L3f
            X.C303780BvU.LIZJ = r0     // Catch: java.lang.Throwable -> L3f
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3f
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L3f
            X.C303780BvU.LIZIZ = r0     // Catch: java.lang.Throwable -> L3f
        L38:
            com.ss.android.ugc.aweme.net.settings.NetworkMonitorConfig r0 = X.C303780BvU.LIZJ     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L49
            com.ss.android.ugc.aweme.net.settings.NetworkMonitorConfig r0 = X.C303780BvU.LIZ     // Catch: java.lang.Throwable -> L3f
            return r0
        L3f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.net.settings.NetworkMonitorConfig r0 = X.C303780BvU.LIZJ
            if (r0 != 0) goto L49
            com.ss.android.ugc.aweme.net.settings.NetworkMonitorConfig r0 = X.C303780BvU.LIZ
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C303780BvU.LIZ():com.ss.android.ugc.aweme.net.settings.NetworkMonitorConfig");
    }
}
