package X;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.log.AdWebEventLogger;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.web.webcallback.AdWebViewClient;
import kotlin.Unit;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS43S0301000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0dA6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039680dA6 extends C09AY implements InterfaceC1631620sYq<Boolean, String, Boolean, Unit> {
    public final /* synthetic */ C1035880d3y LL;
    public final /* synthetic */ WebView LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C013C LLILZ;
    public final /* synthetic */ AdWebViewClient LLILZIL;
    public final /* synthetic */ WebResourceRequest LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1039680dA6(C1035880d3y c1035880d3y, WebView webView, String str, C013C c013c, AdWebViewClient adWebViewClient, WebResourceRequest webResourceRequest) {
        super(3);
        this.LL = c1035880d3y;
        this.LLILLJJLI = webView;
        this.LLILLL = str;
        this.LLILZ = c013c;
        this.LLILZIL = adWebViewClient;
        this.LLILZLL = webResourceRequest;
    }

    @Override // X.InterfaceC1631620sYq
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, String str, Boolean bool2) {
        String str2;
        int webPageClickCount;
        boolean zBooleanValue = bool.booleanValue();
        String str3 = str;
        String str4 = "";
        if (this.LL != null) {
            InterfaceC1040510dBR interfaceC1040510dBR = (InterfaceC1040510dBR) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1040510dBR.class);
            if (interfaceC1040510dBR != null) {
                String url = this.LL.getUrl();
                if (url == null) {
                    url = "";
                }
                String url2 = this.LLILLJJLI.getUrl();
                if (url2 == null) {
                    url2 = "";
                }
                WebView webView = this.LLILLJJLI;
                String str5 = this.LLILLL;
                C1035880d3y c1035880d3y = this.LL;
                interfaceC1040510dBR.H80(url, url2, webView, str5, c1035880d3y, c1035880d3y.getContainerId(), this.LLILZ.element);
            }
            this.LL.getWebLoadStatusModel().setStopLoading(false);
        }
        C1040740dBo c1040740dBo = this.LLILZIL.adWebViewExtension.LIZLLL;
        if (c1040740dBo != null) {
            if (str3 == null) {
                str2 = "";
            } else {
                str2 = str3;
            }
            boolean z = this.LLILZ.element;
            C1035880d3y c1035880d3y2 = this.LL;
            if (c1035880d3y2 != null) {
                webPageClickCount = c1035880d3y2.getWebPageClickCount();
            } else {
                webPageClickCount = 0;
            }
            AwS417S0200000_16 awS417S0200000_16 = new AwS417S0200000_16(this.LLILZIL, this.LLILLJJLI, 33);
            WebView webView2 = this.LLILLJJLI;
            if (str2.length() != 0) {
                C1039560d9u.LIZ(str2, c1040740dBo);
                if (u.LJJIIJZLJL(str2, "https://accounts.google.com/gsi/select", false)) {
                    if (a0.LJJIIZI(str2, "ux_mode=redirect", false)) {
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str2), "login_uri");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                        }
                        C1039560d9u.LIZ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                        c1040740dBo.LJJLIIIJJI("redirect", "login", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, str2);
                    }
                    if (a0.LJJIIZI(str2, "ux_mode=popup", false)) {
                        c1040740dBo.LJJLIIIJJI("popup", "login", null, str2);
                    }
                }
                if (u.LJJIIJZLJL(str2, "https://accounts.google.com/o/oauth2", false)) {
                    if (a0.LJJIIZI(str2, "redirect_uri=https", false)) {
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str2), "redirect_uri");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                            str4 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                        }
                        C1039560d9u.LIZ = str4;
                        c1040740dBo.LJJLIIIJJI("redirect", "authorization", str4, str2);
                    }
                    if (a0.LJJIIZI(str2, "redirect_uri=storagerelay", false)) {
                        c1040740dBo.LJJLIIIJJI("popup", "authorization", null, str2);
                    }
                }
            }
            if (!z) {
                if (!Intrinsics.LJFF(c1040740dBo.LLJI, str2) && !c1040740dBo.LLJJ) {
                    c1040740dBo.LJJLIIIJJIZ(webView2, 0);
                    awS417S0200000_16.invoke();
                }
                c1040740dBo.LLJILJIL = System.currentTimeMillis();
                C1035880d3y c1035880d3y3 = c1040740dBo.LL;
                if (C1040740dBo.LJJLIIIIJ(c1035880d3y3)) {
                    new AdWebEventLogger(c1035880d3y3).logAd(C2273141DyC.LIZ, c1035880d3y3.getRealCreativeIdStr(), c1035880d3y3.getRealLogExtra(), null, new AwS43S0301000_16(c1040740dBo, webView2, webPageClickCount, c1035880d3y3, 3));
                }
                if (C1040740dBo.LJJLIIIJILLIZJL(c1040740dBo.LL)) {
                    C1040580dBY c1040580dBY = new C1040580dBY(c1035880d3y3);
                    C1040750dBp.LIZ.getClass();
                    c1040580dBY.log(C1040750dBp.LJIIIZ, new AwS43S0301000_16(c1040740dBo, webView2, webPageClickCount, c1035880d3y3, 0));
                }
                c1040740dBo.LL.setWebPageClickCount(0);
                c1040740dBo.LL.setWebPageScrollOffset(0.0f);
                c1040740dBo.LL.setWebPageScrollCount(0);
                c1040740dBo.LJJZ(str2);
            }
        }
        if (Intrinsics.LJFF(bool2, Boolean.TRUE) && C123100dR.LIZ(str3)) {
            if (this.LLILZIL.adWebViewExtension.LJJIIJZLJL(str3)) {
                this.LLILZIL.handleShopifyCheckoutUrlLoad(this.LLILLJJLI, str3, this.LLILZLL);
            } else {
                C786410Ut5.ue(this.LLILLJJLI, str3);
            }
            C1035880d3y c1035880d3y4 = this.LL;
            if (c1035880d3y4 != null) {
                c1035880d3y4.setRedirectType(1);
            }
        } else if (zBooleanValue && C123100dR.LIZ(str3)) {
            C786410Ut5.ue(this.LLILLJJLI, str3);
            C1035880d3y c1035880d3y5 = this.LL;
            if (c1035880d3y5 != null) {
                c1035880d3y5.setRedirectType(2);
            }
        }
        return Unit.LIZ;
    }
}
