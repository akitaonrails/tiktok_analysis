package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.infra.FeatureRecommendScoreTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pNE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509100pNE extends C1509180pNM {
    public static final C1509100pNE LIZ = new C1509100pNE();

    @Override // X.C1509180pNM
    public final void LIZIZ(C1510230pP3 c1510230pP3, C1509310pNZ c1509310pNZ) {
        InputFeaturesConfig features;
        FeatureRecommendScoreTypeConfig fTypeRecommendScore;
        Object feature$default;
        Object feature$default2;
        Object feature$default3;
        Object feature$default4;
        Object feature$default5;
        List list;
        String aid;
        Object feature$default6;
        List list2;
        List list3;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig == null || (features = smartSceneConfig.getFeatures()) == null || (fTypeRecommendScore = features.getFTypeRecommendScore()) == null || !fTypeRecommendScore.getEnable()) {
            return;
        }
        Map<String, Object> mapLIZIZ = c1509310pNZ.LIZIZ();
        try {
            Aweme awemeLIZ = C1511360pQs.LIZ(c1509310pNZ);
            JSONObject jSONObjectPut = new JSONObject().put("aweme", awemeLIZ);
            List<String> subTypeList = fTypeRecommendScore.getSubTypeList();
            if (subTypeList != null) {
                FeatureServiceManager.Companion.getClass();
                FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_recommend_score", 0, 2, null);
                for (String str : subTypeList) {
                    if (Intrinsics.LJFF(str, "all")) {
                        if (producer$default != null) {
                            feature$default = FeatureProducer.getFeature$default(producer$default, "cover", jSONObjectPut, c1510230pP3.LIZ, (ReturnCode) null, 8, (Object) null);
                        } else {
                            feature$default = null;
                        }
                        mapLIZIZ.put("music_score", feature$default);
                        if (producer$default != null) {
                            feature$default2 = FeatureProducer.getFeature$default(producer$default, "click_comment", jSONObjectPut, c1510230pP3.LIZ, (ReturnCode) null, 8, (Object) null);
                        } else {
                            feature$default2 = null;
                        }
                        mapLIZIZ.put("click_comment_score", feature$default2);
                        if (producer$default != null) {
                            feature$default3 = FeatureProducer.getFeature$default(producer$default, "head", jSONObjectPut, c1510230pP3.LIZ, (ReturnCode) null, 8, (Object) null);
                        } else {
                            feature$default3 = null;
                        }
                        mapLIZIZ.put("head_score", feature$default3);
                    } else if (Intrinsics.LJFF(str, "play_time_prob_dist")) {
                        try {
                            FeatureServiceManager.Companion.getClass();
                            FeatureProducer producer$default2 = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_feed", 0, 2, null);
                            if (producer$default2 != null) {
                                feature$default5 = FeatureProducer.getFeature$default(producer$default2, "play_time_prob_dist", jSONObjectPut, c1510230pP3.LIZ, (ReturnCode) null, 8, (Object) null);
                            } else {
                                feature$default5 = null;
                            }
                            if (feature$default5 instanceof List) {
                                list = (List) feature$default5;
                            } else {
                                list = null;
                            }
                            if (list != null) {
                                int i = 0;
                                for (Object obj : list) {
                                    int i2 = i + 1;
                                    if (i >= 0) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("play_time_prob_dist_");
                                        sbLIZ.append(i);
                                        mapLIZIZ.put(C2188811AlT.LIZIZ(sbLIZ), obj);
                                        i = i2;
                                    } else {
                                        C1697810uHb.LJIJI();
                                        throw null;
                                    }
                                }
                            }
                            if (fTypeRecommendScore.getRange() > 0) {
                                int range = fTypeRecommendScore.getRange();
                                if (awemeLIZ != null) {
                                    aid = awemeLIZ.getAid();
                                } else {
                                    aid = null;
                                }
                                JSONObject jSONObjectLIZ = C1509400pNi.LIZ(range, aid, fTypeRecommendScore.getRangeExcludeThis(), true, false);
                                if (producer$default2 != null) {
                                    feature$default6 = FeatureProducer.getFeature$default(producer$default2, "play_time_prob_dist", jSONObjectLIZ, c1510230pP3.LIZ, (ReturnCode) null, 8, (Object) null);
                                } else {
                                    feature$default6 = null;
                                }
                                if ((feature$default6 instanceof List) && (list2 = (List) feature$default6) != null) {
                                    int size = list2.size();
                                    for (int i3 = 0; i3 < size; i3++) {
                                        Object obj2 = list2.get(i3);
                                        if ((obj2 instanceof List) && (list3 = (List) obj2) != null) {
                                            int size2 = list3.size();
                                            for (int i4 = 0; i4 < size2; i4++) {
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("play_time_prob_dist_");
                                                sbLIZ2.append(i3);
                                                sbLIZ2.append('_');
                                                sbLIZ2.append(i4);
                                                mapLIZIZ.put(C2188811AlT.LIZIZ(sbLIZ2), list3.get(i4));
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C1337780kuu.LIZ(th, null, 6);
                        }
                    } else {
                        if (producer$default == null) {
                            feature$default4 = null;
                        } else {
                            feature$default4 = FeatureProducer.getFeature$default(producer$default, str, jSONObjectPut, c1510230pP3.LIZ, (ReturnCode) null, 8, (Object) null);
                        }
                        mapLIZIZ.put(str, feature$default4);
                    }
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1337780kuu.LIZ(th2, null, 6);
        }
    }
}
