package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0CFK, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CFK {
    public static boolean LIZ;
    public static CountDownLatch LIZIZ;
    public static C0CFJ LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static int LJIIIZ;
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C309800CCk());
    public static final List<Function1<String, Unit>> LJI = new ArrayList();
    public static final List<Function1<String, Unit>> LJII = new ArrayList();
    public static final List<Function1<String, Unit>> LJIIIIZZ = new ArrayList();

    public static final void LIZ(long j) {
        CountDownLatch countDownLatch;
        if (LIZ && (countDownLatch = LIZIZ) != null) {
            try {
                boolean zAwait = countDownLatch.await(j, TimeUnit.MILLISECONDS);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Wait result: ");
                sbLIZ.append(zAwait);
                sbLIZ.append(", isScroll: ");
                sbLIZ.append(LIZ);
                C2188811AlT.LIZIZ(sbLIZ);
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
