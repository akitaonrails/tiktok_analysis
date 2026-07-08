package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Vew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C803120Vew<K, V> extends ConcurrentHashMap<K, List<V>> {
    public static final long serialVersionUID = -8278080958339137414L;

    public List<V> newList() {
        return new ArrayList();
    }

    public List<V> getList(K k) {
        List<V> list = (List) super.get(k);
        if (list == null) {
            List<V> listNewList = newList();
            put(k, listNewList);
            return listNewList;
        }
        return list;
    }

    public void removeAll(V v) {
        Iterator<V> it2 = values().iterator();
        while (it2.hasNext()) {
            ((List) it2.next()).remove(v);
        }
    }

    public void add(K k, V v) {
        getList(k).add(v);
    }

    public void addMulti(V v, K... kArr) {
        if (v != null && kArr != null && kArr.length > 0) {
            for (K k : kArr) {
                getList(k).add(v);
            }
        }
    }

    public void removeInList(K k, V v) {
        getList(k).remove(v);
    }
}
