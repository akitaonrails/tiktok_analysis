package Y;

import X.C0NBW;
import X.C0POE;
import X.C1468940oKS;
import X.C1475120oUQ;
import X.C1475430oUv;
import X.C1482830ogr;
import X.C1516150pYb;
import X.C1516160pYc;
import X.C1C7U;
import X.InterfaceC1475300oUi;
import java.io.FileDescriptor;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS1S0200200_23 implements Runnable {
    public final int $t;
    public long j2;
    public long j3;
    public Object l0;
    public Object l1;

    public static final void run$1(ARunnableS1S0200200_23 aRunnableS1S0200200_23) {
        C1468940oKS.d((C1468940oKS) aRunnableS1S0200200_23.l0, (FileDescriptor) aRunnableS1S0200200_23.l1, aRunnableS1S0200200_23.j2, aRunnableS1S0200200_23.j3);
        throw null;
    }

    @Override // java.lang.Runnable
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS1S0200200_23 aRunnableS1S0200200_23) {
        C1475120oUQ c1475120oUQ = (C1475120oUQ) aRunnableS1S0200200_23.l0;
        C1475430oUv c1475430oUv = (C1475430oUv) aRunnableS1S0200200_23.l1;
        long j = aRunnableS1S0200200_23.j2;
        long j2 = aRunnableS1S0200200_23.j3;
        c1475120oUQ.getClass();
        C1C7U.LIZ("EnginePreloaderDataLoaderListener@e47e.onTaskProgress$1L");
        Iterator it2 = ((CopyOnWriteArrayList) c1475120oUQ.LIZ.LJI).iterator();
        while (it2.hasNext()) {
            InterfaceC1475300oUi interfaceC1475300oUi = (InterfaceC1475300oUi) ((Reference) it2.next()).get();
            if (interfaceC1475300oUi != null) {
                interfaceC1475300oUi.qc(j, j2, c1475430oUv.LIZ);
                interfaceC1475300oUi.tf(j, j2, c1475430oUv.LIZ, c1475430oUv.LIZJ);
                C0NBW.LIZIZ().LIZ(new C1482830ogr(c1475430oUv.LIZ, j, j2), "PreloaderCallback_PROGRESS");
            }
        }
        C1C7U.LIZIZ("EnginePreloaderDataLoaderListener@e47e.onTaskProgress$1L");
    }

    public static final void run$2(ARunnableS1S0200200_23 aRunnableS1S0200200_23) {
        boolean zLIZ;
        C1C7U.LIZ("ParallelChunkGsonResponseBodyConverter@3768.mapParallelWithPrefer$1$scheduleTimeoutCheck$1");
        try {
            C1516150pYb c1516150pYb = (C1516150pYb) aRunnableS1S0200200_23.l0;
            c1516150pYb.LIZJ(new C1516160pYc(c1516150pYb, aRunnableS1S0200200_23.j2, aRunnableS1S0200200_23.j3, (C0POE) aRunnableS1S0200200_23.l1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ParallelChunkGsonResponseBodyConverter@3768.mapParallelWithPrefer$1$scheduleTimeoutCheck$1");
    }

    public ARunnableS1S0200200_23(Object obj, Object obj2, long j, long j2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.j2 = j;
        this.j3 = j2;
    }
}
