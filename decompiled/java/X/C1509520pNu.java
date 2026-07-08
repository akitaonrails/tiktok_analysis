package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.infra.FeatureSessionTypeConfig;
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

/* JADX INFO: renamed from: X.0pNu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509520pNu extends C1509180pNM {
    public static final C1509520pNu LIZ = new C1509520pNu();
    public static int LIZIZ;

    @Override // X.C1509180pNM
    public final void LIZ(C1510230pP3 c1510230pP3) {
        InputFeaturesConfig features;
        FeatureSessionTypeConfig fTypeSession;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig == null || (features = smartSceneConfig.getFeatures()) == null || (fTypeSession = features.getFTypeSession()) == null || !fTypeSession.getEnable()) {
            return;
        }
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_session", 0, 2, null);
        if (producer$default != null) {
            producer$default.enableProducer((List<FeatureItem>) null);
        }
    }

    @Override // X.C1509180pNM
    public final void LIZIZ(C1510230pP3 c1510230pP3, C1509310pNZ c1509310pNZ) {
        InputFeaturesConfig features;
        FeatureSessionTypeConfig fTypeSession;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig == null || (features = smartSceneConfig.getFeatures()) == null || (fTypeSession = features.getFTypeSession()) == null || !fTypeSession.getEnable() || fTypeSession.getRange() <= 0) {
            return;
        }
        LIZIZ = fTypeSession.getRange();
        try {
            C1510170pOx.LIZ.getClass();
            C827040WcQ.LIZ.getClass();
            JSONObject jSONObjectLIZJ = C1509400pNi.LIZJ(fTypeSession.getRange(), C827040WcQ.LIZJ, fTypeSession.getRangeExcludeThis());
            FeatureServiceManager.Companion.getClass();
            FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_session", 0, 2, null);
            if (producer$default == null) {
                return;
            }
            Object objLIZLLL = LIZLLL(producer$default, c1509310pNZ, "session_play_time", "playTime", jSONObjectLIZJ, c1510230pP3.LIZ);
            Object objLIZLLL2 = LIZLLL(producer$default, c1509310pNZ, "session_seq_cnt", "seqCnt", jSONObjectLIZJ, c1510230pP3.LIZ);
            if (c1509310pNZ.LIZLLL) {
                LIZLLL(producer$default, c1509310pNZ, "session_date", "date", jSONObjectLIZJ, c1510230pP3.LIZ);
                LIZLLL(producer$default, c1509310pNZ, "session_id", "sessionId", jSONObjectLIZJ, c1510230pP3.LIZ);
                LIZLLL(producer$default, c1509310pNZ, "session_begin_time", "beginTime", jSONObjectLIZJ, c1510230pP3.LIZ);
            }
            EnumC1509550pNx enumC1509550pNx = EnumC1509550pNx.INT;
            C1509570pNz c1509570pNz = C1509570pNz.LIZ;
            LIZJ(c1509310pNZ, "session_play_time_total", objLIZLLL, enumC1509550pNx, c1509570pNz);
            C1509590pO1 c1509590pO1 = C1509590pO1.LIZ;
            LIZJ(c1509310pNZ, "session_play_time_avg", objLIZLLL, enumC1509550pNx, c1509590pO1);
            C1509650pO7 c1509650pO7 = C1509650pO7.LIZ;
            LIZJ(c1509310pNZ, "session_play_time_min", objLIZLLL, enumC1509550pNx, c1509650pO7);
            C1509600pO2 c1509600pO2 = C1509600pO2.LIZ;
            LIZJ(c1509310pNZ, "session_play_time_max", objLIZLLL, enumC1509550pNx, c1509600pO2);
            C1509580pO0 c1509580pO0 = C1509580pO0.LIZ;
            LIZJ(c1509310pNZ, "session_play_time_mid", objLIZLLL, enumC1509550pNx, c1509580pO0);
            LIZJ(c1509310pNZ, "session_seq_cnt_total", objLIZLLL2, enumC1509550pNx, c1509570pNz);
            LIZJ(c1509310pNZ, "session_seq_cnt_avg", objLIZLLL2, enumC1509550pNx, c1509590pO1);
            LIZJ(c1509310pNZ, "session_seq_cnt_min", objLIZLLL2, enumC1509550pNx, c1509650pO7);
            LIZJ(c1509310pNZ, "session_seq_cnt_max", objLIZLLL2, enumC1509550pNx, c1509600pO2);
            LIZJ(c1509310pNZ, "session_seq_cnt_mid", objLIZLLL2, enumC1509550pNx, c1509580pO0);
            LIZLLL(producer$default, c1509310pNZ, "session_rank", "sessionRank", null, c1510230pP3.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1337780kuu.LIZ(th, null, 6);
        }
    }

    public static final void LIZJ(C1509310pNZ c1509310pNZ, String str, Object obj, EnumC1509550pNx enumC1509550pNx, InterfaceC1509660pO8 interfaceC1509660pO8) {
        Map<String, Object> mapLIZIZ = c1509310pNZ.LIZIZ();
        if (obj instanceof ArrayList) {
            int i = C1509540pNw.LIZ[enumC1509550pNx.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    mapLIZIZ.put(str, Long.valueOf(interfaceC1509660pO8.LIZ((ArrayList) obj)));
                    return;
                }
                return;
            }
            mapLIZIZ.put(str, Integer.valueOf((int) interfaceC1509660pO8.LIZ((ArrayList) obj)));
        }
    }

    public static final Object LIZLLL(FeatureProducer featureProducer, C1509310pNZ c1509310pNZ, String str, String str2, JSONObject jSONObject, String str3) {
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
