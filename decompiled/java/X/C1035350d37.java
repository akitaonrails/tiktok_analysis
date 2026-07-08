package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;
import com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0d37, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1035350d37 implements InterfaceC1030070cub {
    public int LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ C1035340d36 LIZJ;

    @Override // X.InterfaceC1030070cub
    public final void LLLI() {
        this.LIZ = 6;
        this.LIZJ.LJIJI(true);
    }

    @Override // X.InterfaceC1030070cub
    public final void LJJJIL() throws JSONException {
        String url;
        String currentUrl;
        C1035890d3z adCommonData;
        Activity activityLIZ;
        InterfaceC1039110d9B interfaceC1039110d9B;
        AdLynxStatBusiness adLynxStatBusiness;
        InterfaceC1039110d9B interfaceC1039110d9B2;
        AdWebStatBusiness adWebStatBusiness;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sparkView;
        InterfaceC1541990qEH kitView;
        InterfaceC1026000co2 interfaceC1026000co2;
        C1035340d36.LLLLIIL.getClass();
        int i = this.LIZ;
        if (i == 5) {
            return;
        }
        this.LIZ = 5;
        C1035340d36 c1035340d36 = this.LIZJ;
        if (!c1035340d36.LLJJJJJIL && (interfaceC1026000co2 = c1035340d36.getLoadListener().LIZ) != null) {
            System.currentTimeMillis();
            interfaceC1026000co2.LJIJJLI();
        }
        C1035360d38 c1035360d38 = this.LIZJ.LLJJJ;
        if (c1035360d38 != null) {
            c1035360d38.enable(false);
        }
        C786410Ut5.LJZ(8, this.LIZJ.getPopUpWebMarkFromXml());
        C786410Ut5.O7(this.LIZJ.getPopUpWebMarkFromXml(), null);
        this.LIZJ.getPopUpWebMarkFromXml().setClickable(false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mBehaviorCallback ");
        sbLIZ.append(this.LIZJ.getMBehaviorCallback() != null);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1035410d3D mBehaviorCallback = this.LIZJ.getMBehaviorCallback();
        String strLIZ = mBehaviorCallback != null ? mBehaviorCallback.LIZ(i) : null;
        C1035340d36 c1035340d362 = this.LIZJ;
        c1035340d362.LLJJL = false;
        if (!c1035340d362.LLJJJJJIL) {
            if (c1035340d362.LIZIZ()) {
                this.LIZJ.getLoadListener().getClass();
            }
            if (this.LIZJ.getEnableWebSpark()) {
                C1035880d3y adWebModel = this.LIZJ.getAdWebSparkViewFromXml().getAdWebModel();
                if (adWebModel != null && (adCommonData = adWebModel.getAdCommonData()) != null) {
                    adCommonData.setHide(true);
                }
                C1035340d36.LJIJ(this.LIZJ.getAdWebSparkViewFromXml().getWebView(), adWebModel);
                C1036760d5O adWebSparkViewFromXml = this.LIZJ.getAdWebSparkViewFromXml();
                adWebSparkViewFromXml.getClass();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("sendEventToFe event ");
                sbLIZ2.append("onHide");
                sbLIZ2.append(" params ");
                sbLIZ2.append((Object) null);
                C2188811AlT.LIZIZ(sbLIZ2);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("eventName", "onHide");
                    jSONObject.put("data", (Object) null);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
                WebKitView webKitView = adWebSparkViewFromXml.LLIZ;
                if (webKitView != null) {
                    webKitView.LIZ("onHide", jSONObject);
                }
                url = adWebModel != null ? adWebModel.getUrl() : null;
                currentUrl = this.LIZJ.getAdWebSparkViewFromXml().getCurrentUrl();
            } else {
                url = "";
                currentUrl = "";
            }
            LIZ(null, url, currentUrl);
        } else if (c1035340d362.LLJJJJLIIL && (sparkView = c1035340d362.getPopUpWebPageWebviewSparkFromXml().getSparkView()) != null && (kitView = sparkView.getKitView()) != null) {
            kitView.onHide();
        }
        this.LIZJ.LJIJI(false);
        this.LIZJ.LJIJJ(false);
        C1035340d36 c1035340d363 = this.LIZJ;
        c1035340d363.LLJLLL = true;
        if (!c1035340d363.LJIIL()) {
            C1039050d95 rootContainer = this.LIZJ.getPopUpWebPageWebviewSparkFromXml().getRootContainer();
            if (rootContainer != null && (interfaceC1039110d9B2 = rootContainer.LL) != null && (adWebStatBusiness = (AdWebStatBusiness) interfaceC1039110d9B2.LIZIZ(AdWebStatBusiness.class)) != null) {
                adWebStatBusiness.LJIIJ(true);
            }
            C1039050d95 rootContainer2 = this.LIZJ.getPopUpWebPageWebviewSparkFromXml().getRootContainer();
            if (rootContainer2 != null && (interfaceC1039110d9B = rootContainer2.LL) != null && (adLynxStatBusiness = (AdLynxStatBusiness) interfaceC1039110d9B.LIZIZ(AdLynxStatBusiness.class)) != null) {
                adLynxStatBusiness.LJ(true);
            }
            if (this.LIZJ.getEnableWebSpark()) {
                this.LIZJ.getAdWebSparkViewFromXml().LJ(strLIZ);
            }
        }
        C1025930cnv c1025930cnv = this.LIZJ.LLJJLIIIJLLLLLLLZ;
        if (c1025930cnv == null || !c1025930cnv.LJII || (activityLIZ = C1388190mED.LIZ(this.LIZIZ)) == null) {
            return;
        }
        C988570bpf.LIZ.getClass();
        if (C1041070dCL.LIZ() != null) {
            C1028210crb.LJJI(activityLIZ);
        }
    }

    @Override // X.InterfaceC1030070cub
    public final void LLLFF() {
        Activity activityLIZ;
        Window window;
        View decorView;
        int i = C1030050cuZ.LLJLILLLLZIIL;
        if (C1030100cue.LIZ) {
            Context context = this.LIZIZ;
            C1069330dvv.LIZ(context, (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null || (window = activityLIZ.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.findFocus());
        }
    }

    @Override // X.InterfaceC1030070cub
    public final void LLLFFI() {
        InterfaceC1035410d3D mBehaviorCallback;
        C1035340d36.LLLLIIL.getClass();
        if (this.LIZJ.LJIIL()) {
            if (this.LIZ != 5) {
                this.LIZJ.LJIJJ(false);
            }
            this.LIZJ.LLJLLL = true;
        }
        int i = this.LIZ;
        if (i == 4) {
            if (!this.LIZJ.LJIIL() || (mBehaviorCallback = this.LIZJ.getMBehaviorCallback()) == null) {
                return;
            }
            mBehaviorCallback.LIZJ(i, Boolean.TRUE);
            return;
        }
        C1035340d36 c1035340d36 = this.LIZJ;
        if (!c1035340d36.LLJJJJJIL && c1035340d36.getEnableWebSpark()) {
            C1035340d36.LJIJ(this.LIZJ.getAdWebSparkViewFromXml().getWebView(), this.LIZJ.getAdWebSparkViewFromXml().getAdWebModel());
            C1035880d3y adWebModel = this.LIZJ.getAdWebSparkViewFromXml().getAdWebModel();
            LIZ(this.LIZJ.getAdWebSparkViewFromXml().getAdWebModel(), adWebModel != null ? adWebModel.getUrl() : null, this.LIZJ.getAdWebSparkViewFromXml().getCurrentUrl());
        }
        this.LIZ = 4;
        if (this.LIZJ.LJIIL()) {
            AdPopUpWebBottomSheetBehavior<C1030050cuZ> behavior = this.LIZJ.getPopUpWebBottomSheetFromXml().getBehavior();
            if ((behavior.LIZJ ? -1 : behavior.LIZIZ) == ((int) C12ES.LIZJ(64.0f, this.LIZIZ))) {
                C786410Ut5.LJZ(8, this.LIZJ.getPopUpWebMarkFromXml());
                C786410Ut5.O7(this.LIZJ.getPopUpWebMarkFromXml(), null);
                this.LIZJ.getPopUpWebMarkFromXml().setClickable(false);
                InterfaceC1035410d3D mBehaviorCallback2 = this.LIZJ.getMBehaviorCallback();
                if (mBehaviorCallback2 != null) {
                    mBehaviorCallback2.LIZJ(i, Boolean.FALSE);
                }
            }
        }
        this.LIZJ.LJIJI(false);
    }

    @Override // X.InterfaceC1030070cub
    public final void LLLFZ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sparkView;
        InterfaceC1541990qEH kitView;
        C1035340d36.LLLLIIL.getClass();
        if (this.LIZJ.LJIIL()) {
            this.LIZJ.getPopUpWebBottomSheetFromXml().getBehavior().setPeekHeight((int) C12ES.LIZJ(64.0f, this.LIZIZ));
            C1035340d36 c1035340d36 = this.LIZJ;
            if (c1035340d36.LLJLLL) {
                if (c1035340d36.LLJJJJ != null) {
                    ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).Yu();
                }
                C1035340d36 c1035340d362 = this.LIZJ;
                C1025100cma c1025100cma = c1035340d362.LLJLLIL;
                c1035340d362.LJIILL(c1025100cma != null ? c1025100cma.LJFF : null, 2, null);
                C1035340d36 c1035340d363 = this.LIZJ;
                if (c1035340d363.LLJJJJLIIL && (sparkView = c1035340d363.getPopUpWebPageWebviewSparkFromXml().getSparkView()) != null && (kitView = sparkView.getKitView()) != null) {
                    kitView.onShow();
                }
                this.LIZJ.LLJLLL = false;
            }
        }
        int i = this.LIZ;
        if (i == 4 || i == 5) {
            this.LIZJ.LJIIZILJ();
        }
        int i2 = this.LIZ;
        if (i2 == 3) {
            return;
        }
        this.LIZ = 3;
        InterfaceC1035410d3D mBehaviorCallback = this.LIZJ.getMBehaviorCallback();
        if (mBehaviorCallback != null) {
            mBehaviorCallback.LIZLLL(i2);
        }
        C786410Ut5.LJZ(0, this.LIZJ.getPopUpWebMarkFromXml());
        this.LIZJ.LJIJI(true);
    }

    public C1035350d37(Context context, C1035340d36 c1035340d36) {
        this.LIZIZ = context;
        this.LIZJ = c1035340d36;
    }

    @Override // X.InterfaceC1030070cub
    public final void LLLII(View view, float f) {
        C1035880d3y c1035880d3y;
        C1035890d3z adCommonData;
        InterfaceC1041500dD2 adWebInfo = this.LIZJ.getAdWebInfo();
        if ((adWebInfo instanceof C1035880d3y) && (c1035880d3y = (C1035880d3y) adWebInfo) != null && (adCommonData = c1035880d3y.getAdCommonData()) != null) {
            adCommonData.setScrollPercent(f);
        }
        if (this.LIZJ.LJIIL()) {
            float fLJ = C14KQ.LJ(this.LIZIZ) - view.getTop();
            if (fLJ > C12ES.LIZJ(400.0f, this.LIZIZ)) {
                C786410Ut5.LLIIL(this.LIZJ.getFakeUserProfileAdBottomFromXml(), 8);
            } else {
                C786410Ut5.LLIIL(this.LIZJ.getFakeUserProfileAdBottomFromXml(), 0);
            }
            if (fLJ > C12ES.LIZJ(400.0f, this.LIZIZ)) {
                C786410Ut5.Y4(this.LIZJ.getFakeUserProfileAdBottomFromXml(), 0.0f);
                C786410Ut5.U4(this.LIZJ.getPopUpWebLayoutFromXml(), 1.0f);
            } else if (fLJ >= C12ES.LIZJ(300.0f, this.LIZIZ) && fLJ <= C12ES.LIZJ(400.0f, this.LIZIZ)) {
                C786410Ut5.Y4(this.LIZJ.getFakeUserProfileAdBottomFromXml(), 0.0f);
                C786410Ut5.U4(this.LIZJ.getPopUpWebLayoutFromXml(), ((1 - ((C12ES.LIZJ(400.0f, this.LIZIZ) - fLJ) / C12ES.LIZJ(100.0f, this.LIZIZ))) * 0.9f) + 0.1f);
            } else if (fLJ >= C12ES.LIZJ(200.0f, this.LIZIZ) && fLJ < C12ES.LIZJ(300.0f, this.LIZIZ)) {
                C786410Ut5.U4(this.LIZJ.getPopUpWebLayoutFromXml(), 0.0f);
                C786410Ut5.Y4(this.LIZJ.getFakeUserProfileAdBottomFromXml(), (C12ES.LIZJ(300.0f, this.LIZIZ) - fLJ) / C12ES.LIZJ(100.0f, this.LIZIZ));
            } else {
                C786410Ut5.U4(this.LIZJ.getPopUpWebLayoutFromXml(), 0.0f);
                C786410Ut5.Y4(this.LIZJ.getFakeUserProfileAdBottomFromXml(), 1.0f);
            }
            C786410Ut5.LJZ(0, this.LIZJ.getPopUpWebMarkFromXml());
            C786410Ut5.U4(this.LIZJ.getPopUpWebMarkFromXml(), 1 - (view.getTop() / (C14KQ.LJ(this.LIZIZ) - C12ES.LIZJ(64.0f, this.LIZIZ))));
            return;
        }
        C786410Ut5.LLIIL(this.LIZJ.getFakeUserProfileAdBottomFromXml(), 8);
        if (Float.isNaN(f)) {
            C786410Ut5.U4(this.LIZJ.getPopUpWebMarkFromXml(), 1.0f);
        } else {
            if (f >= 0.0f) {
                return;
            }
            C786410Ut5.U4(this.LIZJ.getPopUpWebMarkFromXml(), 1.0f - Math.abs(f));
        }
    }

    public final void LIZ(InterfaceC1041500dD2 interfaceC1041500dD2, String str, String str2) {
        InterfaceC1035500d3M interfaceC1035500d3M;
        C1035880d3y c1035880d3y;
        InterfaceC1035480d3K bocRuleMatcher;
        C1035890d3z adCommonData;
        ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().z82(str, str2, interfaceC1041500dD2, this.LIZJ.getAdWebSparkViewFromXml().getSparkContext());
        if (this.LIZJ.getEnableWebSpark()) {
            C1035880d3y adWebModel = this.LIZJ.getAdWebSparkViewFromXml().getAdWebModel();
            AwemeRawAd awemeRawAd = null;
            if (adWebModel != null) {
                awemeRawAd = adWebModel.getAwemeRawAd();
            }
            if (C1017530caN.LIZIZ(this.LIZIZ, awemeRawAd)) {
                C1017530caN.LJI = true;
            }
            C1035880d3y adWebModel2 = this.LIZJ.getAdWebSparkViewFromXml().getAdWebModel();
            if (adWebModel2 != null && (adCommonData = adWebModel2.getAdCommonData()) != null) {
                adCommonData.setWebViewVisible(EnumC1037150d61.INVISIBLE);
            }
            ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).uv(this.LIZJ.getAdWebSparkViewFromXml().getAdWebModel());
            InterfaceC1041500dD2 adWebInfo = this.LIZJ.getAdWebInfo();
            if ((adWebInfo instanceof C1035880d3y) && (c1035880d3y = (C1035880d3y) adWebInfo) != null && (bocRuleMatcher = c1035880d3y.getBocRuleMatcher()) != null) {
                bocRuleMatcher.onHide();
            }
        }
        SparkContext sparkContext = this.LIZJ.getAdWebSparkViewFromXml().getSparkContext();
        if (sparkContext != null && (interfaceC1035500d3M = (InterfaceC1035500d3M) sparkContext.LJFF(InterfaceC1035500d3M.class)) != null) {
            interfaceC1035500d3M.onHide();
        }
    }
}
