package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13BI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13BI implements Collection<C19969613Bm>, C03W4 {
    public final byte[] LL;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(C19969613Bm c19969613Bm) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends C19969613Bm> collection) {
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
    public final Iterator<C19969613Bm> iterator() {
        return new C13BJ(this.LL);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.LL.length;
    }

    public final String toString() {
        byte[] bArr = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UByteArray(storage=");
        sbLIZ.append(Arrays.toString(bArr));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C13BI(byte[] bArr) {
        this.LL = bArr;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C19969613Bm) || C13LQ.LJJIIZI(((C19969613Bm) obj).LL, this.LL) < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        byte[] bArr = this.LL;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof C19969613Bm) || C13LQ.LJJIIZI(((C19969613Bm) obj).LL, bArr) < 0) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        byte[] bArr = this.LL;
        if (!(obj instanceof C13BI) || !Intrinsics.LJFF(bArr, ((C13BI) obj).LL)) {
            return false;
        }
        return true;
    }
}
