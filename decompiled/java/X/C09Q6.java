package X;

import Y.ARunnableS103S0100000_3;
import com.ss.android.ugc.aweme.memory.MemoryWatcherAB;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* JADX INFO: renamed from: X.09Q6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09Q6 {
    public static final LinkedList<Double> LIZ;
    public static C09Q5 LIZIZ;
    public static long LIZJ;
    public static C09QC LIZLLL;

    static {
        new LinkedList();
        LIZ = new LinkedList<>();
        LIZIZ = C09Q5.UNKNOWN;
        C01GW c01gw = C2366509Pb.LIZ;
        if (((Number) c01gw.getValue()).longValue() > 0) {
            C09Q8 c09q8LIZ = C09Q8.LIZ();
            c09q8LIZ.LIZJ.add(new C09QB() { // from class: X.09Q7
                @Override // X.C09QB
                public final void LIZ(C09Q9 c09q9) {
                    C09Q5 c09q5;
                    LinkedList<Double> linkedList = C09Q6.LIZ;
                    double d = c09q9.LIZIZ - c09q9.LIZJ;
                    MemoryWatcherAB.Config config = ((MemoryWatcherAB.WatcherConfig) MemoryWatcherAB.LIZIZ.getValue()).nativeConfig;
                    if (config != null && config.isOpen) {
                        LinkedList<Double> linkedList2 = C09Q6.LIZ;
                        double d2 = 1024;
                        double d3 = (d / d2) / d2;
                        if (linkedList2.size() >= config.windowSize) {
                            linkedList2.pollFirst();
                        }
                        linkedList2.offerLast(Double.valueOf(d3));
                        double dDoubleValue = ((Number) C13LP.LJJJJZI(linkedList2)).doubleValue();
                        Iterator<Double> it2 = linkedList2.iterator();
                        while (it2.hasNext()) {
                            double dDoubleValue2 = it2.next().doubleValue();
                            float f = config.alpha;
                            dDoubleValue = (((double) f) * dDoubleValue2) + (((double) (1 - f)) * dDoubleValue);
                        }
                        float f2 = config.ewmaRate;
                        double d4 = (dDoubleValue * ((double) f2)) + (((double) (1 - f2)) * d3);
                        if (d4 < config.levelLow) {
                            c09q5 = C09Q5.LOW;
                        } else if (d4 < config.levelMedium) {
                            c09q5 = C09Q5.MEDIUM;
                        } else if (d4 < config.levelHigh) {
                            c09q5 = C09Q5.HIGH;
                        } else {
                            c09q5 = C09Q5.EXTREME;
                        }
                        Pair pair = new Pair(c09q5, Double.valueOf(d4));
                        C09Q5 c09q52 = (C09Q5) pair.getFirst();
                        double dDoubleValue3 = ((Number) pair.getSecond()).doubleValue();
                        long j = C09Q6.LIZJ + 1;
                        C09Q6.LIZJ = j;
                        if (c09q52 == C09Q6.LIZIZ) {
                            int i = config.levelEscapeCount;
                            if (j < i || i <= 0) {
                                return;
                            }
                        }
                        C09Q6.LIZIZ = c09q52;
                        C09QC c09qc = C09Q6.LIZLLL;
                        if (c09qc != null) {
                            c09qc.LIZ(dDoubleValue3);
                        }
                        C09Q6.LIZJ = 0L;
                    }
                }
            });
            C09Q8 c09q8LIZ2 = C09Q8.LIZ();
            long jLongValue = ((Number) c01gw.getValue()).longValue();
            ScheduledFuture<?> scheduledFuture = c09q8LIZ2.LIZIZ;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                if (c09q8LIZ2.LIZLLL == jLongValue) {
                    return;
                }
                ScheduledFuture<?> scheduledFuture2 = c09q8LIZ2.LIZIZ;
                if (scheduledFuture2 != null && !scheduledFuture2.isCancelled()) {
                    c09q8LIZ2.LIZIZ.cancel(true);
                    c09q8LIZ2.LIZIZ = null;
                }
            }
            c09q8LIZ2.LIZLLL = jLongValue;
            ScheduledFuture<?> scheduledFuture3 = c09q8LIZ2.LIZIZ;
            if (scheduledFuture3 == null || scheduledFuture3.isCancelled()) {
                c09q8LIZ2.LIZIZ = c09q8LIZ2.LIZ.scheduleWithFixedDelay(new ARunnableS103S0100000_3(c09q8LIZ2, 77), 0L, c09q8LIZ2.LIZLLL, TimeUnit.MILLISECONDS);
            }
        }
    }
}
