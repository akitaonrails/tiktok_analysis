package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.135k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199538135k extends AbstractSet<Map.Entry<String, Object>> {
    public final C199540135m LL;
    public final /* synthetic */ C199536135i LLILLJJLI;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.LLILLJJLI.LL.clear();
        this.LL.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<String, Object>> iterator() {
        return new C199542135o(this.LLILLJJLI, this.LL);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.LLILLJJLI.LL.size() + this.LL.size();
    }

    public C199538135k(C199536135i c199536135i) {
        this.LLILLJJLI = c199536135i;
        this.LL = new C199540135m(new C199539135l(c199536135i, c199536135i.LLILLJJLI.LIZ));
    }
}
