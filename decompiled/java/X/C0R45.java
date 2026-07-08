package X;

import Y.ACListenerS82S1100000_10;
import Y.AObserverS214S0100000_10;
import Y.ARunnableS110S0100000_10;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.ecommerce.search.general.storecard.widget.EcHintInfoAssem;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardLivePlayerAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoPlayerAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.grid.subcard.assem.ProductAggregationSubCardAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.subcard.assem.SearchSubCardAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchCardCommonAbilityImpl;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchCardMobAbilityImpl;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$SearchTakoSugListComponent$ISearchTakoSugListAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.ui.SearchList;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAbility;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoSugCell;
import com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem.Lemon8FakeAutoplayMobAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchlive.core.ui.SearchLiveCardBottomAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoHolder;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchCLASubtitleCommonAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.utils.SearchPhotoCoverLabelAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.ImageLandingLoadingItemAssem;
import com.ss.android.ugc.aweme.search.pages.result.photosearch.SearchCardCellCommonAbilityImpl;
import com.ss.android.ugc.aweme.search.pages.result.pov.landingpage.ui.IPovLandingPageFragmentAbility;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.FoldableSectionHeaderAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.aisummarycard.SearchAdAISummaryCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.hybrid.SearchAdHybridContentAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.hybrid.logger.BshCardVisibilityManager;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.mixedcreativecard.SearchAdMixedCreativeCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.oleproductaggregationcard.SearchAdOLEProductAggregationCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.photo.SearchAdPhotoCardContentAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand.SearchAdBrandZoneContentAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand.SearchBrandZoneAutoPlayCardHelper;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.topsinglecard.SearchAdTopLiveSingleCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.topsinglecard.SearchAdTopPhotoSingleCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.topsinglecard.SearchAdTopVideoSingleCardAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.mixlive.ui.SearchMixLiveCardContentAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.tako.SearchTakoSugCardAssem;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.components.video.singlevideo.TakoSingleVideoAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.video.videocitation.VideoCitationAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.video.videolist.TakoVideoListAssem;
import com.ss.android.ugc.aweme.tako.model.TakoSearchCarryInItem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0R45, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R45 implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    public static final void onViewAttachedToWindow$10(C0R45 c0r45, View view) {
    }

    public static final void onViewAttachedToWindow$12(C0R45 c0r45, View view) {
    }

    public static final void onViewAttachedToWindow$25(C0R45 c0r45, View view) {
    }

    public static final void onViewAttachedToWindow$47(C0R45 c0r45, View view) {
    }

    public static final void onViewAttachedToWindow$48(C0R45 c0r45, View view) {
    }

    public static final void onViewAttachedToWindow$9(C0R45 c0r45, View view) {
    }

    public static final void onViewDetachedFromWindow$0(C0R45 c0r45, View view) {
    }

    public static final void onViewDetachedFromWindow$13(C0R45 c0r45, View view) {
    }

    public static final void onViewDetachedFromWindow$14(C0R45 c0r45, View view) {
    }

    public static final void onViewDetachedFromWindow$15(C0R45 c0r45, View view) {
    }

    public static final void onViewDetachedFromWindow$33(C0R45 c0r45, View view) {
    }

    public static final void onViewDetachedFromWindow$34(C0R45 c0r45, View view) {
    }

    public static final void onViewDetachedFromWindow$35(C0R45 c0r45, View view) {
    }

    public static final void onViewDetachedFromWindow$37(C0R45 c0r45, View view) {
    }

    public static final void onViewDetachedFromWindow$38(C0R45 c0r45, View view) {
    }

    public static final void onViewDetachedFromWindow$45(C0R45 c0r45, View view) {
    }

    public static final void onViewDetachedFromWindow$5(C0R45 c0r45, View view) {
    }

    public static final void onViewDetachedFromWindow$50(C0R45 c0r45, View view) {
    }

    public static final void onViewDetachedFromWindow$8(C0R45 c0r45, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
            case 2:
                onViewAttachedToWindow$2(this, view);
                break;
            case 3:
                onViewAttachedToWindow$3(this, view);
                break;
            case 4:
                onViewAttachedToWindow$4(this, view);
                break;
            case 5:
                onViewAttachedToWindow$5(this, view);
                break;
            case 6:
                onViewAttachedToWindow$6(this, view);
                break;
            case 7:
                onViewAttachedToWindow$7(this, view);
                break;
            case 8:
                onViewAttachedToWindow$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onViewAttachedToWindow$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onViewAttachedToWindow$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onViewAttachedToWindow$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onViewAttachedToWindow$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onViewAttachedToWindow$13(this, view);
                break;
            case 14:
                onViewAttachedToWindow$14(this, view);
                break;
            case 15:
                onViewAttachedToWindow$15(this, view);
                break;
            case 16:
                onViewAttachedToWindow$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onViewAttachedToWindow$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onViewAttachedToWindow$18(this, view);
                break;
            case 19:
                onViewAttachedToWindow$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onViewAttachedToWindow$20(this, view);
                break;
            case 21:
                onViewAttachedToWindow$21(this, view);
                break;
            case 22:
                onViewAttachedToWindow$22(this, view);
                break;
            case 23:
                onViewAttachedToWindow$23(this, view);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onViewAttachedToWindow$24(this, view);
                break;
            case 25:
                onViewAttachedToWindow$25(this, view);
                break;
            case 26:
                onViewAttachedToWindow$26(this, view);
                break;
            case 27:
                onViewAttachedToWindow$27(this, view);
                break;
            case 28:
                onViewAttachedToWindow$28(this, view);
                break;
            case 29:
                onViewAttachedToWindow$29(this, view);
                break;
            case 30:
                onViewAttachedToWindow$30(this, view);
                break;
            case 31:
                onViewAttachedToWindow$31(this, view);
                break;
            case 32:
                onViewAttachedToWindow$32(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onViewAttachedToWindow$33(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onViewAttachedToWindow$34(this, view);
                break;
            case 35:
                onViewAttachedToWindow$35(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onViewAttachedToWindow$36(this, view);
                break;
            case 37:
                onViewAttachedToWindow$37(this, view);
                break;
            case 38:
                onViewAttachedToWindow$38(this, view);
                break;
            case 39:
                onViewAttachedToWindow$39(this, view);
                break;
            case 40:
                onViewAttachedToWindow$40(this, view);
                break;
            case 41:
                onViewAttachedToWindow$41(this, view);
                break;
            case 42:
                onViewAttachedToWindow$42(this, view);
                break;
            case 43:
                onViewAttachedToWindow$43(this, view);
                break;
            case 44:
                onViewAttachedToWindow$44(this, view);
                break;
            case 45:
                onViewAttachedToWindow$45(this, view);
                break;
            case 46:
                onViewAttachedToWindow$46(this, view);
                break;
            case 47:
                onViewAttachedToWindow$47(this, view);
                break;
            case 48:
                onViewAttachedToWindow$48(this, view);
                break;
            case 49:
                onViewAttachedToWindow$49(this, view);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                onViewAttachedToWindow$50(this, view);
                break;
            case 51:
                onViewAttachedToWindow$51(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
            case 2:
                onViewDetachedFromWindow$2(this, view);
                break;
            case 3:
                onViewDetachedFromWindow$3(this, view);
                break;
            case 4:
                onViewDetachedFromWindow$4(this, view);
                break;
            case 5:
                onViewDetachedFromWindow$5(this, view);
                break;
            case 6:
                onViewDetachedFromWindow$6(this, view);
                break;
            case 7:
                onViewDetachedFromWindow$7(this, view);
                break;
            case 8:
                onViewDetachedFromWindow$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onViewDetachedFromWindow$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onViewDetachedFromWindow$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onViewDetachedFromWindow$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onViewDetachedFromWindow$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onViewDetachedFromWindow$13(this, view);
                break;
            case 14:
                onViewDetachedFromWindow$14(this, view);
                break;
            case 15:
                onViewDetachedFromWindow$15(this, view);
                break;
            case 16:
                onViewDetachedFromWindow$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onViewDetachedFromWindow$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onViewDetachedFromWindow$18(this, view);
                break;
            case 19:
                onViewDetachedFromWindow$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onViewDetachedFromWindow$20(this, view);
                break;
            case 21:
                onViewDetachedFromWindow$21(this, view);
                break;
            case 22:
                onViewDetachedFromWindow$22(this, view);
                break;
            case 23:
                onViewDetachedFromWindow$23(this, view);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onViewDetachedFromWindow$24(this, view);
                break;
            case 25:
                onViewDetachedFromWindow$25(this, view);
                break;
            case 26:
                onViewDetachedFromWindow$26(this, view);
                break;
            case 27:
                onViewDetachedFromWindow$27(this, view);
                break;
            case 28:
                onViewDetachedFromWindow$28(this, view);
                break;
            case 29:
                onViewDetachedFromWindow$29(this, view);
                break;
            case 30:
                onViewDetachedFromWindow$30(this, view);
                break;
            case 31:
                onViewDetachedFromWindow$31(this, view);
                break;
            case 32:
                onViewDetachedFromWindow$32(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onViewDetachedFromWindow$33(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onViewDetachedFromWindow$34(this, view);
                break;
            case 35:
                onViewDetachedFromWindow$35(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onViewDetachedFromWindow$36(this, view);
                break;
            case 37:
                onViewDetachedFromWindow$37(this, view);
                break;
            case 38:
                onViewDetachedFromWindow$38(this, view);
                break;
            case 39:
                onViewDetachedFromWindow$39(this, view);
                break;
            case 40:
                onViewDetachedFromWindow$40(this, view);
                break;
            case 41:
                onViewDetachedFromWindow$41(this, view);
                break;
            case 42:
                onViewDetachedFromWindow$42(this, view);
                break;
            case 43:
                onViewDetachedFromWindow$43(this, view);
                break;
            case 44:
                onViewDetachedFromWindow$44(this, view);
                break;
            case 45:
                onViewDetachedFromWindow$45(this, view);
                break;
            case 46:
                onViewDetachedFromWindow$46(this, view);
                break;
            case 47:
                onViewDetachedFromWindow$47(this, view);
                break;
            case 48:
                onViewDetachedFromWindow$48(this, view);
                break;
            case 49:
                onViewDetachedFromWindow$49(this, view);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                onViewDetachedFromWindow$50(this, view);
                break;
            case 51:
                onViewDetachedFromWindow$51(this, view);
                break;
        }
    }

    public C0R45(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$0(C0R45 c0r45, View view) {
        C662860PzI.LJIILIIL(C1558520qew.LJIIL((EcHintInfoAssem) c0r45.l0), "tiktokec_personalized_search_text_show");
    }

    public static final void onViewAttachedToWindow$1(C0R45 c0r45, View view) {
        SearchCardVideoPlayerAssem searchCardVideoPlayerAssem = (SearchCardVideoPlayerAssem) c0r45.l0;
        searchCardVideoPlayerAssem.getClass();
        C036E.LIZ.LIZ(searchCardVideoPlayerAssem.LLLIIL);
    }

    public static final void onViewAttachedToWindow$11(C0R45 c0r45, View view) {
        ((SearchVideoHolder) c0r45.l0).onViewAttachedToWindow();
    }

    public static final void onViewAttachedToWindow$13(C0R45 c0r45, View view) {
        C1390410mHn c1390410mHn = ((ImageLandingLoadingItemAssem) c0r45.l0).LLJLILLLLZIIL;
        if (c1390410mHn != null) {
            C786410Ut5.LLLZZIL(c1390410mHn, 0);
        }
        C1390410mHn c1390410mHn2 = ((ImageLandingLoadingItemAssem) c0r45.l0).LLJLILLLLZIIL;
        if (c1390410mHn2 != null) {
            c1390410mHn2.LIZJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onViewAttachedToWindow$14(X.C0R45 r3, android.view.View r4) {
        /*
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.aweme.search.pages.result.photosearch.SearchCardCellMobAbilityImpl r0 = (com.ss.android.ugc.aweme.search.pages.result.photosearch.SearchCardCellMobAbilityImpl) r0
            android.view.View r0 = r0.LL
            r2 = 0
            X.0Q7z r1 = X.C1558360qeg.LJ(r0, r2)
            java.lang.Class<com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ability.ISearchPageListAbility> r0 = com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ability.ISearchPageListAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r2)
            com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ability.ISearchPageListAbility r0 = (com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ability.ISearchPageListAbility) r0
            if (r0 == 0) goto L9e
            boolean r0 = r0.Am2()
            r1 = 1
            if (r0 != r1) goto L9e
        L1c:
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.aweme.search.pages.result.photosearch.SearchCardCellMobAbilityImpl r0 = (com.ss.android.ugc.aweme.search.pages.result.photosearch.SearchCardCellMobAbilityImpl) r0
            android.view.View r0 = r0.LL
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L93
            if (r1 != 0) goto L93
            X.0PmE r4 = new X.0PmE
            r4.<init>(r2)
            java.lang.Object r2 = r3.l0
            com.ss.android.ugc.aweme.search.pages.result.photosearch.SearchCardCellMobAbilityImpl r2 = (com.ss.android.ugc.aweme.search.pages.result.photosearch.SearchCardCellMobAbilityImpl) r2
            com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility r0 = r2.LLILLL
            X.0PCY r0 = r0.Ph1()
            X.0sD9 r1 = r0.LIZJ()
            X.0PRC r1 = (X.C0PRC) r1
            java.lang.String r0 = r1.LLILLL
            r4.LJJIIZI(r0)
            java.lang.String r1 = r1.LLIZLLLIL
            java.lang.String r0 = "search_keyword"
            r4.LJIIZILJ(r0, r1)
            com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility r0 = r2.LLILLL
            X.0PCY r0 = r0.wO2()
            X.0sD9 r1 = r0.LIZJ()
            X.0PWx r1 = (X.C646370PWx) r1
            java.lang.String r0 = r1.LLILLL
            r4.LJIJJ(r0)
            int r0 = r1.LLILZLL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.LJJIIZ(r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LLILZLL
            if (r1 == 0) goto L94
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r4.LJIILLIIL
            r0.putAll(r1)
        L6e:
            boolean r0 = X.C0BRN.LIZ()
            if (r0 == 0) goto L8d
            android.view.View r3 = r2.LL
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r4.LJIILLIIL
            java.lang.String r0 = "search_result_id"
            java.lang.Object r2 = r1.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r4.LJIILLIIL
            java.lang.String r0 = "list_item_id"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            X.C645920PVe.LIZIZ(r4, r3, r2, r0)
        L8d:
            X.C645930PVf.LIZ(r4)
            r4.LJIILJJIL()
        L93:
            return
        L94:
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LLILZ
            if (r1 == 0) goto L6e
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r4.LJIILLIIL
            r0.putAll(r1)
            goto L6e
        L9e:
            r1 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0R45.onViewAttachedToWindow$14(X.0R45, android.view.View):void");
    }

    public static final void onViewAttachedToWindow$15(C0R45 c0r45, View view) {
        Map<String, String> mapLJ;
        int iYz1;
        int iCm0;
        Object obj;
        FoldableSectionHeaderAssem foldableSectionHeaderAssem = (FoldableSectionHeaderAssem) c0r45.l0;
        IPovLandingPageFragmentAbility iPovLandingPageFragmentAbilityAp = foldableSectionHeaderAssem.Ap();
        if (iPovLandingPageFragmentAbilityAp == null || (mapLJ = iPovLandingPageFragmentAbilityAp.LLLFZ()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        IPovLandingPageFragmentAbility iPovLandingPageFragmentAbilityAp2 = foldableSectionHeaderAssem.Ap();
        if (iPovLandingPageFragmentAbilityAp2 != null) {
            iYz1 = iPovLandingPageFragmentAbilityAp2.yz1();
        } else {
            iYz1 = 0;
        }
        IPovLandingPageFragmentAbility iPovLandingPageFragmentAbilityAp3 = foldableSectionHeaderAssem.Ap();
        if (iPovLandingPageFragmentAbilityAp3 != null) {
            iCm0 = iPovLandingPageFragmentAbilityAp3.cm0();
        } else {
            iCm0 = 0;
        }
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("is_page", "1");
        pairArr[1] = new Pair("total_section_num", String.valueOf(iYz1));
        pairArr[2] = new Pair("default_opened_section_num", String.valueOf(iCm0));
        C724270Sb3 c724270Sb3 = foldableSectionHeaderAssem.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        pairArr[3] = new Pair("section_number", String.valueOf(((C684940Qto) obj).LLILZ));
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        C0PXJ.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(mapLJ);
        c2344009Gk.LJII(mapLJIIIIZZ);
        C20684815ws.LJIILLIIL("search_result_section_show", c2344009Gk.LIZ);
    }

    public static final void onViewAttachedToWindow$16(C0R45 c0r45, View view) {
        ARunnableS110S0100000_10 aRunnableS110S0100000_10 = ((SearchAdAISummaryCardAssem) c0r45.l0).LLJZIJLIL;
        if (aRunnableS110S0100000_10 != null) {
            HandlerHook.viewRemoveCallbacks(view, aRunnableS110S0100000_10);
        }
        SearchAdAISummaryCardAssem searchAdAISummaryCardAssem = (SearchAdAISummaryCardAssem) c0r45.l0;
        ARunnableS110S0100000_10 aRunnableS110S0100000_102 = new ARunnableS110S0100000_10(searchAdAISummaryCardAssem, 67);
        searchAdAISummaryCardAssem.LLJZIJLIL = aRunnableS110S0100000_102;
        HandlerHook.viewPostDelay(view, aRunnableS110S0100000_102, 800L);
    }

    public static final void onViewAttachedToWindow$17(C0R45 c0r45, View view) {
        AwemeRawAd awemeRawAdLJJIJLIJ;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        final ViewGroup viewGroup;
        C0Q18 c0q18LIZ;
        final String str;
        C0Q17 c0q17LJIIJ;
        Map<String, AnoleComponentModel> map2;
        C0Q18 c0q18LIZ2;
        RecyclerView.ViewHolder viewHolderK4;
        View view2;
        LifecycleOwner lifecycleOwnerLIZ;
        RecyclerView recyclerViewLLII;
        C0PPD c0ppd = ((SearchAdHybridContentAssem) c0r45.l0).LLJZIJLIL;
        if (c0ppd != null) {
            c0ppd.LIZJ();
        }
        C0PP8 c0pp8 = ((SearchAdHybridContentAssem) c0r45.l0).LLJL;
        if (c0pp8 != null) {
            c0pp8.onViewAttachedToWindow();
        }
        C0PPD c0ppd2 = ((SearchAdHybridContentAssem) c0r45.l0).LLJZIJLIL;
        if (c0ppd2 != null) {
            c0ppd2.LIZLLL();
        }
        SearchTopFragmentAbility searchTopFragmentAbility = (SearchTopFragmentAbility) ((SearchAdHybridContentAssem) c0r45.l0).LLLFF.getValue();
        if (searchTopFragmentAbility != null && (recyclerViewLLII = searchTopFragmentAbility.LLII()) != null) {
            recyclerViewLLII.addOnScrollListener(((SearchAdHybridContentAssem) c0r45.l0).op());
        }
        C641060PCm c641060PCmOp = ((SearchAdHybridContentAssem) c0r45.l0).op();
        View view3 = (View) ((SearchAdHybridContentAssem) c0r45.l0).LLJLL.getValue();
        c641060PCmOp.getClass();
        if (view3 != null && view3.getVisibility() == 0) {
            c641060PCmOp.LJJIL(view3);
        }
        if (((SearchAdHybridContentAssem) c0r45.l0).LLJJLIIIJLLLLLLLZ == C0PK8.BRAND_HYBRID_AD) {
            final SearchAdHybridContentAssem searchAdHybridContentAssem = (SearchAdHybridContentAssem) c0r45.l0;
            searchAdHybridContentAssem.getClass();
            SearchServiceCenter$CardCommonAbility searchServiceCenter$CardCommonAbility = (SearchServiceCenter$CardCommonAbility) C1558520qew.LIZ(C1558520qew.LJIIL(searchAdHybridContentAssem), SearchServiceCenter$CardCommonAbility.class, null);
            if (searchServiceCenter$CardCommonAbility != null && (viewHolderK4 = searchServiceCenter$CardCommonAbility.k4()) != null && (lifecycleOwnerLIZ = C948503nH.LIZ((view2 = viewHolderK4.itemView))) != null && searchAdHybridContentAssem.LLLI == null) {
                searchAdHybridContentAssem.LLLI = new BshCardVisibilityManager(view2, lifecycleOwnerLIZ, new C0PPG() { // from class: X.0PPE
                    @Override // X.C0PPG
                    public final void onVisibilityChanged(boolean z) {
                        C0PP8 c0pp82 = searchAdHybridContentAssem.LLJL;
                        if (c0pp82 != null) {
                            c0pp82.LJIIZILJ(z);
                        }
                    }
                });
            }
        }
        SearchAdHybridContentAssem searchAdHybridContentAssem2 = (SearchAdHybridContentAssem) c0r45.l0;
        Aweme aweme = searchAdHybridContentAssem2.LLJLIL;
        if (aweme != null && (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) != null && (anoleModel = awemeRawAdLJJIJLIJ.getAnoleModel()) != null && (map = anoleModel.components) != null && !map.isEmpty()) {
            for (Map.Entry<String, AnoleComponentModel> entry : map.entrySet()) {
                entry.getKey();
                AnoleComponentModel value = entry.getValue();
                if (value != null && Intrinsics.LJFF(value.slotID, EnumC656000PoE.SEARCH_AD_HYBRID_ABOVE_LAYER.getValue())) {
                    searchAdHybridContentAssem2.LLLII = new C0PPC(awemeRawAdLJJIJLIJ);
                    ViewStub viewStub = (ViewStub) searchAdHybridContentAssem2.LJJIJL().getRootView().findViewById(R.id.u6y);
                    if (viewStub == null) {
                        viewGroup = (ViewGroup) searchAdHybridContentAssem2.LJJIJL().getRootView().findViewById(R.id.u6x);
                        C0PP8 c0pp82 = searchAdHybridContentAssem2.LLJL;
                        if (c0pp82 != null && (c0q18LIZ2 = c0pp82.LIZ()) != null) {
                            c0q18LIZ2.Xq2(EnumC656000PoE.SEARCH_AD_HYBRID_ABOVE_LAYER.getValue(), viewGroup);
                        }
                    } else {
                        View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                        if (viewLJLLLL instanceof ViewGroup) {
                            viewGroup = (ViewGroup) viewLJLLLL;
                        } else {
                            viewGroup = null;
                        }
                        C0PP8 c0pp83 = searchAdHybridContentAssem2.LLJL;
                        if (c0pp83 != null && (c0q18LIZ = c0pp83.LIZ()) != null) {
                            c0q18LIZ.Xq2(EnumC656000PoE.SEARCH_AD_HYBRID_ABOVE_LAYER.getValue(), viewGroup);
                        }
                    }
                    if (viewGroup != null) {
                        viewGroup.setTag("search_ad_above_anole_full_screen_view_container");
                    }
                    C0PPC c0ppc = searchAdHybridContentAssem2.LLLII;
                    if (c0ppc != null) {
                        final AwS589S0100000_10 awS589S0100000_10 = new AwS589S0100000_10(searchAdHybridContentAssem2, 550);
                        if (viewGroup != null) {
                            AnoleModel anoleModel2 = c0ppc.LIZ.getAnoleModel();
                            if (anoleModel2 != null && (map2 = anoleModel2.components) != null && !map2.isEmpty()) {
                                for (Map.Entry<String, AnoleComponentModel> entry2 : map2.entrySet()) {
                                    entry2.getKey();
                                    AnoleComponentModel value2 = entry2.getValue();
                                    if (value2 != null && Intrinsics.LJFF(value2.slotID, EnumC656000PoE.SEARCH_AD_HYBRID_ABOVE_LAYER.getValue())) {
                                        str = value2.type;
                                        break;
                                    }
                                }
                                str = null;
                            } else {
                                str = null;
                            }
                            if (!Intrinsics.LJFF(EnumC1008920cMU.SEARCH_EASTER_EGG.getType(), str)) {
                                C786410Ut5.K7(viewGroup, null);
                                return;
                            }
                            InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
                            if (interfaceC657510PqfLIZLLL == null || (c0q17LJIIJ = interfaceC657510PqfLIZLLL.LJIIJ()) == null) {
                                return;
                            }
                            c0q17LJIIJ.LJFF(new C0PX8() { // from class: X.0PX6
                                @Override // X.C0PX8
                                public final void LIZIZ(boolean z) {
                                    if (z) {
                                        C786410Ut5.K7(viewGroup, new ACListenerS82S1100000_10(awS589S0100000_10, str, 1));
                                        viewGroup.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0PX7
                                            @Override // android.view.View.OnLongClickListener
                                            public final boolean onLongClick(View view4) {
                                                return true;
                                            }
                                        });
                                    } else {
                                        C786410Ut5.K7(viewGroup, null);
                                        viewGroup.setOnLongClickListener(null);
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public static final void onViewAttachedToWindow$18(C0R45 c0r45, View view) {
        InterfaceC656040PoI interfaceC656040PoI = ((SearchAdMixedCreativeCardAssem) c0r45.l0).LLL;
        if (interfaceC656040PoI != null) {
            interfaceC656040PoI.onViewAttachedToWindow();
        }
    }

    public static final void onViewAttachedToWindow$19(C0R45 c0r45, View view) {
        InterfaceC656120PoQ interfaceC656120PoQ = ((SearchAdOLEProductAggregationCardAssem) c0r45.l0).LLJLLIL;
        if (interfaceC656120PoQ != null) {
            interfaceC656120PoQ.onViewAttachedToWindow();
        }
    }

    public static final void onViewAttachedToWindow$2(C0R45 c0r45, View view) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((SearchCardLivePlayerAssem) c0r45.l0), null, null, new C657120Pq2((SearchCardLivePlayerAssem) c0r45.l0, null), 3);
    }

    public static final void onViewAttachedToWindow$20(C0R45 c0r45, View view) {
        C0PPD c0ppd = ((SearchAdPhotoCardContentAssem) c0r45.l0).LLLFF;
        if (c0ppd != null) {
            c0ppd.LIZJ();
        }
        InterfaceC656740PpQ interfaceC656740PpQ = ((SearchAdPhotoCardContentAssem) c0r45.l0).LLJL;
        if (interfaceC656740PpQ != null) {
            interfaceC656740PpQ.onViewAttachedToWindow();
        }
        InterfaceC656730PpP interfaceC656730PpP = ((SearchAdPhotoCardContentAssem) c0r45.l0).LLJLIL;
        if (interfaceC656730PpP != null) {
            interfaceC656730PpP.onViewAttachedToWindow();
        }
        SearchAdPhotoCardContentAssem searchAdPhotoCardContentAssem = (SearchAdPhotoCardContentAssem) c0r45.l0;
        searchAdPhotoCardContentAssem.LLL = true;
        C0PPD c0ppd2 = searchAdPhotoCardContentAssem.LLLFF;
        if (c0ppd2 != null) {
            c0ppd2.LIZLLL();
        }
        C0PPD c0ppd3 = ((SearchAdPhotoCardContentAssem) c0r45.l0).LLLFF;
        if (c0ppd3 != null) {
            c0ppd3.LJ();
        }
    }

    public static final void onViewAttachedToWindow$21(C0R45 c0r45, View view) {
        SearchTopFragmentAbility searchTopFragmentAbility;
        RecyclerView recyclerViewLLII;
        RecyclerView.ViewHolder viewHolderK4;
        View view2;
        LifecycleOwner lifecycleOwnerLIZ;
        ((SearchAdBrandZoneContentAssem) c0r45.l0).LLLIL = System.currentTimeMillis();
        InterfaceC682870QqT interfaceC682870QqT = ((SearchAdBrandZoneContentAssem) c0r45.l0).LLLI;
        if (interfaceC682870QqT != null) {
            interfaceC682870QqT.LJIIL();
        }
        ((SearchAdBrandZoneContentAssem) c0r45.l0).sp("", true);
        final SearchAdBrandZoneContentAssem searchAdBrandZoneContentAssem = (SearchAdBrandZoneContentAssem) c0r45.l0;
        searchAdBrandZoneContentAssem.getClass();
        SearchServiceCenter$CardCommonAbility searchServiceCenter$CardCommonAbility = (SearchServiceCenter$CardCommonAbility) C1558520qew.LIZ(C1558520qew.LJIIL(searchAdBrandZoneContentAssem), SearchServiceCenter$CardCommonAbility.class, null);
        if (searchServiceCenter$CardCommonAbility != null && (viewHolderK4 = searchServiceCenter$CardCommonAbility.k4()) != null && (lifecycleOwnerLIZ = C948503nH.LIZ((view2 = viewHolderK4.itemView))) != null && searchAdBrandZoneContentAssem.LLLILZ == null) {
            searchAdBrandZoneContentAssem.LLLILZ = new BshCardVisibilityManager(view2, lifecycleOwnerLIZ, new C0PPG() { // from class: X.0QqY
                @Override // X.C0PPG
                public final void onVisibilityChanged(boolean z) {
                    SearchAdBrandZoneContentAssem searchAdBrandZoneContentAssem2 = searchAdBrandZoneContentAssem;
                    if (!searchAdBrandZoneContentAssem2.LLLILZLLLI) {
                        return;
                    }
                    long j = searchAdBrandZoneContentAssem2.LLLIL;
                    if (j != 0) {
                        long j2 = searchAdBrandZoneContentAssem2.LLLILZJ;
                        if (j2 != 0) {
                            if (z && j2 == j) {
                                return;
                            }
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            long j3 = jCurrentTimeMillis - searchAdBrandZoneContentAssem2.LLLILZJ;
                            searchAdBrandZoneContentAssem2.LLLILZJ = jCurrentTimeMillis;
                            searchAdBrandZoneContentAssem2.LLLIZZ = z;
                            if (z) {
                                InterfaceC682870QqT interfaceC682870QqT2 = searchAdBrandZoneContentAssem2.LLLI;
                                if (interfaceC682870QqT2 == null) {
                                    return;
                                }
                                interfaceC682870QqT2.LJIIJJI(j3);
                                return;
                            }
                            InterfaceC682870QqT interfaceC682870QqT3 = searchAdBrandZoneContentAssem2.LLLI;
                            if (interfaceC682870QqT3 == null) {
                                return;
                            }
                            interfaceC682870QqT3.LIZJ(j3);
                        }
                    }
                }
            });
        }
        SearchAdBrandZoneContentAssem searchAdBrandZoneContentAssem2 = (SearchAdBrandZoneContentAssem) c0r45.l0;
        searchAdBrandZoneContentAssem2.LLLILZJ = searchAdBrandZoneContentAssem2.LLLIL;
        searchAdBrandZoneContentAssem2.LLLILZLLLI = true;
        searchAdBrandZoneContentAssem2.LLLIZZ = true;
        SearchBrandZoneAutoPlayCardHelper searchBrandZoneAutoPlayCardHelper = searchAdBrandZoneContentAssem2.LLLIILIL;
        if (searchBrandZoneAutoPlayCardHelper != null && (searchTopFragmentAbility = (SearchTopFragmentAbility) searchAdBrandZoneContentAssem2.LLLIIL.getValue()) != null && (recyclerViewLLII = searchTopFragmentAbility.LLII()) != null) {
            recyclerViewLLII.addOnScrollListener(searchBrandZoneAutoPlayCardHelper);
        }
    }

    public static final void onViewAttachedToWindow$22(C0R45 c0r45, View view) {
        InterfaceC656520Pp4 interfaceC656520Pp4 = ((SearchAdTopLiveSingleCardAssem) c0r45.l0).LLJLILLLLZIIL;
        if (interfaceC656520Pp4 != null) {
            interfaceC656520Pp4.onViewAttachedToWindow();
        }
    }

    public static final void onViewAttachedToWindow$23(C0R45 c0r45, View view) {
        InterfaceC657570Pql interfaceC657570Pql = ((SearchAdTopPhotoSingleCardAssem) c0r45.l0).LLJZIJLIL;
        if (interfaceC657570Pql != null) {
            interfaceC657570Pql.onViewAttachedToWindow();
        }
    }

    public static final void onViewAttachedToWindow$24(C0R45 c0r45, View view) {
        InterfaceC657580Pqm interfaceC657580Pqm = ((SearchAdTopVideoSingleCardAssem) c0r45.l0).LLJLLL;
        if (interfaceC657580Pqm != null) {
            interfaceC657580Pqm.onViewAttachedToWindow();
        }
    }

    public static final void onViewAttachedToWindow$26(C0R45 c0r45, View view) {
        InterfaceC655350PnB interfaceC655350PnB = ((SearchMixLiveCardContentAssem) c0r45.l0).LLJZ;
        if (interfaceC655350PnB != null) {
            interfaceC655350PnB.onViewAttachedToWindow();
        }
    }

    public static final void onViewAttachedToWindow$27(C0R45 c0r45, View view) {
        TakoSingleVideoAssem takoSingleVideoAssem = (TakoSingleVideoAssem) c0r45.l0;
        takoSingleVideoAssem.getClass();
        if (!EventBus.LIZLLL().LJIIJ(takoSingleVideoAssem)) {
            EventBus.LIZLLL().LJIJJ(takoSingleVideoAssem);
        }
    }

    public static final void onViewAttachedToWindow$28(C0R45 c0r45, View view) {
        TakoVideoListAssem takoVideoListAssem = (TakoVideoListAssem) c0r45.l0;
        takoVideoListAssem.getClass();
        if (!EventBus.LIZLLL().LJIIJ(takoVideoListAssem)) {
            EventBus.LIZLLL().LJIJJ(takoVideoListAssem);
        }
    }

    public static final void onViewAttachedToWindow$29(C0R45 c0r45, View view) {
        C662750Pz7.LIZ.getClass();
        ((LiveData) C662750Pz7.LJFF.getValue()).observeForever((Observer) c0r45.l0);
    }

    public static final void onViewAttachedToWindow$3(C0R45 c0r45, View view) {
        SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = (SearchComponentCenter$Player$PlayerControlAbility) ((SearchSubCardAssem) c0r45.l0).LLJLILLLLZIIL.getValue();
        if (searchComponentCenter$Player$PlayerControlAbility != null) {
            searchComponentCenter$Player$PlayerControlAbility.qq1(((SearchSubCardAssem) c0r45.l0).LLJLLIL);
        }
        InterfaceC655240Pn0 interfaceC655240Pn0 = ((SearchSubCardAssem) c0r45.l0).LLJLIL;
        if (interfaceC655240Pn0 != null) {
            interfaceC655240Pn0.onViewAttachedToWindow();
        }
        InterfaceC652300PiG interfaceC652300PiGYp = ((SearchSubCardAssem) c0r45.l0).yp();
        if (interfaceC652300PiGYp != null) {
            interfaceC652300PiGYp.LJLJJI(C631370Opb.LIZIZ((SearchSubCardAssem) c0r45.l0), (InterfaceC1891350zJl) C631370Opb.LIZ((SearchSubCardAssem) c0r45.l0));
        }
    }

    public static final void onViewAttachedToWindow$30(C0R45 c0r45, View view) {
        C0R2L c0r2l = (C0R2L) c0r45.l0;
        c0r2l.getClass();
        if (!EventBus.LIZLLL().LJIIJ(c0r2l)) {
            EventBus.LIZLLL().LJIJJ(c0r2l);
        }
    }

    public static final void onViewAttachedToWindow$31(C0R45 c0r45, View view) {
        ((AbstractC666440QCc) c0r45.l0).getClass();
    }

    public static final void onViewAttachedToWindow$32(C0R45 c0r45, View view) {
        InterfaceC656110PoP interfaceC656110PoPUp = ((ProductAggregationSubCardAssem) c0r45.l0).up();
        if (interfaceC656110PoPUp != null) {
            interfaceC656110PoPUp.LJLJJI(C631370Opb.LIZIZ((ProductAggregationSubCardAssem) c0r45.l0), (InterfaceC1891350zJl) C631370Opb.LIZ((ProductAggregationSubCardAssem) c0r45.l0));
        }
    }

    public static final void onViewAttachedToWindow$33(C0R45 c0r45, View view) {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        C668400QJq c668400QJq = C668400QJq.LIZ;
        C668330QJj c668330QJj = (C668330QJj) c0r45.l0;
        C0QK9 c0qk9 = c668330QJj.LLILZLL;
        C0QK7 c0qk7 = c668330QJj.LLJ;
        c668400QJq.getClass();
        C645800PUs c645800PUs = new C645800PUs();
        String str19 = null;
        if (c0qk9 != null) {
            str = c0qk9.LIZJ;
        } else {
            str = null;
        }
        c645800PUs.LJIIZILJ("impr_id", str);
        if (c0qk9 != null) {
            i = 1;
        } else {
            i = 0;
        }
        c645800PUs.LJJJJJL(Integer.valueOf(i));
        String str20 = "interest_point_module";
        if (c0qk9 != null) {
            str2 = "interest_point_module";
        } else {
            str2 = null;
        }
        c645800PUs.LJIIZILJ("words_source", str2);
        if (c0qk9 != null) {
            str3 = c0qk9.LIZIZ;
        } else {
            str3 = null;
        }
        c645800PUs.LJIIZILJ("search_position", str3);
        if (c0qk9 != null) {
            str4 = c0qk9.LJ;
        } else {
            str4 = null;
        }
        c645800PUs.LJIIZILJ("last_from_group_id", str4);
        if (c0qk9 != null) {
            str5 = c0qk9.LJFF;
        } else {
            str5 = null;
        }
        c645800PUs.LJIIZILJ("last_feed_group_id", str5);
        if (c0qk7 != null) {
            str6 = c0qk7.LJFF;
        } else {
            str6 = null;
        }
        c645800PUs.LJ("blankpage_id", str6);
        c645800PUs.LJIILJJIL();
        C668330QJj c668330QJj2 = (C668330QJj) c0r45.l0;
        C0QK9 c0qk92 = c668330QJj2.LLILZLL;
        C0QK7 c0qk72 = c668330QJj2.LLJ;
        C0PVO c0pvo = new C0PVO();
        if (c0qk92 == null) {
            str20 = null;
        }
        c0pvo.LJIIZILJ("words_source", str20);
        if (c0qk92 != null) {
            str7 = c0qk92.LIZ;
        } else {
            str7 = null;
        }
        c0pvo.LJIIZILJ("words_content", str7);
        if (c0qk92 != null) {
            str8 = c0qk92.LIZIZ;
        } else {
            str8 = null;
        }
        c0pvo.LJIIZILJ("search_position", str8);
        if (c0qk92 != null) {
            str9 = c0qk92.LIZJ;
        } else {
            str9 = null;
        }
        c0pvo.LJIIZILJ("impr_id", str9);
        if (c0qk92 != null) {
            str10 = c0qk92.LIZLLL;
        } else {
            str10 = null;
        }
        c0pvo.LJIIZILJ("group_id", str10);
        if (c0qk92 != null) {
            str11 = c0qk92.LJ;
        } else {
            str11 = null;
        }
        c0pvo.LJIIZILJ("last_from_group_id", str11);
        if (c0qk92 != null) {
            str12 = c0qk92.LJFF;
        } else {
            str12 = null;
        }
        c0pvo.LJIIZILJ("last_feed_group_id", str12);
        if (c0qk72 != null) {
            str13 = c0qk72.LJFF;
        } else {
            str13 = null;
        }
        c0pvo.LJ("blankpage_id", str13);
        if (c0qk92 == null || (str14 = c0qk92.LJI) == null) {
            str14 = "";
        }
        c0pvo.LJIIZILJ("latest_group_id", str14);
        if (c0qk72 != null) {
            str15 = c0qk72.LIZ;
        } else {
            str15 = null;
        }
        c0pvo.LJIIZILJ("interest_point", str15);
        if (c0qk72 != null) {
            str16 = c0qk72.LIZIZ;
        } else {
            str16 = null;
        }
        c0pvo.LJIIZILJ("interest_point_recommend", str16);
        if (c0qk72 != null) {
            str17 = c0qk72.LIZJ;
        } else {
            str17 = null;
        }
        c0pvo.LJIIZILJ("interest_point_recommend_position", str17);
        if (c0qk72 != null) {
            str18 = c0qk72.LIZLLL;
        } else {
            str18 = null;
        }
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        c0pvo.LJFF("interest_point_words_type", str18, c2082308Dt);
        if (c0qk72 != null) {
            str19 = c0qk72.LJ;
        }
        c0pvo.LJFF("interest_point_words_code", str19, c2082308Dt);
        c0pvo.LJIILJJIL();
    }

    public static final void onViewAttachedToWindow$34(C0R45 c0r45, View view) {
        String str;
        boolean z;
        String str2;
        C668340QJk c668340QJk = (C668340QJk) c0r45.l0;
        SearchHistory searchHistory = c668340QJk.LLJIJIL;
        if (searchHistory != null) {
            String str3 = searchHistory.keyword;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            int layoutPosition = c668340QJk.getLayoutPosition();
            String str5 = c668340QJk.LL;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = searchHistory.musicId;
            if (str6 == null) {
                str = "";
            } else {
                str = "Sound";
            }
            long j = searchHistory.timestamp;
            String str7 = searchHistory.enterMethod;
            if (str6 != null) {
                z = true;
                str4 = str6;
            } else {
                z = false;
            }
            if (searchHistory.isOriginalMusic) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            C668020QIe.LIZ(str3, Integer.valueOf(layoutPosition), str5, str7, str, Long.valueOf(j), z, str4, str2, c668340QJk.LLJILJIL, !searchHistory.LIZIZ(), c668340QJk.LLJILJILJ, null, SpeechEngineDefines.TTS_WORK_MODE_BOTH);
        }
    }

    public static final void onViewAttachedToWindow$35(C0R45 c0r45, View view) {
        List<Aweme> list;
        if (view.isShown() && view.isAttachedToWindow() && ((SearchTakoSugCardAssem) c0r45.l0).LLJLIL.compareAndSet(false, true)) {
            view.removeOnAttachStateChangeListener(c0r45);
            SearchTakoSugCardAssem searchTakoSugCardAssem = (SearchTakoSugCardAssem) c0r45.l0;
            searchTakoSugCardAssem.getClass();
            try {
                C0PRC c0prcSp = searchTakoSugCardAssem.sp();
                if (c0prcSp != null) {
                    String str = c0prcSp.LLILLL;
                    String strLJIILLIIL = C644560PPy.LJIILLIIL(c0prcSp.LL);
                    C0Q0K.LIZ.getClass();
                    TakoSearchCarryInItem takoSearchCarryInItemLIZ = C0Q0K.LIZ(str, strLJIILLIIL, "default_doc_id");
                    if (takoSearchCarryInItemLIZ != null && (list = takoSearchCarryInItemLIZ.placeholderAwemes) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Aweme aweme : list) {
                            if (aweme.getVideo() != null) {
                                arrayList.add(aweme);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("top1_sug:");
                            sbLIZ.append(str);
                            C600250NgV.LIZ(new C0N6M(C2188811AlT.LIZIZ(sbLIZ), C0N6L.SEARCH_TOP1_SUG_CARD, arrayList), EnumC600270NgX.IMPRESSION);
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static final void onViewAttachedToWindow$36(C0R45 c0r45, View view) {
        ((AbstractC649370PdX) c0r45.l0).getClass();
    }

    public static final void onViewAttachedToWindow$37(C0R45 c0r45, View view) {
        Aweme aweme = ((Lemon8FakeAutoplayMobAssem) c0r45.l0).LLJJJJ;
        if (aweme != null) {
            Lemon8FakeAutoplayMobAssem lemon8FakeAutoplayMobAssem = (Lemon8FakeAutoplayMobAssem) c0r45.l0;
            C660110Pur c660110Pur = C660110Pur.LIZ;
            ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(lemon8FakeAutoplayMobAssem), ISearchContextAbility.class);
            c660110Pur.getClass();
            C0PRC c0prc = (C0PRC) iSearchContextAbility.Ph1().LIZJ();
            C646370PWx c646370PWx = (C646370PWx) iSearchContextAbility.wO2().LIZJ();
            C659690PuB c659690PuB = new C659690PuB(null);
            c659690PuB.LJIIZILJ("search_id", c0prc.LLILLL);
            c659690PuB.LJIJJ(c646370PWx.LLILLL);
            c659690PuB.LJIIZILJ("search_keyword", c0prc.LLIZLLLIL);
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            c659690PuB.LJIIZILJ("group_id", aid);
            c659690PuB.LJJIIZ(Integer.valueOf(c646370PWx.LLILZLL));
            Integer num = c646370PWx.LLJILJIL;
            if (num != null) {
                c659690PuB.LIZLLL(num.intValue(), "universal_rank");
                c659690PuB.LJ("insert_type", c646370PWx.LLJILJILJ);
            }
            c659690PuB.LJ("anchor_outreach_type", CardStruct.IStatusCode.DEFAULT);
            c659690PuB.LJJIFFI(Integer.valueOf(aweme.getAwemeType()));
            c659690PuB.LJFF("pic_cnt", C660110Pur.LIZ(aweme), InterfaceC1210900hcG.LIZ);
            c659690PuB.LJIILJJIL();
        }
    }

    public static final void onViewAttachedToWindow$38(C0R45 c0r45, View view) {
        String strLIZIZ;
        Product product = ((C0QAU) c0r45.l0).LLJILLL;
        if (product != null && (strLIZIZ = product.LIZIZ()) != null) {
            C0QAU c0qau = (C0QAU) c0r45.l0;
            if (!c0qau.LLJJ.contains(strLIZIZ)) {
                C662730Pz5 c662730Pz5 = C662730Pz5.LIZ;
                Product product2 = c0qau.LLJILLL;
                C655440PnK c655440PnK = c0qau.LLJI;
                C654590Plx c654590Plx = c0qau.LLJIJIL;
                InterfaceC662740Pz6 interfaceC662740Pz6 = c0qau.LLJILJIL;
                String str = c0qau.LLJJIII;
                PageFinder pageFinderVia = PageFinder.via((View) c0qau.LLILZ);
                EnumC657940PrM enumC657940PrM = c0qau.LLJJI;
                c662730Pz5.getClass();
                C662730Pz5.LIZJ(product2, c655440PnK, c654590Plx, interfaceC662740Pz6, "search_live_single_anchor", str, pageFinderVia, enumC657940PrM);
                c0qau.LLJJ.add(strLIZIZ);
            }
        }
    }

    public static final void onViewAttachedToWindow$39(C0R45 c0r45, View view) {
        RecyclerView.LayoutManager layoutManager;
        AbstractC21673619ry adapter;
        int[] iArr = new int[2];
        RecyclerView recyclerView = (RecyclerView) c0r45.l0;
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null && (adapter instanceof C670510QRt)) {
            iArr = ((C670510QRt) adapter).LLILZ;
        }
        RecyclerView recyclerView2 = (RecyclerView) c0r45.l0;
        if (recyclerView2 != null && (layoutManager = recyclerView2.getLayoutManager()) != null && (layoutManager instanceof LinearLayoutManager)) {
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(iArr[0], iArr[1]);
        }
    }

    public static final void onViewAttachedToWindow$4(C0R45 c0r45, View view) {
        Iterator it2 = ((ArrayList) ((SearchCardCommonAbilityImpl) c0r45.l0).LLILLL.getValue()).iterator();
        while (it2.hasNext()) {
            ((View.OnAttachStateChangeListener) it2.next()).onViewAttachedToWindow(view);
        }
    }

    public static final void onViewAttachedToWindow$40(C0R45 c0r45, View view) {
        VideoCitationAssem videoCitationAssem = (VideoCitationAssem) c0r45.l0;
        videoCitationAssem.getClass();
        if (!EventBus.LIZLLL().LJIIJ(videoCitationAssem)) {
            EventBus.LIZLLL().LJIJJ(videoCitationAssem);
        }
    }

    public static final void onViewAttachedToWindow$41(C0R45 c0r45, View view) {
        C658230Prp c658230Prp = (C658230Prp) c0r45.l0;
        c658230Prp.getClass();
        if (C0PPZ.LIZ() && c658230Prp.LLJILJIL == null) {
            c658230Prp.LLJILJIL = C0P72.LIZ(C946803n0.LIZ(c658230Prp.itemView));
        }
        c658230Prp.LLJILJILJ = true;
    }

    public static final void onViewAttachedToWindow$42(C0R45 c0r45, View view) {
        EventBus.LIZLLL().LJIJJ((AbstractC652910PjF) c0r45.l0);
    }

    public static final void onViewAttachedToWindow$43(C0R45 c0r45, View view) {
        C19EG activity;
        C0Q5B c0q5b = (C0Q5B) c0r45.l0;
        c0q5b.LIZLLL.LIZIZ = true;
        if (C650560PfS.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("videoView onViewAttachedToWindow, ");
            sbLIZ.append(c0q5b.LJIIZILJ());
            sbLIZ.append('.');
            C2188811AlT.LIZIZ(sbLIZ);
        }
        final C0Q5B c0q5b2 = (C0Q5B) c0r45.l0;
        if (c0q5b2.LJ) {
            Fragment fragmentLIZLLL = C651580Ph6.LIZLLL(view);
            if (fragmentLIZLLL != null) {
                activity = fragmentLIZLLL.getActivity();
            } else {
                activity = null;
            }
            SAFHelper.LIZ.getClass();
            LifecycleOwner lifecycleOwnerLJJI = SAFHelper.LJJI(fragmentLIZLLL, activity);
            if (lifecycleOwnerLJJI != null) {
                if (activity != null) {
                    C666210QBf.LIZ(fragmentLIZLLL, activity).LLIZLLLIL.observe(lifecycleOwnerLJJI, new AObserverS214S0100000_10(c0q5b2, 141));
                }
                IEarphonePlayerControlService iEarphonePlayerControlService = (IEarphonePlayerControlService) ServiceManager.get().getService(IEarphonePlayerControlService.class);
                if (iEarphonePlayerControlService.LJ()) {
                    iEarphonePlayerControlService.LJI(lifecycleOwnerLJJI, new InterfaceC2217831BrB() { // from class: X.0PyK
                        @Override // X.InterfaceC2217831BrB
                        public final String getScenario() {
                            return "search_video_card";
                        }

                        @Override // X.InterfaceC2217831BrB
                        public final void LIZ() {
                            if (c0q5b2.LJII) {
                                C722880SXe.LIZLLL("search_video_card");
                                c0q5b2.play();
                                C722880SXe.LIZJ(Boolean.valueOf(c0q5b2.isPlaying()), "search_video_card");
                                C664340Q4a c664340Q4a = c0q5b2.LJFF;
                                if (c664340Q4a != null) {
                                    C2344009Gk c2344009Gk = new C2344009Gk();
                                    c2344009Gk.LJIIIIZZ("enter_from", "general_search");
                                    Aweme awemeLJII = c664340Q4a.LJII();
                                    c2344009Gk.LJIIIIZZ("group_id", awemeLJII != null ? awemeLJII.getAid() : null);
                                    Aweme awemeLJII2 = c664340Q4a.LJII();
                                    c2344009Gk.LJIIIIZZ("author_id", awemeLJII2 != null ? AwemeExtKt.getAuthorUid(awemeLJII2) : null);
                                    C20684815ws.LJIILLIIL("earphone_play_continue", c2344009Gk.LIZ);
                                }
                                c0q5b2.LJII = false;
                            }
                        }
                    });
                }
            }
        }
    }

    public static final void onViewAttachedToWindow$44(C0R45 c0r45, View view) {
        C658240Prq c658240Prq = (C658240Prq) c0r45.l0;
        c658240Prq.getClass();
        if (C0PPZ.LIZ() && c658240Prq.LLIZ == null) {
            c658240Prq.LLIZ = C0P72.LIZ(C946803n0.LIZ(c658240Prq.itemView));
        }
        c658240Prq.LLIZLLLIL = true;
    }

    public static final void onViewAttachedToWindow$45(C0R45 c0r45, View view) {
        String roomTitleAiSummary;
        String uid;
        int followStatus;
        User author;
        User author2;
        User author3;
        User author4;
        if (!((SearchLiveCardBottomAssem) c0r45.l0).LLLIIIIL) {
            return;
        }
        C655850Pnz<C655860Po0> c655850Pnz = new C655850Pnz<C655860Po0>() { // from class: X.0Po0
        };
        SearchLiveCardBottomAssem searchLiveCardBottomAssem = (SearchLiveCardBottomAssem) c0r45.l0;
        Aweme aweme = searchLiveCardBottomAssem.LLLIIIL;
        if (aweme == null || (author4 = aweme.getAuthor()) == null || (roomTitleAiSummary = author4.getRoomTitleAiSummary()) == null) {
            roomTitleAiSummary = "";
        }
        c655850Pnz.LJIIZILJ("ai_summary_content", roomTitleAiSummary);
        c655850Pnz.LJIIZILJ("enter_from_merge", "general_search");
        c655850Pnz.LJIJJLI("live_cover");
        c655850Pnz.LJIIZILJ("action_type", "click");
        Aweme aweme2 = searchLiveCardBottomAssem.LLLIIIL;
        String string = null;
        if (aweme2 != null && (author3 = aweme2.getAuthor()) != null) {
            uid = author3.getUid();
        } else {
            uid = null;
        }
        c655850Pnz.LJIIZILJ("anchor_id", uid);
        c655850Pnz.LJIIZILJ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        Aweme aweme3 = searchLiveCardBottomAssem.LLLIIIL;
        if (aweme3 != null && (author2 = aweme3.getAuthor()) != null) {
            string = Long.valueOf(C486180J4u.LIZ(author2)).toString();
        }
        c655850Pnz.LJIIZILJ("room_id", string);
        Aweme aweme4 = searchLiveCardBottomAssem.LLLIIIL;
        if (aweme4 != null && (author = aweme4.getAuthor()) != null) {
            followStatus = author.getFollowStatus();
        } else {
            followStatus = 0;
        }
        c655850Pnz.LJIIZILJ("follow_status", String.valueOf(followStatus));
        c655850Pnz.LJIILJJIL();
    }

    public static final void onViewAttachedToWindow$46(C0R45 c0r45, View view) {
        InterfaceC655270Pn3 interfaceC655270Pn3;
        ViewOnAttachStateChangeListenerC655110Pmn viewOnAttachStateChangeListenerC655110Pmn = (ViewOnAttachStateChangeListenerC655110Pmn) c0r45.l0;
        viewOnAttachStateChangeListenerC655110Pmn.getClass();
        SAFHelper sAFHelper = SAFHelper.LIZ;
        View view2 = viewOnAttachStateChangeListenerC655110Pmn.itemView;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(view2.getContext());
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJJII = SAFHelper.LJJII(view2, c19egLIZIZ);
        if ((lifecycleOwnerLJJII instanceof InterfaceC655270Pn3) && (interfaceC655270Pn3 = (InterfaceC655270Pn3) lifecycleOwnerLJJII) != null) {
            interfaceC655270Pn3.registerActivityOnKeyDownListener(viewOnAttachStateChangeListenerC655110Pmn.LLLJL);
        }
        InterfaceC655240Pn0 interfaceC655240Pn0 = ((ViewOnAttachStateChangeListenerC655110Pmn) c0r45.l0).LLLJIL;
        if (interfaceC655240Pn0 != null) {
            interfaceC655240Pn0.onViewAttachedToWindow();
        }
        C036E.LIZ.LIZ(((ViewOnAttachStateChangeListenerC655110Pmn) c0r45.l0).LLLILZLLLI);
    }

    public static final void onViewAttachedToWindow$49(C0R45 c0r45, View view) {
        Iterator it2 = ((ArrayList) ((SearchCardCellCommonAbilityImpl) c0r45.l0).LLILLL.getValue()).iterator();
        while (it2.hasNext()) {
            ((View.OnAttachStateChangeListener) it2.next()).onViewAttachedToWindow(view);
        }
    }

    public static final void onViewAttachedToWindow$5(C0R45 c0r45, View view) {
        if (((C646370PWx) C0Q3E.LIZ(view).wO2().LIZJ()).LLJJIJI) {
            return;
        }
        SearchCardMobAbilityImpl searchCardMobAbilityImpl = (SearchCardMobAbilityImpl) c0r45.l0;
        if (searchCardMobAbilityImpl.LLILZIL) {
            searchCardMobAbilityImpl.LIZIZ(C2097608Jq.LJ());
        }
    }

    public static final void onViewAttachedToWindow$50(C0R45 c0r45, View view) {
        List<Aweme> list;
        if (view.isShown() && view.isAttachedToWindow() && ((SearchTakoCardAssem) c0r45.l0).LLLLIIL.compareAndSet(false, true)) {
            view.removeOnAttachStateChangeListener(c0r45);
            SearchTakoCardAssem searchTakoCardAssem = (SearchTakoCardAssem) c0r45.l0;
            searchTakoCardAssem.getClass();
            try {
                C0PRC c0prcZp = searchTakoCardAssem.zp();
                if (c0prcZp != null) {
                    String str = c0prcZp.LLILLL;
                    String strLJIILLIIL = C644560PPy.LJIILLIIL(c0prcZp.LL);
                    C0Q0K.LIZ.getClass();
                    TakoSearchCarryInItem takoSearchCarryInItemLIZ = C0Q0K.LIZ(str, strLJIILLIIL, "default_doc_id");
                    if (takoSearchCarryInItemLIZ != null && (list = takoSearchCarryInItemLIZ.placeholderAwemes) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Aweme aweme : list) {
                            if (aweme.getVideo() != null) {
                                arrayList.add(aweme);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("top1_tako:");
                            sbLIZ.append(str);
                            C600250NgV.LIZ(new C0N6M(C2188811AlT.LIZIZ(sbLIZ), C0N6L.SEARCH_TOP1_TAKO_CARD, arrayList), EnumC600270NgX.IMPRESSION);
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static final void onViewAttachedToWindow$51(C0R45 c0r45, View view) {
        String aid;
        InterfaceC655270Pn3 interfaceC655270Pn3;
        SearchPhotoHolder searchPhotoHolder = (SearchPhotoHolder) c0r45.l0;
        searchPhotoHolder.LLLFF = true;
        Taco tacoLIZ = C0PCE.LIZ(searchPhotoHolder.itemView, false);
        if (tacoLIZ != null) {
            Taco.LIZ(tacoLIZ, searchPhotoHolder);
        }
        ConcurrentHashMap<String, WeakReference<C653660PkS>> concurrentHashMap = C666560QCo.LJIJJ;
        Aweme aweme = searchPhotoHolder.LL;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        concurrentHashMap.put(aid, new WeakReference<>(searchPhotoHolder.l3()));
        SAFHelper sAFHelper = SAFHelper.LIZ;
        View view2 = searchPhotoHolder.itemView;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(view2.getContext());
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJJII = SAFHelper.LJJII(view2, c19egLIZIZ);
        if ((lifecycleOwnerLJJII instanceof InterfaceC655270Pn3) && (interfaceC655270Pn3 = (InterfaceC655270Pn3) lifecycleOwnerLJJII) != null) {
            interfaceC655270Pn3.registerActivityOnKeyDownListener(searchPhotoHolder.LLLILZJ);
        }
    }

    public static final void onViewAttachedToWindow$6(C0R45 c0r45, View view) {
        ((SearchList) c0r45.l0).LLLLII.LIZIZ().getClass();
    }

    public static final void onViewAttachedToWindow$7(C0R45 c0r45, View view) {
        NextLiveData nextLiveData;
        SearchTakoCardAssem searchTakoCardAssem = (SearchTakoCardAssem) c0r45.l0;
        if ((searchTakoCardAssem instanceof LifecycleOwner) && searchTakoCardAssem != null) {
            searchTakoCardAssem.getLifecycle().addObserver(searchTakoCardAssem.LLLLIILLL);
            SearchGlobalViewModel searchGlobalViewModel = (SearchGlobalViewModel) searchTakoCardAssem.LLLILZLLLI.getValue();
            if (searchGlobalViewModel != null && (nextLiveData = searchGlobalViewModel.LLILZ) != null) {
                nextLiveData.observe(searchTakoCardAssem, searchTakoCardAssem.LLLLILI);
            }
            RecyclerView recyclerViewGp = searchTakoCardAssem.Gp();
            if (recyclerViewGp != null) {
                recyclerViewGp.addOnScrollListener(searchTakoCardAssem.LLLLIL);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewAttachedToWindow$8(C0R45 c0r45, View view) {
        C0Q0I c0q0i = (C0Q0I) ((SearchTakoSugCell) c0r45.l0).getItem();
        if (c0q0i != null) {
            SearchTakoSugCell searchTakoSugCell = (SearchTakoSugCell) c0r45.l0;
            SearchTakoCardAbility searchTakoCardAbility = (SearchTakoCardAbility) searchTakoSugCell.LLIZ.getValue();
            if (searchTakoCardAbility != null) {
                searchTakoCardAbility.I40(c0q0i);
            }
            SearchComponentCenter$SearchTakoSugListComponent$ISearchTakoSugListAbility searchComponentCenter$SearchTakoSugListComponent$ISearchTakoSugListAbility = (SearchComponentCenter$SearchTakoSugListComponent$ISearchTakoSugListAbility) searchTakoSugCell.LLIZLLLIL.getValue();
            if (searchComponentCenter$SearchTakoSugListComponent$ISearchTakoSugListAbility != null) {
                C0Q0J c0q0j = c0q0i.LL;
                searchComponentCenter$SearchTakoSugListComponent$ISearchTakoSugListAbility.tu1(c0q0j.LL, c0q0j.LLILLJJLI, c0q0j.LLILLL);
            }
        }
    }

    public static final void onViewDetachedFromWindow$1(C0R45 c0r45, View view) {
        SearchCardVideoPlayerAssem searchCardVideoPlayerAssem = (SearchCardVideoPlayerAssem) c0r45.l0;
        searchCardVideoPlayerAssem.getClass();
        C036E.LIZ.LIZLLL(searchCardVideoPlayerAssem.LLLIIL);
    }

    public static final void onViewDetachedFromWindow$10(C0R45 c0r45, View view) {
        ((SearchVideoPhotoCommentAnchorAssem) c0r45.l0).up();
    }

    public static final void onViewDetachedFromWindow$11(C0R45 c0r45, View view) {
        ((SearchVideoHolder) c0r45.l0).onViewDetachedFromWindow();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public static final void onViewDetachedFromWindow$12(C0R45 c0r45, View view) {
        ?? r0 = ((SearchPhotoCoverLabelAssem) c0r45.l0).LLJJJJJIL;
        if (r0 != 0) {
            r0.invoke();
        }
    }

    public static final void onViewDetachedFromWindow$16(C0R45 c0r45, View view) {
        SearchAdAISummaryCardAssem searchAdAISummaryCardAssem = (SearchAdAISummaryCardAssem) c0r45.l0;
        ARunnableS110S0100000_10 aRunnableS110S0100000_10 = searchAdAISummaryCardAssem.LLJZIJLIL;
        if (aRunnableS110S0100000_10 != null) {
            HandlerHook.viewRemoveCallbacks(view, aRunnableS110S0100000_10);
            searchAdAISummaryCardAssem.LLJZIJLIL = null;
        }
        SearchAdAISummaryCardAssem searchAdAISummaryCardAssem2 = (SearchAdAISummaryCardAssem) c0r45.l0;
        if (searchAdAISummaryCardAssem2.LLL) {
            C0R13 c0r13 = searchAdAISummaryCardAssem2.LLJLLL;
            if (c0r13 != null) {
                c0r13.onViewDetachedFromWindow();
            }
            ((SearchAdAISummaryCardAssem) c0r45.l0).LLL = false;
        }
    }

    public static final void onViewDetachedFromWindow$17(C0R45 c0r45, View view) {
        RecyclerView recyclerViewLLII;
        C0PP8 c0pp8 = ((SearchAdHybridContentAssem) c0r45.l0).LLJL;
        if (c0pp8 != null) {
            c0pp8.onViewDetachedFromWindow();
        }
        SearchTopFragmentAbility searchTopFragmentAbility = (SearchTopFragmentAbility) ((SearchAdHybridContentAssem) c0r45.l0).LLLFF.getValue();
        if (searchTopFragmentAbility != null && (recyclerViewLLII = searchTopFragmentAbility.LLII()) != null) {
            recyclerViewLLII.removeOnScrollListener(((SearchAdHybridContentAssem) c0r45.l0).op());
        }
        SearchAdHybridContentAssem searchAdHybridContentAssem = (SearchAdHybridContentAssem) c0r45.l0;
        if (searchAdHybridContentAssem.LLJJLIIIJLLLLLLLZ == C0PK8.BRAND_HYBRID_AD) {
            BshCardVisibilityManager bshCardVisibilityManager = searchAdHybridContentAssem.LLLI;
            if (bshCardVisibilityManager != null) {
                bshCardVisibilityManager.LIZJ();
            }
            ((SearchAdHybridContentAssem) c0r45.l0).LLLI = null;
        }
    }

    public static final void onViewDetachedFromWindow$18(C0R45 c0r45, View view) {
        InterfaceC656040PoI interfaceC656040PoI = ((SearchAdMixedCreativeCardAssem) c0r45.l0).LLL;
        if (interfaceC656040PoI != null) {
            interfaceC656040PoI.onViewDetachedFromWindow();
        }
    }

    public static final void onViewDetachedFromWindow$19(C0R45 c0r45, View view) {
        InterfaceC656120PoQ interfaceC656120PoQ = ((SearchAdOLEProductAggregationCardAssem) c0r45.l0).LLJLLIL;
        if (interfaceC656120PoQ != null) {
            interfaceC656120PoQ.onViewDetachedFromWindow();
        }
    }

    public static final void onViewDetachedFromWindow$2(C0R45 c0r45, View view) {
        C036E.LIZ.LIZLLL(((SearchCardLivePlayerAssem) c0r45.l0).LLLFZ);
    }

    public static final void onViewDetachedFromWindow$20(C0R45 c0r45, View view) {
        InterfaceC656740PpQ interfaceC656740PpQ = ((SearchAdPhotoCardContentAssem) c0r45.l0).LLJL;
        if (interfaceC656740PpQ != null) {
            interfaceC656740PpQ.onViewDetachedFromWindow();
        }
        InterfaceC656730PpP interfaceC656730PpP = ((SearchAdPhotoCardContentAssem) c0r45.l0).LLJLIL;
        if (interfaceC656730PpP != null) {
            interfaceC656730PpP.onViewDetachedFromWindow();
        }
        ((SearchAdPhotoCardContentAssem) c0r45.l0).LLL = false;
    }

    public static final void onViewDetachedFromWindow$21(C0R45 c0r45, View view) {
        long j;
        long j2;
        SearchTopFragmentAbility searchTopFragmentAbility;
        RecyclerView recyclerViewLLII;
        long jCurrentTimeMillis = System.currentTimeMillis();
        SearchAdBrandZoneContentAssem searchAdBrandZoneContentAssem = (SearchAdBrandZoneContentAssem) c0r45.l0;
        long j3 = searchAdBrandZoneContentAssem.LLLIL;
        if (j3 > 0) {
            j = jCurrentTimeMillis - j3;
        } else {
            j = 0;
        }
        searchAdBrandZoneContentAssem.LLLIL = 0L;
        InterfaceC682870QqT interfaceC682870QqT = searchAdBrandZoneContentAssem.LLLI;
        if (interfaceC682870QqT != null) {
            interfaceC682870QqT.LIZ(j);
        }
        BshCardVisibilityManager bshCardVisibilityManager = ((SearchAdBrandZoneContentAssem) c0r45.l0).LLLILZ;
        if (bshCardVisibilityManager != null) {
            bshCardVisibilityManager.LIZJ();
        }
        SearchAdBrandZoneContentAssem searchAdBrandZoneContentAssem2 = (SearchAdBrandZoneContentAssem) c0r45.l0;
        searchAdBrandZoneContentAssem2.LLLILZ = null;
        long j4 = searchAdBrandZoneContentAssem2.LLLILZJ;
        if (j4 > 0) {
            j2 = jCurrentTimeMillis - j4;
        } else {
            j2 = 0;
        }
        if (!searchAdBrandZoneContentAssem2.LLLIZZ) {
            InterfaceC682870QqT interfaceC682870QqT2 = searchAdBrandZoneContentAssem2.LLLI;
            if (interfaceC682870QqT2 != null) {
                interfaceC682870QqT2.LJIIJJI(j2);
            }
        } else {
            InterfaceC682870QqT interfaceC682870QqT3 = searchAdBrandZoneContentAssem2.LLLI;
            if (interfaceC682870QqT3 != null) {
                interfaceC682870QqT3.LIZJ(j2);
            }
        }
        searchAdBrandZoneContentAssem2.LLLILZJ = 0L;
        searchAdBrandZoneContentAssem2.LLLILZLLLI = false;
        searchAdBrandZoneContentAssem2.LLLIZZ = false;
        SearchAdBrandZoneContentAssem searchAdBrandZoneContentAssem3 = (SearchAdBrandZoneContentAssem) c0r45.l0;
        SearchBrandZoneAutoPlayCardHelper searchBrandZoneAutoPlayCardHelper = searchAdBrandZoneContentAssem3.LLLIILIL;
        if (searchBrandZoneAutoPlayCardHelper != null && (searchTopFragmentAbility = (SearchTopFragmentAbility) searchAdBrandZoneContentAssem3.LLLIIL.getValue()) != null && (recyclerViewLLII = searchTopFragmentAbility.LLII()) != null) {
            recyclerViewLLII.removeOnScrollListener(searchBrandZoneAutoPlayCardHelper);
        }
    }

    public static final void onViewDetachedFromWindow$22(C0R45 c0r45, View view) {
        InterfaceC656520Pp4 interfaceC656520Pp4 = ((SearchAdTopLiveSingleCardAssem) c0r45.l0).LLJLILLLLZIIL;
        if (interfaceC656520Pp4 != null) {
            interfaceC656520Pp4.onViewDetachedFromWindow();
        }
    }

    public static final void onViewDetachedFromWindow$23(C0R45 c0r45, View view) {
        InterfaceC657570Pql interfaceC657570Pql = ((SearchAdTopPhotoSingleCardAssem) c0r45.l0).LLJZIJLIL;
        if (interfaceC657570Pql != null) {
            interfaceC657570Pql.onViewDetachedFromWindow();
        }
    }

    public static final void onViewDetachedFromWindow$24(C0R45 c0r45, View view) {
        InterfaceC657580Pqm interfaceC657580Pqm = ((SearchAdTopVideoSingleCardAssem) c0r45.l0).LLJLLL;
        if (interfaceC657580Pqm != null) {
            interfaceC657580Pqm.onViewDetachedFromWindow();
        }
    }

    public static final void onViewDetachedFromWindow$25(C0R45 c0r45, View view) {
        C0P6R.LIZIZ(((SearchJediMixFeedFragment) c0r45.l0).hashCode());
    }

    public static final void onViewDetachedFromWindow$26(C0R45 c0r45, View view) {
        InterfaceC655350PnB interfaceC655350PnB = ((SearchMixLiveCardContentAssem) c0r45.l0).LLJZ;
        if (interfaceC655350PnB != null) {
            interfaceC655350PnB.onViewDetachedFromWindow();
        }
    }

    public static final void onViewDetachedFromWindow$27(C0R45 c0r45, View view) {
        TakoSingleVideoAssem takoSingleVideoAssem = (TakoSingleVideoAssem) c0r45.l0;
        takoSingleVideoAssem.getClass();
        if (EventBus.LIZLLL().LJIIJ(takoSingleVideoAssem)) {
            EventBus.LIZLLL().LJJI(takoSingleVideoAssem);
        }
    }

    public static final void onViewDetachedFromWindow$28(C0R45 c0r45, View view) {
        TakoVideoListAssem takoVideoListAssem = (TakoVideoListAssem) c0r45.l0;
        takoVideoListAssem.getClass();
        if (EventBus.LIZLLL().LJIIJ(takoVideoListAssem)) {
            EventBus.LIZLLL().LJJI(takoVideoListAssem);
        }
    }

    public static final void onViewDetachedFromWindow$29(C0R45 c0r45, View view) {
        C662750Pz7.LIZ.getClass();
        ((LiveData) C662750Pz7.LJFF.getValue()).removeObserver((Observer) c0r45.l0);
    }

    public static final void onViewDetachedFromWindow$3(C0R45 c0r45, View view) {
        InterfaceC655240Pn0 interfaceC655240Pn0 = ((SearchSubCardAssem) c0r45.l0).LLJLIL;
        if (interfaceC655240Pn0 != null) {
            interfaceC655240Pn0.onViewDetachedFromWindow();
        }
        InterfaceC652300PiG interfaceC652300PiGYp = ((SearchSubCardAssem) c0r45.l0).yp();
        if (interfaceC652300PiGYp != null) {
            interfaceC652300PiGYp.LLD(C631370Opb.LIZIZ((SearchSubCardAssem) c0r45.l0), (InterfaceC1891350zJl) C631370Opb.LIZ((SearchSubCardAssem) c0r45.l0));
        }
        SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = (SearchComponentCenter$Player$PlayerControlAbility) ((SearchSubCardAssem) c0r45.l0).LLJLILLLLZIIL.getValue();
        if (searchComponentCenter$Player$PlayerControlAbility != null) {
            searchComponentCenter$Player$PlayerControlAbility.VV1(((SearchSubCardAssem) c0r45.l0).LLJLLIL);
        }
    }

    public static final void onViewDetachedFromWindow$30(C0R45 c0r45, View view) {
        C0R2L c0r2l = (C0R2L) c0r45.l0;
        c0r2l.getClass();
        if (EventBus.LIZLLL().LJIIJ(c0r2l)) {
            EventBus.LIZLLL().LJJI(c0r2l);
        }
    }

    public static final void onViewDetachedFromWindow$31(C0R45 c0r45, View view) {
        ((AbstractC666440QCc) c0r45.l0).getClass();
    }

    public static final void onViewDetachedFromWindow$32(C0R45 c0r45, View view) {
        InterfaceC656110PoP interfaceC656110PoPUp = ((ProductAggregationSubCardAssem) c0r45.l0).up();
        if (interfaceC656110PoPUp != null) {
            interfaceC656110PoPUp.LLD(C631370Opb.LIZIZ((ProductAggregationSubCardAssem) c0r45.l0), (InterfaceC1891350zJl) C631370Opb.LIZ((ProductAggregationSubCardAssem) c0r45.l0));
        }
    }

    public static final void onViewDetachedFromWindow$36(C0R45 c0r45, View view) {
        ((AbstractC649370PdX) c0r45.l0).LIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
    
        if (0 != r6) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onViewDetachedFromWindow$39(X.C0R45 r9, android.view.View r10) {
        /*
            java.lang.Object r0 = r9.l0
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            if (r0 == 0) goto L58
            X.19ry r10 = r0.getAdapter()
            if (r10 == 0) goto L58
            boolean r0 = r10 instanceof X.C670510QRt
            if (r0 == 0) goto L58
            X.0QRt r10 = (X.C670510QRt) r10
            r0 = 2
            int[] r9 = new int[r0]
            androidx.recyclerview.widget.RecyclerView r0 = r10.LLILLJJLI
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            int r0 = r1.findFirstCompletelyVisibleItemPosition()
            r8 = 0
            r9[r8] = r0
            X.19sy r7 = X.AbstractC21679819sy.LIZ(r8, r1)
            java.util.List<com.ss.android.ugc.aweme.music.model.MusicTag> r0 = r10.LLILLL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r6 = r0.size()
            int r5 = r7.LJIIJ()
            int r4 = r7.LJI()
            r3 = 1
            if (r6 <= 0) goto L59
            r2 = 1
        L3c:
            androidx.recyclerview.widget.RecyclerView r0 = r10.LLILLJJLI
            android.view.View r0 = r0.getChildAt(r8)
            if (r0 == 0) goto L56
            int r1 = r7.LJ(r0)
            int r0 = r7.LIZIZ(r0)
            if (r1 >= r4) goto L5b
            if (r0 <= r5) goto L5b
            if (r1 < r5) goto L5b
            if (r0 > r4) goto L5b
            r9[r3] = r1
        L56:
            r10.LLILZ = r9
        L58:
            return
        L59:
            r2 = 0
            goto L5c
        L5b:
            int r8 = r8 + r2
        L5c:
            if (r8 == r6) goto L56
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0R45.onViewDetachedFromWindow$39(X.0R45, android.view.View):void");
    }

    public static final void onViewDetachedFromWindow$4(C0R45 c0r45, View view) {
        Iterator it2 = ((ArrayList) ((SearchCardCommonAbilityImpl) c0r45.l0).LLILLL.getValue()).iterator();
        while (it2.hasNext()) {
            ((View.OnAttachStateChangeListener) it2.next()).onViewDetachedFromWindow(view);
        }
    }

    public static final void onViewDetachedFromWindow$40(C0R45 c0r45, View view) {
        VideoCitationAssem videoCitationAssem = (VideoCitationAssem) c0r45.l0;
        videoCitationAssem.getClass();
        if (EventBus.LIZLLL().LJIIJ(videoCitationAssem)) {
            EventBus.LIZLLL().LJJI(videoCitationAssem);
        }
    }

    public static final void onViewDetachedFromWindow$41(C0R45 c0r45, View view) {
        ((C658230Prp) c0r45.l0).LLJILJILJ = false;
    }

    public static final void onViewDetachedFromWindow$42(C0R45 c0r45, View view) {
        EventBus.LIZLLL().LJJI((AbstractC652910PjF) c0r45.l0);
    }

    public static final void onViewDetachedFromWindow$43(C0R45 c0r45, View view) {
        C0Q5B c0q5b = (C0Q5B) c0r45.l0;
        c0q5b.LIZLLL.LIZIZ = false;
        if (C650560PfS.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onViewDetachedFromWindow, ");
            sbLIZ.append(c0q5b.LJIIZILJ());
            sbLIZ.append('.');
            C2188811AlT.LIZIZ(sbLIZ);
        }
        ((C0Q5B) c0r45.l0).LJJLIIIJLLLLLLLZ();
    }

    public static final void onViewDetachedFromWindow$44(C0R45 c0r45, View view) {
        ((C658240Prq) c0r45.l0).LLIZLLLIL = false;
    }

    public static final void onViewDetachedFromWindow$46(C0R45 c0r45, View view) {
        InterfaceC655270Pn3 interfaceC655270Pn3;
        ViewOnAttachStateChangeListenerC655110Pmn viewOnAttachStateChangeListenerC655110Pmn = (ViewOnAttachStateChangeListenerC655110Pmn) c0r45.l0;
        viewOnAttachStateChangeListenerC655110Pmn.getClass();
        SAFHelper sAFHelper = SAFHelper.LIZ;
        View view2 = viewOnAttachStateChangeListenerC655110Pmn.itemView;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(view2.getContext());
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJJII = SAFHelper.LJJII(view2, c19egLIZIZ);
        if ((lifecycleOwnerLJJII instanceof InterfaceC655270Pn3) && (interfaceC655270Pn3 = (InterfaceC655270Pn3) lifecycleOwnerLJJII) != null) {
            interfaceC655270Pn3.unRegisterActivityOnKeyDownListener(viewOnAttachStateChangeListenerC655110Pmn.LLLJL);
        }
        InterfaceC655240Pn0 interfaceC655240Pn0 = ((ViewOnAttachStateChangeListenerC655110Pmn) c0r45.l0).LLLJIL;
        if (interfaceC655240Pn0 != null) {
            interfaceC655240Pn0.onViewDetachedFromWindow();
        }
        C036E.LIZ.LIZLLL(((ViewOnAttachStateChangeListenerC655110Pmn) c0r45.l0).LLLILZLLLI);
        AnonymousClass0956 anonymousClass0956 = ((ViewOnAttachStateChangeListenerC655110Pmn) c0r45.l0).LLLIIII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        ViewOnAttachStateChangeListenerC655110Pmn viewOnAttachStateChangeListenerC655110Pmn2 = (ViewOnAttachStateChangeListenerC655110Pmn) c0r45.l0;
        viewOnAttachStateChangeListenerC655110Pmn2.LLLIIII = null;
        InterfaceC655280Pn4 interfaceC655280Pn4 = viewOnAttachStateChangeListenerC655110Pmn2.LLLFZ;
        if (interfaceC655280Pn4 != null) {
            interfaceC655280Pn4.stop();
        }
        ((ViewOnAttachStateChangeListenerC655110Pmn) c0r45.l0).h6();
    }

    public static final void onViewDetachedFromWindow$47(C0R45 c0r45, View view) {
        ((C648750PcX) c0r45.l0).LJFF();
    }

    public static final void onViewDetachedFromWindow$48(C0R45 c0r45, View view) {
        view.removeOnLayoutChangeListener((ViewOnLayoutChangeListenerC640820PBo) c0r45.l0);
    }

    public static final void onViewDetachedFromWindow$49(C0R45 c0r45, View view) {
        Iterator it2 = ((ArrayList) ((SearchCardCellCommonAbilityImpl) c0r45.l0).LLILLL.getValue()).iterator();
        while (it2.hasNext()) {
            ((View.OnAttachStateChangeListener) it2.next()).onViewDetachedFromWindow(view);
        }
    }

    public static final void onViewDetachedFromWindow$51(C0R45 c0r45, View view) {
        String aid;
        InterfaceC655270Pn3 interfaceC655270Pn3;
        String aid2;
        SearchPhotoHolder searchPhotoHolder = (SearchPhotoHolder) c0r45.l0;
        searchPhotoHolder.LLLFF = false;
        searchPhotoHolder.LLLFFI = false;
        searchPhotoHolder.LLJLIL = false;
        ConcurrentHashMap<String, WeakReference<C653660PkS>> concurrentHashMap = C666560QCo.LJIJJ;
        Aweme aweme = searchPhotoHolder.LL;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        concurrentHashMap.remove(aid);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "search_scrolling_ui_thread_overload_optimization_phase_2", true, false)) {
            Aweme aweme2 = searchPhotoHolder.LL;
            if (aweme2 != null) {
                aid2 = aweme2.getAid();
            } else {
                aid2 = null;
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C0H8G(searchPhotoHolder, aid2, null), 3);
        } else {
            Taco tacoLIZ = C0PCE.LIZ(searchPhotoHolder.itemView, false);
            if (tacoLIZ != null) {
                Taco.LJ(tacoLIZ, searchPhotoHolder);
            }
        }
        searchPhotoHolder.LLJJJ();
        searchPhotoHolder.LLLL = true;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        View view2 = searchPhotoHolder.itemView;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(view2.getContext());
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJJII = SAFHelper.LJJII(view2, c19egLIZIZ);
        if ((lifecycleOwnerLJJII instanceof InterfaceC655270Pn3) && (interfaceC655270Pn3 = (InterfaceC655270Pn3) lifecycleOwnerLJJII) != null) {
            interfaceC655270Pn3.unRegisterActivityOnKeyDownListener(searchPhotoHolder.LLLILZJ);
        }
    }

    public static final void onViewDetachedFromWindow$6(C0R45 c0r45, View view) {
        ((SearchList) c0r45.l0).LLLLII.LIZIZ().getClass();
    }

    public static final void onViewDetachedFromWindow$7(C0R45 c0r45, View view) {
        NextLiveData nextLiveData;
        SearchTakoCardAssem searchTakoCardAssem = (SearchTakoCardAssem) c0r45.l0;
        if ((searchTakoCardAssem instanceof LifecycleOwner) && searchTakoCardAssem != null) {
            RecyclerView recyclerViewGp = searchTakoCardAssem.Gp();
            if (recyclerViewGp != null) {
                recyclerViewGp.removeOnScrollListener(searchTakoCardAssem.LLLLIL);
            }
            SearchGlobalViewModel searchGlobalViewModel = (SearchGlobalViewModel) searchTakoCardAssem.LLLILZLLLI.getValue();
            if (searchGlobalViewModel != null && (nextLiveData = searchGlobalViewModel.LLILZ) != null) {
                nextLiveData.removeObserver(searchTakoCardAssem.LLLLILI);
            }
            searchTakoCardAssem.getLifecycle().removeObserver(searchTakoCardAssem.LLLLIILLL);
        }
        ((C640320P9q) ((SearchTakoCardAssem) c0r45.l0).Ap().LL.getValue()).LIZJ(Boolean.FALSE);
    }

    public static final void onViewDetachedFromWindow$9(C0R45 c0r45, View view) {
        ((SearchCLASubtitleCommonAssem) c0r45.l0).Fo(false);
    }
}
