package X;

import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.Gift;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.00Sw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C083200Sw {
    public static final Map<Long, Gift.GiftSponsorInfo> LIZ(GiftListResult giftListResult) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<GiftPage> it2 = giftListResult.giftPages.iterator();
        while (it2.hasNext()) {
            for (Gift gift : it2.next().gifts) {
                if (gift.isGalleryGift && gift.giftSponsorInfo != null) {
                    linkedHashMap.put(Long.valueOf(gift.id), gift.giftSponsorInfo);
                }
            }
        }
        return linkedHashMap;
    }
}
