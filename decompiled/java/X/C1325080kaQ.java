package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0kaQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1325080kaQ<K, V> implements InterfaceC1325150kaX<K, V> {
    public final Map<K, C1323050kX9<V>> LL = new ConcurrentHashMap();

    @Override // X.InterfaceC1325150kaX
    public final int LIZIZ(InterfaceC1325100kaS<K> interfaceC1325100kaS) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<K, V>> it2 = ((ConcurrentHashMap) this.LL).entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<K, V> next = it2.next();
            if (interfaceC1325100kaS.apply(next.getKey())) {
                arrayList.add(next.getValue());
                ((C1323050kX9) next.getValue()).close();
                it2.remove();
            }
        }
        return arrayList.size();
    }

    @Override // X.InterfaceC1325150kaX
    public final synchronized boolean LIZLLL(InterfaceC1325100kaS<K> interfaceC1325100kaS) {
        ArrayList arrayList;
        arrayList = new ArrayList(((ConcurrentHashMap) this.LL).entrySet().size());
        for (Map.Entry<K, V> entry : ((ConcurrentHashMap) this.LL).entrySet()) {
            if (interfaceC1325100kaS.apply(entry.getKey())) {
                arrayList.add(entry);
            }
        }
        return !arrayList.isEmpty();
    }

    @Override // X.InterfaceC1325150kaX
    public final C1323050kX9<V> get(K k) {
        k.getClass();
        return (C1323050kX9) ((ConcurrentHashMap) this.LL).get(k);
    }

    @Override // X.InterfaceC1325150kaX
    public final C1323050kX9 LJ(InterfaceC1324680kZm interfaceC1324680kZm, C1323050kX9 c1323050kX9) {
        return (C1323050kX9) ((ConcurrentHashMap) this.LL).put(interfaceC1324680kZm, c1323050kX9);
    }
}
