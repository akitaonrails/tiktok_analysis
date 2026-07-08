package X;

import Y.ACallableS412S0100000_4;
import Y.ARunnableS82S0200000_13;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.ss.android.ugc.aweme.web.business.special.PassBackApi;
import com.ss.android.ugc.aweme.web.settings.WebInfoReportConfigSettings;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X8K, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X8K {
    public AdLandingPageConfig LIZLLL;
    public WebInfoReportConfigSettings.WebInfoReportConfig LJ;
    public int LJI;
    public int LJII;
    public String LJIIJ;
    public String LJIIJJI;
    public C1035880d3y LJIILIIL;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(179));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(178));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(180));
    public boolean LJFF = true;
    public int LJIIIIZZ = 2000;
    public String LJIIIZ = "https://ads.tiktok.com/inspect/aegis/client/page/";
    public final C01GW LJIIL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(181));

    public final boolean LIZ() {
        if (this.LIZLLL == null || this.LJIILIIL == null) {
            return false;
        }
        return LIZLLL();
    }

    public final Map<String, String> LIZJ() {
        return (Map) this.LIZIZ.getValue();
    }

    public final boolean LIZLLL() {
        String str;
        AwemeRawAd awemeRawAd;
        C1035880d3y c1035880d3y = this.LJIILIIL;
        if (c1035880d3y != null && ((awemeRawAd = c1035880d3y.getAwemeRawAd()) == null || !awemeRawAd.isEnableWebReport())) {
            return false;
        }
        if (this.LJFF) {
            C844470XAv.LIZ.getClass();
            if (NetworkUtils.getNetworkType(C844470XAv.LIZ()) != EnumC846100XHc.WIFI) {
                return false;
            }
        }
        return ((this.LJII > 0 && C809920Vpu.LIZ.get() >= this.LJII) || (str = this.LJIIJ) == null || str.length() == 0) ? false : true;
    }

    public final void LJIIIIZZ() throws Throwable {
        AwemeRawAd awemeRawAd;
        Long creativeId;
        C1035880d3y c1035880d3y = this.LJIILIIL;
        String strEncodeToString = null;
        if (c1035880d3y == null || (awemeRawAd = c1035880d3y.getAwemeRawAd()) == null || !LIZLLL() || LIZJ().isEmpty()) {
            return;
        }
        n nVar = new n();
        h hVar = new h();
        for (Map.Entry<String, String> entry : LIZJ().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            n nVar2 = new n();
            String strDecode = URLDecoder.decode(key, "UTF-8");
            nVar2.LJJIIJ("url", strDecode);
            nVar2.LJJIIJ("html", URLDecoder.decode(value, "UTF-8"));
            Map map = (Map) ((Map) this.LIZJ.getValue()).get(C2084808Es.LIZ(strDecode));
            if (map != null && !map.isEmpty()) {
                n nVar3 = new n();
                for (Map.Entry entry2 : map.entrySet()) {
                    String str = (String) entry2.getKey();
                    String str2 = (String) entry2.getValue();
                    if (!Intrinsics.LJFF(str, "x-Tt-Token") && !Intrinsics.LJFF(str, "Cookie") && !Intrinsics.LJFF(str, "x-common-params-v2")) {
                        nVar3.LJJIIJ(str, str2);
                    }
                }
                nVar2.LJJIFFI("headers", nVar3);
            }
            hVar.LJJIFFI(nVar2);
        }
        nVar.LJJIFFI("pages", hVar);
        nVar.LJJIII(awemeRawAd.getAdId(), "ad_id");
        try {
            creativeId = awemeRawAd.getCreativeId();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        long jLongValue = creativeId != null ? creativeId.longValue() : 0L;
        nVar.LJJIII(Long.valueOf(jLongValue), "cid");
        nVar.LJJIIJ("log_extra", awemeRawAd.getLogExtra());
        nVar.LJJIII(Long.valueOf(new Date().getTime()), "timestamp");
        C844470XAv.LIZ.getClass();
        nVar.LJJIII(Integer.valueOf(NetworkUtils.getNetworkType(C844470XAv.LIZ()).getValue()), "network_type");
        String str3 = this.LJIIJ;
        if (str3 != null && str3.length() != 0) {
            try {
                byte[] bArrLIZ = C809920Vpu.LIZ(nVar.toString());
                if (bArrLIZ != null) {
                    strEncodeToString = Base64.encodeToString(C809920Vpu.LIZIZ(str3.getBytes(Charsets.UTF_8), bArrLIZ), 0);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1AF0.LJ(e2);
            }
        }
        if (TextUtils.isEmpty(strEncodeToString)) {
            return;
        }
        n nVar4 = new n();
        nVar4.LJJIIJ("content", strEncodeToString);
        nVar4.LJJIII(1, "version");
        ((PassBackApi) this.LJIIL.getValue()).executePost(this.LJIIIZ, nVar4).enqueue(new InterfaceC594300NSq<String>() { // from class: X.0X8J
            @Override // X.InterfaceC594300NSq
            public final void onFailure(C0X9S<String> c0x9s, Throwable th) {
            }

            @Override // X.InterfaceC594300NSq
            public final void onResponse(C0X9S<String> c0x9s, C0X52<String> c0x52) {
            }
        });
        LIZJ().clear();
        ((Map) this.LIZJ.getValue()).clear();
        C809920Vpu.LIZ.addAndGet(1);
    }

    public final void LIZIZ() {
        boolean zLJI = MethodIDManager.LJI(137854);
        if (LIZ()) {
            this.LJIIJJI = null;
            C15O7.LIZJ(new ACallableS412S0100000_4(this, 8));
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else if (zLJI) {
            MethodIDManager.LJ();
        }
        ((Handler) this.LIZ.getValue()).removeCallbacksAndMessages(null);
    }

    public final void LJ(C1035880d3y c1035880d3y) {
        WebInfoReportConfigSettings.WebInfoReportConfig webInfoReportConfig;
        this.LJIILIIL = c1035880d3y;
        try {
            this.LIZLLL = C0CLW.LIZIZ.LIZ.getAdLandingPageConfig();
            try {
                webInfoReportConfig = (WebInfoReportConfigSettings.WebInfoReportConfig) SettingsManager.LIZLLL().LJIIIIZZ("web_info_report_config", WebInfoReportConfigSettings.WebInfoReportConfig.class, WebInfoReportConfigSettings.LIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                webInfoReportConfig = WebInfoReportConfigSettings.LIZ;
            }
            this.LJ = webInfoReportConfig;
            AdLandingPageConfig adLandingPageConfig = this.LIZLLL;
            if (adLandingPageConfig != null) {
                this.LJIIIIZZ = adLandingPageConfig.getAdLandingPageReportDelay();
                String adLandingPageReportUrl = adLandingPageConfig.getAdLandingPageReportUrl();
                if (adLandingPageReportUrl != null) {
                    this.LJIIIZ = adLandingPageReportUrl;
                }
                this.LJIIJ = adLandingPageConfig.getAdLandingPageReportPacketKey();
            }
            WebInfoReportConfigSettings.WebInfoReportConfig webInfoReportConfig2 = this.LJ;
            if (webInfoReportConfig2 != null) {
                this.LJFF = webInfoReportConfig2.wifiOnlyEnable;
                this.LJI = webInfoReportConfig2.pageCount;
                this.LJII = webInfoReportConfig2.limitTimes;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public final void LJI(WeakReference<WebView> weakReference) {
        WebView webView = weakReference.get();
        if (webView == null) {
            return;
        }
        final String url = webView.getUrl();
        if (TextUtils.isEmpty(url)) {
            C15O7.LIZIZ(new ACallableS412S0100000_4(this, 9), C20684815ws.LJFF(), null);
            return;
        }
        if (url == null) {
            return;
        }
        try {
            if (C1111304Wh.LIZ()) {
                C1544770qIl.LIZ(webView, new AbstractC843510X7d() { // from class: X.0X7g
                    @Override // X.AbstractC1544900qIy
                    public final void LJIIJJI(Object obj) throws UnsupportedEncodingException {
                        String str;
                        C0X8K c0x8k = this.LIZ;
                        String str2 = url;
                        c0x8k.getClass();
                        String strEncode = URLEncoder.encode(str2, "UTF-8");
                        if (obj instanceof String) {
                            str = (String) obj;
                        } else {
                            str = null;
                        }
                        c0x8k.LJII(strEncode, str);
                    }

                    @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
                    public final String LJFF(Uri uri, WebView webView2) throws JSONException {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("reactId", "ad_web");
                        return C786410Ut5.J3(jSONObject);
                    }
                });
            } else {
                webView.evaluateJavascript("encodeURIComponent(document.documentElement.outerHTML)", new ValueCallback() { // from class: X.0X7h
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) throws UnsupportedEncodingException {
                        C0X8K c0x8k = this.LIZ;
                        String str = url;
                        c0x8k.getClass();
                        c0x8k.LJII(URLEncoder.encode(str, "UTF-8"), (String) obj);
                    }
                });
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LIZJ("spark PassBackWebInfoBusiness savePageInfo");
        }
    }

    public final void LJFF(WebView webView, boolean z) {
        int i;
        String url;
        if (!LIZ()) {
            return;
        }
        if (LIZLLL()) {
            i = this.LJI;
        } else {
            i = 1;
        }
        if (LIZJ().size() < i && webView != null && (url = webView.getUrl()) != null && !a0.LJJJIL(url) && !Intrinsics.LJFF("about:blank", webView.getUrl())) {
            WeakReference<WebView> weakReference = new WeakReference<>(webView);
            if (z) {
                C786410Ut5.LJLIIL(this.LJIIIIZZ, (Handler) this.LIZ.getValue(), new ARunnableS82S0200000_13(weakReference, this, 35));
                C786410Ut5.LJLIIL(200L, (Handler) this.LIZ.getValue(), new ARunnableS82S0200000_13(weakReference, this, 36));
            } else {
                LJI(weakReference);
            }
        }
    }

    public final void LJII(String str, String str2) {
        if (str2 == null || TextUtils.equals("about:blank", str)) {
            return;
        }
        try {
            LIZJ().put(str, a0.LJJJLZIJ("\"", "\"", str2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LIZJ("spark PassBackWebInfoBusiness savePageInfo");
        }
    }
}
