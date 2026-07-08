package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13EY, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13EY<K, V> implements C13YP, Map<K, V>, InterfaceC2095908Iz {
    public C13EZ LL;
    public final C19976213Ea LLILLJJLI;
    public final C19976413Ec LLILLL;
    public final C19976313Eb LLILZ;

    @Override // X.C13YP
    public final /* synthetic */ AbstractC19977113Ej LJIILIIL(AbstractC19977113Ej abstractC19977113Ej, AbstractC19977113Ej abstractC19977113Ej2, AbstractC19977113Ej abstractC19977113Ej3) {
        return null;
    }

    public final C13EZ<K, V> LIZJ() {
        return (C13EZ) C13YE.LJIJI(this.LL, this);
    }

    @Override // java.util.Map
    public final void clear() {
        C13YG c13ygLJIIIZ;
        InterfaceC19973113Cv<K, ? extends V> interfaceC19973113Cv = ((C13EZ) C13YE.LJII(this.LL)).LIZJ;
        C19971313Cd c19971313Cd = C19971313Cd.LLILZ;
        if (c19971313Cd != interfaceC19973113Cv) {
            C13EZ c13ez = this.LL;
            synchronized (C13YE.LIZJ) {
                try {
                    c13ygLJIIIZ = C13YE.LJIIIZ();
                    LIZIZ((C13EZ) C13YE.LJIL(c13ez, this, c13ygLJIIIZ), c19971313Cd);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C13YE.LJIILIIL(c13ygLJIIIZ, this);
        }
    }

    public final String toString() {
        C13EZ c13ez = (C13EZ) C13YE.LJII(this.LL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SnapshotStateMap(value=");
        sbLIZ.append(c13ez.LIZJ);
        sbLIZ.append(")@");
        sbLIZ.append(hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C13EY() {
        C19971313Cd c19971313Cd = C19971313Cd.LLILZ;
        C13YG c13ygLJIIIZ = C13YE.LJIIIZ();
        C13EZ c13ez = new C13EZ(c13ygLJIIIZ.LJI(), c19971313Cd);
        if (!(c13ygLJIIIZ instanceof C13YB)) {
            c13ez.LIZIZ = new C13EZ(1, c19971313Cd);
        }
        this.LL = c13ez;
        this.LLILLJJLI = new C19976213Ea(this);
        this.LLILLL = new AbstractC1687480u0w<K, V, K>(this) { // from class: X.13Ec
            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            public final Iterator iterator() {
                C13EY<K, V> c13ey = this.LL;
                return new C19976813Eg(c13ey, c13ey.LIZJ().LIZJ.entrySet().iterator());
            }

            {
                super(this);
            }

            @Override // java.util.Set, java.util.Collection
            public final boolean add(Object obj) {
                C19977013Ei.LIZ();
                throw null;
            }

            @Override // java.util.Set, java.util.Collection
            public final boolean addAll(Collection collection) {
                C19977013Ei.LIZ();
                throw null;
            }

            @Override // java.util.Set, java.util.Collection
            public final boolean contains(Object obj) {
                return this.LL.containsKey(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public final boolean containsAll(Collection<? extends Object> collection) {
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator<T> it2 = collection.iterator();
                    while (it2.hasNext()) {
                        if (!this.LL.containsKey(it2.next())) {
                            return false;
                        }
                    }
                }
                return true;
            }

            @Override // java.util.Set, java.util.Collection
            public final boolean remove(Object obj) {
                if (this.LL.remove(obj) != null) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Set, java.util.Collection
            public final boolean removeAll(Collection<? extends Object> collection) {
                Iterator<T> it2 = collection.iterator();
                while (true) {
                    boolean z = false;
                    while (it2.hasNext()) {
                        if (this.LL.remove(it2.next()) != null || z) {
                            z = true;
                        }
                    }
                    return z;
                }
            }

            @Override // java.util.Set, java.util.Collection
            public final boolean retainAll(Collection<? extends Object> collection) {
                InterfaceC19973113Cv<K, ? extends V> interfaceC19973113Cv;
                int i;
                C13YG c13ygLJIIIZ2;
                boolean zLIZ;
                Set setLLIIJI = C13LP.LLIIJI(collection);
                C13EY<K, V> c13ey = this.LL;
                boolean z = false;
                do {
                    synchronized (C19977013Ei.LIZ) {
                        try {
                            C13EZ c13ez2 = (C13EZ) C13YE.LJII(c13ey.LL);
                            interfaceC19973113Cv = c13ez2.LIZJ;
                            i = c13ez2.LIZLLL;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    C13D3<K, ? extends V> c13d3Builder = interfaceC19973113Cv.builder();
                    Object it2 = c13ey.LLILLJJLI.iterator();
                    while (((AbstractC19976613Ee) it2).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((C19976713Ef) it2).next();
                        if (!setLLIIJI.contains(entry.getKey())) {
                            c13d3Builder.remove(entry.getKey());
                            z = true;
                        }
                    }
                    InterfaceC19973113Cv<K, ? extends V> interfaceC19973113CvBuild = c13d3Builder.build();
                    if (Intrinsics.LJFF(interfaceC19973113CvBuild, interfaceC19973113Cv)) {
                        break;
                    }
                    C13EZ c13ez3 = c13ey.LL;
                    synchronized (C13YE.LIZJ) {
                        try {
                            c13ygLJIIIZ2 = C13YE.LJIIIZ();
                            zLIZ = C13EY.LIZ(c13ey, (C13EZ) C13YE.LJIL(c13ez3, c13ey, c13ygLJIIIZ2), i, interfaceC19973113CvBuild);
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    C13YE.LJIILIIL(c13ygLJIIIZ2, c13ey);
                } while (!zLIZ);
                return z;
            }
        };
        this.LLILZ = new C19976313Eb(this);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return LIZJ().LIZJ.isEmpty();
    }

    @Override // java.util.Map
    public final int size() {
        return LIZJ().LIZJ.size();
    }

    @Override // X.C13YP
    public final AbstractC19977113Ej LJIIZILJ() {
        return this.LL;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return this.LLILLJJLI;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return this.LLILLL;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return this.LLILZ;
    }

    @Override // X.C13YP
    public final void LJIIL(AbstractC19977113Ej abstractC19977113Ej) {
        this.LL = (C13EZ) abstractC19977113Ej;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return LIZJ().LIZJ.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return LIZJ().LIZJ.containsValue(obj);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return LIZJ().LIZJ.get(obj);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        InterfaceC19973113Cv<K, ? extends V> interfaceC19973113Cv;
        int i;
        C13YG c13ygLJIIIZ;
        boolean zLIZ;
        do {
            synchronized (C19977013Ei.LIZ) {
                try {
                    C13EZ c13ez = (C13EZ) C13YE.LJII(this.LL);
                    interfaceC19973113Cv = c13ez.LIZJ;
                    i = c13ez.LIZLLL;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C13D3<K, ? extends V> c13d3Builder = interfaceC19973113Cv.builder();
            c13d3Builder.putAll(map);
            InterfaceC19973113Cv<K, ? extends V> interfaceC19973113CvBuild = c13d3Builder.build();
            if (!Intrinsics.LJFF(interfaceC19973113CvBuild, interfaceC19973113Cv)) {
                C13EZ c13ez2 = this.LL;
                synchronized (C13YE.LIZJ) {
                    try {
                        c13ygLJIIIZ = C13YE.LJIIIZ();
                        zLIZ = LIZ(this, (C13EZ) C13YE.LJIL(c13ez2, this, c13ygLJIIIZ), i, interfaceC19973113CvBuild);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
                C13YE.LJIILIIL(c13ygLJIIIZ, this);
            } else {
                return;
            }
        } while (!zLIZ);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        InterfaceC19973113Cv<K, ? extends V> interfaceC19973113Cv;
        int i;
        V vRemove;
        C13YG c13ygLJIIIZ;
        boolean zLIZ;
        do {
            synchronized (C19977013Ei.LIZ) {
                try {
                    C13EZ c13ez = (C13EZ) C13YE.LJII(this.LL);
                    interfaceC19973113Cv = c13ez.LIZJ;
                    i = c13ez.LIZLLL;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C13D3<K, ? extends V> c13d3Builder = interfaceC19973113Cv.builder();
            vRemove = c13d3Builder.remove(obj);
            InterfaceC19973113Cv<K, ? extends V> interfaceC19973113CvBuild = c13d3Builder.build();
            if (Intrinsics.LJFF(interfaceC19973113CvBuild, interfaceC19973113Cv)) {
                break;
            }
            C13EZ c13ez2 = this.LL;
            synchronized (C13YE.LIZJ) {
                try {
                    c13ygLJIIIZ = C13YE.LJIIIZ();
                    zLIZ = LIZ(this, (C13EZ) C13YE.LJIL(c13ez2, this, c13ygLJIIIZ), i, interfaceC19973113CvBuild);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
            C13YE.LJIILIIL(c13ygLJIIIZ, this);
        } while (!zLIZ);
        return vRemove;
    }

    public static void LIZIZ(C13EZ c13ez, C19971313Cd c19971313Cd) {
        synchronized (C19977013Ei.LIZ) {
            try {
                c13ez.LIZJ = c19971313Cd;
                c13ez.LIZLLL++;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        InterfaceC19973113Cv<K, ? extends V> interfaceC19973113Cv;
        int i;
        V vPut;
        C13YG c13ygLJIIIZ;
        boolean zLIZ;
        do {
            synchronized (C19977013Ei.LIZ) {
                try {
                    C13EZ c13ez = (C13EZ) C13YE.LJII(this.LL);
                    interfaceC19973113Cv = c13ez.LIZJ;
                    i = c13ez.LIZLLL;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C13D3<K, ? extends V> c13d3Builder = interfaceC19973113Cv.builder();
            vPut = c13d3Builder.put(k, v);
            InterfaceC19973113Cv<K, ? extends V> interfaceC19973113CvBuild = c13d3Builder.build();
            if (Intrinsics.LJFF(interfaceC19973113CvBuild, interfaceC19973113Cv)) {
                break;
            }
            C13EZ c13ez2 = this.LL;
            synchronized (C13YE.LIZJ) {
                try {
                    c13ygLJIIIZ = C13YE.LJIIIZ();
                    zLIZ = LIZ(this, (C13EZ) C13YE.LJIL(c13ez2, this, c13ygLJIIIZ), i, interfaceC19973113CvBuild);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
            C13YE.LJIILIIL(c13ygLJIIIZ, this);
        } while (!zLIZ);
        return vPut;
    }

    public static final boolean LIZ(C13EY c13ey, C13EZ c13ez, int i, InterfaceC19973113Cv interfaceC19973113Cv) {
        boolean z;
        c13ey.getClass();
        synchronized (C19977013Ei.LIZ) {
            try {
                int i2 = c13ez.LIZLLL;
                if (i2 == i) {
                    c13ez.LIZJ = interfaceC19973113Cv;
                    z = true;
                    c13ez.LIZLLL = i2 + 1;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }
}
