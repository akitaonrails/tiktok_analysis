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

/* JADX INFO: renamed from: X.0pN8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509040pN8 extends C1509180pNM {
    public static final C1509040pN8 LIZ = new C1509040pN8();

    @Override // X.C1509180pNM
    public final void LIZ(C1510230pP3 c1510230pP3) {
        InputFeaturesConfig features;
        FeatureSceneTypeConfig fTypeSearch;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig != null && smartSceneConfig != null && (features = smartSceneConfig.getFeatures()) != null && (fTypeSearch = features.getFTypeSearch()) != null && fTypeSearch.getEnable()) {
            FeatureServiceManager.Companion.getClass();
            FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_search", 0, 2, null);
            if (producer$default != null) {
                producer$default.enableProducer((List<FeatureItem>) null);
            }
        }
    }

    @Override // X.C1509180pNM
    public final void LIZIZ(C1510230pP3 c1510230pP3, C1509310pNZ c1509310pNZ) {
        InputFeaturesConfig features;
        FeatureSceneTypeConfig fTypeSearch;
        String aid;
        Float f;
        Float f2;
        Float f3;
        Float f4;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig == null || (features = smartSceneConfig.getFeatures()) == null || (fTypeSearch = features.getFTypeSearch()) == null || !fTypeSearch.getEnable()) {
            return;
        }
        try {
            Map<String, Object> mapLIZIZ = c1509310pNZ.LIZIZ();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("range", fTypeSearch.getRange());
            FeatureServiceManager.Companion.getClass();
            FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_search", 0, 2, null);
            if (producer$default == null) {
                return;
            }
            mapLIZIZ.put("search_satisfied_times", FeatureProducer.getFeature$default(producer$default, "search_satisfied_times", jSONObject, c1510230pP3.LIZ, (ReturnCode) null, 8, (Object) null));
            mapLIZIZ.put("search_satisfied_rate", FeatureProducer.getFeature$default(producer$default, "search_satisfied_rate", jSONObject, c1510230pP3.LIZ, (ReturnCode) null, 8, (Object) null));
            mapLIZIZ.put("g_search_cnt", FeatureProducer.getFeature$default(producer$default, "g_search_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
            mapLIZIZ.put("g_manual_search_cnt", FeatureProducer.getFeature$default(producer$default, "g_manual_search_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
            mapLIZIZ.put("passive_search_cnt", FeatureProducer.getFeature$default(producer$default, "passive_search_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
            mapLIZIZ.put("g_comment_related_search_cnt", FeatureProducer.getFeature$default(producer$default, "g_comment_related_search_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
            mapLIZIZ.put("comment_highlight_search_click_cnt", FeatureProducer.getFeature$default(producer$default, "comment_highlight_search_click_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
            mapLIZIZ.put("comment_highlight_search_show_cnt", FeatureProducer.getFeature$default(producer$default, "comment_highlight_search_show_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
            mapLIZIZ.put("comment_highlight_search_ctr", FeatureProducer.getFeature$default(producer$default, "comment_highlight_search_ctr", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
            mapLIZIZ.put("history_search_show_cnt", FeatureProducer.getFeature$default(producer$default, "history_search_show_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
            mapLIZIZ.put("history_search_click_cnt", FeatureProducer.getFeature$default(producer$default, "history_search_click_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
            mapLIZIZ.put("history_search_ctr", FeatureProducer.getFeature$default(producer$default, "history_search_ctr", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
            mapLIZIZ.put("g_search_feedbar_search_show_cnt", FeatureProducer.getFeature$default(producer$default, "g_search_feedbar_search_show_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
            FeatureProducer featureProducer = producer$default;
            mapLIZIZ.put("g_related_search_anchor_cnt", FeatureProducer.getFeature$default(featureProducer, "g_related_search_anchor_cnt", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
            for (int i = 0; i < 4; i++) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("comment_highlight_search_show_");
                sbLIZ.append(i);
                featureProducer = featureProducer;
                Object feature$default = FeatureProducer.getFeature$default(featureProducer, C2188811AlT.LIZIZ(sbLIZ), (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null);
                if ((feature$default instanceof Float) && (f3 = (Float) feature$default) != null) {
                    float fFloatValue = f3.floatValue();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("comment_highlight_search_click_");
                    sbLIZ2.append(i);
                    featureProducer = featureProducer;
                    Object feature$default2 = FeatureProducer.getFeature$default(featureProducer, C2188811AlT.LIZIZ(sbLIZ2), (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null);
                    if ((feature$default2 instanceof Float) && (f4 = (Float) feature$default2) != null) {
                        float fFloatValue2 = f4.floatValue();
                        if (fFloatValue <= 0.0f) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("comment_highlight_search_ctr_");
                            sbLIZ3.append(i);
                            mapLIZIZ.put(C2188811AlT.LIZIZ(sbLIZ3), 0);
                        } else {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("comment_highlight_search_ctr_");
                            sbLIZ4.append(i);
                            mapLIZIZ.put(C2188811AlT.LIZIZ(sbLIZ4), Float.valueOf(fFloatValue2 / fFloatValue));
                        }
                    }
                }
            }
            for (int i2 = 0; i2 < 5; i2++) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("history_search_show_");
                sbLIZ5.append(i2);
                featureProducer = featureProducer;
                Object feature$default3 = FeatureProducer.getFeature$default(featureProducer, C2188811AlT.LIZIZ(sbLIZ5), (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null);
                if ((feature$default3 instanceof Float) && (f = (Float) feature$default3) != null) {
                    float fFloatValue3 = f.floatValue();
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("history_search_click_");
                    sbLIZ6.append(i2);
                    featureProducer = featureProducer;
                    Object feature$default4 = FeatureProducer.getFeature$default(featureProducer, C2188811AlT.LIZIZ(sbLIZ6), (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null);
                    if ((feature$default4 instanceof Float) && (f2 = (Float) feature$default4) != null) {
                        float fFloatValue4 = f2.floatValue();
                        if (fFloatValue3 <= 0.0f) {
                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                            sbLIZ7.append("history_search_ctr_");
                            sbLIZ7.append(i2);
                            mapLIZIZ.put(C2188811AlT.LIZIZ(sbLIZ7), 0);
                        } else {
                            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                            sbLIZ8.append("history_search_ctr_");
                            sbLIZ8.append(i2);
                            mapLIZIZ.put(C2188811AlT.LIZIZ(sbLIZ8), Float.valueOf(fFloatValue4 / fFloatValue3));
                        }
                    }
                }
            }
            int i3 = 0;
            do {
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("history_search_keyword_cnt_");
                sbLIZ9.append(i3);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ9);
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append("history_search_keyword_cnt_");
                sbLIZ10.append(i3);
                FeatureProducer featureProducer2 = featureProducer;
                mapLIZIZ.put(strLIZIZ, FeatureProducer.getFeature$default(featureProducer2, C2188811AlT.LIZIZ(sbLIZ10), (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                sbLIZ11.append("history_show_source_");
                sbLIZ11.append(i3);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ11);
                StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                sbLIZ12.append("history_show_source_");
                sbLIZ12.append(i3);
                featureProducer = featureProducer2;
                mapLIZIZ.put(strLIZIZ2, FeatureProducer.getFeature$default(featureProducer, C2188811AlT.LIZIZ(sbLIZ12), (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
                if (c1509310pNZ.LIZLLL) {
                    StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                    sbLIZ13.append("history_search_click_");
                    sbLIZ13.append(i3);
                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ13);
                    StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                    sbLIZ14.append("history_search_click_");
                    sbLIZ14.append(i3);
                    featureProducer = featureProducer;
                    mapLIZIZ.put(strLIZIZ3, FeatureProducer.getFeature$default(featureProducer, C2188811AlT.LIZIZ(sbLIZ14), (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null));
                }
                i3++;
            } while (i3 < 5);
            FeatureServiceManager.Companion.getClass();
            FeatureProducer producer$default2 = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_play", 0, 2, null);
            if (producer$default2 != null) {
                int range = fTypeSearch.getRange();
                Aweme awemeLIZ = C1511360pQs.LIZ(c1509310pNZ);
                if (awemeLIZ != null) {
                    aid = awemeLIZ.getAid();
                } else {
                    aid = null;
                }
                JSONObject jSONObjectLIZ = C1509400pNi.LIZ(range, aid, fTypeSearch.getRangeExcludeThis(), true, false);
                C1509040pN8 c1509040pN8 = LIZ;
                String str = c1510230pP3.LIZ;
                c1509040pN8.getClass();
                LIZJ(producer$default2, c1509310pNZ, "feedbar_search_show", "feedbar_search_show", jSONObjectLIZ, str);
                LIZJ(producer$default2, c1509310pNZ, "feedbar_search_click", "feedbar_search_click", jSONObjectLIZ, c1510230pP3.LIZ);
                LIZJ(producer$default2, c1509310pNZ, "feedbar_search_staytime", "feedbar_search_staytime", jSONObjectLIZ, c1510230pP3.LIZ);
            }
            if (c1509310pNZ.LIZLLL && fTypeSearch.getRange() > 0) {
                JSONObject jSONObjectLIZ2 = C1509400pNi.LIZ(fTypeSearch.getRange(), null, false, false, false);
                LIZJ(featureProducer, c1509310pNZ, "comment_highlight_search_click", "comment_highlight_search_click", jSONObjectLIZ2, c1510230pP3.LIZ);
                LIZJ(featureProducer, c1509310pNZ, "comment_highlight_search_id", "comment_highlight_search_id", jSONObjectLIZ2, c1510230pP3.LIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1337780kuu.LIZ(th, null, 6);
        }
    }

    public static void LIZJ(FeatureProducer featureProducer, C1509310pNZ c1509310pNZ, String str, String str2, JSONObject jSONObject, String str3) {
        int size;
        JSONObject jSONObject2;
        Object feature$default = FeatureProducer.getFeature$default(featureProducer, str2, jSONObject, str3, (ReturnCode) null, 8, (Object) null);
        Map<String, Object> mapLIZIZ = c1509310pNZ.LIZIZ();
        if (feature$default instanceof ArrayList) {
            Object objOpt = jSONObject.opt("params");
            if ((objOpt instanceof JSONObject) && (jSONObject2 = (JSONObject) objOpt) != null) {
                size = jSONObject2.optInt("range");
            } else {
                size = ((ArrayList) feature$default).size();
            }
            for (Object obj : (Iterable) feature$default) {
                size--;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('_');
                sbLIZ.append(size);
                mapLIZIZ.put(C2188811AlT.LIZIZ(sbLIZ), obj);
            }
        }
    }
}
