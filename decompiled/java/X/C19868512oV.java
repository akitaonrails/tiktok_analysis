package X;

import X.AbstractC19872012p4;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [K] */
/* JADX INFO: renamed from: X.12oV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19868512oV<K> implements Iterator<K> {
    public Map.Entry<K, Collection<V>> LL;
    public final /* synthetic */ Iterator LLILLJJLI;
    public final /* synthetic */ AbstractC19872012p4.e LLILLL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLJJLI.hasNext();
    }

    @Override // java.util.Iterator
    public final K next() {
        Map.Entry<K, Collection<V>> entry = (Map.Entry) this.LLILLJJLI.next();
        this.LL = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        C19864312np.LJIILIIL("no calls to next() since the last call to remove()", this.LL != null);
        Collection collection = (Collection) this.LL.getValue();
        this.LLILLJJLI.remove();
        AbstractC19872012p4.this.LLIZ -= collection.size();
        collection.clear();
        this.LL = null;
    }

    public C19868512oV(AbstractC19872012p4.e eVar, Iterator it2) {
        this.LLILLL = eVar;
        this.LLILLJJLI = it2;
    }
}
