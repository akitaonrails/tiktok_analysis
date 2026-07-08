package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.infra.FeatureLiveGameConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pNR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509230pNR extends C1509180pNM {
    public static final C1509230pNR LIZ = new C1509230pNR();

    @Override // X.C1509180pNM
    public final void LIZ(C1510230pP3 c1510230pP3) {
        InputFeaturesConfig features;
        FeatureLiveGameConfig fLiveGame;
        InputFeaturesConfig features2;
        FeatureLiveGameConfig fLiveGame2;
        List<String> subTypeList;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        ArrayList arrayList = null;
        if (smartSceneConfig != null && smartSceneConfig != null && (features = smartSceneConfig.getFeatures()) != null && (fLiveGame = features.getFLiveGame()) != null && fLiveGame.getEnable()) {
            FeatureServiceManager.Companion.getClass();
            FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_live_game", 0, 2, null);
            if (producer$default != null) {
                SmartSceneConfig smartSceneConfig2 = c1510230pP3.LIZIZ;
                if (smartSceneConfig2 != null && (features2 = smartSceneConfig2.getFeatures()) != null && (fLiveGame2 = features2.getFLiveGame()) != null && (subTypeList = fLiveGame2.getSubTypeList()) != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(subTypeList, 10));
                    Iterator<String> it2 = subTypeList.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new FeatureItem(it2.next(), null, null, null, -1, null, new ArrayList()));
                    }
                }
                producer$default.enableProducer(arrayList);
            }
        }
    }

    @Override // X.C1509180pNM
    public final void LIZIZ(C1510230pP3 c1510230pP3, C1509310pNZ c1509310pNZ) {
        InputFeaturesConfig features;
        FeatureLiveGameConfig fLiveGame;
        Object feature$default;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig == null || (features = smartSceneConfig.getFeatures()) == null || (fLiveGame = features.getFLiveGame()) == null || !fLiveGame.getEnable()) {
            return;
        }
        Map<String, Object> mapLIZIZ = c1509310pNZ.LIZIZ();
        try {
            List<String> subTypeList = fLiveGame.getSubTypeList();
            if (subTypeList != null) {
                for (String str : subTypeList) {
                    if (!Intrinsics.LJFF(str, "all")) {
                        FeatureServiceManager.Companion.getClass();
                        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_live_game", 0, 2, null);
                        if (producer$default != null && (feature$default = FeatureProducer.getFeature$default(producer$default, str, (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null)) != null) {
                            LIZ.getClass();
                            if (!LIZJ(feature$default, str, mapLIZIZ)) {
                                mapLIZIZ.put(str, feature$default);
                            }
                        }
                    } else {
                        FeatureServiceManager.Companion.getClass();
                        FeatureProducer producer$default2 = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_live_game", 0, 2, null);
                        if (producer$default2 != null) {
                            for (String str2 : C152R.LIZ) {
                                Object feature$default2 = FeatureProducer.getFeature$default(producer$default2, str2, (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null);
                                if (feature$default2 != null) {
                                    LIZ.getClass();
                                    if (!LIZJ(feature$default2, str2, mapLIZIZ)) {
                                        mapLIZIZ.put(str2, feature$default2);
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1337780kuu.LIZ(th, null, 6);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean LIZJ(Object obj, String str, Map map) {
        int i = 0;
        switch (str.hashCode()) {
            case -2123858064:
                if (!str.equals("g_ttgp_anchor_aid")) {
                    return false;
                }
                break;
            case -1414554807:
                if (!str.equals("g_ttgp_anchor_show")) {
                    return false;
                }
                break;
            case -99173836:
                if (str.equals("g_ttgp_anchor_extra_tags")) {
                    if (obj instanceof Map) {
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str);
                            sbLIZ.append('_');
                            sbLIZ.append(key);
                            map.put(C2188811AlT.LIZIZ(sbLIZ), value);
                        }
                    }
                    return true;
                }
                return false;
            case 10181723:
                if (!str.equals("g_ttgp_anchor_clicked")) {
                    return false;
                }
                break;
            default:
                return false;
        }
        if (obj instanceof List) {
            for (Object obj2 : (Iterable) obj) {
                int i2 = i + 1;
                if (i >= 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append('_');
                    sbLIZ2.append(i);
                    map.put(C2188811AlT.LIZIZ(sbLIZ2), obj2);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return true;
    }
}
