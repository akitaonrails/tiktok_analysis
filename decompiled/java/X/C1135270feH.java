package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.gift.model.GiftEffect;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEffectLayerEnabledSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0feH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135270feH {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZIZ(InterfaceC1136020ffU interfaceC1136020ffU) {
        Long lValueOf;
        Long l;
        GiftEffect giftEffectLJIJI;
        List<AssetsModel> list;
        AssetsModel assetsModel;
        if (interfaceC1136020ffU == null) {
            return 0L;
        }
        if (LiveGiftEffectLayerEnabledSetting.INSTANCE.isEnabled()) {
            Long lLIZ = C1133610fbb.LIZ(interfaceC1136020ffU.getGiftId());
            if (lLIZ != null) {
                lLIZ.longValue();
            }
            InterfaceC1136230ffp interfaceC1136230ffpLJJII = interfaceC1136020ffU.LJJII();
            if (interfaceC1136230ffpLJJII != null && (giftEffectLJIJI = interfaceC1136230ffpLJJII.LJIJI()) != null && (list = giftEffectLJIJI.assets) != null && (assetsModel = (AssetsModel) C13LP.LJJJLZIJ(0, list)) != null) {
                return assetsModel.id;
            }
            return C1135870ffF.LJFF(interfaceC1136020ffU);
        }
        InterfaceC1136160ffi interfaceC1136160ffiLJIIIIZZ = interfaceC1136020ffU.LJIIIIZZ();
        InterfaceC1136230ffp interfaceC1136230ffpLJJII2 = interfaceC1136020ffU.LJJII();
        if (interfaceC1136230ffpLJJII2 != null) {
            lValueOf = Long.valueOf(interfaceC1136230ffpLJJII2.LJIIL());
        } else {
            lValueOf = null;
        }
        long jLJFF = C1135870ffF.LJFF(interfaceC1136020ffU);
        if (lValueOf != null) {
            if (interfaceC1136160ffiLJIIIIZZ == null) {
                return 0L;
            }
            List<GiftColorInfo> listLJII = interfaceC1136160ffiLJIIIIZZ.LJII();
            if (listLJII != null) {
                for (GiftColorInfo giftColorInfo : listLJII) {
                    if (Intrinsics.LJFF(lValueOf, giftColorInfo.colorId) && (l = giftColorInfo.colorEffectId) != null) {
                        return l.longValue();
                    }
                }
            }
        }
        return jLJFF;
    }

    public static long LIZJ(GiftMessage giftMessage) {
        Long l;
        List<AssetsModel> list;
        AssetsModel assetsModel;
        if (giftMessage == null) {
            return 0L;
        }
        if (LiveGiftEffectLayerEnabledSetting.INSTANCE.isEnabled()) {
            if (C1133610fbb.LJ(giftMessage)) {
                Gift gift = giftMessage.mGift;
                if (gift == null) {
                    return 0L;
                }
                return gift.primaryEffectId;
            }
            GiftEffect giftEffect = giftMessage.giftEffect;
            if (giftEffect != null && (list = giftEffect.assets) != null && (assetsModel = (AssetsModel) C13LP.LJJJLZIJ(0, list)) != null) {
                return assetsModel.id;
            }
            Gift gift2 = giftMessage.mGift;
            if (gift2 == null) {
                return 0L;
            }
            return gift2.primaryEffectId;
        }
        Gift gift3 = giftMessage.mGift;
        Long l2 = giftMessage.colorId;
        if (l2 == null) {
            if (gift3 == null) {
                return 0L;
            }
            return gift3.primaryEffectId;
        }
        if (gift3 == null) {
            return 0L;
        }
        List<GiftColorInfo> list2 = gift3.colorInfos;
        if (list2 != null) {
            for (GiftColorInfo giftColorInfo : list2) {
                if (Intrinsics.LJFF(l2, giftColorInfo.colorId) && (l = giftColorInfo.colorEffectId) != null) {
                    return l.longValue();
                }
            }
        }
        return gift3.primaryEffectId;
    }

    public static Integer LIZ(int i, Context context) {
        return C1308910kAL.LIZJ(i, new ContextThemeWrapper(context, R.style.z4));
    }
}
