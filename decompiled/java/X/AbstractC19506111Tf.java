package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.11Tf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19506111Tf<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC19506411Ti<K, V> {
    public C19506011Te<K, V> LL;
    public C19506011Te<K, V> LLILLJJLI;

    public abstract C19506011Te<K, V> LIZIZ(C19506011Te<K, V> c19506011Te);

    public abstract C19506011Te<K, V> LIZLLL(C19506011Te<K, V> c19506011Te);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLJJLI != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C19506011Te<K, V> c19506011Te = this.LLILLJJLI;
        C19506011Te<K, V> c19506011Te2 = this.LL;
        this.LLILLJJLI = (c19506011Te == c19506011Te2 || c19506011Te2 == null) ? null : LIZLLL(c19506011Te);
        return c19506011Te;
    }

    @Override // X.InterfaceC19506411Ti
    public final void LIZ(C19506011Te<K, V> c19506011Te) {
        C19506011Te<K, V> c19506011TeLIZLLL = null;
        if (this.LL == c19506011Te && c19506011Te == this.LLILLJJLI) {
            this.LLILLJJLI = null;
            this.LL = null;
        }
        C19506011Te<K, V> c19506011Te2 = this.LL;
        if (c19506011Te2 == c19506011Te) {
            this.LL = LIZIZ(c19506011Te2);
        }
        C19506011Te<K, V> c19506011Te3 = this.LLILLJJLI;
        if (c19506011Te3 == c19506011Te) {
            C19506011Te<K, V> c19506011Te4 = this.LL;
            if (c19506011Te3 != c19506011Te4 && c19506011Te4 != null) {
                c19506011TeLIZLLL = LIZLLL(c19506011Te3);
            }
            this.LLILLJJLI = c19506011TeLIZLLL;
        }
    }

    public AbstractC19506111Tf(C19506011Te<K, V> c19506011Te, C19506011Te<K, V> c19506011Te2) {
        this.LL = c19506011Te2;
        this.LLILLJJLI = c19506011Te;
    }
}
