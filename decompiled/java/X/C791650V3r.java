package X;

import Y.ARunnableS32S0110000_13;
import com.bytedance.monitor.collector.MonitorJni;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0V3r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791650V3r implements C0V87 {
    public long LIZ;
    public long LIZIZ;
    public volatile boolean LIZJ;

    @Override // X.C0V87
    public final long LIZIZ() {
        return 0L;
    }

    @Override // X.C0V87
    public final long LIZJ() {
        return 0L;
    }

    @Override // X.C0V87
    public final long LJ() {
        return 0L;
    }

    @Override // X.C0V87
    public final long LJI() {
        return 0L;
    }

    @Override // X.C0V87
    public final long LJII() {
        return 0L;
    }

    @Override // X.C0V87
    public final long LIZLLL() throws Exception {
        LJIIIIZZ(this.LIZJ);
        return this.LIZIZ + this.LIZ;
    }

    @Override // X.C0V87
    public final long LJFF() {
        return LIZLLL() + 0;
    }

    @Override // X.C0V87
    public final void init() throws Exception {
        LJIIIIZZ(this.LIZJ);
    }

    @Override // X.C0V87
    public final void LIZ(boolean z) {
        C787900UvU.LIZ.LIZJ(new ARunnableS32S0110000_13(this, z, 5));
    }

    public final void LJIIIIZZ(boolean z) throws Exception {
        long jFetchTrafficStats;
        if (C791560V3i.LJIIJJI) {
            try {
                boolean zLIZ = C791580V3k.LIZ(512);
                if (C791580V3k.LIZ(256) || zLIZ) {
                    jFetchTrafficStats = MonitorJni.fetchTrafficStats(true);
                } else {
                    jFetchTrafficStats = 0;
                }
                if (!z) {
                    this.LIZ += jFetchTrafficStats;
                } else {
                    this.LIZIZ += jFetchTrafficStats;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (!C792400V6o.LJIIIIZZ()) {
                    C1AF0.LJFF(e, "apm_traffic");
                    return;
                }
                throw e;
            }
        }
    }
}
