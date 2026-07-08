package X;

import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cKs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class RunnableC1007920cKs implements Runnable {
    public static final RunnableC1007920cKs LL = new RunnableC1007920cKs();

    public static void LIZ() {
        while (true) {
            Reference<? extends C1007900cKq> referencePoll = C1008010cL1.LIZJ.poll();
            if (referencePoll == null) {
                return;
            }
            if (referencePoll instanceof C1008140cLE) {
                C1008140cLE c1008140cLE = (C1008140cLE) referencePoll;
                Set<C1008140cLE> set = C1008010cL1.LIZIZ;
                set.remove(c1008140cLE);
                if (!set.isEmpty()) {
                    Iterator<C1008140cLE> it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next().LIZ, c1008140cLE.LIZ)) {
                            break;
                        }
                    }
                }
                C1023060cjI.LIZJ.LIZ.remove(c1008140cLE.LIZ);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AnoleEventDynamicParamRuleManager@2580.clearRunnable$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnoleEventDynamicParamRuleManager@2580.clearRunnable$1");
    }
}
