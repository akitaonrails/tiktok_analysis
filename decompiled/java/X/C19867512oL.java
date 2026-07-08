package X;

import X.AbstractC19872012p4;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: X.12oL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19867512oL<K, V> extends AbstractC19867712oN<K, Collection<V>> {
    public final /* synthetic */ AbstractC19872012p4.c LL;

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
        return new C19867412oK(this.LL);
    }

    public C19867512oL(AbstractC19872012p4.c cVar) {
        this.LL = cVar;
    }

    @Override // X.AbstractC19867712oN, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set<Map.Entry<K, Collection<V>>> setEntrySet = this.LL.LLILLL.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection<V> collectionRemove;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        AbstractC19872012p4 abstractC19872012p4 = AbstractC19872012p4.this;
        Object key = entry.getKey();
        Map<K, Collection<V>> map = abstractC19872012p4.LLILZLL;
        map.getClass();
        try {
            collectionRemove = map.remove(key);
        } catch (ClassCastException | NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            collectionRemove = null;
        }
        Collection<V> collection = collectionRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            abstractC19872012p4.LLIZ -= size;
            return true;
        }
        return true;
    }
}
