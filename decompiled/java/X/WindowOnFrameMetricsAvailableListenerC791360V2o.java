package X;

import android.os.Build;
import android.view.FrameMetrics;
import android.view.Window;
import com.bytedance.apm.thread.ThreadWithBlockingQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0V2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class WindowOnFrameMetricsAvailableListenerC791360V2o implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ C791390V2r LIZIZ;

    public WindowOnFrameMetricsAvailableListenerC791360V2o(C791390V2r c791390V2r, String str) {
        this.LIZIZ = c791390V2r;
        this.LIZ = str;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, final int i) {
        int i2;
        this.LIZIZ.getClass();
        final FrameMetrics frameMetrics2 = new FrameMetrics(frameMetrics);
        this.LIZIZ.LJIIIZ(frameMetrics2);
        if (frameMetrics2.getMetric(9) == 0 && this.LIZIZ.LJJI != null && Build.VERSION.SDK_INT >= 24) {
            boolean z = false;
            long metric = (((((frameMetrics2.getMetric(0) + frameMetrics2.getMetric(1)) + frameMetrics2.getMetric(2)) + frameMetrics2.getMetric(3)) + frameMetrics2.getMetric(4)) + frameMetrics2.getMetric(5)) / ((long) 1000000);
            Iterator<InterfaceC791370V2p> it2 = C791380V2q.LIZIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZLLL(metric);
            }
            if (metric >= 48) {
                Iterator<InterfaceC791370V2p> it3 = C791380V2q.LIZIZ.iterator();
                while (it3.hasNext()) {
                    it3.next().LIZIZ();
                }
                i2 = 1;
            } else {
                i2 = 0;
            }
            AtomicLong atomicLong = C791380V2q.LIZLLL;
            if (atomicLong.get() > 2147483647L) {
                atomicLong.set(0L);
            }
            Integer numValueOf = Integer.valueOf(i2);
            C08I1<Long, Integer> c08i1 = C791380V2q.LIZJ;
            c08i1.put(Long.valueOf(atomicLong.incrementAndGet()), numValueOf);
            Collection<Integer> collectionValues = c08i1.values();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                Integer num = (Integer) obj;
                if (num != null && num.intValue() == 1) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() >= 3) {
                z = true;
            }
            if (z != C791380V2q.LJ) {
                C791380V2q.LJ = z;
                if (z) {
                    Iterator<InterfaceC791370V2p> it4 = C791380V2q.LIZIZ.iterator();
                    while (it4.hasNext()) {
                        it4.next().LIZ();
                    }
                } else {
                    Iterator<InterfaceC791370V2p> it5 = C791380V2q.LIZIZ.iterator();
                    while (it5.hasNext()) {
                        it5.next().LIZJ();
                    }
                }
            }
        }
        Thread threadU3 = C786410Ut5.u3();
        ThreadWithBlockingQueue threadWithBlockingQueue = this.LIZIZ.LJIILIIL;
        if (threadU3 != threadWithBlockingQueue.LIZ) {
            threadWithBlockingQueue.LIZ(new Runnable() { // from class: X.0V2n
                public final void LIZ() {
                    if (frameMetrics2.getMetric(9) == 0) {
                        AbstractC791320V2k abstractC791320V2k = C791390V2r.LJJIIJZLJL;
                        if (abstractC791320V2k != null) {
                            WindowOnFrameMetricsAvailableListenerC791360V2o windowOnFrameMetricsAvailableListenerC791360V2o = this.LLILLL;
                            if (windowOnFrameMetricsAvailableListenerC791360V2o.LIZIZ.LJIJ) {
                                abstractC791320V2k.LJIIZILJ(windowOnFrameMetricsAvailableListenerC791360V2o.LIZ, frameMetrics2, i);
                                return;
                            }
                        }
                        Iterator it6 = ((CopyOnWriteArrayList) this.LLILLL.LIZIZ.LIZLLL).iterator();
                        while (it6.hasNext()) {
                            ((AbstractC791320V2k) it6.next()).LJIIZILJ(this.LLILLL.LIZ, frameMetrics2, i);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MainThreadMonitor@898e.addFrameMetricsListener$1$onFrameMetricsAvailable$2");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MainThreadMonitor@898e.addFrameMetricsListener$1$onFrameMetricsAvailable$2");
                }
            });
            return;
        }
        if (frameMetrics2.getMetric(9) != 0) {
            return;
        }
        AbstractC791320V2k abstractC791320V2k = C791390V2r.LJJIIJZLJL;
        if (abstractC791320V2k != null && this.LIZIZ.LJIJ) {
            abstractC791320V2k.LJIIZILJ(this.LIZ, frameMetrics2, i);
            return;
        }
        Iterator it6 = ((CopyOnWriteArrayList) this.LIZIZ.LIZLLL).iterator();
        while (it6.hasNext()) {
            ((AbstractC791320V2k) it6.next()).LJIIZILJ(this.LIZ, frameMetrics2, i);
        }
    }
}
