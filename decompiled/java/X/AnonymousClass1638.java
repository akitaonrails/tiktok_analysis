package X;

import Y.ARunnableS26S1100000_21;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.1638, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class AnonymousClass1638<ITEM> {
    public final List<AnonymousClass1636<ITEM, C163A<ITEM, ? extends C164B, ? extends AbstractC1361510lXB<ITEM, ? extends C164B>>>> LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AnonymousClass1640());

    public AnonymousClass1638(List<AnonymousClass1636<ITEM, C163A<ITEM, ? extends C164B, ? extends AbstractC1361510lXB<ITEM, ? extends C164B>>>> list) {
        this.LIZ = list;
    }

    public final boolean LIZJ(ITEM item) {
        if (item == null) {
            return false;
        }
        List<AnonymousClass1636<ITEM, C163A<ITEM, ? extends C164B, ? extends AbstractC1361510lXB<ITEM, ? extends C164B>>>> list = this.LIZ;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<AnonymousClass1636<ITEM, C163A<ITEM, ? extends C164B, ? extends AbstractC1361510lXB<ITEM, ? extends C164B>>>> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().LJIIIZ(item)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static C11NZ LIZ(AnonymousClass1638 anonymousClass1638, Object obj) {
        C11RK<Boolean> c11rkLJJJJZ;
        EnumC715680S5m enumC715680S5m = EnumC715680S5m.NOT_OVERWRITTEN;
        anonymousClass1638.getClass();
        ArrayList arrayList = new ArrayList();
        List<AnonymousClass1636<ITEM, C163A<ITEM, ? extends C164B, ? extends AbstractC1361510lXB<ITEM, ? extends C164B>>>> list = anonymousClass1638.LIZ;
        ArrayList arrayList2 = new ArrayList();
        for (AnonymousClass1636<ITEM, C163A<ITEM, ? extends C164B, ? extends AbstractC1361510lXB<ITEM, ? extends C164B>>> anonymousClass1636 : list) {
            if (anonymousClass1636.LJIIJ(obj, enumC715680S5m)) {
                arrayList2.add(anonymousClass1636);
            }
        }
        if (arrayList2.isEmpty()) {
            return C11NZ.LJJJJZ(Boolean.FALSE);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Long l = 2000L;
            C163A c163aLIZIZ = ((AnonymousClass1636) it2.next()).LIZIZ();
            c163aLIZIZ.getClass();
            String strLLIIZ = C161N.LIZIZ.LLIIZ();
            String strLIZIZ = c163aLIZIZ.LIZJ().LIZIZ(obj, strLLIIZ);
            if (c163aLIZIZ.LIZJ().LIZLLL(obj, strLLIIZ) != null) {
                c11rkLJJJJZ = C11NZ.LJJJJZ(Boolean.TRUE);
            } else {
                c11rkLJJJJZ = c163aLIZIZ.LIZJ.get(strLIZIZ);
                if (c11rkLJJJJZ == null) {
                    ConcurrentHashMap<String, C11RK<Boolean>> concurrentHashMap = c163aLIZIZ.LIZLLL;
                    C11RK<Boolean> c11rk = concurrentHashMap.get(strLIZIZ);
                    if (c11rk == null) {
                        if (l != null) {
                            C786410Ut5.LJLIIL(l.longValue(), c163aLIZIZ.LIZIZ, new ARunnableS26S1100000_21(c163aLIZIZ, strLIZIZ, 2));
                        }
                        c11rk = new C11RK<>();
                        C11RK<Boolean> c11rkPutIfAbsent = concurrentHashMap.putIfAbsent(strLIZIZ, c11rk);
                        if (c11rkPutIfAbsent != null) {
                            c11rk = c11rkPutIfAbsent;
                        }
                    }
                    c11rkLJJJJZ = c11rk;
                }
            }
            arrayList.add(c11rkLJJJJZ);
        }
        return C11NZ.LJLL(arrayList, new InterfaceC1487280oo2() { // from class: X.00DX
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj2) {
                Object[] objArr = (Object[]) obj2;
                int length = objArr.length;
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (!((Boolean) objArr[i]).booleanValue()) {
                            break;
                        }
                        i++;
                    } else {
                        z = true;
                        break;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public final boolean LJ(ITEM item, EnumC715680S5m enumC715680S5m) {
        if (item == null) {
            return false;
        }
        List<AnonymousClass1636<ITEM, C163A<ITEM, ? extends C164B, ? extends AbstractC1361510lXB<ITEM, ? extends C164B>>>> list = this.LIZ;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<AnonymousClass1636<ITEM, C163A<ITEM, ? extends C164B, ? extends AbstractC1361510lXB<ITEM, ? extends C164B>>>> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().LJIIJ(item, enumC715680S5m)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void LIZIZ(ITEM item, String str, C162U c162u) {
        if (item == null || c162u == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<AnonymousClass1636<ITEM, C163A<ITEM, ? extends C164B, ? extends AbstractC1361510lXB<ITEM, ? extends C164B>>>> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            Boolean boolLJ = it2.next().LJ(item, str, c162u);
            if (boolLJ != null) {
                arrayList.add(Boolean.valueOf(boolLJ.booleanValue()));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        c162u.onStart();
        if (arrayList.contains(Boolean.FALSE)) {
            c162u.LIZ(C162V.FAILURE);
        } else {
            c162u.LIZ(C162V.SUCCESS);
        }
    }

    public final C11NZ<Boolean> LIZLLL(boolean z, ITEM item, C162U c162u, String str, EnumC715680S5m enumC715680S5m) {
        ArrayList arrayList = new ArrayList();
        List<AnonymousClass1636<ITEM, C163A<ITEM, ? extends C164B, ? extends AbstractC1361510lXB<ITEM, ? extends C164B>>>> list = this.LIZ;
        ArrayList arrayList2 = new ArrayList();
        for (AnonymousClass1636<ITEM, C163A<ITEM, ? extends C164B, ? extends AbstractC1361510lXB<ITEM, ? extends C164B>>> anonymousClass1636 : list) {
            AnonymousClass1636<ITEM, C163A<ITEM, ? extends C164B, ? extends AbstractC1361510lXB<ITEM, ? extends C164B>>> anonymousClass16362 = anonymousClass1636;
            boolean zLJIIJ = anonymousClass16362.LJIIJ(item, enumC715680S5m);
            anonymousClass16362.LIZLLL(item, c162u, anonymousClass16362.LJIIIZ(item), zLJIIJ);
            if (zLJIIJ) {
                arrayList2.add(anonymousClass1636);
            }
        }
        if (arrayList2.isEmpty()) {
            return C11NZ.LJJJJZ(Boolean.FALSE);
        }
        if (c162u != null) {
            c162u.onStart();
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((AnonymousClass1636) it2.next()).LIZIZ().LJIILL(z, item, c162u, str, false));
        }
        return C11NZ.LJLL(arrayList, new InterfaceC1487280oo2() { // from class: X.163c
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                Object[] objArr = (Object[]) obj;
                int length = objArr.length;
                boolean z2 = false;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (!((Boolean) objArr[i]).booleanValue()) {
                            break;
                        }
                        i++;
                    } else {
                        z2 = true;
                        break;
                    }
                }
                return Boolean.valueOf(z2);
            }
        });
    }
}
