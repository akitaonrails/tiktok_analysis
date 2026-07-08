package X;

import com.bytedance.geckox.policy.loop.LoopPolicy;
import com.bytedance.geckox.policy.loop.model.LoopInterval;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0qUX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552070qUX implements InterfaceC1553600qX0 {
    @Override // X.InterfaceC1553600qX0
    public final void LIZ(Object obj) {
        if (obj != null && C797990VSb.LIZ.LJI() == null) {
            Map map = (Map) obj;
            C1552030qUT c1552030qUT = C1553380qWe.LIZ;
            synchronized (c1552030qUT) {
                C1553130qWF.LIZ("gecko-debug-tag", "loop interval update", map);
                for (String str : map.keySet()) {
                    LoopPolicy loopPolicy = (LoopPolicy) ((ConcurrentHashMap) c1552030qUT.LIZIZ).get(str);
                    LoopInterval loopInterval = (LoopInterval) map.get(str);
                    if (loopPolicy != null && loopInterval != null) {
                        loopPolicy.LIZIZ(loopInterval.getInterval());
                        ((ConcurrentHashMap) c1552030qUT.LIZJ).put(str, Integer.valueOf(loopInterval.getInterval()));
                    }
                }
            }
        }
    }
}
