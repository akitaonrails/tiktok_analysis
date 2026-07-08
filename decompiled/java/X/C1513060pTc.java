package X;

import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.infra.SmartOffloadingConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.android.ugc.aweme.ml.infra.synergy.CallBackRequestParams;
import com.ss.android.ugc.aweme.ml.infra.synergy.ClientAISynergyApi;
import com.ss.android.ugc.aweme.ml.infra.synergy.CloudInferenceCallBackData;
import com.ss.android.ugc.aweme.ml.infra.synergy.CloudInferenceStateData;
import com.ss.android.ugc.aweme.ml.infra.synergy.ReportRequestParams;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import com.tiktok.ttm.TTMParamData;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pTc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513060pTc {
    public InterfaceC830890Wid LIZ;
    public boolean LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public final SmartOffloadingConfig LJ;
    public final String LJFF;

    public final boolean LIZ() {
        Boolean bool;
        boolean zBooleanValue = false;
        if (this.LJFF == null) {
            LIZJ(-110, -1L, "", false, this.LIZIZ, false);
            return false;
        }
        SmartOffloadingConfig smartOffloadingConfig = this.LJ;
        if (smartOffloadingConfig == null) {
            return false;
        }
        if (smartOffloadingConfig.getFrequencyTimeGap() > System.currentTimeMillis() - this.LIZJ) {
            return this.LIZLLL || this.LIZIZ;
        }
        String offloadingStrategyName = this.LJ.getOffloadingStrategyName();
        if (offloadingStrategyName == null) {
            LIZJ(-110, -1L, this.LJFF, false, this.LIZIZ, false);
            return false;
        }
        if (!TTMStrategyCenterManager.isInit()) {
            LIZJ(-111, -1L, this.LJFF, false, this.LIZIZ, false);
            return false;
        }
        if (this.LIZ == null) {
            LIZJ(-112, -1L, this.LJFF, false, this.LIZIZ, false);
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZJ = jCurrentTimeMillis;
        if (AbstractC19994813Le.Default.nextFloat() < C2509109sP.LIZ) {
            InterfaceC805220ViK interfaceC805220ViKRunScene = TTMStrategyCenterManager.runScene(this.LIZ, offloadingStrategyName, new TTMParamData(false));
            Object objLIZJ = interfaceC805220ViKRunScene != null ? interfaceC805220ViKRunScene.LIZJ() : null;
            if ((objLIZJ instanceof Boolean) && (bool = (Boolean) objLIZJ) != null) {
                zBooleanValue = bool.booleanValue();
            }
            this.LIZLLL = zBooleanValue;
            LIZJ(0, System.currentTimeMillis() - jCurrentTimeMillis, this.LJFF, this.LIZLLL, this.LIZIZ, true);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("actionResult: ");
            sbLIZ.append(this.LIZLLL);
            C2188811AlT.LIZIZ(sbLIZ);
        } else {
            LIZJ(-113, -1L, this.LJFF, false, this.LIZIZ, false);
            this.LIZLLL = false;
        }
        if (this.LIZIZ) {
            return true;
        }
        if (this.LJ.getKeepOffloadingStatus() && this.LIZLLL) {
            this.LIZIZ = true;
        }
        return this.LIZLLL;
    }

    public C1513060pTc(C1510230pP3 c1510230pP3) {
        SmartOffloadingConfig offloadingConfig;
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig != null) {
            offloadingConfig = smartSceneConfig.getOffloadingConfig();
        } else {
            offloadingConfig = null;
        }
        this.LJ = offloadingConfig;
        this.LJFF = C1511360pQs.LIZIZ(c1510230pP3);
        if (offloadingConfig != null && offloadingConfig.getOffloadingStrategyName() != null) {
            if (TTMStrategyCenterManager.isInit()) {
                TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey("client_ai_offloading", C13BV.INSTANCE, null, new C1513080pTe(this));
            } else {
                TTMStrategyCenterManager.registerTTMStrategyCenterStateListener(new InterfaceC829930Wh5() { // from class: X.0pTd
                    @Override // X.InterfaceC829930Wh5
                    public final void LIZ(EnumC829940Wh6 enumC829940Wh6) {
                        if (enumC829940Wh6 == EnumC829940Wh6.TTMStateInitFinish) {
                            TTMStrategyCenterManager.deregisterTTMStrategyCenterStateListener(this);
                            C1513060pTc c1513060pTc = this.LIZ;
                            c1513060pTc.getClass();
                            TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey("client_ai_offloading", C13BV.INSTANCE, null, new C1513080pTe(c1513060pTc));
                        }
                    }
                });
            }
        }
    }

    public final void LIZIZ(C1509310pNZ c1509310pNZ, C1512100pS4 c1512100pS4) {
        Map<String, Object> mapLJ;
        int i;
        if (Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3())) {
            c1512100pS4.LIZ = -107;
        }
        boolean z = C1511670pRN.LIZ;
        SmartOffloadingConfig smartOffloadingConfig = this.LJ;
        if (smartOffloadingConfig != null && smartOffloadingConfig.getEnableCloudCalculation()) {
            try {
                String str = this.LJFF;
                if (str == null) {
                    return;
                }
                if (c1509310pNZ == null || (mapLJ = c1509310pNZ.LJ) == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                String strJ3 = C786410Ut5.J3(new JSONObject(mapLJ));
                CloudInferenceStateData cloudInferenceStateData = new CloudInferenceStateData(2, "");
                C01GW c01gw = ClientAISynergyApi.LIZ;
                CloudInferenceCallBackData cloudInferenceCallBackData = ((ClientAISynergyApi.ClientAISynergyService) c01gw.getValue()).report2Cloud(new ReportRequestParams(str, strJ3, cloudInferenceStateData)).execute().LIZIZ.callbackData;
                if (cloudInferenceCallBackData != null) {
                    if (C703302op.LIZ(cloudInferenceCallBackData.requestId) && (i = cloudInferenceCallBackData.nextCall) > 0) {
                        Thread.sleep(((long) i) * 1000);
                        String str2 = ((ClientAISynergyApi.ClientAISynergyService) c01gw.getValue()).pollCloudResults(new CallBackRequestParams(this.LJFF, cloudInferenceCallBackData.requestId)).execute().LIZIZ.inferenceResult;
                        if (str2 != null) {
                            c1512100pS4.LJ = str2;
                            c1512100pS4.LIZ = 110;
                            return;
                        }
                        return;
                    }
                    c1512100pS4.LIZ = -108;
                    return;
                }
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1337780kuu.LIZ(th, null, 6);
                c1512100pS4.LIZ = -109;
                return;
            }
        }
        c1512100pS4.LIZ = 111;
    }

    public final void LIZJ(int i, long j, String str, boolean z, boolean z2, boolean z3) {
        SmartOffloadingConfig smartOffloadingConfig = this.LJ;
        if (smartOffloadingConfig != null && smartOffloadingConfig.getEnableMonitor()) {
            C20684815ws.LJIJ("client_ai_offloading_decision", new JSONObject().put("business_name", str).put("status_code", i).put("offloading_decision", z).put("keep_offloading_status", z2).put("decision_latency", j));
        }
    }
}
