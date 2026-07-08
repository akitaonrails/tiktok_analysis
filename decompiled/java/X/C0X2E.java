package X;

import Y.ARunnableS113S0100000_13;
import Y.ARunnableS18S1100000_13;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.cronet.AbsCronetDependAdapter;
import com.ss.android.account.TTAccountInit;
import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService2;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.service.ILarkMsgReportHostService;
import com.ss.android.ugc.aweme.service.INetworkDebugService;
import com.ss.android.ugc.quota.BDNetworkTagManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0X2E, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X2E extends AbsCronetDependAdapter {
    public static final C0X2E LIZJ = new C0X2E();
    public static final Keva LIZLLL = Keva.getRepo("network_keva");
    public static final Pattern LJ = PatternProtector.compile("(https:.+?)\\?.+?,.*?store-country-code=([a-zA-Z]+);.*? store-country-code-src=([a-zA-Z]+);.*?x-tt-logid=\\[([0-9a-zA-Z]+?)\\]");
    public static final Pattern LJFF = PatternProtector.compile("x-tt-tnc-attr=\\[(.*?)\\]");
    public static final Pattern LJI = PatternProtector.compile("x-tt-with-tnc=\\[([0-9A-Za-z]+)\\]");
    public boolean LIZ;
    public boolean LIZIZ;

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter
    public final void LIZ() {
    }

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

    public static JSONArray LIZJ() {
        JSONArray jSONArray = new JSONArray();
        if (ServiceManager.get().getService(ILarkMsgReportHostService.class) != null) {
            String strLIZ = ((ILarkMsgReportHostService) ServiceManager.get().getService(ILarkMsgReportHostService.class)).LIZ();
            if (!TextUtils.isEmpty(strLIZ)) {
                jSONArray.put(strLIZ);
            }
        }
        Iterator<String> it2 = C19273110af.LIZ().getBoeBypassHostList().iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next());
        }
        return jSONArray;
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final List<String> getAbSdkVersion() {
        IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi(IPluginService.class);
        return Arrays.asList(C1486420ome.LIZ(), iPluginService != null ? iPluginService.getPluginConfigProtoBufVid() : "");
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAbVersion() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZJ();
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAppId() {
        if (!this.LIZ && ((((Boolean) C1EDT.LIZIZ.getValue()).booleanValue() || C0BUP.LIZ() != -1) && C786410Ut5.u3().getName().startsWith("ChromiumNet"))) {
            C2187451AjH.LJII = Process.myTid();
            C0X35.LJIIIZ();
            this.LIZ = true;
        }
        if (!this.LIZIZ && C786410Ut5.u3().getName().startsWith("TTNet-AN-IO")) {
            C2187451AjH.LJIIIIZZ = Process.myTid();
            this.LIZIZ = true;
        }
        if (!C310450CEx.LIZ() || !C0CD2.LIZLLL()) {
            return String.valueOf(DeviceRegisterManager.getAppId());
        }
        C844470XAv.LIZ.getClass();
        return String.valueOf(C844470XAv.LJIIJ);
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAppName() {
        C844470XAv.LIZ.getClass();
        String str = C844470XAv.LJ;
        if (str == null) {
            return null;
        }
        return str;
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getBypassBOEJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bypass_boe_host_list", LIZJ());
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it2 = C19273110af.LIZ().getBoeBypassPathList().iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next());
            }
            jSONObject.put("bypass_boe_path_list", jSONArray);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getChannel() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJIILL;
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getManifestVersionCode() {
        C844470XAv.LIZ.getClass();
        return String.valueOf(C844470XAv.LJ());
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final ArrayList<byte[]> getOpaqueData() {
        if (!LIZLLL.getBoolean("opaque_data_enabled", true)) {
            return null;
        }
        ArrayList<byte[]> arrayList = (ArrayList) C0X2D.LIZJ.getValue();
        C823050WQl.LIZLLL().execute(new ARunnableS113S0100000_13(arrayList, 271));
        return arrayList;
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final boolean getOptInit() {
        return ((Boolean) C0X3B.LIZIZ.getValue()).booleanValue();
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final boolean getOptNqeDefault() {
        return ((Boolean) C0X3B.LIZJ.getValue()).booleanValue();
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final boolean getOptNqePersist() {
        return ((Boolean) C0X3B.LIZLLL.getValue()).booleanValue();
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getUpdateVersionCode() {
        C844470XAv.LIZ.getClass();
        return String.valueOf(C844470XAv.LIZLLL());
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getVersionCode() {
        C844470XAv.LIZ.getClass();
        return String.valueOf(C844470XAv.LIZIZ());
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getVersionName() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZJ();
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
    public final String getCarrierRegion() {
        return C2222691Bz1.LJ();
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getGetDomainDefaultJSON() {
        String strLIZIZ = C2222691Bz1.LIZIZ();
        for (String str : C0X4M.LIZJ) {
            if (str.equalsIgnoreCase(strLIZIZ)) {
                return C0X4M.LJI;
            }
        }
        return C0X4M.LJII;
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getRegion() {
        return C2222691Bz1.LIZIZ();
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getStoreIdc() {
        return C2280581EOi.get().getStoreIdc();
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getSysRegion() {
        return C2222691Bz1.LJFF();
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final Map<String, String> getTNCRequestHeader() throws JSONException {
        TTAccountInit.LIZ().getClass();
        Map<String, String> mapLIZJ = C847400XMc.LIZJ("https://api-va.tiktokv.com");
        if (mapLIZJ == null) {
            mapLIZJ = new HashMap<>();
        }
        if (C2429209fW.LIZ().LJ()) {
            mapLIZJ.put("x-tt-dataflow-id", "738197762");
        }
        String strLIZ = !C310450CEx.LIZ() ? BDNetworkTagManager.LIZIZ().LIZ(new InterfaceC1489700orw() { // from class: X.0X2H
            @Override // X.InterfaceC1489700orw
            public final void LIZ() {
            }

            @Override // X.InterfaceC1489700orw
            public final void triggerType() {
            }
        }) : "";
        if (strLIZ.isEmpty()) {
            strLIZ = C1514430pVp.LIZLLL().booleanValue() ? "n=1" : "n=0";
        }
        mapLIZJ.put("x-tt-request-tag", strLIZ);
        ServiceManager.get().getService(INetworkDebugService.class);
        C0C64.LJIILLIIL().LJIIIZ(31744, "enable_add_env_into_tnc_headers", true, true);
        return mapLIZJ;
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public final boolean loggerDebug() {
        if (C1496600p34.LIZ()) {
            return true;
        }
        C844470XAv.LIZ.getClass();
        return "local_test".equals(C844470XAv.LJIILL);
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onCronetBootSucceed() {
        super.onCronetBootSucceed();
    }

    public static final void LIZLLL(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ttnet_duration");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    C1150504el.LIZ().LJ(jSONObjectOptJSONObject.optLong(next), C786410Ut5.j4("%s_%s", new Object[]{"ttnet_duration", next}));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onEffectiveConnectionTypeChanged(int i) {
        C912260Zqa.LIZIZ.onTTNetNqeChanged(i);
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onServerConfigUpdated(String str) {
        HashMap map;
        C0X2N.LJ();
        super.onServerConfigUpdated(str);
        try {
            JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(new JSONObject(str), "data");
            String string = JSONObjectProtectorUtils.getString(jSONObject, "share_cookie_host_list");
            String[] strArrSplit = string.split(",");
            ArrayList arrayList = new ArrayList();
            for (String strSubstring : strArrSplit) {
                if (strSubstring.startsWith(e3.d)) {
                    strSubstring = strSubstring.substring(1);
                }
                arrayList.add(strSubstring);
            }
            C1BYN.LIZIZ.LJI(arrayList);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tnc shareCookieList ");
            sbLIZ.append(string);
            C2188811AlT.LIZIZ(sbLIZ);
            C0X2N.LJ();
            InterfaceC1482870ogv interfaceC1482870ogvLIZ = C1478160oZK.LIZ();
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "ttnet_http_dns_addr");
            if (jSONObject2 == null) {
                map = null;
            } else {
                map = new HashMap();
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, String.valueOf(jSONObject2.get(next)));
                }
            }
            interfaceC1482870ogvLIZ.LJJIJL(map);
            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi(ILiveOuterService.class);
            if (iLiveOuterService != null) {
                iLiveOuterService.z4(jSONObject);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        IGeoBlockingService2 iGeoBlockingService2 = (IGeoBlockingService2) PluggableExtentionKt.pluggableSpi(IGeoBlockingService2.class);
        if (iGeoBlockingService2 != null) {
            iGeoBlockingService2.LIZ();
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
            C794240VDq.LIZJ(str2, jSONObject);
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
                C823050WQl.LIZJ().execute(new ARunnableS18S1100000_13(str, jSONObject, 5));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter
    public final void LIZIZ(int i, int i2, int i3) {
        boolean z = C0X2L.LIZ;
        if (!C0X2J.LIZ.contains(Integer.valueOf(i3)) && i3 > 0) {
            C0X2L.LIZIZ.execute(new C0X2K(i3));
        }
    }
}
