package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Ea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19976213Ea<K, V> extends AbstractC1687480u0w<K, V, Map.Entry<K, V>> {
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        C13EY<K, V> c13ey = this.LL;
        return new C19976713Ef(c13ey, c13ey.LIZJ().LIZJ.entrySet().iterator());
    }

    public C19976213Ea(C13EY<K, V> c13ey) {
        super(c13ey);
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
        if (!(obj instanceof Map.Entry) || ((obj instanceof C03W4) && !(obj instanceof C08J0))) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return Intrinsics.LJFF(this.LL.get(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!contains(it2.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        if ((obj instanceof Map.Entry) && ((!(obj instanceof C03W4) || (obj instanceof C08J0)) && this.LL.remove(((Map.Entry) obj).getKey()) != null)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        Iterator<? extends Object> it2 = collection.iterator();
        while (true) {
            boolean z = false;
            while (it2.hasNext()) {
                if (this.LL.remove(((Map.Entry) it2.next()).getKey()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        InterfaceC19973113Cv<K, ? extends V> interfaceC19973113Cv;
        int i;
        C13YG c13ygLJIIIZ;
        boolean zLIZ;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(collection, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Pair pair = new Pair(entry.getKey(), entry.getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        C13EY<K, V> c13ey = this.LL;
        boolean z = false;
        do {
            synchronized (C19977013Ei.LIZ) {
                try {
                    C13EZ c13ez = (C13EZ) C13YE.LJII(c13ey.LL);
                    interfaceC19973113Cv = c13ez.LIZJ;
                    i = c13ez.LIZLLL;
                } catch (Throwable th) {
                    throw th;
                }
            }
            C13D3<K, ? extends V> c13d3Builder = interfaceC19973113Cv.builder();
            Object it3 = c13ey.LLILLJJLI.iterator();
            while (((AbstractC19976613Ee) it3).hasNext()) {
                Map.Entry entry2 = (Map.Entry) ((C19976713Ef) it3).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !Intrinsics.LJFF(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    c13d3Builder.remove(entry2.getKey());
                    z = true;
                }
            }
            InterfaceC19973113Cv<K, ? extends V> interfaceC19973113CvBuild = c13d3Builder.build();
            if (Intrinsics.LJFF(interfaceC19973113CvBuild, interfaceC19973113Cv)) {
                break;
            }
            C13EZ c13ez2 = c13ey.LL;
            synchronized (C13YE.LIZJ) {
                try {
                    c13ygLJIIIZ = C13YE.LJIIIZ();
                    zLIZ = C13EY.LIZ(c13ey, (C13EZ) C13YE.LJIL(c13ez2, c13ey, c13ygLJIIIZ), i, interfaceC19973113CvBuild);
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            C13YE.LJIILIIL(c13ygLJIIIZ, c13ey);
        } while (!zLIZ);
        return z;
    }
}
