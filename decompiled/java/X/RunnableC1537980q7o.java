package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0q7o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class RunnableC1537980q7o implements Runnable {
    public static final RunnableC1537980q7o LL = new RunnableC1537980q7o();

    public static void LIZ() {
        C1529360ptu c1529360ptu = C1529360ptu.LIZ;
        if (C1529360ptu.LIZIZ != null) {
            C1537820q7Y c1537820q7Y = C1538260q8G.LIZ;
            c1537820q7Y.LJI();
            c1537820q7Y.LJ(null);
        }
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        c1537900q7g.getClass();
        if (!Intrinsics.LJFF(C1535630q41.LIZIZ("enable_delegate_spark_prepare_block"), Boolean.TRUE) ? C1541950qED.LJII != null : C1529360ptu.LJII != null) {
            c1537900q7g.LJIIL();
        }
        if (C1529360ptu.LJ != null) {
            c1529360ptu.LIZLLL(null);
        }
        C1537900q7g.LJII();
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        if (C1161970gLL.LIZ()) {
            C1537900q7g.LJIIZILJ();
        } else {
            synchronized (c1537900q7g) {
                C1537900q7g.LJIILLIIL();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("Spark$Companion@60a9.warmupInner$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Spark$Companion@60a9.warmupInner$1");
    }
}
