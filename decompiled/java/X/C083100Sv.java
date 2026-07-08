package X;

import com.bytedance.android.livesdk.livesetting.gift.OptimizeQuickGiftSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.QuickGift;

/* JADX INFO: renamed from: X.00Sv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C083100Sv {
    public static final boolean LIZ() {
        return OptimizeQuickGiftSetting.INSTANCE.shouldUpdateOnEnter();
    }

    public static final Gift LIZIZ(QuickGift quickGift) {
        Gift gift = new Gift();
        gift.id = quickGift.id;
        gift.name = quickGift.name;
        gift.image = quickGift.image;
        gift.type = (int) quickGift.type;
        gift.diamondCount = (int) quickGift.diamondCount;
        gift.isBroadcastGift = quickGift.isBroadcastGift;
        gift.primaryEffectId = quickGift.primaryEffectId;
        return gift;
    }
}
