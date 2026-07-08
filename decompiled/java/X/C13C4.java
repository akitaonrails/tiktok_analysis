package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS318S0000000_30;

/* JADX INFO: renamed from: X.13C4, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13C4<K, V> extends AbstractC19969013Bg<K, V> implements InterfaceC2091408Hg<K, V> {
    public static final C13C4 LLILZIL;
    public final Object LLILLJJLI;
    public final Object LLILLL;
    public final C13C5<K, C13CR<V>> LLILZ;

    static {
        C13C3 c13c3 = C13C3.LIZ;
        LLILZIL = new C13C4(c13c3, c13c3, C13C5.LLILZ);
    }

    @Override // X.AbstractC19969013Bg
    public final Set<Map.Entry<K, V>> LIZJ() {
        return new C19970513Bv(this);
    }

    @Override // X.AbstractC19969013Bg
    public final Set LIZLLL() {
        return new C19970413Bu(this);
    }

    @Override // X.AbstractC19969013Bg
    public final int LJ() {
        return this.LLILZ.LJ();
    }

    @Override // X.AbstractC19969013Bg
    public final Collection LJFF() {
        return new AbstractC2253808sK<V>(this) { // from class: X.13Bt
            public final C13C4<K, V> LL;

            @Override // X.AbstractC2253808sK
            public final int LIZJ() {
                return this.LL.LJ();
            }

            @Override // java.util.Collection, java.lang.Iterable
            public final Iterator<V> iterator() {
                return new C13C8(this.LL);
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

    @Override // X.AbstractC19969013Bg, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.LLILZ.containsKey(obj);
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
            return this.LLILZ.LLILLJJLI.LJI(((C13C4) obj).LLILZ.LLILLJJLI, AFwS318S0000000_30.get$arr$(29));
        }
        if (map instanceof C13CE) {
            return this.LLILZ.LLILLJJLI.LJI(((C13CE) obj).LLILZ.LLILLL, AFwS318S0000000_30.get$arr$(30));
        }
        if (map instanceof C13C5) {
            return this.LLILZ.LLILLJJLI.LJI(((C13C5) obj).LLILLJJLI, AFwS318S0000000_30.get$arr$(31));
        }
        if (map instanceof C13CF) {
            return this.LLILZ.LLILLJJLI.LJI(((C13CF) obj).LLILLL, AFwS318S0000000_30.get$arr$(32));
        }
        return super.equals(obj);
    }

    @Override // X.AbstractC19969013Bg, java.util.Map
    public final V get(Object obj) {
        C13CR<V> c13cr = this.LLILZ.get(obj);
        if (c13cr == null) {
            return null;
        }
        return c13cr.LIZ;
    }

    public C13C4(Object obj, Object obj2, C13C5<K, C13CR<V>> c13c5) {
        this.LLILLJJLI = obj;
        this.LLILLL = obj2;
        this.LLILZ = c13c5;
    }
}
