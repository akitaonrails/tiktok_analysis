package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.FromAssetInfo;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsQueryAdditionalParameters;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsRequestBodyInfo;
import com.ss.android.ugc.effectmanager.effect.model.MixedItemAssetsRequestBodyInfo;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.text.a0;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.13RC, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13RC {
    public static final String LIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            str = C13LP.LJJLIIIJ(C13LZ.LJIILJJIL(0, jSONArray.length()), ",", null, null, 0, null, new AwS609S0100000_30(jSONArray, 0), 30);
            return str;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            a0.LJJIIZI(str, ",", false);
            return str;
        }
    }

    public static final Map<String, String> LIZIZ(MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters) {
        C13DA c13da = new C13DA();
        c13da.put("feature_list", mixedAssetsQueryAdditionalParameters.feature_list.getFirst());
        c13da.put("feature_codes", mixedAssetsQueryAdditionalParameters.feature_list.getSecond());
        c13da.put("protocol_version", mixedAssetsQueryAdditionalParameters.protocol_version);
        String str = mixedAssetsQueryAdditionalParameters.creation_id;
        if (str == null) {
            str = "";
        }
        c13da.put("creation_id", str);
        return c13da.build();
    }

    public static final Map<String, Object> LIZJ(MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo) {
        Object objInvoke;
        Pair<String, String> pairInvoke;
        C13DA c13da = new C13DA();
        String str = mixedAssetsRequestBodyInfo.panelKey;
        if (str != null) {
            c13da.put("panel_key", str);
        }
        List<Integer> list = mixedAssetsRequestBodyInfo.mediaCount;
        if (list != null) {
            c13da.put("media_count", list);
        }
        Integer num = mixedAssetsRequestBodyInfo.sumDuration;
        if (num != null) {
            c13da.put("sum_duration", Integer.valueOf(num.intValue()));
        }
        List<FromAssetInfo> list2 = mixedAssetsRequestBodyInfo.fromAssetList;
        if (list2 != null) {
            c13da.put("from_asset_list", list2);
        }
        Boolean bool = mixedAssetsRequestBodyInfo.needRecommend;
        if (bool != null) {
            c13da.put("need_recommend", Boolean.valueOf(bool.booleanValue()));
        }
        String str2 = mixedAssetsRequestBodyInfo.recommendKey;
        if (str2 != null) {
            c13da.put("recommend_key", str2);
        }
        Boolean bool2 = mixedAssetsRequestBodyInfo.showFilterReason;
        if (bool2 != null) {
            c13da.put("show_filtered_reason", Boolean.valueOf(bool2.booleanValue()));
        }
        String str3 = mixedAssetsRequestBodyInfo.recommendReqId;
        if (str3 != null) {
            c13da.put("recommend_req_id", str3);
        }
        String str4 = mixedAssetsRequestBodyInfo.creationId;
        if (str4 != null) {
            c13da.put("creation_id", str4);
        }
        String str5 = mixedAssetsRequestBodyInfo.shootWay;
        if (str5 != null) {
            c13da.put("shoot_way", str5);
        }
        String str6 = mixedAssetsRequestBodyInfo.contentType;
        if (str6 != null) {
            c13da.put("content_type", str6);
        }
        String str7 = mixedAssetsRequestBodyInfo.contentSource;
        if (str7 != null) {
            c13da.put("content_source", str7);
        }
        String str8 = mixedAssetsRequestBodyInfo.zipUri;
        if (str8 != null) {
            c13da.put("zip_uri", str8);
        }
        String str9 = mixedAssetsRequestBodyInfo.accountType;
        if (str9 != null) {
            c13da.put("account_type", str9);
        }
        Boolean bool3 = mixedAssetsRequestBodyInfo.allowPugc;
        if (bool3 != null) {
            c13da.put("allow_pugc", Boolean.valueOf(bool3.booleanValue()));
        }
        String str10 = mixedAssetsRequestBodyInfo.entrancePage;
        if (str10 != null) {
            c13da.put("entrance_page", str10);
        }
        String str11 = mixedAssetsRequestBodyInfo.reuseMusicId;
        if (str11 != null) {
            if (C296620Bjw.LIZ()) {
                Long lLJIILIIL = C2095008Iq.LJIILIIL(str11);
                if (lLJIILIIL != null) {
                    c13da.put("reuse_music_id", Long.valueOf(lLJIILIIL.longValue()));
                }
            } else {
                c13da.put("reuse_music_id", str11);
            }
        }
        Boolean bool4 = mixedAssetsRequestBodyInfo.newPath;
        if (bool4 != null) {
            c13da.put("new_path", Boolean.valueOf(bool4.booleanValue()));
        }
        Function0<Pair<String, String>> function0 = mixedAssetsRequestBodyInfo.uploadFramesResultProvider;
        if (function0 != null && (pairInvoke = function0.invoke()) != null) {
            c13da.put("zip_uri", pairInvoke.getFirst());
            c13da.put("rec_config", pairInvoke.getSecond());
        }
        Function0<Object> function02 = mixedAssetsRequestBodyInfo.recConfig;
        if (function02 != null && (objInvoke = function02.invoke()) != null) {
            c13da.put("rec_config", objInvoke);
        }
        List<Integer> list3 = mixedAssetsRequestBodyInfo.filterAssetTypeList;
        if (list3 != null) {
            c13da.put("filter_asset_type_list", list3);
        }
        String str12 = mixedAssetsRequestBodyInfo.defaultCategoryKey;
        if (str12 != null) {
            c13da.put("default_category_key", str12);
        }
        Boolean bool5 = mixedAssetsRequestBodyInfo.withoutAssetList;
        if (bool5 != null) {
            c13da.put("without_asset_list", Boolean.valueOf(bool5.booleanValue()));
        }
        c13da.put(Scene.SCENE_SERVICE, mixedAssetsRequestBodyInfo.scene);
        String str13 = mixedAssetsRequestBodyInfo.subScene;
        if (str13 != null) {
            c13da.put("sub_scene", str13);
        }
        File file = mixedAssetsRequestBodyInfo.zipBinary;
        if (file != null) {
            c13da.put("zip_binary", file);
        }
        Integer num2 = mixedAssetsRequestBodyInfo.effectiveConnectionType;
        if (num2 != null) {
            c13da.put("effective_connection_type", Integer.valueOf(num2.intValue()));
        }
        c13da.put("extra", mixedAssetsRequestBodyInfo.extra);
        c13da.put("asset_rec_feed_features", mixedAssetsRequestBodyInfo.recFeedFeatures);
        Boolean bool6 = mixedAssetsRequestBodyInfo.preCompute;
        if (bool6 != null) {
            c13da.put("pre_compute", Boolean.valueOf(bool6.booleanValue()));
        }
        Boolean bool7 = mixedAssetsRequestBodyInfo.enablePreloading;
        if (bool7 != null) {
            c13da.put("enable_preloading", Boolean.valueOf(bool7.booleanValue()));
        }
        c13da.put("media_info_list", mixedAssetsRequestBodyInfo.allMediaInfo);
        String str14 = mixedAssetsRequestBodyInfo.shotLanding;
        if (str14 != null) {
            c13da.put("shot_landing", str14);
        }
        return c13da.build();
    }

    public static final Map<String, Object> LIZLLL(MixedItemAssetsRequestBodyInfo mixedItemAssetsRequestBodyInfo) {
        C13DA c13da = new C13DA();
        c13da.put("asset_condition_list", mixedItemAssetsRequestBodyInfo.assetConditionList);
        Boolean bool = mixedItemAssetsRequestBodyInfo.showFilterReason;
        if (bool != null) {
            c13da.put("show_filtered_reason", Boolean.valueOf(bool.booleanValue()));
        }
        String str = mixedItemAssetsRequestBodyInfo.recConfig;
        if (str != null) {
            c13da.put("rec_config", str);
        }
        Boolean bool2 = mixedItemAssetsRequestBodyInfo.forceNoFilter;
        if (bool2 != null) {
            c13da.put("force_no_filter", Boolean.valueOf(bool2.booleanValue()));
        }
        List<Integer> list = mixedItemAssetsRequestBodyInfo.mediaCount;
        if (list != null) {
            c13da.put("media_count", list);
        }
        String str2 = mixedItemAssetsRequestBodyInfo.zipUri;
        if (str2 != null) {
            c13da.put("zip_uri", str2);
        }
        String str3 = mixedItemAssetsRequestBodyInfo.aiGcConfigJason;
        if (str3 != null) {
            c13da.put("aigc_config_json", str3);
        }
        c13da.put("extra", mixedItemAssetsRequestBodyInfo.extra);
        Boolean bool3 = mixedItemAssetsRequestBodyInfo.needCollectLabel;
        if (bool3 != null) {
            c13da.put("need_collect_label", Boolean.valueOf(bool3.booleanValue()));
        }
        if (mixedItemAssetsRequestBodyInfo.scene.length() > 0) {
            c13da.put(Scene.SCENE_SERVICE, mixedItemAssetsRequestBodyInfo.scene);
        }
        String str4 = mixedItemAssetsRequestBodyInfo.subScene;
        if (str4 != null) {
            c13da.put("sub_scene", str4);
        }
        return c13da.build();
    }
}
