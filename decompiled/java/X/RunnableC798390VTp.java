package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0VTp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class RunnableC798390VTp implements Runnable {
    public static final RunnableC798390VTp LL = new RunnableC798390VTp();

    public static void LIZ() {
        Long l;
        C798360VTm c798360VTm = C798400VTq.LIZJ;
        c798360VTm.LIZ();
        Map<Integer, Long> map = c798360VTm.LJI.LJIIIIZZ;
        if (map != null && (l = map.get(Integer.valueOf(C798400VTq.LIZIZ))) != null) {
            long jLongValue = l.longValue();
            long j = c798360VTm.LJI.LJI;
            if (j > 0) {
                C798400VTq.LIZLLL = jLongValue / j;
            }
        }
        if (C798400VTq.LJ.get()) {
            C786410Ut5.LJLIIL(C798400VTq.LIZ, C799570VYd.LIZIZ(), LL);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("MainThreadCpuMonitor@d0cb.updateMainCpuRate$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MainThreadCpuMonitor@d0cb.updateMainCpuRate$1");
    }
}
