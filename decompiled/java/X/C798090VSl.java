package X;

import Y.ARunnableS113S0100000_13;
import Y.ARunnableS32S0110000_13;
import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VSl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798090VSl implements C0V87 {
    public boolean LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public NetworkStatsManager LJIIIZ;
    public long LJII = -1;
    public volatile boolean LJIIIIZZ = true;
    public int LJIIJ = -1;

    public final void LJIIIZ() {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        this.LJII = SystemClock.elapsedRealtime();
        this.LIZIZ = LJIIIIZZ(1);
        this.LIZJ = LJIIIIZZ(0);
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initTrafficData: mTotalWifiBytes:");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(" mTotalMobileBytes:");
            sbLIZ.append(this.LIZJ);
            C792910V8n.LIZ("NewTrafficStatisticsImp", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.C0V87
    public final void init() {
        C791820V4i c791820V4i = C787900UvU.LIZ;
        if (c791820V4i.LIZIZ()) {
            LJIIIZ();
        } else {
            c791820V4i.LIZJ(new ARunnableS113S0100000_13(this, 193));
        }
    }

    @Override // X.C0V87
    public final long LIZIZ() {
        LJIIJ();
        return this.LIZLLL;
    }

    @Override // X.C0V87
    public final long LIZJ() {
        LJIIJ();
        return this.LJ;
    }

    @Override // X.C0V87
    public final long LIZLLL() {
        LJIIJ();
        return this.LIZLLL + this.LJFF;
    }

    @Override // X.C0V87
    public final long LJ() {
        LJIIJ();
        return this.LJ + this.LJI;
    }

    @Override // X.C0V87
    public final long LJFF() {
        return LJ() + LIZLLL();
    }

    @Override // X.C0V87
    public final long LJI() {
        LJIIJ();
        return this.LJFF;
    }

    @Override // X.C0V87
    public final long LJII() {
        LJIIJ();
        return this.LJI;
    }

    public final void LJIIJ() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.LJII;
        if (jElapsedRealtime - j < 1000 || j == -1) {
            return;
        }
        long jLJIIIIZZ = LJIIIIZZ(1);
        long jLJIIIIZZ2 = LJIIIIZZ(0);
        long j2 = jLJIIIIZZ2 - this.LIZJ;
        this.LIZJ = jLJIIIIZZ2;
        long j3 = jLJIIIIZZ - this.LIZIZ;
        this.LIZIZ = jLJIIIIZZ;
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mTotalMobileBytes:");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append(" mTotalMobileBytes:");
            sbLIZ.append(this.LIZJ);
            C792910V8n.LIZ("NewTrafficStatisticsImp", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LJIIIIZZ) {
            this.LJI += j2;
            this.LJFF += j3;
        } else {
            this.LJ += j2;
            this.LIZLLL += j3;
        }
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("periodWifiBytes:");
            sbLIZ2.append(j3);
            sbLIZ2.append(" periodMobileBytes:");
            sbLIZ2.append(j2);
            sbLIZ2.append(" mMobileBackBytes:");
            sbLIZ2.append(this.LJ);
            sbLIZ2.append(" mWifiBackBytes:");
            sbLIZ2.append(this.LIZLLL);
            C792910V8n.LIZ("NewTrafficStatisticsImp", C2188811AlT.LIZIZ(sbLIZ2));
        }
        this.LJII = jElapsedRealtime;
    }

    @Override // X.C0V87
    public final void LIZ(boolean z) {
        C787900UvU.LIZ.LIZJ(new ARunnableS32S0110000_13(this, z, 4));
    }

    public final long LJIIIIZZ(int i) {
        NetworkStats networkStatsQuerySummary;
        if (!C792400V6o.LJIIL) {
            if (C792400V6o.LJIIIIZZ()) {
                C792910V8n.LIZLLL("APM-Traffic-Detail", "querySummary is disabled. returning -1");
            }
            return -1L;
        }
        Context context = C792400V6o.LIZ;
        if (this.LJIIIZ == null) {
            this.LJIIIZ = (NetworkStatsManager) C786410Ut5.H2(C786410Ut5.N3(context), "netstats");
        }
        if (this.LJIIIZ == null) {
            return -1L;
        }
        NetworkStats.Bucket bucket = new NetworkStats.Bucket();
        try {
            networkStatsQuerySummary = this.LJIIIZ.querySummary(i, null, 0L, 4611686018427387903L);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            networkStatsQuerySummary = null;
        }
        long rxBytes = 0;
        long txBytes = 0;
        if (networkStatsQuerySummary != null) {
            while (networkStatsQuerySummary.hasNextBucket()) {
                networkStatsQuerySummary.getNextBucket(bucket);
                int uid = bucket.getUid();
                if (this.LJIIJ == -1) {
                    try {
                        PackageInfo packageInfoY3 = C786410Ut5.Y3(C786410Ut5.N3(context).getPackageManager(), C786410Ut5.N3(context).getPackageName(), 128);
                        if (packageInfoY3 != null) {
                            this.LJIIJ = packageInfoY3.applicationInfo.uid;
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
                if (this.LJIIJ == uid) {
                    rxBytes += bucket.getRxBytes();
                    txBytes += bucket.getTxBytes();
                }
            }
            networkStatsQuerySummary.close();
        }
        return rxBytes + txBytes;
    }
}
