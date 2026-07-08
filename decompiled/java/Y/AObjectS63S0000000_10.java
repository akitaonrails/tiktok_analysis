package Y;

import X.C0PHG;
import X.C0PKD;
import X.C1807670x8n;
import X.InterfaceC2217461Bqa;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.ecommerce.search.general.clicksearch.EcSearchCSCardProtocol;
import com.ss.android.ugc.aweme.ecommerce.search.general.productcard.EcSearchProductCardProtocol;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.search.arch.v2.biz.rs.SearchRSCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.biz.rs.SearchRSCardSingleProtocol;
import com.ss.android.ugc.aweme.search.ecommerce.core.ui.ECStoreCardLiveProtocol;
import com.ss.android.ugc.aweme.search.ecommerce.core.ui.ECStoreCardLiveV1Protocol;
import com.ss.android.ugc.aweme.search.ecommerce.core.ui.ECStoreCardLiveV2Protocol;
import com.ss.android.ugc.aweme.search.ecommerce.core.ui.ECStoreCardLiveV3Protocol;
import com.ss.android.ugc.aweme.search.ecommerce.core.ui.ECStoreCardNoLiveNewProtocol;
import com.ss.android.ugc.aweme.search.ecommerce.core.ui.ECStoreCardNoLiveProtocol;
import com.ss.android.ugc.aweme.search.ecommerce.core.ui.ECStoreCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.bot.waiting.SearchTakoWaitingListCard;
import com.ss.android.ugc.aweme.search.pages.result.common.lynxwithvideo.protocol.SearchLynxWithVideoCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.communicate.SearchLemon8PhotoCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.bottomanchors.protocol.SearchPhotoCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.inspire.protocol.SearchInspireSpreadingCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.common.protocol.AggregatedVideoCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.music.protocol.MusicAggregatedVideoCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.ailivephoto.SearchAILivePhotoCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.aisummarycard.SearchAdAISummaryCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.hybrid.SearchAdBrandZoneHybridProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.hybrid.SearchMultiAdHybridProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.hybrid.SearchSingleAdHybridProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.mixedcreativecard.SearchAdMixedCreativeCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.mixedcreativecard.SearchAdMixedCreativeMiddleCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.mixedcreativecard.SearchAdMixedCreativeSmallCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.mixlive.SearchMixLiveAdCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.oleproductaggregationcard.SearchAdOLEProductAggregationCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.photo.SearchAdProductPhotoCard;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.photo.SearchCarouselAdsCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand.SearchAdBrandZoneProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.topsinglecard.SearchAdTopLiveSingleCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.topsinglecard.SearchAdTopPhotoSingleCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.topsinglecard.SearchAdTopVideoSingleCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.protocol.SearchCSCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.protocol.SearchCSSingleCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.dislike.core.protocol.SearchSkeletonCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.ecommerce.mixlive.EcSearchMixLiveCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.helppost.protocol.SearchHelpPostCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.core.SearchMinisCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.mixlive.protocol.SearchMixLiveCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.tako.SearchTakoSugCard;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.tako.newbot.SearchTakoNewBotCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.viralsong.SearchViralSongCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.protocol.SearchLynxHeaderItemProtocol;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.protocol.SearchQueryCorrectCardProtocol;
import com.ss.android.ugc.aweme.search.pages.result.weakentity.SearchWeakEntityCardProtocol;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.videmodel.TakoFeedRightBottomEntranceViewModel;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedSearchBottomBarAssem;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public class AObjectS63S0000000_10 implements Function0 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            case 40:
                return invoke$40(this);
            case 41:
                return invoke$41(this);
            case 42:
                return invoke$42(this);
            case 43:
                return invoke$43(this);
            case 44:
                return invoke$44(this);
            case 45:
                return invoke$45(this);
            case 46:
                return invoke$46(this);
            case 47:
                return invoke$47(this);
            case 48:
                return invoke$48(this);
            case 49:
                return invoke$49(this);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this);
            case 51:
                return invoke$51(this);
            case 52:
                return invoke$52(this);
            case 53:
                return invoke$53(this);
            case 54:
                return invoke$54(this);
            case 55:
                return invoke$55(this);
            case 56:
                return invoke$56(this);
            case 57:
                return invoke$57(this);
            case 58:
                return invoke$58(this);
            case 59:
                return invoke$59(this);
            case 60:
                return invoke$60(this);
            case 61:
                return invoke$61(this);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this);
            case 63:
                return invoke$63(this);
            case 64:
                return invoke$64(this);
            case 65:
                return invoke$65(this);
            case 66:
                return invoke$66(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = FeedSearchBottomBarAssem.LLLZLL;
        return new TakoFeedRightBottomEntranceViewModel();
    }

    public static final Object invoke$1(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchSingleAdHybridProtocol();
    }

    public static final Object invoke$10(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchAdMixedCreativeSmallCardProtocol();
    }

    public static final Object invoke$11(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchWeakEntityCardProtocol();
    }

    public static final Object invoke$12(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return C1807670x8n.LLZZ();
    }

    public static final Object invoke$13(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return C1807670x8n.i();
    }

    public static final Object invoke$14(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchMixLiveAdCardProtocol();
    }

    public static final Object invoke$15(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return C1807670x8n.j();
    }

    public static final Object invoke$16(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchAdOLEProductAggregationCardProtocol();
    }

    public static final Object invoke$17(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new ECStoreCardLiveV1Protocol();
    }

    public static final Object invoke$18(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchAdProductPhotoCard();
    }

    public static final Object invoke$19(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return C1807670x8n.k();
    }

    public static final Object invoke$2(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchTakoWaitingListCard();
    }

    public static final Object invoke$20(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchRSCardSingleProtocol();
    }

    public static final Object invoke$21(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return C1807670x8n.l();
    }

    public static final Object invoke$22(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new EcSearchCSCardProtocol();
    }

    public static final Object invoke$23(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchCarouselAdsCardProtocol();
    }

    public static final Object invoke$24(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return C1807670x8n.m();
    }

    public static final Object invoke$25(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return C1807670x8n.a();
    }

    public static final Object invoke$26(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchAdBrandZoneProtocol();
    }

    public static final Object invoke$27(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new ECStoreCardLiveV2Protocol();
    }

    public static final Object invoke$28(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new EcSearchProductCardProtocol();
    }

    public static final Object invoke$29(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchAdTopLiveSingleCardProtocol();
    }

    public static final Object invoke$3(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchLynxWithVideoCardProtocol();
    }

    public static final Object invoke$30(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return C1807670x8n.LLZZJLIL();
    }

    public static final Object invoke$31(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return C1807670x8n.b();
    }

    public static final Object invoke$32(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchAdTopPhotoSingleCardProtocol();
    }

    public static final Object invoke$33(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new ECStoreCardLiveV3Protocol();
    }

    public static final Object invoke$34(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return C1807670x8n.c();
    }

    public static final Object invoke$35(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchAdTopVideoSingleCardProtocol();
    }

    public static final Object invoke$36(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new ECStoreCardNoLiveNewProtocol();
    }

    public static final Object invoke$37(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return C1807670x8n.d();
    }

    public static final Object invoke$38(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchCSCardProtocol();
    }

    public static final Object invoke$39(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new ECStoreCardNoLiveProtocol();
    }

    public static final Object invoke$4(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchAdMixedCreativeCardProtocol();
    }

    public static final Object invoke$40(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return C1807670x8n.e();
    }

    public static final Object invoke$41(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchTakoCardProtocol();
    }

    public static final Object invoke$42(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return C1807670x8n.LLZZLLIL();
    }

    public static final Object invoke$43(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return C1807670x8n.f();
    }

    public static final Object invoke$44(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchCSSingleCardProtocol();
    }

    public static final Object invoke$45(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return C1807670x8n.LLZZZIL();
    }

    public static final Object invoke$46(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return C1807670x8n.g();
    }

    public static final Object invoke$47(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchSkeletonCardProtocol();
    }

    public static final Object invoke$48(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchLemon8PhotoCardProtocol();
    }

    public static final Object invoke$49(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return C1807670x8n.h();
    }

    public static final Object invoke$5(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchLynxHeaderItemProtocol();
    }

    public static final Object invoke$50(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new EcSearchMixLiveCardProtocol();
    }

    public static final Object invoke$51(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return C1807670x8n.LLZZZZ();
    }

    public static final Object invoke$52(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new AggregatedVideoCardProtocol();
    }

    public static final Object invoke$53(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchHelpPostCardProtocol();
    }

    public static final Object invoke$54(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new ECStoreCardProtocol();
    }

    public static final Object invoke$55(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new ECStoreCardLiveProtocol();
    }

    public static final Object invoke$56(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new MusicAggregatedVideoCardProtocol();
    }

    public static final Object invoke$57(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchMinisCardProtocol();
    }

    public static final Object invoke$58(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchAILivePhotoCardProtocol();
    }

    public static final Object invoke$59(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchMixLiveCardProtocol();
    }

    public static final Object invoke$6(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchPhotoCardProtocol();
    }

    public static final Object invoke$60(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchRSCardProtocol();
    }

    public static final Object invoke$61(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchTakoSugCard();
    }

    public static final Object invoke$62(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchAdAISummaryCardProtocol();
    }

    public static final Object invoke$63(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchTakoNewBotCardProtocol();
    }

    public static final Object invoke$64(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchAdBrandZoneHybridProtocol();
    }

    public static final Object invoke$65(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchViralSongCardProtocol();
    }

    public static final Object invoke$66(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchMultiAdHybridProtocol();
    }

    public static final Object invoke$7(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchAdMixedCreativeMiddleCardProtocol();
    }

    public static final Object invoke$8(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchQueryCorrectCardProtocol();
    }

    public static final Object invoke$9(AObjectS63S0000000_10 aObjectS63S0000000_10) {
        return new SearchInspireSpreadingCardProtocol();
    }

    public AObjectS63S0000000_10(C0PHG c0phg, int i) {
        this.$t = i;
    }

    public AObjectS63S0000000_10(C0PKD c0pkd, int i) {
        this.$t = i;
    }

    public AObjectS63S0000000_10(FeedSearchBottomBarAssem feedSearchBottomBarAssem, int i) {
        this.$t = i;
    }
}
