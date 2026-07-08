package X;

import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.EventDrivenConfig;
import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadActionConfig;
import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadSceneConfig;
import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadStrategyConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0efE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1097420efE {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1097430efF());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1097460efI());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C189400o8(this));
    public final List<InterfaceC1097480efK> LIZLLL = new ArrayList();
    public volatile boolean LJ;
    public final PreloadSceneConfig LJFF;
    public final C054G LJI;

    public C1097420efE() {
        PreloadSceneConfig preloadSceneConfig = new PreloadSceneConfig(null, null, null, 0, 15, null);
        preloadSceneConfig.sceneKey = "live_pcs_event_driven_scene";
        preloadSceneConfig.reportSamplingRate = 100;
        this.LJFF = preloadSceneConfig;
        this.LJI = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()));
    }

    public final void LIZ(C1097360ef8 c1097360ef8, EventDrivenConfig eventDrivenConfig, PreloadStrategyConfig preloadStrategyConfig) {
        List listLIZ = C1097580efU.LIZ(eventDrivenConfig.preloadType);
        ArrayList<InterfaceC1097480efK> arrayList = new ArrayList();
        for (InterfaceC1097480efK interfaceC1097480efK : (ArrayList) listLIZ) {
            interfaceC1097480efK.LIZJ(preloadStrategyConfig, c1097360ef8, String.valueOf(eventDrivenConfig.preloadType));
            if (interfaceC1097480efK.LIZIZ() && c1097360ef8.LJFF(preloadStrategyConfig)) {
                arrayList.add(interfaceC1097480efK);
            }
        }
        for (InterfaceC1097480efK interfaceC1097480efK2 : arrayList) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start run action ");
            sbLIZ.append(interfaceC1097480efK2);
            C1096330edT.LIZ("GeneralPreloadTask", C2188811AlT.LIZIZ(sbLIZ));
            interfaceC1097480efK2.execute();
        }
        C19719612Di.LJJI(arrayList, this.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(Map<String, String> map, EventDrivenConfig eventDrivenConfig, Map<String, String> map2) {
        Integer numLJIIJJI;
        Boolean boolLJLI;
        Integer numLJIIJJI2;
        Boolean boolLJLI2;
        Integer numLJIIJJI3;
        PreloadActionConfig preloadActionConfig = eventDrivenConfig.config;
        if (preloadActionConfig != null) {
            preloadActionConfig.actionCombineValue = Integer.valueOf(eventDrivenConfig.preloadType);
            LinkedHashMap linkedHashMap = (LinkedHashMap) map2;
            String str = (String) linkedHashMap.get("access_key");
            if (str == null) {
                str = preloadActionConfig.accessKey;
            }
            preloadActionConfig.accessKey = str;
            String str2 = (String) linkedHashMap.get("channel");
            if (str2 == null) {
                str2 = preloadActionConfig.channel;
            }
            preloadActionConfig.channel = str2;
            String str3 = (String) linkedHashMap.get("biz_key");
            if (str3 == null) {
                str3 = preloadActionConfig.bizKey;
            }
            preloadActionConfig.bizKey = str3;
            String str4 = (String) linkedHashMap.get("scheme");
            if (str4 == null) {
                str4 = preloadActionConfig.scheme;
            }
            preloadActionConfig.scheme = str4;
            String str5 = (String) linkedHashMap.get("scheme_unique_path");
            if (str5 == null) {
                str5 = preloadActionConfig.schemeUniquePath;
            }
            preloadActionConfig.schemeUniquePath = str5;
            String str6 = (String) linkedHashMap.get("expired_second");
            if (str6 == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str6)) == null) {
                numLJIIJJI = preloadActionConfig.expiredSecond;
            }
            preloadActionConfig.expiredSecond = numLJIIJJI;
            String str7 = (String) linkedHashMap.get("pending_load");
            if (str7 == null || (boolLJLI = a0.LJLI(str7)) == null) {
                boolLJLI = preloadActionConfig.pendingLoad;
            }
            preloadActionConfig.pendingLoad = boolLJLI;
            String str8 = (String) linkedHashMap.get("enable_pending_js_task");
            if (str8 == null || (numLJIIJJI2 = C2095008Iq.LJIIJJI(str8)) == null) {
                numLJIIJJI2 = preloadActionConfig.enablePendingJsTask;
            }
            preloadActionConfig.enablePendingJsTask = numLJIIJJI2;
            String str9 = (String) linkedHashMap.get("api_path");
            if (str9 == null) {
                str9 = preloadActionConfig.apiPath;
            }
            preloadActionConfig.apiPath = str9;
            String str10 = (String) linkedHashMap.get("force_fetch");
            if (str10 == null || (boolLJLI2 = a0.LJLI(str10)) == null) {
                boolLJLI2 = preloadActionConfig.forceFetch;
            }
            preloadActionConfig.forceFetch = boolLJLI2;
            String str11 = (String) linkedHashMap.get("cache_duration");
            if (str11 == null || (numLJIIJJI3 = C2095008Iq.LJIIJJI(str11)) == null) {
                numLJIIJJI3 = preloadActionConfig.cacheDuration;
            }
            preloadActionConfig.cacheDuration = numLJIIJJI3;
        }
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Object key = ((Map.Entry) it2.next()).getKey();
            Object obj = ((LinkedHashMap) map2).get(key);
            if (obj != null) {
                map.put(key, obj);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key2 = entry.getKey();
            Object obj2 = ((Map) this.LIZJ.getValue()).get(entry.getValue());
            if (obj2 != null) {
                map.put(key2, obj2);
            }
        }
    }
}
