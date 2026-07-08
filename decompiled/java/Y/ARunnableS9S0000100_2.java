package Y;

import X.C0LAB;
import X.C13000056w;
import X.C13BV;
import X.C13LP;
import X.C1C7U;
import X.C20684815ws;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class ARunnableS9S0000100_2 implements Runnable {
    public final int $t;
    public long j0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        List listLLIIII;
        long j = this.j0;
        synchronized (C13000056w.LIZIZ) {
            try {
                Set set = (Set) ((LinkedHashMap) C13000056w.LIZLLL).get(Long.valueOf(j));
                if (set == null || (listLLIIII = C13LP.LLIIII(set)) == null) {
                    listLLIIII = C13BV.INSTANCE;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (listLLIIII.isEmpty()) {
            return;
        }
        try {
            C13000056w.LJII(j, listLLIIII);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tick period=");
            sbLIZ.append(j);
            sbLIZ.append("ms: ");
            sbLIZ.append(th2.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final void run$0(ARunnableS9S0000100_2 aRunnableS9S0000100_2) {
        boolean zLIZ;
        C1C7U.LIZ("PeriodicSyncScheduler@38b.schedulePeriodLocked$task$1");
        try {
            aRunnableS9S0000100_2.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PeriodicSyncScheduler@38b.schedulePeriodLocked$task$1");
    }

    public static final void run$1(ARunnableS9S0000100_2 aRunnableS9S0000100_2) {
        boolean zLIZ;
        C1C7U.LIZ("PhotoModePreloadManager@836c.mobInflateTime$1");
        try {
            C0LAB c0lab = new C0LAB();
            c0lab.LIZIZ(aRunnableS9S0000100_2.j0, "duration");
            C20684815ws.LJIILLIIL("fyp_photo_view_inflate_duration", c0lab.LIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotoModePreloadManager@836c.mobInflateTime$1");
    }

    public ARunnableS9S0000100_2(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }
}
