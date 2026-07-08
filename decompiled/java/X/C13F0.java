package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.13F0, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C13F0<K, V, T> implements Iterator<T>, C03W4 {
    public final C13F3<K, V, T>[] LL;
    public int LLILLJJLI;
    public boolean LLILLL = true;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r6 = this;
            X.13F3<K, V, T>[] r0 = r6.LL
            int r3 = r6.LLILLJJLI
            r0 = r0[r3]
            int r1 = r0.LLILLL
            int r0 = r0.LLILLJJLI
            r2 = 0
            if (r1 >= r0) goto Le
            return
        Le:
            r5 = -1
            if (r5 >= r3) goto L4b
            int r0 = r6.LIZIZ(r3)
            if (r0 != r5) goto L2a
            X.13F3<K, V, T>[] r0 = r6.LL
            r4 = r0[r3]
            int r1 = r4.LLILLL
            java.lang.Object[] r0 = r4.LL
            int r0 = r0.length
            if (r1 >= r0) goto L2f
            int r0 = r1 + 1
            r4.LLILLL = r0
            int r0 = r6.LIZIZ(r3)
        L2a:
            if (r0 == r5) goto L2f
            r6.LLILLJJLI = r0
            return
        L2f:
            if (r3 <= 0) goto L3d
            X.13F3<K, V, T>[] r1 = r6.LL
            int r0 = r3 + (-1)
            r1 = r1[r0]
            int r0 = r1.LLILLL
            int r0 = r0 + 1
            r1.LLILLL = r0
        L3d:
            X.13F3<K, V, T>[] r0 = r6.LL
            r1 = r0[r3]
            X.13Cc r0 = X.C19971213Cc.LJ
            java.lang.Object[] r0 = r0.LIZLLL
            r1.LIZ(r2, r2, r0)
            int r3 = r3 + (-1)
            goto Le
        L4b:
            r6.LLILLL = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13F0.LIZ():void");
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
        C13F3<K, V, T>[] c13f3Arr = this.LL;
        C13F3<K, V, T> c13f3 = c13f3Arr[i];
        int i2 = c13f3.LLILLL;
        if (i2 < c13f3.LLILLJJLI) {
            return i;
        }
        Object[] objArr = c13f3.LL;
        if (i2 < objArr.length) {
            C19971213Cc c19971213Cc = (C19971213Cc) objArr[i2];
            if (i == 6) {
                C13F3<K, V, T> c13f32 = c13f3Arr[7];
                Object[] objArr2 = c19971213Cc.LIZLLL;
                c13f32.LIZ(objArr2.length, 0, objArr2);
            } else {
                c13f3Arr[i + 1].LIZ(Integer.bitCount(c19971213Cc.LIZ) * 2, 0, c19971213Cc.LIZLLL);
            }
            return LIZIZ(i + 1);
        }
        return -1;
    }

    public C13F0(C19971213Cc<K, V> c19971213Cc, C13F3<K, V, T>[] c13f3Arr) {
        this.LL = c13f3Arr;
        c13f3Arr[0].LIZ(Integer.bitCount(c19971213Cc.LIZ) * 2, 0, c19971213Cc.LIZLLL);
        this.LLILLJJLI = 0;
        LIZ();
    }
}
