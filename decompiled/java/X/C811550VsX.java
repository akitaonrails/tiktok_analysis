package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0VsX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C811550VsX implements InterfaceC811540VsW, InterfaceC795440VIg {
    public final Map<Class<?>, ConcurrentHashMap<InterfaceC811570VsZ<Object>, Executor>> LIZ = new HashMap();
    public Queue<C1267204xa<?>> LIZIZ = new ArrayDeque();
    public final Executor LIZJ;

    public C811550VsX(Executor executor) {
        this.LIZJ = executor;
    }

    public final synchronized Set<Map.Entry<InterfaceC811570VsZ<Object>, Executor>> LIZJ(C1267204xa<?> c1267204xa) {
        Set<Map.Entry<InterfaceC811570VsZ<Object>, Executor>> setEntrySet;
        Map<Class<?>, ConcurrentHashMap<InterfaceC811570VsZ<Object>, Executor>> map = this.LIZ;
        c1267204xa.getClass();
        Map map2 = (Map) ((HashMap) map).get(null);
        if (map2 == null) {
            setEntrySet = Collections.emptySet();
        } else {
            setEntrySet = map2.entrySet();
        }
        return setEntrySet;
    }

    public final void LIZLLL(final C1267204xa<?> c1267204xa) {
        c1267204xa.getClass();
        synchronized (this) {
            try {
                Queue<C1267204xa<?>> queue = this.LIZIZ;
                if (queue != null) {
                    queue.add(c1267204xa);
                    return;
                }
                for (final Map.Entry<InterfaceC811570VsZ<Object>, Executor> entry : LIZJ(c1267204xa)) {
                    entry.getValue().execute(new Runnable() { // from class: X.0VsY
                        @Override // java.lang.Runnable
                        public final void run() {
                            Map.Entry entry2 = entry;
                            C1267204xa c1267204xa2 = c1267204xa;
                            C1C7U.LIZ("EventBus@6870.publish$1L");
                            ((InterfaceC811570VsZ) entry2.getKey()).LIZ(c1267204xa2);
                            C1C7U.LIZIZ("EventBus@6870.publish$1L");
                        }
                    });
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC811540VsW
    public final void LIZIZ(Class cls, C811060Vrk c811060Vrk) {
        LIZ(cls, this.LIZJ, c811060Vrk);
    }

    @Override // X.InterfaceC811540VsW
    public final synchronized <T> void LIZ(Class<T> cls, Executor executor, InterfaceC811570VsZ<? super T> interfaceC811570VsZ) {
        executor.getClass();
        if (!((HashMap) this.LIZ).containsKey(cls)) {
            ((HashMap) this.LIZ).put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) ((HashMap) this.LIZ).get(cls)).put(interfaceC811570VsZ, executor);
    }
}
