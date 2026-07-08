package X;

import Y.ACallableS422S0100000_16;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pumbaa.utility.dfid.AutoDFIDManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdShoppingService;
import com.ss.android.ugc.aweme.ad.ucp.IUcpService;
import com.ss.android.ugc.aweme.autofill.IAdAutofillService;
import com.ss.android.ugc.aweme.boc.IBOCFrequencyControlUtils;
import com.ss.android.ugc.aweme.commercialize.depend.AdRouterHandlerDependImpl;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.commercialize.service.IFeedVideoShrinkService;
import com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.minis.api.IMinisApiService;
import com.ss.android.ugc.aweme.minis.api.MinisRawAdInfo;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cmX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1025070cmX {
    public static final String[] LIZ = {"webcast_room"};

    public static String LIZIZ(int i) {
        if (i == 35 || i == 36 || i == 62 || i == 63 || i == 70) {
            return "click_ad_button";
        }
        if (i == 92) {
            return "click_ad_mask";
        }
        switch (i) {
            case 1:
                return "click_ad_text";
            case 2:
            case 4:
            case 5:
            case 6:
                return "click_ad_button";
            case 3:
                return "click_ad_mask";
            default:
                switch (i) {
                    case BdTuring.TYPE_EMAIL /* 11 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    case 14:
                    case 15:
                        return "click_ad_mask";
                    default:
                        switch (i) {
                            case 19:
                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            case 21:
                                return "click_ad_mask";
                            default:
                                switch (i) {
                                    case 87:
                                        return "click_ad_card";
                                    case 88:
                                    case 89:
                                    case 90:
                                        return "click_ad_button";
                                    default:
                                        return "";
                                }
                        }
                }
        }
    }

    public static String LJII(int i) {
        if (i == 50) {
            return "homepage_ad";
        }
        if (i == 92) {
            return "background_ad";
        }
        if (i == 62 || i == 63) {
            return "comment_first_ad";
        }
        switch (i) {
            case 3:
                return "background_ad";
            case 4:
                return "comment_first_ad";
            case 5:
            case 6:
                return "comment_end_ad";
            case 7:
            case 8:
                return "homepage_ad";
            default:
                switch (i) {
                    case BdTuring.TYPE_EMAIL /* 11 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    case 14:
                    case 15:
                        return "background_ad";
                    default:
                        switch (i) {
                            case 19:
                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            case 21:
                                return "background_ad";
                            default:
                                switch (i) {
                                    case 35:
                                        return "comment_first_ad";
                                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                                        return "comment_end_ad";
                                    case 37:
                                        return "homepage_ad";
                                    default:
                                        switch (i) {
                                            case 53:
                                            case 55:
                                            case 56:
                                            case 57:
                                                return "result_ad";
                                            case 54:
                                                return "result_ad_bg";
                                            default:
                                                return "draw_ad";
                                        }
                                }
                        }
                }
        }
    }

    public static boolean LJIIJ(int i) {
        return i == 7 || i == 8 || i == 37 || i == 50 || i == 73 || i == 79;
    }

    public static boolean LJIIJJI(int i) {
        return i == 11 || i == 14 || i == 12 || i == 92 || i == 13 || i == 15 || i == 20 || i == 19 || i == 21;
    }

    public static String LJJIIZI(int i) {
        if (i == 1) {
            return "title";
        }
        if (i == 2 || i == 3) {
            return "button";
        }
        if (i == 37) {
            return "title";
        }
        if (i == 43 || i == 50) {
            return "photo";
        }
        if (i == 58) {
            return "anchor";
        }
        if (i == 64) {
            return "photo";
        }
        if (i == 70 || i == 73) {
            return "button";
        }
        if (i == 88) {
            return "card";
        }
        if (i == 92) {
            return "endlayer_screenshot";
        }
        switch (i) {
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "photo";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "title";
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return "hot_region";
            case 14:
                return "name";
            default:
                switch (i) {
                    case 19:
                        return "image";
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        return "title";
                    case 21:
                        return "hot_region";
                    default:
                        switch (i) {
                            case 39:
                                return "name";
                            case 40:
                                return "slide";
                            case 41:
                                return "live_component";
                            default:
                                return "";
                        }
                }
        }
    }

    public static String LJIIIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (!C1017070cZd.LLI(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("creativeId", awemeRawAd.getCreativeId());
            jSONObject.put("groupId", awemeRawAd.getGroupId());
            jSONObject.put("adId", awemeRawAd.getAdId());
            jSONObject.put("logExtra", awemeRawAd.getLogExtra());
            if (awemeRawAd.getAutofillModel() != null) {
                jSONObject.put("enableAutofill", ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LIZIZ(awemeRawAd));
            }
            return C786410Ut5.J3(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static boolean LJIIL(Uri uri) {
        if (uri != null) {
            if (TextUtils.equals("http", uri.getScheme()) || TextUtils.equals("https", uri.getScheme())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJIILIIL(String str) {
        if (str == null) {
            return false;
        }
        try {
            Uri uri = UriProtector.parse(str);
            if (uri == null) {
                return false;
            }
            for (String str2 : LIZ) {
                if (TextUtils.equals(str2, uri.getHost())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static boolean LJIL(C1025090cmZ c1025090cmZ) {
        AwemeRawAd awemeRawAd;
        String webUrl;
        long jLongValue;
        long jLongValue2;
        String nativeSiteAdInfo;
        List<String> list;
        AwemeRawAd awemeRawAd2;
        String str;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Boolean useOrdinaryWeb_;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        if (c1025090cmZ.LIZ != null && c1025090cmZ.LIZIZ != null) {
            c1025090cmZ.LJIIIIZZ = C1022030chd.LJII(c1025090cmZ.LJII);
            int i = c1025090cmZ.LIZLLL;
            if ((i == 7 || i == 8) && LJJI(c1025090cmZ, false)) {
                return true;
            }
            IFeedVideoShrinkService iFeedVideoShrinkService = (IFeedVideoShrinkService) ServiceManager.get().getService(IFeedVideoShrinkService.class);
            if (C1010120cOQ.LIZIZ(c1025090cmZ.LIZLLL, c1025090cmZ.LIZIZ) && iFeedVideoShrinkService != null && LJJ(c1025090cmZ)) {
                return true;
            }
            if (C1017180cZo.LJJIIZ(c1025090cmZ.LIZIZ, false) && iFeedVideoShrinkService != null && iFeedVideoShrinkService.LLJZ(c1025090cmZ.LIZLLL) && LJJ(c1025090cmZ)) {
                return true;
            }
            int i2 = c1025090cmZ.LIZLLL;
            String nativeSiteCustomData = "";
            if ((i2 == 89 || i2 == 90) && C1017180cZo.LJIIZILJ(c1025090cmZ.LIZIZ)) {
                Context context = c1025090cmZ.LIZ;
                Aweme aweme = c1025090cmZ.LJIIIIZZ;
                if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                    NativeSiteConfig nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
                    if (C1017070cZd.LJLILLLLZI(aweme) && nativeSiteConfig != null) {
                        webUrl = nativeSiteConfig.lynxScheme;
                    } else {
                        webUrl = awemeRawAd.getWebUrl();
                    }
                    if (!TextUtils.isEmpty(webUrl)) {
                        C1027580cqa c1027580cqa = new C1027580cqa();
                        c1027580cqa.LJJJIL(webUrl);
                        c1027580cqa.LJ(awemeRawAd);
                        c1027580cqa.LIZLLL(aweme.getAid());
                        long jLongValue3 = 0;
                        if (awemeRawAd.getAdId() != null) {
                            jLongValue = awemeRawAd.getAdId().longValue();
                        } else {
                            jLongValue = 0;
                        }
                        c1027580cqa.LIZ(jLongValue);
                        if (awemeRawAd.getCreativeId() != null) {
                            jLongValue2 = awemeRawAd.getCreativeId().longValue();
                        } else {
                            jLongValue2 = 0;
                        }
                        c1027580cqa.LJI(jLongValue2);
                        c1027580cqa.LJIJJ(awemeRawAd.getLogExtra());
                        if (awemeRawAd.getGroupId() != null) {
                            jLongValue3 = awemeRawAd.getGroupId().longValue();
                        }
                        c1027580cqa.LJIILIIL(jLongValue3);
                        c1027580cqa.LJJIL(1);
                        c1027580cqa.LJJII(true);
                        c1027580cqa.LIZ.LIZIZ.LJJJ = true;
                        c1027580cqa.LJIJ(awemeRawAd.getWebviewType());
                        c1027580cqa.LJIILLIIL(1);
                        c1027580cqa.LIZ.LIZIZ.LJJIFFI = 1;
                        c1027580cqa.LJIILJJIL(false);
                        c1027580cqa.LJJJ(awemeRawAd.getWebTitle());
                        if (awemeRawAd.getNativeSiteAdInfo() == null) {
                            nativeSiteAdInfo = "";
                        } else {
                            nativeSiteAdInfo = awemeRawAd.getNativeSiteAdInfo();
                        }
                        c1027580cqa.LJJ(nativeSiteAdInfo);
                        if (awemeRawAd.getNativeSiteCustomData() != null) {
                            nativeSiteCustomData = awemeRawAd.getNativeSiteCustomData();
                        }
                        c1027580cqa.LJJIFFI(nativeSiteCustomData);
                        if (nativeSiteConfig != null && (list = nativeSiteConfig.geckoChannel) != null && !list.isEmpty()) {
                            c1027580cqa.LJIJJLI((String) ListProtector.get(list, 0));
                        }
                        C1027410cqJ.LIZJ(context, c1027580cqa.LIZ).LIZ();
                        return true;
                    }
                }
            }
            Context context2 = c1025090cmZ.LIZ;
            if (context2 != null && (awemeRawAd2 = c1025090cmZ.LIZIZ) != null && (context2 instanceof Activity)) {
                String webUrl2 = c1025090cmZ.LJFF;
                if (awemeRawAd2.getWebviewType() == 1) {
                    C1022030chd.LIZ.getClass();
                    if (webUrl2 != null || (webUrl2 = awemeRawAd2.getWebUrl()) != null) {
                        nativeSiteCustomData = webUrl2;
                    }
                    Uri uri = UriProtector.parse(nativeSiteCustomData);
                    try {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "immersive_mode");
                        useOrdinaryWeb_ = awemeRawAd2.getUseOrdinaryWeb_();
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "topbar_type");
                    } catch (UnsupportedOperationException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                    }
                    if (!TextUtils.equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "1")) {
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null || TextUtils.equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, CardStruct.IStatusCode.DEFAULT)) {
                            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                                if (!TextUtils.equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "1")) {
                                }
                            } else if (!useOrdinaryWeb_.booleanValue()) {
                                return false;
                            }
                        }
                        if (C1017070cZd.LJJLIIIJL(c1025090cmZ.LJIIIIZZ)) {
                            IFeedAdService iFeedAdService = (IFeedAdService) ServiceManager.get().getService(IFeedAdService.class);
                            if (iFeedAdService != null && !iFeedAdService.LJJII(Integer.valueOf(c1025090cmZ.LIZLLL))) {
                                C1012040cRW c1012040cRWLIZIZ = C1012040cRW.LIZIZ();
                                int i3 = c1025090cmZ.LIZLLL;
                                c1012040cRWLIZIZ.LJIIIIZZ = i3;
                                Context context3 = c1025090cmZ.LIZ;
                                if (i3 == 58) {
                                    str = "click_ad_anchor";
                                } else {
                                    str = "click_ad_web";
                                }
                                C730040SkM.LIZIZ(context3, str);
                                return true;
                            }
                            C1440005kM.LIZ(new C996950c3B(c1025090cmZ.LIZIZ()));
                            C1440005kM.LIZ(new C586540MzU(1));
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJJ(X.C1025090cmZ r23) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1025070cmX.LJJ(X.0cmZ):boolean");
    }

    public static void LJJIII(InterfaceC1027210cpz interfaceC1027210cpz) {
        C15O7.LJIIIIZZ(Mp4ScreenVideoLoadTimeout.CONTROL).LIZLLL(new C1077460e92(interfaceC1027210cpz, 1));
    }

    public static void LJJIIJ(InterfaceC1027210cpz interfaceC1027210cpz) {
        C15O7.LJIIIIZZ(((long) ((Number) AnonymousClass0757.LIZ.getValue()).intValue()) * 1000).LIZLLL(new C1077460e92(interfaceC1027210cpz, 2));
    }

    public static void LIZ(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMrXXxnCTOMMERSiOm6R09cbblDwHo", null));
    }

    public static void LIZLLL(Context context, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        boolean z;
        boolean z2;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            if (awemeRawAd.getSplashInfo().isEnableSplashOpen()) {
                if (!LJIIZILJ(context, aweme)) {
                    IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
                    if (iPluginService == null || !iPluginService.checkPluginInstalled("com.ss.android.ugc.aweme.miniapp") || !C1021870chN.LIZ(context, aweme)) {
                        if (aweme == null || (AwemeExtKt.isAdTraffic(aweme) && C1025130cmd.LIZ(aweme.getAwemeRawAd()))) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C1028050crL.LIZJ(context, aweme, null, null, z2, 7, Boolean.TRUE, 61);
                        return;
                    }
                    return;
                }
                return;
            }
            if (aweme == null || (AwemeExtKt.isAdTraffic(aweme) && C1025130cmd.LIZ(aweme.getAwemeRawAd()))) {
                z = true;
            } else {
                z = false;
            }
            C1028050crL.LIZJ(context, aweme, null, null, z, 7, Boolean.TRUE, 61);
        }
    }

    public static boolean LJIIZILJ(Context context, Aweme aweme) {
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme)) {
            return false;
        }
        return LJIILLIIL(context, 0, aweme.getAwemeRawAd().getOpenUrl(), aweme);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJJI(X.C1025090cmZ r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1025070cmX.LJJI(X.0cmZ, boolean):boolean");
    }

    public static void LJJIIJZLJL(int i, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (!AwemeExtKt.isAdTraffic(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return;
        }
        Uri uri = UriProtector.parse(awemeRawAd.getOpenUrl());
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(host);
            sbLIZ.append(path);
            if (TextUtils.equals(C2188811AlT.LIZIZ(sbLIZ), "mix/detail")) {
                try {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "mix_id");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                }
                IFeedAdService iFeedAdService = (IFeedAdService) ServiceManager.get().getService(IFeedAdService.class);
                if (iFeedAdService != null && !TextUtils.isEmpty(iFeedAdService.getEnterFrom())) {
                    if (i != 3 && i != 11 && i != 14 && i != 12) {
                        if (i == 2 || i == 70 || i == 68 || i == 1 || i == 0) {
                            iFeedAdService.LJJIL(aweme, C1000770c9L.LIZ, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                            return;
                        }
                        return;
                    }
                    iFeedAdService.LJJIL(aweme, C1000770c9L.LIZIZ, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                }
            }
        }
    }

    public static boolean LJJIIZ(Context context, Intent intent) {
        if (context != null && intent != null) {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                LIZ(context, intent);
                return true;
            } catch (ActivityNotFoundException | SecurityException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public static void LIZJ(C1022820ciu c1022820ciu, Aweme aweme, int i) {
        Integer num;
        String str = c1022820ciu.LIZ;
        if (str != null && str.startsWith("result")) {
            String str2 = null;
            if (AwemeExtKt.isSearchPreciseAd(aweme)) {
                num = 1;
            } else {
                num = null;
            }
            c1022820ciu.LIZIZ(num, "precise_ads");
            if (i == 53) {
                str2 = "button";
            } else if (i == 54) {
                str2 = "bg_more_button";
            }
            c1022820ciu.LIZJ(str2, "refer");
        }
    }

    public static boolean LJ(Context context, Aweme aweme, int i) {
        if (!AwemeExtKt.isAdTraffic(aweme)) {
            return false;
        }
        IAdSceneService iAdSceneService = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class);
        if (iAdSceneService != null) {
            iAdSceneService.LIZIZ();
            C1022290ci3.LIZLLL(context, aweme, i);
        }
        if (!LJIJ(i, context, aweme, aweme.getAwemeRawAd().getConsultUrl(), aweme.getAwemeRawAd().getWebTitle(), true)) {
            return false;
        }
        return true;
    }

    public static boolean LJFF(Context context, Aweme aweme, int i) {
        String str;
        if (!C1017070cZd.LJJZZI(aweme)) {
            return false;
        }
        IAdSceneService iAdSceneService = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class);
        if (iAdSceneService != null) {
            iAdSceneService.LIZIZ();
            C1022290ci3.LIZLLL(context, aweme, i);
        }
        IFeedAdService iFeedAdService = (IFeedAdService) ServiceManager.get().getService(IFeedAdService.class);
        if (iFeedAdService == null) {
            return false;
        }
        if (!LJIIJJI(i) && i != 3) {
            if (LJIIJ(i)) {
                str = "homepage_ad";
            } else {
                str = "draw_ad";
            }
        } else {
            str = "background_ad";
        }
        TuxActionSheet tuxActionSheetLJIL = iFeedAdService.LJIL(context, aweme, str, null);
        if (tuxActionSheetLJIL == null) {
            return false;
        }
        Activity activityLJFF = C2214201BlK.LJFF();
        if (!(activityLJFF instanceof C19EG)) {
            return false;
        }
        C1440005kM.LIZ(new C1000210c8R(false));
        tuxActionSheetLJIL.show(((C19EG) activityLJFF).getSupportFragmentManager(), (String) null);
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(str, "othershow", aweme.getAwemeRawAd());
        c1022820ciuLIZLLL.LIZJ("call_banner", "refer");
        c1022820ciuLIZLLL.LJII();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02bb  */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r7v4, types: [X.09Gk] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJI(final android.content.Context r14, final com.ss.android.ugc.aweme.feed.model.Aweme r15, int r16) {
        /*
            Method dump skipped, instruction units count: 837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1025070cmX.LJI(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, int):boolean");
    }

    public static EnterChatParams LJIIIIZZ(Context context, Aweme aweme, int i) {
        String str;
        String str2;
        String string;
        String aid;
        EnterChatParams enterChatParams = new EnterChatParams(context, IMUser.fromUser(aweme.getAuthor()));
        if (C1017070cZd.LJJZZIII(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            String creativeIdStr = "";
            if (awemeRawAd != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (awemeRawAd.getAdId() == null) {
                        string = "";
                    } else {
                        string = awemeRawAd.getAdId().toString();
                    }
                    if (aweme.getAid() == null) {
                        aid = "";
                    } else {
                        aid = aweme.getAid();
                    }
                    jSONObject.put("ad_id", string);
                    jSONObject.put("item_id", aid);
                    jSONObject.put("creative_id", awemeRawAd.getCreativeId());
                    jSONObject.put("tt_clid", awemeRawAd.getOnsiteClickId());
                    jSONObject.put("log_extra", awemeRawAd.getLogExtra());
                    jSONObject.put("track_params", LJIIIZ(aweme));
                    enterChatParams.setBizInfoExtra(C786410Ut5.J3(jSONObject));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (LJIIJ(i)) {
                str = "others_homepage";
            } else {
                str = "homepage_hot";
            }
            enterChatParams.setEnterFromForMob(str);
            if (i != 7 && i != 8) {
                if (i != 73) {
                    if (i != 79) {
                        str2 = "button_on_ad";
                    } else {
                        str2 = "ads_auto_open";
                    }
                } else {
                    str2 = "button";
                }
            } else {
                str2 = "button_at_profile_bottom";
            }
            enterChatParams.setEnterMethodForMob(str2);
            if (C1017070cZd.LLI(aweme)) {
                enterChatParams.setEnterFrom(8001);
                enterChatParams.setEntranceType(2);
                enterChatParams.setTrafficType("ads_traffic");
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if (awemeRawAd != null) {
                        creativeIdStr = awemeRawAd.getCreativeIdStr();
                    }
                    jSONObject2.put("entity_id", creativeIdStr);
                    jSONObject2.put("entity_type", "ad");
                    enterChatParams.setExtrasInfoMobParams(C786410Ut5.J3(jSONObject2));
                    return enterChatParams;
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return enterChatParams;
                }
            }
        } else {
            enterChatParams.setEnterFrom(7001);
            enterChatParams.setEnterFromForMob(String.valueOf(7001));
        }
        return enterChatParams;
    }

    public static boolean LJIILJJIL(Context context, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (C1030670cvZ.LIZ(str)) {
            C988700bps.LIZ.LIZIZ().openMiniApp(context, str, new C1611490s2N());
            return true;
        }
        if (str.contains("__back_url__")) {
            str = str.replace("__back_url__", Uri.encode(InterfaceC1029360ctS.LIZ));
        }
        Uri uri = UriProtector.parse(str);
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme)) {
            return false;
        }
        if (str.contains("aweme/detaillist")) {
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!C036E.LIZ.LIZIZ()) {
                Activity activityLIZ = C1388190mED.LIZ(context);
                if (activityLIZ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    c1389890mGx.LJIIIZ(2131837962);
                    c1389890mGx.LJIIJJI();
                }
                return false;
            }
        }
        if (C1022030chd.LJIJ(scheme)) {
            C730040SkM.LIZJ(str);
            C1041940dDk.LIZJ(context, str, null, false);
            return true;
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("aweme://")) {
            Bundle bundle = new Bundle();
            C2429209fW.LIZ().appendDataFlowId(bundle, "402657282");
            C19724912Fj.LIZLLL().LJIIJ(bundle, str);
            return true;
        }
        if (z) {
            return false;
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("mailto:")) {
            Intent intent = new Intent("android.intent.action.SENDTO", uri);
            C2429209fW.LIZ().appendDataFlowId(intent, 1207964163);
            return LJJIIZ(context, intent);
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(uri);
        if (!C2162308dZ.LJ(context, intent2)) {
            return false;
        }
        intent2.putExtra("open_url", str);
        C2429209fW.LIZ().appendDataFlowId(intent2, 1207969295);
        if (!LJJIIZ(context, intent2)) {
            return false;
        }
        return true;
    }

    public static boolean LJIILL(Context context, String str, String str2) {
        return C1028050crL.LIZIZ(context, str, str2, false, null, true, null, 0);
    }

    public static boolean LJIJJLI(Context context, Aweme aweme, int i) {
        if (context != null && aweme != null && !C1022030chd.LJIJJ(context)) {
            UUID.randomUUID().toString();
            C1025090cmZ c1025090cmZ = new C1025090cmZ();
            c1025090cmZ.LIZ = context;
            c1025090cmZ.LIZIZ = aweme.getAwemeRawAd();
            c1025090cmZ.LIZLLL = i;
            c1025090cmZ.LIZ(aweme.getAid());
            return LJIL(c1025090cmZ);
        }
        return false;
    }

    public static void LJJIFFI(Context context, Aweme aweme, int i) {
        boolean z;
        boolean z2;
        if (i == 53) {
            if (aweme == null || (AwemeExtKt.isAdTraffic(aweme) && C1025130cmd.LIZ(aweme.getAwemeRawAd()))) {
                z2 = true;
            } else {
                z2 = false;
            }
            C1028050crL.LIZJ(context, aweme, null, null, z2, 5, Boolean.FALSE, Integer.valueOf(i));
            return;
        }
        if (i == 54) {
            if (aweme == null || (AwemeExtKt.isAdTraffic(aweme) && C1025130cmd.LIZ(aweme.getAwemeRawAd()))) {
                z = true;
            } else {
                z = false;
            }
            C1028050crL.LIZJ(context, aweme, null, null, z, 8, Boolean.FALSE, Integer.valueOf(i));
            return;
        }
        if ((i != 56 && i != 55) || aweme.getAwemeRawAd() == null) {
            return;
        }
        LJIILL(context, aweme.getAwemeRawAd().getWebUrl(), aweme.getAwemeRawAd().getWebTitle());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0155 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJJIJIIJI(android.content.Context r7, com.ss.android.ugc.aweme.feed.model.Aweme r8, int r9) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1025070cmX.LJJIJIIJI(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, int):boolean");
    }

    public static boolean LJIILLIIL(final Context context, final int i, String str, final Aweme aweme) {
        boolean z;
        boolean z2;
        String creativeIdStr;
        boolean z3;
        if (context == null || aweme == null || !AwemeExtKt.isAdTraffic(aweme) || TextUtils.isEmpty(str)) {
            return false;
        }
        Uri uri = UriProtector.parse(str);
        if (TextUtils.isEmpty(uri.getScheme())) {
            return false;
        }
        Uri uriBuild = uri.buildUpon().appendQueryParameter("source_aid", aweme.getAid()).build();
        String lowerCase = uriBuild.getScheme().toLowerCase();
        String string = uriBuild.toString();
        try {
            boolean zLJJ = C1010120cOQ.LJJ(aweme);
            if (i != 80 && i != 53 && i != 54) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean zEquals = TextUtils.equals("acshop", uriBuild.getHost());
            if (zLJJ && !z3 && zEquals) {
                C0DHT.LIZIZ = true;
                C0DHT.LIZJ = true;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (LJIILIIL(string) && aweme.getAwemeRawAd() != null) {
            uriBuild = uriBuild.buildUpon().appendQueryParameter("creative_id", aweme.getAwemeRawAd().getCreativeIdStr()).appendQueryParameter("log_extra", aweme.getAwemeRawAd().getLogExtra()).appendQueryParameter("ad_id", String.valueOf(aweme.getAwemeRawAd().getAdId())).appendQueryParameter("live.intent.extra.ENTER_AWEME_ID", aweme.getAid()).build();
            string = uriBuild.toString();
        }
        if (C1022030chd.LJIJ(lowerCase) && uriBuild.getPath().startsWith("/detail")) {
            uriBuild = uriBuild.buildUpon().appendQueryParameter("video_detail", "1").build();
            string = uriBuild.toString();
        }
        IEcUgVSAService iEcUgVSAService = (IEcUgVSAService) PluggableExtentionKt.pluggableSpi(IEcUgVSAService.class);
        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        MinisRawAdInfo minisRawAdInfo = null;
        if (iEcUgVSAService != null && iEcUgVSAService.LJFF(string) && iECommerceAnchorService != null) {
            string = iECommerceAnchorService.LJIJJLI(string, null);
        }
        if (aweme.getAwemeRawAd() != null && aweme.getAwemeRawAd().getUgenPdpUrl() != null) {
            string = aweme.getAwemeRawAd().getUgenPdpUrl();
            aweme.getAwemeRawAd().setUgenPdpUrl(null);
        }
        boolean zLJIJ = C1022030chd.LJIJ(lowerCase);
        if (zLJIJ) {
            LJJIIJZLJL(i, aweme);
        }
        if (string != null && a0.LJJIIZI(string, "enter_method=brand_mission_search", false)) {
            String strLIZ = C1026350cob.LIZ(i);
            if (aweme.getAwemeRawAd() != null) {
                creativeIdStr = aweme.getAwemeRawAd().getCreativeIdStr();
            } else {
                creativeIdStr = null;
            }
            C0P9G.LJ(C0PON.LIZ(strLIZ, creativeIdStr));
        } else {
            C0PON.LIZ = null;
        }
        if (zLJIJ) {
            C730040SkM.LIZJ(string);
            C1041940dDk.LIZJ(context, string, null, false);
            return true;
        }
        if (TextUtils.equals(lowerCase, "aweme") && ((IUcpService) PluggableExtentionKt.pluggableSpi(IUcpService.class)).LJIIIIZZ(uriBuild, aweme.getAwemeRawAd())) {
            String strLJJIIZI = LJJIIZI(i);
            String strLIZ2 = C1028590csD.LIZ(i, aweme, string);
            IFeedAdShoppingService iFeedAdShoppingService = (IFeedAdShoppingService) PluggableExtentionKt.pluggableSpi(IFeedAdShoppingService.class);
            if (iFeedAdShoppingService != null) {
                if (i == 87) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                strLIZ2 = iFeedAdShoppingService.LIZIZ(aweme, strLIZ2, null, z2);
            }
            if (i == 79) {
                if (C1017290cZz.LIZ() != null) {
                    strLJJIIZI = C1017290cZz.LIZ();
                }
            } else if (i == 8) {
                strLJJIIZI = "profile_banner";
            }
            SmartRouter.buildRoute(context, C010W.LIZ(strLIZ2, "enter_method", strLJJIIZI)).open();
            return true;
        }
        if (TextUtils.equals(lowerCase, "aweme") && ((IUcpService) PluggableExtentionKt.pluggableSpi(IUcpService.class)).LJII(uriBuild)) {
            ((IUcpService) PluggableExtentionKt.pluggableSpi(IUcpService.class)).LIZ(4, aweme.getAwemeRawAd());
        }
        if (TextUtils.equals(lowerCase, "aweme") && !((IUcpService) PluggableExtentionKt.pluggableSpi(IUcpService.class)).LJII(uriBuild)) {
            if (C1017070cZd.LLIIIJ(aweme) && string != null && string.startsWith("aweme://minis")) {
                if (aweme.getAwemeRawAd() != null) {
                    minisRawAdInfo = new MinisRawAdInfo(aweme.getAwemeRawAd().getCreativeId(), Integer.valueOf(aweme.getAwemeRawAd().getSystemOrigin()), aweme.getAwemeRawAd().getLogExtra());
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ads_");
                sbLIZ.append(LJJIIZI(i));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                IMinisApiService iMinisApiService = (IMinisApiService) ServiceManager.get().getService(IMinisApiService.class);
                if (aweme.getAwemeRawAd() != null) {
                    string = aweme.getAwemeRawAd().getOpenUrl();
                }
                SmartRouter.buildRoute(context, iMinisApiService.LJIILL(string, strLIZIZ, minisRawAdInfo)).open();
                return true;
            }
            String strLIZ3 = C1028590csD.LIZ(i, aweme, string);
            IFeedAdShoppingService iFeedAdShoppingService2 = (IFeedAdShoppingService) PluggableExtentionKt.pluggableSpi(IFeedAdShoppingService.class);
            if (iFeedAdShoppingService2 != null) {
                if (i == 87) {
                    z = true;
                } else {
                    z = false;
                }
                strLIZ3 = iFeedAdShoppingService2.LIZIZ(aweme, strLIZ3, null, z);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ad_");
            sbLIZ2.append(LJJIIZI(i));
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            if (C1017070cZd.LLILLIZIL(aweme) && strLIZ3 != null && strLIZ3.startsWith("aweme://paidcontent/innerfeed")) {
                strLIZ3 = C010W.LIZ(strLIZ3, "series_enter_entrance", strLIZIZ2);
            }
            if (TextUtils.equals("acshop", uriBuild.getHost())) {
                if (i == 79) {
                    if (C1017290cZz.LIZ() != null) {
                        strLIZIZ2 = C1017290cZz.LIZ();
                    }
                } else if (i == 8) {
                    strLIZIZ2 = "button";
                }
                strLIZ3 = C010W.LIZ(strLIZ3, "enter_method", strLIZIZ2);
                try {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriBuild, "click_from");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                    strLIZ3 = C010W.LIZ(strLIZ3, "click_from", String.valueOf(i));
                }
            }
            SmartRouter.buildRoute(context, strLIZ3).open();
            return true;
        }
        new C1024820cm8(aweme).LJJIJ(i, string, C1026350cob.LIZIZ(i), C1026350cob.LIZ(i), false);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uriBuild);
        if (!C2162308dZ.LJ(context, intent)) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "direct_open_app_failed", aweme.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZIZ(string, "app_url");
            c1022820ciuLIZLLL.LJII();
            return false;
        }
        if (string.contains("__back_url__")) {
            string = string.replace("__back_url__", Uri.encode(InterfaceC1029360ctS.LIZ));
            intent.setData(UriProtector.parse(string));
            C15O7.LIZJ(new ACallableS422S0100000_16(aweme, 3));
        }
        intent.putExtra("open_url", string);
        intent.addFlags(268435456);
        C2429209fW.LIZ().appendDataFlowId(intent, 1207964161);
        if (!LJJIIZ(context, intent)) {
            return false;
        }
        final String strLJII = LJII(i);
        if (C294500BgW.LIZ()) {
            C1034340d1U.LIZLLL.LIZ().LIZ(strLJII, new C1029220ctE(aweme.getAwemeRawAd(), CardStruct.IStatusCode.DEFAULT, null, null), Integer.valueOf(i), string, context);
        }
        C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL(strLJII, "open_url_app", aweme.getAwemeRawAd());
        LIZJ(c1022820ciuLIZLLL2, aweme, i);
        c1022820ciuLIZLLL2.LIZIZ(string, "app_url");
        c1022820ciuLIZLLL2.LJIIIIZZ();
        final String str2 = string;
        LJJIII(new InterfaceC1027210cpz() { // from class: X.0cmY
            @Override // X.InterfaceC1027210cpz
            public final void LIZ(boolean z4) {
                String str3;
                String str4 = strLJII;
                Aweme aweme2 = aweme;
                int i2 = i;
                String str5 = str2;
                Context context2 = context;
                if (z4) {
                    str3 = "deeplink_success";
                } else {
                    str3 = "deeplink_failed";
                }
                C1022820ciu c1022820ciuLIZLLL3 = C2184171Adz.LIZLLL(str4, str3, aweme2.getAwemeRawAd());
                AbstractC1025070cmX.LIZJ(c1022820ciuLIZLLL3, aweme2, i2);
                c1022820ciuLIZLLL3.LIZIZ(str5, "app_url");
                if (!z4) {
                    c1022820ciuLIZLLL3.LIZIZ(Integer.valueOf(C1025140cme.LIZLLL(context2, UriProtector.parse(str5)) ? 1 : 0), "fail_reason");
                }
                c1022820ciuLIZLLL3.LJIIIIZZ();
            }
        });
        LJJIIJ(new InterfaceC1027210cpz() { // from class: X.0cmb
            @Override // X.InterfaceC1027210cpz
            public final void LIZ(boolean z4) {
                String str3 = strLJII;
                Aweme aweme2 = aweme;
                if (z4) {
                    C2184171Adz.LIZLLL(str3, "deeplink_opened", aweme2.getAwemeRawAd()).LJII();
                }
            }
        });
        ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi(ICommerceService.class);
        if (iCommerceService != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            InterfaceC1017820caq interfaceC1017820caqLJIILIIL = iCommerceService.LIZIZ().LJIILIIL();
            if (awemeRawAd != null && interfaceC1017820caqLJIILIIL.LJIIIZ(awemeRawAd)) {
                interfaceC1017820caqLJIILIIL.LJIIIIZZ(awemeRawAd).LJIJJLI(0, null, 1003, Integer.valueOf(i));
                return true;
            }
            return true;
        }
        return true;
    }

    public static void LJIJJ(final Context context, final LinkData linkData, final Aweme aweme, final boolean z) {
        boolean zLJJIIZI;
        String downloadUrl;
        String packageName;
        String str;
        String str2;
        if (context != null && linkData != null) {
            if (LJIILIIL(linkData.openUrl) && aweme.getAwemeRawAd() != null) {
                linkData.openUrl = UriProtector.parse(linkData.openUrl).buildUpon().appendQueryParameter("creative_id", aweme.getAwemeRawAd().getCreativeIdStr()).appendQueryParameter("log_extra", aweme.getAwemeRawAd().getLogExtra()).build().toString();
            }
            if (aweme != null) {
                String str3 = linkData.creativeId;
                String str4 = linkData.logExtra;
                new Object() { // from class: X.0cmh
                }.getClass();
                long j = 0;
                try {
                    if (CastLongProtector.parseLong(str3) > 0) {
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                new Object() { // from class: X.0cmh
                }.getClass();
                String strLJJIFFI = linkData.openUrl;
                if (!TextUtils.isEmpty(strLJJIFFI) && C1030670cvZ.LIZ(strLJJIFFI)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLJJIFFI);
                    sbLIZ.append("&schema_from=ad_link");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    if (z) {
                        str2 = "&position=comment_page";
                    } else {
                        str2 = "&position=in_video_tag";
                    }
                    sbLIZ2.append(str2);
                    strLJJIFFI = C2188811AlT.LIZIZ(sbLIZ2);
                }
                if (strLJJIFFI != null) {
                    zLJJIIZI = a0.LJJIIZI(strLJJIFFI, "__back_url__", false);
                } else {
                    zLJJIIZI = false;
                }
                String appName = null;
                if (zLJJIIZI) {
                    if (linkData.feedShowType == 3) {
                        str = "comment_ad";
                    } else {
                        str = "draw_ad";
                    }
                    String string = UriProtector.parse(InterfaceC1029360ctS.LIZ).buildUpon().appendQueryParameter("tag", str).toString();
                    C1022030chd.LIZ.getClass();
                    if (strLJJIFFI != null && a0.LJJIIZI(strLJJIFFI, "__back_url__", false)) {
                        if (strLJJIFFI != null) {
                            strLJJIFFI = u.LJJIFFI(strLJJIFFI, "__back_url__", Uri.encode(string), false);
                        } else {
                            strLJJIFFI = null;
                        }
                    }
                    C15O7.LIZJ(new ACallableS422S0100000_16(aweme, 5));
                }
                if (LJIILJJIL(context, strLJJIFFI, false)) {
                    if (C294500BgW.LIZ()) {
                        C1034340d1U.LIZLLL.LIZ().LIZ("draw_ad", new C1029220ctE(aweme.getAwemeRawAd(), CardStruct.IStatusCode.DEFAULT, null, null), null, linkData.openUrl, context);
                    }
                    C1019030ccn.LJIJJLI("open_url_app", context, linkData, aweme, z);
                    LJJIII(new InterfaceC1027210cpz() { // from class: X.0cmc
                        @Override // X.InterfaceC1027210cpz
                        public final void LIZ(boolean z2) {
                            if (z2) {
                                C1019030ccn.LJIJJLI("deeplink_success", context, linkData, aweme, z);
                            } else {
                                C1019030ccn.LJIJJLI("deeplink_failed", context, linkData, aweme, z);
                            }
                        }
                    });
                    return;
                }
                if (C1030670cvZ.LIZ(linkData.mpUrl) && C988700bps.LIZ.LIZIZ().openMiniApp(context, linkData.mpUrl, new C1611490s2N())) {
                    return;
                }
                if (TextUtils.equals(linkData.type, "app")) {
                    C1019030ccn.LJIJJLI("open_url_app", context, linkData, aweme, z);
                    C1021860chM.LJJJJ(context, linkData.packageName);
                    return;
                }
                try {
                    j = CastLongProtector.parseLong(str3);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (aweme.getAwemeRawAd() != null) {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd != null) {
                        downloadUrl = awemeRawAd.getDownloadUrl();
                    } else {
                        downloadUrl = null;
                    }
                    AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                    if (awemeRawAd2 != null) {
                        packageName = awemeRawAd2.getPackageName();
                    } else {
                        packageName = null;
                    }
                    AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                    if (awemeRawAd3 != null) {
                        appName = awemeRawAd3.getAppName();
                    }
                } else if (linkData.feedShowType == 3) {
                    downloadUrl = linkData.downloadUrl;
                    packageName = linkData.packageName;
                    linkedHashMap.put("aweme_package_name", packageName);
                    linkedHashMap.put("bundle_app_ad_from", "6");
                } else {
                    downloadUrl = null;
                    packageName = null;
                }
                if (C1028050crL.LIZIZ(context, linkData.webUrl, linkData.webTitle, false, linkedHashMap, true, new C1028060crM(Long.valueOf(j), str4, downloadUrl, packageName, appName, linkData.type), 0)) {
                    C1019030ccn.LJIJJLI("open_url_h5", context, linkData, aweme, z);
                }
            }
        }
    }

    public static boolean LJJII(Context context, String str, String str2, Boolean bool) {
        AutoDFIDManager.LIZJ(new C839020Wvk[]{new C839020Wvk(1207969296, new int[]{11098, 11097, 11094, 11093, 11092, 11091, 11090, 11089, 11088, 11087, 11086, 11085})});
        try {
            if (context == null) {
                AutoDFIDManager.LIZIZ();
                return false;
            }
            if (TextUtils.isEmpty(str)) {
                AutoDFIDManager.LIZIZ();
                return false;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                if (bool.booleanValue()) {
                    try {
                        C2429209fW.LIZ().appendDataFlowId(intent, Integer.parseInt(str2));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C2429209fW.LIZ().appendDataFlowId(intent, 1207964162);
                    }
                } else {
                    C2429209fW.LIZ().appendDataFlowId(intent, 1207964162);
                }
                Intent intentCreateChooser = Intent.createChooser(intent, "");
                C2429209fW.LIZ().appendDataFlowId(intentCreateChooser, 1207969296);
                boolean zLJJIIZ = LJJIIZ(context, intentCreateChooser);
                if (zLJJIIZ) {
                    ((IBOCFrequencyControlUtils) PluggableExtentionKt.pluggableSpi(IBOCFrequencyControlUtils.class)).LIZLLL();
                }
                AutoDFIDManager.LIZIZ();
                return zLJJIIZ;
            }
            AutoDFIDManager.LIZIZ();
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AutoDFIDManager.LIZIZ();
            throw th;
        }
    }

    public static boolean LJJIJ(int i, Context context, Aweme aweme, boolean z) {
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && i == 73) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("homepage_ad", "message_click", aweme.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("button", "refer");
            c1022820ciuLIZLLL.LJII();
        }
        IAdRouterHandlerDepend iAdRouterHandlerDependLIZIZ = AdRouterHandlerDependImpl.LIZIZ();
        if (iAdRouterHandlerDependLIZIZ != null && iAdRouterHandlerDependLIZIZ.LJII(i, context, aweme, z)) {
            return true;
        }
        return false;
    }

    public static boolean LJIJI(Context context, Aweme aweme, String str, String str2, int i) {
        boolean z;
        if (aweme == null || (AwemeExtKt.isAdTraffic(aweme) && C1025130cmd.LIZ(aweme.getAwemeRawAd()))) {
            z = true;
        } else {
            z = false;
        }
        return LJIJ(i, context, aweme, str, str2, z);
    }

    public static boolean LJIJ(int i, Context context, Aweme aweme, String str, String str2, boolean z) {
        return C1028050crL.LIZJ(context, aweme, str, str2, z, 1, Boolean.FALSE, Integer.valueOf(i));
    }
}
