package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0khJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329350khJ<K, V> {
    public final InterfaceC1330260kim<V> LIZ;
    public final LinkedHashMap<K, V> LIZIZ = new LinkedHashMap<>();
    public int LIZJ = 0;

    public final synchronized ArrayList<V> LIZ() {
        ArrayList<V> arrayList;
        arrayList = new ArrayList<>((Collection<? extends V>) this.LIZIZ.values());
        this.LIZIZ.clear();
        this.LIZJ = 0;
        return arrayList;
    }

    public final synchronized int LIZLLL() {
        return this.LIZIZ.size();
    }

    public final synchronized K LJ() {
        return this.LIZIZ.isEmpty() ? null : this.LIZIZ.keySet().iterator().next();
    }

    public final synchronized int LJI() {
        return this.LIZJ;
    }

    public C1329350khJ(C1329560khe c1329560khe) {
        this.LIZ = c1329560khe;
    }

    public final synchronized boolean LIZIZ(C1324700kZo c1324700kZo) {
        return this.LIZIZ.containsKey(c1324700kZo);
    }

    public final synchronized V LIZJ(K k) {
        return this.LIZIZ.get(k);
    }

    public final synchronized ArrayList<Map.Entry<K, V>> LJFF(InterfaceC1325100kaS<K> interfaceC1325100kaS) {
        ArrayList<Map.Entry<K, V>> arrayList;
        arrayList = new ArrayList<>(this.LIZIZ.entrySet().size());
        for (Map.Entry<K, V> entry : this.LIZIZ.entrySet()) {
            if (interfaceC1325100kaS.apply(entry.getKey())) {
                arrayList.add(entry);
            }
        }
        return arrayList;
    }

    public final synchronized V LJIIIIZZ(K k) {
        V vRemove;
        int iLIZ;
        vRemove = this.LIZIZ.remove(k);
        int i = this.LIZJ;
        if (vRemove == null) {
            iLIZ = 0;
        } else {
            iLIZ = this.LIZ.LIZ(vRemove);
        }
        this.LIZJ = i - iLIZ;
        return vRemove;
    }

    public final synchronized ArrayList<V> LJIIIZ(InterfaceC1325100kaS<K> interfaceC1325100kaS) {
        ArrayList<V> arrayList;
        int iLIZ;
        arrayList = new ArrayList<>();
        Iterator<Map.Entry<K, V>> it2 = this.LIZIZ.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<K, V> next = it2.next();
            if (interfaceC1325100kaS.apply(next.getKey())) {
                arrayList.add(next.getValue());
                int i = this.LIZJ;
                V value = next.getValue();
                if (value == null) {
                    iLIZ = 0;
                } else {
                    iLIZ = this.LIZ.LIZ(value);
                }
                this.LIZJ = i - iLIZ;
                it2.remove();
            }
        }
        return arrayList;
    }

    public final synchronized void LJII(Object obj, Object obj2) {
        int iLIZ;
        V vRemove = this.LIZIZ.remove(obj);
        int i = this.LIZJ;
        int iLIZ2 = 0;
        if (vRemove == null) {
            iLIZ = 0;
        } else {
            iLIZ = this.LIZ.LIZ(vRemove);
        }
        this.LIZJ = i - iLIZ;
        this.LIZIZ.put(obj, obj2);
        int i2 = this.LIZJ;
        if (obj2 != null) {
            iLIZ2 = this.LIZ.LIZ(obj2);
        }
        this.LIZJ = i2 + iLIZ2;
    }
}
