package X;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.BiFunction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0qRy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550480qRy<P, R> {
    public final Function2<P, Function1<? super R, Unit>, Unit> LIZ;
    public final long LIZIZ;
    public final ScheduledExecutorService LIZJ;
    public final boolean LIZLLL;
    public final ConcurrentMap<P, C1550500qS0<R>> LJ;

    public final C1550500qS0<R> LIZ(P p, final Function2<? super P, ? super C1550500qS0<R>, C1550500qS0<R>> function2) {
        C1550500qS0<R> c1550500qS0Invoke;
        if (this.LIZLLL) {
            return (C1550500qS0) ((ConcurrentHashMap) this.LJ).compute(p, new BiFunction() { // from class: X.0qS2
                @Override // java.util.function.BiFunction
                public final /* synthetic */ Object apply(Object obj, Object obj2) {
                    return function2.invoke(obj, obj2);
                }
            });
        }
        synchronized (this.LJ) {
            try {
                c1550500qS0Invoke = function2.invoke(p, (C1550500qS0) ((ConcurrentHashMap) this.LJ).get(p));
                if (c1550500qS0Invoke != null) {
                    ((ConcurrentHashMap) this.LJ).put(p, c1550500qS0Invoke);
                } else {
                    ((ConcurrentHashMap) this.LJ).remove(p);
                    c1550500qS0Invoke = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1550500qS0Invoke;
    }

    public C1550480qRy(Function2 function2, long j, int i) {
        ScheduledExecutorService scheduledExecutorServiceLJ;
        boolean z;
        j = (i & 2) != 0 ? 10000L : j;
        if ((i & 4) != 0) {
            scheduledExecutorServiceLJ = C807400Vlq.LJ();
        } else {
            scheduledExecutorServiceLJ = null;
        }
        this.LIZ = function2;
        this.LIZIZ = j;
        this.LIZJ = scheduledExecutorServiceLJ;
        if (Build.VERSION.SDK_INT >= 24) {
            z = true;
        } else {
            z = false;
        }
        this.LIZLLL = z;
        this.LJ = new ConcurrentHashMap();
    }
}
