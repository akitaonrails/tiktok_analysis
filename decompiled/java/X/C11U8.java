package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.11U8, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11U8<V> implements Iterable<V>, C03W4 {
    public final int LL;
    public final CopyOnWriteArrayList<V> LLILLJJLI = new CopyOnWriteArrayList<>();

    @Override // java.lang.Iterable
    public final synchronized Iterator<V> iterator() {
        return this.LLILLJJLI.iterator();
    }

    public final synchronized int size() {
        return this.LLILLJJLI.size();
    }

    public C11U8(int i) {
        this.LL = i;
    }

    public final synchronized void LIZJ(V v) {
        if (this.LLILLJJLI.size() >= this.LL) {
            return;
        }
        this.LLILLJJLI.add(v);
    }
}
