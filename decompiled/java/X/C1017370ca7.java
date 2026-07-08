package X;

import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.IAdReRankServiceManagerService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.IMainAdScene;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdShoppingService;
import com.ss.android.ugc.aweme.commercialize.model.AdWebUrlDataFromJsb;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.commercialize.service.ICommerceGlueOutService;
import com.ss.android.ugc.aweme.commercialize.service.IFeedVideoShrinkService;
import com.ss.android.ugc.aweme.commercialize.service.ISamsungPageService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.slide.IMainPageSlide;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.landpage.IAdLynxLandPageUtils;
import com.ss.android.ugc.aweme.main.MainRootFragment;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ca7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017370ca7 {
    public final C19GS LIZ;
    public HomePageDataViewModel LIZIZ;
    public IMainAdScene LIZJ;
    public final C1048620dOW LIZLLL = new InterfaceC2211161BgQ() { // from class: X.0dOW
        @Override // X.InterfaceC2211161BgQ
        public final void LIZIZ(String str, String str2) {
        }

        @Override // X.InterfaceC2211161BgQ
        public final void LIZJ(long j, long j2, String str, String str2, String str3, String str4) {
        }

        @Override // X.InterfaceC2211161BgQ
        public final void LIZ(String str, final String str2) {
            final boolean zEquals = "dislike".equals(str);
            final boolean zEquals2 = "report".equals(str);
            if (zEquals || zEquals2) {
                C823050WQl.LIZJ().submit(new Runnable() { // from class: X.0dOV
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC1603020roi interfaceC1603020roiLIZIZ;
                        String str3 = str2;
                        boolean z = zEquals;
                        boolean z2 = zEquals2;
                        C1C7U.LIZ("CommerceActivityObserver@3afd.<field>$1$onEventV3$1L");
                        try {
                            JSONObject jSONObject = new JSONObject(str3);
                            if (jSONObject.optString("is_ads", "").equals("1") && jSONObject.optString("enter_from", "").equals("homepage_hot")) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("[onEventV3] isDislike=");
                                sbLIZ.append(z);
                                sbLIZ.append(", isReport=");
                                sbLIZ.append(z2);
                                C1022620cia.LIZ("CommerceActivityObserver", C2188811AlT.LIZIZ(sbLIZ));
                                IAdReRankServiceManagerService iAdReRankServiceManagerService = (IAdReRankServiceManagerService) PluggableExtentionKt.pluggableSpi(IAdReRankServiceManagerService.class);
                                if (iAdReRankServiceManagerService != null && (interfaceC1603020roiLIZIZ = iAdReRankServiceManagerService.LIZIZ(EnumC584610MwN.FEED)) != null) {
                                    interfaceC1603020roiLIZIZ.Z4(z ? EnumC2245291CuN.ON_DISLIKE : EnumC2245291CuN.ON_REPORT);
                                }
                            }
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        C1C7U.LIZIZ("CommerceActivityObserver@3afd.<field>$1$onEventV3$1L");
                    }
                });
            }
        }
    };
    public final ICommerceGlueOutService LJ = (ICommerceGlueOutService) PluggableExtentionKt.pluggableSpi(ICommerceGlueOutService.class);
    public final IMainService LJFF = (IMainService) PluggableExtentionKt.pluggableSpi(IMainService.class);

    public final void LIZIZ() {
        if (C0S4G.LIZ() || C2512409sw.LIZ) {
            ((InterfaceC1017450caF) this.LIZ).setVpEnableDispatchTouchEventCheck(false);
        }
        Aweme aweme = this.LIZIZ.LLJILJILJ;
        if (aweme == null) {
            return;
        }
        C1017410caB c1017410caBLIZIZ = ((IMainPageSlide) ServiceManager.get().getService(IMainPageSlide.class)).LIZIZ(aweme);
        boolean z = c1017410caBLIZIZ.LIZ;
        boolean z2 = c1017410caBLIZIZ.LIZIZ;
        ((InterfaceC1017450caF) this.LIZ).allowSwipeLeft(z);
        C1010280cOg.LIZ.getClass();
        C1010280cOg.LJIILIIL = z;
        if (z2) {
            if (TextUtils.equals(this.LIZIZ.getEventType(), "homepage_popular") && TextUtils.equals(this.LIZIZ.getEventType(), "homepage_follow")) {
                return;
            }
            if (C0S4G.LIZ() || C2512409sw.LIZ) {
                ((InterfaceC1017450caF) this.LIZ).setVpEnableDispatchTouchEventCheck(true);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZJ(java.lang.String r3) {
        /*
            r3.getClass()
            int r0 = r3.hashCode()
            r2 = 1
            r1 = -1
            switch(r0) {
                case -926299046: goto Ld;
                case -777084190: goto L18;
                case -770619361: goto L37;
                case 193277936: goto L23;
                case 1179481106: goto L2e;
                case 2090783003: goto L40;
                default: goto Lc;
            }
        Lc:
            return r1
        Ld:
            java.lang.String r0 = "click_ad_anchor"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lc
            r0 = 58
            return r0
        L18:
            java.lang.String r0 = "click_name"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lc
            r0 = 39
            return r0
        L23:
            java.lang.String r0 = "click_avatar"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lc
            r0 = 64
            return r0
        L2e:
            java.lang.String r0 = "click_ad_text"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lc
            return r2
        L37:
            java.lang.String r0 = "scroll_to_slide"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L49
            return r1
        L40:
            java.lang.String r0 = "click_app_full_screen_ad"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L49
            return r1
        L49:
            r0 = 40
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1017370ca7.LIZJ(java.lang.String):int");
    }

    public final boolean LIZ(String str, String str2) {
        String str3;
        AwemeRawAd awemeRawAd;
        IMainService iMainService;
        boolean z;
        IMainService iMainService2;
        ICommerceService iCommerceService;
        IAdPhotoModeService iAdPhotoModeService;
        boolean z2;
        AwemeRawAd awemeRawAd2;
        int i;
        Aweme aweme;
        IMainService iMainService3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[isAdInterceptScrollToProfile] clickFrom=");
        sbLIZ.append(str);
        C1022620cia.LIZ("CommerceActivityObserver", C2188811AlT.LIZIZ(sbLIZ));
        int iLIZJ = LIZJ(str);
        int iLIZJ2 = LIZJ(str);
        String webUrl = "";
        if (iLIZJ2 != 1) {
            if (iLIZJ2 != 58) {
                if (iLIZJ2 != 64) {
                    if (iLIZJ2 != 39) {
                        if (iLIZJ2 != 40) {
                            str3 = "";
                        } else {
                            str3 = "slide";
                        }
                    } else {
                        str3 = "name";
                    }
                } else {
                    str3 = "photo";
                }
            } else {
                str3 = "anchor";
            }
        } else {
            str3 = "title";
        }
        if (TextUtils.equals(str, "click_ad_jsb")) {
            return false;
        }
        if (TextUtils.equals(str, "click_ad_web_jsb")) {
            HomePageDataViewModel homePageDataViewModel = this.LIZIZ;
            if (homePageDataViewModel != null && (aweme = homePageDataViewModel.LLJILJILJ) != null && AwemeExtKt.isAdTraffic(aweme) && aweme.getAwemeRawAd() != null && aweme.getAwemeRawAd().getAdWebUrlDataFromJsb() != null) {
                AdWebUrlDataFromJsb adWebUrlDataFromJsb = aweme.getAwemeRawAd().getAdWebUrlDataFromJsb();
                String refer = adWebUrlDataFromJsb.getRefer();
                IFeedVideoShrinkService iFeedVideoShrinkService = (IFeedVideoShrinkService) ServiceManager.get().getService(IFeedVideoShrinkService.class);
                if (iFeedVideoShrinkService != null && iFeedVideoShrinkService.LLLF(refer) && C1017180cZo.LJJIIZ(aweme.getAwemeRawAd(), true) && (iMainService3 = this.LJFF) != null && iMainService3.openPopUpWebPageWithViewShrink(this.LIZ, aweme, 25, adWebUrlDataFromJsb)) {
                    return true;
                }
            }
            return false;
        }
        HomePageDataViewModel homePageDataViewModel2 = this.LIZIZ;
        if (homePageDataViewModel2 == null) {
            return false;
        }
        Aweme aweme2 = homePageDataViewModel2.LLJILJILJ;
        if (C1017070cZd.LLJJI(aweme2, C1026350cob.LIZIZ(iLIZJ), C1026350cob.LIZ(iLIZJ))) {
            return false;
        }
        IAdWebUtils iAdWebUtils = (IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class);
        if (C1017070cZd.LL(aweme2) && iAdWebUtils != null && TextUtils.equals(str, "scroll_to_slide") && iAdWebUtils.Su(aweme2, C1026350cob.LIZIZ(iLIZJ))) {
            return false;
        }
        IFeedAdService iFeedAdService = (IFeedAdService) ServiceManager.get().getService(IFeedAdService.class);
        if (iFeedAdService != null) {
            iFeedAdService.setEnterFrom(this.LIZIZ.getEventType());
        }
        if (aweme2 == null || !AwemeExtKt.isAdTraffic(aweme2) || (awemeRawAd = aweme2.getAwemeRawAd()) == null) {
            return false;
        }
        if (C1017070cZd.LL(aweme2) && ((TextUtils.equals(str, "click_name") || TextUtils.equals(str, "click_avatar")) && ((IAdPhotoModeService) ServiceManager.get().getService(IAdPhotoModeService.class)).LJII(aweme2))) {
            if (TextUtils.equals("click_avatar", str)) {
                i = 64;
            } else {
                i = 39;
            }
            IMainService iMainService4 = this.LJFF;
            if (iMainService4 != null) {
                iMainService4.handleCarouselMultiJump(this.LIZ, aweme2, i);
            }
            return true;
        }
        if (C1017070cZd.LJJZZI(aweme2) && ((IAdLynxLandPageUtils) ServiceManager.get().getService(IAdLynxLandPageUtils.class)).LIZJ(aweme2)) {
            return false;
        }
        if (awemeRawAd.getWebUrl() != null) {
            webUrl = awemeRawAd.getWebUrl();
        }
        Uri uri = UriProtector.parse(webUrl);
        if (C1017070cZd.LL(aweme2) && ((TextUtils.equals(str, "click_name") || TextUtils.equals(str, "click_avatar")) && awemeRawAd.getShouldWebUrlJumpThirdApp() && C1022030chd.LJIILLIIL(uri))) {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            IMainService iMainService5 = this.LJFF;
            if (iMainService5 != null) {
                iMainService5.openAppWithLog(contextLIZ, awemeRawAd, webUrl, iMainService5.hasAppByHttp(contextLIZ, uri));
            }
            IMainService iMainService6 = this.LJFF;
            if (iMainService6 != null && iMainService6.hasAppByHttp(contextLIZ, uri)) {
                C1017280cZy.LIZLLL(contextLIZ, uri, iLIZJ, str2, aweme2);
                return true;
            }
        }
        if (C1017070cZd.LL(aweme2) && C1017070cZd.LLJLLL(aweme2)) {
            C1017280cZy.LIZIZ(this.LIZ, aweme2, str2, iLIZJ);
            return true;
        }
        ICommercePromoteService iCommercePromoteService = (ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class);
        if (iCommercePromoteService.LJJIFFI(aweme2)) {
            return iCommercePromoteService.LJJJI(this.LIZ, aweme2, 40);
        }
        if (AwemeExtKt.isAdTraffic(aweme2) && (awemeRawAd2 = aweme2.getAwemeRawAd()) != null && C1017070cZd.LL(aweme2) && !C1017070cZd.LJIIJ(aweme2) && (((C1019620cdk.LIZIZ(3, aweme2) && !TextUtils.isEmpty(awemeRawAd2.getWebUrl())) || C1022030chd.LJIJI(awemeRawAd2.getOpenUrl()) || ((C1017070cZd.LLJJIJI(aweme2, C1026350cob.LIZIZ(iLIZJ), C1026350cob.LIZ(iLIZJ), false) && !TextUtils.isEmpty(C1017070cZd.LJIIZILJ(aweme2))) || C1017070cZd.LJLILLLLZI(aweme2))) && !C1017070cZd.LJJLL(aweme2))) {
            if (C1017070cZd.LLLIIIIL(aweme2)) {
                IMainService iMainService7 = this.LJFF;
                if (iMainService7 != null) {
                    iMainService7.showConfirmDialogBeforeJumpTo3rdApp(this.LIZ, aweme2, "slide");
                    return true;
                }
                return true;
            }
            IFeedAdShoppingService iFeedAdShoppingService = (IFeedAdShoppingService) PluggableExtentionKt.pluggableSpi(IFeedAdShoppingService.class);
            if (iFeedAdShoppingService != null && C0BTI.LIZ()) {
                iFeedAdShoppingService.getShoppingCoupon(aweme2, null);
            }
            if (C1017280cZy.LJ(this.LIZ, aweme2, str2, iLIZJ)) {
                return true;
            }
            ICommerceGlueOutService iCommerceGlueOutService = this.LJ;
            if (iCommerceGlueOutService != null && iCommerceGlueOutService.LJJIJL(this.LIZ, aweme2)) {
                return true;
            }
            if (C1017070cZd.LLJJIJI(aweme2, C1026350cob.LIZIZ(iLIZJ), C1026350cob.LIZ(iLIZJ), false) && !TextUtils.isEmpty(C1017070cZd.LJIIZILJ(aweme2)) && C1017280cZy.LJI(this.LIZ, aweme2, str2, iLIZJ)) {
                return true;
            }
            C0BTH.LIZ.getClass();
            if (C0BTH.LIZ()) {
                return false;
            }
            IMainService iMainService8 = this.LJFF;
            if (iMainService8 != null) {
                iMainService8.openFeedAdWebUrl(this.LIZ, aweme2, 40);
                return true;
            }
            return true;
        }
        if (!C1017070cZd.LJJLJLI(aweme2) && TextUtils.isEmpty(awemeRawAd.getWebUrl()) && C1017070cZd.LL(aweme2)) {
            C786410Ut5.re(Toast.makeText(this.LIZ, 2131824734, 0));
            return true;
        }
        if (C1017070cZd.LJJLJLI(aweme2) && C1017070cZd.LL(aweme2) && !C1017070cZd.LJIIJ(aweme2) && !C1017070cZd.LJJLL(aweme2)) {
            if (C1017070cZd.LJFF(aweme2)) {
                new C1024820cm8(aweme2).LJJIJ(iLIZJ, aweme2.getAwemeRawAd().getOpenUrl(), C1026350cob.LIZIZ(iLIZJ), C1026350cob.LIZ(iLIZJ), false);
            }
            if (C1017070cZd.LJJLJLI(aweme2)) {
                if (C1017280cZy.LIZJ(iLIZJ, aweme2, str2)) {
                    C1017280cZy.LIZ(iLIZJ, this.LIZ, aweme2);
                    return true;
                }
                ICommerceService iCommerceService2 = (ICommerceService) PluggableExtentionKt.pluggableSpi(ICommerceService.class);
                if (iCommerceService2 != null && iCommerceService2.LIZIZ().LJIILIIL().LIZ(this.LIZ, aweme2, iLIZJ)) {
                    return true;
                }
                if (TextUtils.equals(str, "click_name") || TextUtils.equals(str, "click_avatar")) {
                    IMainService iMainService9 = this.LJFF;
                    if (iMainService9 != null && iMainService9.tryToOpenGPMiniCard(this.LIZ, aweme2, iLIZJ, false, false)) {
                        return true;
                    }
                    IMainService iMainService10 = this.LJFF;
                    if (iMainService10 != null) {
                        C19GS c19gs = this.LIZ;
                        if (str.equals("click_avatar") && aweme2.getAwemeRawAd() != null && aweme2.getAwemeRawAd().getMiniCardModel() != null && aweme2.getAwemeRawAd().getMiniCardModel().getAvatarIconType() == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (iMainService10.tryToGetApps(c19gs, iLIZJ, str3, aweme2, false, z2)) {
                            return true;
                        }
                    }
                    ISamsungPageService iSamsungPageService = (ISamsungPageService) PluggableExtentionKt.pluggableSpi(ISamsungPageService.class);
                    if (iSamsungPageService != null && iSamsungPageService.LIZ(this.LIZ, aweme2, iLIZJ)) {
                        return true;
                    }
                }
                IMainService iMainService11 = this.LJFF;
                if (iMainService11 == null || iMainService11.openGooglePlayStore(this.LIZ, aweme2, str3, iLIZJ)) {
                    return true;
                }
                C786410Ut5.re(Toast.makeText(this.LIZ, 2131824734, 0));
                return true;
            }
            C786410Ut5.re(Toast.makeText(this.LIZ, 2131824734, 0));
            return true;
        }
        if (!C1017070cZd.LL(aweme2)) {
            if (C307430C3h.LIZ(str) && C1017070cZd.LJLLJ(awemeRawAd) && ((TextUtils.equals(str, "click_name") || TextUtils.equals(str, "click_avatar") || TextUtils.equals(str, "scroll_to_slide")) && (iAdPhotoModeService = (IAdPhotoModeService) PluggableExtentionKt.pluggableSpi(IAdPhotoModeService.class)) != null && iAdPhotoModeService.LJII(aweme2))) {
                if (C1029590ctp.LIZIZ() != null) {
                    C19GS c19gs2 = this.LIZ;
                    int iLIZJ3 = LIZJ(str);
                    C1264004x4 c1264004x4 = new C1264004x4(true);
                    IAdPhotoModeService iAdPhotoModeService2 = (IAdPhotoModeService) PluggableExtentionKt.pluggableSpi(IAdPhotoModeService.class);
                    if (iAdPhotoModeService2 != null) {
                        C1021860chM.LJJIJLIJ(c19gs2, aweme2, iLIZJ3, iAdPhotoModeService2.LJJIJIIJIL(), c1264004x4);
                        return false;
                    }
                    return false;
                }
                return false;
            }
            if (C1017070cZd.LJJLIIIJJI(aweme2, true)) {
                if (!C1017280cZy.LJ(this.LIZ, aweme2, str2, iLIZJ) && (iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi(ICommerceService.class)) != null) {
                    iCommerceService.LIZIZ().LJIILIIL().LIZ(this.LIZ, aweme2, iLIZJ);
                    return false;
                }
                return false;
            }
            if (C1017070cZd.LJFF(aweme2)) {
                new C1024820cm8(aweme2).LJJIJ(iLIZJ, aweme2.getAwemeRawAd().getOpenUrl(), C1026350cob.LIZIZ(iLIZJ), C1026350cob.LIZ(iLIZJ), false);
            }
            if (!TextUtils.equals(str, "click_app_full_screen_ad") && !TextUtils.equals(str, "scroll_to_slide")) {
                z = false;
            } else {
                z = true;
            }
            if (C1017070cZd.LJJLIIIJILLIZJL(aweme2, z)) {
                if (C1017280cZy.LIZJ(iLIZJ, aweme2, str2)) {
                    C1017280cZy.LIZ(iLIZJ, this.LIZ, aweme2);
                    return false;
                }
                ISamsungPageService iSamsungPageService2 = (ISamsungPageService) PluggableExtentionKt.pluggableSpi(ISamsungPageService.class);
                if ((iSamsungPageService2 != null && iSamsungPageService2.LIZ(this.LIZ, aweme2, iLIZJ)) || (iMainService2 = this.LJFF) == null) {
                    return false;
                }
                iMainService2.openGooglePlayStore(this.LIZ, aweme2, str3, iLIZJ);
                return false;
            }
            if (C1017070cZd.LJJZ(aweme2, C1026350cob.LIZIZ(iLIZJ), C1026350cob.LIZ(iLIZJ)) && C1017280cZy.LJI(this.LIZ, aweme2, str2, iLIZJ)) {
                return false;
            }
            if (C1017070cZd.LJJLIIIJJIZ(aweme2)) {
                C1017280cZy.LIZLLL(this.LIZ, uri, iLIZJ, str2, aweme2);
                return false;
            }
        }
        if (!C1017070cZd.LJIIJ(aweme2) && C1017070cZd.LL(aweme2) && ((TextUtils.equals(str, "click_name") || TextUtils.equals(str, "click_avatar")) && C1017180cZo.LJJIIZ(aweme2.getAwemeRawAd(), false) && (iMainService = this.LJFF) != null && iMainService.openPopUpWebPageWithViewShrink(this.LIZ, aweme2, iLIZJ, null))) {
            return true;
        }
        if (C1017070cZd.LJLZ(aweme2)) {
            if (TextUtils.equals(str, "click_name") || TextUtils.equals(str, "click_avatar")) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[isAdInterceptScrollToProfile] series ads, clickFrom=");
                sbLIZ2.append(str);
                sbLIZ2.append(", call onAdButtonClick");
                C1022620cia.LIZ("CommerceActivityObserver", C2188811AlT.LIZIZ(sbLIZ2));
                C1017280cZy.LJ(this.LIZ, aweme2, str2, iLIZJ);
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0dOW] */
    public C1017370ca7(final C19GS c19gs, LifecycleOwner lifecycleOwner, MainRootFragment mainRootFragment) {
        this.LIZ = c19gs;
        C08RN.LIZ(c19gs);
        IAdSceneService iAdSceneService = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class);
        if (iAdSceneService != null) {
            this.LIZJ = iAdSceneService.LIZ();
            C1017380ca8 c1017380ca8 = new C1017380ca8();
            c1017380ca8.LIZIZ = c19gs;
            c1017380ca8.LIZJ = mainRootFragment;
            c1017380ca8.LIZLLL = lifecycleOwner;
            c1017380ca8.LIZ = new InterfaceC1019190cd3() { // from class: X.0cwQ
                @Override // X.InterfaceC1019190cd3
                public final long LIZ() {
                    ICommerceGlueOutService iCommerceGlueOutService = this.LIZIZ.LJ;
                    if (iCommerceGlueOutService != null) {
                        return iCommerceGlueOutService.LIZ();
                    }
                    return 0L;
                }

                @Override // X.InterfaceC1019190cd3
                public final void LJIILL() {
                    this.LIZIZ.LIZIZ();
                }

                @Override // X.InterfaceC1019190cd3
                public final int LJJLIL() {
                    ICommerceGlueOutService iCommerceGlueOutService = this.LIZIZ.LJ;
                    if (iCommerceGlueOutService != null) {
                        return iCommerceGlueOutService.LJJLIL();
                    }
                    return 0;
                }

                @Override // X.InterfaceC1019190cd3
                public final Fragment getCurFragment() {
                    C1017370ca7 c1017370ca7 = this.LIZIZ;
                    if (C343710Ddh.LIZ(c1017370ca7.LIZ) == null) {
                        return null;
                    }
                    return C343710Ddh.LIZ(c1017370ca7.LIZ).BQ2();
                }

                @Override // X.InterfaceC1019190cd3
                public final long getCurrentPosition() {
                    ICommerceGlueOutService iCommerceGlueOutService = this.LIZIZ.LJ;
                    if (iCommerceGlueOutService != null) {
                        return iCommerceGlueOutService.getCurrentPosition();
                    }
                    return 0L;
                }

                @Override // X.InterfaceC1019190cd3
                public final boolean isNewUser() {
                    IMainService iMainService = this.LIZIZ.LJFF;
                    return iMainService != null && iMainService.isNewUser(c19gs);
                }

                @Override // X.InterfaceC1019190cd3
                public final void LJJII() {
                    IMainService iMainService;
                    ISplashAdService iSplashAdService = (ISplashAdService) ServiceManager.get().getService(ISplashAdService.class);
                    if (iSplashAdService != null && (iMainService = this.LIZIZ.LJFF) != null) {
                        iSplashAdService.LJJII(iMainService.generateSplashAdDependImpl());
                    } else {
                        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                        C793770VBv.LJIIJJI("splash_depend_init_question", 3, null);
                    }
                }

                @Override // X.InterfaceC1019190cd3
                public final void LJIJJLI() {
                    AnonymousClass1440.LJI();
                }

                @Override // X.InterfaceC1019190cd3
                public final void LJIIZILJ(boolean z) {
                    long j;
                    if (z) {
                        C1150504el.LIZ().LJIIJJI = 1;
                        C202099145x c202099145xLIZ = C1150504el.LIZ();
                        if (c202099145xLIZ.LJIIL == -1) {
                            c202099145xLIZ.LJIIL = 201;
                        }
                        if (C1220604q4.LIZ()) {
                            HashMap map = new HashMap();
                            map.put("first_feed_type", 201);
                            C798410VTr.LJFF(map);
                        }
                        C2187451AjH.LJIIJJI = true;
                        C592890NNf.LIZIZ().LIZJ();
                        if (((Boolean) C1213104or.LIZIZ.getValue()).booleanValue()) {
                            C20639086r.LIZ.LIZIZ();
                            C20639086r.LIZLLL(new ARunnableS116S0100000_16(this, 270));
                        }
                    }
                    C202098145w c202098145wLIZ = C08TN.LIZ();
                    if (z) {
                        j = 1;
                    } else {
                        j = 0;
                    }
                    c202098145wLIZ.LIZ(j, "is_show_splash");
                }

                @Override // X.InterfaceC1019190cd3
                public final void LIZIZ(String str, boolean z) {
                    if (z) {
                        C0X35.LIZ(str, false);
                    } else {
                        C0X35.LJIIJJI(str, false);
                    }
                }

                @Override // X.InterfaceC1019190cd3
                public final void LIZJ(String str, String str2, JSONObject jSONObject) {
                    ICommerceGlueOutService iCommerceGlueOutService = this.LIZIZ.LJ;
                    if (iCommerceGlueOutService != null) {
                        iCommerceGlueOutService.LIZJ(str, str2, jSONObject);
                    }
                }

                @Override // X.InterfaceC1019190cd3
                public final void LIZLLL(C19GS c19gs2, String str, String str2) {
                    ICommerceGlueOutService iCommerceGlueOutService;
                    if (!TextUtils.equals(C0C64.LJIILLIIL().LJJ(31744, "enable_send_staging_adlog", "v3", true), "v1") && (iCommerceGlueOutService = this.LIZIZ.LJ) != null) {
                        iCommerceGlueOutService.LIZLLL(c19gs2, str, str2);
                    }
                }

                @Override // X.InterfaceC1019190cd3
                public final void LJIILLIIL(String str, String str2, String str3) {
                    ICommerceGlueOutService iCommerceGlueOutService = this.LIZIZ.LJ;
                    if (iCommerceGlueOutService != null) {
                        iCommerceGlueOutService.LJIIZILJ(str2, str3);
                    }
                }
            };
            this.LIZJ.init(c1017380ca8);
        }
        IAdSceneService iAdSceneService2 = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class);
        if (iAdSceneService2 != null) {
            AbstractC1017400caA abstractC1017400caA = new AbstractC1017400caA() { // from class: X.0ca9
            };
            abstractC1017400caA.LIZ = new C1017270cZx();
            iAdSceneService2.LIZIZ().init(abstractC1017400caA);
        }
        ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJIJJLI().LIZIZ(c19gs);
        ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJFF().LIZIZ(c19gs);
        C999720c7e c999720c7eLJJIJIIJIL = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJIJIIJIL();
        c999720c7eLJJIJIIJIL.getClass();
        C1000300c8a.LIZ(c999720c7eLJJIJIIJIL, c19gs);
        C999880c7u c999880c7uLJIJJ = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJIJJ();
        c999880c7uLJIJJ.getClass();
        C1000300c8a.LIZ(c999880c7uLJIJJ, c19gs);
        C999920c7y c999920c7yLJI = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJI();
        c999920c7yLJI.getClass();
        C1000300c8a.LIZ(c999920c7yLJI, c19gs);
        ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJ().LIZIZ(c19gs);
        ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJIZ().LIZIZ(c19gs);
    }
}
