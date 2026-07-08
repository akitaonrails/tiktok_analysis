package X;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0pPQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510460pPQ implements InterfaceC1510030pOj {
    public static final C1510460pPQ LIZIZ = new C1510460pPQ();
    public static final Set<String> LIZJ = C13LQ.LJLIIL(new String[]{"enter_homepage_familiar", "enter_homepage_hot", "enter_homepage_message", "enter_homepage_follow", "enter_homepage_fresh", "enter_personal_homepage", "shoot"});
    public static final ConcurrentHashMap<String, AtomicInteger> LIZLLL = new ConcurrentHashMap<>();

    @Override // X.InterfaceC1510030pOj
    public final Set<String> events() {
        return LIZJ;
    }

    @Override // X.InterfaceC1510030pOj
    public final void handleAppLogEvent(String str, C1510130pOt c1510130pOt) {
        if (LIZJ.contains(str)) {
            ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = LIZLLL;
            if (!concurrentHashMap.containsKey(str)) {
                concurrentHashMap.put(str, new AtomicInteger(1));
                return;
            }
            AtomicInteger atomicInteger = concurrentHashMap.get(str);
            if (atomicInteger == null) {
                return;
            }
            atomicInteger.incrementAndGet();
        }
    }
}
