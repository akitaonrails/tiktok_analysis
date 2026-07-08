package X;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0X4T, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X4T {
    public static volatile boolean LIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static volatile long LJFF;
    public static volatile long LJI;
    public static long LJII;
    public static volatile long LJIIIIZZ;
    public static long LJIIIZ;
    public static volatile long LJIIJ;
    public static long LJIIJJI;
    public static volatile long LJIIL;
    public static long LJIILIIL;
    public static volatile long LJIILJJIL;
    public static long LJIILL;
    public static volatile long LJIILLIIL;
    public static long LJIIZILJ;
    public static volatile long LJIJ;
    public static long LJIJI;
    public static volatile long LJIJJ;
    public static long LJIJJLI;
    public static volatile long LJIL;
    public static long LJJ;
    public static volatile long LJJI;
    public static long LJJIFFI;
    public static volatile long LJJII;
    public static long LJJIII;
    public static volatile long LJJIIJ;
    public static long LJJIIJZLJL;
    public static volatile long LJJIIZ;
    public static long LJJIIZI;
    public static volatile long LJJIJ;
    public static long LJJIJIIJI;
    public static volatile long LJJIJIIJIL;
    public static long LJJIJIL;
    public static NetworkStatsManager LJJIJL;
    public static volatile boolean LJJJ;
    public static volatile boolean LJJJIL;
    public static Pair<Long, Long> LIZIZ = new Pair<>(0L, 0L);
    public static int LJJIJLIJ = -1;
    public static boolean LJJIL = true;
    public static boolean LJJIZ = true;
    public static boolean LJJJI = true;
    public static final C01GW LJJJJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(299));
    public static final C0X4W LJJJJI = C0X4W.LIZ;

    /* JADX WARN: Removed duplicated region for block: B:111:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0198 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZJ() {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0X4T.LIZJ():kotlin.Pair");
    }

    public static Pair LIZIZ(int i) {
        int i2;
        NetworkStatsManager networkStatsManager;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        NetworkStats networkStatsQuerySummary = null;
        if (LJJIJL == null) {
            Object objH2 = C786410Ut5.H2(C786410Ut5.N3(contextLIZ), "netstats");
            if (objH2 instanceof NetworkStatsManager) {
                networkStatsManager = (NetworkStatsManager) objH2;
            } else {
                networkStatsManager = null;
            }
            LJJIJL = networkStatsManager;
        }
        long rxBytes = 0;
        if (LJJIJL == null) {
            return new Pair(0L, 0L);
        }
        NetworkStats.Bucket bucket = new NetworkStats.Bucket();
        try {
            NetworkStatsManager networkStatsManager2 = LJJIJL;
            if (networkStatsManager2 != null) {
                networkStatsQuerySummary = networkStatsManager2.querySummary(i, null, 0L, Long.MAX_VALUE);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        long txBytes = 0;
        if (networkStatsQuerySummary != null) {
            while (networkStatsQuerySummary.hasNextBucket()) {
                networkStatsQuerySummary.getNextBucket(bucket);
                int uid = bucket.getUid();
                if (LJJIJLIJ == -1) {
                    try {
                        PackageInfo packageInfoY3 = C786410Ut5.Y3(C786410Ut5.N3(contextLIZ).getPackageManager(), C786410Ut5.N3(contextLIZ).getPackageName(), 128);
                        if (packageInfoY3 != null) {
                            ApplicationInfo applicationInfo = packageInfoY3.applicationInfo;
                            if (applicationInfo != null) {
                                i2 = applicationInfo.uid;
                            } else {
                                i2 = 0;
                            }
                            LJJIJLIJ = i2;
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
                if (LJJIJLIJ == uid) {
                    rxBytes += bucket.getRxBytes();
                    txBytes += bucket.getTxBytes();
                }
            }
            networkStatsQuerySummary.close();
        }
        return new Pair(Long.valueOf(rxBytes), Long.valueOf(txBytes));
    }

    public static void LIZ(long j, String str) {
        if (str == null) {
            str = null;
        } else {
            try {
                str = UriProtector.parse(str).getHost();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        for (String str2 : (List) C1844907Kl.LIZIZ.getValue()) {
            if (str != null && a0.LJJIIZI(str, str2, false)) {
                LJJIJIIJIL += j;
            }
        }
    }

    public static void LJ(long j, String str) {
        if (j >= 0) {
            if (Intrinsics.LJFF(str, "play")) {
                LJJIIJ += j;
            }
            if (Intrinsics.LJFF(str, "preload")) {
                LJJIIZ += j;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(long r3, java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
            int r1 = r5.hashCode()
            r0 = -1798530555(0xffffffff94cc9a05, float:-2.0659486E-26)
            if (r1 == r0) goto L3d
            r0 = -1015101340(0xffffffffc37ec864, float:-254.78278)
            if (r1 == r0) goto L2f
            r0 = 110693149(0x6990b1d, float:5.7568533E-35)
            if (r1 != r0) goto L4b
            java.lang.String r0 = "ttnet"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L4b
            long r0 = X.C0X4T.LJIILJJIL
            long r0 = r0 + r3
            X.C0X4T.LJIILJJIL = r0
        L21:
            if (r7 == 0) goto L51
            X.0V4i r2 = X.C787900UvU.LIZ
            Y.ARunnableS3S1000100_13 r1 = new Y.ARunnableS3S1000100_13
            r0 = 3
            r1.<init>(r3, r6, r0)
            r2.LIZJ(r1)
            return
        L2f:
            java.lang.String r0 = "okhttp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L4b
            long r0 = X.C0X4T.LJIILLIIL
            long r0 = r0 + r3
            X.C0X4T.LJIILLIIL = r0
            goto L21
        L3d:
            java.lang.String r0 = "httpurlconnection"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L4b
            long r0 = X.C0X4T.LJIJ
            long r0 = r0 + r3
            X.C0X4T.LJIJ = r0
            goto L21
        L4b:
            long r0 = X.C0X4T.LJIJJ
            long r0 = r0 + r3
            X.C0X4T.LJIJJ = r0
            goto L21
        L51:
            LIZ(r3, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0X4T.LIZLLL(long, java.lang.String, java.lang.String, boolean):void");
    }
}
