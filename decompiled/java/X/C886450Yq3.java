package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Yq3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C886450Yq3 implements InterfaceC886490Yq7<C886410Ypz, C886480Yq6> {
    public final C886480Yq6 LIZ = new C886480Yq6(null);
    public final String LIZIZ = "message_request_chat_list_aggregation+vo_converter";

    @Override // X.InterfaceC886490Yq7
    public final String LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC886490Yq7
    public final /* bridge */ /* synthetic */ InterfaceC886910Yqn LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC886490Yq7
    public final boolean LIZLLL(C879540Yeu<?> c879540Yeu) {
        return c879540Yeu.LIZ instanceof C878900Yds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.ArrayList] */
    @Override // X.InterfaceC886490Yq7
    public final InterfaceC884440Ymo LIZJ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
        List list;
        C879580Yey c879580Yey;
        long jLongValue;
        List list2;
        ?? arrayList;
        C881260Yhg c881260Yhg;
        C879630Yf3 c879630Yf3;
        Long l;
        Long l2;
        Map<InterfaceC887040Yr0<?>, Object> mapLIZ = C886500Yq8.LIZ(this, c879540Yeu);
        AbstractC884010Ym7 abstractC884010Ym7 = null;
        if (!(c879540Yeu.LIZ instanceof C878900Yds)) {
            return null;
        }
        Object obj = c879540Yeu.LIZJ;
        if (obj instanceof List) {
            list = (List) obj;
        } else {
            list = null;
        }
        InterfaceC1491305sd interfaceC1491305sd = c879540Yeu.LIZIZ;
        if (!(interfaceC1491305sd instanceof C879580Yey) || (c879580Yey = (C879580Yey) interfaceC1491305sd) == null) {
            c879580Yey = new C879580Yey("");
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) mapLIZ;
        Object obj2 = linkedHashMap.get(C886860Yqi.LIZ);
        if ((obj2 instanceof Long) && (l2 = (Long) obj2) != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = Long.MAX_VALUE;
        }
        Object obj3 = linkedHashMap.get(C886630YqL.LIZ);
        if (obj3 instanceof List) {
            list2 = (List) obj3;
        } else {
            list2 = null;
        }
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C0Y9G) it2.next()).LIZ);
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        Object obj4 = linkedHashMap.get(C886820Yqe.LIZ);
        if (obj4 instanceof C881260Yhg) {
            c881260Yhg = (C881260Yhg) obj4;
        } else {
            c881260Yhg = null;
        }
        Object obj5 = linkedHashMap.get(C886840Yqg.LIZ);
        if (obj5 instanceof C879630Yf3) {
            c879630Yf3 = (C879630Yf3) obj5;
        } else {
            c879630Yf3 = null;
        }
        Object obj6 = linkedHashMap.get(C886870Yqj.LIZ);
        if (obj6 instanceof Long) {
            l = (Long) obj6;
        } else {
            l = null;
        }
        Object obj7 = linkedHashMap.get(C886880Yqk.LIZ);
        if (obj7 instanceof AbstractC884010Ym7) {
            abstractC884010Ym7 = (AbstractC884010Ym7) obj7;
        }
        return new C886410Ypz(interfaceC879010Ye3, C878900Yds.INSTANCE, c879580Yey, jLongValue, list2, arrayList, c881260Yhg, c879630Yf3, l, abstractC884010Ym7, 0, null, null, null, null);
    }
}
