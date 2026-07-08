package X;

import com.google.gson.h;
import com.google.gson.k;
import java.util.ListIterator;

/* JADX INFO: renamed from: X.07hu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1934407hu implements ListIterator<Object>, C03W4 {
    public int LL;
    public final /* synthetic */ C1934307ht LLILLJJLI;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.LL < this.LLILLJJLI.LL.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.LL > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        h hVar = this.LLILLJJLI.LL;
        int i = this.LL;
        this.LL = i + 1;
        k kVarLJJIIJZLJL = hVar.LJJIIJZLJL(i);
        if (kVarLJJIIJZLJL != null) {
            return C1931407hQ.LIZ(kVarLJJIIJZLJL);
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        h hVar = this.LLILLJJLI.LL;
        int i = this.LL - 1;
        this.LL = i;
        k kVarLJJIIJZLJL = hVar.LJJIIJZLJL(i);
        if (kVarLJJIIJZLJL != null) {
            return C1931407hQ.LIZ(kVarLJJIIJZLJL);
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.LL - 1;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.LL;
    }

    public C1934407hu(C1934307ht c1934307ht, int i) {
        this.LLILLJJLI = c1934307ht;
        this.LL = i;
    }
}
