package X;

import Y.AkS156S0000000_7;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: X.0J1O, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J1O<K, V> implements InterfaceC470700Id2<K, V> {
    public final InterfaceC1487280oo2<K, Integer> LIZ;
    public final InterfaceC500500Jk0<K, List<V>, List<V>> LIZIZ;
    public final InterfaceC941150abB<K, List<V>, Integer, List<V>, List<V>> LIZJ;
    public final Map<Integer, List<V>> LIZLLL;
    public final ConcurrentMap<Integer, C11RK<C470760Id8>> LJ;
    public final C11RK<Pair<K, C470760Id8>> LJFF;

    public C0J1O() {
        AkS156S0000000_7 akS156S0000000_7 = new AkS156S0000000_7(1);
        InterfaceC941150abB<K, List<V>, Integer, List<V>, List<V>> interfaceC941150abB = new InterfaceC941150abB() { // from class: X.0J1P
            @Override // X.InterfaceC941150abB
            public final Object LIZ(Object obj, Object obj2, Object obj3, Object obj4) {
                return obj4;
            }
        };
        InterfaceC500500Jk0<K, List<V>, List<V>> interfaceC500500Jk0 = new InterfaceC500500Jk0() { // from class: X.0J1Q
            @Override // X.InterfaceC500500Jk0
            public final Object apply(Object obj, Object obj2) {
                return obj2;
            }
        };
        this.LIZLLL = new ConcurrentHashMap();
        this.LJ = new ConcurrentHashMap(20, 0.75f, 4);
        this.LJFF = new C11RK<>();
        this.LIZ = akS156S0000000_7;
        this.LIZJ = interfaceC941150abB;
        this.LIZIZ = interfaceC500500Jk0;
    }

    @Override // X.InterfaceC470700Id2
    public final void LIZ(Object obj) {
        int iIntValue = ((Integer) C0J1R.LIZ(this.LIZ, obj)).intValue();
        if (!((ConcurrentHashMap) this.LIZLLL).containsKey(Integer.valueOf(iIntValue))) {
            ((ConcurrentHashMap) this.LIZLLL).put(Integer.valueOf(iIntValue), new ArrayList());
        }
        List list = (List) ((ConcurrentHashMap) this.LIZLLL).get(Integer.valueOf(iIntValue));
        if (list != null && list.size() >= 0) {
            Object objRemove = ListProtector.remove(list, 0);
            if (((ConcurrentHashMap) this.LJ).containsKey(Integer.valueOf(iIntValue))) {
                C11RK c11rk = (C11RK) ((ConcurrentHashMap) this.LJ).get(Integer.valueOf(iIntValue));
                if (c11rk != null) {
                    c11rk.onNext(new C470760Id8(2, Collections.singletonList(objRemove)));
                }
            }
        }
    }

    @Override // X.InterfaceC470700Id2
    public final void LIZIZ(K k) {
        int iIntValue = ((Integer) C0J1R.LIZ(this.LIZ, k)).intValue();
        if (!((ConcurrentHashMap) this.LIZLLL).containsKey(Integer.valueOf(iIntValue))) {
            ((ConcurrentHashMap) this.LIZLLL).put(Integer.valueOf(iIntValue), new ArrayList());
        }
        List list = (List) ((ConcurrentHashMap) this.LIZLLL).get(Integer.valueOf(iIntValue));
        if (list != null) {
            list.clear();
        }
    }

    @Override // X.InterfaceC470700Id2
    public final int LIZJ(K k) {
        int iIntValue = ((Integer) C0J1R.LIZ(this.LIZ, k)).intValue();
        if (!((ConcurrentHashMap) this.LIZLLL).containsKey(Integer.valueOf(iIntValue))) {
            ((ConcurrentHashMap) this.LIZLLL).put(Integer.valueOf(iIntValue), new ArrayList());
        }
        List list = (List) ((ConcurrentHashMap) this.LIZLLL).get(Integer.valueOf(iIntValue));
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // X.InterfaceC470700Id2
    public final List<V> get(K k) {
        int iIntValue = ((Integer) C0J1R.LIZ(this.LIZ, k)).intValue();
        if (!((ConcurrentHashMap) this.LIZLLL).containsKey(Integer.valueOf(iIntValue))) {
            ((ConcurrentHashMap) this.LIZLLL).put(Integer.valueOf(iIntValue), new ArrayList());
        }
        return (List) ((ConcurrentHashMap) this.LIZLLL).get(Integer.valueOf(iIntValue));
    }

    @Override // X.InterfaceC470700Id2
    public final List<V> LIZLLL(K k, List<V> list) {
        RuntimeException runtimeExceptionLIZIZ;
        int iIntValue = ((Integer) C0J1R.LIZ(this.LIZ, k)).intValue();
        if (!((ConcurrentHashMap) this.LIZLLL).containsKey(Integer.valueOf(iIntValue))) {
            ((ConcurrentHashMap) this.LIZLLL).put(Integer.valueOf(iIntValue), new ArrayList());
        }
        List list2 = (List) ((ConcurrentHashMap) this.LIZLLL).get(Integer.valueOf(iIntValue));
        if (list2 == null) {
            return list;
        }
        int size = list2.size();
        synchronized (this) {
            int iIntValue2 = ((Integer) C0J1R.LIZ(this.LIZ, k)).intValue();
            if (!((ConcurrentHashMap) this.LIZLLL).containsKey(Integer.valueOf(iIntValue2))) {
                ((ConcurrentHashMap) this.LIZLLL).put(Integer.valueOf(iIntValue2), new ArrayList());
            }
            try {
                List<V> listApply = this.LIZIZ.apply(k, list);
                List<V> list3 = (List) ((ConcurrentHashMap) this.LIZLLL).get(Integer.valueOf(iIntValue2));
                if (list3 == null) {
                    return new ArrayList();
                }
                try {
                    List<V> listLIZ = this.LIZJ.LIZ(k, list3, Integer.valueOf(size), listApply);
                    if (C0IKQ.LIZ(listLIZ)) {
                        return listLIZ;
                    }
                    list3.addAll(Math.min(size, list3.size()), listLIZ);
                    ((ConcurrentHashMap) this.LIZLLL).put(Integer.valueOf(iIntValue2), list3);
                    C470760Id8 c470760Id8 = new C470760Id8(1, listLIZ);
                    if (((ConcurrentHashMap) this.LJ).containsKey(Integer.valueOf(iIntValue2))) {
                        C11RK c11rk = (C11RK) ((ConcurrentHashMap) this.LJ).get(Integer.valueOf(iIntValue2));
                        if (c11rk != null) {
                            c11rk.onNext(c470760Id8);
                        }
                    }
                    this.LJFF.onNext(Pair.create(k, c470760Id8));
                    this.LJFF.onNext(Pair.create(k, new C470760Id8(5, list3)));
                    return listLIZ;
                } finally {
                }
            } finally {
            }
        }
    }
}
