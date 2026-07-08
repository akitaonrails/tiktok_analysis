package X;

import X.AbstractC19872012p4;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: X.12oK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19867412oK<K, V> implements Iterator<Map.Entry<K, Collection<V>>> {
    public final Iterator<Map.Entry<K, Collection<V>>> LL;
    public Collection<V> LLILLJJLI;
    public final /* synthetic */ AbstractC19872012p4.c LLILLL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry<K, Collection<V>> next = this.LL.next();
        this.LLILLJJLI = next.getValue();
        return this.LLILLL.LIZ(next);
    }

    @Override // java.util.Iterator
    public final void remove() {
        C19864312np.LJIILIIL("no calls to next() since the last call to remove()", this.LLILLJJLI != null);
        this.LL.remove();
        AbstractC19872012p4.this.LLIZ -= this.LLILLJJLI.size();
        this.LLILLJJLI.clear();
        this.LLILLJJLI = null;
    }

    public C19867412oK(AbstractC19872012p4.c cVar) {
        this.LLILLL = cVar;
        this.LL = cVar.LLILLL.entrySet().iterator();
    }
}
