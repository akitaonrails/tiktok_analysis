package X;

import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.api.profit.IapListResult;

/* JADX INFO: renamed from: X.0x3P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1804330x3P extends AbstractC1805010x4V<C1804460x3c, C1804840x4E> implements InterfaceC1804510x3h {
    public static final void LJIIIZ(List list, Map map) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Diamond diamond = (Diamond) it2.next();
            Diamond diamond2 = (Diamond) ((LinkedHashMap) map).get(diamond.iapId);
            if (diamond2 != null) {
                diamond.LJFF = diamond2.LJFF;
                String str = diamond2.LIZIZ;
                diamond.LJI = str;
                diamond.price = diamond2.price;
                diamond.LIZJ = diamond2.LIZJ;
                diamond.LIZIZ = str;
                diamond.LJ = diamond2.LJ;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @Override // X.AbstractC1805010x4V
    public final Object LJFF(C1804460x3c c1804460x3c, InterfaceC1364105Vn<? super C1804840x4E> interfaceC1364105Vn) {
        ?? arrayList;
        List list;
        C1804460x3c c1804460x3c2 = c1804460x3c;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        List<Diamond> list2 = c1804460x3c2.LIZIZ;
        if (list2 != null) {
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (Diamond diamond : list2) {
                linkedHashMap.put(diamond.iapId, diamond);
            }
            LJIIIZ(c1804460x3c2.LIZ, linkedHashMap);
            IapListResult.ListResultExtra listResultExtra = c1804460x3c2.LIZJ;
            if (listResultExtra != null && listResultExtra.fullList == null && listResultExtra != null) {
                listResultExtra.fullList = new ArrayList();
            }
            IapListResult.ListResultExtra listResultExtra2 = c1804460x3c2.LIZJ;
            if (listResultExtra2 == null || (list = listResultExtra2.fullList) == null) {
                list = C13BV.INSTANCE;
            }
            LJIIIZ(list, linkedHashMap);
            for (Diamond diamond2 : c1804460x3c2.LIZ) {
                if (C2093608Ic.LJ(diamond2.LIZIZ)) {
                    arrayList3.add(diamond2);
                } else {
                    arrayList2.add(diamond2);
                }
            }
        }
        IapListResult.ListResultExtra listResultExtra3 = c1804460x3c2.LIZJ;
        if (listResultExtra3 != null) {
            List<Diamond> list3 = listResultExtra3.fullList;
            if (list3 != null) {
                arrayList = new ArrayList();
                for (Diamond diamond3 : list3) {
                    if (!C2093608Ic.LJ(diamond3.LIZIZ)) {
                        arrayList.add(diamond3);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            listResultExtra3.fullList = new ArrayList((Collection) arrayList);
        }
        return new C1804840x4E(arrayList2, arrayList3, c1804460x3c2.LIZJ);
    }
}
