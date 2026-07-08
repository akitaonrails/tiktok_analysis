package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetConsumerType;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;
import com.ss.android.ugc.effectmanager.effect.model.BusinessExtra;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ms1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412870ms1 {
    public static final C1412870ms1 LIZ = new C1412870ms1();

    public static NLETrackSlot LIZ(NLEEditor nLEEditor) {
        VecNLETrackSPtr tracks;
        NLEModel model = nLEEditor.getModel();
        if (model != null && (tracks = model.getTracks()) != null) {
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                NLETrack nLETrack2 = nLETrack;
                if (Intrinsics.LJFF(C348350DlB.LJI(nLETrack2), "NORMAL") || Intrinsics.LJFF(C348350DlB.LJI(nLETrack2), "TIME")) {
                    arrayList.add(nLETrack);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it2.next()).getSortedSlots(), arrayList2);
            }
            return (NLETrackSlot) C13LP.LJJJLL(arrayList2);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String LIZIZ(C1412800mru c1412800mru) {
        BusinessExtra business_extra;
        BusinessExtra business_extra2;
        BusinessExtra business_extra3;
        if (c1412800mru == null) {
            return null;
        }
        switch (C1412340mrA.LIZ[c1412800mru.LIZ.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
                Asset asset = c1412800mru.LIZLLL;
                if (asset != null && (business_extra3 = asset.getBusiness_extra()) != null) {
                    return business_extra3.getMusic_id();
                }
                return null;
            case 2:
                Asset asset2 = c1412800mru.LIZLLL;
                if (asset2 != null) {
                    return asset2.getResource_id();
                }
                return null;
            case 3:
                Asset asset3 = c1412800mru.LIZLLL;
                if (asset3 != null && (business_extra2 = asset3.getBusiness_extra()) != null) {
                    return business_extra2.getMusic_id();
                }
                return null;
            case 4:
                Asset asset4 = c1412800mru.LIZLLL;
                if (asset4 != null && (business_extra = asset4.getBusiness_extra()) != null) {
                    return business_extra.getMusic_id();
                }
                return null;
            case 5:
            default:
                return null;
            case BdTuring.TYPE_ECAF /* 9 */:
                Asset asset5 = c1412800mru.LIZLLL;
                if (asset5 != null) {
                    return asset5.getAsset_id();
                }
                return null;
        }
    }

    public static MixEditingMaterialType LIZJ(Asset asset) {
        int asset_consumer_type = asset.getAsset_consumer_type();
        if (asset_consumer_type != AssetConsumerType.FILTER.getValue() && asset_consumer_type != AssetConsumerType.EDIT_EFFECT.getValue()) {
            if (asset_consumer_type == AssetConsumerType.CC_TEMPLATE.getValue()) {
                if (asset.getAsset_type() == AssetType.PUGC_TEMPLATE.getValue()) {
                    return MixEditingMaterialType.PUGC_TEMPLATE;
                }
                if (asset.getAsset_type() == AssetType.AIGT.getValue()) {
                    return MixEditingMaterialType.AIGT;
                }
                if (asset.getAsset_type() == AssetType.SGT.getValue()) {
                    return MixEditingMaterialType.SGT;
                }
                if (asset.getAsset_type() == AssetType.UGC_TEMPLATE.getValue()) {
                    return MixEditingMaterialType.UGC_TEMPLATE;
                }
                if (asset.getAsset_type() == AssetType.LYRICS_RULE_TEMPLATE.getValue()) {
                    return MixEditingMaterialType.LYRICS_RULE_TEMPLATE;
                }
                return MixEditingMaterialType.CC_TEMPLATE;
            }
            if (asset_consumer_type == AssetConsumerType.AI_TEMPLATE.getValue()) {
                return MixEditingMaterialType.AI_TEMPLATE;
            }
            if (asset_consumer_type == AssetConsumerType.SOUND_SYNC.getValue()) {
                return MixEditingMaterialType.SOUND_SYNC;
            }
            if (asset_consumer_type == AssetConsumerType.AUTOCUT_INSERT_TEMPLATE.getValue()) {
                int asset_type = asset.getAsset_type();
                if (asset_type == AssetType.PUGC_TEMPLATE.getValue()) {
                    return MixEditingMaterialType.PUGC_TEMPLATE;
                }
                if (asset_type == AssetType.UGC_TEMPLATE.getValue()) {
                    return MixEditingMaterialType.UGC_TEMPLATE;
                }
                if (asset_type == AssetType.CAPCUT_TEMPLATE.getValue()) {
                    return MixEditingMaterialType.CC_TEMPLATE;
                }
                if (asset_type == AssetType.AIGT.getValue()) {
                    return MixEditingMaterialType.AIGT;
                }
                if (asset_type == AssetType.SGT.getValue()) {
                    return MixEditingMaterialType.SGT;
                }
                if (asset_type == AssetType.AUTOCUT_AI_TEMPLATE_V2.getValue()) {
                    return MixEditingMaterialType.AI_TEMPLATE;
                }
                if (asset_type == AssetType.AI_ALIVE_TEMPLATE.getValue()) {
                    return MixEditingMaterialType.AI_ALIVE_TEMPLATE;
                }
                if (asset_type == AssetType.AUTO_PICK_TEMPLATE.getValue()) {
                    return MixEditingMaterialType.AUTO_PICK_TEMPLATE;
                }
                return MixEditingMaterialType.CC_TEMPLATE;
            }
            if (asset_consumer_type == AssetConsumerType.AI_ALIVE_TEMPLATE.getValue()) {
                return MixEditingMaterialType.AI_ALIVE_TEMPLATE;
            }
            if (asset_consumer_type == AssetConsumerType.EOY_INSERT_TEMPLATE.getValue()) {
                return MixEditingMaterialType.PUGC_TEMPLATE;
            }
            if (asset_consumer_type == AssetConsumerType.AUTOPICK_INSERT_TEMPLATE.getValue()) {
                return MixEditingMaterialType.AUTO_PICK_TEMPLATE;
            }
            return MixEditingMaterialType.UNKNOWN_TYPE;
        }
        return MixEditingMaterialType.EFFECT_TYPE;
    }

    public static void LIZLLL(C1412800mru c1412800mru, AVMusic aVMusic, String str) {
        String strLIZIZ;
        AbstractC1412880ms2 abstractC1412880ms2;
        if (c1412800mru == null || (strLIZIZ = LIZIZ(c1412800mru)) == null) {
            return;
        }
        boolean z = true;
        if (strLIZIZ.length() == 0) {
            return;
        }
        C1412860ms0 c1412860ms0LIZ = c1412800mru.LIZ();
        if (c1412860ms0LIZ != null) {
            abstractC1412880ms2 = c1412860ms0LIZ.LIZIZ;
        } else {
            abstractC1412880ms2 = null;
        }
        if (abstractC1412880ms2 instanceof C1413070msL) {
            if (aVMusic != null) {
                aVMusic.setMusicSelectedFrom(str);
            }
            C1413070msL c1413070msL = (C1413070msL) abstractC1412880ms2;
            c1413070msL.LIZLLL = aVMusic;
            if (c1413070msL.LIZJ == null && aVMusic == null) {
                z = false;
            }
            c1413070msL.LIZ = z;
            return;
        }
        if (!(abstractC1412880ms2 instanceof C1413040msI)) {
            return;
        }
        if (aVMusic != null) {
            aVMusic.setMusicSelectedFrom(str);
        }
        C1413040msI c1413040msI = (C1413040msI) abstractC1412880ms2;
        c1413040msI.LIZLLL = aVMusic;
        if (c1413040msI.LIZJ == null && aVMusic == null) {
            z = false;
        }
        c1413040msI.LIZ = z;
    }
}
