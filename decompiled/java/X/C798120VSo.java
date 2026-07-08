package X;

import android.app.usage.NetworkStatsManager;

/* JADX INFO: renamed from: X.0VSo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798120VSo {
    public int LIZ = -1;
    public long LIZIZ;
    public long LIZJ;
    public NetworkStatsManager LIZLLL;
    public long LJ;

    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair LIZ(int r20) {
        /*
            r19 = this;
            r15 = 0
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = r19
            android.app.usage.NetworkStatsManager r0 = r4.LIZLLL
            r3 = 0
            if (r0 != 0) goto L26
            android.app.Application r0 = X.C798140VSq.LIZIZ
            if (r0 == 0) goto L3c
            android.content.Context r1 = X.C786410Ut5.M3(r0)
            if (r1 == 0) goto L3c
            java.lang.String r0 = "netstats"
            java.lang.Object r1 = X.C786410Ut5.H2(r1, r0)
        L1e:
            boolean r0 = r1 instanceof android.app.usage.NetworkStatsManager
            if (r0 == 0) goto L3a
            android.app.usage.NetworkStatsManager r1 = (android.app.usage.NetworkStatsManager) r1
        L24:
            r4.LIZLLL = r1
        L26:
            android.app.usage.NetworkStatsManager r0 = r4.LIZLLL
            r10 = 0
            if (r0 != 0) goto L3e
            java.lang.Long r2 = java.lang.Long.valueOf(r15)
            java.lang.Long r1 = java.lang.Long.valueOf(r15)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        L3a:
            r1 = r3
            goto L24
        L3c:
            r1 = r3
            goto L1e
        L3e:
            android.app.usage.NetworkStats$Bucket r2 = new android.app.usage.NetworkStats$Bucket
            r2.<init>()
            android.app.usage.NetworkStatsManager r12 = r4.LIZLLL     // Catch: java.lang.Exception -> L4f
            if (r12 == 0) goto L53
            r14 = 0
            r13 = r20
            android.app.usage.NetworkStats r3 = r12.querySummary(r13, r14, r15, r17)     // Catch: java.lang.Exception -> L4f
            goto L53
        L4f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L53:
            r8 = 0
            if (r3 == 0) goto Lae
        L57:
            boolean r0 = r3.hasNextBucket()
            if (r0 == 0) goto Lab
            r3.getNextBucket(r2)
            int r6 = r2.getUid()
            android.app.Application r7 = X.C798140VSq.LIZIZ
            int r1 = r4.LIZ
            r0 = -1
            if (r1 != r0) goto L9c
            if (r7 == 0) goto L9c
            android.content.Context r0 = X.C786410Ut5.N3(r7)
            if (r0 == 0) goto L9c
            android.content.pm.PackageManager r5 = r0.getPackageManager()
            if (r5 == 0) goto L9c
            if (r7 == 0) goto L87
            android.content.Context r0 = X.C786410Ut5.N3(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L98
            if (r0 == 0) goto L87
            java.lang.String r1 = r0.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L98
            if (r1 != 0) goto L89
        L87:
            java.lang.String r1 = ""
        L89:
            r0 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r0 = X.C786410Ut5.Y3(r5, r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L98
            if (r0 == 0) goto L9c
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L98
            int r0 = r0.uid     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L98
            r4.LIZ = r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L98
            goto L9c
        L98:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L9c:
            int r0 = r4.LIZ
            if (r0 != r6) goto L57
            long r0 = r2.getRxBytes()
            long r10 = r10 + r0
            long r0 = r2.getTxBytes()
            long r8 = r8 + r0
            goto L57
        Lab:
            r3.close()
        Lae:
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C798120VSo.LIZ(int):kotlin.Pair");
    }
}
