package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.13Ep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19977713Ep<K, V, T> implements Iterator<T>, C03W4 {
    public Object[] LL = C13CU.LJ.LIZLLL;
    public int LLILLJJLI;
    public int LLILLL;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLL < this.LLILLJJLI;
    }

    public final void LIZ(int i, int i2, Object[] objArr) {
        this.LL = objArr;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }
}
