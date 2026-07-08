package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.log.VLog;

/* JADX INFO: renamed from: X.0kxA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1339180kxA extends C0W9W {
    public final int $t;

    public static final void run$1(C1339180kxA c1339180kxA) {
        C1C7U.LIZ("DecisionConfigExperiment@7ace.liveTask$1");
        boolean zLJ = C0W9U.LJ(c1339180kxA.bpeaTraceContext);
        try {
            c1339180kxA.bpea_origin_timer_run$0();
            if (zLJ) {
                C0W9U.LJFF();
            }
            C1C7U.LIZIZ("DecisionConfigExperiment@7ace.liveTask$1");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (zLJ) {
                C0W9U.LJFF();
            }
            throw th;
        }
    }

    public static final void run$2(C1339180kxA c1339180kxA) {
        C1C7U.LIZ("DecisionConfigExperiment@7ace.vodTask$1");
        boolean zLJ = C0W9U.LJ(c1339180kxA.bpeaTraceContext);
        try {
            c1339180kxA.bpea_origin_timer_run$1();
            if (zLJ) {
                C0W9U.LJFF();
            }
            C1C7U.LIZIZ("DecisionConfigExperiment@7ace.vodTask$1");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (zLJ) {
                C0W9U.LJFF();
            }
            throw th;
        }
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            default:
                super.run();
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void bpea_origin_timer_run$0() {
        boolean zLIZ;
        try {
            try {
                if (C1306880k74.LIZLLL != null) {
                    if (C1306880k74.LIZJ < C1306910k77.LIZ().liveUpdateMaxCount) {
                        C1306880k74.LIZ.getClass();
                        C1306880k74.LIZLLL();
                        C1306880k74.LIZJ++;
                    }
                    C1306880k74.LIZ.getClass();
                    C1306880k74.LIZ();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } finally {
            if (!zLIZ) {
            }
        }
    }

    public final void bpea_origin_timer_run$1() {
        boolean zLIZ;
        try {
            try {
                if (C1306880k74.LIZLLL != null) {
                    if (C1306880k74.LIZIZ < C1306910k77.LIZ().vodUpdateMaxCount) {
                        C1306880k74.LIZ.getClass();
                        C1306880k74.LJ();
                        C1306880k74.LIZIZ++;
                    }
                    C1306880k74.LIZ.getClass();
                    C1306880k74.LIZ();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } finally {
            if (!zLIZ) {
            }
        }
    }

    public C1339180kxA(int i) {
        this.$t = i;
    }

    public static final void run$0(C1339180kxA c1339180kxA) {
        C1C7U.LIZ("VLog@fd2f.loadALogDependency$1");
        boolean zLJ = C0W9U.LJ(c1339180kxA.bpeaTraceContext);
        try {
            if (VLog.detectALogDependence()) {
                c1339180kxA.cancel();
            }
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("VLog@fd2f.loadALogDependency$1");
    }
}
