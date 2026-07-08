package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.13Ee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19976613Ee<K, V> {
    public final C13EY<K, V> LL;
    public final Iterator<Map.Entry<K, V>> LLILLJJLI;
    public int LLILLL;
    public Map.Entry<? extends K, ? extends V> LLILZ;
    public Map.Entry<? extends K, ? extends V> LLILZIL;

    public final void LIZ() {
        this.LLILZ = this.LLILZIL;
        this.LLILZIL = this.LLILLJJLI.hasNext() ? this.LLILLJJLI.next() : null;
    }

    public final boolean hasNext() {
        return this.LLILZIL != null;
    }

    public final void remove() {
        if (this.LL.LIZJ().LIZLLL != this.LLILLL) {
            throw new ConcurrentModificationException();
        }
        Map.Entry<? extends K, ? extends V> entry = this.LLILZ;
        if (entry == null) {
            throw new IllegalStateException();
        }
        this.LL.remove(entry.getKey());
        this.LLILZ = null;
        this.LLILLL = this.LL.LIZJ().LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC19976613Ee(C13EY<K, V> c13ey, Iterator<? extends Map.Entry<? extends K, ? extends V>> it2) {
        this.LL = c13ey;
        this.LLILLJJLI = it2;
        this.LLILLL = c13ey.LIZJ().LIZLLL;
        LIZ();
    }
}
