package X;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.13DC, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13DC<K, V> extends C13DF<K, V> implements Iterator<Map.Entry<K, V>>, C03W4 {
    @Override // java.util.Iterator
    public final Object next() {
        LIZ();
        int i = this.LLILLJJLI;
        C13DA<K, V> c13da = this.LL;
        if (i >= c13da.length) {
            throw new NoSuchElementException();
        }
        this.LLILLJJLI = i + 1;
        this.LLILLL = i;
        C13D6 c13d6 = new C13D6(c13da, i);
        LIZIZ();
        return c13d6;
    }

    public C13DC(C13DA<K, V> c13da) {
        super(c13da);
    }
}
