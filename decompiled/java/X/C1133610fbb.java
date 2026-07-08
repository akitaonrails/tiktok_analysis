package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.GiftResource;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0fbb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133610fbb {
    public static final ConcurrentHashMap<Long, String> LIZ = new ConcurrentHashMap<>();

    public static Long LIZ(long j) {
        String str;
        GiftResource giftResource;
        Gift giftLJI = C1138640fji.LJI(j);
        if (giftLJI != null && (str = LIZ.get(Long.valueOf(giftLJI.id))) != null && (giftResource = giftLJI.giftResources.get(str)) != null) {
            Long lValueOf = Long.valueOf(giftResource.effectId);
            if (lValueOf.longValue() > 0) {
                return lValueOf;
            }
            return null;
        }
        return null;
    }

    public static long LIZLLL(Gift gift) {
        if (gift == null) {
            return 0L;
        }
        String str = LIZ.get(Long.valueOf(gift.id));
        if (str == null) {
            return gift.resourceId;
        }
        GiftResource giftResource = gift.giftResources.get(str);
        if (giftResource != null) {
            return giftResource.id;
        }
        return gift.resourceId;
    }

    public static boolean LJ(GiftMessage giftMessage) {
        Gift gift;
        Long lLIZ;
        if (giftMessage != null && (gift = giftMessage.mGift) != null && (lLIZ = LIZ(gift.id)) != null) {
            long jLongValue = lLIZ.longValue();
            Gift gift2 = giftMessage.mGift;
            if (gift2 != null) {
                gift2.primaryEffectId = jLongValue;
                return true;
            }
            return true;
        }
        return false;
    }

    public static ImageModel LIZIZ(long j, ImageModel imageModel) {
        Gift giftLJI = C1138640fji.LJI(j);
        if (giftLJI != null) {
            if (imageModel == null) {
                imageModel = giftLJI.image;
            }
            return LIZJ(giftLJI, imageModel);
        }
        return imageModel;
    }

    public static ImageModel LIZJ(Gift gift, ImageModel imageModel) {
        String str;
        GiftResource giftResource;
        ImageModel imageModel2;
        if (gift != null && (str = LIZ.get(Long.valueOf(gift.id))) != null && (giftResource = gift.giftResources.get(str)) != null && (imageModel2 = giftResource.image) != null) {
            return imageModel2;
        }
        return imageModel;
    }

    public static void LJFF(List list, Map map) {
        GiftResource giftResource;
        ImageModel imageModel;
        if (map != null) {
            LIZ.putAll(map);
        }
        if (LIZ.isEmpty() || list == null) {
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            for (Gift gift : ((GiftPage) it2.next()).gifts) {
                String str = LIZ.get(Long.valueOf(gift.id));
                if (str != null && (giftResource = gift.giftResources.get(str)) != null && (imageModel = giftResource.image) != null) {
                    gift.image = imageModel;
                    gift.icon = imageModel;
                }
            }
        }
    }
}
