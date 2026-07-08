package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1A8K, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A8K {
    public static final List<String> LIZ(C1A8M c1a8m) {
        List<C1A8N> listLJIIJJI = c1a8m.LJIIJJI();
        if (!(listLJIIJJI instanceof Collection) || !listLJIIJJI.isEmpty()) {
            Iterator<C1A8N> it2 = listLJIIJJI.iterator();
            while (it2.hasNext()) {
                if (!it2.next().LJIIJJI()) {
                    return C13BV.INSTANCE;
                }
            }
        }
        List<C1A8L> listLJIIIZ = c1a8m.LJIIIZ();
        ArrayList arrayList = new ArrayList();
        for (C1A8L c1a8l : listLJIIIZ) {
            C1A8L c1a8l2 = c1a8l;
            if ((!c1a8l2.LJ().isEmpty()) && !c1a8l2.LIZLLL().LJIIIIZZ()) {
                arrayList.add(c1a8l);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((C1A8L) it3.next()).LIZLLL().LJII());
        }
        return arrayList2;
    }

    public static final List<String> LIZIZ(C1A8M c1a8m) {
        List<C1A8N> listLJIIJJI = c1a8m.LJIIJJI();
        if (!(listLJIIJJI instanceof Collection) || !listLJIIJJI.isEmpty()) {
            Iterator<C1A8N> it2 = listLJIIJJI.iterator();
            while (it2.hasNext()) {
                if (!it2.next().LJIIJJI()) {
                    return C13BV.INSTANCE;
                }
            }
        }
        List<C1A8N> listLJIIJJI2 = c1a8m.LJIIJJI();
        ArrayList arrayList = new ArrayList();
        for (C1A8N c1a8n : listLJIIJJI2) {
            if (c1a8n.LJIIIZ().length() > 0) {
                arrayList.add(c1a8n);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((C1A8N) it3.next()).LJIIIZ());
        }
        return arrayList2;
    }

    public static final int LIZJ(C1A8M c1a8m) {
        List<C1A8N> listLJIIJJI = c1a8m.LJIIJJI();
        if (!(listLJIIJJI instanceof Collection) || !listLJIIJJI.isEmpty()) {
            Iterator<C1A8N> it2 = listLJIIJJI.iterator();
            while (it2.hasNext()) {
                if (!it2.next().LJIIJJI()) {
                    return 0;
                }
            }
        }
        List<C1A8L> listLJIIIZ = c1a8m.LJIIIZ();
        ArrayList arrayList = new ArrayList();
        for (C1A8L c1a8l : listLJIIIZ) {
            C1A8L c1a8l2 = c1a8l;
            if ((!c1a8l2.LJ().isEmpty()) && !c1a8l2.LIZLLL().LJIIIIZZ()) {
                arrayList.add(c1a8l);
            }
        }
        return arrayList.size();
    }

    public static final int LIZLLL(C1A8M c1a8m) {
        List<C1A8N> listLJIIJJI = c1a8m.LJIIJJI();
        if (!(listLJIIJJI instanceof Collection) || !listLJIIJJI.isEmpty()) {
            Iterator<C1A8N> it2 = listLJIIJJI.iterator();
            while (it2.hasNext()) {
                if (!it2.next().LJIIJJI()) {
                    return 0;
                }
            }
        }
        List<C1A8L> listLJIIIZ = c1a8m.LJIIIZ();
        ArrayList arrayList = new ArrayList();
        for (C1A8L c1a8l : listLJIIIZ) {
            C1A8L c1a8l2 = c1a8l;
            if ((!c1a8l2.LJ().isEmpty()) && !c1a8l2.LIZLLL().LJIIIIZZ()) {
                arrayList.add(c1a8l);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C19719612Di.LJJI(((C1A8L) it3.next()).LJ(), arrayList2);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (hashSet.add(Long.valueOf(((C1A8Q) obj).LJFF()))) {
                arrayList3.add(obj);
            }
        }
        return arrayList3.size();
    }

    public static final boolean LJ(C1A8M c1a8m) {
        List<C1A8N> listLJIIJJI = c1a8m.LJIIJJI();
        if (!(listLJIIJJI instanceof Collection) || !listLJIIJJI.isEmpty()) {
            Iterator<C1A8N> it2 = listLJIIJJI.iterator();
            while (it2.hasNext()) {
                if (!it2.next().LJIIJJI()) {
                    return false;
                }
            }
        }
        List<C1A8L> listLJIIIZ = c1a8m.LJIIIZ();
        if (!(listLJIIIZ instanceof Collection) || !listLJIIIZ.isEmpty()) {
            for (C1A8L c1a8l : listLJIIIZ) {
                if ((!c1a8l.LJ().isEmpty()) && !c1a8l.LIZLLL().LJIIIIZZ()) {
                    return true;
                }
            }
        }
        return false;
    }
}
