package X;

import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.Gift;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.00iv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C157100iv {
    public Map<Long, Integer> LIZ = C2097608Jq.LJ();
    public Map<Long, Integer> LIZIZ = C2097608Jq.LJ();
    public Map<Long, Integer> LIZJ = C2097608Jq.LJ();

    public static Map LIZ(List list) {
        int i;
        Object next;
        List list2;
        Iterator it2 = list.iterator();
        while (true) {
            i = 0;
            if (it2.hasNext()) {
                next = it2.next();
                if (((GiftPage) next).pageType == 1) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        GiftPage giftPage = (GiftPage) next;
        if (giftPage == null || (list2 = giftPage.gifts) == null) {
            list2 = C13BV.INSTANCE;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(list2.size());
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i >= 0) {
                linkedHashMap.put(Long.valueOf(((Gift) obj).id), Integer.valueOf(i2));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return linkedHashMap;
    }

    public final void LIZIZ(List<? extends GiftPage> list, List<? extends GiftPage> list2) {
        GiftPage next;
        List list3;
        this.LIZ = LIZ(list);
        this.LIZIZ = LIZ(list2);
        Iterator<? extends GiftPage> it2 = list2.iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            } else {
                next = it2.next();
            }
        } while (next.pageType != 1);
        GiftPage giftPage = next;
        if (giftPage == null || (list3 = giftPage.gifts) == null) {
            list3 = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList.add(Long.valueOf(((Gift) it3.next()).id));
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList);
        C13DA c13da = new C13DA();
        for (GiftPage giftPage2 : list2) {
            if (giftPage2.pageType != 1) {
                List<Gift> list4 = giftPage2.gifts;
                if (list4 == null) {
                    list4 = C13BV.INSTANCE;
                }
                for (Gift gift : list4) {
                    if (!setLLIIJI.contains(Long.valueOf(gift.id))) {
                        c13da.putIfAbsent(Long.valueOf(gift.id), Integer.valueOf(giftPage2.pageType));
                    }
                }
            }
        }
        this.LIZJ = c13da.build();
    }
}
