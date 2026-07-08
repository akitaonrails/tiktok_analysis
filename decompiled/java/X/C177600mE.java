package X;

import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.Gift;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.00mE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C177600mE {
    public static final Map<Long, Gift> LIZ() {
        List<GiftPage> list;
        GiftListResult giftListResult = GiftManager.inst().getGiftListResult();
        if (giftListResult == null || (list = giftListResult.giftPages) == null) {
            return C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<GiftPage> it2 = list.iterator();
        while (it2.hasNext()) {
            List<Gift> list2 = it2.next().gifts;
            if (list2 != null) {
                for (Gift gift : list2) {
                    if (!linkedHashMap.containsKey(Long.valueOf(gift.id))) {
                        linkedHashMap.put(Long.valueOf(gift.id), gift);
                    }
                }
            }
        }
        return linkedHashMap;
    }
}
