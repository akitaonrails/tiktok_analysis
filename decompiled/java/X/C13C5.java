package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS318S0000000_30;

/* JADX INFO: renamed from: X.13C5, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13C5<K, V> extends AbstractC19969013Bg<K, V> implements InterfaceC2091408Hg<K, V> {
    public static final C13C5 LLILZ = new C13C5(C13CU.LJ, 0);
    public final C13CU<K, V> LLILLJJLI;
    public final int LLILLL;

    @Override // X.AbstractC19969013Bg
    public final Set<Map.Entry<K, V>> LIZJ() {
        return new C19970613Bw(this);
    }

    @Override // X.AbstractC19969013Bg
    public final Set LIZLLL() {
        return new C19970713Bx(this);
    }

    @Override // X.AbstractC19969013Bg
    public final Collection LJFF() {
        return new AbstractC2253808sK<V>(this) { // from class: X.13By
            public final C13C5<K, V> LL;

            @Override // X.AbstractC2253808sK
            public final int LIZJ() {
                return this.LL.LJ();
            }

            @Override // java.util.Collection, java.lang.Iterable
            public final Iterator<V> iterator() {
                final C13CU<K, V> c13cu = this.LL.LLILLJJLI;
                return new AbstractC19977513En<K, V, V>(c13cu) { // from class: X.13Ev
                    {
                        AbstractC19977713Ep[] abstractC19977713EpArr = new AbstractC19977713Ep[8];
                        int i = 0;
                        do {
                            abstractC19977713EpArr[i] = new C19978613Ey();
                            i++;
                        } while (i < 8);
                    }
                };
            }

            {
                this.LL = this;
            }

            @Override // X.AbstractC2253808sK, java.util.Collection
            public final boolean contains(Object obj) {
                return this.LL.containsValue(obj);
            }
        };
    }

    @Override // X.AbstractC19969013Bg, java.util.Map
    public final int hashCode() {
        return super.hashCode();
    }

    @Override // X.AbstractC19969013Bg
    public final int LJ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC19969013Bg, java.util.Map
    public final boolean containsKey(Object obj) {
        int iHashCode;
        C13CU<K, V> c13cu = this.LLILLJJLI;
        if (obj == null) {
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
        }
        return c13cu.LIZLLL(iHashCode, 0, obj);
    }

    @Override // X.AbstractC19969013Bg, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (LJ() != map.size()) {
            return false;
        }
        if (map instanceof C13C4) {
            return this.LLILLJJLI.LJI(((C13C4) obj).LLILZ.LLILLJJLI, AFwS318S0000000_30.get$arr$(21));
        }
        if (map instanceof C13CE) {
            return this.LLILLJJLI.LJI(((C13CE) obj).LLILZ.LLILLL, AFwS318S0000000_30.get$arr$(22));
        }
        if (map instanceof C13C5) {
            return this.LLILLJJLI.LJI(((C13C5) obj).LLILLJJLI, AFwS318S0000000_30.get$arr$(23));
        }
        if (map instanceof C13CF) {
            return this.LLILLJJLI.LJI(((C13CF) obj).LLILLL, AFwS318S0000000_30.get$arr$(24));
        }
        return super.equals(obj);
    }

    @Override // X.AbstractC19969013Bg, java.util.Map
    public final V get(Object obj) {
        int iHashCode;
        C13CU<K, V> c13cu = this.LLILLJJLI;
        if (obj == null) {
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
        }
        return (V) c13cu.LJII(iHashCode, 0, obj);
    }

    public C13C5(C13CU<K, V> c13cu, int i) {
        this.LLILLJJLI = c13cu;
        this.LLILLL = i;
    }
}
