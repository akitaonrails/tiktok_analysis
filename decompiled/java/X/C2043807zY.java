package X;

import Y.ARunnableS72S0200000_3;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.07zY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2043807zY {
    public static final Object LIZ = new Object();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public static final Map<Class<?>, Object> LIZJ = new ConcurrentHashMap();
    public static final Map<Class<?>, Set<InterfaceC2043907zZ<?>>> LIZLLL = new HashMap();

    public static <T> T LIZ(Class<T> cls) {
        return (T) ((ConcurrentHashMap) LIZJ).get(cls);
    }

    public static <T> void LIZIZ(Class<T> cls, T t) {
        Map<Class<?>, Object> map = LIZJ;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
        Object obj = concurrentHashMap.get(cls);
        if (t == null) {
            concurrentHashMap.remove(cls);
        } else {
            concurrentHashMap.put(cls, t);
        }
        if (obj != t) {
            new HashMap(map);
            synchronized (LIZ) {
                try {
                    Set set = (Set) ((HashMap) LIZLLL).get(cls);
                    if (set != null && !set.isEmpty()) {
                        Iterator it2 = set.iterator();
                        while (it2.hasNext()) {
                            C786410Ut5.LJJZZIII(LIZIZ, new ARunnableS72S0200000_3(cls, t, (InterfaceC2043907zZ) it2.next(), 26));
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
