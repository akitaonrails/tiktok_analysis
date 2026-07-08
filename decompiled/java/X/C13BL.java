package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13BL, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13BL implements Collection<C19969813Bo>, C03W4 {
    public final long[] LL;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(C19969813Bo c19969813Bo) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends C19969813Bo> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C1975307oV.LIZ(this);
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C1975307oV.LIZIZ(this, tArr);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.LL);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.LL.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<C19969813Bo> iterator() {
        return new C13BM(this.LL);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.LL.length;
    }

    public final String toString() {
        long[] jArr = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ULongArray(storage=");
        sbLIZ.append(Arrays.toString(jArr));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C13BL(long[] jArr) {
        this.LL = jArr;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C19969813Bo)) {
            return false;
        }
        return C13LQ.LJIILL(((C19969813Bo) obj).LL, this.LL);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        long[] jArr = this.LL;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof C19969813Bo) || !C13LQ.LJIILL(((C19969813Bo) obj).LL, jArr)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        long[] jArr = this.LL;
        if (!(obj instanceof C13BL) || !Intrinsics.LJFF(jArr, ((C13BL) obj).LL)) {
            return false;
        }
        return true;
    }
}
