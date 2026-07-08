package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.07ck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1902407ck implements Iterator<Long>, C03W4 {
    public abstract long nextLong();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Long next() {
        return Long.valueOf(nextLong());
    }
}
