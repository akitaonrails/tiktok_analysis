package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.internal.AwS389S0200000_23;

/* JADX INFO: renamed from: X.0q3G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1535160q3G {
    public static HashSet LIZIZ() {
        return C1535040q34.LJIIZILJ;
    }

    public static void LIZ(Iterator it2, C1533790q13 c1533790q13) {
        if (it2.hasNext()) {
            ((AbstractC1535150q3F) it2.next()).LJFF(new C1534790q2f(Unit.class, Unit.LIZ, false), c1533790q13, C13BV.INSTANCE, new AwS389S0200000_23(it2, (Iterator<? extends AbstractC1535150q3F<Unit, Unit>>) c1533790q13, (C1533790q13) 0));
        }
    }

    public static void LIZJ(CountDownLatch countDownLatch, C1535040q34 c1535040q34) {
        while (true) {
            try {
                countDownLatch.await();
                return;
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                if (c1535040q34 != null && !c1535040q34.LJI()) {
                    return;
                }
            }
        }
    }
}
