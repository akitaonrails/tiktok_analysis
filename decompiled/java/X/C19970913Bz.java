package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AFwS318S0000000_30;

/* JADX INFO: renamed from: X.13Bz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19970913Bz<E> extends AbstractC19969413Bk<E> implements InterfaceC1687460u0u<E> {
    public static final C19970913Bz LLILZIL;
    public final Object LLILLJJLI;
    public final Object LLILLL;
    public final C13C5<E, C13C1> LLILZ;

    static {
        C13C3 c13c3 = C13C3.LIZ;
        LLILZIL = new C19970913Bz(c13c3, c13c3, C13C5.LLILZ);
    }

    @Override // X.AbstractC2253808sK
    public final int LIZJ() {
        return this.LLILZ.LJ();
    }

    @Override // X.AbstractC19969413Bk, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new C19968713Bd(this.LLILLJJLI, this.LLILZ);
    }

    @Override // X.AbstractC19969413Bk, java.util.Collection, java.util.Set
    public final int hashCode() {
        return super.hashCode();
    }

    public final InterfaceC1687460u0u<E> LJ(Collection<? extends E> collection) {
        C13C0 c13c0 = new C13C0(this);
        c13c0.addAll(collection);
        return c13c0.build();
    }

    @Override // X.AbstractC2253808sK, java.util.Collection
    public final boolean contains(Object obj) {
        return this.LLILZ.containsKey(obj);
    }

    @Override // X.AbstractC19969413Bk, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (LIZJ() != set.size()) {
            return false;
        }
        if (set instanceof C19970913Bz) {
            return this.LLILZ.LLILLJJLI.LJI(((C19970913Bz) obj).LLILZ.LLILLJJLI, AFwS318S0000000_30.get$arr$(37));
        }
        if (set instanceof C13C0) {
            return this.LLILZ.LLILLJJLI.LJI(((C13C0) obj).LLILZ.LLILLL, AFwS318S0000000_30.get$arr$(38));
        }
        return super.equals(obj);
    }

    public C19970913Bz(Object obj, Object obj2, C13C5<E, C13C1> c13c5) {
        this.LLILLJJLI = obj;
        this.LLILLL = obj2;
        this.LLILZ = c13c5;
    }
}
