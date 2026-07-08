package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.model.GiftEffect;
import com.bytedance.android.livesdk.livesetting.gift.GiftShinyCardBypassStableModelSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEffectLayerEnabledSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.GiftMonitorInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0fbi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133680fbi {
    public static final int LIZ(GiftMessage giftMessage) {
        int i = 0;
        if (giftMessage == null) {
            return 0;
        }
        Gift gift = giftMessage.mGift;
        if (gift != null) {
            i = gift.diamondCount;
        }
        return giftMessage.comboCount * i;
    }

    public static final long LIZIZ(GiftMessage giftMessage) {
        if (giftMessage != null) {
            User user = giftMessage.toUser;
            if (user != null) {
                Long lValueOf = Long.valueOf(user.getId());
                if (lValueOf.longValue() > 0) {
                    return lValueOf.longValue();
                }
            }
            GiftMonitorInfo giftMonitorInfo = giftMessage.giftMonitorInfo;
            if (giftMonitorInfo != null) {
                return giftMonitorInfo.to_user_id;
            }
            return -1L;
        }
        return -1L;
    }

    public static final AssetsModel LIZJ(GiftMessage giftMessage) {
        List<AssetsModel> list;
        if (giftMessage == null) {
            return null;
        }
        if (LiveGiftEffectLayerEnabledSetting.INSTANCE.isEnabled()) {
            GiftEffect giftEffect = giftMessage.giftEffect;
            if (giftEffect == null || (list = giftEffect.assets) == null) {
                return null;
            }
            return (AssetsModel) C13LP.LJJJLL(list);
        }
        return giftMessage.asset;
    }

    public static final boolean LIZLLL(GiftMessage giftMessage) {
        Boolean boolValueOf;
        if (giftMessage == null) {
            return false;
        }
        GiftMessage.InteractiveGiftInfo interactiveGiftInfo = giftMessage.interactiveGiftInfo;
        if (interactiveGiftInfo != null && (((int) interactiveGiftInfo.ignoreComponent) & 1) != 0) {
            return false;
        }
        C1131800fYg.LIZ.getClass();
        if (!C781880Ulm.LJFF) {
            return true;
        }
        if (GiftShinyCardBypassStableModelSetting.INSTANCE.getEnabled()) {
            Gift gift = giftMessage.mGift;
            Boolean boolValueOf2 = null;
            if (gift != null) {
                boolValueOf = Boolean.valueOf(gift.LJIIIIZZ());
            } else {
                boolValueOf = null;
            }
            if (!C176600m4.LIZIZ(boolValueOf)) {
                Gift gift2 = giftMessage.mGift;
                if (gift2 != null) {
                    boolValueOf2 = Boolean.valueOf(gift2.LJII());
                }
                if (C176600m4.LIZIZ(boolValueOf2)) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean LJ(GiftMessage giftMessage) {
        if (giftMessage == null) {
            return false;
        }
        GiftMessage.InteractiveGiftInfo interactiveGiftInfo = giftMessage.interactiveGiftInfo;
        if (interactiveGiftInfo != null && (((int) interactiveGiftInfo.ignoreComponent) & 2) != 0) {
            return false;
        }
        return true;
    }
}
