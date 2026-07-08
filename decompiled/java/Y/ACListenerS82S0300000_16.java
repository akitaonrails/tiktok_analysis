package Y;

import X.C0H9G;
import X.C1011140cQ4;
import X.C1011980cRQ;
import X.C1012300cRw;
import X.C1016230cYH;
import X.C1016250cYJ;
import X.C1017520caM;
import X.C1022820ciu;
import X.C1026310coX;
import X.C1027410cqJ;
import X.C1027610cqd;
import X.C1028100crQ;
import X.C1029390ctV;
import X.C1030300cuy;
import X.C1035880d3y;
import X.C1037380d6O;
import X.C1037430d6T;
import X.C1069830dwj;
import X.C1073970e3P;
import X.C1074230e3p;
import X.C19EG;
import X.C2184171Adz;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC1011130cQ3;
import X.EnumC1012120cRe;
import X.EnumC1036160d4Q;
import X.EnumC1070410dxf;
import X.EnumC1074240e3q;
import X.InterfaceC1011400cQU;
import X.InterfaceC1011430cQX;
import X.InterfaceC1031540cwy;
import X.InterfaceC1032120cxu;
import X.InterfaceC1036110d4L;
import X.InterfaceC1037440d6U;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ad.feed.IAdLightWebPageOpen;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdlpExtraModel;
import com.ss.android.ugc.aweme.commercialize.model.DisclaimerText;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.EfficiencyComponents;
import com.ss.android.ugc.aweme.feed.model.EfficiencyJumpData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;
import com.ss.android.ugc.aweme.log.AdLandingPageResizeLogger;
import com.ss.android.ugc.aweme.relation.ffp.ui.NeedAuthFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class ACListenerS82S0300000_16 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onClick$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onClick$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onClick$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onClick$13(this, view);
                break;
            case 14:
                onClick$14(this, view);
                break;
            case 15:
                onClick$15(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS82S0300000_16 aCListenerS82S0300000_16, View view) {
        boolean z;
        Fragment fragmentMv;
        AdlpExtraModel adlpExtraModel = ((C1026310coX) aCListenerS82S0300000_16.l0).getAdlpExtraModel();
        if (adlpExtraModel != null) {
            adlpExtraModel.setRefer("homepage_ad_button");
        }
        String strXu = ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).Xu((C1026310coX) aCListenerS82S0300000_16.l0);
        if (strXu == null) {
            strXu = "";
        }
        IAdLandingPagePopUpService iAdLandingPagePopUpService = (IAdLandingPagePopUpService) ((C1030300cuy) aCListenerS82S0300000_16.l1).LIZ.getValue();
        if (iAdLandingPagePopUpService != null && iAdLandingPagePopUpService.LIZLLL((C1026310coX) aCListenerS82S0300000_16.l0)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            IAdLandingPagePopUpService iAdLandingPagePopUpService2 = (IAdLandingPagePopUpService) ((C1030300cuy) aCListenerS82S0300000_16.l1).LIZ.getValue();
            if (iAdLandingPagePopUpService2 != null && iAdLandingPagePopUpService2.LJIIJJI((C1026310coX) aCListenerS82S0300000_16.l0, Boolean.TRUE)) {
                AdlpExtraModel adlpExtraModel2 = ((C1026310coX) aCListenerS82S0300000_16.l0).getAdlpExtraModel();
                if (adlpExtraModel2 != null) {
                    adlpExtraModel2.setLandingPageStyle(0);
                }
                C1028100crQ popUpCustomConfig = ((C1026310coX) aCListenerS82S0300000_16.l0).getPopUpCustomConfig();
                if (popUpCustomConfig != null) {
                    popUpCustomConfig.setDisableChangeStatusAndNavBar(false);
                }
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("homepage_ad", "click", ((C1026310coX) aCListenerS82S0300000_16.l0).getAwemeRawAd());
                c1022820ciuLIZLLL.LIZJ("all_screen_page", "refer");
                c1022820ciuLIZLLL.LJII();
                if (((IAdLynxLandPageUtils) ServiceManager.get().getService(IAdLynxLandPageUtils.class)).LIZ(strXu)) {
                    fragmentMv = ((IAdLynxLandPageUtils) ServiceManager.get().getService(IAdLynxLandPageUtils.class)).LIZIZ((C19EG) aCListenerS82S0300000_16.l2, ((IAdLynxLandPageUtils) ServiceManager.get().getService(IAdLynxLandPageUtils.class)).LJFF((C1026310coX) aCListenerS82S0300000_16.l0, (C19EG) aCListenerS82S0300000_16.l2, strXu), (C1026310coX) aCListenerS82S0300000_16.l0, true, EnumC1036160d4Q.DEFAULT, 8, null, false, null);
                } else {
                    fragmentMv = ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).mv((C19EG) aCListenerS82S0300000_16.l2, (C1026310coX) aCListenerS82S0300000_16.l0, true, EnumC1036160d4Q.DEFAULT, 8, null, false);
                }
                ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).pv(true, (C19EG) aCListenerS82S0300000_16.l2, fragmentMv, Boolean.TRUE, null, 0, true, true, true, null, AFwS252S0000000_16.get$arr$(149));
                return;
            }
            C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("homepage_ad", "click", ((C1026310coX) aCListenerS82S0300000_16.l0).getAwemeRawAd());
            c1022820ciuLIZLLL2.LIZJ("button", "refer");
            c1022820ciuLIZLLL2.LJII();
            AdlpExtraModel adlpExtraModel3 = ((C1026310coX) aCListenerS82S0300000_16.l0).getAdlpExtraModel();
            if (adlpExtraModel3 != null) {
                adlpExtraModel3.setLandingPageStyle(1);
            }
            ((C1026310coX) aCListenerS82S0300000_16.l0).getTuxSheetConfig().setVariant(1);
            ((C1026310coX) aCListenerS82S0300000_16.l0).getTuxSheetConfig().setDefaultHeightRatio(0.9f);
            IAdLandingPagePopUpService iAdLandingPagePopUpService3 = (IAdLandingPagePopUpService) ((C1030300cuy) aCListenerS82S0300000_16.l1).LIZ.getValue();
            if (iAdLandingPagePopUpService3 == null) {
                return;
            }
            iAdLandingPagePopUpService3.LJIIJ(8, (C19EG) aCListenerS82S0300000_16.l2, null, (C1026310coX) aCListenerS82S0300000_16.l0, null);
            return;
        }
        C1022820ciu c1022820ciuLIZLLL3 = C2184171Adz.LIZLLL("homepage_ad", "click", ((C1026310coX) aCListenerS82S0300000_16.l0).getAwemeRawAd());
        c1022820ciuLIZLLL3.LIZJ("all_screen_page", "refer");
        c1022820ciuLIZLLL3.LJII();
        AdlpExtraModel adlpExtraModel4 = ((C1026310coX) aCListenerS82S0300000_16.l0).getAdlpExtraModel();
        if (adlpExtraModel4 != null) {
            adlpExtraModel4.setLandingPageStyle(0);
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((C19EG) aCListenerS82S0300000_16.l2, "//commercialize/ad_landing_page/fullscreen");
        smartRouteBuildRoute.withParam("keyAdWebModel", (C1026310coX) aCListenerS82S0300000_16.l0);
        smartRouteBuildRoute.withParam("keyFromScene", EnumC1036160d4Q.FROM_CLICK_BOTTOM_BANNER);
        smartRouteBuildRoute.open();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_success", true);
        C786410Ut5.LJJJI("before_size", "0.2", bundle);
        C786410Ut5.LJJJI("action_resize", "0.2clk", bundle);
        C786410Ut5.LJJJI("screen_size", "1", bundle);
        AdLandingPageResizeLogger adLandingPageResizeLogger = new AdLandingPageResizeLogger(new Object[]{bundle});
        C1029390ctV.LIZ.getClass();
        adLandingPageResizeLogger.logAd(C1029390ctV.LIZIZ, new AwS595S0100000_16((C1026310coX) aCListenerS82S0300000_16.l0, 102));
    }

    public static final void onClick$1(ACListenerS82S0300000_16 aCListenerS82S0300000_16, View view) {
        C1074230e3p.LIZIZ(EnumC1074240e3q.FIND_FRIENDS, 0);
        C1069830dwj.LIZ(EnumC1070410dxf.CONTACT, ((LinearLayout) aCListenerS82S0300000_16.l0).getContext(), (C1073970e3P) aCListenerS82S0300000_16.l1, new AwS595S0100000_16((NeedAuthFragment) aCListenerS82S0300000_16.l2, 129));
    }

    public static final void onClick$10(ACListenerS82S0300000_16 aCListenerS82S0300000_16, View view) {
        ((C1016250cYJ) aCListenerS82S0300000_16.l0).LIZIZ((Context) aCListenerS82S0300000_16.l1, "name", (InterfaceC1032120cxu) aCListenerS82S0300000_16.l2);
    }

    public static final void onClick$11(ACListenerS82S0300000_16 aCListenerS82S0300000_16, View view) {
        ((C1016250cYJ) aCListenerS82S0300000_16.l0).LIZIZ((Context) aCListenerS82S0300000_16.l1, "title", (InterfaceC1032120cxu) aCListenerS82S0300000_16.l2);
    }

    public static final void onClick$12(ACListenerS82S0300000_16 aCListenerS82S0300000_16, View view) {
        ((C1016250cYJ) aCListenerS82S0300000_16.l0).LIZIZ((Context) aCListenerS82S0300000_16.l1, "sponsored", (InterfaceC1032120cxu) aCListenerS82S0300000_16.l2);
    }

    public static final void onClick$13(ACListenerS82S0300000_16 aCListenerS82S0300000_16, View view) {
        ((C1016250cYJ) aCListenerS82S0300000_16.l0).LIZIZ(((View) aCListenerS82S0300000_16.l1).getContext(), "fullscreen_click", (InterfaceC1032120cxu) aCListenerS82S0300000_16.l2);
    }

    public static final void onClick$14(ACListenerS82S0300000_16 aCListenerS82S0300000_16, View view) {
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "otherclick", ((Aweme) aCListenerS82S0300000_16.l0).getAwemeRawAd());
        c1022820ciuLIZLLL.LIZJ("disclaimer", "refer");
        c1022820ciuLIZLLL.LIZIZ(((DisclaimerText) aCListenerS82S0300000_16.l1).id, "disclaimer_id");
        c1022820ciuLIZLLL.LJII();
        ((IAdLightWebPageOpen) ServiceManager.get().getService(IAdLightWebPageOpen.class)).LIZ((C19EG) aCListenerS82S0300000_16.l2, (Aweme) aCListenerS82S0300000_16.l0, ((DisclaimerText) aCListenerS82S0300000_16.l1).url, false);
    }

    public static final void onClick$15(ACListenerS82S0300000_16 aCListenerS82S0300000_16, View view) {
        String currentUrl;
        Iterator<InterfaceC1037440d6U> it2 = ((C1037430d6T) aCListenerS82S0300000_16.l0).LLILZLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL(true);
        }
        WebView webView = (WebView) aCListenerS82S0300000_16.l1;
        if (webView == null || (currentUrl = webView.getUrl()) == null) {
            currentUrl = ((C1035880d3y) aCListenerS82S0300000_16.l2).getCurrentUrl();
        }
        C1037430d6T c1037430d6T = (C1037430d6T) aCListenerS82S0300000_16.l0;
        if (c1037430d6T.LL != null) {
            C1035880d3y c1035880d3y = (C1035880d3y) aCListenerS82S0300000_16.l2;
            C1037380d6O c1037380d6O = C1037380d6O.LIZ;
            Context context = c1037430d6T.getContext();
            C1017520caM c1017520caM = c1037430d6T.LL;
            c1037380d6O.getClass();
            C1037380d6O.LIZJ(context, c1017520caM, false, c1035880d3y, currentUrl, null);
        } else {
            C1037380d6O c1037380d6O2 = C1037380d6O.LIZ;
            C1035880d3y c1035880d3y2 = (C1035880d3y) aCListenerS82S0300000_16.l2;
            Context context2 = c1037430d6T.getContext();
            c1037380d6O2.getClass();
            C1037380d6O.LJ(c1035880d3y2, currentUrl, context2);
        }
        Iterator<InterfaceC1037440d6U> it3 = ((C1037430d6T) aCListenerS82S0300000_16.l0).LLILZLL.iterator();
        while (it3.hasNext()) {
            it3.next().LIZLLL(false);
        }
    }

    public static final void onClick$2(ACListenerS82S0300000_16 aCListenerS82S0300000_16, View view) {
        C1069830dwj.LIZ(EnumC1070410dxf.FACEBOOK, ((LinearLayout) aCListenerS82S0300000_16.l0).getContext(), (C1073970e3P) aCListenerS82S0300000_16.l1, new AwS595S0100000_16((NeedAuthFragment) aCListenerS82S0300000_16.l2, 130));
    }

    public static final void onClick$3(ACListenerS82S0300000_16 aCListenerS82S0300000_16, View view) {
        C1016230cYH c1016230cYH = (C1016230cYH) aCListenerS82S0300000_16.l0;
        Context context = (Context) aCListenerS82S0300000_16.l1;
        InterfaceC1031540cwy interfaceC1031540cwy = (InterfaceC1031540cwy) aCListenerS82S0300000_16.l2;
        c1016230cYH.getClass();
        C1016230cYH.LIZJ(context, "name", interfaceC1031540cwy);
    }

    public static final void onClick$4(ACListenerS82S0300000_16 aCListenerS82S0300000_16, View view) {
        C1016230cYH c1016230cYH = (C1016230cYH) aCListenerS82S0300000_16.l0;
        Context context = (Context) aCListenerS82S0300000_16.l1;
        InterfaceC1031540cwy interfaceC1031540cwy = (InterfaceC1031540cwy) aCListenerS82S0300000_16.l2;
        c1016230cYH.getClass();
        C1016230cYH.LIZJ(context, "title", interfaceC1031540cwy);
    }

    public static final void onClick$5(ACListenerS82S0300000_16 aCListenerS82S0300000_16, View view) {
        C1016230cYH c1016230cYH = (C1016230cYH) aCListenerS82S0300000_16.l0;
        Context context = (Context) aCListenerS82S0300000_16.l1;
        InterfaceC1031540cwy interfaceC1031540cwy = (InterfaceC1031540cwy) aCListenerS82S0300000_16.l2;
        c1016230cYH.getClass();
        C1016230cYH.LIZJ(context, "sponsored", interfaceC1031540cwy);
    }

    public static final void onClick$6(ACListenerS82S0300000_16 aCListenerS82S0300000_16, View view) {
        C1016230cYH c1016230cYH = (C1016230cYH) aCListenerS82S0300000_16.l0;
        Context context = (Context) aCListenerS82S0300000_16.l1;
        InterfaceC1031540cwy interfaceC1031540cwy = (InterfaceC1031540cwy) aCListenerS82S0300000_16.l2;
        c1016230cYH.getClass();
        C1016230cYH.LIZJ(context, "photo", interfaceC1031540cwy);
    }

    public static final void onClick$7(ACListenerS82S0300000_16 aCListenerS82S0300000_16, View view) {
        String str;
        String str2;
        String str3;
        InterfaceC1036110d4L interfaceC1036110d4L;
        C0H9G c0h9g = (C0H9G) aCListenerS82S0300000_16.l0;
        SparkContext sparkContext = (SparkContext) aCListenerS82S0300000_16.l1;
        EfficiencyComponents efficiencyComponents = (EfficiencyComponents) aCListenerS82S0300000_16.l2;
        c0h9g.getClass();
        if (efficiencyComponents != null) {
            EfficiencyJumpData efficiencyJumpData = efficiencyComponents.jumpData;
            if (efficiencyJumpData != null) {
                str = efficiencyJumpData.lynxSchema;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                if (sparkContext != null && (interfaceC1036110d4L = (InterfaceC1036110d4L) sparkContext.LJFF(InterfaceC1036110d4L.class)) != null) {
                    interfaceC1036110d4L.LJJJI();
                }
                Context context = c0h9g.getContext();
                if (context == null) {
                    C844470XAv.LIZ.getClass();
                    context = C844470XAv.LIZ();
                }
                EfficiencyJumpData efficiencyJumpData2 = efficiencyComponents.jumpData;
                String str4 = "";
                if (efficiencyJumpData2 == null || (str2 = efficiencyJumpData2.lynxSchema) == null) {
                    str2 = "";
                }
                EfficiencyJumpData efficiencyJumpData3 = efficiencyComponents.jumpData;
                if (efficiencyJumpData3 != null && (str3 = efficiencyJumpData3.frontendData) != null) {
                    str4 = str3;
                }
                C1027410cqJ.LIZ(context, C1027610cqd.LIZ(str2, "", 0, 0, 0, 6, new JSONObject(str4), null, null, null, "", 1, null, 0, 0, 1, null, null, null, null, null, null, 8314880)).LIZ();
            }
        }
    }

    public static final void onClick$8(ACListenerS82S0300000_16 aCListenerS82S0300000_16, View view) {
        ((InterfaceC1011400cQU) aCListenerS82S0300000_16.l0).LJI(!r1.isMute());
        C1011980cRQ c1011980cRQ = EnumC1012120cRe.Companion;
        int iLJII = ((InterfaceC1011400cQU) aCListenerS82S0300000_16.l0).LJII();
        c1011980cRQ.getClass();
        EnumC1012120cRe enumC1012120cReLIZ = C1011980cRQ.LIZ(iLJII);
        if (enumC1012120cReLIZ != null) {
            ((C1012300cRw) aCListenerS82S0300000_16.l2).LIZ(enumC1012120cReLIZ, false);
        }
        InterfaceC1011430cQX interfaceC1011430cQX = ((C1011140cQ4) aCListenerS82S0300000_16.l1).LL.LIZLLL;
        if (interfaceC1011430cQX != null) {
            interfaceC1011430cQX.LIZIZ(EnumC1011130cQ3.SOUND_ICON_CLICK);
        }
    }

    public static final void onClick$9(ACListenerS82S0300000_16 aCListenerS82S0300000_16, View view) {
        ((C1016250cYJ) aCListenerS82S0300000_16.l0).LIZIZ((Context) aCListenerS82S0300000_16.l1, "photo", (InterfaceC1032120cxu) aCListenerS82S0300000_16.l2);
    }

    public ACListenerS82S0300000_16(C1037430d6T c1037430d6T, C1035880d3y c1035880d3y, int i) {
        this.$t = i;
        this.l0 = c1037430d6T;
        this.l1 = null;
        this.l2 = c1035880d3y;
    }

    public ACListenerS82S0300000_16(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
