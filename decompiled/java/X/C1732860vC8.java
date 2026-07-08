package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0vC8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1732860vC8 {
    public final Map<Class<?>, List<InterfaceC1732840vC6>> LIZ = new LinkedHashMap();

    public final <I extends InterfaceC1732840vC6> I LIZ(Class<I> cls) {
        List list = (List) ((LinkedHashMap) this.LIZ).get(cls);
        if (list == null) {
            return null;
        }
        Object objLJJJLL = C13LP.LJJJLL(list);
        if (!(objLJJJLL instanceof InterfaceC1732840vC6)) {
            return null;
        }
        return (I) objLJJJLL;
    }

    public final <I extends InterfaceC1732840vC6> void LIZIZ(Class<I> cls, I i) {
        List<InterfaceC1732840vC6> arrayList = (List) ((LinkedHashMap) this.LIZ).get(cls);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.LIZ.put(cls, arrayList);
        }
        arrayList.remove(i);
        arrayList.add(i);
    }

    public final <I extends InterfaceC1732840vC6> void LIZJ(Class<I> cls, I i) {
        List list = (List) ((LinkedHashMap) this.LIZ).get(cls);
        if (list == null) {
            return;
        }
        list.remove(i);
        if (list.isEmpty()) {
            this.LIZ.remove(cls);
        }
    }
}
