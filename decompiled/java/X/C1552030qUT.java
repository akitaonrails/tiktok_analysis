package X;

import com.bytedance.geckox.policy.loop.LoopPolicy;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0qUT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552030qUT {
    public C1551530qTf LIZ;
    public final Map<String, LoopPolicy> LIZIZ = new ConcurrentHashMap();
    public final Map<String, Integer> LIZJ;
    public final AtomicBoolean LIZLLL;

    public final void LIZ() {
        C1553130qWF.LIZ("gecko-debug-tag", "loop stop");
        Iterator it2 = ((ConcurrentHashMap) this.LIZIZ).keySet().iterator();
        while (it2.hasNext()) {
            LoopPolicy loopPolicy = (LoopPolicy) ((ConcurrentHashMap) this.LIZIZ).get(it2.next());
            if (loopPolicy != null) {
                loopPolicy.LIZJ.set(false);
                loopPolicy.LIZ.removeMessages(loopPolicy.LIZLLL);
                ((ConcurrentHashMap) loopPolicy.LJ).clear();
            }
        }
    }

    public C1552030qUT() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.LIZJ = concurrentHashMap;
        this.LIZLLL = new AtomicBoolean(true);
        concurrentHashMap.put(EnumC1552440qV8.lv_1.name(), 600);
        concurrentHashMap.put(EnumC1552440qV8.lv_2.name(), 1200);
        concurrentHashMap.put(EnumC1552440qV8.lv_3.name(), 1800);
    }
}
