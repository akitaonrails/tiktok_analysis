package X;

import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadActionConfig;
import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadSceneConfig;
import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadStrategyConfig;
import com.bytedance.android.livesdkapi.host.IHostAction;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0efH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1097450efH {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(InterfaceC1097480efK interfaceC1097480efK, boolean z, Integer num, String str, long j) {
        String sceneKey;
        String str2;
        Object objLJ;
        Map<String, String> mapLJ;
        boolean z2;
        PreloadActionConfig preloadActionConfig;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC1097470efJ scene = interfaceC1097480efK.getScene();
        String str3 = "";
        if (scene == null || (sceneKey = scene.getSceneKey()) == null) {
            sceneKey = "";
        }
        linkedHashMap.put("scene_key", sceneKey);
        PreloadStrategyConfig config = interfaceC1097480efK.getConfig();
        if (config == null || (str2 = config.strategyKey) == null) {
            str2 = "";
        }
        linkedHashMap.put("strategy_key", str2);
        String strLIZ = interfaceC1097480efK.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        linkedHashMap.put("strategy_value", strLIZ);
        linkedHashMap.put("is_success", Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0));
        Object obj = num;
        if (num == null) {
            obj = "";
        }
        linkedHashMap.put("error_code", obj);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("error_message", str);
        linkedHashMap.put("duration", Long.valueOf(j));
        linkedHashMap.put("action", Integer.valueOf(interfaceC1097480efK.LIZLLL()));
        PreloadStrategyConfig config2 = interfaceC1097480efK.getConfig();
        if (config2 != null && (preloadActionConfig = config2.preloadAction) != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            String str4 = preloadActionConfig.accessKey;
            if (str4 == null) {
                str4 = "";
            }
            linkedHashMap2.put("access_key", str4);
            String str5 = preloadActionConfig.channel;
            if (str5 == null) {
                str5 = "";
            }
            linkedHashMap2.put("channel", str5);
            String str6 = preloadActionConfig.bizKey;
            if (str6 == null) {
                str6 = "";
            }
            linkedHashMap2.put("biz_key", str6);
            String str7 = preloadActionConfig.scheme;
            if (str7 == null) {
                str7 = "";
            }
            linkedHashMap2.put("scheme", str7);
            String str8 = preloadActionConfig.apiPath;
            if (str8 != null) {
                str3 = str8;
            }
            linkedHashMap2.put("api_path", str3);
            objLJ = linkedHashMap2;
        } else {
            objLJ = C2097608Jq.LJ();
        }
        linkedHashMap.putAll(objLJ);
        InterfaceC1097470efJ scene2 = interfaceC1097480efK.getScene();
        if (scene2 == null || (mapLJ = scene2.getLogParam()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        linkedHashMap.putAll(mapLJ);
        int iLIZLLL = interfaceC1097480efK.LIZLLL();
        if (iLIZLLL > 0 && (iLIZLLL & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).onGeckoEventTrigger("livesdk_run_pre_action_result", linkedHashMap);
        }
        PreloadStrategyConfig config3 = interfaceC1097480efK.getConfig();
        if (config3 != null && C222100tP.LIZ(config3.reportSamplingRate)) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_run_pre_action_result");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJIIZI(C500260Jjc.LLD(linkedHashMap));
            c474500IjALIZ.LJJIJL();
        }
    }

    public static void LIZIZ(PreloadSceneConfig preloadSceneConfig, InterfaceC1097470efJ interfaceC1097470efJ, String str, String str2, boolean z, Integer num, String str3, long j) {
        String sceneKey;
        if (preloadSceneConfig != null && C222100tP.LIZ(preloadSceneConfig.reportSamplingRate)) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_run_preload_strategy_result");
            c474500IjALIZ.LJIL();
            Map<String, String> logParam = null;
            if (interfaceC1097470efJ != null) {
                sceneKey = interfaceC1097470efJ.getSceneKey();
            } else {
                sceneKey = null;
            }
            c474500IjALIZ.LJJII(sceneKey, "scene_key");
            c474500IjALIZ.LJJII(str, "strategy_key");
            c474500IjALIZ.LJJII(str2, "strategy_value");
            c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_success");
            c474500IjALIZ.LJJII(num, "error_code");
            c474500IjALIZ.LJJII(str3, "error_message");
            c474500IjALIZ.LJJII(Long.valueOf(j), "duration");
            if (interfaceC1097470efJ != null) {
                logParam = interfaceC1097470efJ.getLogParam();
            }
            c474500IjALIZ.LJJIIZI(logParam);
            c474500IjALIZ.LJJIJL();
        }
    }
}
