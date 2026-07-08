package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.052V, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C052V extends C09AY implements Function0<Boolean> {
    public C052V() {
        super(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke() {
        /*
            r3 = this;
            X.01GW r0 = X.C1250004uo.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L18
            com.ss.android.ugc.aweme.strategy.api.IStrategyApi r0 = X.C104100aN.LIZ()
            boolean r0 = r0.LJJII()
            if (r0 != 0) goto L37
        L18:
            X.01GW r0 = X.C1250004uo.LIZJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto L38
            java.lang.Class<com.ss.android.ugc.aweme.feed.IFeedLaunchService> r0 = com.ss.android.ugc.aweme.feed.IFeedLaunchService.class
            java.lang.Object r0 = X.C04TD.LIZ(r0, r2)
            if (r0 == 0) goto L40
            com.ss.android.ugc.aweme.feed.IFeedLaunchService r0 = (com.ss.android.ugc.aweme.feed.IFeedLaunchService) r0
        L31:
            boolean r0 = r0.LIZ()
            if (r0 == 0) goto L38
        L37:
            r2 = 1
        L38:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r0.booleanValue()
            return r0
        L40:
            com.ss.android.ugc.aweme.launch.FeedLaunchServiceImpl r0 = X.C04TD.B1
            if (r0 != 0) goto L53
            java.lang.Class<com.ss.android.ugc.aweme.feed.IFeedLaunchService> r1 = com.ss.android.ugc.aweme.feed.IFeedLaunchService.class
            monitor-enter(r1)
            com.ss.android.ugc.aweme.launch.FeedLaunchServiceImpl r0 = X.C04TD.B1     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L52
            com.ss.android.ugc.aweme.launch.FeedLaunchServiceImpl r0 = new com.ss.android.ugc.aweme.launch.FeedLaunchServiceImpl     // Catch: java.lang.Throwable -> L56
            r0.<init>()     // Catch: java.lang.Throwable -> L56
            X.C04TD.B1 = r0     // Catch: java.lang.Throwable -> L56
        L52:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
        L53:
            com.ss.android.ugc.aweme.launch.FeedLaunchServiceImpl r0 = X.C04TD.B1
            goto L31
        L56:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C052V.invoke():java.lang.Object");
    }
}
