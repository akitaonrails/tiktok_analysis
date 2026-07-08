package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.model.AssetBundle;
import com.bytedance.android.livesdk.gift.model.GiftEffect;
import com.bytedance.android.livesdk.gift.model.GiftEffectSerialSpec;
import com.bytedance.android.livesdk.gift.model.GiftEffectSpecs;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEffectLayerEnabledSetting;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0fgN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136570fgN {
    public static final boolean LIZ(C1135280feI c1135280feI) {
        boolean z = false;
        if (c1135280feI != null && c1135280feI.LJIJ == 1000) {
            z = true;
        }
        return !z;
    }

    public static final List<AssetsModel> LIZIZ(GiftMessage giftMessage) {
        GiftEffectSpecs giftEffectSpecs;
        GiftEffectSerialSpec giftEffectSerialSpec;
        List<Long> list;
        if (giftMessage == null) {
            return null;
        }
        if (LiveGiftEffectLayerEnabledSetting.INSTANCE.isEnabled()) {
            GiftEffect giftEffect = giftMessage.giftEffect;
            if (giftEffect == null || (giftEffectSpecs = giftEffect.specs) == null || (giftEffectSerialSpec = giftEffectSpecs.serialSpec) == null || (list = giftEffectSerialSpec.serialAssetIds) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<Long> it2 = list.iterator();
            while (it2.hasNext()) {
                long jLongValue = it2.next().longValue();
                AssetsModel assetsModelLIZLLL = C1138640fji.LIZLLL(jLongValue);
                if (assetsModelLIZLLL != null) {
                    arrayList.add(assetsModelLIZLLL);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("magicGiftAssetsModelList assetModel ");
                    sbLIZ.append(jLongValue);
                    sbLIZ.append(" is missing");
                    C20441214yg.LJ("ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
        AssetBundle assetBundle = giftMessage.assetBundle;
        if (assetBundle == null) {
            return null;
        }
        return assetBundle.assets;
    }
}
