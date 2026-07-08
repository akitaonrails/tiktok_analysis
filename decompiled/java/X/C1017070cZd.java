package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.SplashAdConfig;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ICrossPlatformLegacyService;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.ucp.IUcpService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.cct.IOpenCCTUtils;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commerce.CommerceLabelInfo;
import com.ss.android.ugc.aweme.commerce.model.CommerceActivityStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdButtonStrategyModel;
import com.ss.android.ugc.aweme.commercialize.model.AdCardStrategyModel;
import com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct;
import com.ss.android.ugc.aweme.commercialize.model.AdDisclaimer;
import com.ss.android.ugc.aweme.commercialize.model.AdLynxEntryData;
import com.ss.android.ugc.aweme.commercialize.model.AdNativeProduct;
import com.ss.android.ugc.aweme.commercialize.model.AdPaidContent;
import com.ss.android.ugc.aweme.commercialize.model.AdProductTile;
import com.ss.android.ugc.aweme.commercialize.model.AdPromptInfoModel;
import com.ss.android.ugc.aweme.commercialize.model.AdQuestionnaire;
import com.ss.android.ugc.aweme.commercialize.model.AdStickerData;
import com.ss.android.ugc.aweme.commercialize.model.AdStyleActionModel;
import com.ss.android.ugc.aweme.commercialize.model.AdTagStruct;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.commercialize.model.AutoData;
import com.ss.android.ugc.aweme.commercialize.model.FollowButtonData;
import com.ss.android.ugc.aweme.commercialize.model.LikeEffectModel;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.commercialize.model.LogoSpotlightInfo;
import com.ss.android.ugc.aweme.commercialize.model.LogoSpotlightVideoModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselProductStruct;
import com.ss.android.ugc.aweme.commercialize.model.SimpleUriAndUrl;
import com.ss.android.ugc.aweme.commercialize.model.VideoPlaybackConfig;
import com.ss.android.ugc.aweme.commercialize.service.ISamsungPageService;
import com.ss.android.ugc.aweme.commercialize.topview.TopViewAwemeRawAd;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService;
import com.ss.android.ugc.aweme.feed.model.AdInteractionData;
import com.ss.android.ugc.aweme.feed.model.AdLive;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AutoPullUpConfig;
import com.ss.android.ugc.aweme.feed.model.AutoPullUpTriggerType;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.BottomBanner;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.DynamicVideo;
import com.ss.android.ugc.aweme.feed.model.FinalJumpTargetPageConfig;
import com.ss.android.ugc.aweme.feed.model.NativeAuthorInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.ad.AdAIGCLabel;
import com.ss.android.ugc.aweme.feed.model.ad.OverlayNativeConfig;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCheckoutAdModel;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonCtaButtonStyleModel;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonPrimeBadgeModel;
import com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad.AmazonProductDetailsModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0cZd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017070cZd {
    public static final boolean LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeTextLabelModel label;
        AwemeTextLabelModel label2;
        AwemeTextLabelModel label3;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.isRightStyle()) {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null && (label3 = awemeRawAd2.getLabel()) != null && label3.getCompliancePosition() == 0) {
                return true;
            }
            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
            if (awemeRawAd3 != null && (label2 = awemeRawAd3.getLabel()) != null && label2.getCompliancePosition() == 3) {
                return true;
            }
            AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
            if (awemeRawAd4 != null && (label = awemeRawAd4.getLabel()) != null && label.getCompliancePosition() == 5) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.isDirectMessageLandingPopup()) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        String openUrl;
        Uri uri;
        String scheme;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || !TextUtils.isEmpty(awemeRawAd.getAuthorUrl()) || (openUrl = awemeRawAd.getOpenUrl()) == null || (uri = UriProtector.parse(openUrl)) == null || (scheme = uri.getScheme()) == null) {
            return false;
        }
        IUcpService iUcpService = (IUcpService) PluggableExtentionKt.pluggableSpi$default(IUcpService.class, false, false, false, 14, null);
        if (iUcpService != null && !iUcpService.LJFF(uri, awemeRawAd)) {
            return false;
        }
        if (!C1022030chd.LJIJ(scheme) && !TextUtils.equals(scheme, "aweme") && !C1022030chd.LJJI(openUrl)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(Aweme aweme) {
        if (LLD(aweme) || LJJIJIIJIL(aweme) <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        String webUrl;
        if (!LJJLIIJ(aweme) || LLIIL(aweme)) {
            return false;
        }
        if ((aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (webUrl = awemeRawAd.getWebUrl()) == null || webUrl.length() <= 0) && !LLIL(aweme) && !LJJZZI(aweme) && !LJJZZI(aweme) && !LLJILJIL(aweme) && !LLIZ(aweme) && !LLILLIZIL(aweme)) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(Aweme aweme) {
        String openUrl;
        Uri uri;
        String scheme;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null || (openUrl = awemeRawAd.getOpenUrl()) == null || openUrl.length() <= 0 || (uri = UriProtector.parse(openUrl)) == null || (scheme = uri.getScheme()) == null || C1022030chd.LJIJ(scheme) || Intrinsics.LJFF(scheme, "aweme")) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoCarouselProductStruct> productList;
        String productId;
        PhotoCarouselInfoStruct photoCarouselInfo2;
        List<PhotoCarouselProductStruct> productList2;
        PhotoCarouselProductStruct photoCarouselProductStruct;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && AwemeExtKt.isPhotoMode(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null && (productList = photoCarouselInfo.getProductList()) != null && !productList.isEmpty()) {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null && (photoCarouselInfo2 = awemeRawAd2.getPhotoCarouselInfo()) != null && (productList2 = photoCarouselInfo2.getProductList()) != null && (photoCarouselProductStruct = (PhotoCarouselProductStruct) ListProtector.get(productList2, 0)) != null) {
                productId = photoCarouselProductStruct.getProductId();
            } else {
                productId = null;
            }
            if (!TextUtils.isEmpty(productId)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJII(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.isDisableLikeType()) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIIZZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdLive adLive;
        User redirectLiveAuthor;
        Long lValueOf;
        if (!LJJLIIJ(aweme) || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (adLive = awemeRawAd.getAdLive()) == null || (redirectLiveAuthor = adLive.getRedirectLiveAuthor()) == null || (lValueOf = Long.valueOf(redirectLiveAuthor.roomId)) == null || lValueOf.longValue() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIZ(Aweme aweme) {
        AwemeRawAd awemeRawAdLJJIJLIJ;
        NativeAuthorInfo nativeAuthorInfo;
        BottomBanner bottomBanner;
        if (!LJIIIIZZ(aweme) || (awemeRawAdLJJIJLIJ = LJJIJLIJ(aweme)) == null || (nativeAuthorInfo = awemeRawAdLJJIJLIJ.getNativeAuthorInfo()) == null || (bottomBanner = nativeAuthorInfo.bottomBanner) == null || !bottomBanner.enableRedirectLiveBanner) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (!LL(aweme) || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getFakeAuthor() == null) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIL(Aweme aweme) {
        if (LLILII(aweme) && LJJIJL(aweme) != null && C1010120cOQ.LJJIJ(aweme)) {
            return true;
        }
        return false;
    }

    public static final Integer LJIILIIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null) {
            if (AwemeExtKt.isPhotoMode(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.enableEnterPhotoFullPage()) {
                return 8;
            }
            return Integer.valueOf(AwemeBizExtKt.getAdDescMaxLines(aweme));
        }
        return null;
    }

    public static final AdStickerData LJIILLIIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            return awemeRawAd.getStickerData();
        }
        return null;
    }

    public static final String LJIIZILJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        String webUrl;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (webUrl = awemeRawAd.getWebUrl()) == null) {
            return "";
        }
        return webUrl;
    }

    public static final String LJIJ(Aweme aweme) {
        User author;
        String uid;
        if (aweme == null || (author = aweme.getAuthor()) == null || (uid = author.getUid()) == null) {
            return "";
        }
        return uid;
    }

    public static final int LJIJI(AwemeRawAd awemeRawAd) {
        NativeAuthorInfo nativeAuthorInfo;
        if (LLJZIJLIL(awemeRawAd) || awemeRawAd == null || (nativeAuthorInfo = awemeRawAd.getNativeAuthorInfo()) == null) {
            return 0;
        }
        return nativeAuthorInfo.autoPullStyle;
    }

    public static final AutoPullUpConfig LJIJJ(AwemeRawAd awemeRawAd) {
        AutoPullUpConfig autoPullUpConfig;
        int delay;
        NativeAuthorInfo nativeAuthorInfo;
        Float embeddedSheetInitialRatio = null;
        if (awemeRawAd != null && (nativeAuthorInfo = awemeRawAd.getNativeAuthorInfo()) != null) {
            autoPullUpConfig = nativeAuthorInfo.autoPullUpConfig;
        } else {
            autoPullUpConfig = null;
        }
        if (LLJZIJLIL(awemeRawAd)) {
            boolean enableDragDown = false;
            if (autoPullUpConfig != null) {
                delay = autoPullUpConfig.getDelay();
            } else {
                delay = 0;
            }
            if (autoPullUpConfig != null) {
                enableDragDown = autoPullUpConfig.getEnableDragDown();
            }
            Boolean bool = Boolean.FALSE;
            if (autoPullUpConfig != null) {
                embeddedSheetInitialRatio = autoPullUpConfig.getEmbeddedSheetInitialRatio();
            }
            return new AutoPullUpConfig(delay, 0, enableDragDown, 5, bool, embeddedSheetInitialRatio);
        }
        return autoPullUpConfig;
    }

    public static final TopViewAwemeRawAd LJIJJLI(InterfaceC1018210cbT interfaceC1018210cbT) {
        if (interfaceC1018210cbT != null && interfaceC1018210cbT.LLZZZIL()) {
            return interfaceC1018210cbT.LIZIZ();
        }
        return null;
    }

    public static final String LJIL(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        String bCHashtag;
        if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || (bCHashtag = commerceVideoAuthInfo.getBCHashtag()) == null) {
            return "";
        }
        return bCHashtag;
    }

    public static final String LJJ(Aweme aweme) {
        if (aweme != null && aweme.isCmtSwt()) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static final CardStruct LJJI(Aweme aweme) {
        CardStruct followCardInfo;
        if (aweme == null) {
            return null;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null || (followCardInfo = awemeRawAd.getLiveCardInfo()) == null) {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                followCardInfo = awemeRawAd2.getFollowCardInfo();
                if (followCardInfo == null) {
                    if (aweme == null) {
                        return null;
                    }
                }
            }
            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
            if (awemeRawAd3 == null) {
                return null;
            }
            return awemeRawAd3.getDefaultCardInfo();
        }
        return followCardInfo;
    }

    public static final String LJJIFFI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdLive adLive;
        String buttonText;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (adLive = awemeRawAd.getAdLive()) == null || (buttonText = adLive.getButtonText()) == null) {
            return "";
        }
        return buttonText;
    }

    public static final SimpleUriAndUrl LJJII(Aweme aweme) {
        AwemeRawAd awemeRawAdLJJIIJZLJL;
        AdStyleActionModel adStyleActionModel;
        LikeEffectModel likeEffectModel;
        if (aweme == null || (awemeRawAdLJJIIJZLJL = LJJIIJZLJL(aweme)) == null || (adStyleActionModel = awemeRawAdLJJIIJZLJL.getAdStyleActionModel()) == null || (likeEffectModel = adStyleActionModel.likeEffect) == null) {
            return null;
        }
        return likeEffectModel.effectImgUrl;
    }

    public static final SimpleUriAndUrl LJJIII(Aweme aweme) {
        AwemeRawAd awemeRawAdLJJIIJZLJL;
        AdStyleActionModel adStyleActionModel;
        LikeEffectModel likeEffectModel;
        if (aweme == null || (awemeRawAdLJJIIJZLJL = LJJIIJZLJL(aweme)) == null || (adStyleActionModel = awemeRawAdLJJIIJZLJL.getAdStyleActionModel()) == null || (likeEffectModel = adStyleActionModel.likeEffect) == null) {
            return null;
        }
        return likeEffectModel.likeIconUrl;
    }

    public static final int LJJIIJ(Aweme aweme) {
        if (!LJLLL(aweme)) {
            return 0;
        }
        if (LJZ(aweme)) {
            return 2;
        }
        if (!LJZL(aweme)) {
            return 0;
        }
        return 1;
    }

    public static final AwemeRawAd LJJIIJZLJL(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme)) {
            if (0 != 0) {
                if (aweme == null) {
                    return null;
                }
            } else {
                if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null) {
                    return null;
                }
                return commerceVideoAuthInfo.getStyleInfo();
            }
        }
        return aweme.getAwemeRawAd();
    }

    public static final String LJJIIZ(Aweme aweme) {
        AwemeSplashInfo awemeSplashInfoLJJJ;
        String splashButtonText;
        if (aweme == null || (awemeSplashInfoLJJJ = LJJJ(aweme)) == null || (splashButtonText = awemeSplashInfoLJJJ.getSplashButtonText()) == null) {
            return "";
        }
        return splashButtonText;
    }

    public static final CardStruct LJJIIZI(Aweme aweme) {
        CardStruct cardStructLJJI = LJJI(aweme);
        if (cardStructLJJI != null && cardStructLJJI.getCardType() == 14) {
            return cardStructLJJI;
        }
        return null;
    }

    public static final CardStruct LJJIJ(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        CardStruct cardStruct;
        if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || (cardStruct = commerceVideoAuthInfo.getCardStruct()) == null || cardStruct.getCardType() != 14) {
            return null;
        }
        return cardStruct;
    }

    public static final CardStruct LJJIJIIJI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Map<String, CardStruct> cardInfos;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (cardInfos = awemeRawAd.getCardInfos()) != null) {
            return cardInfos.get("5");
        }
        return null;
    }

    public static final long LJJIJIIJIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdLive adLive;
        Long originalRoomId;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (adLive = awemeRawAd.getAdLive()) != null && (originalRoomId = adLive.getOriginalRoomId()) != null) {
            return originalRoomId.longValue();
        }
        return 0L;
    }

    public static final AwemeRawAd LJJIJL(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null) {
            return null;
        }
        return commerceVideoAuthInfo.getPseudoAdData();
    }

    public static final AwemeRawAd LJJIJLIJ(Aweme aweme) {
        Aweme aweme2;
        if (aweme != null && AwemeExtKt.isPseudoAd(aweme)) {
            aweme2 = aweme;
        } else {
            aweme2 = null;
        }
        AwemeRawAd awemeRawAdLJJIJL = LJJIJL(aweme2);
        if (awemeRawAdLJJIJL == null) {
            if (aweme == null || !AwemeExtKt.isAdTraffic(aweme)) {
                return null;
            }
            return aweme.getAwemeRawAd();
        }
        return awemeRawAdLJJIJL;
    }

    public static final String LJJIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            return awemeRawAd.getOpenUrl();
        }
        return null;
    }

    public static final LogoSpotlightVideoModel LJJIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdStyleActionModel adStyleActionModel;
        LogoSpotlightInfo logoSpotlightInfo;
        if (!LLILZLL(aweme) || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (adStyleActionModel = awemeRawAd.getAdStyleActionModel()) == null || (logoSpotlightInfo = adStyleActionModel.logoSpotlightInfo) == null) {
            return null;
        }
        return logoSpotlightInfo.getSpotlightVideoModel();
    }

    public static final AwemeSplashInfo LJJJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            return awemeRawAd.getSplashInfo();
        }
        return null;
    }

    public static final AwemeSplashInfo LJJJI(InterfaceC1018210cbT interfaceC1018210cbT) {
        TopViewAwemeRawAd topViewAwemeRawAdLJIJJLI;
        if (interfaceC1018210cbT != null && (topViewAwemeRawAdLJIJJLI = LJIJJLI(interfaceC1018210cbT)) != null) {
            return topViewAwemeRawAdLJIJJLI.getSplashInfo();
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final int LJJJIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        String buttonTuxIcon;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (buttonTuxIcon = awemeRawAd.getButtonTuxIcon()) != null) {
            switch (buttonTuxIcon.hashCode()) {
                case -1516190086:
                    if (buttonTuxIcon.equals("IconMessenger")) {
                        return R.raw.icon_messenger;
                    }
                    break;
                case -673521619:
                    if (buttonTuxIcon.equals("IconLine")) {
                        return R.raw.icon_line;
                    }
                    break;
                case -673112285:
                    if (buttonTuxIcon.equals("IconZalo")) {
                        return R.raw.icon_zalo;
                    }
                    break;
                case -561654453:
                    if (buttonTuxIcon.equals("IconWhatsapp")) {
                        return R.raw.icon_whatsapp;
                    }
                    break;
            }
        }
        return -1;
    }

    public static final String LJJJJ(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        String adFeedBackEntrance;
        if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || (adFeedBackEntrance = commerceVideoAuthInfo.getAdFeedBackEntrance()) == null) {
            return "";
        }
        return adFeedBackEntrance;
    }

    public static final boolean LJJJJI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Map<String, AnoleComponentModel> map;
        if (!AwemeExtKt.isAdTraffic(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return false;
        }
        AnoleModel anoleModel = awemeRawAd.getAnoleModel();
        if (anoleModel != null) {
            map = anoleModel.components;
        } else {
            map = null;
        }
        if ((map != null && !map.isEmpty()) || awemeRawAd.getPlayFunModel() != null) {
            return true;
        }
        Map<String, CardStruct> cardInfos = awemeRawAd.getCardInfos();
        if (cardInfos != null && !cardInfos.isEmpty()) {
            Iterator<Map.Entry<String, CardStruct>> it2 = cardInfos.entrySet().iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getKey(), "5")) {
                    return true;
                }
            }
        }
        if (!LLLILZ(aweme) && !LJLIIL(aweme)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJIZL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AmazonCheckoutAdModel amazonCheckoutData;
        AmazonCtaButtonStyleModel ctaButtonStyle;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (amazonCheckoutData = awemeRawAd.getAmazonCheckoutData()) != null && (ctaButtonStyle = amazonCheckoutData.getCtaButtonStyle()) != null && ctaButtonStyle.getNormal() != null && ctaButtonStyle.getPrime() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        NativeAuthorInfo nativeAuthorInfo;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return false;
        }
        User author = aweme.getAuthor();
        if ((author != null && author.isAdFake()) || (nativeAuthorInfo = awemeRawAd.getNativeAuthorInfo()) == null || nativeAuthorInfo.bottomBanner == null) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJJL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Boolean hasOpenUrlImmutable;
        try {
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("commerce_open_app_optimize_setting", true)) {
                return LJJJJLI(aweme);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (hasOpenUrlImmutable = awemeRawAd.getHasOpenUrlImmutable()) != null) {
            return hasOpenUrlImmutable.booleanValue();
        }
        return LJJJJLI(aweme);
    }

    public static final boolean LJJJJL(Aweme aweme) {
        String webUrl;
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            webUrl = awemeRawAd.getWebUrl();
        } else {
            webUrl = null;
        }
        return !TextUtils.isEmpty(webUrl);
    }

    public static final boolean LJJJJLI(Aweme aweme) {
        String openUrl;
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            openUrl = awemeRawAd.getOpenUrl();
        } else {
            openUrl = null;
        }
        return C1022030chd.LJIJI(openUrl);
    }

    public static final boolean LJJJJLL(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (!LLFII(aweme) || aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || !commerceVideoAuthInfo.isHasUserSubmittedFeedback()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJZ(Aweme aweme) {
        CommerceLabelInfo commerceLabelInfo;
        AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo == null || (commerceLabelInfo = commerceVideoAuthInfo.getCommerceLabelInfo()) == null || commerceLabelInfo.bcLabelDisplayType != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJZI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        VideoPlaybackConfig videoPlaybackConfig;
        Integer num;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (videoPlaybackConfig = awemeRawAd.getVideoPlaybackConfig()) != null && (num = videoPlaybackConfig.ifAutomaticallyAccelerated) != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJLL(Aweme aweme) {
        Video video;
        if (!AwemeExtKt.isAdTraffic(aweme) || (video = aweme.getVideo()) == null || !video.is3DVideo()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJLZIJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Integer promotionCatalogType;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (promotionCatalogType = awemeRawAd.getPromotionCatalogType()) != null && promotionCatalogType.intValue() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (!LJJLIIJ(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.isAigcTitleEnable()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Integer promotionCatalogType;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (promotionCatalogType = awemeRawAd.getPromotionCatalogType()) != null && promotionCatalogType.intValue() == 6) {
            return true;
        }
        return false;
    }

    public static final boolean LJJLI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && aweme.getAwemeRawAd() != null && ((awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getAceSceneType() != 0)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJLIIIIJ(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJLIIIJ(Aweme aweme) {
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && aweme.getCardInsertInfo() != null && !LLIZLLLIL(aweme)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJLIIIJJIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        String webUrl;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && LJLLJ(aweme.getAwemeRawAd()) && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getShouldWebUrlJumpThirdApp()) {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                webUrl = awemeRawAd2.getWebUrl();
            } else {
                webUrl = null;
            }
            if (!TextUtils.isEmpty(webUrl)) {
                Uri uri = UriProtector.parse(webUrl);
                if (C1022030chd.LJIILLIIL(uri)) {
                    C1022030chd.LIZ.getClass();
                    ICrossPlatformLegacyService iCrossPlatformLegacyService = (ICrossPlatformLegacyService) C1022030chd.LIZIZ.getValue();
                    C844470XAv.LIZ.getClass();
                    if (iCrossPlatformLegacyService.hasAppByHttp(C844470XAv.LIZ(), uri)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJJLIIIJL(Aweme aweme) {
        boolean z;
        boolean z2;
        String extra;
        if (aweme != null) {
            List<AnchorCommonStruct> anchors = aweme.getAnchors();
            if (anchors != null) {
                Iterator<AnchorCommonStruct> it2 = anchors.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AnchorCommonStruct next = it2.next();
                    if (next.getType() == 24 && (extra = next.getExtra()) != null && extra.length() != 0) {
                        Boolean bool = (Boolean) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), GsonProtectorUtils.parse(new p(), next.getExtra()).LJIILIIL().LJJIIZ("is_schema_lynx"), new TypeToken<Boolean>() { // from class: X.0cZf
                        }.getType());
                        if (bool != null && bool.booleanValue()) {
                            return true;
                        }
                    }
                }
            }
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null || TextUtils.isEmpty(awemeRawAd.getWebUrl())) {
                return false;
            }
            if (awemeRawAd.getWebviewType() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (awemeRawAd.getProfileWithWebview() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJLIIIJLJLI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        AdDisclaimer disclaimer;
        String lightWebUrl;
        AwemeRawAd awemeRawAd4;
        String webUrl = null;
        if (aweme != null && (((awemeRawAd2 = aweme.getAwemeRawAd()) != null && (lightWebUrl = awemeRawAd2.getLightWebUrl()) != null && lightWebUrl.length() > 0 && (awemeRawAd4 = aweme.getAwemeRawAd()) != null && awemeRawAd4.getWebviewType() == 0) || LLILZ(aweme) || (LLLIIIL(aweme) && (awemeRawAd3 = aweme.getAwemeRawAd()) != null && (disclaimer = awemeRawAd3.getDisclaimer()) != null && disclaimer.type == 2))) {
            return true;
        }
        C1017150cZl c1017150cZl = C1017150cZl.LIZIZ;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            webUrl = awemeRawAd.getWebUrl();
        }
        if (!c1017150cZl.LIZIZ(webUrl)) {
            if (aweme != null && LJJLI(aweme)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean LJJLIIIJLLLLLLLZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null) {
            if (LLLJIL(aweme) || LLLJ(aweme) || ((awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getWebviewType() == 1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJJLIIJ(Aweme aweme) {
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJLIL(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 34) {
            return false;
        }
        return true;
    }

    public static final boolean LJJLJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            return Intrinsics.LJFF(awemeRawAd.isAmazonAd(), Boolean.TRUE);
        }
        return false;
    }

    public static final boolean LJJLJLI(Aweme aweme) {
        String type;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                type = awemeRawAd.getType();
            } else {
                type = null;
            }
            if (Intrinsics.LJFF(type, "app")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJJLL(Aweme aweme) {
        String type;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        String webUrl = null;
        if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null) {
            type = awemeRawAd2.getType();
        } else {
            type = null;
        }
        if (!Intrinsics.LJFF(type, "app") || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getWebType() != 1) {
            return false;
        }
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if (awemeRawAd3 != null) {
            webUrl = awemeRawAd3.getWebUrl();
        }
        if (!C123100dR.LIZ(webUrl)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJZZI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && Intrinsics.LJFF(awemeRawAd.getType(), "phone") && !TextUtils.isEmpty(awemeRawAd.getPhoneNumber())) {
            return true;
        }
        return false;
    }

    public static final boolean LJJZZIII(Aweme aweme) {
        User author;
        AwemeRawAd awemeRawAd;
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme) || aweme.getAuthor() == null || (((author = aweme.getAuthor()) != null && author.isAdFake()) || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
            return false;
        }
        return Intrinsics.LJFF(awemeRawAd.getType(), "message");
    }

    public static final boolean LJL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdPromptInfoModel userInteractInfo;
        AdCardStrategyModel cardStrategy;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (userInteractInfo = awemeRawAd.getUserInteractInfo()) != null && (cardStrategy = userInteractInfo.getCardStrategy()) != null && cardStrategy.getTriggerCondition() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LJLI(Aweme aweme) {
        LinkData linkDataLIZ = C990310bsT.LIZ(aweme);
        if (linkDataLIZ == null || linkDataLIZ.feedShowType != 3) {
            return false;
        }
        return true;
    }

    public static final boolean LJLIIIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        List<AdTagStruct> adTags;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (adTags = awemeRawAd.getAdTags()) == null || adTags.isEmpty()) {
            return false;
        }
        for (AdTagStruct adTagStruct : adTags) {
            if (adTagStruct.getPosition() == 1 && !TextUtils.isEmpty(adTagStruct.getTagText())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJLIIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        PhotoCarouselInfoStruct photoCarouselInfo;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) == null || !photoCarouselInfo.getEnableLabel()) {
            return false;
        }
        return true;
    }

    public static final boolean LJLIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getAdDescriptiveCTA() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJLILLLLZI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && C1017180cZo.LJIIL(awemeRawAd)) {
            return true;
        }
        return false;
    }

    public static final boolean LJLJI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        List<AdTagStruct> adTags;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (adTags = awemeRawAd.getAdTags()) == null || adTags.isEmpty()) {
            return false;
        }
        for (AdTagStruct adTagStruct : adTags) {
            if (adTagStruct.getPosition() == 2 && !TextUtils.isEmpty(adTagStruct.getTagText())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJLJJI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdPromptInfoModel slideBackInfoModel;
        AdButtonStrategyModel buttonStrategy;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (slideBackInfoModel = awemeRawAd.getSlideBackInfoModel()) != null && (buttonStrategy = slideBackInfoModel.getButtonStrategy()) != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && awemeRawAd2.isReshowFormat()) {
            if (buttonStrategy.getTriggerCondition() == 1 || (buttonStrategy.getTriggerCondition() == 2 && (awemeRawAd3 = aweme.getAwemeRawAd()) != null && awemeRawAd3.isCTAFirstShown())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJLJJL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdPromptInfoModel userInteractInfo;
        AdButtonStrategyModel buttonStrategy;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (userInteractInfo = awemeRawAd.getUserInteractInfo()) != null && (buttonStrategy = userInteractInfo.getButtonStrategy()) != null && buttonStrategy.getTriggerCondition() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LJLJJLL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getSystemOrigin() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJLJL(Aweme aweme) {
        String type;
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            type = awemeRawAd.getType();
        } else {
            type = null;
        }
        return TextUtils.equals(type, "app");
    }

    public static final boolean LJLJLJ(Aweme aweme) {
        String str;
        AwemeRawAd awemeRawAd;
        DynamicVideo dynamicVideo;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (dynamicVideo = awemeRawAd.getDynamicVideo()) != null) {
            str = dynamicVideo.lynxScheme;
        } else {
            str = null;
        }
        return !TextUtils.isEmpty(str);
    }

    public static final boolean LJLJLLL(Aweme aweme) {
        IFeedAdService iFeedAdService;
        C1000400c8k c1000400c8kLJ;
        Integer numValueOf;
        if (aweme != null && LJLJLJ(aweme) && (iFeedAdService = (IFeedAdService) PluggableExtentionKt.pluggableSpi$default(IFeedAdService.class, false, false, false, 14, null)) != null && iFeedAdService.LJIJJLI() != null && (c1000400c8kLJ = C1000380c8i.LJ(aweme.getAid())) != null && (numValueOf = Integer.valueOf(c1000400c8kLJ.LIZJ)) != null && numValueOf.intValue() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LJLL(Aweme aweme) {
        Integer numValueOf;
        IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(100, 200);
        if (aweme != null && (numValueOf = Integer.valueOf(aweme.getMarketSubType())) != null && intRangeLJIILJJIL.LJLJL(numValueOf.intValue())) {
            return true;
        }
        return false;
    }

    public static final boolean LJLLI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoCarouselProductStruct> productList;
        String color;
        PhotoCarouselInfoStruct photoCarouselInfo2;
        List<PhotoCarouselProductStruct> productList2;
        PhotoCarouselProductStruct photoCarouselProductStruct;
        if (aweme != null && LJLIIL(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null && (productList = photoCarouselInfo.getProductList()) != null && !productList.isEmpty()) {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null && (photoCarouselInfo2 = awemeRawAd2.getPhotoCarouselInfo()) != null && (productList2 = photoCarouselInfo2.getProductList()) != null && (photoCarouselProductStruct = (PhotoCarouselProductStruct) ListProtector.get(productList2, 0)) != null) {
                color = photoCarouselProductStruct.getColor();
            } else {
                color = null;
            }
            if (!TextUtils.isEmpty(color)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJLLILLLL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoCarouselProductStruct> productList;
        String buttonText;
        PhotoCarouselInfoStruct photoCarouselInfo2;
        List<PhotoCarouselProductStruct> productList2;
        PhotoCarouselProductStruct photoCarouselProductStruct;
        if (aweme != null && LJLIIL(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null && (productList = photoCarouselInfo.getProductList()) != null && !productList.isEmpty()) {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null && (photoCarouselInfo2 = awemeRawAd2.getPhotoCarouselInfo()) != null && (productList2 = photoCarouselInfo2.getProductList()) != null && (photoCarouselProductStruct = (PhotoCarouselProductStruct) ListProtector.get(productList2, 0)) != null) {
                buttonText = photoCarouselProductStruct.getButtonText();
            } else {
                buttonText = null;
            }
            if (!TextUtils.isEmpty(buttonText)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJLLJ(AwemeRawAd awemeRawAd) {
        if (LLJZIJLIL(awemeRawAd) || awemeRawAd == null || !awemeRawAd.isEnableFullScreenProfileLandingPage()) {
            return false;
        }
        return true;
    }

    public static final boolean LJLLL(Aweme aweme) {
        AwemeRawAd awemeRawAdLJJIIJZLJL;
        AdStyleActionModel adStyleActionModel;
        LikeEffectModel likeEffectModel;
        if (aweme != null) {
            awemeRawAdLJJIIJZLJL = LJJIIJZLJL(aweme);
        } else {
            awemeRawAdLJJIIJZLJL = null;
        }
        if (awemeRawAdLJJIIJZLJL == null || (adStyleActionModel = awemeRawAdLJJIIJZLJL.getAdStyleActionModel()) == null || (likeEffectModel = adStyleActionModel.likeEffect) == null) {
            return false;
        }
        if (!likeEffectModel.checkStickerValid() && likeEffectModel.effectType != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LJLLLL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        PhotoCarouselInfoStruct photoCarouselInfo;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) == null || !photoCarouselInfo.getEnableMultiCTAJump()) {
            return false;
        }
        return true;
    }

    public static final boolean LJLLLLLL(Aweme aweme) {
        AwemeRawAd styleInfo;
        AdStyleActionModel adStyleActionModel;
        LikeEffectModel likeEffectModel;
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
            styleInfo = commerceVideoAuthInfo.getStyleInfo();
        } else {
            styleInfo = null;
        }
        if (styleInfo == null || (adStyleActionModel = styleInfo.getAdStyleActionModel()) == null || (likeEffectModel = adStyleActionModel.likeEffect) == null || likeEffectModel.effectType != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LJLZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdPaidContent adPaidContent;
        if (!LLILLIZIL(aweme) || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (adPaidContent = awemeRawAd.getAdPaidContent()) == null || !adPaidContent.getProfileLandingOptimization()) {
            return false;
        }
        return true;
    }

    public static final boolean LJZ(Aweme aweme) {
        AwemeRawAd awemeRawAdLJJIIJZLJL;
        AdStyleActionModel adStyleActionModel;
        LikeEffectModel likeEffectModel;
        if (aweme != null && (awemeRawAdLJJIIJZLJL = LJJIIJZLJL(aweme)) != null && (adStyleActionModel = awemeRawAdLJJIIJZLJL.getAdStyleActionModel()) != null && (likeEffectModel = adStyleActionModel.likeEffect) != null) {
            return likeEffectModel.checkStickerValid();
        }
        return false;
    }

    public static final boolean LJZI(Aweme aweme) {
        AwemeRawAd styleInfo;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        if (aweme != null) {
            if (AwemeExtKt.isAdTraffic(aweme)) {
                styleInfo = aweme.getAwemeRawAd();
            } else {
                AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
                if (commerceVideoAuthInfo != null) {
                    styleInfo = commerceVideoAuthInfo.getStyleInfo();
                }
            }
            if (styleInfo != null && (anoleModel = styleInfo.getAnoleModel()) != null && (map = anoleModel.components) != null && map.containsKey(EnumC1008920cMU.UNDER_WATER_BANNER.getType())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJZL(Aweme aweme) {
        AwemeRawAd awemeRawAdLJJIIJZLJL;
        AdStyleActionModel adStyleActionModel;
        LikeEffectModel likeEffectModel;
        if (aweme != null) {
            awemeRawAdLJJIIJZLJL = LJJIIJZLJL(aweme);
        } else {
            awemeRawAdLJJIIJZLJL = null;
        }
        if (awemeRawAdLJJIIJZLJL == null || (adStyleActionModel = awemeRawAdLJJIIJZLJL.getAdStyleActionModel()) == null || (likeEffectModel = adStyleActionModel.likeEffect) == null || likeEffectModel.effectType != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LL(Aweme aweme) {
        User author;
        if (aweme == null || (author = aweme.getAuthor()) == null || !author.isAdFake()) {
            return false;
        }
        return true;
    }

    public static final boolean LLD(Aweme aweme) {
        if (!LJJLIIJ(aweme) || aweme == null) {
            return false;
        }
        if (AwemeSaaSExtKt.isLive(aweme)) {
            return true;
        }
        User author = aweme.getAuthor();
        if (author == null || !author.isLive() || !C1009740cNo.LJII(aweme)) {
            return false;
        }
        return true;
    }

    public static final boolean LLF(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getSystemOrigin() != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LLFF(Aweme aweme) {
        C1022030chd c1022030chd = C1022030chd.LIZ;
        User author = aweme.getAuthor();
        c1022030chd.getClass();
        if (author != null) {
            Integer numValueOf = Integer.valueOf(author.getFollowStatus());
            if (numValueOf != null) {
                if (numValueOf.intValue() != 0 && numValueOf.intValue() != 4) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean LLFII(Aweme aweme) {
        if (aweme != null && aweme.getCommerceVideoAuthInfo() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LLFZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdInteractionData adInteractionData;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (adInteractionData = awemeRawAd.getAdInteractionData()) != null && adInteractionData.gestureGuidance != null) {
            return true;
        }
        return false;
    }

    public static final boolean LLI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return false;
        }
        if (awemeRawAd.getExternalType() == 604 || awemeRawAd.getDirectMessageType() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LLIFFJFJJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.isLeadLiveAds()) {
            return true;
        }
        return false;
    }

    public static final boolean LLII(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getButtonType() != 1 || awemeRawAd.getAnimationType() == -1) {
            return false;
        }
        return true;
    }

    public static final boolean LLIIII(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdLynxEntryData lynxEntryData;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (lynxEntryData = awemeRawAd.getLynxEntryData()) != null && lynxEntryData.entryType == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LLIIIILZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        if (LLD(aweme)) {
            return false;
        }
        if ((!LJJLJLI(aweme) && !LLIIZ(aweme)) || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return false;
        }
        C844470XAv.LIZ.getClass();
        if (C2162308dZ.LJFF(C844470XAv.LIZ(), awemeRawAd.getPackageName())) {
            return false;
        }
        if (C1022030chd.LJIJI(awemeRawAd.getOpenUrl()) && !LLIIZ(aweme)) {
            return false;
        }
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if ((awemeRawAd3 != null && C1017180cZo.LJJIIZ(awemeRawAd3, false)) || ((awemeRawAd2 = aweme.getAwemeRawAd()) != null && C1010120cOQ.LJJJI(awemeRawAd2))) {
            return true;
        }
        if (awemeRawAd.getDownloadMode() != 0 || !TextUtils.isEmpty(awemeRawAd.getPackageName()) || LJJLL(aweme)) {
            return false;
        }
        OverlayNativeConfig overlayNativeConfig = awemeRawAd.getOverlayNativeConfig();
        if (overlayNativeConfig == null || !overlayNativeConfig.autoPlay) {
            return true;
        }
        return false;
    }

    public static final boolean LLIIIJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getAdUrlType() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LLIIIL(Aweme aweme) {
        if (LLIZLLLIL(aweme) && aweme != null && aweme.getAwemeType() == 200) {
            return true;
        }
        return false;
    }

    public static final boolean LLIIIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getAdType() == 2) {
            return true;
        }
        return false;
    }

    public static final boolean LLIIJI(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (!LLFII(aweme) || aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || !commerceVideoAuthInfo.isMusicNotClickable()) {
            return false;
        }
        return true;
    }

    public static final boolean LLIIJLIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.isPhotoModeSlideOptimizeEnable() && C18169079r.LIZ()) {
            return true;
        }
        return false;
    }

    public static final boolean LLIIL(Aweme aweme) {
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && AwemeExtKt.isPhotoMode(aweme)) {
            return true;
        }
        return false;
    }

    public static final boolean LLIILII(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (!LLIIJLIL(aweme) || aweme == null || !AwemeExtKt.isAdTraffic(aweme) || !LLIIL(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.isShowPhotoModeSlideHint()) {
            return false;
        }
        return true;
    }

    public static final boolean LLIILZL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getPlayFunModel() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LLIIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return false;
        }
        IEcUgVSAService iEcUgVSAService = (IEcUgVSAService) PluggableExtentionKt.pluggableSpi$default(IEcUgVSAService.class, false, false, false, 14, null);
        if (!AwemeExtKt.isAdTraffic(aweme) || !awemeRawAd.isOpenUrlSupportPullUp() || !Intrinsics.LJFF(awemeRawAd.getType(), "web") || iEcUgVSAService == null) {
            return false;
        }
        if (!iEcUgVSAService.LJFF(awemeRawAd.getOpenUrl()) && !iEcUgVSAService.LJIIIZ(awemeRawAd.getOpenUrl())) {
            return false;
        }
        return true;
    }

    public static final boolean LLIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && !LL(aweme) && TextUtils.equals(awemeRawAd.getType(), "message") && awemeRawAd.getSystemOrigin() == 51) {
            return true;
        }
        return false;
    }

    public static final boolean LLILII(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (aweme == null || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || !commerceVideoAuthInfo.isPseudoAd() || commerceVideoAuthInfo.getPseudoAdData() == null) {
            return false;
        }
        return true;
    }

    public static final boolean LLILIL(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        AwemeRawAd pseudoAdData;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        if (aweme == null || !AwemeExtKt.isPseudoAd(aweme) || !((Boolean) C270550Aiz.LIZ.getValue()).booleanValue() || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || (pseudoAdData = commerceVideoAuthInfo.getPseudoAdData()) == null || (anoleModel = pseudoAdData.getAnoleModel()) == null || (map = anoleModel.components) == null || map.isEmpty()) {
            return false;
        }
        return true;
    }

    public static final boolean LLILLIZIL(Aweme aweme) {
        String type;
        AwemeRawAd awemeRawAd;
        if (LJJLIIJ(aweme)) {
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                type = awemeRawAd.getType();
            } else {
                type = null;
            }
            if (Intrinsics.LJFF(type, "paid_content")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LLILLJJLI(Aweme aweme) {
        String str;
        AwemeRawAd awemeRawAd;
        AdQuestionnaire adQuestionnaire;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (adQuestionnaire = awemeRawAd.getAdQuestionnaire()) != null) {
            str = adQuestionnaire.schema;
        } else {
            str = null;
        }
        return !TextUtils.isEmpty(str);
    }

    public static final boolean LLILLL(Aweme aweme) {
        if (LJJIIZI(aweme) == null && !LLILZ(aweme)) {
            return false;
        }
        return true;
    }

    public static final boolean LLILZ(Aweme aweme) {
        if (LJJIJ(aweme) != null) {
            return true;
        }
        return false;
    }

    public static final boolean LLILZIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdProductTile productTile;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (productTile = awemeRawAd.getProductTile()) == null) {
            return false;
        }
        if (!TextUtils.isEmpty(productTile.getContainerType()) && !Intrinsics.LJFF(productTile.getContainerType(), "lynx")) {
            return false;
        }
        return true;
    }

    public static final boolean LLILZLL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdStyleActionModel adStyleActionModel;
        if (aweme != null && LLIZLLLIL(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (adStyleActionModel = awemeRawAd.getAdStyleActionModel()) != null && adStyleActionModel.logoSpotlightInfo != null) {
            return true;
        }
        return false;
    }

    public static final boolean LLIZ(Aweme aweme) {
        CardStruct cardStructLJJIJIIJI = LJJIJIIJI(aweme);
        if (cardStructLJJIJIIJI == null || cardStructLJJIJIIJI.getCardType() != 15) {
            return false;
        }
        return true;
    }

    public static final boolean LLIZLLLIL(Aweme aweme) {
        String awesomeSplashId;
        AwemeSplashInfo awemeSplashInfoLJJJ = LJJJ(aweme);
        if (awemeSplashInfoLJJJ != null) {
            awesomeSplashId = awemeSplashInfoLJJJ.getAwesomeSplashId();
        } else {
            awesomeSplashId = null;
        }
        return !TextUtils.isEmpty(awesomeSplashId);
    }

    public static final boolean LLJ(InterfaceC1018210cbT interfaceC1018210cbT) {
        AwemeSplashInfo awemeSplashInfoLJJJI;
        if (interfaceC1018210cbT != null && interfaceC1018210cbT.LLZZZIL() && (awemeSplashInfoLJJJI = LJJJI(interfaceC1018210cbT)) != null && awemeSplashInfoLJJJI.isDisableHotStartShow()) {
            return true;
        }
        return false;
    }

    public static final boolean LLJI(Aweme aweme) {
        AwemeSplashInfo awemeSplashInfoLJJJ = LJJJ(aweme);
        if (awemeSplashInfoLJJJ == null || TextUtils.isEmpty(awemeSplashInfoLJJJ.getAwesomeSplashId()) || awemeSplashInfoLJJJ.getSplashFeedType() != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LLJIJIL(Aweme aweme) {
        boolean z = false;
        if (!LLJI(aweme)) {
            return false;
        }
        AwemeSplashInfo awemeSplashInfoLJJJ = LJJJ(aweme);
        if (awemeSplashInfoLJJJ != null && awemeSplashInfoLJJJ.hasUpdateLiving) {
            z = true;
        }
        return !z;
    }

    public static final boolean LLJILJIL(Aweme aweme) {
        User author;
        if (!LLJI(aweme)) {
            return false;
        }
        if (LLJIJIL(aweme)) {
            return true;
        }
        if (aweme == null || (author = aweme.getAuthor()) == null || !author.isLive()) {
            return false;
        }
        return true;
    }

    public static final boolean LLJILJILJ(Aweme aweme) {
        int endTime;
        AwemeSplashInfo awemeSplashInfoLJJJ = LJJJ(aweme);
        if (awemeSplashInfoLJJJ != null) {
            endTime = awemeSplashInfoLJJJ.getEndTime();
        } else {
            endTime = 0;
        }
        if (endTime >= System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
            return false;
        }
        return true;
    }

    public static final boolean LLJILLL(Aweme aweme) {
        AwemeSplashInfo awemeSplashInfoLJJJ = LJJJ(aweme);
        if (awemeSplashInfoLJJJ == null || !awemeSplashInfoLJJJ.isShown()) {
            return false;
        }
        return true;
    }

    public static final boolean LLJJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return false;
        }
        if (awemeRawAd.getTranslatableData() == null) {
            Iterator<InterfaceC1017100cZg> it2 = C1017630caX.LIZ.iterator();
            while (it2.hasNext()) {
                if (it2.next().LIZ(awemeRawAd)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean LLJJIJIIJIL(Aweme aweme) {
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && aweme.getAwemeType() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean LLJJJ(Aweme aweme) {
        String type;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            type = awemeRawAd.getType();
        } else {
            type = null;
        }
        return TextUtils.equals(type, "web");
    }

    public static final boolean LLJJJIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdStyleActionModel adStyleActionModel;
        LogoSpotlightInfo logoSpotlightInfo;
        String vid;
        if (!LLILZLL(aweme) || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (adStyleActionModel = awemeRawAd.getAdStyleActionModel()) == null || (logoSpotlightInfo = adStyleActionModel.logoSpotlightInfo) == null) {
            return false;
        }
        if (logoSpotlightInfo.getDisplayedAsTopview() && logoSpotlightInfo.getUpdateReshow()) {
            return false;
        }
        C1046940dLo c1046940dLo = C1046940dLo.LIZ;
        LogoSpotlightVideoModel spotlightVideoModel = logoSpotlightInfo.getSpotlightVideoModel();
        if (spotlightVideoModel != null) {
            vid = spotlightVideoModel.getVid();
        } else {
            vid = null;
        }
        c1046940dLo.getClass();
        return C1046940dLo.LIZJ(vid);
    }

    public static final boolean LLJJJJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdStyleActionModel adStyleActionModel;
        LogoSpotlightInfo logoSpotlightInfo;
        String vid;
        if (!LLILZLL(aweme) || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (adStyleActionModel = awemeRawAd.getAdStyleActionModel()) == null || (logoSpotlightInfo = adStyleActionModel.logoSpotlightInfo) == null || logoSpotlightInfo.getDisplayedAsTopview()) {
            return false;
        }
        C1046940dLo c1046940dLo = C1046940dLo.LIZ;
        LogoSpotlightVideoModel spotlightVideoModel = logoSpotlightInfo.getSpotlightVideoModel();
        if (spotlightVideoModel != null) {
            vid = spotlightVideoModel.getVid();
        } else {
            vid = null;
        }
        c1046940dLo.getClass();
        return C1046940dLo.LIZJ(vid);
    }

    public static final boolean LLJJJJJIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (!LJJLI(aweme) || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getAceSceneType() != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LLJJJJLIIL(List<AmazonProductDetailsModel> list) {
        if (list == null) {
            return false;
        }
        if (!list.isEmpty()) {
            Iterator<AmazonProductDetailsModel> it2 = list.iterator();
            while (it2.hasNext()) {
                AmazonPrimeBadgeModel primeBadge = it2.next().getPrimeBadge();
                if (primeBadge == null || !primeBadge.isPrime()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean LLJJL(Aweme aweme) {
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && !C1017180cZo.LJIIJJI(awemeRawAd) && !LJJJJLI(aweme) && !TextUtils.isEmpty(awemeRawAd.getWebUrl()) && C1017180cZo.LJJIIZI(awemeRawAd) && C1017180cZo.LJJIIJ(awemeRawAd) && LJLJL(aweme)) {
            return true;
        }
        return false;
    }

    public static final boolean LLJJLIIIJLLLLLLLZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        NativeAuthorInfo nativeAuthorInfo;
        BottomBanner bottomBanner;
        if (!LJJJJJ(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return false;
        }
        if ((!Intrinsics.LJFF(awemeRawAd.getType(), "app") && !awemeRawAd.getShouldWebUrlJumpThirdApp()) || TextUtils.isEmpty(awemeRawAd.getWebUrl())) {
            return false;
        }
        C844470XAv.LIZ.getClass();
        if (LLLLII(C844470XAv.LIZ(), aweme) || LJJJJLI(aweme) || awemeRawAd.isDisableUserprofileAdLabel() || (nativeAuthorInfo = awemeRawAd.getNativeAuthorInfo()) == null) {
            return false;
        }
        IOpenCCTUtils iOpenCCTUtils = (IOpenCCTUtils) PluggableExtentionKt.pluggableSpi$default(IOpenCCTUtils.class, false, false, false, 14, null);
        if ((iOpenCCTUtils != null && iOpenCCTUtils.LIZ(awemeRawAd.getWebUrl())) || (bottomBanner = nativeAuthorInfo.bottomBanner) == null || bottomBanner.version != 1 || LJIJI(awemeRawAd) != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LLJL(Aweme aweme) {
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && C1017180cZo.LJJIIZI(awemeRawAd)) {
            if (C1017180cZo.LJIIJJI(awemeRawAd) || !LJJJJLI(aweme)) {
                if (C1017180cZo.LJIIJJI(awemeRawAd) || LJJJJLI(aweme) || C1017180cZo.LJJIIJ(awemeRawAd) || !LJLJL(aweme)) {
                    if (C1017180cZo.LJIIJJI(awemeRawAd) && LJLJL(aweme)) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static final boolean LLJLILLLLZIIL(Aweme aweme) {
        String lightWebUrl;
        if (aweme == null || !LJJLJLI(aweme)) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            lightWebUrl = awemeRawAd.getLightWebUrl();
        } else {
            lightWebUrl = null;
        }
        return !TextUtils.isEmpty(lightWebUrl);
    }

    public static final boolean LLJLL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdPromptInfoModel slideBackInfoModel;
        AdButtonStrategyModel buttonStrategy;
        if (aweme != null && LJLJJI(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (slideBackInfoModel = awemeRawAd.getSlideBackInfoModel()) != null && (buttonStrategy = slideBackInfoModel.getButtonStrategy()) != null && buttonStrategy.getShowColorSeconds() > buttonStrategy.getShowSeconds()) {
            return true;
        }
        return false;
    }

    public static final boolean LLJLLIL(Aweme aweme) {
        String[] strArr;
        boolean z = false;
        if (aweme == null || !LLIZLLLIL(aweme) || !LJJLJLI(aweme)) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String packageName = null;
        if (awemeRawAd != null) {
            packageName = awemeRawAd.getPackageName();
        }
        try {
            SettingsManager.LIZLLL().getClass();
            SplashAdConfig splashAdConfig = (SplashAdConfig) SettingsManager.LJII("ad_splash_config", SplashAdConfig.class);
            if (splashAdConfig != null && (strArr = splashAdConfig.appNameAllowList) != null && C13LQ.LJJIJIIJI(packageName, strArr) >= 0) {
                z = true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        return !z;
    }

    public static final boolean LLJLLL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        String webUrl;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (webUrl = awemeRawAd.getWebUrl()) == null) {
            return false;
        }
        return u.LJIIZILJ(webUrl, ".apk", false);
    }

    public static final boolean LLJZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null) {
            Music music = aweme.getMusic();
            if (music == null || music.getMusicStatus() != 0) {
                if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                    if (!awemeRawAd.isHideMusicDisk()) {
                        AdDescriptiveCTAStruct adDescriptiveCTA = awemeRawAd.getAdDescriptiveCTA();
                        if (adDescriptiveCTA != null && adDescriptiveCTA.getHideMusicDisc()) {
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        if (LLII(aweme) && LLLLIIL(aweme)) {
            return true;
        }
        return false;
    }

    public static final boolean LLJZIJLIL(AwemeRawAd awemeRawAd) {
        IUcpService iUcpService = (IUcpService) PluggableExtentionKt.pluggableSpi$default(IUcpService.class, false, false, false, 14, null);
        if (iUcpService == null || !iUcpService.LJIIIIZZ(null, awemeRawAd)) {
            return false;
        }
        return true;
    }

    public static final boolean LLL(Aweme aweme) {
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && !LJLJJLL(aweme)) {
            return true;
        }
        return false;
    }

    public static final boolean LLLF(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || TextUtils.isEmpty(awemeRawAd.getOpenUrl())) {
            return false;
        }
        return awemeRawAd.isOpenUrlSupportPullUp();
    }

    public static final boolean LLLFFI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdAIGCLabel adAigcLabel;
        boolean z;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (adAigcLabel = awemeRawAd.getAdAigcLabel()) == null) {
            return false;
        }
        if (C123100dR.LIZ(adAigcLabel.text) && adAigcLabel.type != null) {
            z = true;
        } else {
            z = false;
        }
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 == null || !awemeRawAd2.isRightStyle() || !z) {
            return false;
        }
        return true;
    }

    public static final boolean LLLFZ(Aweme aweme) {
        String webUrl;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        if (!AwemeExtKt.isAdTraffic(aweme) || LIZLLL(aweme)) {
            return false;
        }
        String type = null;
        if (LLJI(aweme) && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && awemeRawAd2.getCallToActionBarInfo() != null) {
            return LLJILJIL(aweme);
        }
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if (awemeRawAd3 != null) {
            webUrl = awemeRawAd3.getWebUrl();
        } else {
            webUrl = null;
        }
        if (TextUtils.isEmpty(webUrl)) {
            AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
            if (awemeRawAd4 != null) {
                type = awemeRawAd4.getType();
            }
            if (!TextUtils.equals(type, "app")) {
                return false;
            }
        }
        User author = aweme.getAuthor();
        if (author != null && author.isAdFake()) {
            return false;
        }
        if (LJJZ(aweme, "homepage_ad", "button")) {
            return true;
        }
        AwemeRawAd awemeRawAd5 = aweme.getAwemeRawAd();
        if (awemeRawAd5 != null && awemeRawAd5.getCallToActionBarInfo() != null) {
            return true;
        }
        if (!LLIL(aweme) && ((awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.isDisableUserprofileAdLabel())) {
            return true;
        }
        return false;
    }

    public static final boolean LLLI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeTextLabelModel label;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (label = awemeRawAd.getLabel()) == null || label.getCompliancePosition() != 4) {
            return false;
        }
        return true;
    }

    public static final boolean LLLII(Aweme aweme) {
        CardStruct cardStructLJJIJIIJI = LJJIJIIJI(aweme);
        if (cardStructLJJIJIIJI == null) {
            return false;
        }
        if (cardStructLJJIJIIJI.getCardType() != 13 && cardStructLJJIJIIJI.getCardType() != 15) {
            return false;
        }
        return true;
    }

    public static final boolean LLLIIII(Aweme aweme) {
        CommerceActivityStruct activityPendant;
        UrlModel urlModel;
        List<String> urlList;
        if (aweme == null || (activityPendant = aweme.getActivityPendant()) == null || (urlModel = activityPendant.image) == null || (urlList = urlModel.getUrlList()) == null || !(!urlList.isEmpty())) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (jCurrentTimeMillis < activityPendant.startTime || jCurrentTimeMillis > activityPendant.endTime) {
            return false;
        }
        return true;
    }

    public static final boolean LLLIIIIL(Aweme aweme) {
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null || !awemeRawAd.isPopUps()) {
            return false;
        }
        return C1022030chd.LJJI(awemeRawAd.getOpenUrl());
    }

    public static final boolean LLLIIIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdDisclaimer disclaimer;
        int i;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (disclaimer = awemeRawAd.getDisclaimer()) == null || (i = disclaimer.type) == 0) {
            return false;
        }
        if (i == 3 && disclaimer.autoDisclaimerType == 2 && !LLIIL(aweme)) {
            return false;
        }
        return true;
    }

    public static final boolean LLLIIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdDisclaimer disclaimer;
        AwemeRawAd awemeRawAd2;
        AdDisclaimer disclaimer2;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (disclaimer = awemeRawAd.getDisclaimer()) != null && disclaimer.type == 3 && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && (disclaimer2 = awemeRawAd2.getDisclaimer()) != null && disclaimer2.autoDisclaimerType == 1 && !LLIIL(aweme)) {
            return true;
        }
        return false;
    }

    public static final boolean LLLIILIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        FollowButtonData followButtonData;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (followButtonData = awemeRawAd.getFollowButtonData()) != null) {
            return Intrinsics.LJFF(followButtonData.enable, Boolean.TRUE);
        }
        return false;
    }

    public static final boolean LLLIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Map<String, CardStruct> cardInfos;
        CardStruct cardStruct;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (cardInfos = awemeRawAd.getCardInfos()) == null || (cardStruct = cardInfos.get("3")) == null || cardStruct.getCardSubType() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LLLILZ(Aweme aweme) {
        if (aweme != null && LJIILLIIL(aweme) != null) {
            return true;
        }
        return false;
    }

    public static final boolean LLLILZJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdLynxEntryData lynxEntryData;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (lynxEntryData = awemeRawAd.getLynxEntryData()) != null && lynxEntryData.entryType != 0 && lynxEntryData.lynxScheme != null && lynxEntryData.geckoChannel != null) {
            return true;
        }
        return false;
    }

    public static final boolean LLLILZLLLI(Aweme aweme) {
        AdProductTile productTile;
        List<AdNativeProduct> productList;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null || (productTile = awemeRawAd.getProductTile()) == null || !TextUtils.equals(productTile.getContainerType(), "native") || (productList = productTile.getProductList()) == null || !(!productList.isEmpty())) {
            return false;
        }
        return true;
    }

    public static final boolean LLLIZZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || !LJJLIIJ(aweme)) {
            return false;
        }
        User author = aweme.getAuthor();
        if ((author == null || !author.isAdFake()) && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            if (LLJI(aweme)) {
                if (awemeRawAd.getCallToActionBarInfo() != null && LLJILJIL(aweme)) {
                    return true;
                }
                return false;
            }
            if (C1009740cNo.LJII(aweme)) {
                if (!LJIIIZ(aweme) && LLD(aweme) && awemeRawAd.getCallToActionBarInfo() != null) {
                    return true;
                }
                return false;
            }
            if (awemeRawAd.getCallToActionBarInfo() != null && !TextUtils.isEmpty(awemeRawAd.getWebUrl())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LLLJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        NativeAuthorInfo nativeAuthorInfo;
        BottomBanner bottomBanner;
        if (!LJJJJJ(aweme) || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (nativeAuthorInfo = awemeRawAd.getNativeAuthorInfo()) == null || (bottomBanner = nativeAuthorInfo.bottomBanner) == null) {
            return false;
        }
        if ((TextUtils.isEmpty(awemeRawAd.getOpenUrl()) && !LJIIIZ(aweme) && !C1017180cZo.LIZJ(awemeRawAd) && !LJJZ(aweme, "homepage_ad", "button") && !Intrinsics.LJFF(awemeRawAd.getType(), "app") && !Intrinsics.LJFF(awemeRawAd.getType(), "phone") && !LJJZZIII(aweme) && !awemeRawAd.getShouldWebUrlJumpThirdApp()) || bottomBanner.version != 1 || awemeRawAd.isDisableUserprofileAdLabel()) {
            return false;
        }
        return true;
    }

    public static final boolean LLLJIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        NativeAuthorInfo nativeAuthorInfo;
        BottomBanner bottomBanner;
        AwemeRawAd awemeRawAd2;
        NativeSiteConfig nativeSiteConfig;
        if (!LJJJJJ(aweme) || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getShouldWebUrlJumpThirdApp() || !Intrinsics.LJFF(awemeRawAd.getType(), "web") || !TextUtils.isEmpty(awemeRawAd.getOpenUrl())) {
            return false;
        }
        if ((TextUtils.isEmpty(awemeRawAd.getWebUrl()) && ((awemeRawAd2 = aweme.getAwemeRawAd()) == null || (nativeSiteConfig = awemeRawAd2.getNativeSiteConfig()) == null || !Intrinsics.LJFF(nativeSiteConfig.renderType, "lynx") || TextUtils.isEmpty(nativeSiteConfig.lynxScheme))) || awemeRawAd.isDisableUserprofileAdLabel() || LJJZ(aweme, "homepage_ad", "button") || LIZLLL(aweme) || (nativeAuthorInfo = awemeRawAd.getNativeAuthorInfo()) == null || (bottomBanner = nativeAuthorInfo.bottomBanner) == null || bottomBanner.version != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LLLJL(Aweme aweme) {
        String webUrl;
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme) || !LLJI(aweme) || !LLJILJIL(aweme)) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            webUrl = awemeRawAd.getWebUrl();
        } else {
            webUrl = null;
        }
        return TextUtils.isEmpty(webUrl);
    }

    public static final boolean LLLL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        String buttonIcon;
        if (LJJJIL(aweme) == -1) {
            return false;
        }
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (buttonIcon = awemeRawAd.getButtonIcon()) != null && buttonIcon.length() != 0) {
            return false;
        }
        return true;
    }

    public static final boolean LLLLIIIILLL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (!LL(aweme) || (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getAdAvatarLinkTagStyle() == 0)) {
            return false;
        }
        return true;
    }

    public static final boolean LLLLIIL(Aweme aweme) {
        AdButtonStrategyModel buttonStrategy;
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme)) {
            return false;
        }
        if (LLJILJIL(aweme)) {
            return true;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null) {
            return false;
        }
        if (LJLJJI(aweme)) {
            AdPromptInfoModel slideBackInfoModel = awemeRawAd.getSlideBackInfoModel();
            if (slideBackInfoModel != null && (buttonStrategy = slideBackInfoModel.getButtonStrategy()) != null && buttonStrategy.getShowSeconds() == 0) {
                return true;
            }
            return false;
        }
        if ((!TextUtils.isEmpty(awemeRawAd.getWebUrl()) || LLIL(aweme) || LJJZZIII(aweme) || LJJZZI(aweme)) && (awemeRawAd.getAnimationType() == 1 || awemeRawAd.getAnimationType() == 2)) {
            return true;
        }
        return false;
    }

    public static final float LLLLIILL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        VideoPlaybackConfig videoPlaybackConfig;
        Integer num;
        AwemeRawAd awemeRawAd2;
        VideoPlaybackConfig videoPlaybackConfig2;
        Float f;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (videoPlaybackConfig = awemeRawAd.getVideoPlaybackConfig()) != null && (num = videoPlaybackConfig.ifAutomaticallyAccelerated) != null && num.intValue() == 1 && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && (videoPlaybackConfig2 = awemeRawAd2.getVideoPlaybackConfig()) != null && (f = videoPlaybackConfig2.automaticallyPlaybackSpeed) != null) {
            float fFloatValue = f.floatValue();
            if (fFloatValue <= 0.0f) {
                return 1.0f;
            }
            return fFloatValue;
        }
        return 1.0f;
    }

    public static final int LJIILJJIL(Context context, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeTextLabelModel label;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (label = awemeRawAd.getLabel()) != null) {
            int labelBgColor = label.getLabelBgColor();
            if (labelBgColor != 1) {
                switch (labelBgColor) {
                    case 400:
                        return C475630Ikz.LIZIZ(R.attr.e4, context);
                    case 401:
                        return C2441009hQ.LJIIL(41673, 153);
                    case 402:
                        return -1;
                    case 403:
                        return C2441009hQ.LJIIL(15581440, 86);
                    case 404:
                        return C2441009hQ.LJIIL(7626756, 229);
                    default:
                        return C2441009hQ.LJIIL(16777215, 87);
                }
            }
            return 0;
        }
        return C2441009hQ.LJIIL(16777215, 87);
    }

    public static final int LJIILL(Context context, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeTextLabelModel label;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (label = awemeRawAd.getLabel()) != null) {
            int labelTextColor = label.getLabelTextColor();
            if (labelTextColor != 1) {
                switch (labelTextColor) {
                    case 100:
                        return C475630Ikz.LIZIZ(R.attr.ee, context);
                    case 101:
                        return C475630Ikz.LIZIZ(R.attr.ny, context);
                    case 102:
                        return C475630Ikz.LIZIZ(R.attr.eh, context);
                    case 103:
                        return -16777216;
                }
            }
            return 0;
        }
        return -1;
    }

    public static final boolean LJJJLIIL(Aweme aweme, String str) {
        AwemeRawAd awemeRawAd;
        if (!LLJJI(aweme, str, "slide") || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.isDisableLeftSlideFollow()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJLIIIJILLIZJL(Aweme aweme, boolean z) {
        ISamsungPageService iSamsungPageService;
        AwemeRawAd awemeRawAd;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && LJLLJ(aweme.getAwemeRawAd()) && LJJLJLI(aweme) && !LJJJJLI(aweme) && !LLFFF(aweme, z) && (((iSamsungPageService = (ISamsungPageService) PluggableExtentionKt.pluggableSpi$default(ISamsungPageService.class, false, false, false, 14, null)) == null || !iSamsungPageService.LJII(aweme.getAwemeRawAd())) && ((awemeRawAd = aweme.getAwemeRawAd()) == null || !C1017180cZo.LJJ(awemeRawAd)))) {
            return true;
        }
        return false;
    }

    public static final boolean LJJLIIIJJI(Aweme aweme, boolean z) {
        boolean zLJJJJLI;
        if (LLIIIJ(aweme)) {
            return false;
        }
        if (z) {
            zLJJJJLI = LJJJJJL(aweme);
        } else {
            zLJJJJLI = LJJJJLI(aweme);
        }
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme) || !LJLLJ(aweme.getAwemeRawAd()) || !zLJJJJLI) {
            return false;
        }
        return true;
    }

    public static final boolean LLFFF(Aweme aweme, boolean z) {
        AwemeRawAd awemeRawAd;
        String strLJII;
        AwemeRawAd awemeRawAd2;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && C1017180cZo.LIZ(awemeRawAd)) {
            if (z && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && C1017180cZo.LJIILIIL(awemeRawAd2)) {
                return false;
            }
            C1022030chd c1022030chd = C1022030chd.LIZ;
            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
            if (awemeRawAd3 != null) {
                strLJII = C1017180cZo.LJII(awemeRawAd3, z, false);
            } else {
                strLJII = null;
            }
            Intent intentLIZLLL = C1022030chd.LIZLLL(contextLIZ, strLJII);
            c1022030chd.getClass();
            if (C1022030chd.LJIILJJIL(contextLIZ, intentLIZLLL)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LLILL(Aweme aweme, String str) {
        if (aweme != null) {
            if ((AwemeExtKt.isAdTraffic(aweme) || C1010120cOQ.LJJIJ(aweme)) && TextUtils.equals(str, "general_search") && AwemeSaaSExtKt.isLive(aweme)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LLJJIII(int i, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoCarouselProductStruct> productList;
        if (aweme == null || (((awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getEnableJumpToProduct() == 2) || (((awemeRawAd2 = aweme.getAwemeRawAd()) != null && awemeRawAd2.getEnableJumpToProduct() == 3) || (awemeRawAd3 = aweme.getAwemeRawAd()) == null || (photoCarouselInfo = awemeRawAd3.getPhotoCarouselInfo()) == null || (productList = photoCarouselInfo.getProductList()) == null || !(!productList.isEmpty()) || productList.size() <= i || i < 0))) {
            return false;
        }
        return ((PhotoCarouselProductStruct) ListProtector.get(productList, i)).getUseJumpDataInRawAdData();
    }

    public static final boolean LLJLIL(Aweme aweme, String str) {
        AwemeRawAd awemeRawAd;
        AdDisclaimer disclaimer;
        Map<String, AutoData> map;
        AutoData autoData;
        String imageUrl;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (disclaimer = awemeRawAd.getDisclaimer()) == null || disclaimer.type != 3) {
            return false;
        }
        if ((disclaimer.autoDisclaimerType != 2 || !LLIIL(aweme)) && ((map = disclaimer.autoDataMap) == null || (autoData = map.get(str)) == null || (imageUrl = autoData.getImageUrl()) == null || !C123100dR.LIZ(imageUrl))) {
            return false;
        }
        return true;
    }

    public static final boolean LLLFF(Aweme aweme, String str) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getComponentType() == 6 && Intrinsics.LJFF(str, "request_from_anchor")) {
            return true;
        }
        return false;
    }

    public static final boolean LLLLII(Context context, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || TextUtils.isEmpty(awemeRawAd.getWebUrl())) {
            return false;
        }
        Uri uri = UriProtector.parse(awemeRawAd.getWebUrl());
        if (!awemeRawAd.getShouldWebUrlJumpThirdApp() || !C1022030chd.LJIILLIIL(uri) || !C1022030chd.LJIILIIL(context, uri)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIJJI(Aweme aweme, String str, String str2) {
        AwemeRawAd awemeRawAd;
        FinalJumpTargetPageConfig finalJumpTargetPageConfigVu;
        if (aweme != null) {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null && C1017180cZo.LJJIJIIJI(awemeRawAd2)) {
                IAdWebUtils iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
                if (iAdWebUtils != null && (finalJumpTargetPageConfigVu = iAdWebUtils.Vu(aweme.getAwemeRawAd(), str, str2)) != null && finalJumpTargetPageConfigVu.getEnableFullScreenProfileLandingPage()) {
                    return true;
                }
                return false;
            }
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        return LJLLJ(awemeRawAd);
    }

    public static final C1022820ciu LJJIJIL(Aweme aweme, String str, String str2) {
        AwemeRawAd awemeRawAdLJJIJL;
        if (aweme == null || !AwemeExtKt.isPseudoAd(aweme) || (awemeRawAdLJJIJL = LJJIJL(aweme)) == null) {
            return null;
        }
        return C2184171Adz.LIZLLL(str, str2, awemeRawAdLJJIJL);
    }

    public static final boolean LJJZ(Aweme aweme, String str, String str2) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        String webUrl;
        String webUrl2;
        AwemeRawAd awemeRawAd3;
        IOpenCCTUtils iOpenCCTUtils = (IOpenCCTUtils) PluggableExtentionKt.pluggableSpi$default(IOpenCCTUtils.class, false, false, false, 14, null);
        if (iOpenCCTUtils != null) {
            if (aweme != null && (awemeRawAd3 = aweme.getAwemeRawAd()) != null) {
                webUrl2 = awemeRawAd3.getWebUrl();
            } else {
                webUrl2 = null;
            }
            if (iOpenCCTUtils.LIZ(webUrl2)) {
                return true;
            }
        }
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.isOpenSystemBrowser() || (awemeRawAd2 = aweme.getAwemeRawAd()) == null || (webUrl = awemeRawAd2.getWebUrl()) == null || !C123100dR.LIZ(webUrl) || !LJIIJJI(aweme, str, str2) || LL(aweme) || aweme.getAuthor() == null || LIZJ(aweme)) {
            return false;
        }
        return true;
    }

    public static final boolean LLJJI(Aweme aweme, String str, String str2) {
        AutoPullUpConfig autoPullUpConfigLJIJJ;
        String webUrl;
        String openUrl;
        String str3;
        FinalJumpTargetPageConfig finalJumpTargetPageConfigVu;
        String webUrl2;
        AwemeRawAd awemeRawAd;
        IOpenCCTUtils iOpenCCTUtils = (IOpenCCTUtils) PluggableExtentionKt.pluggableSpi$default(IOpenCCTUtils.class, false, false, false, 14, null);
        if (iOpenCCTUtils != null) {
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                webUrl2 = awemeRawAd.getWebUrl();
            } else {
                webUrl2 = null;
            }
            if (iOpenCCTUtils.LIZ(webUrl2)) {
                return false;
            }
        }
        if (aweme == null) {
            return false;
        }
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null && C1017180cZo.LJJIJIIJI(awemeRawAd2)) {
            IAdWebUtils iAdWebUtils = (IAdWebUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUtils.class, false, false, false, 14, null);
            if (iAdWebUtils == null || (finalJumpTargetPageConfigVu = iAdWebUtils.Vu(aweme.getAwemeRawAd(), str, str2)) == null) {
                return false;
            }
            return finalJumpTargetPageConfigVu.getEnableAutoPullUp();
        }
        AwemeRawAd awemeRawAdLJJIJLIJ = LJJIJLIJ(aweme);
        if (awemeRawAdLJJIJLIJ == null || (autoPullUpConfigLJIJJ = LJIJJ(awemeRawAdLJJIJLIJ)) == null || autoPullUpConfigLJIJJ.getTriggerType() != AutoPullUpTriggerType.PROFILE_INITIAL.getValue() || !Intrinsics.LJFF(autoPullUpConfigLJIJJ.getUseEmbeddedSheet(), Boolean.TRUE)) {
            return false;
        }
        NativeSiteConfig nativeSiteConfig = awemeRawAdLJJIJLIJ.getNativeSiteConfig();
        if ((nativeSiteConfig == null || (str3 = nativeSiteConfig.lynxScheme) == null || str3.length() <= 0) && (((webUrl = awemeRawAdLJJIJLIJ.getWebUrl()) == null || webUrl.length() <= 0) && ((awemeRawAdLJJIJLIJ.getAdUrlType() != 1 || !C703302op.LIZ(awemeRawAdLJJIJLIJ.getOpenUrl())) && (!Intrinsics.LJFF(awemeRawAdLJJIJLIJ.getType(), "paid_content") || !C703302op.LIZ(awemeRawAdLJJIJLIJ.getOpenUrl()) || (openUrl = awemeRawAdLJJIJLIJ.getOpenUrl()) == null || !u.LJJIIJZLJL(openUrl, "aweme://paidcontent/innerfeed", false))))) {
            return false;
        }
        return true;
    }

    public static final boolean LLJJIJIL(Aweme aweme, String str, String str2) {
        AwemeRawAd awemeRawAd;
        String webUrl;
        AwemeRawAd awemeRawAd2;
        NativeSiteConfig nativeSiteConfig;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && LJIIJJI(aweme, str, str2)) {
            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
            String webUrl2 = null;
            if (((awemeRawAd3 != null && (nativeSiteConfig = awemeRawAd3.getNativeSiteConfig()) != null && (webUrl = nativeSiteConfig.lynxScheme) != null) || ((awemeRawAd = aweme.getAwemeRawAd()) != null && (webUrl = awemeRawAd.getWebUrl()) != null)) && C123100dR.LIZ(webUrl) && (((awemeRawAd2 = aweme.getAwemeRawAd()) == null || !awemeRawAd2.isOpenSystemBrowser()) && !LJIIJ(aweme) && !LIZJ(aweme))) {
                C844470XAv.LIZ.getClass();
                if (!LLLLII(C844470XAv.LIZ(), aweme) && (!LJJLJLI(aweme) || LJJLL(aweme))) {
                    IOpenCCTUtils iOpenCCTUtils = (IOpenCCTUtils) PluggableExtentionKt.pluggableSpi$default(IOpenCCTUtils.class, false, false, false, 14, null);
                    if (iOpenCCTUtils == null) {
                        return true;
                    }
                    AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
                    if (awemeRawAd4 != null) {
                        webUrl2 = awemeRawAd4.getWebUrl();
                    }
                    if (!iOpenCCTUtils.LIZ(webUrl2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LLJJIJI(com.ss.android.ugc.aweme.feed.model.Aweme r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            r4 = 0
            r1 = 1
            if (r12 != 0) goto L90
            if (r9 == 0) goto L90
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r9.getAwemeRawAd()
            if (r0 == 0) goto L90
            boolean r0 = X.C1017180cZo.LJJIJIIJI(r0)
            if (r0 != r1) goto L90
            java.lang.Class<com.ss.android.ugc.aweme.web.service.IAdWebUtils> r3 = com.ss.android.ugc.aweme.web.service.IAdWebUtils.class
            r7 = 14
            r8 = 0
            r5 = r4
            r6 = r4
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.web.service.IAdWebUtils r0 = (com.ss.android.ugc.aweme.web.service.IAdWebUtils) r0
            if (r0 == 0) goto L8e
            boolean r0 = r0.bv(r9, r10, r11, r4)
            if (r0 != r1) goto L8e
            r0 = 1
        L28:
            r3 = r0 ^ 1
        L2a:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.structure.api.ICommerceService> r0 = com.ss.android.ugc.aweme.structure.api.ICommerceService.class
            java.lang.Object r0 = r2.getService(r0)
            com.ss.android.ugc.aweme.structure.api.ICommerceService r0 = (com.ss.android.ugc.aweme.structure.api.ICommerceService) r0
            com.ss.android.ugc.aweme.api.IFeedService r0 = r0.LIZIZ()
            X.0cMV r0 = r0.LJ()
            r2 = 0
            if (r0 == 0) goto L8c
            X.0cZq r0 = r0.LJIL()
            if (r0 == 0) goto L8c
            if (r9 == 0) goto L4d
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r9.getAwemeRawAd()
        L4d:
            X.0cZt r0 = r0.LIZ(r2)
            if (r0 == 0) goto L8c
            java.lang.String r0 = r0.LIZLLL
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L8c
            r2 = 1
        L5c:
            if (r3 == 0) goto L75
            if (r9 == 0) goto L76
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r9.getAwemeRawAd()
            if (r0 == 0) goto L76
            boolean r0 = r0.isOpenSystemBrowser()
            if (r0 != r1) goto L76
        L6c:
            boolean r0 = LJLILLLLZI(r9)
            if (r0 == 0) goto L74
            if (r2 == 0) goto L75
        L74:
            r4 = 1
        L75:
            return r4
        L76:
            java.lang.Class<com.ss.android.ugc.aweme.cct.IOpenCCTUtils> r3 = com.ss.android.ugc.aweme.cct.IOpenCCTUtils.class
            r7 = 14
            r8 = 0
            r5 = r4
            r6 = r4
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.cct.IOpenCCTUtils r0 = (com.ss.android.ugc.aweme.cct.IOpenCCTUtils) r0
            if (r0 == 0) goto L75
            boolean r0 = r0.LIZLLL(r9)
            if (r0 != r1) goto L75
            goto L6c
        L8c:
            r2 = 0
            goto L5c
        L8e:
            r0 = 0
            goto L28
        L90:
            r3 = 1
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1017070cZd.LLJJIJI(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, boolean):boolean");
    }
}
