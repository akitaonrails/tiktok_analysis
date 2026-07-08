package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.13Ce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19971413Ce<E> extends AbstractC19969413Bk<E> implements InterfaceC19972113Cl<E> {
    public static final C19971413Ce LLILZIL;
    public final Object LLILLJJLI;
    public final Object LLILLL;
    public final C19971313Cd<E, C19972313Cn> LLILZ;

    static {
        C19973013Cu c19973013Cu = C19973013Cu.LIZ;
        LLILZIL = new C19971413Ce(c19973013Cu, c19973013Cu, C19971313Cd.LLILZ);
    }

    @Override // X.AbstractC2253808sK
    public final int LIZJ() {
        return this.LLILZ.size();
    }

    @Override // X.AbstractC19969413Bk, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new C19968613Bc(this.LLILLJJLI, this.LLILZ);
    }

    @Override // X.InterfaceC19972113Cl
    public final C19971413Ce LJLJI(C20028013Xy c20028013Xy) {
        if (this.LLILZ.containsKey(c20028013Xy)) {
            return this;
        }
        if (isEmpty()) {
            return new C19971413Ce(c20028013Xy, c20028013Xy, this.LLILZ.LJIIIIZZ(c20028013Xy, new C19972313Cn()));
        }
        Object obj = this.LLILLL;
        C19972313Cn c19972313Cn = this.LLILZ.get(obj);
        C19971313Cd<E, C19972313Cn> c19971313Cd = this.LLILZ;
        c19972313Cn.getClass();
        return new C19971413Ce(this.LLILLJJLI, c20028013Xy, c19971313Cd.LJIIIIZZ(obj, new C19972313Cn(c19972313Cn.LIZ, c20028013Xy)).LJIIIIZZ(c20028013Xy, new C19972313Cn(obj, C19973013Cu.LIZ)));
    }

    @Override // X.AbstractC2253808sK, java.util.Collection
    public final boolean contains(Object obj) {
        return this.LLILZ.containsKey(obj);
    }

    @Override // java.util.Collection, java.util.Set, X.InterfaceC19972113Cl
    public final C19971413Ce remove(Object obj) {
        int iHashCode;
        Object obj2;
        C19972313Cn c19972313Cn = this.LLILZ.get(obj);
        if (c19972313Cn == null) {
            return this;
        }
        C19971313Cd<E, C19972313Cn> c19971313CdLJIIIIZZ = this.LLILZ;
        C19971213Cc<E, C19972313Cn> c19971213Cc = c19971313CdLJIIIIZZ.LLILLJJLI;
        if (obj != null) {
            iHashCode = obj.hashCode();
        } else {
            iHashCode = 0;
        }
        C19971213Cc<E, C19972313Cn> c19971213CcLJIJJLI = c19971213Cc.LJIJJLI(iHashCode, 0, obj);
        if (c19971313CdLJIIIIZZ.LLILLJJLI != c19971213CcLJIJJLI) {
            if (c19971213CcLJIJJLI == null) {
                c19971313CdLJIIIIZZ = C19971313Cd.LLILZ;
            } else {
                c19971313CdLJIIIIZZ = new C19971313Cd<>(c19971213CcLJIJJLI, c19971313CdLJIIIIZZ.size() - 1);
            }
        }
        Object obj3 = c19972313Cn.LIZ;
        C19973013Cu c19973013Cu = C19973013Cu.LIZ;
        if (obj3 != c19973013Cu) {
            C19972313Cn c19972313Cn2 = c19971313CdLJIIIIZZ.get(obj3);
            Object obj4 = c19972313Cn.LIZ;
            Object obj5 = c19972313Cn.LIZIZ;
            c19972313Cn2.getClass();
            c19971313CdLJIIIIZZ = c19971313CdLJIIIIZZ.LJIIIIZZ(obj4, new C19972313Cn(c19972313Cn2.LIZ, obj5));
        }
        Object obj6 = c19972313Cn.LIZIZ;
        if (obj6 != c19973013Cu) {
            c19971313CdLJIIIIZZ = c19971313CdLJIIIIZZ.LJIIIIZZ(c19972313Cn.LIZIZ, new C19972313Cn(c19972313Cn.LIZ, c19971313CdLJIIIIZZ.get(obj6).LIZIZ));
        }
        Object obj7 = c19972313Cn.LIZ;
        if (obj7 != c19973013Cu) {
            obj2 = this.LLILLJJLI;
        } else {
            obj2 = c19972313Cn.LIZIZ;
        }
        if (c19972313Cn.LIZIZ != c19973013Cu) {
            obj7 = this.LLILLL;
        }
        return new C19971413Ce(obj2, obj7, c19971313CdLJIIIIZZ);
    }

    public C19971413Ce(Object obj, Object obj2, C19971313Cd<E, C19972313Cn> c19971313Cd) {
        this.LLILLJJLI = obj;
        this.LLILLL = obj2;
        this.LLILZ = c19971313Cd;
    }
}
