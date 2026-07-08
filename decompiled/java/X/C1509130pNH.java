package X;

import com.ss.android.ugc.aweme.ml.infra.FeaturePhoneTypeConfig;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pNH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509130pNH extends C1509180pNM {
    public static final C1509130pNH LIZ = new C1509130pNH();

    @Override // X.C1509180pNM
    public final void LIZ(C1510230pP3 c1510230pP3) {
        InputFeaturesConfig features;
        FeaturePhoneTypeConfig fTypePhone;
        SmartSceneConfig smartSceneConfigLIZJ = C1511360pQs.LIZJ(c1510230pP3);
        if (smartSceneConfigLIZJ != null && (features = smartSceneConfigLIZJ.getFeatures()) != null && (fTypePhone = features.getFTypePhone()) != null) {
            fTypePhone.getEnable();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1509180pNM
    public final void LIZIZ(C1510230pP3 c1510230pP3, C1509310pNZ c1509310pNZ) {
        InputFeaturesConfig features;
        FeaturePhoneTypeConfig fTypePhone;
        Object feature$default;
        ConcurrentHashMap concurrentHashMap;
        Object feature$default2;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig == null || (features = smartSceneConfig.getFeatures()) == null || (fTypePhone = features.getFTypePhone()) == null || !fTypePhone.getEnable()) {
            return;
        }
        Map<String, Object> mapLIZIZ = c1509310pNZ.LIZIZ();
        List<String> subTypeList = fTypePhone.getSubTypeList();
        if (subTypeList != null) {
            for (String str : subTypeList) {
                if (Intrinsics.LJFF(str, "all")) {
                    C1509130pNH c1509130pNH = LIZ;
                    String str2 = c1510230pP3.LIZ;
                    c1509130pNH.getClass();
                    FeatureServiceManager.Companion.getClass();
                    FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_phone", 0, 2, null);
                    if (producer$default != null) {
                        for (String str3 : C1510190pOz.LIZ) {
                            Object feature$default3 = FeatureProducer.getFeature$default(producer$default, str3, (JSONObject) null, str2, (ReturnCode) null, 10, (Object) null);
                            if (feature$default3 != null) {
                                mapLIZIZ.put(str3, feature$default3);
                            }
                        }
                    }
                } else if (Intrinsics.LJFF(str, "portrait_all")) {
                    FeatureServiceManager.Companion.getClass();
                    FeatureProducer producer$default2 = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_phone", 0, 2, null);
                    if (producer$default2 != null) {
                        feature$default = FeatureProducer.getFeature$default(producer$default2, "portrait_all", (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null);
                    } else {
                        feature$default = null;
                    }
                    if ((feature$default instanceof ConcurrentHashMap) && (concurrentHashMap = (ConcurrentHashMap) feature$default) != null) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            Object value = entry.getValue();
                            if (value != null) {
                                mapLIZIZ.put(entry.getKey(), value);
                            }
                        }
                    }
                } else {
                    FeatureServiceManager.Companion.getClass();
                    FeatureProducer producer$default3 = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_phone", 0, 2, null);
                    if (producer$default3 != null && (feature$default2 = FeatureProducer.getFeature$default(producer$default3, str, (JSONObject) null, c1510230pP3.LIZ, (ReturnCode) null, 10, (Object) null)) != null) {
                        mapLIZIZ.put(str, feature$default2);
                    }
                }
            }
        }
    }
}
