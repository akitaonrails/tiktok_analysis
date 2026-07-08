package X;

import Y.ARunnableS113S0100000_13;
import Y.ARunnableS18S1200000_13;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.cronet.AbsCronetDependAdapter;
import com.ss.android.account.TTAccountInit;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X2B, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0X2B extends AbsCronetDependAdapter {
    public static final Keva LIZ = Keva.getRepo("network_keva");
    public static final Pattern LIZIZ = PatternProtector.compile("(https:.+?)\\?.+?,.*?store-country-code=([a-zA-Z]+);.*? store-country-code-src=([a-zA-Z]+);.*?x-tt-logid=\\[([0-9a-zA-Z]+?)\\]");
    public static final Pattern LIZJ = PatternProtector.compile("x-tt-tnc-attr=\\[(.*?)\\]");
    public static final Pattern LIZLLL = PatternProtector.compile("x-tt-with-tnc=\\[([0-9A-Za-z]+)\\]");

    public abstract Pair<JSONArray, JSONArray> LIZJ();

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAbClient() {
        return null;
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAbFeature() {
        return null;
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAbFlag() {
        return CardStruct.IStatusCode.DEFAULT;
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getDeviceId() {
        return AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getOpenUdid() {
        return "";
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getStoreIdcRuleJSON() {
        return "{\"update_store_idc_path_list\": [\"/passport/*\",\"/service/*/device_register/\",\"/service/*/app_alert_check/\", \"/service/*/app_alert/\"],\"add_store_idc_host_list\":[\"*.tiktokv.com\",\"*.tiktok.com\", \"*.tiktokv.us\",\"*.tiktokv.eu\",\"*.tiktokw.us\",\"*.tiktokw.eu\",\"*.tiktokv.com.boe-gateway.byted.org\"]}";
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getUUID() {
        return "";
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getUserId() {
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getUserId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getUserId();
        return (C2093608Ic.LJ(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getUserId) || strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getUserId.equals(CardStruct.IStatusCode.DEFAULT)) ? C0XQ7.LJFF().getCurUserId() : strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getUserId;
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAbVersion() {
        return C2213981Bky.LIZIZ.LIZJ();
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAppId() {
        return String.valueOf(C2213981Bky.LIZIZ.getAppId());
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAppName() {
        return C2213981Bky.LIZIZ.getAppName();
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getBypassBOEJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Pair<JSONArray, JSONArray> pairLIZJ = LIZJ();
            jSONObject.put("bypass_boe_host_list", pairLIZJ.getFirst());
            jSONObject.put("bypass_boe_path_list", pairLIZJ.getSecond());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getChannel() {
        return C2213981Bky.LIZIZ.getChannel();
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getManifestVersionCode() {
        return String.valueOf(C2213981Bky.LIZIZ.getVersionCode());
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final ArrayList<byte[]> getOpaqueData() {
        C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
        if (c2213981Bky.getChannel().equals("monkey") || c2213981Bky.getChannel().equals("autotest")) {
            return null;
        }
        if (!LIZ.getBoolean("opaque_data_enabled", !c2213981Bky.isDebug())) {
            return null;
        }
        ArrayList<byte[]> arrayList = (ArrayList) C0X2D.LIZJ.getValue();
        C823050WQl.LIZLLL().execute(new ARunnableS113S0100000_13(arrayList, 271));
        return arrayList;
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getUpdateVersionCode() {
        return String.valueOf(C2213981Bky.LIZIZ.getUpdateVersionCode());
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getVersionCode() {
        return String.valueOf(C2213981Bky.LIZIZ.LIZIZ());
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getVersionName() {
        return C2213981Bky.LIZIZ.LIZJ();
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAppInitialRegionInfo() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("carrierregion=");
        sbLIZ.append(C2222691Bz1.LJ());
        sbLIZ.append(";mccmnc=");
        sbLIZ.append(C1319780kRs.LIZIZ());
        sbLIZ.append(";sysregion=");
        sbLIZ.append(C2222691Bz1.LJFF());
        sbLIZ.append(";appregion=");
        sbLIZ.append(C2222691Bz1.LIZIZ());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String, String> getTNCRequestHeader() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        TTAccountInit.LIZ().getClass();
        sbLIZ.append("api-va.tiktokv.com");
        Map<String, String> mapLIZJ = C847400XMc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        return mapLIZJ == null ? new HashMap() : mapLIZJ;
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public final boolean loggerDebug() {
        return C1496600p34.LIZ() || "local_test".equals(C2213981Bky.LIZIZ.getChannel());
    }

    public static final void LIZLLL(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ttnet_duration");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    C1150504el.LIZ().LJ(Long.valueOf(jSONObjectOptJSONObject.optLong(next)).longValue(), C786410Ut5.j4("%s_%s", new Object[]{"ttnet_duration", next}));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void sendAppMonitorEvent(String str, String str2) {
        try {
            if (C1496600p34.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Get monitor logType = ");
                sbLIZ.append(str2);
                sbLIZ.append(" logContent = ");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            JSONObject jSONObject = new JSONObject(str);
            if ("ttnet_insec_rect".equals(str2)) {
                C793770VBv.LJII(str2, jSONObject, null, null);
                return;
            }
            C0XPI c0xpiLIZJ = C0XM1.LIZJ();
            if (c0xpiLIZJ != null) {
                c0xpiLIZJ.monitorCommonLog(str2, jSONObject);
            }
            if ("ttnet_init".equals(str2)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Get monitor json = ");
                sbLIZ2.append(str);
                sbLIZ2.append(" logType = ");
                sbLIZ2.append(str2);
                C2188811AlT.LIZIZ(sbLIZ2);
                LIZLLL(jSONObject);
                return;
            }
            if ("store_idc".equals(str2)) {
                C823050WQl.LIZJ().execute(new ARunnableS18S1200000_13(this, jSONObject, str, 4));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
