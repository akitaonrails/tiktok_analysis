package X;

import Y.ARunnableS32S1100000_28;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.thirdparty.provider.viewmodel.PoiThirdPartyViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zMm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893220zMm extends AbstractC1539010q9T {
    public PoiThirdPartyViewModel LLILLJJLI;
    public C1893180zMi LLILLL;

    @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
    public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
        if (C1523860pl2.LIZ[interfaceC1531560pxS.getType().ordinal()] != 1 || !(interfaceC1531560pxS instanceof C1541480qDS)) {
            return;
        }
        C1541480qDS c1541480qDS = (C1541480qDS) interfaceC1531560pxS;
        c1541480qDS.LIZJ = new C844210X9v() { // from class: X.0zMr
            @Override // X.AbstractC2205961BVi
            public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                C0CAU.LIZIZ(new ARunnableS32S1100000_28(this.LL, str, 2));
                return super.shouldInterceptRequest(webView, str);
            }

            @Override // X.AbstractC2205961BVi
            public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }

            @Override // X.AbstractC2205961BVi
            public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                String url;
                String str;
                String host;
                Integer numValueOf;
                CharSequence description;
                String str2;
                Uri uri;
                String string;
                CharSequence description2;
                Integer numValueOf2;
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                String string2 = null;
                if (webView != null) {
                    url = webView.getUrl();
                } else {
                    url = null;
                }
                PoiThirdPartyViewModel poiThirdPartyViewModel = this.LL.LLILLJJLI;
                if (poiThirdPartyViewModel != null) {
                    str = poiThirdPartyViewModel.LLIZLLLIL;
                } else {
                    str = null;
                }
                boolean zLJFF = Intrinsics.LJFF(url, str);
                if (Build.VERSION.SDK_INT > 23) {
                    PoiThirdPartyViewModel poiThirdPartyViewModel2 = this.LL.LLILLJJLI;
                    if (poiThirdPartyViewModel2 != null) {
                        if (webResourceError != null) {
                            numValueOf2 = Integer.valueOf(webResourceError.getErrorCode());
                        } else {
                            numValueOf2 = null;
                        }
                        poiThirdPartyViewModel2.LLILZ = numValueOf2;
                    }
                    PoiThirdPartyViewModel poiThirdPartyViewModel3 = this.LL.LLILLJJLI;
                    if (poiThirdPartyViewModel3 != null) {
                        if (webResourceError != null && (description2 = webResourceError.getDescription()) != null) {
                            string = description2.toString();
                        } else {
                            string = null;
                        }
                        poiThirdPartyViewModel3.LLILZIL = string;
                    }
                    try {
                        PoiThirdPartyViewModel poiThirdPartyViewModel4 = this.LL.LLILLJJLI;
                        if (poiThirdPartyViewModel4 != null && (str2 = poiThirdPartyViewModel4.LLIZLLLIL) != null && (uri = UriProtector.parse(str2)) != null) {
                            host = uri.getHost();
                        } else {
                            host = null;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        host = "";
                    }
                    C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C1189060h32.LJJ("is_first_url", String.valueOf(zLJFF), linkedHashMap);
                    if (webResourceError != null) {
                        numValueOf = Integer.valueOf(webResourceError.getErrorCode());
                    } else {
                        numValueOf = null;
                    }
                    C1189060h32.LJJ("error_code", String.valueOf(numValueOf), linkedHashMap);
                    if (webResourceError != null && (description = webResourceError.getDescription()) != null) {
                        string2 = description.toString();
                    }
                    C1189060h32.LJJ("error_reason", string2, linkedHashMap);
                    C1189060h32.LJJ("host", host, linkedHashMap);
                    c1185040gwY.getClass();
                    C1185040gwY.LIZIZ("poi_third_party_page_load_error", linkedHashMap, null);
                }
            }

            @Override // X.AbstractC2205961BVi
            public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                String url;
                String str;
                String host;
                String str2;
                Uri uri;
                Integer numValueOf;
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                Integer numValueOf2 = null;
                if (webView != null) {
                    url = webView.getUrl();
                } else {
                    url = null;
                }
                PoiThirdPartyViewModel poiThirdPartyViewModel = this.LL.LLILLJJLI;
                if (poiThirdPartyViewModel != null) {
                    str = poiThirdPartyViewModel.LLIZLLLIL;
                } else {
                    str = null;
                }
                boolean zLJFF = Intrinsics.LJFF(url, str);
                PoiThirdPartyViewModel poiThirdPartyViewModel2 = this.LL.LLILLJJLI;
                if (poiThirdPartyViewModel2 != null) {
                    if (webResourceResponse != null) {
                        numValueOf = Integer.valueOf(webResourceResponse.getStatusCode());
                    } else {
                        numValueOf = null;
                    }
                    poiThirdPartyViewModel2.LLILZ = numValueOf;
                }
                try {
                    PoiThirdPartyViewModel poiThirdPartyViewModel3 = this.LL.LLILLJJLI;
                    if (poiThirdPartyViewModel3 != null && (str2 = poiThirdPartyViewModel3.LLIZLLLIL) != null && (uri = UriProtector.parse(str2)) != null) {
                        host = uri.getHost();
                    } else {
                        host = null;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    host = "";
                }
                C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C1189060h32.LJJ("is_first_url", String.valueOf(zLJFF), linkedHashMap);
                if (webResourceResponse != null) {
                    numValueOf2 = Integer.valueOf(webResourceResponse.getStatusCode());
                }
                C1189060h32.LJJ("error_code", String.valueOf(numValueOf2), linkedHashMap);
                C1189060h32.LJJ("host", host, linkedHashMap);
                c1185040gwY.getClass();
                C1185040gwY.LIZIZ("poi_third_party_page_load_error", linkedHashMap, null);
            }

            @Override // X.AbstractC2205961BVi
            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                String url;
                String str3;
                Uri uri;
                super.onReceivedError(webView, i, str, str2);
                String host = null;
                if (webView != null) {
                    url = webView.getUrl();
                } else {
                    url = null;
                }
                PoiThirdPartyViewModel poiThirdPartyViewModel = this.LL.LLILLJJLI;
                if (poiThirdPartyViewModel != null) {
                    str3 = poiThirdPartyViewModel.LLIZLLLIL;
                } else {
                    str3 = null;
                }
                boolean zLJFF = Intrinsics.LJFF(url, str3);
                PoiThirdPartyViewModel poiThirdPartyViewModel2 = this.LL.LLILLJJLI;
                if (poiThirdPartyViewModel2 != null) {
                    poiThirdPartyViewModel2.LLILZ = Integer.valueOf(i);
                }
                PoiThirdPartyViewModel poiThirdPartyViewModel3 = this.LL.LLILLJJLI;
                if (poiThirdPartyViewModel3 != null) {
                    poiThirdPartyViewModel3.LLILZIL = str;
                    try {
                        String str4 = poiThirdPartyViewModel3.LLIZLLLIL;
                        if (str4 != null && (uri = UriProtector.parse(str4)) != null) {
                            host = uri.getHost();
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        host = "";
                    }
                }
                C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C1189060h32.LJJ("is_first_url", String.valueOf(zLJFF), linkedHashMap);
                C1189060h32.LJJ("error_code", String.valueOf(i), linkedHashMap);
                C1189060h32.LJJ("error_reason", str, linkedHashMap);
                C1189060h32.LJJ("host", host, linkedHashMap);
                c1185040gwY.getClass();
                C1185040gwY.LIZIZ("poi_third_party_page_load_error", linkedHashMap, null);
            }
        };
        c1541480qDS.LJII(C1523990plF.class, new AwS607S0100000_28(this, 18));
    }
}
