package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.13En, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19977513En<K, V, T> implements Iterator<T>, C03W4 {
    public final AbstractC19977713Ep<K, V, T>[] LL;
    public int LLILLJJLI;
    public boolean LLILLL = true;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a A[LOOP:0: B:6:0x0010->B:18:0x004a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c A[EDGE_INSN: B:21:0x004c->B:19:0x004c BREAK  A[LOOP:0: B:6:0x0010->B:18:0x004a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r7 = this;
            X.13Ep<K, V, T>[] r0 = r7.LL
            int r5 = r7.LLILLJJLI
            r0 = r0[r5]
            int r1 = r0.LLILLL
            int r0 = r0.LLILLJJLI
            r3 = 0
            if (r1 >= r0) goto Le
            return
        Le:
            if (r5 < 0) goto L4c
        L10:
            int r6 = r5 + (-1)
            int r0 = r7.LIZIZ(r5)
            r4 = -1
            if (r0 != r4) goto L2c
            X.13Ep<K, V, T>[] r0 = r7.LL
            r2 = r0[r5]
            int r1 = r2.LLILLL
            java.lang.Object[] r0 = r2.LL
            int r0 = r0.length
            if (r1 >= r0) goto L31
            int r0 = r1 + 1
            r2.LLILLL = r0
            int r0 = r7.LIZIZ(r5)
        L2c:
            if (r0 == r4) goto L31
            r7.LLILLJJLI = r0
            return
        L31:
            if (r5 <= 0) goto L3d
            X.13Ep<K, V, T>[] r0 = r7.LL
            r1 = r0[r6]
            int r0 = r1.LLILLL
            int r0 = r0 + 1
            r1.LLILLL = r0
        L3d:
            X.13Ep<K, V, T>[] r0 = r7.LL
            r1 = r0[r5]
            X.13CU r0 = X.C13CU.LJ
            java.lang.Object[] r0 = r0.LIZLLL
            r1.LIZ(r3, r3, r0)
            if (r6 < 0) goto L4c
            r5 = r6
            goto L10
        L4c:
            r7.LLILLL = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC19977513En.LIZ():void");
    }

    @Override // java.util.Iterator
    public T next() {
        if (!this.LLILLL) {
            throw new NoSuchElementException();
        }
        T next = this.LL[this.LLILLJJLI].next();
        LIZ();
        return next;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLL;
    }

    public final int LIZIZ(int i) {
        AbstractC19977713Ep<K, V, T>[] abstractC19977713EpArr = this.LL;
        AbstractC19977713Ep<K, V, T> abstractC19977713Ep = abstractC19977713EpArr[i];
        int i2 = abstractC19977713Ep.LLILLL;
        if (i2 < abstractC19977713Ep.LLILLJJLI) {
            return i;
        }
        Object[] objArr = abstractC19977713Ep.LL;
        if (i2 < objArr.length) {
            Object obj = objArr[i2];
            if (obj != null) {
                C13CU c13cu = (C13CU) obj;
                if (i == 6) {
                    AbstractC19977713Ep<K, V, T> abstractC19977713Ep2 = abstractC19977713EpArr[7];
                    Object[] objArr2 = c13cu.LIZLLL;
                    abstractC19977713Ep2.LIZ(objArr2.length, 0, objArr2);
                } else {
                    abstractC19977713EpArr[i + 1].LIZ(Integer.bitCount(c13cu.LIZ) * 2, 0, c13cu.LIZLLL);
                }
                return LIZIZ(i + 1);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        }
        return -1;
    }

    public AbstractC19977513En(C13CU<K, V> c13cu, AbstractC19977713Ep<K, V, T>[] abstractC19977713EpArr) {
        this.LL = abstractC19977713EpArr;
        abstractC19977713EpArr[0].LIZ(Integer.bitCount(c13cu.LIZ) * 2, 0, c13cu.LIZLLL);
        this.LLILLJJLI = 0;
        LIZ();
    }
}
