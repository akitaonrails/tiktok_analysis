package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13BN, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13BN implements Collection<C1507240pKE>, C03W4 {
    public final int[] LL;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(C1507240pKE c1507240pKE) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends C1507240pKE> collection) {
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
    public final Iterator<C1507240pKE> iterator() {
        return new C13BO(this.LL);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.LL.length;
    }

    public final String toString() {
        int[] iArr = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UIntArray(storage=");
        sbLIZ.append(Arrays.toString(iArr));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C13BN(int[] iArr) {
        this.LL = iArr;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C1507240pKE) || C13LQ.LJJIJ(((C1507240pKE) obj).LL, this.LL) < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        int[] iArr = this.LL;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof C1507240pKE) || C13LQ.LJJIJ(((C1507240pKE) obj).LL, iArr) < 0) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        int[] iArr = this.LL;
        if (!(obj instanceof C13BN) || !Intrinsics.LJFF(iArr, ((C13BN) obj).LL)) {
            return false;
        }
        return true;
    }
}
