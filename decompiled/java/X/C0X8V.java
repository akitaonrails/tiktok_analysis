package X;

import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import java.util.Collections;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0X8V, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0X8V extends AbstractC1544900qIy {
    @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
    public final String LJ() {
        return "var e,s=getClientContext(),n=window[s.objName]&&window[s.objName][s.objFunc]&&window[s.objName][s.objFunc](s.params);try{var i=s.params&&s.params.__callback_id||-1;i>0&&(e={method:\"timing.setJSBInfos\",params:[{jsbId:i,stage:300}]},window.iesJsBridgeTransferMonitor&&window.iesJsBridgeTransferMonitor.request?iesJsBridgeTransferMonitor.request(JSON.stringify(e)):window.webkit&&window.webkit.messageHandlers&&window.webkit.messageHandlers.bdhmRequest&&window.webkit.messageHandlers.bdhmRequest.postMessage(e))}catch(e){}return n";
    }

    @Override // X.AbstractC1544900qIy
    public final String LJI() {
        return "_jsmanage_xbridge_handlemessage_latest";
    }

    @Override // X.InterfaceC1544830qIr
    public final JSInjectConfig LIZ() {
        return new JSInjectConfig("_jsmanage_xbridge_handlemessage_latest", "custom_manual", 3, Collections.singletonList(e3.d), C13BV.INSTANCE, "https://lf16-gecko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/tt/webview/js_manage/tiktok_webview_js_inject_manage/assets/js/xbridge_handlemessage_latest.js", null, null, null, true, 448, null);
    }
}
