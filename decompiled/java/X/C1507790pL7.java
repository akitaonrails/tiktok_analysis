package X;

import android.os.SystemClock;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.network.ECNetworkQualityReportConfigModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pL7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1507790pL7 {
    public static final C1507790pL7 LIZ = new C1507790pL7();

    public static void LIZ(String str, Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    jSONObject.put((String) entry.getKey(), JSONObject.wrap(entry.getValue()));
                }
            }
        }
        LIZLLL(str, jSONObject);
    }

    public static void LIZJ(String str, Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
            LIZLLL(str, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ECLogger: failed to convert ");
            sbLIZ.append(str);
            sbLIZ.append(" from json to map");
            C1AF0.LJFF(e, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZLLL(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ECNetworkQualityReportConfigModel eCNetworkQualityReportConfigModel = C1850207Mm.LIZ;
        ECNetworkQualityReportConfigModel eCNetworkQualityReportConfigModel2 = (ECNetworkQualityReportConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ec_network_quality_report_config", ECNetworkQualityReportConfigModel.class, eCNetworkQualityReportConfigModel);
        if (eCNetworkQualityReportConfigModel2 != null) {
            eCNetworkQualityReportConfigModel = eCNetworkQualityReportConfigModel2;
        }
        List<String> list = eCNetworkQualityReportConfigModel.networkQualityEvents;
        int i = 1;
        if (!list.isEmpty()) {
            try {
                if (list.contains(str)) {
                    C1497140p3w networkQuality = TTNetInit.getNetworkQuality();
                    C0X4L c0x4lLIZ = C0X2L.LIZ();
                    jSONObject.put("network_quality", TTNetInit.getEffectiveConnectionType());
                    jSONObject.put("downstream_kbps", networkQuality.LIZJ);
                    jSONObject.put("http_rtt", networkQuality.LIZIZ);
                    jSONObject.put("transport_rtt", networkQuality.LIZ);
                    jSONObject.put("throughput_kbps", c0x4lLIZ.LIZJ);
                    if (!c0x4lLIZ.LIZ) {
                        i = 0;
                    }
                    jSONObject.put("is_weak_network", i);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
            }
        }
        new C05D2(str, jSONObject).invoke();
    }

    public static void LJFF(String str, Map map) {
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = ILogDependencyService.class.getName();
            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
        }
        ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).onEventV3(str, (Map<String, String>) map);
    }

    public static void LJI(String str, JSONObject jSONObject) {
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = ILogDependencyService.class.getName();
            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
        }
        ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).onEventV3(str, jSONObject);
    }

    public static void LIZIZ(PageFinder pageFinder, String str, String str2, Map map) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            if (str2 != null && pageFinder != null) {
                Map mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, str2, pageFinder, null, 4, null);
                if (!mapCreateReportParams$default.isEmpty()) {
                    ArrayList arrayList = new ArrayList(mapCreateReportParams$default.size());
                    for (Map.Entry entry : mapCreateReportParams$default.entrySet()) {
                        arrayList.add((String) linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue())));
                    }
                }
            }
            LIZJ(str, linkedHashMap);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }

    public static void LJ(String str, JSONObject jSONObject, String str2, PageFinder pageFinder) {
        if (str2 != null && pageFinder != null) {
            try {
                Map mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, str2, pageFinder, null, 4, null);
                if (!mapCreateReportParams$default.isEmpty()) {
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    ArrayList arrayList = new ArrayList(mapCreateReportParams$default.size());
                    for (Map.Entry entry : mapCreateReportParams$default.entrySet()) {
                        arrayList.add(jSONObject.put((String) entry.getKey(), String.valueOf(entry.getValue())));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                return;
            }
        }
        LIZLLL(str, jSONObject);
    }
}
