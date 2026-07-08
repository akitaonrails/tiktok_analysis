package X;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: renamed from: X.12q5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19878312q5<E> extends AbstractC19878112q3<E> {
    public static final C19878312q5<Object> LLIZ = new C19878312q5<>(new C19878412q6());
    public final transient C19878412q6<E> LLILZ;
    public final transient int LLILZIL;
    public transient C19879412qG LLILZLL;

    @Override // X.AbstractC19875812pg
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // X.AbstractC19878112q3, X.InterfaceC19879212qE
    public final AbstractC19875112pZ<E> elementSet() {
        C19879412qG c19879412qG = this.LLILZLL;
        if (c19879412qG != null) {
            return c19879412qG;
        }
        AbstractC19869612og<E> abstractC19869612og = new AbstractC19869612og<E>() { // from class: X.12qG
            @Override // X.AbstractC19875812pg
            public final boolean LJIIIZ() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return this.LLILLL.LLILZ.LIZJ;
            }

            @Override // X.AbstractC19875812pg, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return this.LLILLL.contains(obj);
            }

            @Override // X.AbstractC19869612og
            public final E get(int i) {
                C19878412q6<E> c19878412q6 = this.LLILLL.LLILZ;
                C19864312np.LJFF(i, c19878412q6.LIZJ);
                return (E) c19878412q6.LIZ[i];
            }
        };
        this.LLILZLL = abstractC19869612og;
        return abstractC19869612og;
    }

    @Override // X.AbstractC19878112q3, X.AbstractC19875812pg
    public Object writeReplace() {
        return new Serializable(this) { // from class: X.12q9
            public static final long serialVersionUID = 0;
            public final Object[] LL;
            public final int[] LLILLJJLI;

            public Object readResolve() {
                C19878212q4 c19878212q4 = new C19878212q4(this.LL.length);
                int i = 0;
                while (true) {
                    Object[] objArr = this.LL;
                    if (i >= objArr.length) {
                        return c19878212q4.LJFF();
                    }
                    c19878212q4.LJ(this.LLILLJJLI[i], objArr[i]);
                    i++;
                }
            }

            {
                int size = this.entrySet().size();
                this.LL = new Object[size];
                this.LLILLJJLI = new int[size];
                int i = 0;
                for (InterfaceC19878012q2<? extends Object> interfaceC19878012q2 : this.entrySet()) {
                    this.LL[i] = interfaceC19878012q2.getElement();
                    this.LLILLJJLI[i] = interfaceC19878012q2.getCount();
                    i++;
                }
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC19879212qE
    public final int size() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC19878112q3, X.InterfaceC19879212qE
    public final /* bridge */ /* synthetic */ Set elementSet() {
        return elementSet();
    }

    public C19878312q5(C19878412q6<E> c19878412q6) {
        this.LLILZ = c19878412q6;
        long jLIZIZ = 0;
        for (int i = 0; i < c19878412q6.LIZJ; i++) {
            jLIZIZ += (long) c19878412q6.LIZIZ(i);
        }
        this.LLILZIL = C19881312qZ.LIZIZ(jLIZIZ);
    }

    @Override // X.AbstractC19878112q3
    public final InterfaceC19878012q2<E> LJIIJJI(int i) {
        C19878412q6<E> c19878412q6 = this.LLILZ;
        C19864312np.LJFF(i, c19878412q6.LIZJ);
        return new C19879512qH(c19878412q6, i);
    }

    @Override // X.AbstractC19878112q3, X.InterfaceC19879212qE
    public final int count(Object obj) {
        C19878412q6<E> c19878412q6 = this.LLILZ;
        int iLIZJ = c19878412q6.LIZJ(obj);
        if (iLIZJ == -1) {
            return 0;
        }
        return c19878412q6.LIZIZ[iLIZJ];
    }
}
