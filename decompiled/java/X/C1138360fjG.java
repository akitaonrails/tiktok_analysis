package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0fjG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1138360fjG {
    public static final void LIZIZ(Map map, final C1137740fiG c1137740fiG, int i, Map map2) {
        C1138630fjh c1138630fjh = C1138630fjh.LIZ;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            C1138630fjh c1138630fjh2 = C1138630fjh.LIZ;
            arrayList.add(C1138630fjh.LIZIZ(((Number) entry.getKey()).longValue(), i, map2, (InterfaceC1138820fk0) entry.getValue(), false, null, null, 208));
        }
        AbstractC19484711Kz.LJJIL(arrayList, new InterfaceC1487280oo2() { // from class: X.00Da
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return 0;
            }
        }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new InterfaceC19474811He<Object>() { // from class: X.0fjP
            @Override // X.InterfaceC19474811He
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th) {
                InterfaceC1138480fjS interfaceC1138480fjS = c1137740fiG;
                if (interfaceC1138480fjS != null) {
                    interfaceC1138480fjS.onFailed(th);
                }
            }

            @Override // X.InterfaceC19474811He
            public final void onSuccess(Object obj) {
                InterfaceC1138480fjS interfaceC1138480fjS = c1137740fiG;
                if (interfaceC1138480fjS != null) {
                    interfaceC1138480fjS.LIZ();
                }
            }
        });
    }

    public static final void LIZ(Collection collection, Map map, Map map2, final C1137740fiG c1137740fiG, Map map3) {
        C1138630fjh c1138630fjh = C1138630fjh.LIZ;
        ArrayList arrayList = new ArrayList();
        final AtomicInteger atomicInteger = new AtomicInteger();
        Iterator it2 = collection.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            C1138630fjh c1138630fjh2 = C1138630fjh.LIZ;
            if (!zHasNext) {
                break;
            }
            long jLongValue = ((Number) it2.next()).longValue();
            arrayList.add(C1138630fjh.LIZIZ(jLongValue, 4, map3, (InterfaceC1138820fk0) map2.get(Long.valueOf(jLongValue)), false, atomicInteger, null, 144));
        }
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            arrayList.add(C1138630fjh.LIZIZ(((Number) entry.getKey()).longValue(), 4, map3, (InterfaceC1138820fk0) map2.get(entry.getKey()), false, atomicInteger, (Integer) entry.getValue(), 16));
        }
        AbstractC19484711Kz.LJJIL(arrayList, new InterfaceC1487280oo2() { // from class: X.00DZ
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return 0;
            }
        }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new InterfaceC19474811He<Object>() { // from class: X.0fjQ
            @Override // X.InterfaceC19474811He
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            @Override // X.InterfaceC19474811He
            public final void onError(Throwable th) {
                InterfaceC1138480fjS interfaceC1138480fjS = c1137740fiG;
                if (interfaceC1138480fjS != null) {
                    interfaceC1138480fjS.onFailed(th);
                }
            }

            @Override // X.InterfaceC19474811He
            public final void onSuccess(Object obj) {
                if (atomicInteger.get() > 0) {
                    InterfaceC1138480fjS interfaceC1138480fjS = c1137740fiG;
                    if (interfaceC1138480fjS != null) {
                        interfaceC1138480fjS.LIZ();
                        return;
                    }
                    return;
                }
                onError(new Throwable("all task failed"));
            }
        });
    }
}
