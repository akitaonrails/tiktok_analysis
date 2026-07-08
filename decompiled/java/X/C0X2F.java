package X;

import android.os.Process;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
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
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0X2F, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X2F extends C0X2B {
    public static final C0X2F LJI = new C0X2F();
    public boolean LJ;
    public boolean LJFF;

    @Override // X.C0X2B
    public final Pair<JSONArray, JSONArray> LIZJ() {
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
        JSONArray jSONArray2 = new JSONArray();
        Iterator<String> it3 = C19273110af.LIZ().getBoeBypassPathList().iterator();
        while (it3.hasNext()) {
            jSONArray2.put(it3.next());
        }
        return new Pair<>(jSONArray, jSONArray2);
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final List<String> getAbSdkVersion() {
        IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi(IPluginService.class);
        return Arrays.asList(C1486420ome.LIZ(), iPluginService != null ? iPluginService.getPluginConfigProtoBufVid() : "");
    }

    @Override // X.C0X2B, com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final String getAppId() {
        if (!this.LJ && ((((Boolean) C1EDT.LIZIZ.getValue()).booleanValue() || C0BUP.LIZ() != -1) && C786410Ut5.u3().getName().startsWith("ChromiumNet"))) {
            C2187451AjH.LJII = Process.myTid();
            C0X35.LJIIIZ();
            this.LJ = true;
        }
        if (!this.LJFF && C786410Ut5.u3().getName().startsWith("TTNet-AN-IO")) {
            C2187451AjH.LJIIIIZZ = Process.myTid();
            this.LJFF = true;
        }
        return super.getAppId();
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

    @Override // X.C0X2B, com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final Map<String, String> getTNCRequestHeader() {
        Map<String, String> tNCRequestHeader = super.getTNCRequestHeader();
        if (C2429209fW.LIZ().LJ()) {
            tNCRequestHeader.put("x-tt-dataflow-id", "738197762");
        }
        String strLIZ = !C310450CEx.LIZ() ? BDNetworkTagManager.LIZIZ().LIZ(new InterfaceC1489700orw() { // from class: X.0X2G
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
        tNCRequestHeader.put("x-tt-request-tag", strLIZ);
        ServiceManager.get().getService(INetworkDebugService.class);
        C0C64.LJIILLIIL().LJIIIZ(31744, "enable_add_env_into_tnc_headers", true, true);
        return tNCRequestHeader;
    }

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter, com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onCronetBootSucceed() {
        super.onCronetBootSucceed();
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

    @Override // com.bytedance.ttnet.cronet.AbsCronetDependAdapter
    public final void LIZIZ(int i, int i2, int i3) {
        boolean z = C0X2L.LIZ;
        if (!C0X2J.LIZ.contains(Integer.valueOf(i3)) && i3 > 0) {
            C0X2L.LIZIZ.execute(new C0X2K(i3));
        }
    }
}
