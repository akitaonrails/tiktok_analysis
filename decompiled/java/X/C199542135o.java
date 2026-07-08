package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.135o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199542135o implements Iterator<Map.Entry<String, Object>> {
    public boolean LL;
    public final C199541135n LLILLJJLI;
    public final Iterator<Map.Entry<String, Object>> LLILLL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLJJLI.hasNext() || this.LLILLL.hasNext();
    }

    @Override // java.util.Iterator
    public final Map.Entry<String, Object> next() {
        if (!this.LL) {
            if (this.LLILLJJLI.hasNext()) {
                return this.LLILLJJLI.next();
            }
            this.LL = true;
        }
        return this.LLILLL.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.LL) {
            this.LLILLL.remove();
        }
        this.LLILLJJLI.remove();
    }

    public C199542135o(C199536135i c199536135i, C199540135m c199540135m) {
        c199540135m.getClass();
        this.LLILLJJLI = new C199541135n(c199540135m.LL);
        this.LLILLL = c199536135i.LL.entrySet().iterator();
    }
}
