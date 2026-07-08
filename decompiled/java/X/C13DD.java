package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.13DD, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13DD<K, V> extends C13DF<K, V> implements Iterator<K>, C03W4 {
    @Override // java.util.Iterator
    public final K next() {
        LIZ();
        int i = this.LLILLJJLI;
        C13DA<K, V> c13da = this.LL;
        if (i >= c13da.length) {
            throw new NoSuchElementException();
        }
        this.LLILLJJLI = i + 1;
        this.LLILLL = i;
        K k = c13da.keysArray[i];
        LIZIZ();
        return k;
    }

    public C13DD(C13DA<K, V> c13da) {
        super(c13da);
    }
}
