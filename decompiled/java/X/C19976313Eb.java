package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Eb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19976313Eb<K, V> extends AbstractC1687480u0w<K, V, V> {
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C13EY<K, V> c13ey = this.LL;
        return new C19976913Eh(c13ey, c13ey.LIZJ().LIZJ.entrySet().iterator());
    }

    public C19976313Eb(C13EY<K, V> c13ey) {
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
        return this.LL.containsValue(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!this.LL.containsValue(it2.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object next;
        C13EY<K, V> c13ey = this.LL;
        Object it2 = c13ey.LLILLJJLI.iterator();
        while (true) {
            if (((AbstractC19976613Ee) it2).hasNext()) {
                next = ((C19976713Ef) it2).next();
                if (Intrinsics.LJFF(((Map.Entry) next).getValue(), obj)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            c13ey.remove(entry.getKey());
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        InterfaceC19973113Cv<K, ? extends V> interfaceC19973113Cv;
        int i;
        C13YG c13ygLJIIIZ;
        boolean zLIZ;
        Set setLLIIJI = C13LP.LLIIJI(collection);
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
            Object it2 = c13ey.LLILLJJLI.iterator();
            while (((AbstractC19976613Ee) it2).hasNext()) {
                Map.Entry entry = (Map.Entry) ((C19976713Ef) it2).next();
                if (setLLIIJI.contains(entry.getValue())) {
                    c13d3Builder.remove(entry.getKey());
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

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        InterfaceC19973113Cv<K, ? extends V> interfaceC19973113Cv;
        int i;
        C13YG c13ygLJIIIZ;
        boolean zLIZ;
        Set setLLIIJI = C13LP.LLIIJI(collection);
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
            Object it2 = c13ey.LLILLJJLI.iterator();
            while (((AbstractC19976613Ee) it2).hasNext()) {
                Map.Entry entry = (Map.Entry) ((C19976713Ef) it2).next();
                if (!setLLIIJI.contains(entry.getValue())) {
                    c13d3Builder.remove(entry.getKey());
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
