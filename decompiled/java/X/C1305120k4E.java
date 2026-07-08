package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0k4E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1305120k4E<K, V> {
    public final String LIZ;
    public final ConcurrentHashMap<K, WeakReference<V>> LIZIZ;
    public final ConcurrentHashMap<Object, Function2<String, String, Unit>> LIZJ = new ConcurrentHashMap<>();

    public final int LIZIZ() {
        return this.LIZIZ.size();
    }

    public final List<V> LIZJ() {
        Set<Map.Entry<K, WeakReference<V>>> setEntrySet = this.LIZIZ.entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            Object obj = ((Reference) entry.getValue()).get();
            if (obj == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("WeakReference ");
                sbLIZ.append(key);
                sbLIZ.append(" was recycled");
                C2188811AlT.LIZIZ(sbLIZ);
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void LIZLLL(String str) {
        Iterator<T> it2 = this.LIZJ.values().iterator();
        while (it2.hasNext()) {
            ((Function2) it2.next()).invoke(this.LIZ, str);
        }
    }

    public final void LJ(InterfaceC2258671Dar interfaceC2258671Dar) {
        this.LIZJ.remove(interfaceC2258671Dar);
    }

    public C1305120k4E(String str, ConcurrentHashMap<K, WeakReference<V>> concurrentHashMap) {
        this.LIZ = str;
        this.LIZIZ = concurrentHashMap;
    }

    public final void LIZ(InterfaceC2258671Dar interfaceC2258671Dar, Function2 function2) {
        this.LIZJ.put(interfaceC2258671Dar, function2);
    }
}
