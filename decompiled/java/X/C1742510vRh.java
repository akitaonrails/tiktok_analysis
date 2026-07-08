package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0vRh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1742510vRh {
    public final EnumC1742470vRd LIZ;
    public String LIZIZ;
    public final Map<String, Object> LIZJ;
    public final long LIZLLL;
    public long LJ;
    public final Set<String> LJFF;
    public final List<C1742530vRj> LJI;
    public final ArrayList<C1742530vRj> LJII;
    public final List<String> LJIIIIZZ;
    public final long LJIIIZ;
    public boolean LJIIJ;
    public EnumC1303450k1X LJIIJJI;

    public final Long LIZIZ() {
        List<C1742530vRj> list = this.LJI;
        ArrayList arrayList = new ArrayList();
        Iterator<C1742530vRj> it2 = list.iterator();
        while (it2.hasNext()) {
            Long l = it2.next().LIZIZ;
            if (l != null) {
                arrayList.add(l);
            }
        }
        return (Long) C13LP.LJJLL(arrayList);
    }

    public final Long LIZJ() {
        boolean z;
        ArrayList<C1742530vRj> arrayList = this.LJII;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            z = true;
        } else {
            Iterator<C1742530vRj> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!it2.next().LIZLLL.isFinished()) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        Long lValueOf = null;
        if (z) {
            Iterator<C1742530vRj> it3 = this.LJII.iterator();
            if (it3.hasNext()) {
                Long l = it3.next().LIZJ;
                lValueOf = Long.valueOf(l != null ? l.longValue() : 0L);
                while (it3.hasNext()) {
                    Long l2 = it3.next().LIZJ;
                    Long lValueOf2 = Long.valueOf(l2 != null ? l2.longValue() : 0L);
                    if (lValueOf.compareTo(lValueOf2) < 0) {
                        lValueOf = lValueOf2;
                    }
                }
            }
        }
        return lValueOf;
    }

    public final boolean LIZLLL() {
        List<C1742530vRj> list = this.LJI;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<C1742530vRj> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!it2.next().LIZLLL.isFinished()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final Long LIZ() {
        Long lValueOf = null;
        if (LIZLLL()) {
            Iterator<C1742530vRj> it2 = this.LJI.iterator();
            if (it2.hasNext()) {
                Long l = it2.next().LIZJ;
                lValueOf = Long.valueOf(l != null ? l.longValue() : 0L);
                while (it2.hasNext()) {
                    Long l2 = it2.next().LIZJ;
                    Long lValueOf2 = Long.valueOf(l2 != null ? l2.longValue() : 0L);
                    if (lValueOf.compareTo(lValueOf2) < 0) {
                        lValueOf = lValueOf2;
                    }
                }
            }
        }
        return lValueOf;
    }

    public C1742510vRh(EnumC1742470vRd enumC1742470vRd, Map map, long j, Set set, List list, List list2, long j2) {
        ArrayList<C1742530vRj> arrayList = new ArrayList<>();
        this.LIZ = enumC1742470vRd;
        this.LIZIZ = null;
        this.LIZJ = map;
        this.LIZLLL = j;
        this.LJ = 0L;
        this.LJFF = set;
        this.LJI = list;
        this.LJII = arrayList;
        this.LJIIIIZZ = list2;
        this.LJIIIZ = j2;
        this.LJIIJ = false;
        this.LJIIJJI = null;
    }
}
