package X;

import android.content.Context;
import android.webkit.WebResourceRequest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.hybrid.spark.security.web_js.setting.InlineInjectOptSettings;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0q0n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533630q0n implements InterfaceC1534950q2v, InterfaceC1532560pz4 {
    public final /* synthetic */ Context LIZIZ;

    @Override // X.InterfaceC1532560pz4
    public final void LIZIZ(C1532310pyf c1532310pyf) {
    }

    @Override // X.InterfaceC1534950q2v
    public final void LJFF(C1533790q13 c1533790q13) {
    }

    public C1533630q0n(Context context) {
        this.LIZIZ = context;
    }

    @Override // X.InterfaceC1532560pz4
    public final void LIZLLL(C1532710pzJ c1532710pzJ) {
        String lowerCase;
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        String strLJIILJJIL;
        if (c1532710pzJ.LJIJ == EnumC1533980q1M.LYNX_I18N) {
            boolean z = C1536390q5F.LIZ;
            I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
            if (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null || (strLJIILJJIL = i18nManagerServiceApiLIZ.LJIILJJIL(this.LIZIZ)) == null || (lowerCase = strLJIILJJIL.toLowerCase(Locale.ENGLISH)) == null) {
                lowerCase = "";
            }
            C1536390q5F.LIZJ = lowerCase;
        }
        if (c1532710pzJ.LJJI) {
            JSInjectConfig jSInjectConfig = C1544810qIp.LIZ;
            InlineInjectOptSettings inlineInjectOptSettings = C1544810qIp.LIZJ;
            if (inlineInjectOptSettings.enableIframe || inlineInjectOptSettings.enableMainFrame) {
                Map<String, String> map = c1532710pzJ.LJIILIIL;
                if (map == null || map.put("x-tt-hash", "1") == null) {
                    c1532710pzJ.LJIILIIL = C2097608Jq.LJIIJ(new Pair("x-tt-hash", "1"));
                }
            }
        }
    }

    @Override // X.InterfaceC1534950q2v
    public final void LJ(RequestParams requestParams) {
        WebResourceRequest webResourceRequest;
        Map<String, String> requestHeaders;
        String lowerCase;
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        String strLJIILJJIL;
        if (requestParams.resourceScene == EnumC1533980q1M.LYNX_I18N) {
            boolean z = C1536390q5F.LIZ;
            I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
            if (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null || (strLJIILJJIL = i18nManagerServiceApiLIZ.LJIILJJIL(this.LIZIZ)) == null || (lowerCase = strLJIILJJIL.toLowerCase(Locale.ENGLISH)) == null) {
                lowerCase = "";
            }
            C1536390q5F.LIZJ = lowerCase;
        }
        if (requestParams.isPreloadRequest()) {
            InlineInjectOptSettings inlineInjectOptSettings = C1544810qIp.LIZJ;
            if (inlineInjectOptSettings.enableIframe || inlineInjectOptSettings.enableMainFrame) {
                Object obj = requestParams.webResourceRequest;
                if (obj instanceof WebResourceRequest) {
                    webResourceRequest = (WebResourceRequest) obj;
                } else {
                    webResourceRequest = null;
                }
                if (webResourceRequest == null || (requestHeaders = webResourceRequest.getRequestHeaders()) == null || requestHeaders.put("x-tt-hash", "1") == null) {
                    Map<String, String> map = requestParams.httpRequestHeaders;
                    if (map == null || map.put("x-tt-hash", "1") == null) {
                        requestParams.httpRequestHeaders = C2097608Jq.LJIIJ(new Pair("x-tt-hash", "1"));
                    }
                }
            }
        }
    }
}
