package X;

import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.Gift;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0eVd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091470eVd {
    public static final Set<Integer> LIZ = C13LQ.LJLIIL(new Integer[]{1, 17, 15, 18});

    public static boolean LIZ(List list, C1091480eVe c1091480eVe) {
        Object next;
        List<Gift> list2;
        if (c1091480eVe == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((GiftPage) it2.next()).pageType));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (LIZ.contains(Integer.valueOf(((Number) obj).intValue()))) {
                arrayList2.add(obj);
            }
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList2);
        if (setLLIIJI.isEmpty()) {
            return false;
        }
        if (!(setLLIIJI instanceof Collection) || !setLLIIJI.isEmpty()) {
            Iterator it3 = setLLIIJI.iterator();
            while (it3.hasNext()) {
                int iIntValue = ((Number) it3.next()).intValue();
                if (c1091480eVe.LIZ(iIntValue) == null) {
                    return false;
                }
                Iterator it4 = list.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next = it4.next();
                        if (((GiftPage) next).pageType == iIntValue) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                GiftPage giftPage = (GiftPage) next;
                if (giftPage == null || (list2 = giftPage.gifts) == null || list2.isEmpty() || !(!r3.LIZIZ.isEmpty())) {
                    return false;
                }
            }
        }
        return true;
    }
}
