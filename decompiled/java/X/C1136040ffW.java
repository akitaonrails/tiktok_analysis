package X;

import com.bytedance.android.livesdk.gift.model.GiftEffect;
import com.bytedance.android.livesdk.gift.model.GiftEffectLynxSpec;
import com.bytedance.android.livesdk.gift.model.GiftEffectSpecs;
import com.bytedance.android.livesdk.gift.model.SecondaryEffectInfo;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEffectLayerEnabledSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: X.0ffW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136040ffW {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(InterfaceC1136020ffU interfaceC1136020ffU) {
        Collection collection;
        Iterable iterable;
        InterfaceC1136160ffi interfaceC1136160ffiLJIIIIZZ;
        Gift.LynxCrossScreenEffectInfo lynxCrossScreenEffectInfoLJIIIIZZ;
        InterfaceC1136230ffp interfaceC1136230ffpLJJII;
        SecondaryEffectInfo secondaryEffectInfoLJIIZILJ;
        InterfaceC1136230ffp interfaceC1136230ffpLJJII2;
        GiftEffect giftEffectLJIJI;
        GiftEffectSpecs giftEffectSpecs;
        GiftEffectLynxSpec giftEffectLynxSpec;
        List<Long> list;
        if (LiveGiftEffectLayerEnabledSetting.INSTANCE.isEnabled()) {
            if (interfaceC1136020ffU != null && (interfaceC1136230ffpLJJII2 = interfaceC1136020ffU.LJJII()) != null && (giftEffectLJIJI = interfaceC1136230ffpLJJII2.LJIJI()) != null && (giftEffectSpecs = giftEffectLJIJI.specs) != null && (giftEffectLynxSpec = giftEffectSpecs.lynx) != null && (list = giftEffectLynxSpec.assetIds) != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Long l : list) {
                    if (l.longValue() > 0) {
                        arrayList.add(l);
                    }
                }
                return arrayList;
            }
            return C13BV.INSTANCE;
        }
        if (interfaceC1136020ffU == null || (interfaceC1136230ffpLJJII = interfaceC1136020ffU.LJJII()) == null || (secondaryEffectInfoLJIIZILJ = interfaceC1136230ffpLJJII.LJIIZILJ()) == null || (collection = secondaryEffectInfoLJIIZILJ.effectIds) == null) {
            collection = C13BV.INSTANCE;
        }
        if (interfaceC1136020ffU == null || (interfaceC1136160ffiLJIIIIZZ = interfaceC1136020ffU.LJIIIIZZ()) == null || (lynxCrossScreenEffectInfoLJIIIIZZ = interfaceC1136160ffiLJIIIIZZ.LJIIIIZZ()) == null || (iterable = lynxCrossScreenEffectInfoLJIIIIZZ.effectIds) == null) {
            iterable = C13BV.INSTANCE;
        }
        return C13LP.LJJJJI(C13LP.LJLIL(iterable, collection));
    }

    public static final List<Long> LIZIZ(GiftMessage giftMessage) {
        Collection collection;
        Iterable iterable;
        Gift gift;
        Gift.LynxCrossScreenEffectInfo lynxCrossScreenEffectInfo;
        SecondaryEffectInfo secondaryEffectInfo;
        GiftEffect giftEffect;
        GiftEffectSpecs giftEffectSpecs;
        GiftEffectLynxSpec giftEffectLynxSpec;
        List<Long> list;
        if (LiveGiftEffectLayerEnabledSetting.INSTANCE.isEnabled()) {
            if (giftMessage != null && (giftEffect = giftMessage.giftEffect) != null && (giftEffectSpecs = giftEffect.specs) != null && (giftEffectLynxSpec = giftEffectSpecs.lynx) != null && (list = giftEffectLynxSpec.assetIds) != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Long l : list) {
                    if (l.longValue() > 0) {
                        arrayList.add(l);
                    }
                }
                return arrayList;
            }
            return C13BV.INSTANCE;
        }
        if (giftMessage == null || (secondaryEffectInfo = giftMessage.secondaryEffectInfo) == null || (collection = secondaryEffectInfo.effectIds) == null) {
            collection = C13BV.INSTANCE;
        }
        if (giftMessage == null || (gift = giftMessage.mGift) == null || (lynxCrossScreenEffectInfo = gift.lynxCrossScreenEffectInfo) == null || (iterable = lynxCrossScreenEffectInfo.effectIds) == null) {
            iterable = C13BV.INSTANCE;
        }
        return C13LP.LJJJJI(C13LP.LJLIL(iterable, collection));
    }
}
