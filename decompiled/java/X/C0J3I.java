package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0J3I, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J3I<K, V> {
    public final Map<K, ArrayList<V>> LIZ = new LinkedHashMap();

    public final Collection<V> LIZIZ() {
        Collection<V> collectionValues = ((LinkedHashMap) this.LIZ).values();
        ArrayList arrayList = new ArrayList();
        Iterator<V> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            arrayList.addAll((Collection) it2.next());
        }
        return arrayList;
    }

    public final void LIZ(K k, V v) {
        ArrayList arrayList = (ArrayList) ((LinkedHashMap) this.LIZ).get(k);
        if (arrayList == null) {
            ArrayList<V> arrayList2 = new ArrayList<>();
            arrayList2.add(v);
            this.LIZ.put(k, arrayList2);
            return;
        }
        arrayList.add(v);
    }
}
