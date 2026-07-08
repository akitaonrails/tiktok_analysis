package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.ml.infra.FeatureFeedTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pNb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509330pNb extends C1509180pNM {
    public static final C1509330pNb LIZ = new C1509330pNb();

    @Override // X.C1509180pNM
    public final void LIZIZ(C1510230pP3 c1510230pP3, C1509310pNZ c1509310pNZ) throws JSONException {
        InputFeaturesConfig features;
        FeatureFeedTypeConfig fTypeFeed;
        Aweme awemeLIZ;
        List<String> listLJJLIIIJILLIZJL;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        String aid = null;
        if (smartSceneConfig == null || (features = smartSceneConfig.getFeatures()) == null || (fTypeFeed = features.getFTypeFeed()) == null || !fTypeFeed.getEnable() || (awemeLIZ = C1511360pQs.LIZ(c1509310pNZ)) == null) {
            return;
        }
        c1509310pNZ.LIZIZ();
        boolean z = c1509310pNZ.LIZLLL;
        if (fTypeFeed.getSkipPrivate() && AwemeExtKt.isPrivateV2(awemeLIZ)) {
            return;
        }
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_feed", 0, 2, null);
        if (producer$default == null) {
            return;
        }
        JSONObject jSONObjectPut = new JSONObject().put("aweme", awemeLIZ);
        LIZJ(producer$default, c1509310pNZ, "v_like_cnt", "all_like", jSONObjectPut, c1510230pP3.LIZ);
        LIZJ(producer$default, c1509310pNZ, "v_share_cnt", "all_share", jSONObjectPut, c1510230pP3.LIZ);
        LIZJ(producer$default, c1509310pNZ, "v_comment_cnt", "all_comment", jSONObjectPut, c1510230pP3.LIZ);
        LIZJ(producer$default, c1509310pNZ, "v_download_cnt", "all_download", jSONObjectPut, c1510230pP3.LIZ);
        LIZJ(producer$default, c1509310pNZ, "v_forward_cnt", "all_forward", jSONObjectPut, c1510230pP3.LIZ);
        LIZJ(producer$default, c1509310pNZ, "v_play_count", "all_play", jSONObjectPut, c1510230pP3.LIZ);
        LIZJ(producer$default, c1509310pNZ, "v_music_used_count", "music_used_count", jSONObjectPut, c1510230pP3.LIZ);
        LIZJ(producer$default, c1509310pNZ, "v_duration", "duration", jSONObjectPut, c1510230pP3.LIZ);
        LIZJ(producer$default, c1509310pNZ, "v_type_ad", "type_ad", jSONObjectPut, c1510230pP3.LIZ);
        LIZJ(producer$default, c1509310pNZ, "v_type_long", "type_long", jSONObjectPut, c1510230pP3.LIZ);
        LIZJ(producer$default, c1509310pNZ, "v_type_mix", "type_mix", jSONObjectPut, c1510230pP3.LIZ);
        LIZJ(producer$default, c1509310pNZ, "v_type_live", "type_live", jSONObjectPut, c1510230pP3.LIZ);
        LIZJ(producer$default, c1509310pNZ, "v_type_photos", "type_photos", jSONObjectPut, c1510230pP3.LIZ);
        LIZJ(producer$default, c1509310pNZ, "v_type_photo_mode", "type_photo_mode", jSONObjectPut, c1510230pP3.LIZ);
        LIZJ(producer$default, c1509310pNZ, "v_type_text_mode", "type_text_mode", jSONObjectPut, c1510230pP3.LIZ);
        LIZJ(producer$default, c1509310pNZ, "v_follow_status", "follow_status", jSONObjectPut, c1510230pP3.LIZ);
        LIZJ(producer$default, c1509310pNZ, "v_follow_status2", "follow_status2", jSONObjectPut, c1510230pP3.LIZ);
        LIZJ(producer$default, c1509310pNZ, "v_ah_live", "ah_live", jSONObjectPut, c1510230pP3.LIZ);
        String awemeSubType = fTypeFeed.getAwemeSubType();
        if (awemeSubType != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(awemeSubType, new String[]{"|"}, 0, 6)) != null) {
            for (String str : listLJJLIIIJILLIZJL) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("v_reflect_");
                sbLIZ.append(str);
                LIZJ(producer$default, c1509310pNZ, C2188811AlT.LIZIZ(sbLIZ), str, jSONObjectPut, c1510230pP3.LIZ);
            }
        }
        boolean zContainSubType = fTypeFeed.containSubType("feed");
        if (fTypeFeed.getRange() > 0 && zContainSubType) {
            int range = fTypeFeed.getRange();
            Aweme awemeLIZ2 = C1511360pQs.LIZ(c1509310pNZ);
            if (awemeLIZ2 != null) {
                aid = awemeLIZ2.getAid();
            }
            JSONObject jSONObjectLIZ = C1509400pNi.LIZ(range, aid, fTypeFeed.getRangeExcludeThis(), true, false);
            LIZJ(producer$default, c1509310pNZ, "v_like", "all_like", jSONObjectLIZ, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "v_comment", "all_comment", jSONObjectLIZ, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "v_share", "all_share", jSONObjectLIZ, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "v_forward", "all_forward", jSONObjectLIZ, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "v_download", "all_download", jSONObjectLIZ, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "v_duration", "duration", jSONObjectLIZ, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "v_play", "all_play", jSONObjectLIZ, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "v_type_ad", "type_ad", jSONObjectLIZ, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "v_type_mix", "type_mix", jSONObjectLIZ, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "v_type_live", "type_live", jSONObjectLIZ, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "v_type_photos", "type_photos", jSONObjectLIZ, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "v_type_photo_mode", "type_photo_mode", jSONObjectLIZ, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "v_type_text_mode", "type_text_mode", jSONObjectLIZ, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "v_type_long", "type_long", jSONObjectLIZ, c1510230pP3.LIZ);
            LIZJ(producer$default, c1509310pNZ, "v_follow_status", "follow_status", jSONObjectLIZ, c1510230pP3.LIZ);
            if (z) {
                LIZJ(producer$default, c1509310pNZ, "v_aid", "aid", jSONObjectLIZ, c1510230pP3.LIZ);
            }
        }
    }

    public static final Object LIZJ(FeatureProducer featureProducer, C1509310pNZ c1509310pNZ, String str, String str2, JSONObject jSONObject, String str3) {
        Object feature$default = FeatureProducer.getFeature$default(featureProducer, str2, jSONObject, str3, (ReturnCode) null, 8, (Object) null);
        Map<String, Object> mapLIZIZ = c1509310pNZ.LIZIZ();
        if (feature$default instanceof ArrayList) {
            int i = 0;
            for (Object obj : (Iterable) feature$default) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('_');
                sbLIZ.append(i);
                mapLIZIZ.put(C2188811AlT.LIZIZ(sbLIZ), obj);
                i++;
            }
            return feature$default;
        }
        if (feature$default == null) {
            return null;
        }
        mapLIZIZ.put(str, feature$default);
        return feature$default;
    }
}
