package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.168m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207262168m extends AbstractC207272168w {
    public final Map<String, Map<String, List<Map<String, Object>>>> LIZ = new HashMap();
    public final Map<String, List<Map<String, Object>>> LIZIZ = new HashMap();
    public final String LIZJ = "save_social_interaction_et";

    @Override // X.AbstractC207272168w
    public final void LIZ() {
        ((HashMap) this.LIZ).clear();
        ((HashMap) this.LIZIZ).clear();
    }

    @Override // X.AbstractC207272168w
    public final String LIZJ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC207272168w
    public final void LIZIZ(C207274168y c207274168y, InterfaceC805220ViK interfaceC805220ViK) {
        Map<?, ?> map = c207274168y.LIZIZ;
        Object obj = map.get("to_user_id");
        if ((obj instanceof String) && obj != null) {
            Object obj2 = map.get("event_name");
            if ((obj2 instanceof String) && obj2 != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Map map2 = (Map) ((HashMap) this.LIZ).get(obj);
                if (map2 == null) {
                    map2 = new HashMap();
                    ((HashMap) this.LIZ).put(obj, map2);
                }
                List arrayList = (List) map2.get(obj2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map2.put(obj2, arrayList);
                }
                HashMap map3 = new HashMap();
                map3.put("timestamp", Long.valueOf(jCurrentTimeMillis));
                arrayList.add(map3);
                List arrayList2 = (List) ((HashMap) this.LIZIZ).get(obj);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    ((HashMap) this.LIZIZ).put(obj, arrayList2);
                }
                HashMap map4 = new HashMap();
                map4.put("timestamp", Long.valueOf(jCurrentTimeMillis));
                map4.put("event_name", obj2);
                arrayList2.add(map4);
                LIZLLL(c207274168y, null);
            }
        }
    }
}
