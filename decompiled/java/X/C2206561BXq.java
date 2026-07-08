package X;

import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.1BXq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2206561BXq implements Iterator<C2206571BXr> {
    public final Iterator<String> LL;
    public Iterator<C2206571BXr> LLILLJJLI = null;
    public final /* synthetic */ C2206541BXo LLILLL;

    public final void LIZ() {
        while (true) {
            Iterator<C2206571BXr> it2 = this.LLILLJJLI;
            if ((it2 != null && it2.hasNext()) || !this.LL.hasNext()) {
                return;
            }
            Deque deque = (Deque) ((LinkedHashMap) this.LLILLL.LL).get(this.LL.next());
            this.LLILLJJLI = deque != null ? deque.iterator() : Collections.emptyIterator();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        Iterator<C2206571BXr> it2 = this.LLILLJJLI;
        if (it2 != null) {
            it2.remove();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        LIZ();
        Iterator<C2206571BXr> it2 = this.LLILLJJLI;
        return it2 != null && it2.hasNext();
    }

    @Override // java.util.Iterator
    public final C2206571BXr next() {
        LIZ();
        return this.LLILLJJLI.next();
    }

    public C2206561BXq(C2206541BXo c2206541BXo) {
        this.LLILLL = c2206541BXo;
        this.LL = c2206541BXo.LLILLJJLI.iterator();
    }
}
