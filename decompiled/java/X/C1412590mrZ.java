package X;

import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.TemplateMobParams;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetConsumerType;
import com.ss.android.ugc.effectmanager.effect.model.AssetFrom;
import com.ss.android.ugc.effectmanager.effect.model.AssetPanelModelKt;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS261S0000000_22;

/* JADX INFO: renamed from: X.0mrZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412590mrZ {
    public static final String LIZJ(VideoPublishEditModel videoPublishEditModel) {
        StringBuilder sb = new StringBuilder();
        Iterator<EffectPointModel> it2 = videoPublishEditModel.creativeModel.editEffectModel.effectList.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next().getResourceId());
        }
        EffectPointModel effectPointModel = videoPublishEditModel.creativeModel.editEffectModel.timeEffect;
        if (effectPointModel != null) {
            sb.append(effectPointModel.getResourceId());
        }
        return sb.toString();
    }

    public static final String LIZLLL(Integer num) {
        EnumC1412600mra enumC1412600mra = EnumC1412600mra.EFFECT_TEMPLATE;
        int value = enumC1412600mra.getValue();
        if (num != null && num.intValue() == value) {
            return C1412630mrd.LIZJ(enumC1412600mra);
        }
        EnumC1412600mra enumC1412600mra2 = EnumC1412600mra.EFFECT_MUSIC_TEMPLATE;
        int value2 = enumC1412600mra2.getValue();
        if (num != null && num.intValue() == value2) {
            return C1412630mrd.LIZJ(enumC1412600mra2);
        }
        return null;
    }

    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        c0lab.LJ("effect_selected_from", videoPublishEditModel.getEditEffectSelectionStr(true, false));
        c0lab.LJ("effect_entrance_position", C13LP.LJJLIIIJ(videoPublishEditModel.getEffectList(), ",", null, null, 0, null, AFwS261S0000000_22.get$arr$(274), 30));
        c0lab.LJ("effect_index", videoPublishEditModel.getEditEffectIndexStr(true));
    }

    @InterfaceC1294060jmO
    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel, C1403560md0 c1403560md0) {
        c1403560md0.LJ("effect_list", C1403680mdC.LIZJ(videoPublishEditModel));
        String stickerID = videoPublishEditModel.getStickerID();
        String strLIZIZ = "";
        if (stickerID == null) {
            stickerID = "";
        }
        for (EffectPointModel effectPointModel : videoPublishEditModel.getEffectList()) {
            if (C1403700mdE.LIZLLL(effectPointModel)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(stickerID);
                sbLIZ.append(effectPointModel.getKey());
                sbLIZ.append(',');
                stickerID = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        c1403560md0.LJ("prop_list", stickerID);
        String propSource = videoPublishEditModel.getPropSource();
        if (propSource != null) {
            strLIZIZ = propSource;
        }
        for (EffectPointModel effectPointModel2 : videoPublishEditModel.getEffectList()) {
            if (C1403700mdE.LIZLLL(effectPointModel2)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(effectPointModel2.getSelectFrom());
                sbLIZ2.append(',');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        c1403560md0.LJ("prop_selected_from", strLIZIZ);
    }

    public static final TemplateMobParams LJ(Asset asset, C1412800mru c1412800mru) {
        int value;
        String str;
        MixEditingMaterialType mixEditingMaterialType;
        String music_id;
        int i;
        AssetConsumerType assetConsumerType = AssetPanelModelKt.toAssetConsumerType(asset.getAsset_consumer_type());
        AssetType assetType = AssetPanelModelKt.toAssetType(asset.getAsset_type());
        boolean music_post_unavailable = false;
        if (assetType == AssetType.SOUND_SYNC) {
            value = EnumC1412600mra.SOUND_SYNC_TEMPLATE.getValue();
        } else if (assetConsumerType == AssetConsumerType.EDIT_EFFECT) {
            if (C123100dR.LIZ(asset.getBusiness_extra().getMusic_id())) {
                value = EnumC1412600mra.EFFECT_MUSIC_TEMPLATE.getValue();
            } else {
                value = EnumC1412600mra.EFFECT_TEMPLATE.getValue();
            }
        } else {
            EnumC1412640mre enumC1412640mreLIZ = C1412250mr1.LIZ(asset);
            if (enumC1412640mreLIZ != null) {
                value = enumC1412640mreLIZ.getValue();
            } else {
                value = 0;
            }
        }
        if (c1412800mru == null || (str = c1412800mru.LJI) == null) {
            str = "edit_page_mix_material";
        }
        Integer numValueOf = null;
        if (c1412800mru != null) {
            mixEditingMaterialType = c1412800mru.LIZ;
        } else {
            mixEditingMaterialType = null;
        }
        String str2 = "";
        if (mixEditingMaterialType == MixEditingMaterialType.EFFECT_TYPE && !c1412800mru.LJFF) {
            str = "";
        }
        if (assetType == null || ((i = C1412680mri.LIZ[assetType.ordinal()]) != 1 && i != 2 && i != 3)) {
            music_id = asset.getBusiness_extra().getMusic_id();
            if (music_id == null) {
                music_id = "";
            }
        } else {
            music_id = asset.getAsset_id();
        }
        String resource_id = asset.getResource_id();
        String template_group_id = asset.getBusiness_extra().getTemplate_group_id();
        if (template_group_id == null) {
            template_group_id = "";
        }
        String template_tag = asset.getBusiness_extra().getTemplate_tag();
        if (template_tag != null) {
            str2 = template_tag;
        }
        String asset_id = asset.getAsset_id();
        if (C296620Bjw.LIZ()) {
            Boolean music_unavailable_in_post = asset.getBusiness_extra().getMusic_unavailable_in_post();
            if (music_unavailable_in_post != null) {
                music_post_unavailable = music_unavailable_in_post.booleanValue();
            }
        } else {
            music_post_unavailable = asset.getBusiness_extra().getMusic_post_unavailable();
        }
        String anchor_name = asset.getBusiness_extra().getAnchor_name();
        if (c1412800mru != null) {
            if (c1412800mru.LJFF) {
                numValueOf = asset.getBusiness_extra().getAsset_from();
            } else {
                numValueOf = Integer.valueOf(AssetFrom.CLIENT_INSERT.getValue());
            }
        }
        return new TemplateMobParams(resource_id, str, template_group_id, asset_id, value, str2, anchor_name, music_id, Boolean.valueOf(music_post_unavailable), numValueOf, asset.getBusiness_extra().getScene_type());
    }
}
