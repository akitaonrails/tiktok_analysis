package X;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: X.12oW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19868612oW extends AbstractC19853312m3<Map.Entry<Object, Object>> {
    public final AbstractC19853312m3 LL;
    public Object LLILLJJLI = null;
    public AbstractC19853312m3 LLILLL = C19864912nv.LLILZIL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLL.hasNext() || this.LL.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.LLILLL.hasNext()) {
            Map.Entry entry = (Map.Entry) this.LL.next();
            this.LLILLJJLI = entry.getKey();
            this.LLILLL = ((AbstractC19875812pg) entry.getValue()).iterator();
        }
        Object obj = this.LLILLJJLI;
        Objects.requireNonNull(obj);
        return new C19868212oS(obj, this.LLILLL.next());
    }

    public C19868612oW(AbstractC19872712pB abstractC19872712pB) {
        this.LL = abstractC19872712pB.LLILZLL.entrySet().iterator();
    }
}
