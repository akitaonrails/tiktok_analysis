package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.infra.FeatureSceneTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pNe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509360pNe extends C1509180pNM {
    public static final C1509360pNe LIZ = new C1509360pNe();
    public static int LIZIZ;

    @Override // X.C1509180pNM
    public final void LIZ(C1510230pP3 c1510230pP3) {
        InputFeaturesConfig features;
        FeatureSceneTypeConfig fTypeComment;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig != null && smartSceneConfig != null && (features = smartSceneConfig.getFeatures()) != null && (fTypeComment = features.getFTypeComment()) != null && fTypeComment.getEnable()) {
            FeatureServiceManager.Companion.getClass();
            FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_comment", 0, 2, null);
            if (producer$default != null) {
                producer$default.enableProducer((List<FeatureItem>) null);
            }
        }
    }

    @Override // X.C1509180pNM
    public final void LIZIZ(C1510230pP3 c1510230pP3, C1509310pNZ c1509310pNZ) {
        InputFeaturesConfig features;
        FeatureSceneTypeConfig fTypeComment;
        String aid;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig != null && (features = smartSceneConfig.getFeatures()) != null && (fTypeComment = features.getFTypeComment()) != null && fTypeComment.getEnable() && fTypeComment.getRange() > 0) {
            LIZIZ = fTypeComment.getRange();
            try {
                int range = fTypeComment.getRange();
                Aweme awemeLIZ = C1511360pQs.LIZ(c1509310pNZ);
                if (awemeLIZ != null) {
                    aid = awemeLIZ.getAid();
                } else {
                    aid = null;
                }
                JSONObject jSONObjectLIZ = C1509400pNi.LIZ(range, aid, fTypeComment.getRangeExcludeThis(), true, false);
                FeatureServiceManager.Companion.getClass();
                FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_comment", 0, 2, null);
                if (producer$default == null) {
                    return;
                }
                LIZJ(producer$default, c1509310pNZ, "post_comment", "post_comment", jSONObjectLIZ, c1510230pP3.LIZ);
                LIZJ(producer$default, c1509310pNZ, "like_comment", "like_comment", jSONObjectLIZ, c1510230pP3.LIZ);
                LIZJ(producer$default, c1509310pNZ, "post_reply_comment", "post_reply_comment", jSONObjectLIZ, c1510230pP3.LIZ);
                LIZJ(producer$default, c1509310pNZ, "comment_duration", "comment_duration", jSONObjectLIZ, c1510230pP3.LIZ);
                LIZJ(producer$default, c1509310pNZ, "favorite_comment", "favorite_comment", jSONObjectLIZ, c1510230pP3.LIZ);
                LIZJ(producer$default, c1509310pNZ, "comment_trending_words_show", "comment_trending_words_show", jSONObjectLIZ, c1510230pP3.LIZ);
                LIZJ(producer$default, c1509310pNZ, "comment_trending_words_click", "comment_trending_words_click", jSONObjectLIZ, c1510230pP3.LIZ);
                LIZJ(producer$default, c1509310pNZ, "post_comment_cnt", "post_comment_cnt", jSONObjectLIZ, c1510230pP3.LIZ);
                LIZJ(producer$default, c1509310pNZ, "like_comment_cnt", "like_comment_cnt", jSONObjectLIZ, c1510230pP3.LIZ);
                LIZJ(producer$default, c1509310pNZ, "post_reply_comment_cnt", "post_reply_comment_cnt", jSONObjectLIZ, c1510230pP3.LIZ);
                LIZJ(producer$default, c1509310pNZ, "total_comment_duration", "total_comment_duration", jSONObjectLIZ, c1510230pP3.LIZ);
                LIZJ(producer$default, c1509310pNZ, "favorite_comment_cnt", "favorite_comment_cnt", jSONObjectLIZ, c1510230pP3.LIZ);
                LIZJ(producer$default, c1509310pNZ, "comment_trending_words_show_cnt", "comment_trending_words_show_cnt", jSONObjectLIZ, c1510230pP3.LIZ);
                LIZJ(producer$default, c1509310pNZ, "comment_trending_words_click_cnt", "comment_trending_words_click_cnt", jSONObjectLIZ, c1510230pP3.LIZ);
                if (c1509310pNZ.LIZLLL) {
                    LIZJ(producer$default, c1509310pNZ, "aid", "aweme_comment_aid", jSONObjectLIZ, c1510230pP3.LIZ);
                }
                LIZJ(producer$default, c1509310pNZ, "g_post_comment", "g_post_comment", null, c1510230pP3.LIZ);
                LIZJ(producer$default, c1509310pNZ, "g_like_comment", "g_like_comment", null, c1510230pP3.LIZ);
                LIZJ(producer$default, c1509310pNZ, "g_post_reply_comment", "g_post_reply_comment", null, c1510230pP3.LIZ);
                LIZJ(producer$default, c1509310pNZ, "g_comment_duration", "g_comment_duration", null, c1510230pP3.LIZ);
                LIZJ(producer$default, c1509310pNZ, "g_favorite_comment", "g_favorite_comment", null, c1510230pP3.LIZ);
                LIZJ(producer$default, c1509310pNZ, "g_comment_trending_words_show", "g_comment_trending_words_show", null, c1510230pP3.LIZ);
                LIZJ(producer$default, c1509310pNZ, "g_comment_trending_words_click", "g_comment_trending_words_click", null, c1510230pP3.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1337780kuu.LIZ(th, null, 6);
            }
        }
    }

    public static final Object LIZJ(FeatureProducer featureProducer, C1509310pNZ c1509310pNZ, String str, String str2, JSONObject jSONObject, String str3) {
        Object feature$default = FeatureProducer.getFeature$default(featureProducer, str2, jSONObject, str3, (ReturnCode) null, 8, (Object) null);
        Map<String, Object> mapLIZIZ = c1509310pNZ.LIZIZ();
        if (feature$default instanceof ArrayList) {
            int i = LIZIZ;
            for (Object obj : (Iterable) feature$default) {
                i--;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('_');
                sbLIZ.append(i);
                mapLIZIZ.put(C2188811AlT.LIZIZ(sbLIZ), obj);
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
