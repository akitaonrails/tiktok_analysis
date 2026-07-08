package X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: X.12q3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19878112q3<E> extends AbstractC19870412oo<E> implements InterfaceC19879212qE<E> {
    public transient AbstractC19875512pd<E> LLILLJJLI;
    public transient AbstractC19875112pZ<InterfaceC19878012q2<E>> LLILLL;

    public abstract InterfaceC19878012q2<E> LJIIJJI(int i);

    public abstract /* synthetic */ int count(Object obj);

    public abstract AbstractC19875112pZ<E> elementSet();

    @Override // X.AbstractC19875812pg
    public abstract Object writeReplace();

    public static <E> C19878212q4<E> builder() {
        return new C19878212q4<>(4);
    }

    @Override // X.AbstractC19875812pg
    public AbstractC19875512pd<E> asList() {
        AbstractC19875512pd<E> abstractC19875512pd = this.LLILLJJLI;
        if (abstractC19875512pd != null) {
            return abstractC19875512pd;
        }
        AbstractC19875512pd<E> abstractC19875512pdAsList = super.asList();
        this.LLILLJJLI = abstractC19875512pdAsList;
        return abstractC19875512pdAsList;
    }

    @Override // X.InterfaceC19879212qE
    public AbstractC19875112pZ<InterfaceC19878012q2<E>> entrySet() {
        AbstractC19875112pZ<InterfaceC19878012q2<E>> abstractC19875112pZOf = this.LLILLL;
        if (abstractC19875112pZOf == null) {
            abstractC19875112pZOf = isEmpty() ? AbstractC19875112pZ.of() : new AbstractC19869612og<InterfaceC19878012q2<E>>() { // from class: X.12qB
                public static final long serialVersionUID = 0;

                @Override // X.AbstractC19875812pg
                public final boolean LJIIIZ() {
                    return this.LLILLL.LJIIIZ();
                }

                @Override // X.AbstractC19875112pZ, java.util.Collection, java.util.Set
                public final int hashCode() {
                    return this.LLILLL.hashCode();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
                    return this.LLILLL.elementSet().size();
                }

                @Override // X.AbstractC19875112pZ, X.AbstractC19875812pg
                public Object writeReplace() {
                    final AbstractC19878112q3 abstractC19878112q3 = this.LLILLL;
                    return new Serializable(abstractC19878112q3) { // from class: X.12qL
                        public final AbstractC19878112q3<E> LL;

                        public Object readResolve() {
                            return this.LL.entrySet();
                        }

                        {
                            this.LL = abstractC19878112q3;
                        }
                    };
                }

                @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
                    if (!(obj instanceof InterfaceC19878012q2)) {
                        return false;
                    }
                    InterfaceC19878012q2 interfaceC19878012q2 = (InterfaceC19878012q2) obj;
                    if (interfaceC19878012q2.getCount() <= 0 || this.LLILLL.count(interfaceC19878012q2.getElement()) != interfaceC19878012q2.getCount()) {
                        return false;
                    }
                    return true;
                }

                @Override // X.AbstractC19869612og
                public final Object get(int i) {
                    return this.LLILLL.LJIIJJI(i);
                }
            };
            this.LLILLL = abstractC19875112pZOf;
        }
        return abstractC19875112pZOf;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return C1664790tQL.LIZIZ(entrySet());
    }

    @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public AbstractC19853312m3<E> iterator() {
        final AbstractC19853312m3<InterfaceC19878012q2<E>> it2 = entrySet().iterator();
        return new AbstractC19853312m3<E>() { // from class: X.12q1
            public int LL;
            public E LLILLJJLI;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.LL > 0 || it2.hasNext();
            }

            @Override // java.util.Iterator
            public final E next() {
                if (this.LL <= 0) {
                    InterfaceC19878012q2 interfaceC19878012q2 = (InterfaceC19878012q2) it2.next();
                    this.LLILLJJLI = (E) interfaceC19878012q2.getElement();
                    this.LL = interfaceC19878012q2.getCount();
                }
                this.LL--;
                E e = this.LLILLJJLI;
                Objects.requireNonNull(e);
                return e;
            }
        };
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return entrySet().toString();
    }

    public static <E> AbstractC19878112q3<E> of() {
        return C19878312q5.LLIZ;
    }

    @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public static <E> AbstractC19878112q3<E> LJIIJ(E... eArr) {
        C19878212q4 c19878212q4 = new C19878212q4(4);
        c19878212q4.LIZLLL(eArr);
        return c19878212q4.LJFF();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008f A[LOOP:1: B:28:0x0089->B:30:0x008f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <E> X.AbstractC19878112q3<E> copyOf(java.lang.Iterable<? extends E> r5) {
        /*
            boolean r0 = r5 instanceof X.AbstractC19878112q3
            if (r0 == 0) goto Le
            r1 = r5
            X.12q3 r1 = (X.AbstractC19878112q3) r1
            boolean r0 = r1.LJIIIZ()
            if (r0 != 0) goto Le
            return r1
        Le:
            X.12q4 r3 = new X.12q4
            boolean r1 = r5 instanceof X.InterfaceC19879212qE
            if (r1 == 0) goto L6b
            r0 = r5
            X.12qE r0 = (X.InterfaceC19879212qE) r0
            java.util.Set r0 = r0.elementSet()
            int r0 = r0.size()
        L1f:
            r3.<init>(r0)
            X.12q6<E> r0 = r3.LIZ
            java.util.Objects.requireNonNull(r0)
            if (r1 == 0) goto La1
            X.12qE r5 = (X.InterfaceC19879212qE) r5
            boolean r0 = r5 instanceof X.C19878312q5
            if (r0 == 0) goto L61
            r0 = r5
            X.12q5 r0 = (X.C19878312q5) r0
            X.12q6<E> r4 = r0.LLILZ
        L34:
            if (r4 == 0) goto L6e
            X.12q6<E> r2 = r3.LIZ
            int r1 = r2.LIZJ
            int r0 = r4.LIZJ
            int r0 = java.lang.Math.max(r1, r0)
            r2.LIZ(r0)
            int r0 = r4.LIZJ
            if (r0 == 0) goto Lb3
            r2 = 0
        L48:
            int r0 = r4.LIZJ
            X.C19864312np.LJFF(r2, r0)
            java.lang.Object[] r0 = r4.LIZ
            r1 = r0[r2]
            int r0 = r4.LIZIZ(r2)
            r3.LJ(r0, r1)
            int r2 = r2 + 1
            int r0 = r4.LIZJ
            if (r2 >= r0) goto Lb3
            if (r2 < 0) goto Lb3
            goto L48
        L61:
            boolean r0 = r5 instanceof X.AbstractC19878512q7
            if (r0 == 0) goto L6e
            r0 = r5
            X.12q7 r0 = (X.AbstractC19878512q7) r0
            X.12q6<E> r4 = r0.LLILLL
            goto L34
        L6b:
            r0 = 11
            goto L1f
        L6e:
            java.util.Set r0 = r5.entrySet()
            X.12q6<E> r2 = r3.LIZ
            int r1 = r2.LIZJ
            int r0 = r0.size()
            int r0 = java.lang.Math.max(r1, r0)
            r2.LIZ(r0)
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L89:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb3
            java.lang.Object r0 = r2.next()
            X.12q2 r0 = (X.InterfaceC19878012q2) r0
            java.lang.Object r1 = r0.getElement()
            int r0 = r0.getCount()
            r3.LJ(r0, r1)
            goto L89
        La1:
            java.util.Iterator r1 = r5.iterator()
        La5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb3
            java.lang.Object r0 = r1.next()
            r3.LIZ(r0)
            goto La5
        Lb3:
            X.12q3 r0 = r3.LJFF()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC19878112q3.copyOf(java.lang.Iterable):X.12q3");
    }

    public static <E> AbstractC19878112q3<E> of(E e) {
        return LJIIJ(e);
    }

    @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (count(obj) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return C19879112qD.LIZ(this, obj);
    }

    public static <E> AbstractC19878112q3<E> copyOf(Iterator<? extends E> it2) {
        C19878212q4 c19878212q4 = new C19878212q4(4);
        while (it2.hasNext()) {
            c19878212q4.LIZ(it2.next());
        }
        return c19878212q4.LJFF();
    }

    public static <E> AbstractC19878112q3<E> copyOf(E[] eArr) {
        return LJIIJ(eArr);
    }

    public static <E> AbstractC19878112q3<E> of(E e, E e2) {
        return LJIIJ(e, e2);
    }

    @Override // X.AbstractC19875812pg
    public final int LIZJ(int i, Object[] objArr) {
        AbstractC19853312m3<InterfaceC19878012q2<E>> it2 = entrySet().iterator();
        while (it2.hasNext()) {
            InterfaceC19878012q2<E> next = it2.next();
            Arrays.fill(objArr, i, next.getCount() + i, next.getElement());
            i += next.getCount();
        }
        return i;
    }

    @Override // X.InterfaceC19879212qE
    public final int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC19879212qE
    public final int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC19879212qE
    public final int setCount(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public static <E> AbstractC19878112q3<E> of(E e, E e2, E e3) {
        return LJIIJ(e, e2, e3);
    }

    @Override // X.InterfaceC19879212qE
    public final boolean setCount(E e, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public static <E> AbstractC19878112q3<E> of(E e, E e2, E e3, E e4) {
        return LJIIJ(e, e2, e3, e4);
    }

    public static <E> AbstractC19878112q3<E> of(E e, E e2, E e3, E e4, E e5) {
        return LJIIJ(e, e2, e3, e4, e5);
    }

    public static <E> AbstractC19878112q3<E> of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        C19878212q4 c19878212q4 = new C19878212q4(4);
        c19878212q4.LJ(1, e);
        c19878212q4.LIZJ(e2);
        c19878212q4.LIZJ(e3);
        c19878212q4.LIZJ(e4);
        c19878212q4.LIZJ(e5);
        c19878212q4.LIZJ(e6);
        c19878212q4.LIZLLL(eArr);
        return c19878212q4.LJFF();
    }
}
