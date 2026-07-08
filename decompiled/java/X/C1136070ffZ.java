package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.model.AssetBundle;
import com.bytedance.android.livesdk.gift.model.GiftEffect;
import com.bytedance.android.livesdk.gift.model.GiftEffectPrefabSpec;
import com.bytedance.android.livesdk.gift.model.GiftEffectSpecs;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEffectLayerEnabledSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftReceivingRefactorSetting;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.List;

/* JADX INFO: renamed from: X.0ffZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136070ffZ {
    public static final void LIZ(GiftMessage giftMessage) {
        List<AssetsModel> list;
        GiftEffectSpecs giftEffectSpecs;
        GiftEffectPrefabSpec giftEffectPrefabSpec;
        List<Long> list2;
        AssetBundle.PrefabBundle prefabBundle;
        List<Long> list3;
        AssetsModel assetsModelLIZJ;
        if (giftMessage == null) {
            return;
        }
        LiveGiftEffectLayerEnabledSetting liveGiftEffectLayerEnabledSetting = LiveGiftEffectLayerEnabledSetting.INSTANCE;
        if (!liveGiftEffectLayerEnabledSetting.isEnabled() && (assetsModelLIZJ = C1133680fbi.LIZJ(giftMessage)) != null && assetsModelLIZJ.forceUseImOrRespAsset) {
            C1138640fji.LIZ(assetsModelLIZJ, LiveGiftReceivingRefactorSetting.INSTANCE.isForceUpdateAsset());
        }
        if (giftMessage.isAssetBundleGift || liveGiftEffectLayerEnabledSetting.isEnabled()) {
            if (liveGiftEffectLayerEnabledSetting.isEnabled()) {
                GiftEffect giftEffect = giftMessage.giftEffect;
                if (giftEffect != null) {
                    list = giftEffect.assets;
                } else {
                    return;
                }
            } else {
                AssetBundle assetBundle = giftMessage.assetBundle;
                if (assetBundle != null) {
                    list = assetBundle.assets;
                } else {
                    return;
                }
            }
            if (list != null) {
                for (AssetsModel assetsModel : list) {
                    if (assetsModel.forceUseImOrRespAsset) {
                        C1138640fji.LIZ(assetsModel, LiveGiftReceivingRefactorSetting.INSTANCE.isForceUpdateAsset());
                        if (LiveGiftEffectLayerEnabledSetting.INSTANCE.isEnabled()) {
                            GiftEffect giftEffect2 = giftMessage.giftEffect;
                            if (giftEffect2 == null || (giftEffectSpecs = giftEffect2.specs) == null || (giftEffectPrefabSpec = giftEffectSpecs.prefab) == null || (list2 = giftEffectPrefabSpec.prefabAssetIds) == null || list2.size() <= 0) {
                                ConcurrentHashSet<Long> concurrentHashSet = C1138790fjx.LIZ;
                                C1138790fjx.LIZ.add(Long.valueOf(assetsModel.id));
                            }
                        } else {
                            AssetBundle assetBundle2 = giftMessage.assetBundle;
                            if (assetBundle2 == null || (prefabBundle = assetBundle2.prefabBundle) == null || (list3 = prefabBundle.prefabEffectIds) == null || list3.size() <= 0) {
                                ConcurrentHashSet<Long> concurrentHashSet2 = C1138790fjx.LIZ;
                                C1138790fjx.LIZ.add(Long.valueOf(assetsModel.id));
                            }
                        }
                    }
                }
            }
        }
    }
}
