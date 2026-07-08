package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0WUt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C824170WUt {
    public static final Map<String, Executor> LIZ = new ConcurrentHashMap(4);
    public static final Map<String, ExecutorService> LIZIZ = new ConcurrentHashMap(4);
    public static final Map<String, Looper> LIZJ = new ConcurrentHashMap(4);
    public static final Map<String, Handler> LIZLLL = new ConcurrentHashMap(4);
    public static final C824150WUr LJ = new AbstractC824140WUq<Executor>() { // from class: X.0WUr
        @Override // X.AbstractC824140WUq
        public final Executor LIZ(Object[] objArr) {
            return new C822650WOx(0, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue());
        }
    };
    public static final C824160WUs LJFF = new AbstractC824140WUq<ExecutorService>() { // from class: X.0WUs
        @Override // X.AbstractC824140WUq
        public final ExecutorService LIZ(Object[] objArr) {
            return new C822650WOx(0, Integer.MAX_VALUE, 5L, TimeUnit.SECONDS, new SynchronousQueue());
        }
    };
    public static final C824180WUu LJI = new AbstractC824140WUq<Looper>() { // from class: X.0WUu
        @Override // X.AbstractC824140WUq
        public final Looper LIZ(Object[] objArr) {
            try {
                HandlerThread handlerThread = new HandlerThread("bd_install");
                handlerThread.start();
                return C786410Ut5.W2(handlerThread);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return Looper.getMainLooper();
            }
        }
    };
    public static final C824190WUv LJII = new AbstractC824140WUq<Handler>() { // from class: X.0WUv
        @Override // X.AbstractC824140WUq
        public final Handler LIZ(Object[] objArr) {
            return new BPEAHandler(C824170WUt.LJI.LIZIZ(new Object[0]));
        }
    };

    public static String LIZ(Map map) {
        Set setKeySet;
        if (map == null || map.size() == 0 || (setKeySet = map.keySet()) == null || setKeySet.size() <= 0) {
            return null;
        }
        return (String) setKeySet.iterator().next();
    }

    public static Handler LIZIZ(String str) {
        if (str == null) {
            return LJII.LIZIZ(new Object[0]);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZLLL;
        Handler handler = (Handler) concurrentHashMap.get(str);
        if (handler == null) {
            Looper looperLIZLLL = LIZLLL(str);
            if (looperLIZLLL != null) {
                BPEAHandler bPEAHandler = new BPEAHandler(looperLIZLLL);
                concurrentHashMap.put(str, bPEAHandler);
                return bPEAHandler;
            }
            C844830XCf.LIZIZ("getLooper return null");
            return handler;
        }
        return handler;
    }

    public static ExecutorService LIZJ(String str) {
        if (str == null) {
            return LJFF.LIZIZ(new Object[0]);
        }
        ExecutorService executorService = (ExecutorService) ((ConcurrentHashMap) LIZIZ).get(str);
        if (executorService != null) {
            return executorService;
        }
        return LJFF.LIZIZ(new Object[0]);
    }

    public static Looper LIZLLL(String str) {
        if (str == null) {
            return LJI.LIZIZ(new Object[0]);
        }
        Looper looper = (Looper) ((ConcurrentHashMap) LIZJ).get(str);
        if (looper != null) {
            return looper;
        }
        return LJI.LIZIZ(new Object[0]);
    }

    public static Future LJI(CallableC820740WHo callableC820740WHo) {
        return LIZJ(LIZ(LIZIZ)).submit(callableC820740WHo);
    }

    public static void LJ(Runnable runnable, String str) {
        if (Looper.myLooper() == LIZLLL(str)) {
            runnable.run();
            return;
        }
        Handler handlerLIZIZ = LIZIZ(str);
        if (handlerLIZIZ == null) {
            handlerLIZIZ = LJII.LIZIZ(new Object[0]);
        }
        C786410Ut5.LJJZZIII(handlerLIZIZ, runnable);
    }

    public static void LJFF(Runnable runnable, String str) {
        Executor executorLIZIZ;
        boolean zLJI = MethodIDManager.LJI(137925);
        if (str == null) {
            executorLIZIZ = LJ.LIZIZ(new Object[0]);
        } else {
            executorLIZIZ = (Executor) ((ConcurrentHashMap) LIZ).get(str);
            if (executorLIZIZ == null) {
                executorLIZIZ = LJ.LIZIZ(new Object[0]);
            }
        }
        executorLIZIZ.execute(runnable);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
