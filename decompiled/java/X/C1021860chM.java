package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.dfid.AutoDFIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAnoleProductTilesService;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.IShopifySkuCheckoutService;
import com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.commercialize.service.ISamsungPageService;
import com.ss.android.ugc.aweme.component.nativeproducttilescomponent.AnoleProductTilesServiceImpl;
import com.ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;

/* JADX INFO: renamed from: X.0chM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1021860chM extends AbstractC1025070cmX {
    public static final /* synthetic */ int LIZIZ = 0;

    public static boolean LJJIL(int i) {
        if (i != 1 && i != 2 && i != 3 && i != 8 && i != 14 && i != 58 && i != 70 && i != 92 && i != 11 && i != 12) {
            switch (i) {
                case 87:
                case 88:
                case 89:
                case 90:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public static boolean LJJIZ(int i) {
        if (i != 1 && i != 2 && i != 3 && i != 8 && i != 14 && i != 39 && i != 58 && i != 64 && i != 70 && i != 92 && i != 11 && i != 12) {
            switch (i) {
                case 87:
                case 88:
                case 89:
                case 90:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public static boolean LJJJ(int i, Aweme aweme) {
        if (1 == i) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null || C2093608Ic.LJ(awemeRawAd.getXiaomiSupplementalInfo())) {
                return false;
            }
            return true;
        }
        if (i != 2 && i != 3 && i != 8) {
            if (i != 64) {
                if (i != 70 && i != 87) {
                    return false;
                }
            } else {
                if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getMiniCardModel() == null || aweme.getAwemeRawAd().getMiniCardModel().getAvatarIconType() != 1) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    public static boolean LJJJJ(Context context, String str) {
        AutoDFIDManager.LIZJ(new C839020Wvk[]{new C839020Wvk(1207965953, new int[]{11098, 11097, 11094, 11093, 11092, 11091, 11090, 11089, 11088, 11087, 11086, 11085})});
        try {
            boolean zLJJJJI = LJJJJI(context, str, null);
            AutoDFIDManager.LIZIZ();
            return zLJJJJI;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AutoDFIDManager.LIZIZ();
            throw th;
        }
    }

    public static boolean LJJIJL(Context context, Aweme aweme, int i) {
        IAdSceneService iAdSceneService = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class);
        if (iAdSceneService != null) {
            iAdSceneService.LIZIZ();
            C1022290ci3.LIZLLL(context, aweme, i);
        }
        if (C1017070cZd.LJJJJLI(aweme)) {
            return AbstractC1025070cmX.LJIILLIIL(context, i, UriProtector.parse(aweme.getAwemeRawAd().getOpenUrl()).buildUpon().appendQueryParameter("enter_from", "ads_button").toString(), aweme);
        }
        return false;
    }

    public static boolean LJJJJI(Context context, String str, String str2) {
        AutoDFIDManager.LIZJ(new C839020Wvk[]{new C839020Wvk(1207965953, new int[]{11098, 11097, 11094, 11093, 11092, 11091, 11090, 11089, 11088, 11087, 11086, 11085})});
        try {
            boolean zLJFF = C1024900cmG.LJFF(context, str, str2);
            AutoDFIDManager.LIZIZ();
            return zLJFF;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AutoDFIDManager.LIZIZ();
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean LJJIJIIJIL(Context context, Aweme aweme, int i, InterfaceC1021920chS interfaceC1021920chS) {
        if (!AwemeExtKt.isAdTraffic(aweme) || !C1017070cZd.LJJLIIJ(aweme)) {
            return false;
        }
        String type = aweme.getAwemeRawAd().getType();
        if (TextUtils.isEmpty(type)) {
            return false;
        }
        boolean zIsECADVideo = ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).isECADVideo(aweme);
        if (zIsECADVideo && i == 3) {
            ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).reportAdVideoLog(aweme, false, i, ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).generateTrackId(aweme));
        }
        if (i == 1 || i == 2) {
            if (zIsECADVideo) {
                ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).reportAdVideoLog(aweme, false, i, ((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).generateTrackId(aweme));
            }
            if (C1017070cZd.LLLJL(aweme)) {
                Activity activityLIZ = C1388190mED.LIZ(context);
                if (activityLIZ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    c1389890mGx.LJIIIZ(2131857712);
                    c1389890mGx.LJIIJJI();
                }
                return true;
            }
        }
        if (TextUtils.equals(type, "paid_content")) {
            return LJJIJL(context, aweme, i);
        }
        if (!TextUtils.equals(type, "app") && !TextUtils.equals(type, "phone") && !C1017070cZd.LJJZZIII(aweme) && (i == 1 || i == 18 || i == 4 || i == 35 || i == 5 || i == 36 || i == 7 || i == 37 || i == 38)) {
            return AbstractC1025070cmX.LJI(context, aweme, i);
        }
        String type2 = aweme.getAwemeRawAd().getType();
        if ((!TextUtils.equals(type2, "app") && !TextUtils.equals(type2, "phone") && !C1017070cZd.LJJZZIII(aweme) && AbstractC1025070cmX.LJIIJJI(i)) || (C1017070cZd.LJJLL(aweme) && (i == 3 || i == 92 || i == 11 || i == 14 || i == 20 || i == 12 || i == 2 || i == 70 || i == 87 || i == 1 || i == 35 || i == 4 || i == 8 || i == 90 || i == 88 || i == 89 || i == 58))) {
            return AbstractC1025070cmX.LJI(context, aweme, i);
        }
        type.getClass();
        switch (type.hashCode()) {
            case 96801:
                if (type.equals("app")) {
                    LJJIJIL(context, aweme, i, interfaceC1021920chS);
                    return false;
                }
                return false;
            case 117588:
                if (type.equals("web")) {
                    return AbstractC1025070cmX.LJI(context, aweme, i);
                }
                return false;
            case 106642798:
                if (type.equals("phone")) {
                    return AbstractC1025070cmX.LJFF(context, aweme, i);
                }
                return false;
            case 954925063:
                if (type.equals("message")) {
                    return AbstractC1025070cmX.LJJIJ(i, context, aweme, true);
                }
                return false;
            case 957829685:
                if (type.equals("counsel")) {
                    return AbstractC1025070cmX.LJ(context, aweme, i);
                }
                return false;
            case 1893962841:
                if (type.equals("redpacket")) {
                    IAdSceneService iAdSceneService = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class);
                    if (iAdSceneService != null) {
                        iAdSceneService.LIZIZ();
                        C1022290ci3.LIZLLL(context, aweme, i);
                    }
                    if (AwemeExtKt.isAdTraffic(aweme) && !AbstractC1025070cmX.LJIILLIIL(context, 0, aweme.getAwemeRawAd().getRedOpenUrl(), aweme)) {
                        if (context != null && aweme.getAwemeRawAd() != null) {
                            String redMpUrl = aweme.getAwemeRawAd().getRedMpUrl();
                            if (C1030670cvZ.LIZ(redMpUrl)) {
                                C988700bps.LIZ.LIZIZ().openMiniApp(context, redMpUrl, new C1611490s2N());
                            }
                        }
                        AbstractC1025070cmX.LJIJ(9, context, aweme, aweme.getAwemeRawAd().getRedUrl(), null, C1025130cmd.LIZ(aweme.getAwemeRawAd()));
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                return false;
        }
    }

    public static void LJJIJIL(Context context, Aweme aweme, int i, InterfaceC1021920chS interfaceC1021920chS) {
        String strLJJIIZI = AbstractC1025070cmX.LJJIIZI(i);
        IAdSceneService iAdSceneService = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class);
        if (iAdSceneService != null) {
            iAdSceneService.LIZIZ();
            C1022290ci3.LIZLLL(context, aweme, i);
        }
        if ((aweme.getAwemeRawAd() != null && AbstractC1025070cmX.LJIILLIIL(context, i, aweme.getAwemeRawAd().getOpenUrl(), aweme)) || C1021870chN.LIZ(context, aweme)) {
            return;
        }
        if (C1017070cZd.LLJLILLLLZIIL(aweme)) {
            PreRenderWebViewBusiness.LJFF.get(Integer.valueOf(i));
        }
        ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi(ICommerceService.class);
        if (iCommerceService != null && iCommerceService.LIZIZ().LJIILIIL().LIZ(context, aweme, i)) {
            return;
        }
        if (LJJIL(i) && (C1024900cmG.LJII(context, i, null, aweme, false, false) || C1021940chU.LIZIZ(context, i, strLJJIIZI, aweme, false, LJJJ(i, aweme)))) {
            return;
        }
        ISamsungPageService iSamsungPageService = (ISamsungPageService) PluggableExtentionKt.pluggableSpi(ISamsungPageService.class);
        if (iSamsungPageService != null && ((LJJIL(i) || iSamsungPageService.LJI(i)) && iSamsungPageService.LIZ(context, aweme, i))) {
            return;
        }
        LJJJIL(context, aweme, strLJJIIZI, i);
        if (interfaceC1021920chS != null) {
            interfaceC1021920chS.LIZ();
        }
    }

    public static boolean LJJJI(Context context, final Aweme aweme, final int i, final InterfaceC1021920chS interfaceC1021920chS) {
        ICRouterAdapterDelegate iCRouterAdapterDelegate;
        boolean zLJIILJJIL;
        if (context == null || aweme == null) {
            return false;
        }
        final Context contextLIZ = C1388190mED.LIZ(context);
        if (contextLIZ == null) {
            contextLIZ = context;
        }
        String strLJJIIZI = AbstractC1025070cmX.LJJIIZI(i);
        IEcUgVSAService iEcUgVSAService = (IEcUgVSAService) PluggableExtentionKt.pluggableSpi(IEcUgVSAService.class);
        if (iEcUgVSAService != null) {
            iEcUgVSAService.LJIIJ(contextLIZ, aweme, i);
        }
        if (i == 3 && (iCRouterAdapterDelegate = (ICRouterAdapterDelegate) PluggableExtentionKt.pluggableSpi(ICRouterAdapterDelegate.class)) != null && iCRouterAdapterDelegate.LJIJJLI(i, aweme.getAwemeRawAd(), strLJJIIZI)) {
            IShopifySkuCheckoutService iShopifySkuCheckoutService = (IShopifySkuCheckoutService) PluggableExtentionKt.pluggableSpi(IShopifySkuCheckoutService.class);
            IAdLandingPagePopUpService iAdLandingPagePopUpService = (IAdLandingPagePopUpService) PluggableExtentionKt.pluggableSpi(IAdLandingPagePopUpService.class);
            Activity activityLIZ = C1388190mED.LIZ(contextLIZ);
            if (iShopifySkuCheckoutService != null && activityLIZ != null && aweme.getAwemeRawAd() != null && aweme.getAwemeRawAd().getQuickActionModel() != null) {
                String shopifyPid = aweme.getAwemeRawAd().getQuickActionModel().getShopifyPid();
                String webUrl = aweme.getAwemeRawAd().getWebUrl();
                if (aweme.getAwemeRawAd().getQuickActionModel().getQuickActionType().intValue() == 1) {
                    zLJIILJJIL = iShopifySkuCheckoutService.LIZJ(activityLIZ, aweme, webUrl, shopifyPid, strLJJIIZI);
                } else if (iAdLandingPagePopUpService != null && aweme.getAwemeRawAd().getQuickActionModel().getQuickActionType().intValue() == 3) {
                    C1026310coX c1026310coXLJIIIZ = iAdLandingPagePopUpService.LJIIIZ(aweme, aweme.getAwemeRawAd());
                    if ((activityLIZ instanceof C19EG) && c1026310coXLJIIIZ != null) {
                        zLJIILJJIL = iAdLandingPagePopUpService.LJIILJJIL((C19EG) activityLIZ, c1026310coXLJIIIZ, aweme.getAwemeRawAd().getQuickActionModel(), aweme, 3, strLJJIIZI);
                    }
                }
                if (zLJIILJJIL) {
                    return true;
                }
            }
        }
        if (i == 85) {
            IAnoleProductTilesService iAnoleProductTilesServiceLIZJ = AnoleProductTilesServiceImpl.LIZJ();
            if (ServiceManager.get().getService(IAdPhotoModeService.class) == null || iAnoleProductTilesServiceLIZJ == null) {
                return false;
            }
            int iLIZ = iAnoleProductTilesServiceLIZJ.LIZ();
            if (!C1017070cZd.LLJJIII(iLIZ, aweme)) {
                C1019030ccn.LJJIII(contextLIZ, aweme, null, "tiles");
                return LJJIJLIJ(contextLIZ, aweme, i, iLIZ, null);
            }
        } else if (i == 2 && C1017070cZd.LJLLLL(aweme)) {
            IAdPhotoModeService iAdPhotoModeService = (IAdPhotoModeService) ServiceManager.get().getService(IAdPhotoModeService.class);
            if (iAdPhotoModeService == null) {
                return false;
            }
            int iLJJIJIIJIL = iAdPhotoModeService.LJJIJIIJIL();
            if (!C1017070cZd.LLJJIII(iLJJIJIIJIL, aweme)) {
                C1019030ccn.LJJIII(contextLIZ, aweme, null, "button");
                return LJJIJLIJ(contextLIZ, aweme, i, iLJJIJIIJIL, null);
            }
        }
        if (((IAdPhotoModeService) ServiceManager.get().getService(IAdPhotoModeService.class)).LJII(aweme)) {
            ((IAdSceneService) ServiceManager.get().getService(IAdSceneService.class)).LIZIZ();
            C1022290ci3.LIZLLL(contextLIZ, aweme, i);
            LJJIJLIJ(contextLIZ, aweme, i, ((IAdPhotoModeService) ServiceManager.get().getService(IAdPhotoModeService.class)).LJJIJIIJIL(), null);
            return true;
        }
        if (C1021930chT.LIZ(contextLIZ, aweme, i, new InterfaceC1022210chv() { // from class: X.0chP
            @Override // X.InterfaceC1022210chv
            public final void LIZ() {
                C1021860chM.LJJIJIIJIL(contextLIZ, aweme, i, interfaceC1021920chS);
            }
        })) {
            return true;
        }
        ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LJIIIZ().isEnabled();
        if (!C1017070cZd.LLD(aweme) && !C1010120cOQ.LJJIIZ(aweme) && !C1017070cZd.LIZLLL(aweme) && !C1017070cZd.LJIIIIZZ(aweme)) {
            return LJJIJIIJIL(contextLIZ, aweme, i, interfaceC1021920chS);
        }
        C1019110ccv.LIZIZ.LJIIIZ(contextLIZ, aweme, i, null, true);
        return false;
    }

    public static boolean LJJJIL(Context context, Aweme aweme, String str, int i) {
        AutoDFIDManager.LIZJ(new C839020Wvk[]{new C839020Wvk(1207965953, new int[]{11098, 11097, 11094, 11093, 11092, 11091, 11090, 11089, 11088, 11087, 11086, 11085})});
        if (aweme != null) {
            try {
                if (aweme.getAwemeRawAd() != null) {
                    if (C1017070cZd.LLJLLIL(aweme)) {
                        Activity activityLIZ = C1388190mED.LIZ(context);
                        if (activityLIZ != null) {
                            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                            c1389890mGx.LJIIIZ(2131824738);
                            c1389890mGx.LJIIJJI();
                        }
                        AutoDFIDManager.LIZIZ();
                        return true;
                    }
                    String packageName = aweme.getAwemeRawAd().getPackageName();
                    String clickId = aweme.getAwemeRawAd().getClickId();
                    C1021880chO.LIZ(aweme.getAwemeRawAd(), str, packageName, clickId);
                    boolean zLJJJJI = LJJJJI(context, packageName, clickId);
                    if (zLJJJJI) {
                        C1021880chO.LIZIZ(aweme.getAwemeRawAd(), str, packageName, clickId);
                        C1024820cm8 c1024820cm8 = new C1024820cm8(aweme);
                        String strLIZIZ = C1026350cob.LIZIZ(i);
                        String strLIZ = C1026350cob.LIZ(i);
                        C1021900chQ.LIZ.getClass();
                        c1024820cm8.logAd(C1023500ck0.LIZJ(strLIZIZ, "open_store", strLIZ, new InterfaceC1023650ckF[0]));
                    }
                    AutoDFIDManager.LIZIZ();
                    return zLJJJJI;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                AutoDFIDManager.LIZIZ();
                throw th;
            }
        }
        AutoDFIDManager.LIZIZ();
        return false;
    }

    public static boolean LJJIJLIJ(Context context, Aweme aweme, int i, int i2, C1264004x4 c1264004x4) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleCarouselMultiJumpByActiveIndex: activeIndex is ");
        sbLIZ.append(i2);
        C1022620cia.LIZ("CarouselMultiJump", C2188811AlT.LIZIZ(sbLIZ));
        IAdPhotoModeService iAdPhotoModeService = (IAdPhotoModeService) ServiceManager.get().getService(IAdPhotoModeService.class);
        if (!iAdPhotoModeService.LJIIIIZZ(context, aweme, i2)) {
            if ((!C1017070cZd.LJJLJLI(aweme) || !LJJJIL(context, aweme, "", i)) && !iAdPhotoModeService.LJJIFFI(i2, aweme, context, Integer.valueOf(i), c1264004x4)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
