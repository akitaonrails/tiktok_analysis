package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0UsD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C785870UsD extends C0W9W {
    public final int $t;

    public static final void run$1(C785870UsD c785870UsD) {
        C1C7U.LIZ("GrowthTaskDataUtil@9433.startTimer$2$1");
        boolean zLJ = C0W9U.LJ(c785870UsD.bpeaTraceContext);
        try {
            c785870UsD.bpea_origin_timer_run$0();
            if (zLJ) {
                C0W9U.LJFF();
            }
            C1C7U.LIZIZ("GrowthTaskDataUtil@9433.startTimer$2$1");
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
                ArrayList<Function0> arrayList = new ArrayList(C2176561AGg.LIZIZ);
                for (Function0 function0 : arrayList) {
                    if (((ArrayList) C2176561AGg.LIZIZ).isEmpty()) {
                        return;
                    }
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
                arrayList.clear();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } finally {
            if (!zLIZ) {
            }
        }
    }

    public C785870UsD(int i) {
        this.$t = i;
    }

    public static final void run$0(C785870UsD c785870UsD) {
        C1C7U.LIZ("CommentPreloadCacheTimer@112e.restartTimer$1");
        boolean zLJ = C0W9U.LJ(c785870UsD.bpeaTraceContext);
        try {
            C1344320l5S.LIZ.getClass();
            C20684815ws.onEventV3("comment_preload_waste");
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("CommentPreloadCacheTimer@112e.restartTimer$1");
    }

    public static final void run$2(C785870UsD c785870UsD) {
        C1C7U.LIZ("PlayTimeTriggerHelper@bde6.checkToStartNewTimerTask$1");
        boolean zLJ = C0W9U.LJ(c785870UsD.bpeaTraceContext);
        try {
            C1909320zmk.LIZ.getClass();
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("PlayTimeTriggerHelper@bde6.checkToStartNewTimerTask$1");
    }
}
