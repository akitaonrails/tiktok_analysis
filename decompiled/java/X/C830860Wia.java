package X;

import Y.ARunnableS113S0100000_13;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wia, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C830860Wia {
    public static ExecutorService LIZ;
    public static final LinkedBlockingQueue<Runnable> LIZIZ = new LinkedBlockingQueue<>();
    public static final AtomicInteger LIZJ = new AtomicInteger(0);

    static {
        new HashMap();
    }

    public static void LIZ() {
        int iMax = Math.max(Runtime.getRuntime().availableProcessors() * 2, 6);
        C822650WOx c822650WOx = new C822650WOx(iMax, iMax, 30L, TimeUnit.SECONDS, LIZIZ);
        c822650WOx.allowCoreThreadTimeOut(true);
        LIZ = c822650WOx;
    }

    public static void LIZIZ(ExecutorService executorService, Function0 function0) {
        LIZJ.incrementAndGet();
        if (executorService != null || (executorService = LIZ) != null) {
            executorService.execute(new ARunnableS113S0100000_13(function0, (Function0<Unit>) 212));
        }
    }
}
