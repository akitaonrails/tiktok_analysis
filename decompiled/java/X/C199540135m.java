package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.135m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199540135m extends AbstractSet<Map.Entry<String, Object>> {
    public final /* synthetic */ C199539135l LL;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator<String> it2 = this.LL.LLILLJJLI.LIZJ.iterator();
        while (it2.hasNext()) {
            this.LL.LLILLJJLI.LIZ(it2.next()).LIZLLL(this.LL.LL, null);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator<String> it2 = this.LL.LLILLJJLI.LIZJ.iterator();
        while (it2.hasNext()) {
            if (this.LL.LLILLJJLI.LIZ(it2.next()).LIZ(this.LL.LL) != null) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C199541135n(this.LL);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator<String> it2 = this.LL.LLILLJJLI.LIZJ.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (this.LL.LLILLJJLI.LIZ(it2.next()).LIZ(this.LL.LL) != null) {
                i++;
            }
        }
        return i;
    }

    public C199540135m(C199539135l c199539135l) {
        this.LL = c199539135l;
    }
}
