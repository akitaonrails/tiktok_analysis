package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttm.player.TraitObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0ja6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1286440ja6 {
    public final Map<Integer, TraitObject> LIZ = new HashMap();

    public final Map<Integer, TraitObject> LIZ() {
        return new HashMap(this.LIZ);
    }

    public final void LIZIZ() {
        if (((HashMap) this.LIZ).size() <= 0) {
            return;
        }
        HashMap map = new HashMap();
        synchronized (this) {
            try {
                map.putAll(this.LIZ);
                ((HashMap) this.LIZ).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            ((TraitObject) ((Map.Entry) it2.next()).getValue()).LIZ();
        }
    }
}
