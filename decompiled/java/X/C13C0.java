package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AFwS318S0000000_30;

/* JADX INFO: renamed from: X.13C0, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13C0<E> extends C13CT<E> implements InterfaceC1687450u0t<E> {
    public C19970913Bz<E> LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public final C13CF<E, C13C1> LLILZ;

    @Override // X.InterfaceC1687450u0t
    public final C19970913Bz build() {
        C13C5<E, C13C1> c13c5Build = this.LLILZ.build();
        C19970913Bz<E> c19970913Bz = this.LL;
        if (c13c5Build != c19970913Bz.LLILZ) {
            c19970913Bz = new C19970913Bz<>(this.LLILLJJLI, this.LLILLL, c13c5Build);
        }
        this.LL = c19970913Bz;
        return c19970913Bz;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.LLILZ.clear();
        C13C3 c13c3 = C13C3.LIZ;
        this.LLILLJJLI = c13c3;
        this.LLILLL = c13c3;
    }

    @Override // X.C13CT
    public final int getSize() {
        return this.LLILZ.LIZJ();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new C19968713Bd<E>(this) { // from class: X.13Be
            public final C13C0<E> LLILZ;
            public E LLILZIL;
            public boolean LLILZLL;
            public int LLIZ;

            @Override // X.C19968713Bd, java.util.Iterator
            public final E next() {
                if (this.LLILZ.LLILZ.LLILZIL != this.LLIZ) {
                    throw new ConcurrentModificationException();
                }
                E e = (E) super.next();
                this.LLILZIL = e;
                this.LLILZLL = true;
                return e;
            }

            @Override // X.C19968713Bd, java.util.Iterator
            public final void remove() {
                if (!this.LLILZLL) {
                    throw new IllegalStateException();
                }
                this.LLILZ.remove(this.LLILZIL);
                this.LLILZIL = null;
                this.LLILZLL = false;
                this.LLIZ = this.LLILZ.LLILZ.LLILZIL;
                this.LLILLL--;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            {
                Object obj = this.LLILLJJLI;
                C13CF<E, C13C1> c13cf = this.LLILZ;
                super(obj, c13cf);
                this.LLILZ = this;
                this.LLIZ = c13cf.LLILZIL;
            }
        };
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return super.hashCode();
    }

    public C13C0(C19970913Bz<E> c19970913Bz) {
        this.LL = c19970913Bz;
        this.LLILLJJLI = c19970913Bz.LLILLJJLI;
        this.LLILLL = c19970913Bz.LLILLL;
        C13C5<E, C13C1> c13c5 = c19970913Bz.LLILZ;
        c13c5.getClass();
        this.LLILZ = new C13CF<>(c13c5);
    }

    @Override // X.C13CT, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        if (this.LLILZ.containsKey(e)) {
            return false;
        }
        if (isEmpty()) {
            this.LLILLJJLI = e;
            this.LLILLL = e;
            this.LLILZ.put(e, new C13C1());
            return true;
        }
        C13C1 c13c1 = this.LLILZ.get(this.LLILLL);
        C13CF<E, C13C1> c13cf = this.LLILZ;
        Object obj = this.LLILLL;
        c13c1.getClass();
        c13cf.put((E) obj, new C13C1(c13c1.LIZ, e));
        this.LLILZ.put(e, new C13C1(this.LLILLL, C13C3.LIZ));
        this.LLILLL = e;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.LLILZ.containsKey(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (set instanceof C19970913Bz) {
            return this.LLILZ.LLILLL.LJI(((C19970913Bz) obj).LLILZ.LLILLJJLI, AFwS318S0000000_30.get$arr$(39));
        }
        if (set instanceof C13C0) {
            return this.LLILZ.LLILLL.LJI(((C13C0) obj).LLILZ.LLILLL, AFwS318S0000000_30.get$arr$(40));
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C13C1 c13c1Remove = this.LLILZ.remove(obj);
        if (c13c1Remove == null) {
            return false;
        }
        Object obj2 = c13c1Remove.LIZ;
        C13C3 c13c3 = C13C3.LIZ;
        if (obj2 != c13c3) {
            C13C1 c13c1 = this.LLILZ.get(obj2);
            C13CF<E, C13C1> c13cf = this.LLILZ;
            Object obj3 = c13c1Remove.LIZ;
            Object obj4 = c13c1Remove.LIZIZ;
            c13c1.getClass();
            c13cf.put((E) obj3, new C13C1(c13c1.LIZ, obj4));
        } else {
            this.LLILLJJLI = c13c1Remove.LIZIZ;
        }
        Object obj5 = c13c1Remove.LIZIZ;
        if (obj5 != c13c3) {
            C13C1 c13c12 = this.LLILZ.get(obj5);
            this.LLILZ.put((E) c13c1Remove.LIZIZ, new C13C1(c13c1Remove.LIZ, c13c12.LIZIZ));
            return true;
        }
        this.LLILLL = c13c1Remove.LIZ;
        return true;
    }
}
