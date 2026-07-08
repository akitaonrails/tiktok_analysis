package X;

import android.os.Build;
import android.view.FrameMetrics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0VVa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798760VVa extends C0VVV implements C0VV1 {
    @Override // X.C0VV1
    public final void LIZJ() {
    }

    @Override // X.C0VV1
    public final void LIZ(final FrameMetrics frameMetrics) {
        int i;
        final long jCurrentTimeMillis;
        final C798790VVd c798790VVdPeekFirst;
        if (!this.LIZ || frameMetrics == null || (i = Build.VERSION.SDK_INT) < 24) {
            return;
        }
        long j = 1000000;
        final long metric = (((((frameMetrics.getMetric(0) + frameMetrics.getMetric(1)) + frameMetrics.getMetric(2)) + frameMetrics.getMetric(3)) + frameMetrics.getMetric(4)) + frameMetrics.getMetric(5)) / j;
        if (i >= 26) {
            jCurrentTimeMillis = frameMetrics.getMetric(10);
        } else {
            jCurrentTimeMillis = ((System.currentTimeMillis() * j) - frameMetrics.getMetric(8)) - ((long) 10000);
        }
        float f = metric / C0VXC.LIZ;
        Runnable runnable = new Runnable() { // from class: X.0VVb
            public final void LIZ() {
                long metric2;
                long metric3;
                C798760VVa c798760VVa = this.LL;
                FrameMetrics frameMetrics2 = frameMetrics;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 24) {
                    c798760VVa.getClass();
                    return;
                }
                C798790VVd c798790VVdPeekFirst2 = c798760VVa.LIZIZ.peekFirst();
                if (c798790VVdPeekFirst2 != null) {
                    if (i2 >= 26) {
                        metric2 = frameMetrics2.getMetric(11);
                        metric3 = frameMetrics2.getMetric(1);
                    } else {
                        System.currentTimeMillis();
                        frameMetrics2.getMetric(8);
                        metric2 = frameMetrics2.getMetric(0);
                        metric3 = frameMetrics2.getMetric(1);
                    }
                    long j2 = (metric2 + metric3) / ((long) 1000000);
                    for (C798800VVe c798800VVe : c798790VVdPeekFirst2.LIZIZ) {
                        if (c798800VVe.LIZ <= j2 && c798800VVe.LIZIZ >= j2) {
                            c798800VVe.LIZJ = true;
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DropFrsHigher7ProbeMonitor@4cdd.onFrameMetricsAvailable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DropFrsHigher7ProbeMonitor@4cdd.onFrameMetricsAvailable$1");
            }
        };
        ExecutorService executorService = C741050T5b.LIZ;
        executorService.execute(runnable);
        if (f < 3.0f || (c798790VVdPeekFirst = this.LIZIZ.peekFirst()) == null) {
            return;
        }
        executorService.execute(new Runnable() { // from class: X.0VVc
            public final void LIZ() {
                C798760VVa c798760VVa = this.LL;
                long j2 = metric;
                long j3 = jCurrentTimeMillis / ((long) 1000000);
                C798790VVd c798790VVd = c798790VVdPeekFirst;
                c798760VVa.getClass();
                long j4 = j3 + j2;
                CopyOnWriteArrayList<C798800VVe> copyOnWriteArrayList = c798790VVd.LIZIZ;
                ArrayList arrayList = new ArrayList();
                for (C798800VVe c798800VVe : copyOnWriteArrayList) {
                    C798800VVe c798800VVe2 = c798800VVe;
                    if (c798800VVe2.LIZIZ >= j3 && c798800VVe2.LIZ <= j4) {
                        arrayList.add(c798800VVe);
                    }
                }
                Iterator<InterfaceC798840VVi> it2 = c798760VVa.LIZJ.iterator();
                while (it2.hasNext() && !it2.next().LIZ(c798790VVd, arrayList, j2)) {
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DropFrsHigher7ProbeMonitor@4cdd.onFrameMetricsAvailable$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DropFrsHigher7ProbeMonitor@4cdd.onFrameMetricsAvailable$2");
            }
        });
    }

    @Override // X.C0VV1
    public final void LIZIZ(long j, long j2, boolean z) {
        C798790VVd c798790VVdPeekFirst;
        if (this.LIZ && (c798790VVdPeekFirst = this.LIZIZ.peekFirst()) != null && j2 - j > 5) {
            C798800VVe c798800VVe = new C798800VVe();
            c798800VVe.LIZ = j;
            c798800VVe.LIZIZ = j2;
            c798800VVe.LIZJ = false;
            c798790VVdPeekFirst.LIZIZ.add(c798800VVe);
        }
    }
}
