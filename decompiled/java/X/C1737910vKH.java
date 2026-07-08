package X;

import com.ss.android.ugc.aweme.effectcreator.models.EffectCommandDataWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectObjectDataWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vKH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1737910vKH {
    public static final void LIZ(String str, Map<String, String> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("is_ame_data", "1");
        C336500DHc.LIZ.getClass();
        linkedHashMap.put("user_status_ame_published", String.valueOf(C336500DHc.LIZIZ));
        C1449260noi.LJ(str, linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:257:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0468 A[PHI: r9
      0x0468: PHI (r9v3 java.lang.String) = (r9v0 java.lang.String), (r9v4 java.lang.String) binds: [B:258:0x0466, B:256:0x0463] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x046c A[PHI: r9
      0x046c: PHI (r9v2 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String) binds: [B:258:0x0466, B:260:0x046a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.C1737830vK9 r17, X.C1738220vKm r18) {
        /*
            Method dump skipped, instruction units count: 1227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1737910vKH.LIZIZ(X.0vK9, X.0vKm):void");
    }

    public static final void LIZJ(C1737830vK9 c1737830vK9, C1738220vKm c1738220vKm) {
        List<EffectCommandDataWrapper> list;
        Object obj;
        List<EffectObjectDataWrapper> list2;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        String str;
        LIZIZ(c1737830vK9, c1738220vKm);
        EffectPackageDataWrapper effectPackageDataWrapper = c1737830vK9.LIZ;
        if (effectPackageDataWrapper != null && (list2 = effectPackageDataWrapper.objectDataList) != null) {
            for (EffectObjectDataWrapper effectObjectDataWrapper : list2) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("project_id", c1737830vK9.LIZ.projectId);
                linkedHashMap.put("enter_from", c1737830vK9.LIZ.enterFrom);
                linkedHashMap.put("ame_enter_from", c1737830vK9.LIZ.ameEnterFrom);
                linkedHashMap.put("loki_effect_id", c1737830vK9.LIZJ);
                linkedHashMap.put("ttep_effect_id", c1737830vK9.LJ);
                linkedHashMap.put("feature_id", effectObjectDataWrapper.featureId);
                if (!a0.LJJJIL(effectObjectDataWrapper.distortionStatus)) {
                    linkedHashMap.put("distortion_status", effectObjectDataWrapper.distortionStatus);
                }
                if (!effectObjectDataWrapper.liquifyStatus.isEmpty()) {
                    linkedHashMap.put("liquify_status", C13LP.LJJLIIIJ(effectObjectDataWrapper.liquifyStatus, ",", null, null, 0, null, null, 62));
                }
                linkedHashMap.put("feature_name", effectObjectDataWrapper.featureName);
                linkedHashMap.put("texture_from", effectObjectDataWrapper.textureFrom);
                if (!a0.LJJJIL(effectObjectDataWrapper.textureType)) {
                    linkedHashMap.put("texture_type", effectObjectDataWrapper.textureType);
                }
                linkedHashMap.put("asset_id", effectObjectDataWrapper.assetId);
                linkedHashMap.put("strength_num", effectObjectDataWrapper.strengthNum);
                linkedHashMap.put("feature_type", effectObjectDataWrapper.featureType);
                linkedHashMap.put("category_key", effectObjectDataWrapper.categories);
                boolean z = false;
                if (effectObjectDataWrapper.videoLength.length() > 0) {
                    linkedHashMap.put("video_length", effectObjectDataWrapper.videoLength);
                }
                if (effectObjectDataWrapper.templateResourceId.length() > 0) {
                    obj2 = "1";
                } else {
                    obj2 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_from_template", obj2);
                if (Intrinsics.LJFF(effectObjectDataWrapper.featureType, "ame_greenscreen")) {
                    obj3 = "1";
                } else {
                    obj3 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("if_contains_greenscreen_asset", obj3);
                if (effectObjectDataWrapper.distortionClass.length() > 0) {
                    linkedHashMap.put("distortion_class", effectObjectDataWrapper.distortionClass);
                }
                if (effectObjectDataWrapper.ameAssetId.length() > 0) {
                    linkedHashMap.put("ame_asset_id", effectObjectDataWrapper.ameAssetId);
                }
                if (effectObjectDataWrapper.trackingType.length() > 0) {
                    linkedHashMap.put("tracking_type", effectObjectDataWrapper.trackingType);
                }
                if (effectObjectDataWrapper.defaultTrackingType.length() > 0) {
                    linkedHashMap.put("default_tracking_type", effectObjectDataWrapper.defaultTrackingType);
                }
                if (effectObjectDataWrapper.shapeResId.length() > 0) {
                    linkedHashMap.put("shape_resource_id", effectObjectDataWrapper.shapeResId);
                }
                if (effectObjectDataWrapper.musicId.length() > 0) {
                    linkedHashMap.put("music_id", effectObjectDataWrapper.musicId);
                }
                if (effectObjectDataWrapper.musicName.length() > 0) {
                    linkedHashMap.put("music_name", effectObjectDataWrapper.musicName);
                }
                if (effectObjectDataWrapper.musicSearchTerm.length() > 0) {
                    linkedHashMap.put("music_search_term", effectObjectDataWrapper.musicSearchTerm);
                }
                if (Intrinsics.LJFF(effectObjectDataWrapper.addMethod, "onboarding")) {
                    obj4 = "1";
                } else {
                    obj4 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_onboarding", obj4);
                if (effectObjectDataWrapper.stickerAddFrom.length() > 0) {
                    linkedHashMap.put("sticker_add_from", effectObjectDataWrapper.stickerAddFrom);
                }
                if (effectObjectDataWrapper.giphyInputWord.length() > 0) {
                    linkedHashMap.put("giphy_input_word", effectObjectDataWrapper.giphyInputWord);
                }
                if (effectObjectDataWrapper.isFromCustomTab.length() > 0) {
                    linkedHashMap.put("is_from_custom_tab", effectObjectDataWrapper.isFromCustomTab);
                }
                if (effectObjectDataWrapper.isStickerImageCutout) {
                    obj5 = "1";
                } else {
                    obj5 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_sticker_image_cutout", obj5);
                if (effectObjectDataWrapper.facialCutoutArea.length() > 0) {
                    linkedHashMap.put("facial_cutout_area", effectObjectDataWrapper.facialCutoutArea);
                }
                if (effectObjectDataWrapper.cutoutTabFrom.length() > 0) {
                    linkedHashMap.put("cutout_tab_from", effectObjectDataWrapper.cutoutTabFrom);
                }
                String str2 = effectObjectDataWrapper.faceStretchMode;
                if (str2 != null) {
                    linkedHashMap.put("face_stretch_mode", str2);
                }
                String str3 = effectObjectDataWrapper.greenScreenCutoutStatus;
                if (str3 != null) {
                    linkedHashMap.put("greenscreen_cutout_status", str3);
                }
                String str4 = effectObjectDataWrapper.greenScreenType;
                if (str4 != null) {
                    linkedHashMap.put("greenscreen_type", str4);
                }
                EffectPackageDataWrapper effectPackageDataWrapper2 = c1737830vK9.LIZ;
                if (effectPackageDataWrapper2 == null || (str = effectPackageDataWrapper2.ameAigcEnterFrom) == null) {
                    str = "";
                }
                if (str.length() == 0) {
                    z = true;
                }
                if (!z) {
                    linkedHashMap.put("if_ame_aigc_effect", "1");
                    linkedHashMap.put("ame_aigc_enter_from", str);
                } else {
                    linkedHashMap.put("if_ame_aigc_effect", CardStruct.IStatusCode.DEFAULT);
                }
                LIZ("effect_object_detail", linkedHashMap);
            }
        }
        EffectPackageDataWrapper effectPackageDataWrapper3 = c1737830vK9.LIZ;
        if (effectPackageDataWrapper3 != null && (list = effectPackageDataWrapper3.commandDataList) != null) {
            for (EffectCommandDataWrapper effectCommandDataWrapper : list) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("project_id", c1737830vK9.LIZ.projectId);
                linkedHashMap2.put("loki_effect_id", c1737830vK9.LIZJ);
                linkedHashMap2.put("ttep_effect_id", c1737830vK9.LJ);
                if (effectCommandDataWrapper.isValid) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap2.put("is_valid", obj);
                linkedHashMap2.put("index", String.valueOf(effectCommandDataWrapper.index));
                linkedHashMap2.put("command_add_from", effectCommandDataWrapper.commandAddFrom);
                linkedHashMap2.put("trigger_cnt", String.valueOf(effectCommandDataWrapper.triggerCount));
                linkedHashMap2.put("action_cnt", String.valueOf(effectCommandDataWrapper.actionCount));
                linkedHashMap2.put("valid_action_cnt", String.valueOf(effectCommandDataWrapper.validActionCount));
                linkedHashMap2.put("valid_object_cnt", String.valueOf(effectCommandDataWrapper.validObjectCount));
                if (!effectCommandDataWrapper.triggerNameList.isEmpty()) {
                    linkedHashMap2.put("trigger_name_list", C13LP.LJJLIIIJ(effectCommandDataWrapper.triggerNameList, ",", null, null, 0, null, null, 62));
                }
                if (!effectCommandDataWrapper.actionNameList.isEmpty()) {
                    linkedHashMap2.put("action_name_list", C13LP.LJJLIIIJ(effectCommandDataWrapper.actionNameList, ",", null, null, 0, null, null, 62));
                }
                LIZ("effect_command_detail", linkedHashMap2);
            }
        }
    }
}
