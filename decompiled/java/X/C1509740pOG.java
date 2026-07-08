package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.ss.android.ugc.aweme.ml.feature.contentscore.ScoreData;
import com.ss.android.ugc.aweme.ml.infra.TTMFeatureConfig;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pOG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509740pOG implements InterfaceC588340N5s {
    public static final C1509740pOG LIZIZ = new C1509740pOG();
    public static long LIZJ;
    public static int LIZLLL;
    public static int LJ;

    public static final void LIZ(String str, C1510130pOt c1510130pOt) {
        if (C609920Nw6.LIZ().triggerEvents.contains(str)) {
            if (C609230Nuz.LIZ && ((C0NA7) C609230Nuz.LIZIZ.getValue()).isReady()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - LIZJ > C609920Nw6.LIZ().minTiggerEventPeriod) {
                    LIZJ = jCurrentTimeMillis;
                    C589280N9i c589280N9i = new C589280N9i("request_update", str);
                    C589440N9y c589440N9y = C0NAF.LIZIZ;
                    if (c589440N9y != null) {
                        c589440N9y.LJ.LIZIZ(c589280N9i);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (C609920Nw6.LIZ().triggerEventsForBusiness.contains(str) && C609230Nuz.LIZ && ((C0NA7) C609230Nuz.LIZIZ.getValue()).isReady()) {
            C589280N9i c589280N9i2 = new C589280N9i("request_update", str);
            C589440N9y c589440N9y2 = C0NAF.LIZIZ;
            if (c589440N9y2 == null) {
                return;
            }
            c589440N9y2.LJ.LIZIZ(c589280N9i2);
        }
    }

    @Override // X.InterfaceC588340N5s
    public final void LIZJ(String str, C1510130pOt c1510130pOt) {
        if (C0BMB.LIZ() && Intrinsics.LJFF(C1509790pOL.LIZ().triggerEvent, str)) {
            C1509750pOH.LIZ.getClass();
            if (C1509750pOH.LIZLLL.isEmpty() || C1EE1.LIZIZ.LJJJI()) {
                return;
            }
            C1511690pRP.LIZJ(2000L, new Runnable() { // from class: X.0pOK
                public static void LIZ() throws JSONException {
                    List<FeatureGroup> groups;
                    final JSONObject jSONObject = new JSONObject();
                    int i = C1509740pOG.LIZLLL;
                    C1509740pOG.LIZLLL = i + 1;
                    if (i == C1509790pOL.LIZ().updateWeightsInterval) {
                        TTMFeatureConfig tTMFeatureConfig = C1509790pOL.LIZ().featurePast;
                        if (tTMFeatureConfig != null && (groups = tTMFeatureConfig.getGroups()) != null) {
                            FeatureServiceManager.Companion.getClass();
                            FeatureServiceManager featureServiceManagerLIZ = C1510050pOl.LIZ();
                            TTMFeatureConfig tTMFeatureConfig2 = C1509790pOL.LIZ().featurePast;
                            JSONObject batchFeatures$default = FeatureServiceManager.getBatchFeatures$default(featureServiceManagerLIZ, groups, tTMFeatureConfig2 != null ? tTMFeatureConfig2.getFlattenConfig() : null, null, "content_score_past_feature", false, 20, null);
                            C1509750pOH.LIZ.getClass();
                            jSONObject.put("past_features", batchFeatures$default);
                        }
                        C1509740pOG.LIZLLL = 0;
                    }
                    int i2 = C1509740pOG.LJ;
                    C1509740pOG.LJ = i2 + 1;
                    if (i2 == C1509790pOL.LIZ().updateScoresInterval) {
                        C1509750pOH.LIZ.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        ArrayList arrayList = new ArrayList();
                        for (ScoreData scoreData : C1509750pOH.LIZLLL.values()) {
                            if (jCurrentTimeMillis - scoreData.ts > C1509790pOL.LIZ().cacheDays * 86400000) {
                                arrayList.add(scoreData.content_id);
                            }
                        }
                        int size = C1509750pOH.LIZLLL.size() - C1509790pOL.LIZ().cacheUpperLimit;
                        if (size > 0) {
                            for (Object obj : C13LP.LL(C1509750pOH.LJFF, size)) {
                                if (obj != null) {
                                    arrayList.add(obj);
                                }
                            }
                        }
                        for (Object obj2 : arrayList) {
                            C1509750pOH.LIZLLL.remove(obj2);
                            C1509750pOH.LJFF.remove(obj2);
                        }
                        jSONObject.put("input_features", new JSONArray(GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), C1509750pOH.LIZLLL.values())));
                        C1509740pOG.LJ = 0;
                    }
                    if (jSONObject.length() > 0) {
                        C1509750pOH.LIZ.getClass();
                        final long jCurrentTimeMillis2 = System.currentTimeMillis();
                        ((IPitayaCore) C148D.LIZ.getValue()).runTask("content_score", new PTYTaskData(jSONObject), new PTYTaskConfig(false, null, -1.0f), new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.ml.feature.contentscore.ContentScoreManager$computeScore$1
                            /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[Catch: Exception -> 0x00ee, TRY_ENTER, TryCatch #0 {Exception -> 0x00ee, blocks: (B:3:0x0012, B:9:0x002d, B:11:0x0033, B:13:0x003b, B:14:0x0046, B:16:0x004c, B:18:0x0054, B:21:0x005a, B:22:0x0061, B:24:0x0065, B:26:0x006f, B:28:0x007e, B:30:0x0082, B:32:0x008c, B:34:0x0092, B:35:0x0096, B:37:0x009c, B:39:0x00aa, B:41:0x00b4, B:43:0x00b8, B:44:0x00c9, B:46:0x00ce, B:47:0x00de, B:49:0x00e4), top: B:57:0x0012 }] */
                            /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[Catch: Exception -> 0x00ee, TryCatch #0 {Exception -> 0x00ee, blocks: (B:3:0x0012, B:9:0x002d, B:11:0x0033, B:13:0x003b, B:14:0x0046, B:16:0x004c, B:18:0x0054, B:21:0x005a, B:22:0x0061, B:24:0x0065, B:26:0x006f, B:28:0x007e, B:30:0x0082, B:32:0x008c, B:34:0x0092, B:35:0x0096, B:37:0x009c, B:39:0x00aa, B:41:0x00b4, B:43:0x00b8, B:44:0x00c9, B:46:0x00ce, B:47:0x00de, B:49:0x00e4), top: B:57:0x0012 }] */
                            /* JADX WARN: Removed duplicated region for block: B:46:0x00ce A[Catch: Exception -> 0x00ee, TryCatch #0 {Exception -> 0x00ee, blocks: (B:3:0x0012, B:9:0x002d, B:11:0x0033, B:13:0x003b, B:14:0x0046, B:16:0x004c, B:18:0x0054, B:21:0x005a, B:22:0x0061, B:24:0x0065, B:26:0x006f, B:28:0x007e, B:30:0x0082, B:32:0x008c, B:34:0x0092, B:35:0x0096, B:37:0x009c, B:39:0x00aa, B:41:0x00b4, B:43:0x00b8, B:44:0x00c9, B:46:0x00ce, B:47:0x00de, B:49:0x00e4), top: B:57:0x0012 }] */
                            /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
                            @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public void onResult(boolean r15, com.bytedance.pitaya.api.bean.PTYError r16, com.bytedance.pitaya.api.bean.PTYTaskData r17, com.bytedance.pitaya.api.bean.PTYPackageInfo r18) throws org.json.JSONException {
                                /*
                                    Method dump skipped, instruction units count: 280
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ml.feature.contentscore.ContentScoreManager$computeScore$1.onResult(boolean, com.bytedance.pitaya.api.bean.PTYError, com.bytedance.pitaya.api.bean.PTYTaskData, com.bytedance.pitaya.api.bean.PTYPackageInfo):void");
                            }
                        });
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PythiaTriggerEventHandler@de59.onSmartCommonEvent$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PythiaTriggerEventHandler@de59.onSmartCommonEvent$1");
                }
            });
        }
    }
}
