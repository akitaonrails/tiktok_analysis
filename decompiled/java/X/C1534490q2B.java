package X;

import com.bytedance.forest.model.RequestParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0q2B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534490q2B {
    public static final ConcurrentLinkedQueue<InterfaceC1534950q2v> LIZ = new ConcurrentLinkedQueue<>();
    public static final ConcurrentLinkedQueue<InterfaceC1535230q3N> LIZIZ = new ConcurrentLinkedQueue<>();

    public static void LIZ(C1533790q13 c1533790q13) {
        Iterator<InterfaceC1534950q2v> it2 = LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().LJFF(c1533790q13);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1534250q1n.LIZIZ("GlobalInterceptor", "monitor onLoadFinished error", th);
            }
        }
    }

    public static void LIZJ(C1533490q0Z c1533490q0Z) {
        Iterator<InterfaceC1535230q3N> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().LIZJ(c1533490q0Z);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1534250q1n.LIZIZ("GlobalInterceptor", "intercept onLoadStart error", th);
            }
        }
    }

    public static void LIZLLL(C1533790q13 c1533790q13) {
        Iterator<InterfaceC1535230q3N> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().LIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LIZIZ(String str, RequestParams requestParams) {
        Iterator<InterfaceC1534950q2v> it2 = LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().LJ(requestParams);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1534250q1n.LIZIZ("GlobalInterceptor", "monitor onLoadStart error", th);
            }
        }
    }
}
