package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.13DE, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13DE<K, V> extends C13DF<K, V> implements Iterator<V>, C03W4 {
    @Override // java.util.Iterator
    public final V next() {
        LIZ();
        int i = this.LLILLJJLI;
        C13DA<K, V> c13da = this.LL;
        if (i >= c13da.length) {
            throw new NoSuchElementException();
        }
        this.LLILLJJLI = i + 1;
        this.LLILLL = i;
        V v = c13da.valuesArray[i];
        LIZIZ();
        return v;
    }

    public C13DE(C13DA<K, V> c13da) {
        super(c13da);
    }
}
