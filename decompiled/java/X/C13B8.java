package X;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13B8, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13B8 implements List<AbstractC20055413dY>, C03W4 {
    public final C13B1<Object> LL = new C13B1<>(16);
    public final C13BB LLILLJJLI = new C13BB(16);
    public int LLILLL = -1;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, AbstractC20055413dY abstractC20055413dY) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends AbstractC20055413dY> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends AbstractC20055413dY> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.LLILLL = -1;
        this.LL.LJIIIIZZ();
        this.LLILLJJLI.LIZIZ = 0;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC20055413dY remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<AbstractC20055413dY> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC20055413dY set(int i, AbstractC20055413dY abstractC20055413dY) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void sort(Comparator<? super AbstractC20055413dY> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C1975307oV.LIZ(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C1975307oV.LIZIZ(this, tArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        r3.getClass();
        X.C19968313Az.LIZIZ("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LIZJ() {
        /*
            r7 = this;
            r1 = 2139095040(0x7f800000, float:Infinity)
            r0 = 0
            long r1 = X.C13B9.LIZ(r1, r0, r0)
            int r0 = r7.LLILLL
            int r6 = r0 + 1
            X.13B1<java.lang.Object> r0 = r7.LL
            int r0 = r0.LIZIZ
            int r5 = r0 + (-1)
            if (r6 > r5) goto L45
        L13:
            X.13BB r3 = r7.LLILLJJLI
            if (r6 < 0) goto L3b
            int r0 = r3.LIZIZ
            if (r6 >= r0) goto L3b
            long[] r0 = r3.LIZ
            r3 = r0[r6]
            int r0 = X.C13BD.LIZ(r3, r1)
            if (r0 >= 0) goto L26
            r1 = r3
        L26:
            float r3 = X.C13BD.LIZIZ(r1)
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L36
            boolean r0 = X.C13BD.LIZLLL(r1)
            if (r0 == 0) goto L36
            return r1
        L36:
            if (r6 == r5) goto L45
            int r6 = r6 + 1
            goto L13
        L3b:
            r3.getClass()
            java.lang.String r0 = "Index must be between 0 and size"
            X.C19968313Az.LIZIZ(r0)
            r0 = 0
            throw r0
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13B8.LIZJ():long");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.LL.LIZLLL();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<AbstractC20055413dY> iterator() {
        return new C13B7(this, 0, 7);
    }

    @Override // java.util.List
    public final ListIterator<AbstractC20055413dY> listIterator() {
        return new C13B7(this, 0, 7);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.LL.LIZIZ;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof AbstractC20055413dY) || indexOf(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.13dY, java.lang.Object] */
    @Override // java.util.List
    public final AbstractC20055413dY get(int i) {
        return this.LL.LIZIZ(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int size;
        if ((obj instanceof AbstractC20055413dY) && size() - 1 >= 0) {
            int i = 0;
            while (!Intrinsics.LJFF(this.LL.LIZIZ(i), obj)) {
                if (i != size) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC20055413dY)) {
            return -1;
        }
        for (int size = size() - 1; -1 < size; size--) {
            if (Intrinsics.LJFF(this.LL.LIZIZ(size), obj)) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<AbstractC20055413dY> listIterator(int i) {
        return new C13B7(this, i, 6);
    }

    public final boolean LJ(float f, boolean z) {
        if (this.LLILLL == this.LL.LIZIZ - 1) {
            return true;
        }
        if (C13BD.LIZ(LIZJ(), C13B9.LIZ(f, z, false)) > 0) {
            return true;
        }
        return false;
    }

    public final void LJFF(int i, int i2) {
        boolean z;
        if (i >= i2) {
            return;
        }
        this.LL.LJIIJJI(i, i2);
        C13BB c13bb = this.LLILLJJLI;
        c13bb.getClass();
        if (i >= 0 && i <= c13bb.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        if (z && i2 >= 0 && i2 <= c13bb.LIZIZ) {
            if (i2 >= i) {
                if (i2 != i) {
                    int i3 = c13bb.LIZIZ;
                    if (i2 < i3) {
                        long[] jArr = c13bb.LIZ;
                        System.arraycopy(jArr, i2, jArr, i, i3 - i2);
                    }
                    c13bb.LIZIZ -= i2 - i;
                    return;
                }
                return;
            }
            C19968313Az.LIZ("The end index must be < start index");
            throw null;
        }
        C19968313Az.LIZIZ("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List
    public final List<AbstractC20055413dY> subList(int i, int i2) {
        return new C13B6(this, i, i2);
    }
}
