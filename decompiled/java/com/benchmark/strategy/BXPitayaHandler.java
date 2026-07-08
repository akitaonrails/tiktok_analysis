package com.benchmark.strategy;

import X.C212350188e;
import X.C21309718aN;
import X.C786410Ut5;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.pitaya.api.mutilinstance.HostSetupListener;
import com.bytedance.pitaya.api.mutilinstance.HostSetupWatcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class BXPitayaHandler {
    public static String Aid;
    public static boolean isPitayReady;

    public static void InitPitayaHandler() {
        Aid = String.valueOf(C21309718aN.LJIIZILJ.LIZJ);
        HostSetupWatcher hostSetupWatcher = HostSetupWatcher.INSTANCE;
        if (hostSetupWatcher.isHostSetup()) {
            return;
        }
        hostSetupWatcher.registerHostSetupListener(new HostSetupListener() { // from class: com.benchmark.strategy.BXPitayaHandler.2
            @Override // com.bytedance.pitaya.api.mutilinstance.HostSetupListener
            public void onHostSetup(boolean z) {
                if (!C21309718aN.LJIIZILJ.LJIIJ.get()) {
                    return;
                }
                if (z) {
                    BXPitayaHandler.isPitayReady = PitayaCoreFactory.getCore(BXPitayaHandler.Aid).isReady();
                    C212350188e.LIZJ().LIZ().LJIIIIZZ("test_pitaya", "-10086");
                } else {
                    BXPitayaHandler.isPitayReady = false;
                }
            }
        });
    }

    public static String runPitaya(String str, String str2, String str3) {
        JSONObject jSONObject;
        if (!isPitayReady) {
            return "";
        }
        IPitayaCore core = PitayaCoreFactory.getCore(Aid);
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e) {
            e = e;
        }
        try {
            jSONObject.put("output1", 9.5683d);
        } catch (JSONException e2) {
            e = e2;
            jSONObject2 = jSONObject;
            TryCatchGuardChecker.doCheck(e);
            jSONObject = jSONObject2;
        }
        final String[] strArr = new String[1];
        core.runTask(str, new PTYTaskData(jSONObject), new PTYTaskConfig(true, str3, -1.0f), new PTYTaskResultCallback() { // from class: com.benchmark.strategy.BXPitayaHandler.1
            @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
            public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
                if (z) {
                    strArr[0] = C786410Ut5.J3(pTYTaskData.getParams());
                } else {
                    strArr[0] = "";
                }
            }
        });
        return strArr[0];
    }
}
