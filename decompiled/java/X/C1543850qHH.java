package X;

import Y.ARunnableS123S0100000_23;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qHH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543850qHH {
    public static InterfaceC1287010jb1 LJIIL;
    public static final C1542840qFe LJIILIIL = new C1542840qFe();
    public static final ConcurrentHashMap<String, C1544530qIN> LJIILJJIL = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Object> LJIILL = new ConcurrentHashMap<>();
    public String LIZ;
    public String LIZIZ;
    public Integer LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public Integer LJII;
    public final ConcurrentHashMap<String, Object> LJIIIIZZ = new ConcurrentHashMap<>();
    public View LJIIIZ;
    public Integer LJIIJ;
    public String LJIIJJI;

    public final void LIZ() throws JSONException {
        Integer num;
        InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
        if ((C1543410qGZ.LJIILLIIL || (num = this.LIZJ) == null || num.intValue() != 0) && (this.LJIIIZ instanceof WebView)) {
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                LIZJ();
            } else {
                HandlerHook.viewPost(this.LJIIIZ, new ARunnableS123S0100000_23(this, 170));
            }
        }
    }

    public final void LIZJ() throws JSONException {
        Integer num = this.LIZJ;
        if (num == null || num.intValue() != 0) {
            ((WebView) this.LJIIIZ).evaluateJavascript("!function(){var e=window.__jsb_s_inject_data__;e||(e={fe_errors:[],fe_no_execute:!0,fe_is_iframe:!1,fe_ua:\"undefined\"!=typeof navigator?navigator.userAgent:\"\",fe_gp_api_exist:Boolean(window.__globalprops&&window.__globalprops.getGlobalProps),fe_wjsi_report_api_exist:Boolean(window.WJSIReport&&window.WJSIReport.postMessage||window.webkit&&window.webkit.messageHandlers&&window.webkit.messageHandlers.WJSIReport&&window.webkit.messageHandlers.WJSIReport.postMessage),fe_toutiao_jsbridge_api_exist:Boolean(window.ToutiaoJSBridge&&window.ToutiaoJSBridge.invokeMethod),fe_toutiao_jsbridge_apis:Object.keys(window.ToutiaoJSBridge||{})});var o=document&&document.head;if(e.fe_head_exist=Boolean(o),o)try{var _=o.querySelector('script[data-name=\"_jsmanage_tt_js_auth\"]');e.fe_script_dom_exist=Boolean(_),e.fe_script_dom_src=_&&_.src}catch(o){var i=o.toString();-1===e.fe_errors.indexOf(i)&&e.fe_errors.push(o.toString())}window.__jsb_s_inject_data__=e}(),window.__jsb_s_inject_data__;", new ValueCallback() { // from class: X.0qHR
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) throws JSONException {
                    String str = (String) obj;
                    this.LIZ.getClass();
                    try {
                        C1543800qHC c1543800qHC = C1543800qHC.LIZ;
                        JSONObject jSONObject = new JSONObject(str);
                        c1543800qHC.getClass();
                        this.LIZ.LIZIZ(1, "jsb_auth_token_event_v2", C1543800qHC.LIZIZ(jSONObject));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        int i = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("something wrong: ");
                        sbLIZ.append(e);
                        C2188811AlT.LIZIZ(sbLIZ);
                        InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
                        this.LIZ.LIZIZ(1, "jsb_auth_token_event_v2", C2097908Jt.LIZJ(new Pair("jsb_auth_raw_inject_data_error", e.getMessage())));
                    }
                }
            });
        } else {
            LIZIZ(1, "jsb_auth_token_event_v2", C2097908Jt.LIZJ(new Pair("jsb_auth_raw_inject_data_error", Integer.valueOf(Build.VERSION.SDK_INT))));
        }
    }

    public final void LIZLLL(Integer num) {
        if (this.LJII != null) {
            return;
        }
        this.LJII = num;
    }

    public final void LIZIZ(int i, String str, Map map) throws JSONException {
        ArrayList arrayList;
        Map<String, Object> mapLIZ;
        StringBuilder sb = new StringBuilder();
        Iterator<T> it2 = LJIILJJIL.keySet().iterator();
        while (true) {
            arrayList = null;
            JSONObject jSONObjectLIZ = null;
            if (!it2.hasNext()) {
                break;
            }
            String str2 = (String) it2.next();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sdk: ");
            sbLIZ.append(str2);
            sbLIZ.append(": ");
            C1544530qIN c1544530qIN = LJIILJJIL.get(str2);
            if (c1544530qIN != null) {
                jSONObjectLIZ = c1544530qIN.LIZ();
            }
            sbLIZ.append(jSONObjectLIZ);
            sbLIZ.append(',');
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        Object string = sb.toString();
        View view = this.LJIIIZ;
        C1520360pfO c1520360pfO = new C1520360pfO(str);
        c1520360pfO.LIZIZ = "jsb_auth_error_bid";
        c1520360pfO.LIZ = this.LIZIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jsb_auth_method_name", this.LIZ);
        jSONObject.put("jsb_auth_url", this.LIZIZ);
        jSONObject.put("jsb_auth_token_state", this.LIZJ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LJI);
        sbLIZ2.append('|');
        sbLIZ2.append(this.LJIIJ);
        jSONObject.put("jsb_auth_bridge_sdk", C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("");
        C1542840qFe c1542840qFe = LJIILIIL;
        sbLIZ3.append(c1542840qFe.LIZ);
        sbLIZ3.append(" | ");
        sbLIZ3.append(c1542840qFe.LIZIZ);
        jSONObject.put("jsb_auth_fetch_success", C2188811AlT.LIZIZ(sbLIZ3));
        jSONObject.put("jsb_auth_package_message", string);
        jSONObject.put("jsb_auth_fail_reason", this.LJII);
        jSONObject.put("jsb_auth_token_no_token_reason", this.LIZLLL);
        jSONObject.put("jsb_auth_current_webview_state", this.LJ);
        jSONObject.put("jsb_auth_current_webview_state_reason", this.LJFF);
        String string2 = this.LJIIJJI;
        if (string2 != null) {
            try {
                string2 = UriProtector.parse(string2).buildUpon().clearQuery().build().toString();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            string2 = null;
        }
        jSONObject.put("jsb_auth_iframe_url", string2);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, Object> entry2 : this.LJIIIIZZ.entrySet()) {
            jSONObject.put(entry2.getKey(), entry2.getValue().toString());
        }
        for (Map.Entry<String, Object> entry3 : LJIILL.entrySet()) {
            jSONObject.put(entry3.getKey(), entry3.getValue().toString());
        }
        Integer num = this.LIZJ;
        if (num == null || num.intValue() != 0) {
            View view2 = this.LJIIIZ;
            if (view2 instanceof WebView) {
                InterfaceC1287010jb1 interfaceC1287010jb1 = LJIIL;
                if (interfaceC1287010jb1 != null && (mapLIZ = interfaceC1287010jb1.LIZ((WebView) view2)) != null) {
                    for (Map.Entry<String, Object> entry4 : mapLIZ.entrySet()) {
                        jSONObject.put(entry4.getKey(), entry4.getValue());
                    }
                }
                StringBuilder sb2 = new StringBuilder("");
                View view3 = this.LJIIIZ;
                if (view3 instanceof WebView) {
                    WebBackForwardList webBackForwardListCopyBackForwardList = ((WebView) view3).copyBackForwardList();
                    arrayList = new ArrayList();
                    int size = webBackForwardListCopyBackForwardList.getSize();
                    for (int i2 = 0; i2 < size; i2++) {
                        String url = webBackForwardListCopyBackForwardList.getItemAtIndex(i2).getUrl();
                        try {
                            url = UriProtector.parse(url).buildUpon().clearQuery().build().toString();
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        arrayList.add(url);
                    }
                }
                sb2.append(arrayList);
                sb2.append("; jsb_auth_webview_token_msg:");
                View view4 = this.LJIIIZ;
                StringBuilder sb3 = new StringBuilder();
                ConcurrentHashMap<String, C1544400qIA> concurrentHashMap = C1543920qHO.LIZ.get(String.valueOf(view4.hashCode()));
                if (concurrentHashMap != null) {
                    for (Map.Entry<String, C1544400qIA> entry5 : concurrentHashMap.entrySet()) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(entry5.getValue().LIZ);
                        sbLIZ4.append(" : ");
                        sbLIZ4.append(entry5.getValue().LIZIZ);
                        sbLIZ4.append(';');
                        sb3.append(C2188811AlT.LIZIZ(sbLIZ4));
                    }
                }
                sb2.append(sb3.toString());
                jSONObject.put("jsb_auth_webview_url_history", sb2.toString());
            }
        }
        c1520360pfO.LIZLLL = jSONObject;
        c1520360pfO.LJIIJJI = EnumC993170bx5.Both;
        c1520360pfO.LIZIZ(i);
        C1538660q8u.LIZ(view, c1520360pfO.LIZ());
    }
}
