package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13B4, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13B4 implements Collection<C1507270pKH>, C03W4 {
    public final short[] LL;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(C1507270pKH c1507270pKH) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends C1507270pKH> collection) {
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
    public final Iterator<C1507270pKH> iterator() {
        return new C13B5(this.LL);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.LL.length;
    }

    public final String toString() {
        short[] sArr = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UShortArray(storage=");
        sbLIZ.append(Arrays.toString(sArr));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C13B4(short[] sArr) {
        this.LL = sArr;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C1507270pKH)) {
            return false;
        }
        short s = ((C1507270pKH) obj).LL;
        short[] sArr = this.LL;
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            if (s == sArr[i]) {
                if (i < 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r1 < 0) goto L21;
     */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsAll(java.util.Collection<?> r8) {
        /*
            r7 = this;
            short[] r6 = r7.LL
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r5 = 1
            if (r0 != 0) goto L31
            java.util.Iterator r4 = r8.iterator()
        L10:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r1 = r4.next()
            boolean r0 = r1 instanceof X.C1507270pKH
            if (r0 == 0) goto L30
            X.0pKH r1 = (X.C1507270pKH) r1
            short r3 = r1.LL
            int r2 = r6.length
            r1 = 0
        L24:
            if (r1 >= r2) goto L30
            short r0 = r6[r1]
            if (r3 != r0) goto L2d
            if (r1 < 0) goto L30
            goto L10
        L2d:
            int r1 = r1 + 1
            goto L24
        L30:
            r5 = 0
        L31:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13B4.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        short[] sArr = this.LL;
        if (!(obj instanceof C13B4) || !Intrinsics.LJFF(sArr, ((C13B4) obj).LL)) {
            return false;
        }
        return true;
    }
}
