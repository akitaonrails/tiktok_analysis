package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10ue, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19397010ue {
    public final Map<Integer, CopyOnWriteArraySet<InterfaceC19397110uf>> LIZ = new ConcurrentHashMap();

    public final boolean LIZIZ(int i) {
        return !((ConcurrentHashMap) this.LIZ).containsKey(Integer.valueOf(i));
    }

    public final void LIZ(int i, InterfaceC19397110uf interfaceC19397110uf) {
        if (LIZIZ(i)) {
            ((ConcurrentHashMap) this.LIZ).put(Integer.valueOf(i), new CopyOnWriteArraySet());
        }
        if (interfaceC19397110uf != null) {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) ((ConcurrentHashMap) this.LIZ).get(Integer.valueOf(i));
            if (copyOnWriteArraySet != null) {
                copyOnWriteArraySet.add(interfaceC19397110uf);
            }
        }
    }

    public final void LIZJ(String str, JSONObject jSONObject, String str2, int i) {
        if (LIZIZ(i)) {
            return;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) ((ConcurrentHashMap) this.LIZ).get(Integer.valueOf(i));
        if (copyOnWriteArraySet == null) {
            return;
        }
        Iterator it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            ((InterfaceC19397110uf) it2.next()).LIZ(str, str2, jSONObject);
        }
    }
}
