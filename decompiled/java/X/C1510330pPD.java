package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ml.api.SmartHARService;
import com.ss.android.ugc.aweme.ml.feature.contentscore.ScoreData;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import com.ss.android.ugc.aweme.utils.OHRPredictResultParams;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pPD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510330pPD extends FeatureProducer {
    public static final C1510330pPD LIZIZ = new C1510330pPD();
    public static String LIZJ = "f_client_ai";
    public static boolean LIZLLL = true;

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final String getProducerName() {
        return LIZJ;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void enableProducer(List<FeatureItem> list) {
        if (LIZLLL) {
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
            C0NAF.LIZ();
            C0NAI c0nai = new C0NAI() { // from class: X.0pP9
                @Override // X.C0NAI
                public final void LIZ() {
                    C1510330pPD.LIZIZ.triggerFeatureChangeListener("dynamic_perf_cur_score");
                }
            };
            C589440N9y c589440N9y = C0NAF.LIZIZ;
            if (c589440N9y != null) {
                c589440N9y.LJII.add(c0nai);
            }
            C1509750pOH c1509750pOH = C1509750pOH.LIZ;
            InterfaceC1509840pOQ interfaceC1509840pOQ = new InterfaceC1509840pOQ() { // from class: X.0pP7
                @Override // X.InterfaceC1509840pOQ
                public final void LIZ() {
                    C1510330pPD.LIZIZ.triggerFeatureChangeListener("content_score");
                }
            };
            c1509750pOH.getClass();
            List<InterfaceC1509840pOQ> list2 = C1509750pOH.LJ;
            synchronized (list2) {
                try {
                    ((ArrayList) list2).add(interfaceC1509840pOQ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            LIZLLL = false;
        }
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void setProducerName(String str) {
        LIZJ = str;
    }

    public static float LIZ(float f, long j, long j2, long j3) {
        return (j + Math.min(j2, j3)) * 0.5f * f;
    }

    public static Float LIZIZ(long j, long j2, String str, Map map) {
        int i;
        Float f = (Float) map.get(str);
        if (f != null) {
            float fFloatValue = f.floatValue();
            if (j >= j2) {
                i = 1;
            } else {
                i = 0;
            }
            return Float.valueOf(fFloatValue * i);
        }
        return null;
    }

    public static Object LIZJ(Map map, String str, String str2, ReturnCode returnCode) throws JSONException {
        Object feature;
        ArrayList arrayList;
        float fLIZ;
        Long l;
        ArrayList arrayList2 = new ArrayList();
        FeatureServiceManager.Companion.getClass();
        int i = 0;
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_feed", 0, 2, null);
        if (producer$default != null) {
            feature = producer$default.getFeature("duration", C1509400pNi.LIZ(8, str, false, false, false), str2, returnCode);
        } else {
            feature = null;
        }
        if (!(feature instanceof ArrayList) || (arrayList = (ArrayList) feature) == null) {
            return null;
        }
        do {
            if (i < arrayList.size()) {
                Object obj = ListProtector.get(arrayList, i);
                if ((obj instanceof Long) && (l = (Long) obj) != null) {
                    long jLongValue = l.longValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("task");
                    int i2 = i * 5;
                    sbLIZ.append(i2);
                    Float fLIZIZ = LIZIZ(jLongValue, 0L, C2188811AlT.LIZIZ(sbLIZ), map);
                    if (fLIZIZ != null) {
                        float fFloatValue = fLIZIZ.floatValue();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("task");
                        sbLIZ2.append(i2 + 1);
                        Float fLIZIZ2 = LIZIZ(jLongValue, 2000L, C2188811AlT.LIZIZ(sbLIZ2), map);
                        if (fLIZIZ2 != null) {
                            float fFloatValue2 = fLIZIZ2.floatValue();
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("task");
                            sbLIZ3.append(i2 + 2);
                            Float fLIZIZ3 = LIZIZ(jLongValue, Mp4ScreenVideoLoadTimeout.CONTROL, C2188811AlT.LIZIZ(sbLIZ3), map);
                            if (fLIZIZ3 != null) {
                                float fFloatValue3 = fLIZIZ3.floatValue();
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("task");
                                sbLIZ4.append(i2 + 3);
                                Float fLIZIZ4 = LIZIZ(jLongValue, 15000L, C2188811AlT.LIZIZ(sbLIZ4), map);
                                if (fLIZIZ4 != null) {
                                    float fFloatValue4 = fLIZIZ4.floatValue();
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    sbLIZ5.append("task");
                                    sbLIZ5.append(i2 + 4);
                                    Float fLIZIZ5 = LIZIZ(jLongValue, 60000L, C2188811AlT.LIZIZ(sbLIZ5), map);
                                    if (fLIZIZ5 != null) {
                                        fLIZ = LIZ(fFloatValue, 0L, 2000L, jLongValue) + LIZ(fFloatValue2, 2000L, Mp4ScreenVideoLoadTimeout.CONTROL, jLongValue) + LIZ(fFloatValue3, Mp4ScreenVideoLoadTimeout.CONTROL, 15000L, jLongValue) + LIZ(fFloatValue4, 15000L, 60000L, jLongValue) + LIZ(fLIZIZ5.floatValue(), 60000L, jLongValue, jLongValue);
                                    }
                                }
                            }
                        }
                    }
                }
                return null;
            }
            fLIZ = 0.0f;
            C1717206ny.LIZ(Float.valueOf(fLIZ), arrayList2);
            i++;
        } while (i < 8);
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZLLL(java.util.Map r24, java.lang.String r25, java.lang.String r26, com.ss.ugc.clientai.core.api.meta.ReturnCode r27) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1510330pPD.LIZLLL(java.util.Map, java.lang.String, java.lang.String, com.ss.ugc.clientai.core.api.meta.ReturnCode):java.util.List");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final Object getFeatureInternal(String str, JSONObject jSONObject, String str2, ReturnCode returnCode) {
        Object objOpt;
        Object objOpt2;
        InterfaceC1510350pPF interfaceC1510350pPFLIZ;
        Object objOpt3;
        Float f;
        Object objOpt4;
        boolean z;
        InterfaceC1510350pPF interfaceC1510350pPFLIZ2;
        InterfaceC1510350pPF interfaceC1510350pPFLIZ3;
        InterfaceC1510350pPF interfaceC1510350pPFLIZ4;
        InterfaceC1510350pPF interfaceC1510350pPFLIZ5;
        InterfaceC1510350pPF interfaceC1510350pPFLIZ6;
        Object objOpt5;
        String str3;
        Object feature;
        Map map;
        InterfaceC1510350pPF interfaceC1510350pPFLIZ7;
        Object objOpt6;
        InterfaceC1510350pPF interfaceC1510350pPFLIZ8;
        Activity activityLIZIZ;
        Activity activityLIZIZ2;
        Object objOpt7;
        String str4;
        Object feature2;
        Map map2;
        float[] fArr;
        Object objOpt8;
        if (returnCode != null) {
            returnCode.code = 200;
        }
        int i = 1;
        Float fValueOf = null;
        boolean z2 = false;
        float fFloatValue = 1.0f;
        int i2 = -1;
        switch (str.hashCode()) {
            case -2140816865:
                if (str.equals("content_score_index")) {
                    if (jSONObject != null && (objOpt8 = jSONObject.opt("aid")) != null && (objOpt8 instanceof String)) {
                        C1509750pOH.LIZ.getClass();
                        return C1509750pOH.LJI.get(objOpt8);
                    }
                    if (returnCode != null) {
                        returnCode.code = 3;
                    }
                    return null;
                }
                break;
            case -2019691642:
                if (str.equals("cur_har_last_support_status")) {
                    C1511830pRd c1511830pRd = C1510360pPG.LIZ;
                    if (c1511830pRd.LJIJJLI && (fArr = c1511830pRd.LJIJJ) != null && fArr.length >= 6) {
                        float f2 = fArr[3];
                        float f3 = fArr[4];
                        float f4 = fArr[5];
                        if (f2 <= 0.002f && f3 <= 0.002f && f4 <= 0.002f) {
                            i = 0;
                        } else if (f2 > 0.03f || f3 > 0.03f || f4 > 0.03f) {
                            i = 2;
                        }
                        if (C1512080pS2.LIZ) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("HARService.getSupportStatus supportStatus:");
                            sbLIZ.append(i);
                            C2188811AlT.LIZIZ(sbLIZ);
                        }
                        i2 = i;
                    }
                    return Integer.valueOf(i2);
                }
                break;
            case -1931925131:
                if (str.equals("play_time_expectation")) {
                    if (jSONObject == null) {
                        objOpt7 = null;
                    } else {
                        try {
                            objOpt7 = jSONObject.opt("aid");
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (returnCode != null) {
                                returnCode.code = 3;
                            }
                            C1337780kuu.LIZ(th, null, 6);
                            return null;
                        }
                    }
                    if (objOpt7 instanceof String) {
                        str4 = (String) objOpt7;
                    } else {
                        str4 = null;
                    }
                    if (str4 != null) {
                        FeatureServiceManager.Companion.getClass();
                        FeatureProducer producer = C1510050pOl.LIZ().getProducer("f_vod", 0);
                        if (producer != null) {
                            feature2 = producer.getFeature("play_time_prediction_score_map", jSONObject, str2, returnCode);
                        } else {
                            feature2 = null;
                        }
                        if (feature2 instanceof Map) {
                            map2 = (Map) feature2;
                        } else {
                            map2 = null;
                        }
                        if (map2 == null) {
                            return null;
                        }
                        LIZIZ.getClass();
                        return LIZJ(map2, str4, str2, returnCode);
                    }
                }
                break;
            case -1801401163:
                if (str.equals("cur_ohr_last_coordinate_x")) {
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                    if (abstractC1387200mCcLIZIZ == null || (activityLIZIZ2 = abstractC1387200mCcLIZIZ.LIZIZ()) == null) {
                        return null;
                    }
                    float fLJII = C1513230pTt.LIZ.LJII();
                    Float fValueOf2 = Float.valueOf(activityLIZIZ2.getResources().getDisplayMetrics().widthPixels);
                    if (fValueOf2.floatValue() > 0.0f) {
                        z2 = true;
                    }
                    if (z2) {
                        fValueOf = fValueOf2;
                    }
                    if (fValueOf != null) {
                        fFloatValue = fValueOf.floatValue();
                    }
                    return Integer.valueOf(C13LZ.LJ((int) Math.ceil((fLJII / fFloatValue) * 10), 1, 10));
                }
                break;
            case -1801401162:
                if (str.equals("cur_ohr_last_coordinate_y")) {
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ2 = C1906580ziK.LIZIZ();
                    if (abstractC1387200mCcLIZIZ2 == null || (activityLIZIZ = abstractC1387200mCcLIZIZ2.LIZIZ()) == null) {
                        return null;
                    }
                    float fLJIIIIZZ = C1513230pTt.LIZ.LJIIIIZZ();
                    Float fValueOf3 = Float.valueOf(activityLIZIZ.getResources().getDisplayMetrics().heightPixels);
                    if (fValueOf3.floatValue() > 0.0f) {
                        z2 = true;
                    }
                    if (z2) {
                        fValueOf = fValueOf3;
                    }
                    if (fValueOf != null) {
                        fFloatValue = fValueOf.floatValue();
                    }
                    return Integer.valueOf(C13LZ.LJ((int) Math.ceil((fLJIIIIZZ / fFloatValue) * 10), 1, 10));
                }
                break;
            case -1773624345:
                if (str.equals("dynamic_perf_self_level")) {
                    enableProducer((List<FeatureItem>) null);
                    C0NAJ c0najLIZ = C0NAE.LIZ();
                    if (c0najLIZ != null && (interfaceC1510350pPFLIZ8 = c0najLIZ.LIZ()) != null) {
                        if (interfaceC1510350pPFLIZ8.LIZJ() > 0.0f && !Float.isNaN(interfaceC1510350pPFLIZ8.LIZJ())) {
                            float fLIZIZ = interfaceC1510350pPFLIZ8.LIZIZ() - interfaceC1510350pPFLIZ8.LIZLLL();
                            if (fLIZIZ > 0.0f) {
                                if (fLIZIZ > interfaceC1510350pPFLIZ8.LIZJ() * C1510340pPE.LIZ().coefficient) {
                                    i = 2;
                                }
                            } else if (fLIZIZ < (-interfaceC1510350pPFLIZ8.LIZJ()) * C1510340pPE.LIZ().coefficient) {
                                i = 0;
                            }
                            return Integer.valueOf(i);
                        }
                        return -1;
                    }
                    return -1;
                }
                break;
            case -1752342467:
                if (str.equals("last_range_status") && jSONObject != null && (objOpt6 = jSONObject.opt("range")) != null && (objOpt6 instanceof Integer)) {
                    SmartHARService.Companion.getClass();
                    return C1511980pRs.LIZ().getLastRangeStatus(((Number) objOpt6).intValue(), true);
                }
                break;
            case -1633982143:
                if (str.equals("cur_har_last_result")) {
                    SmartHARService.Companion.getClass();
                    return C1511980pRs.LIZ().getLastResult();
                }
                break;
            case -1592037098:
                if (str.equals("cur_har_last_status")) {
                    SmartHARService.Companion.getClass();
                    return Integer.valueOf(C1511980pRs.LIZ().getLastStatus());
                }
                break;
            case -1491105468:
                if (str.equals("dynamic_perf_recent_score")) {
                    enableProducer((List<FeatureItem>) null);
                    C0NAJ c0najLIZ2 = C0NAE.LIZ();
                    if (c0najLIZ2 == null || (interfaceC1510350pPFLIZ7 = c0najLIZ2.LIZ()) == null) {
                        return null;
                    }
                    return Float.valueOf(interfaceC1510350pPFLIZ7.LIZ());
                }
                break;
            case -1435172014:
                if (str.equals("cur_har_last_top_down_att")) {
                    int[] iArrLJIIIIZZ = C1510360pPG.LIZ.LJIIIIZZ();
                    if (iArrLJIIIIZZ != null) {
                        if (iArrLJIIIIZZ.length == 0) {
                            z2 = true;
                        }
                        if (!z2) {
                            return Integer.valueOf(iArrLJIIIIZZ[1]);
                        }
                    }
                    return -2;
                }
                break;
            case -1427667289:
                if (str.equals("play_time_weibull")) {
                    if (jSONObject == null) {
                        objOpt5 = null;
                    } else {
                        try {
                            objOpt5 = jSONObject.opt("aid");
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            if (returnCode != null) {
                                returnCode.code = 3;
                            }
                            C1337780kuu.LIZ(th2, null, 6);
                            return null;
                        }
                    }
                    if (objOpt5 instanceof String) {
                        str3 = (String) objOpt5;
                    } else {
                        str3 = null;
                    }
                    if (str3 != null) {
                        FeatureServiceManager.Companion.getClass();
                        FeatureProducer producer2 = C1510050pOl.LIZ().getProducer("f_vod", 0);
                        if (producer2 != null) {
                            feature = producer2.getFeature("play_time_prediction_score_map", jSONObject, str2, returnCode);
                        } else {
                            feature = null;
                        }
                        if (feature instanceof Map) {
                            map = (Map) feature;
                        } else {
                            map = null;
                        }
                        if (map == null) {
                            return null;
                        }
                        LIZIZ.getClass();
                        return LIZLLL(map, str3, str2, returnCode);
                    }
                }
                break;
            case -1426277891:
                if (str.equals("dynamic_perf_cur_score")) {
                    enableProducer((List<FeatureItem>) null);
                    C0NAJ c0najLIZ3 = C0NAE.LIZ();
                    if (c0najLIZ3 == null || (interfaceC1510350pPFLIZ6 = c0najLIZ3.LIZ()) == null) {
                        return null;
                    }
                    return Float.valueOf(interfaceC1510350pPFLIZ6.LIZIZ());
                }
                break;
            case -1356054990:
                if (str.equals("dynamic_stable_perf_level")) {
                    enableProducer((List<FeatureItem>) null);
                    C0NAJ c0najLIZ4 = C0NAE.LIZ();
                    if (c0najLIZ4 != null && (interfaceC1510350pPFLIZ5 = c0najLIZ4.LIZ()) != null) {
                        float fLIZLLL = interfaceC1510350pPFLIZ5.LIZLLL();
                        if (fLIZLLL > C1510340pPE.LIZ().stableHighScore) {
                            i = 2;
                        } else if (fLIZLLL <= C1510340pPE.LIZ().stableMiddleScore) {
                            if (fLIZLLL > 0.0f) {
                                i = 0;
                            } else {
                                i = -1;
                            }
                        }
                        return Integer.valueOf(i);
                    }
                    return -1;
                }
                break;
            case -793424110:
                if (str.equals("dynamic_recent_perf_level")) {
                    enableProducer((List<FeatureItem>) null);
                    C0NAJ c0najLIZ5 = C0NAE.LIZ();
                    if (c0najLIZ5 != null && (interfaceC1510350pPFLIZ4 = c0najLIZ5.LIZ()) != null) {
                        float fLIZ = interfaceC1510350pPFLIZ4.LIZ();
                        if (fLIZ > C1510340pPE.LIZ().recentHighScore) {
                            i = 2;
                        } else if (fLIZ <= C1510340pPE.LIZ().recentMiddleScore) {
                            if (fLIZ > 0.0f) {
                                i = 0;
                            } else {
                                i = -1;
                            }
                        }
                        return Integer.valueOf(i);
                    }
                    return -1;
                }
                break;
            case -759624043:
                if (str.equals("dynamic_perf_standard_deviation")) {
                    enableProducer((List<FeatureItem>) null);
                    C0NAJ c0najLIZ6 = C0NAE.LIZ();
                    if (c0najLIZ6 != null && (interfaceC1510350pPFLIZ3 = c0najLIZ6.LIZ()) != null) {
                        fValueOf = Float.valueOf(interfaceC1510350pPFLIZ3.LIZJ());
                    }
                    float fFloatValue2 = -1.0f;
                    if (fValueOf != null) {
                        if (fValueOf.floatValue() > 0.0f) {
                            fFloatValue2 = fValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue2);
                    }
                    return Float.valueOf(-1.0f);
                }
                break;
            case -644372956:
                if (str.equals("dynamic_perf_stable_score")) {
                    enableProducer((List<FeatureItem>) null);
                    C0NAJ c0najLIZ7 = C0NAE.LIZ();
                    if (c0najLIZ7 == null || (interfaceC1510350pPFLIZ2 = c0najLIZ7.LIZ()) == null) {
                        return null;
                    }
                    return Float.valueOf(interfaceC1510350pPFLIZ2.LIZLLL());
                }
                break;
            case -588581255:
                if (str.equals("cur_har_last_screen_up_down_att")) {
                    int[] iArrLJIIIIZZ2 = C1510360pPG.LIZ.LJIIIIZZ();
                    if (iArrLJIIIIZZ2 != null) {
                        if (iArrLJIIIIZZ2.length == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            return Integer.valueOf(iArrLJIIIIZZ2[0]);
                        }
                    }
                    return -1;
                }
                break;
            case -561685809:
                if (str.equals("last_touch_x")) {
                    return Float.valueOf(C1513230pTt.LIZ.LJFF());
                }
                break;
            case -561685808:
                if (str.equals("last_touch_y")) {
                    return Float.valueOf(C1513230pTt.LIZ.LJI());
                }
                break;
            case -405732734:
                if (str.equals("last_down_timestamp")) {
                    return Long.valueOf(C1513230pTt.LIZ.LJ());
                }
                break;
            case -156102973:
                if (str.equals("last_range_most_status") && jSONObject != null && (objOpt4 = jSONObject.opt("range")) != null && (objOpt4 instanceof Integer)) {
                    SmartHARService.Companion.getClass();
                    return Integer.valueOf(C1511980pRs.LIZ().getLastRangeMostStatus(((Number) objOpt4).intValue(), true));
                }
                break;
            case -91609623:
                if (str.equals("content_score_map")) {
                    if (jSONObject != null && (objOpt3 = jSONObject.opt("aid_list")) != null && (objOpt3 instanceof List)) {
                        C1509750pOH c1509750pOH = C1509750pOH.LIZ;
                        List list = (List) objOpt3;
                        Object objOpt9 = jSONObject.opt(Scene.SCENE_SERVICE);
                        if (!(objOpt9 instanceof String)) {
                            objOpt9 = null;
                        }
                        String strValueOf = String.valueOf(objOpt9);
                        c1509750pOH.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj : list) {
                            ScoreData scoreData = C1509750pOH.LIZLLL.get(obj);
                            if (scoreData != null) {
                                f = scoreData.scoreMap.get(strValueOf);
                            } else {
                                f = null;
                            }
                            if (f != null) {
                                linkedHashMap.put(obj, Float.valueOf(f.floatValue()));
                            }
                        }
                        return linkedHashMap;
                    }
                    if (returnCode != null) {
                        returnCode.code = 3;
                    }
                    return null;
                }
                break;
            case -51435212:
                if (str.equals("dynamic_current_perf_level")) {
                    enableProducer((List<FeatureItem>) null);
                    C0NAJ c0najLIZ8 = C0NAE.LIZ();
                    if (c0najLIZ8 != null && (interfaceC1510350pPFLIZ = c0najLIZ8.LIZ()) != null) {
                        float fLIZIZ2 = interfaceC1510350pPFLIZ.LIZIZ();
                        if (fLIZIZ2 > C1510340pPE.LIZ().currentHighScore) {
                            i = 2;
                        } else if (fLIZIZ2 <= C1510340pPE.LIZ().currentMiddleScore) {
                            if (fLIZIZ2 > 0.0f) {
                                i = 0;
                            } else {
                                i = -1;
                            }
                        }
                        return Integer.valueOf(i);
                    }
                    return -1;
                }
                break;
            case 15849292:
                if (str.equals("content_score")) {
                    if (jSONObject != null && (objOpt2 = jSONObject.opt("aid")) != null && (objOpt2 instanceof String)) {
                        C1509750pOH c1509750pOH2 = C1509750pOH.LIZ;
                        Object objOpt10 = jSONObject.opt(Scene.SCENE_SERVICE);
                        if (!(objOpt10 instanceof String)) {
                            objOpt10 = null;
                        }
                        String strValueOf2 = String.valueOf(objOpt10);
                        c1509750pOH2.getClass();
                        ScoreData scoreData2 = C1509750pOH.LIZLLL.get(objOpt2);
                        if (scoreData2 == null) {
                            return null;
                        }
                        return scoreData2.scoreMap.get(strValueOf2);
                    }
                    if (returnCode != null) {
                        returnCode.code = 3;
                    }
                    return null;
                }
                break;
            case 1085002849:
                if (str.equals("cur_ohr_last_result")) {
                    OHRPredictResultParams oHRPredictResultParamsLJIILLIIL = ((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJIILLIIL();
                    if (oHRPredictResultParamsLJIILLIIL == null) {
                        return null;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("hand", Float.valueOf(oHRPredictResultParamsLJIILLIIL.hand));
                    linkedHashMap2.put("confidence", Float.valueOf(oHRPredictResultParamsLJIILLIIL.confidence));
                    linkedHashMap2.put("leftPercent", Float.valueOf(oHRPredictResultParamsLJIILLIIL.leftPercent));
                    linkedHashMap2.put("rightPercent", Float.valueOf(oHRPredictResultParamsLJIILLIIL.rightPercent));
                    return linkedHashMap2;
                }
                break;
            case 1126383418:
                if (str.equals("cur_ohr")) {
                    return ((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJIILLIIL();
                }
                break;
            case 1126947894:
                if (str.equals("cur_ohr_last_status")) {
                    OHRPredictResultParams oHRPredictResultParamsLJIILLIIL2 = ((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJIILLIIL();
                    if (oHRPredictResultParamsLJIILLIIL2 == null) {
                        return null;
                    }
                    return Integer.valueOf(oHRPredictResultParamsLJIILLIIL2.hand);
                }
                break;
            case 1270777426:
                if (str.equals("cur_ohr_last_timestamp")) {
                    return Long.valueOf(C1513230pTt.LIZ.LJIIJ());
                }
                break;
            case 1336798467:
                if (str.equals("content_score_feature")) {
                    if (jSONObject != null && (objOpt = jSONObject.opt("aid")) != null && (objOpt instanceof String)) {
                        C1509750pOH c1509750pOH3 = C1509750pOH.LIZ;
                        Object objOpt11 = jSONObject.opt("feature_name");
                        if (!(objOpt11 instanceof String)) {
                            objOpt11 = null;
                        }
                        String strValueOf3 = String.valueOf(objOpt11);
                        c1509750pOH3.getClass();
                        ScoreData scoreData3 = C1509750pOH.LIZLLL.get(objOpt);
                        if (scoreData3 == null) {
                            return null;
                        }
                        return scoreData3.features.get(strValueOf3);
                    }
                    if (returnCode != null) {
                        returnCode.code = 3;
                    }
                    return null;
                }
                break;
            case 1378269418:
                if (str.equals("cur_har_last_left_right_att")) {
                    int[] iArrLJIIIIZZ3 = C1510360pPG.LIZ.LJIIIIZZ();
                    if (iArrLJIIIIZZ3 != null) {
                        if (iArrLJIIIIZZ3.length == 0) {
                            z2 = true;
                        }
                        if (!z2) {
                            return Integer.valueOf(iArrLJIIIIZZ3[2]);
                        }
                    }
                    return -3;
                }
                break;
            case 1983194452:
                if (str.equals("content_score_aid_list")) {
                    C1509750pOH.LIZ.getClass();
                    return C13LP.LLIIII(C1509750pOH.LIZLLL.keySet());
                }
                break;
        }
        if (returnCode != null) {
            returnCode.code = 1;
        }
        return null;
    }
}
