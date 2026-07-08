package X;

import android.os.Debug;
import android.os.SystemClock;
import com.bytedance.pumbaa.base2.performance.PumbaaPerformanceTrackManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS51S0000100_13;

/* JADX INFO: renamed from: X.0WS0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WS0 {
    public static C823300WRk LIZJ;
    public static C0WSB LIZLLL;
    public static boolean LJI;
    public static final C0WS0 LIZ = new C0WS0();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final List<C0WS2> LJ = Collections.synchronizedList(new ArrayList());
    public static final List<C0WS2> LJFF = Collections.synchronizedList(new ArrayList());

    public static void LIZ(boolean z) {
        boolean z2;
        C0WSB c0wsb;
        C0WSB c0wsb2;
        try {
            C0WS6 c0ws6 = new C0WS6();
            c0ws6.LIZ = SystemClock.elapsedRealtimeNanos();
            c0ws6.LIZJ = Debug.threadCpuTimeNanos();
            long j = c0ws6.LIZ;
            C0WS7 c0ws7LJIIIIZZ = null;
            boolean zBooleanValue = false;
            if (!PumbaaPerformanceTrackManager.LJIIIZ.get()) {
                PumbaaPerformanceTrackManager.LJFF(C0WSL.LIZ(), (String) C308480C7i.LIZLLL(String.class, "pns_pumbaa_perf_expr_tag", null), Boolean.valueOf(z), AFwS200S0000000_13.get$arr$(283), new AwS51S0000100_13(j, 2));
                z2 = true;
            } else {
                z2 = false;
            }
            Pair pairLJ = PumbaaPerformanceTrackManager.LJ(true);
            if (pairLJ != null) {
                c0wsb = (C0WSB) pairLJ.getFirst();
            } else {
                c0wsb = null;
            }
            LIZLLL = c0wsb;
            if (pairLJ != null) {
                zBooleanValue = ((Boolean) pairLJ.getSecond()).booleanValue();
            }
            LJI = zBooleanValue;
            if (!zBooleanValue && (c0wsb2 = LIZLLL) != null) {
                c0wsb2.LJIIJ(c0ws6);
            }
            c0ws6.LIZ();
            C0WSB c0wsb3 = LIZLLL;
            if (c0wsb3 != null) {
                c0ws7LJIIIIZZ = c0wsb3.LJIIIIZZ("init_perf_inside", c0ws6);
            }
            if (!z2 && c0ws7LJIIIIZZ != null) {
                c0ws7LJIIIIZZ.LJ = "not_do_init";
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0WS5.LIZIZ("initAndStartPerformanceTracker_error", th);
        }
    }
}
