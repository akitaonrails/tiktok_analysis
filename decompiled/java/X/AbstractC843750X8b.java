package X;

import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import java.util.Collections;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0X8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC843750X8b extends AbstractC1544900qIy {
    @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
    public final String LJ() {
        return "var floatingRec = function() {\n  var settings = getClientContext();\n  var enable = settings.enable;\n  var bannerList = settings.banner_list;\n  var logParams = settings.log_params;\n  var needLog = false;\n  bannerList.forEach(function(cls) {\n    var className = '.' + cls;\n    var elements = document.querySelectorAll(className);\n    elements.forEach(function(element) {\n      if (element instanceof HTMLElement) {\n        if (enable) {\n          element.style.display = 'none';\n        }\n        needLog = true;\n      }\n    });\n  });\n  if (needLog) {\n    var extJson = logParams;\n    extJson.error_code = 1;\n    window.JSBridge.call('sendLog', {\n      eventName: 'ttls_rd_params_identify_iab_error',\n      labelName: 'local_service',\n      extValue: '0',\n      extJson: extJson,\n    });\n  }\n};\nfloatingRec();";
    }

    @Override // X.AbstractC1544900qIy
    public final String LJI() {
        return "_jsmanage_ttls_thirdparty_layerrec";
    }

    @Override // X.InterfaceC1544830qIr
    public final JSInjectConfig LIZ() {
        return new JSInjectConfig("_jsmanage_ttls_thirdparty_layerrec", "custom_manual", 4, Collections.singletonList(e3.d), C13BV.INSTANCE, "https://lf16-gecko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/tt/webview/js_manage/tiktok_webview_js_inject_manage/assets/js/ttls_thirdparty_layerrec.js", null, null, null, false, 448, null);
    }
}
