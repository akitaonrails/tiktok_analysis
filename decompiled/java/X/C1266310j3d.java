package X;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.ss.android.ugc.profile.business.profile.BioProfileLinkComponent;
import com.ss.android.ugc.profile.business.profile.biolink.BioStructuralLinkProtocol;
import com.ss.android.ugc.profile.business.ur.platform.business.BioUserWebSiteComponent;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0j3d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266310j3d extends AbstractC1539010q9T {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
    public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
        switch (this.$t) {
            case 0:
                LJJJLL$0(this, interfaceC1531560pxS);
                break;
            case 1:
                LJJJLL$1(this, interfaceC1531560pxS);
                break;
            case 2:
                LJJJLL$2(this, interfaceC1531560pxS);
                break;
            case 3:
                LJJJLL$3(this, interfaceC1531560pxS);
                break;
            default:
                super.LJJJLL(interfaceC1531560pxS);
                break;
        }
    }

    public C1266310j3d(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJJLL$0(C1266310j3d c1266310j3d, InterfaceC1531560pxS interfaceC1531560pxS) {
        if (interfaceC1531560pxS instanceof C1541480qDS) {
            final BioProfileLinkComponent bioProfileLinkComponent = (BioProfileLinkComponent) c1266310j3d.l0;
            ((C1541480qDS) interfaceC1531560pxS).LIZJ = new C844210X9v() { // from class: X.0ikX
                @Override // X.AbstractC2205961BVi
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    String uid;
                    UserProfileInfo userProfileInfo;
                    ProfileCommonInfo profileCommonInfoVo = bioProfileLinkComponent.Vo();
                    Context context = null;
                    if (profileCommonInfoVo != null && (userProfileInfo = profileCommonInfoVo.getUserProfileInfo()) != null) {
                        uid = userProfileInfo.getUid();
                    } else {
                        uid = null;
                    }
                    BioProfileLinkComponent bioProfileLinkComponent2 = bioProfileLinkComponent;
                    if (str != null && uid != null) {
                        C1254510ikb.LIZ.getClass();
                        if (C1254510ikb.LIZ(str)) {
                            C1254430ikT c1254430ikT = C1254430ikT.LIZ;
                            String enterFrom = bioProfileLinkComponent2.getEnterFrom();
                            c1254430ikT.getClass();
                            C1254430ikT.LIZJ(enterFrom, false);
                            C1254430ikT.LIZLLL(0, bioProfileLinkComponent2.getEnterFrom(), false);
                        }
                    }
                    if (str != null && (u.LJJIIJZLJL(str, "http", false) || u.LJJIIJZLJL(str, "https", false))) {
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                    BioProfileLinkComponent bioProfileLinkComponent3 = bioProfileLinkComponent;
                    if (webView != null) {
                        context = webView.getContext();
                    }
                    bioProfileLinkComponent3.Qp(context);
                    return true;
                }

                @Override // X.AbstractC2205961BVi
                public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    Uri url;
                    Uri url2;
                    Context context = null;
                    if (webResourceRequest != null) {
                        url = webResourceRequest.getUrl();
                    } else {
                        url = null;
                    }
                    if (!u.LJJIIJZLJL(String.valueOf(url), "http", false)) {
                        if (webResourceRequest != null) {
                            url2 = webResourceRequest.getUrl();
                        } else {
                            url2 = null;
                        }
                        if (!u.LJJIIJZLJL(String.valueOf(url2), "https", false)) {
                            BioProfileLinkComponent bioProfileLinkComponent2 = bioProfileLinkComponent;
                            if (webView != null) {
                                context = webView.getContext();
                            }
                            bioProfileLinkComponent2.Qp(context);
                            return true;
                        }
                    }
                    return super.shouldOverrideUrlLoading(webView, webResourceRequest);
                }
            };
        }
    }

    public static final void LJJJLL$1(C1266310j3d c1266310j3d, InterfaceC1531560pxS interfaceC1531560pxS) {
        if (interfaceC1531560pxS instanceof C1541480qDS) {
            final C1254440ikU c1254440ikU = (C1254440ikU) c1266310j3d.l0;
            ((C1541480qDS) interfaceC1531560pxS).LIZJ = new C844210X9v() { // from class: X.0ika
                @Override // X.AbstractC2205961BVi
                public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    Uri url;
                    if (webResourceRequest != null) {
                        url = webResourceRequest.getUrl();
                    } else {
                        url = null;
                    }
                    String strValueOf = String.valueOf(url);
                    C1254510ikb.LIZ.getClass();
                    if (C1254510ikb.LIZ(strValueOf)) {
                        C1254440ikU c1254440ikU2 = c1254440ikU;
                        if (c1254440ikU2 != null) {
                            C1254430ikT c1254430ikT = C1254430ikT.LIZ;
                            String str = c1254440ikU2.LIZIZ;
                            c1254430ikT.getClass();
                            C1254430ikT.LIZJ(str, true);
                        }
                        C1254510ikb.LIZIZ(strValueOf, c1254440ikU);
                        return true;
                    }
                    return super.shouldOverrideUrlLoading(webView, webResourceRequest);
                }

                @Override // X.AbstractC2205961BVi
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (str != null) {
                        C1254440ikU c1254440ikU2 = c1254440ikU;
                        C1254510ikb.LIZ.getClass();
                        if (C1254510ikb.LIZ(str)) {
                            if (c1254440ikU2 != null) {
                                C1254430ikT c1254430ikT = C1254430ikT.LIZ;
                                String str2 = c1254440ikU2.LIZIZ;
                                c1254430ikT.getClass();
                                C1254430ikT.LIZJ(str2, true);
                            }
                            C1254510ikb.LIZIZ(str, c1254440ikU2);
                            return true;
                        }
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            };
        }
    }

    public static final void LJJJLL$2(C1266310j3d c1266310j3d, InterfaceC1531560pxS interfaceC1531560pxS) {
        if (interfaceC1531560pxS instanceof C1541480qDS) {
            final BioStructuralLinkProtocol bioStructuralLinkProtocol = (BioStructuralLinkProtocol) c1266310j3d.l0;
            ((C1541480qDS) interfaceC1531560pxS).LIZJ = new C844210X9v() { // from class: X.0ikZ
                @Override // X.AbstractC2205961BVi
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    String uid;
                    UserProfileInfo userProfileInfo;
                    ProfileCommonInfo profileCommonInfoLJIILIIL = bioStructuralLinkProtocol.LJIILIIL();
                    Context context = null;
                    if (profileCommonInfoLJIILIIL != null && (userProfileInfo = profileCommonInfoLJIILIIL.getUserProfileInfo()) != null) {
                        uid = userProfileInfo.getUid();
                    } else {
                        uid = null;
                    }
                    BioStructuralLinkProtocol bioStructuralLinkProtocol2 = bioStructuralLinkProtocol;
                    if (str != null && uid != null) {
                        C1254510ikb.LIZ.getClass();
                        if (C1254510ikb.LIZ(str)) {
                            C1254430ikT c1254430ikT = C1254430ikT.LIZ;
                            String str2 = bioStructuralLinkProtocol2.LLJJIJIL;
                            c1254430ikT.getClass();
                            C1254430ikT.LIZJ(str2, false);
                            C1254430ikT.LIZLLL(0, bioStructuralLinkProtocol2.LLJJIJIL, false);
                        }
                    }
                    if (str != null && (u.LJJIIJZLJL(str, "http", false) || u.LJJIIJZLJL(str, "https", false))) {
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                    BioStructuralLinkProtocol bioStructuralLinkProtocol3 = bioStructuralLinkProtocol;
                    if (webView != null) {
                        context = webView.getContext();
                    }
                    bioStructuralLinkProtocol3.LJJLL(context);
                    return true;
                }

                @Override // X.AbstractC2205961BVi
                public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    Uri url;
                    Uri url2;
                    Context context = null;
                    if (webResourceRequest != null) {
                        url = webResourceRequest.getUrl();
                    } else {
                        url = null;
                    }
                    if (!u.LJJIIJZLJL(String.valueOf(url), "http", false)) {
                        if (webResourceRequest != null) {
                            url2 = webResourceRequest.getUrl();
                        } else {
                            url2 = null;
                        }
                        if (!u.LJJIIJZLJL(String.valueOf(url2), "https", false)) {
                            BioStructuralLinkProtocol bioStructuralLinkProtocol2 = bioStructuralLinkProtocol;
                            if (webView != null) {
                                context = webView.getContext();
                            }
                            bioStructuralLinkProtocol2.LJJLL(context);
                            return true;
                        }
                    }
                    return super.shouldOverrideUrlLoading(webView, webResourceRequest);
                }
            };
        }
    }

    public static final void LJJJLL$3(C1266310j3d c1266310j3d, InterfaceC1531560pxS interfaceC1531560pxS) {
        if (interfaceC1531560pxS instanceof C1541480qDS) {
            final BioUserWebSiteComponent bioUserWebSiteComponent = (BioUserWebSiteComponent) c1266310j3d.l0;
            ((C1541480qDS) interfaceC1531560pxS).LIZJ = new C844210X9v() { // from class: X.0ikY
                @Override // X.AbstractC2205961BVi
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    String uid;
                    UserProfileInfo userProfileInfo;
                    ProfileCommonInfo profileCommonInfoVo = bioUserWebSiteComponent.Vo();
                    Context context = null;
                    if (profileCommonInfoVo != null && (userProfileInfo = profileCommonInfoVo.getUserProfileInfo()) != null) {
                        uid = userProfileInfo.getUid();
                    } else {
                        uid = null;
                    }
                    BioUserWebSiteComponent bioUserWebSiteComponent2 = bioUserWebSiteComponent;
                    if (str != null && uid != null) {
                        C1254510ikb.LIZ.getClass();
                        if (C1254510ikb.LIZ(str)) {
                            C1254430ikT c1254430ikT = C1254430ikT.LIZ;
                            String enterFrom = bioUserWebSiteComponent2.getEnterFrom();
                            c1254430ikT.getClass();
                            C1254430ikT.LIZJ(enterFrom, false);
                            C1254430ikT.LIZLLL(0, bioUserWebSiteComponent2.getEnterFrom(), false);
                        }
                    }
                    if (str != null && (u.LJJIIJZLJL(str, "http", false) || u.LJJIIJZLJL(str, "https", false))) {
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                    BioUserWebSiteComponent bioUserWebSiteComponent3 = bioUserWebSiteComponent;
                    if (webView != null) {
                        context = webView.getContext();
                    }
                    bioUserWebSiteComponent3.Fp(context);
                    return true;
                }

                @Override // X.AbstractC2205961BVi
                public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    Uri url;
                    Uri url2;
                    Context context = null;
                    if (webResourceRequest != null) {
                        url = webResourceRequest.getUrl();
                    } else {
                        url = null;
                    }
                    if (!u.LJJIIJZLJL(String.valueOf(url), "http", false)) {
                        if (webResourceRequest != null) {
                            url2 = webResourceRequest.getUrl();
                        } else {
                            url2 = null;
                        }
                        if (!u.LJJIIJZLJL(String.valueOf(url2), "https", false)) {
                            BioUserWebSiteComponent bioUserWebSiteComponent2 = bioUserWebSiteComponent;
                            if (webView != null) {
                                context = webView.getContext();
                            }
                            bioUserWebSiteComponent2.Fp(context);
                            return true;
                        }
                    }
                    return super.shouldOverrideUrlLoading(webView, webResourceRequest);
                }
            };
        }
    }
}
