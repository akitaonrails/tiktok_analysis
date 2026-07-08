package X;

import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.Gift;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0fGe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120620fGe {
    public static Integer LIZ(long j, List list) {
        if (j <= 0) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            GiftPage giftPage = (GiftPage) it2.next();
            List<Gift> list2 = giftPage.gifts;
            if (list2 != null && !list2.isEmpty()) {
                Iterator<Gift> it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (it3.next().id == j) {
                        return Integer.valueOf(giftPage.pageType);
                    }
                }
            }
        }
        return null;
    }

    public static boolean LIZIZ(int i, List list) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (((GiftPage) it2.next()).pageType == i) {
                return true;
            }
        }
        return false;
    }
}
