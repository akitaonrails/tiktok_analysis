package X;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.08CY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08CY implements ListIterator, C03W4 {
    public static final C08CY LL = new C08CY();

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        throw new NoSuchElementException();
    }
}
