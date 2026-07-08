package X;

import Y.ARunnableS25S1100000_20;
import android.util.LruCache;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kcy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1326660kcy {
    public static long LIZIZ;
    public static final C1326660kcy LIZ = new C1326660kcy();
    public static final LruCache<String, CopyOnWriteArrayList<C1326670kcz>> LIZJ = new LruCache<>(10);

    public static void LIZJ(String str) {
        C1507890pLH c1507890pLHLIZ;
        CopyOnWriteArrayList<C1326670kcz> copyOnWriteArrayListRemove = LIZJ.remove(str);
        if (copyOnWriteArrayListRemove != null) {
            for (C1326670kcz c1326670kcz : copyOnWriteArrayListRemove) {
                String str2 = c1326670kcz.LIZIZ;
                if (str2 != null && (c1507890pLHLIZ = C1507890pLH.LIZJ.LIZ()) != null) {
                    C1507970pLP c1507970pLP = c1507890pLHLIZ.LIZIZ;
                    c1507970pLP.LIZIZ.submit(new ARunnableS25S1100000_20(c1507970pLP, str2, 25));
                }
                InterfaceC1320200kSY<Object> interfaceC1320200kSY = c1326670kcz.LIZ;
                if (interfaceC1320200kSY != null) {
                    interfaceC1320200kSY.close();
                }
            }
        }
    }

    public final synchronized List<C1326670kcz> LJ(String str) {
        LruCache<String, CopyOnWriteArrayList<C1326670kcz>> lruCache = LIZJ;
        CopyOnWriteArrayList<C1326670kcz> copyOnWriteArrayList = lruCache.get(str);
        if (copyOnWriteArrayList == null) {
            CopyOnWriteArrayList<C1326670kcz> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            lruCache.put(str, copyOnWriteArrayList2);
            return copyOnWriteArrayList2;
        }
        return copyOnWriteArrayList;
    }

    public static C1326670kcz LJFF(List list, C1326670kcz c1326670kcz) {
        Object next;
        InterfaceC1320200kSY<Object> interfaceC1320200kSY;
        Long l;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C1326670kcz c1326670kcz2 = (C1326670kcz) next;
                String str = c1326670kcz.LIZIZ;
                if ((str != null && Intrinsics.LJFF(str, c1326670kcz2.LIZIZ)) || (((interfaceC1320200kSY = c1326670kcz.LIZ) != null && interfaceC1320200kSY == c1326670kcz2.LIZ) || ((l = c1326670kcz.LIZJ) != null && Intrinsics.LJFF(l, c1326670kcz2.LIZJ)))) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (C1326670kcz) next;
    }

    public final void LIZ(String str, InterfaceC1320200kSY<Object> interfaceC1320200kSY) {
        final List<C1326670kcz> listLJ = LJ(str);
        final C1326670kcz c1326670kczLIZLLL = LIZLLL(listLJ, new C1326670kcz(interfaceC1320200kSY, null, null, 6));
        interfaceC1320200kSY.LIZJ(new InterfaceC589510NAf<Object>() { // from class: X.0kcw
            @Override // X.InterfaceC589510NAf
            public final void LIZJ(AbstractC1321260kUG abstractC1321260kUG) {
            }

            @Override // X.InterfaceC589510NAf
            public final void LIZ(InterfaceC1320200kSY<Object> interfaceC1320200kSY2) {
                listLJ.remove(c1326670kczLIZLLL);
            }

            @Override // X.InterfaceC589510NAf
            public final void LIZIZ(InterfaceC1320200kSY<Object> interfaceC1320200kSY2) {
                listLJ.remove(c1326670kczLIZLLL);
            }

            @Override // X.InterfaceC589510NAf
            public final void LIZLLL(AbstractC1321260kUG abstractC1321260kUG) {
                listLJ.remove(c1326670kczLIZLLL);
            }
        }, C1326680kd0.LIZ);
    }

    public final void LIZIZ(String str, String str2) {
        LIZLLL(LJ(str), new C1326670kcz(null, str2, null, 5));
    }

    public final synchronized C1326670kcz LIZLLL(List<C1326670kcz> list, C1326670kcz c1326670kcz) {
        C1326670kcz c1326670kczLJFF = LJFF(list, c1326670kcz);
        if (c1326670kczLJFF == null) {
            list.add(c1326670kcz);
            return c1326670kcz;
        }
        return c1326670kczLJFF;
    }
}
