package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.13Cd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19971313Cd<K, V> extends AbstractC19969013Bg<K, V> implements InterfaceC19973113Cv<K, V> {
    public static final C19971313Cd LLILZ = new C19971313Cd(C19971213Cc.LJ, 0);
    public final C19971213Cc<K, V> LLILLJJLI;
    public final int LLILLL;

    @Override // X.AbstractC19969013Bg
    public final Set<Map.Entry<K, V>> LIZJ() {
        return new C19971513Cf(this);
    }

    @Override // X.AbstractC19969013Bg
    public final Set LIZLLL() {
        return new C19971613Cg(this);
    }

    @Override // X.AbstractC19969013Bg
    public final Collection LJFF() {
        return new AbstractC2253808sK<V>(this) { // from class: X.13Ch
            public final C19971313Cd<K, V> LL;

            @Override // X.AbstractC2253808sK
            public final int LIZJ() {
                return this.LL.size();
            }

            @Override // java.util.Collection, java.lang.Iterable
            public final Iterator<V> iterator() {
                final C19971213Cc<K, V> c19971213Cc = this.LL.LLILLJJLI;
                return new C13F0<K, V, V>(c19971213Cc) { // from class: X.13F9
                    {
                        C13F3[] c13f3Arr = new C13F3[8];
                        int i = 0;
                        do {
                            c13f3Arr[i] = new C13FC();
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

    @Override // X.InterfaceC19973113Cv
    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
    public C19971113Cb<K, V> builder() {
        return new C19971113Cb<>(this);
    }

    @Override // X.AbstractC19969013Bg
    public final int LJ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC19969013Bg, java.util.Map
    public boolean containsKey(K k) {
        int iHashCode;
        C19971213Cc<K, V> c19971213Cc = this.LLILLJJLI;
        if (k != null) {
            iHashCode = k.hashCode();
        } else {
            iHashCode = 0;
        }
        return c19971213Cc.LIZLLL(iHashCode, 0, k);
    }

    @Override // X.AbstractC19969013Bg, java.util.Map
    public V get(K k) {
        int iHashCode;
        C19971213Cc<K, V> c19971213Cc = this.LLILLJJLI;
        if (k != null) {
            iHashCode = k.hashCode();
        } else {
            iHashCode = 0;
        }
        return (V) c19971213Cc.LJI(iHashCode, 0, k);
    }

    public C19971313Cd(C19971213Cc<K, V> c19971213Cc, int i) {
        this.LLILLJJLI = c19971213Cc;
        this.LLILLL = i;
    }

    public final C19971313Cd LJIIIIZZ(Object obj, C19972313Cn c19972313Cn) {
        int iHashCode;
        C19971213Cc<K, V> c19971213Cc = this.LLILLJJLI;
        if (obj != null) {
            iHashCode = obj.hashCode();
        } else {
            iHashCode = 0;
        }
        C19972013Ck c19972013CkLJIJJ = c19971213Cc.LJIJJ(iHashCode, 0, obj, c19972313Cn);
        if (c19972013CkLJIJJ == null) {
            return this;
        }
        return new C19971313Cd(c19972013CkLJIJJ.LIZ, size() + c19972013CkLJIJJ.LIZIZ);
    }
}
