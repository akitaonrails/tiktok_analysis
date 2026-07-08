package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HZV, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HZV<T> extends C0HZW<T, T, T, T, T> implements Collection<T>, C03W4 {
    public final T LLILZLL;
    public final T LLIZ;
    public final T LLIZLLLIL;
    public final T LLJ;
    public final T LLJI;

    @Override // java.util.Collection
    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return false;
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
    public final boolean removeIf(Predicate<? super T> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return 5;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C1975307oV.LIZ(this);
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C1975307oV.LIZIZ(this, tArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new C462890IDf(this, 5);
    }

    @Override // X.C0HZW
    public final T LJ() {
        return this.LLJI;
    }

    @Override // X.C0HZW
    public final T LJFF() {
        return this.LLJ;
    }

    @Override // X.C0HZW
    public final T LJIIIIZZ() {
        return this.LLIZ;
    }

    @Override // X.C0HZW
    public final T LJIIIZ() {
        return this.LLIZLLLIL;
    }

    @Override // X.C0HZW
    public final T getFirst() {
        return this.LLILZLL;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!Intrinsics.LJFF(this.LLILZLL, obj) && !Intrinsics.LJFF(this.LLIZ, obj) && !Intrinsics.LJFF(this.LLIZLLLIL, obj) && !Intrinsics.LJFF(this.LLJ, obj) && !Intrinsics.LJFF(this.LLJI, obj)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[LOOP:0: B:3:0x002e->B:18:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095 A[SYNTHETIC] */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsAll(java.util.Collection<?> r16) {
        /*
            r15 = this;
            r0 = 5
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            r14 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            r0[r14] = r13
            r5 = 1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            r0[r5] = r12
            r4 = 2
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            r0[r4] = r11
            r3 = 3
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            r0[r3] = r10
            r2 = 4
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            r0[r2] = r9
            java.util.Set r1 = X.C093Y.LJ(r0)
            java.util.Iterator r8 = r16.iterator()
        L2e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L96
            java.lang.Object r6 = r8.next()
            java.util.Iterator r7 = r1.iterator()
        L3c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r0 = r7.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L8b
            if (r0 == r5) goto L81
            if (r0 == r4) goto L77
            if (r0 == r3) goto L6d
            if (r0 != r2) goto L3c
            T r0 = r15.LLJI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
            if (r0 == 0) goto L3c
            r0 = r9
        L5f:
            if (r0 == 0) goto L95
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.remove(r0)
            goto L2e
        L6d:
            T r0 = r15.LLJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
            if (r0 == 0) goto L3c
            r0 = r10
            goto L5f
        L77:
            T r0 = r15.LLIZLLLIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
            if (r0 == 0) goto L3c
            r0 = r11
            goto L5f
        L81:
            T r0 = r15.LLIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
            if (r0 == 0) goto L3c
            r0 = r12
            goto L5f
        L8b:
            T r0 = r15.LLILZLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
            if (r0 == 0) goto L3c
            r0 = r13
            goto L5f
        L95:
            return r14
        L96:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HZV.containsAll(java.util.Collection):boolean");
    }

    public C0HZV(T t, T t2, T t3, T t4, T t6) {
        super(t, t2, t3, t4, t6);
        this.LLILZLL = t;
        this.LLIZ = t2;
        this.LLIZLLLIL = t3;
        this.LLJ = t4;
        this.LLJI = t6;
    }

    public static final C0HZW LJIIJJI(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return new C0HZV(obj, obj2, obj3, obj4, obj5);
    }
}
