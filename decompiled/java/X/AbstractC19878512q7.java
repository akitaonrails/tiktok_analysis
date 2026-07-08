package X;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: X.12q7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19878512q7<E> extends AbstractC19878612q8<E> implements Serializable {
    public static final long serialVersionUID = 0;
    public transient C19878412q6<E> LLILLL;
    public transient long LLILZ;

    /* JADX INFO: renamed from: X.12q7$c */
    public abstract class c<T> implements Iterator<T> {
        public int LL;
        public int LLILLJJLI;
        public int LLILLL;

        public abstract T LIZ(int i);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (AbstractC19878512q7.this.LLILLL.LIZLLL == this.LLILLL) {
                return this.LL >= 0;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (AbstractC19878512q7.this.LLILLL.LIZLLL != this.LLILLL) {
                throw new ConcurrentModificationException();
            }
            C19863912nl.LIZJ(this.LLILLJJLI != -1);
            AbstractC19878512q7 abstractC19878512q7 = AbstractC19878512q7.this;
            abstractC19878512q7.LLILZ -= (long) abstractC19878512q7.LLILLL.LJI(this.LLILLJJLI);
            C19878412q6<E> c19878412q6 = AbstractC19878512q7.this.LLILLL;
            int i = this.LL;
            c19878412q6.getClass();
            this.LL = i - 1;
            this.LLILLJJLI = -1;
            this.LLILLL = AbstractC19878512q7.this.LLILLL.LIZLLL;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tLIZ = LIZ(this.LL);
            int i = this.LL;
            this.LLILLJJLI = i;
            int i2 = i + 1;
            if (i2 >= AbstractC19878512q7.this.LLILLL.LIZJ) {
                i2 = -1;
            }
            this.LL = i2;
            return tLIZ;
        }

        public c() {
            int i;
            C19878412q6<E> c19878412q6 = AbstractC19878512q7.this.LLILLL;
            if (c19878412q6.LIZJ == 0) {
                i = -1;
            } else {
                i = 0;
            }
            this.LL = i;
            this.LLILLJJLI = -1;
            this.LLILLL = c19878412q6.LIZLLL;
        }
    }

    public abstract C19878412q6 LJIIIIZZ();

    @Override // X.AbstractC19878612q8
    public final int LIZJ() {
        return this.LLILLL.LIZJ;
    }

    @Override // X.AbstractC19878612q8
    public final Iterator<E> LJ() {
        return new AbstractC19878512q7<E>.c<E>() { // from class: X.12qJ
            {
                super();
            }

            @Override // X.AbstractC19878512q7.c
            public final E LIZ(int i) {
                C19878412q6<E> c19878412q6 = this.LLILZIL.LLILLL;
                C19864312np.LJFF(i, c19878412q6.LIZJ);
                return (E) c19878412q6.LIZ[i];
            }
        };
    }

    @Override // X.AbstractC19878612q8
    public final Iterator<InterfaceC19878012q2<E>> LJFF() {
        return new AbstractC19878512q7<E>.c<InterfaceC19878012q2<E>>() { // from class: X.12qI
            {
                super();
            }

            @Override // X.AbstractC19878512q7.c
            public final Object LIZ(int i) {
                C19878412q6<E> c19878412q6 = this.LLILZIL.LLILLL;
                C19864312np.LJFF(i, c19878412q6.LIZJ);
                return new C19879512qH(c19878412q6, i);
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        C19878412q6<E> c19878412q6 = this.LLILLL;
        c19878412q6.LIZLLL++;
        Arrays.fill(c19878412q6.LIZ, 0, c19878412q6.LIZJ, (Object) null);
        Arrays.fill(c19878412q6.LIZIZ, 0, c19878412q6.LIZJ, 0);
        Arrays.fill(c19878412q6.LJ, -1);
        Arrays.fill(c19878412q6.LJFF, -1L);
        c19878412q6.LIZJ = 0;
        this.LLILZ = 0L;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        final Iterator<InterfaceC19878012q2<E>> it2 = entrySet().iterator();
        return new Iterator<E>(this, it2) { // from class: X.12qA
            public final InterfaceC19879212qE<E> LL;
            public final Iterator<InterfaceC19878012q2<E>> LLILLJJLI;
            public InterfaceC19878012q2<E> LLILLL;
            public int LLILZ;
            public int LLILZIL;
            public boolean LLILZLL;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.LLILZ > 0 || this.LLILLJJLI.hasNext();
            }

            @Override // java.util.Iterator
            public final void remove() {
                C19863912nl.LIZJ(this.LLILZLL);
                if (this.LLILZIL == 1) {
                    this.LLILLJJLI.remove();
                } else {
                    InterfaceC19879212qE<E> interfaceC19879212qE = this.LL;
                    InterfaceC19878012q2<E> interfaceC19878012q2 = this.LLILLL;
                    Objects.requireNonNull(interfaceC19878012q2);
                    interfaceC19879212qE.remove(interfaceC19878012q2.getElement());
                }
                this.LLILZIL--;
                this.LLILZLL = false;
            }

            @Override // java.util.Iterator
            public final E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                if (this.LLILZ == 0) {
                    InterfaceC19878012q2<E> next = this.LLILLJJLI.next();
                    this.LLILLL = next;
                    int count = next.getCount();
                    this.LLILZ = count;
                    this.LLILZIL = count;
                }
                this.LLILZ--;
                this.LLILZLL = true;
                InterfaceC19878012q2<E> interfaceC19878012q2 = this.LLILLL;
                Objects.requireNonNull(interfaceC19878012q2);
                return interfaceC19878012q2.getElement();
            }

            {
                this.LL = this;
                this.LLILLJJLI = it2;
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC19879212qE
    public final int size() {
        return C19881312qZ.LIZIZ(this.LLILZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        this.LLILLL = LJIIIIZZ();
        for (int i2 = 0; i2 < i; i2++) {
            add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(entrySet().size());
        for (InterfaceC19878012q2<E> interfaceC19878012q2 : entrySet()) {
            objectOutputStream.writeObject(interfaceC19878012q2.getElement());
            objectOutputStream.writeInt(interfaceC19878012q2.getCount());
        }
    }

    @Override // X.InterfaceC19879212qE
    public final int count(Object obj) {
        C19878412q6<E> c19878412q6 = this.LLILLL;
        int iLIZJ = c19878412q6.LIZJ(obj);
        if (iLIZJ == -1) {
            return 0;
        }
        return c19878412q6.LIZIZ[iLIZJ];
    }

    @Override // X.AbstractC19878612q8, X.InterfaceC19879212qE
    public final int add(E e, int i) {
        if (i == 0) {
            return count(e);
        }
        if (i > 0) {
            int iLIZJ = this.LLILLL.LIZJ(e);
            if (iLIZJ == -1) {
                this.LLILLL.LJ(i, e);
                this.LLILZ += (long) i;
                return 0;
            }
            int iLIZIZ = this.LLILLL.LIZIZ(iLIZJ);
            long j = i;
            long j2 = ((long) iLIZIZ) + j;
            if (j2 <= 2147483647L) {
                C19878412q6<E> c19878412q6 = this.LLILLL;
                C19864312np.LJFF(iLIZJ, c19878412q6.LIZJ);
                c19878412q6.LIZIZ[iLIZJ] = (int) j2;
                this.LLILZ += j;
                return iLIZIZ;
            }
            throw new IllegalArgumentException(C08KM.LIZ("too many occurrences: %s", Long.valueOf(j2)));
        }
        throw new IllegalArgumentException(C08KM.LIZ("occurrences cannot be negative: %s", Integer.valueOf(i)));
    }

    @Override // X.AbstractC19878612q8, X.InterfaceC19879212qE
    public final int remove(Object obj, int i) {
        if (i == 0) {
            return count(obj);
        }
        if (i > 0) {
            int iLIZJ = this.LLILLL.LIZJ(obj);
            if (iLIZJ == -1) {
                return 0;
            }
            int iLIZIZ = this.LLILLL.LIZIZ(iLIZJ);
            if (iLIZIZ > i) {
                C19878412q6<E> c19878412q6 = this.LLILLL;
                C19864312np.LJFF(iLIZJ, c19878412q6.LIZJ);
                c19878412q6.LIZIZ[iLIZJ] = iLIZIZ - i;
            } else {
                this.LLILLL.LJI(iLIZJ);
                i = iLIZIZ;
            }
            this.LLILZ -= (long) i;
            return iLIZIZ;
        }
        throw new IllegalArgumentException(C08KM.LIZ("occurrences cannot be negative: %s", Integer.valueOf(i)));
    }

    @Override // X.AbstractC19878612q8, X.InterfaceC19879212qE
    public final int setCount(E e, int i) {
        C19863912nl.LIZIZ(0, "count");
        C19878412q6<E> c19878412q6 = this.LLILLL;
        c19878412q6.getClass();
        int iLJFF = c19878412q6.LJFF(e, C19876812pq.LIZIZ(e));
        this.LLILZ += (long) (-iLJFF);
        return iLJFF;
    }

    @Override // X.AbstractC19878612q8, X.InterfaceC19879212qE
    public final boolean setCount(E e, int i, int i2) {
        C19863912nl.LIZIZ(i, "oldCount");
        C19863912nl.LIZIZ(0, "newCount");
        int iLIZJ = this.LLILLL.LIZJ(e);
        if (iLIZJ == -1) {
            if (i != 0) {
                return false;
            }
            return true;
        }
        if (this.LLILLL.LIZIZ(iLIZJ) != i) {
            return false;
        }
        this.LLILLL.LJI(iLIZJ);
        this.LLILZ -= (long) i;
        return true;
    }
}
