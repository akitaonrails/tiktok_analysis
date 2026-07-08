package X;

import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.1584, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1584 {
    public static volatile boolean LIZIZ;
    public static final ExecutorService LIZ = C786410Ut5.h4();
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C158A());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new AnonymousClass1589());
    public static final C01GW LJ = C452501pT.LIZIZ(new AnonymousClass1586());
    public static final C01GW LJFF = C452501pT.LIZIZ(new AnonymousClass1585());

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0075 A[LOOP:0: B:8:0x002d->B:12:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0090 A[EDGE_INSN: B:19:0x0090->B:17:0x0090 BREAK  A[LOOP:0: B:8:0x002d->B:12:0x0075], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(int r5, X.C1097250eex r6) {
        /*
            java.lang.String r0 = "livesdk_point_pinnacle_collection"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            java.lang.String r1 = "log_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.LJJII(r0, r1)
            long r0 = r6.LIZIZ
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "time"
            r2.LJJII(r1, r0)
            int r0 = r6.LIZ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "count"
            r2.LJJII(r1, r0)
            r0 = 1
            if (r5 == r0) goto L78
            r0 = 3
            if (r5 == r0) goto L83
            r5 = 5
        L2c:
            r4 = 0
        L2d:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "log_name_"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "log_count_"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.util.List<kotlin.Pair<java.lang.String, java.lang.Integer>> r0 = r6.LIZJ
            int r0 = r0.size()
            if (r4 >= r0) goto L73
            java.util.List<kotlin.Pair<java.lang.String, java.lang.Integer>> r0 = r6.LIZJ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r4)
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.getFirst()
            r2.LJJII(r0, r3)
            java.util.List<kotlin.Pair<java.lang.String, java.lang.Integer>> r0 = r6.LIZJ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r4)
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.getSecond()
            r2.LJJII(r0, r1)
        L73:
            if (r4 == r5) goto L90
            int r4 = r4 + 1
            goto L2d
        L78:
            com.bytedance.android.livesdk.livesetting.performance.LiveLogDensityMonitorSetting r0 = com.bytedance.android.livesdk.livesetting.performance.LiveLogDensityMonitorSetting.INSTANCE
            com.bytedance.android.livesdk.livesetting.performance.LiveLogDensityMonitorSetting$LiveLogDensityMonitorModelItem r0 = r0.getAppLogSampleConfig()
            int r5 = r0.getMonitorReportTopN()
            goto L8d
        L83:
            com.bytedance.android.livesdk.livesetting.performance.LiveLogDensityMonitorSetting r0 = com.bytedance.android.livesdk.livesetting.performance.LiveLogDensityMonitorSetting.INSTANCE
            com.bytedance.android.livesdk.livesetting.performance.LiveLogDensityMonitorSetting$LiveLogDensityMonitorModelItem r0 = r0.getAlogSampleConfig()
            int r5 = r0.getMonitorReportTopN()
        L8d:
            if (r5 < 0) goto L90
            goto L2c
        L90:
            r2.LIZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1584.LIZ(int, X.0eex):void");
    }
}
