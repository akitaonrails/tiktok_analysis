package X;

import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: renamed from: X.08fS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2174008fS implements Iterator<Object>, C03W4 {
    public final /* synthetic */ Enumeration<Object> LL;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LL.hasMoreElements();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.LL.nextElement();
    }

    public C2174008fS(Enumeration<Object> enumeration) {
        this.LL = enumeration;
    }
}
