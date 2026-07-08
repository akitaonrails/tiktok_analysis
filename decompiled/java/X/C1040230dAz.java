package X;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.shopify.checkout.models.Authentication;
import com.shopify.checkout.models.AuthenticationVersion;
import com.ss.android.ugc.aweme.web.webcallback.AdWebViewClient;
import defpackage.b9;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dAz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1040230dAz extends C09AY implements Function1<b9, Unit> {
    public final /* synthetic */ WebView LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ WebResourceRequest LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ AdWebViewClient LLILZIL;
    public final /* synthetic */ C1035880d3y LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1040230dAz(WebView webView, boolean z, WebResourceRequest webResourceRequest, String str, AdWebViewClient adWebViewClient, C1035880d3y c1035880d3y) {
        super(1);
        this.LL = webView;
        this.LLILLJJLI = z;
        this.LLILLL = webResourceRequest;
        this.LLILZ = str;
        this.LLILZIL = adWebViewClient;
        this.LLILZLL = c1035880d3y;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(b9 b9Var) {
        Map map;
        String lowerCase;
        Map<String, String> requestHeaders;
        b9 b9Var2 = b9Var;
        String str = "";
        if (b9Var2.LIZ != null) {
            C1041360dCo c1041360dCo = C1041360dCo.LIZ;
            Context context = this.LL.getContext();
            String str2 = b9Var2.LIZ;
            if (str2 != null) {
                str = str2;
            }
            boolean z = this.LLILLJJLI;
            WebResourceRequest webResourceRequest = this.LLILLL;
            c1041360dCo.getClass();
            if (webResourceRequest != null && (requestHeaders = webResourceRequest.getRequestHeaders()) != null) {
                map = new LinkedHashMap(requestHeaders);
            } else {
                map = new HashMap();
            }
            Authentication authentication = new Authentication(AuthenticationVersion.V2, str);
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(authentication);
            if (strLJI != null) {
                map.put("Shopify-Checkout-Sheet-Protocol-Consumer", strLJI);
            }
            if (z) {
                if (C960203pA.LIZIZ(context)) {
                    lowerCase = "DARK".toLowerCase(Locale.ROOT);
                } else {
                    lowerCase = "LIGHT".toLowerCase(Locale.ROOT);
                }
                map.put("Sec-CH-Prefers-Color-Scheme", lowerCase);
            }
            C786410Ut5.ve(this.LL, this.LLILZ, map);
        } else {
            C1041370dCp c1041370dCp = new C1041370dCp(Integer.valueOf(EnumC1054350dXl.CUSTOM_ERROR.getType()), Integer.valueOf(EnumC310820CGi.TOKEN_REQUEST_FAILED.getCode()), "");
            C1041360dCo c1041360dCo2 = C1041360dCo.LIZ;
            WebView webView = this.LL;
            C1039580d9w c1039580d9wLJJIIZ = this.LLILZIL.adWebViewExtension.LJJIIZ();
            C1035880d3y c1035880d3y = this.LLILZLL;
            C1040740dBo c1040740dBo = this.LLILZIL.adWebViewExtension.LIZLLL;
            c1041360dCo2.getClass();
            C1041360dCo.LIZJ(webView, c1039580d9wLJJIIZ, c1035880d3y, c1040740dBo, c1041370dCp);
        }
        return Unit.LIZ;
    }
}
