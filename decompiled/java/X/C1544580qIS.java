package X;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.hybrid.spark.security.api.SparkSecurityServiceCenter;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSIService;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSInjectionService;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0qIS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544580qIS extends AbstractC1541650qDj<C1ET2> implements InterfaceC1524070plN {
    public final C1544850qIt LLIZ = new C1544850qIt();
    public final C828390Web LLIZLLLIL = new C1ET3() { // from class: X.0Web
        @Override // X.C1ET3
        public final void LJI() {
            super.LJI();
            this.LL.LLIZ.destroy(getExtendable());
        }

        @Override // X.AbstractC1541670qDl
        public final AbstractC1541650qDj<?> getExtension() {
            return this.LL;
        }

        @Override // X.C1ET3
        public final void LJJII(String str) {
            WebKitView webKitView;
            String str2;
            int iIntValue;
            this.LL.LLIZ.LJ(getExtendable(), str);
            C1ET2 extendable = getExtendable();
            if ((extendable instanceof WebKitView) && (webKitView = (WebKitView) extendable) != null) {
                C1544580qIS c1544580qIS = this.LL;
                if (str != null && str.length() != 0 && u.LJJIIJZLJL(str, "javascript:", false)) {
                    Object tag = webKitView.getTag(R.id.vsq);
                    if (!(tag instanceof String) || (str2 = (String) tag) == null) {
                        str2 = "";
                    }
                    if (str2.length() == 0) {
                        Integer numValueOf = Integer.valueOf(webKitView.getHybridContext().LJ());
                        SparkSecurityJSInjectionService sparkSecurityJSInjectionService = (SparkSecurityJSInjectionService) SparkSecurityServiceCenter.INSTANCE.protocol();
                        C828420Wee c828420Wee = new C828420Wee(C1E6N.SparkSecuritySolutionEndpointNative, C1E6N.SparkSecuritySolutionEndpointWebView, C1E6B.SparkSecuritySolutionChannelJSExecution);
                        Map<String, Object> map = c828420Wee.LJFF;
                        if (numValueOf != null) {
                            iIntValue = numValueOf.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        map.put("dataflowId", Integer.valueOf(iIntValue));
                        c828420Wee.LJFF.put("URL", str);
                        c828420Wee.LJFF.put("inject_script", str);
                        c828420Wee.LJFF.put("engine_view", webKitView);
                        C821850WLv c821850WLvHandleWillLoadURLWithScriptWithEvent = sparkSecurityJSInjectionService.handleWillLoadURLWithScriptWithEvent(c828420Wee);
                        if (c821850WLvHandleWillLoadURLWithScriptWithEvent != null && c821850WLvHandleWillLoadURLWithScriptWithEvent.LIZ) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("reject by spark security solution. URL: ");
                            sbLIZ.append(str);
                            C1544840qIs.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                            return;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("inject by native API loadUrl. URL: ");
                        sbLIZ2.append(str);
                        C1544840qIs.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                        super.LJJII(str);
                        c1544580qIS.LLIZ.LJFF(getExtendable());
                        return;
                    }
                }
            }
            super.LJJII(str);
            this.LL.LLIZ.LJFF(getExtendable());
        }

        @Override // X.C1ET3
        public final void LIZ(Object obj, String str) {
            WebKitView webKitView;
            HybridSchemaParam hybridSchemaParamLIZJ;
            SparkSecurityJSIService sparkSecurityJSIService = (SparkSecurityJSIService) SparkSecurityServiceCenter.INSTANCE.protocol();
            C828420Wee c828420Wee = new C828420Wee(C1E6N.SparkSecuritySolutionEndpointNative, C1E6N.SparkSecuritySolutionEndpointWebView, C1E6B.SparkSecuritySolutionJSI);
            C1ET2 extendable = getExtendable();
            if (extendable instanceof WebKitView) {
                webKitView = (WebKitView) extendable;
            } else {
                webKitView = null;
            }
            String str2 = "";
            if (webKitView != null) {
                Map<String, Object> map = c828420Wee.LJFF;
                String url = webKitView.getUrl();
                if (url == null) {
                    url = "";
                }
                map.put("URL", url);
                C1537480q70 hybridContext = webKitView.getHybridContext();
                InterfaceC1531560pxS interfaceC1531560pxS = hybridContext.hybridParams;
                if (interfaceC1531560pxS != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null) {
                    Map<String, Object> map2 = c828420Wee.LJFF;
                    String url2 = hybridSchemaParamLIZJ.getUrl();
                    if (url2.length() == 0) {
                        url2 = hybridSchemaParamLIZJ.getSurl();
                    }
                    map2.put("URL", url2);
                } else {
                    String strLJIJI = hybridContext.LJIJI();
                    if (u.LJJIIJZLJL(strLJIJI, "http", false) && strLJIJI != null) {
                        c828420Wee.LJFF.put("URL", strLJIJI);
                    }
                }
                c828420Wee.LJFF.put("dataflowId", Integer.valueOf(hybridContext.LJ()));
            }
            c828420Wee.LJFF.put("dataflowId", 0);
            Map<String, Object> map3 = c828420Wee.LJFF;
            if (str != null) {
                str2 = str;
            }
            map3.put("jsi_name", str2);
            c828420Wee.LJFF.put("jsi_object", obj);
            C821850WLv c821850WLvHandleWillAddJavascriptInterface = sparkSecurityJSIService.handleWillAddJavascriptInterface(c828420Wee);
            if (c821850WLvHandleWillAddJavascriptInterface != null && c821850WLvHandleWillAddJavascriptInterface.LIZ) {
                return;
            }
            super.LIZ(obj, str);
        }

        @Override // X.C1ET3
        public final void LJIIL(String str, ValueCallback<String> valueCallback) {
            WebKitView webKitView;
            String url;
            int iIntValue;
            String str2;
            C1ET2 extendable = getExtendable();
            if ((extendable instanceof WebKitView) && (webKitView = (WebKitView) extendable) != null && (url = webKitView.getUrl()) != null && url.length() != 0 && str != null && str.length() != 0) {
                Object tag = webKitView.getTag(R.id.vsq);
                if (!(tag instanceof String) || (str2 = (String) tag) == null || str2.length() == 0) {
                    Integer numValueOf = Integer.valueOf(webKitView.getHybridContext().LJ());
                    SparkSecurityJSInjectionService sparkSecurityJSInjectionService = (SparkSecurityJSInjectionService) SparkSecurityServiceCenter.INSTANCE.protocol();
                    C828420Wee c828420Wee = new C828420Wee(C1E6N.SparkSecuritySolutionEndpointNative, C1E6N.SparkSecuritySolutionEndpointWebView, C1E6B.SparkSecuritySolutionChannelJSExecution);
                    Map<String, Object> map = c828420Wee.LJFF;
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    map.put("dataflowId", Integer.valueOf(iIntValue));
                    c828420Wee.LJFF.put("URL", url);
                    c828420Wee.LJFF.put("inject_script", str);
                    c828420Wee.LJFF.put("engine_view", webKitView);
                    C821850WLv c821850WLvHandleWillEvaluateJSWithEvent = sparkSecurityJSInjectionService.handleWillEvaluateJSWithEvent(c828420Wee);
                    if (c821850WLvHandleWillEvaluateJSWithEvent != null && c821850WLvHandleWillEvaluateJSWithEvent.LIZ) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("reject by spark security solution. URL: ");
                        sbLIZ.append(url);
                        C1544840qIs.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("inject by native API evaluateJavaScript. URL: ");
                    sbLIZ2.append(url);
                    C1544840qIs.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                    super.LJIIL(str, valueCallback);
                    return;
                }
            }
            super.LJIIL(str, valueCallback);
        }

        @Override // X.C1ET3
        public final void LJJIII(String str, Map<String, String> map) {
            this.LL.LLIZ.LJ(getExtendable(), str);
            super.LJJIII(str, map);
            this.LL.LLIZ.LJFF(getExtendable());
        }
    };

    @Override // X.AbstractC1541650qDj
    public final void LIZJ() {
        C1541640qDi.LIZ(((C1BVV) LIZ()).getExtendableWebViewClient(), new C1544590qIT(this.LLIZ));
        LJ("loadUrl", this.LLIZLLLIL, LivePreCreateNextRoomPlayer.ENABLE);
        LJ("evaluateJavascript", this.LLIZLLLIL, LivePreCreateNextRoomPlayer.ENABLE);
        LJ("addJavascriptInterface", this.LLIZLLLIL, LivePreCreateNextRoomPlayer.ENABLE);
        LJ("destroy", this.LLIZLLLIL, LivePreCreateNextRoomPlayer.ENABLE);
        this.LLIZ.LIZJ((WebView) LIZ());
    }
}
