package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.commercialize.model.AdStyleActionModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.commercialize.model.FakeAuthor;
import com.ss.android.ugc.aweme.commercialize.model.JumpTargetPageConfig;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.commercialize.model.ucp.AcShopData;
import com.ss.android.ugc.aweme.feed.model.AutoPullUpConfig;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.MiniCardDeeplinkModel;
import com.ss.android.ugc.aweme.feed.model.MiniCardModel;
import com.ss.android.ugc.aweme.feed.model.ad.AdOneStopLandingPageConfig;
import com.ss.android.ugc.aweme.feed.model.ad.PlayableData;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cZo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017180cZo {
    public static final boolean LIZ(AwemeRawAd awemeRawAd) {
        if (LJIIIIZZ(awemeRawAd) == 2) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(AwemeRawAd awemeRawAd) {
        Integer numValueOf;
        AutoPullUpConfig autoPullUpConfigLJIJJ = C1017070cZd.LJIJJ(awemeRawAd);
        if (autoPullUpConfigLJIJJ != null) {
            numValueOf = Integer.valueOf(autoPullUpConfigLJIJJ.getFlag());
        } else {
            numValueOf = null;
        }
        return C08A4.LIZ(numValueOf);
    }

    public static final boolean LIZLLL(AwemeRawAd awemeRawAd) {
        MiniCardModel miniCardModel;
        if (awemeRawAd == null || (miniCardModel = awemeRawAd.getMiniCardModel()) == null || miniCardModel.getAvatarIconType() != 1) {
            return false;
        }
        return true;
    }

    public static final int LJIIIIZZ(AwemeRawAd awemeRawAd) {
        MiniCardModel miniCardModel;
        if (awemeRawAd != null && (miniCardModel = awemeRawAd.getMiniCardModel()) != null) {
            return miniCardModel.getCardType();
        }
        return 0;
    }

    public static final String LJIIIZ(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null) {
            MiniCardModel miniCardModel = awemeRawAd.getMiniCardModel();
            if (miniCardModel != null && miniCardModel.getCardType() == 1) {
                return "xiaomi";
            }
            MiniCardModel miniCardModel2 = awemeRawAd.getMiniCardModel();
            if (miniCardModel2 != null && miniCardModel2.getCardType() == 2) {
                return "gp_card";
            }
            MiniCardModel miniCardModel3 = awemeRawAd.getMiniCardModel();
            if (miniCardModel3 != null && miniCardModel3.getCardType() == 3) {
                return "samsung";
            }
        }
        if (!LJJ(awemeRawAd)) {
            return null;
        }
        return "samsung";
    }

    public static final int LJIIJ(AwemeRawAd awemeRawAd) {
        MiniCardModel miniCardModel = awemeRawAd.getMiniCardModel();
        if (miniCardModel != null) {
            return miniCardModel.getShowAfterVideoPlayTimes();
        }
        return 0;
    }

    public static final boolean LJIIJJI(AwemeRawAd awemeRawAd) {
        String str;
        NativeSiteConfig nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
        String str2 = null;
        if (nativeSiteConfig != null) {
            str = nativeSiteConfig.renderType;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "lynx")) {
            NativeSiteConfig nativeSiteConfig2 = awemeRawAd.getNativeSiteConfig();
            if (nativeSiteConfig2 != null) {
                str2 = nativeSiteConfig2.lynxScheme;
            }
            if (!TextUtils.isEmpty(str2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIIL(AwemeRawAd awemeRawAd) {
        NativeSiteConfig nativeSiteConfig;
        if (awemeRawAd != null && awemeRawAd.getNonNativeClick() == 0 && (nativeSiteConfig = awemeRawAd.getNativeSiteConfig()) != null && TextUtils.equals(nativeSiteConfig.renderType, "lynx") && !TextUtils.isEmpty(nativeSiteConfig.lynxScheme)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILIIL(AwemeRawAd awemeRawAd) {
        MiniCardModel miniCardModel;
        if (awemeRawAd == null || (miniCardModel = awemeRawAd.getMiniCardModel()) == null || miniCardModel.getMiniCardLeftSlideOpenType() != 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILJJIL(AwemeRawAd awemeRawAd) {
        PlayableData playableData;
        Integer num;
        if ((awemeRawAd != null && (playableData = awemeRawAd.getPlayableData()) != null && (num = playableData.playableType) != null && num.intValue() == 1) || LJIILL(awemeRawAd)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILL(AwemeRawAd awemeRawAd) {
        PlayableData playableData;
        Integer num;
        if (awemeRawAd == null || (playableData = awemeRawAd.getPlayableData()) == null || (num = playableData.playableType) == null || num.intValue() != 3) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILLIIL(AwemeRawAd awemeRawAd) {
        MiniCardModel miniCardModel;
        if (awemeRawAd == null || (miniCardModel = awemeRawAd.getMiniCardModel()) == null || !miniCardModel.getAutoDownload()) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIZILJ(AwemeRawAd awemeRawAd) {
        PlayableData playableData;
        Integer num;
        if (awemeRawAd == null || (playableData = awemeRawAd.getPlayableData()) == null || (num = playableData.playableType) == null || num.intValue() != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LJIJ(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null || awemeRawAd.getPreviewOnlyMode() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJIJI(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null) {
            if (LJIJJLI(awemeRawAd) || LJIJJ(awemeRawAd)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIJJ(AwemeRawAd awemeRawAd) {
        AwemeSearchAdModel searchAdInfo;
        if (awemeRawAd == null || (searchAdInfo = awemeRawAd.getSearchAdInfo()) == null) {
            return false;
        }
        Integer num = searchAdInfo.searchFormatType;
        int value = EnumC2008707tt.SEARCH_IAC_MULTI_AD_MULTI_PRODUCT.getValue();
        if (num == null || num.intValue() != value) {
            return false;
        }
        return true;
    }

    public static final boolean LJIJJLI(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null) {
            AwemeSearchAdModel searchAdInfo = awemeRawAd.getSearchAdInfo();
            if (searchAdInfo != null) {
                Integer num = searchAdInfo.searchFormatType;
                int value = EnumC2008707tt.SEARCH_IAC_SINGLE_AD_SINGLE_PRODUCT.getValue();
                if (num != null && num.intValue() == value) {
                    return true;
                }
            }
            AwemeSearchAdModel searchAdInfo2 = awemeRawAd.getSearchAdInfo();
            if (searchAdInfo2 != null) {
                Integer num2 = searchAdInfo2.searchFormatType;
                int value2 = EnumC2008707tt.SEARCH_IAC_SINGLE_AD_MULTI_PRODUCT.getValue();
                if (num2 != null && num2.intValue() == value2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIL(AwemeRawAd awemeRawAd) {
        AwemeSearchAdModel searchAdInfo;
        if (awemeRawAd != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null) {
            return Intrinsics.LJFF(searchAdInfo.isMSEAd(), Boolean.TRUE);
        }
        return false;
    }

    public static final boolean LJJ(AwemeRawAd awemeRawAd) {
        IFeedService iFeedServiceLIZIZ;
        InterfaceC1017820caq interfaceC1017820caqLJIILIIL;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        AnoleComponentModel anoleComponentModel;
        ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
        if (iCommerceService == null || (iFeedServiceLIZIZ = iCommerceService.LIZIZ()) == null || (interfaceC1017820caqLJIILIIL = iFeedServiceLIZIZ.LJIILIIL()) == null || !interfaceC1017820caqLJIILIIL.LJIIIZ(awemeRawAd) || awemeRawAd == null || (anoleModel = awemeRawAd.getAnoleModel()) == null || (map = anoleModel.components) == null || (anoleComponentModel = map.get("mini_card")) == null) {
            return false;
        }
        return TextUtils.equals(anoleComponentModel.slotID, EnumC696280RSw.TT_FEED_MINICARD_HALF_SCREEN_BOTTOM.getSlotName());
    }

    public static final boolean LJJI(AwemeRawAd awemeRawAd) {
        String awesomeSplashId;
        AwemeSplashInfo splashInfo;
        if (awemeRawAd != null && (splashInfo = awemeRawAd.getSplashInfo()) != null) {
            awesomeSplashId = splashInfo.getAwesomeSplashId();
        } else {
            awesomeSplashId = null;
        }
        return !TextUtils.isEmpty(awesomeSplashId);
    }

    public static final boolean LJJIFFI(AwemeRawAd awemeRawAd) {
        String awesomeSplashId;
        AwemeSplashInfo splashInfo;
        AwemeSplashInfo splashInfo2;
        if (awemeRawAd != null && (splashInfo2 = awemeRawAd.getSplashInfo()) != null) {
            awesomeSplashId = splashInfo2.getAwesomeSplashId();
        } else {
            awesomeSplashId = null;
        }
        if (TextUtils.isEmpty(awesomeSplashId) || awemeRawAd == null || (splashInfo = awemeRawAd.getSplashInfo()) == null || splashInfo.getSplashFeedType() != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LJJII(AwemeRawAd awemeRawAd) {
        Map<String, Map<String, Object>> map;
        String host;
        Uri uri;
        AcShopData acShopData = awemeRawAd.getAcShopData();
        if (acShopData != null && (map = acShopData.products) != null && (!map.isEmpty())) {
            String openUrl = awemeRawAd.getOpenUrl();
            if (openUrl != null && (uri = UriProtector.parse(openUrl)) != null) {
                host = uri.getHost();
            } else {
                host = null;
            }
            if (Intrinsics.LJFF(host, "acshop")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJJIII(AwemeRawAd awemeRawAd) {
        AwemeSearchAdModel searchAdInfo = awemeRawAd.getSearchAdInfo();
        if (searchAdInfo != null) {
            return Intrinsics.LJFF(searchAdInfo.isV2LWithProduct(), Boolean.TRUE);
        }
        return false;
    }

    public static final boolean LJJIIJ(AwemeRawAd awemeRawAd) {
        FakeAuthor fakeAuthor = awemeRawAd.getFakeAuthor();
        if (fakeAuthor != null) {
            return Intrinsics.LJFF(fakeAuthor.getAutoShowWebview(), Boolean.TRUE);
        }
        return false;
    }

    public static final boolean LJJIIJZLJL(AwemeRawAd awemeRawAd) {
        AdOneStopLandingPageConfig adOneStopLandingPageConfig;
        Integer style;
        AdStyleActionModel adStyleActionModel = awemeRawAd.getAdStyleActionModel();
        if (adStyleActionModel != null && (adOneStopLandingPageConfig = adStyleActionModel.landingPageConfig) != null && (style = adOneStopLandingPageConfig.getStyle()) != null && style.intValue() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIIZI(AwemeRawAd awemeRawAd) {
        FakeAuthor fakeAuthor = awemeRawAd.getFakeAuthor();
        if (fakeAuthor != null && fakeAuthor.getShouldShowBanner()) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIJ(AwemeRawAd awemeRawAd) {
        FakeAuthor fakeAuthor;
        Integer fakeAuthorVersion;
        if (awemeRawAd != null && (fakeAuthor = awemeRawAd.getFakeAuthor()) != null && (fakeAuthorVersion = fakeAuthor.getFakeAuthorVersion()) != null && fakeAuthorVersion.intValue() == 2) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIJIIJI(AwemeRawAd awemeRawAd) {
        AdStyleActionModel adStyleActionModel;
        JumpTargetPageConfig jumpTargetPageConfig;
        if (awemeRawAd != null && (adStyleActionModel = awemeRawAd.getAdStyleActionModel()) != null && (jumpTargetPageConfig = adStyleActionModel.jumpTargetPageConfig) != null && jumpTargetPageConfig.getClickPosition() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(AwemeRawAd awemeRawAd, String str) {
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        Collection<AnoleComponentModel> collectionValues;
        if (awemeRawAd == null || (anoleModel = awemeRawAd.getAnoleModel()) == null || (map = anoleModel.components) == null || (collectionValues = map.values()) == null || collectionValues.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(((AnoleComponentModel) it2.next()).slotID, str)) {
                return true;
            }
        }
        return false;
    }

    public static final int LJ(Context context, AwemeRawAd awemeRawAd) {
        AwemeTextLabelModel label;
        if (awemeRawAd != null && (label = awemeRawAd.getLabel()) != null) {
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

    public static final int LJFF(Context context, AwemeRawAd awemeRawAd) {
        AwemeTextLabelModel label;
        if (awemeRawAd != null && (label = awemeRawAd.getLabel()) != null) {
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

    public static final String LJI(AwemeRawAd awemeRawAd, boolean z) {
        MiniCardDeeplinkModel deeplink;
        MiniCardModel miniCardModel;
        if (awemeRawAd != null && (miniCardModel = awemeRawAd.getMiniCardModel()) != null) {
            deeplink = miniCardModel.getDeeplink();
        } else {
            deeplink = null;
        }
        if (z) {
            if (LJIILLIIL(awemeRawAd)) {
                if (deeplink == null) {
                    return null;
                }
                return deeplink.getFullScreenAutoInstallDL();
            }
            if (deeplink == null) {
                return null;
            }
            return deeplink.getFullScreenDL();
        }
        if (LJIILLIIL(awemeRawAd)) {
            if (deeplink == null) {
                return null;
            }
            return deeplink.getHalfScreenAutoInstallDL();
        }
        if (deeplink == null) {
            return null;
        }
        return deeplink.getHalfScreenDL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        if (r2 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJJIIZ(com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4, boolean r5) {
        /*
            r1 = 0
            if (r4 == 0) goto L7
            java.lang.String r1 = r4.getType()
        L7:
            java.lang.String r0 = "web"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r3 = 0
            if (r0 != 0) goto L11
            return r3
        L11:
            if (r5 == 0) goto L20
            com.ss.android.ugc.aweme.commercialize.model.AdWebUrlDataFromJsb r0 = r4.getAdWebUrlDataFromJsb()
            if (r0 == 0) goto L1f
            java.lang.String r2 = r0.getWebUrl()
        L1d:
            if (r2 != 0) goto L2f
        L1f:
            return r3
        L20:
            com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig r0 = r4.getNativeSiteConfig()
            if (r0 == 0) goto L2a
            java.lang.String r2 = r0.lynxScheme
            if (r2 != 0) goto L2f
        L2a:
            java.lang.String r2 = r4.getWebUrl()
            goto L1d
        L2f:
            int r0 = r2.length()
            r1 = 1
            if (r0 == 0) goto L4f
            java.lang.String r0 = "aweme://lynxview"
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r2, r0, r3)
            if (r0 != 0) goto L4f
            com.ss.android.ugc.aweme.feed.model.LandingPageConfig r0 = r4.getLandingPageConfig()
            if (r0 == 0) goto L4f
            java.lang.Integer r0 = r0.webWatchWhileLoadingType
            if (r0 == 0) goto L4f
            int r0 = r0.intValue()
            if (r0 != r1) goto L4f
            r3 = 1
        L4f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1017180cZo.LJJIIZ(com.ss.android.ugc.aweme.feed.model.AwemeRawAd, boolean):boolean");
    }

    public static final String LJII(AwemeRawAd awemeRawAd, boolean z, boolean z2) {
        if (z) {
            return LJI(awemeRawAd, LJIILIIL(awemeRawAd));
        }
        return LJI(awemeRawAd, z2);
    }
}
