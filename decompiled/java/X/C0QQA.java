package X;

import Y.ARunnableS110S0100000_10;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.search.PromotionInfo;
import com.ss.android.ugc.aweme.feed.model.search.WordStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchCoinHintService;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.SearchRelatedSuggestionUiAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.SearchRelatedSuggestionVM;
import com.ss.android.ugc.aweme.service.IPostModeService;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS25S0010000_10;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QQA, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QQA extends ConstraintLayout {
    public static final C01GW<AbstractC1511510pR7> LLJLLL = C452501pT.LIZIZ(new C0QQC());
    public final Aweme LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final Function0<Unit> LLIZ;
    public final Integer LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxIconView LLJILJILJ;
    public View LLJILLL;
    public LinearLayout LLJJ;
    public TuxIconView LLJJI;
    public LinearLayout LLJJIII;
    public final String LLJJIJI;
    public final String LLJJIJIIJIL;
    public final String LLJJIJIL;
    public final String LLJJJ;
    public final String LLJJJIL;
    public final PromotionInfo LLJJJJ;
    public final String LLJJJJJIL;
    public final String LLJJJJLIIL;
    public final Boolean LLJJL;
    public final WordStruct LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final long LLJLIL;
    public final String LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public boolean LLJLLIL;

    private final C0QQT getVideoShrinkAbility() {
        return (C0QQT) this.LLJLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e0() {
        AssemVMLazy assemVMLazy;
        IPostModeService iPostModeService;
        Activity activityLIZ = C1388190mED.LIZ(getContext());
        if (activityLIZ instanceof C19EG) {
            Fragment fragmentLIZLLL = C651580Ph6.LIZLLL(this);
            boolean zLIZ = false;
            if (!this.LLILZIL || fragmentLIZLLL == null || (iPostModeService = (IPostModeService) PluggableExtentionKt.pluggableSpi$default(IPostModeService.class, false, false, false, 14, null)) == null || !iPostModeService.LJJ()) {
                ComponentActivity componentActivity = (ComponentActivity) activityLIZ;
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchRelatedSuggestionVM.class);
                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(componentActivity, c19719912DlLIZ), new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 1039), new C452070Ho5(), C724750Sbp.LJII(componentActivity), C724750Sbp.LJIIIZ(componentActivity), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) componentActivity, 1040), AFwS241S0000000_10.get$arr$(469));
            } else {
                C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SearchRelatedSuggestionVM.class);
                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragmentLIZLLL, c19719912DlLIZ2), new AwS554S0100000_10((C13IQ) c19719912DlLIZ2, 1037), new C452070Ho5(), C724750Sbp.LJII(fragmentLIZLLL), C724750Sbp.LJIIIZ(fragmentLIZLLL), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) fragmentLIZLLL, 1038), AFwS241S0000000_10.get$arr$(468));
            }
            if (!this.LLILZIL) {
                C2263001Dhq c2263001Dhq = SearchRelatedSuggestionUiAssem.LLJ;
                SearchRelatedSuggestionVM searchRelatedSuggestionVM = (SearchRelatedSuggestionVM) assemVMLazy.getValue();
                c2263001Dhq.getClass();
                SearchRelatedSuggestionUiAssem.LLJIJIL = new WeakReference<>(this);
                C2263001Dhq.LIZLLL(searchRelatedSuggestionVM.getState().LL, searchRelatedSuggestionVM);
                C2263001Dhq.LIZJ(searchRelatedSuggestionVM.getState().LLILLJJLI);
            }
            SAFHelper.LIZ.getClass();
            if (!SAFHelper.LJIIJ() || fragmentLIZLLL == null) {
                C1563370qml.LIZ((LifecycleOwner) activityLIZ, EnumC682280QpW.MAIN, new AwS411S0200000_10(activityLIZ, this, 75));
            } else {
                C723850SaN.LIZ(fragmentLIZLLL, false, null, new AwS376S0200000_10(fragmentLIZLLL, this, 101), 3);
            }
            SearchRelatedSuggestionVM searchRelatedSuggestionVM2 = (SearchRelatedSuggestionVM) assemVMLazy.getValue();
            Aweme aweme = this.LL;
            String str = this.LLJJIJIIJIL;
            String str2 = this.LLJJIJIL;
            boolean z = this.LLILZLL;
            searchRelatedSuggestionVM2.LLILLL = aweme;
            searchRelatedSuggestionVM2.LL = str;
            searchRelatedSuggestionVM2.LLILLJJLI = str2;
            searchRelatedSuggestionVM2.LLILZ = z;
            C0QQP c0qqp = (C0QQP) searchRelatedSuggestionVM2.LLILZLL.getValue().getOperator();
            if (c0qqp.LL.isLogin() && C0BQY.LIZ()) {
                Keva keva = C1959707lz.LIZ;
                zLIZ = C1959707lz.LIZ(aweme, c0qqp.LL.getCurUserId());
            }
            if (C0BQY.LIZ() && searchRelatedSuggestionVM2.LLILZIL.isLogin()) {
                searchRelatedSuggestionVM2.setState(new AwS25S0010000_10(zLIZ, 8));
            } else {
                searchRelatedSuggestionVM2.setState(new AwS25S0010000_10(zLIZ, 9));
            }
        }
    }

    public final Bundle getSearchParams() {
        Map<String, String> mapLJLJL;
        Aweme aweme;
        String strLJII;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("in_single_stack", "true", bundle);
        C786410Ut5.LJJJI("keyword", this.LLJJIJIIJIL, bundle);
        C786410Ut5.LJJJI("group_id", this.LL.getAid(), bundle);
        C786410Ut5.LJJJI("is_from_comment", "1", bundle);
        C786410Ut5.LJJJI("search_position", this.LLILLJJLI, bundle);
        C786410Ut5.LJJJI("tab_name", this.LLILLL, bundle);
        C786410Ut5.LJJJI("set_hint_by_sug_word", "true", bundle);
        C786410Ut5.LJJJI("enter_from", this.LLILLJJLI, bundle);
        Aweme aweme2 = this.LL;
        C786410Ut5.LJJJI("enter_method", aweme2 != null && C1010120cOQ.LJIIJ(aweme2) ? "ad_comment_related_search" : "comment_related_search", bundle);
        C786410Ut5.LJJJI("is_feed_liked", String.valueOf(this.LL.isLike()), bundle);
        C786410Ut5.LJJJI("is_feed_collected", String.valueOf(AwemeExtKt.isCollected(this.LL)), bundle);
        C786410Ut5.LJJJI("is_feed_comment_clicked", String.valueOf(AwemeBizExtKt.isCommentClicked(this.LL)), bundle);
        C786410Ut5.LJJJI("is_feed_forward_clicked", String.valueOf(AwemeBizExtKt.isForwardClicked(this.LL)), bundle);
        PromotionInfo promotionInfo = this.LLJJJJ;
        if (promotionInfo != null) {
            String promotionText = promotionInfo.getPromotionText();
            if (!(C123100dR.LIZ(promotionText) && !C1101304Sl.LIZ(this.LLJJJJJIL))) {
                promotionText = null;
            }
            if (promotionText != null) {
                C786410Ut5.LJJIZ(bundle, "extraLogParams", C786410Ut5.J3(new JSONObject().put("from_promotion_text", promotionText).put("from_promotion_type", promotionInfo.getPromotionType())));
            }
        }
        String str = this.LLJJJJJIL;
        String str2 = C123100dR.LIZ(str) ? str : null;
        if (str2 != null) {
            C786410Ut5.LJJJI("words_extra_type", str2, bundle);
        }
        if (C1ER1.LIZIZ.LJJJLL(this.LLILLJJLI) || Intrinsics.LJFF("others_homepage", this.LLILLJJLI)) {
            C786410Ut5.LJJJI("is_from_video_fix", "1", bundle);
        }
        if (this.LLILZLL) {
            C786410Ut5.LJJJI("is_from_photo", "1", bundle);
        }
        if (!this.LLILZIL && Intrinsics.LJFF(this.LLILLJJLI, EnumC669620QOi.PHOTO.getTabName())) {
            C786410Ut5.LJJJI("is_from_video", "1", bundle);
        }
        C786410Ut5.LJJJI("penetrate_info", this.LLJJJJLIIL, bundle);
        if (!C1101304Sl.LIZ(this.LLJJJJJIL)) {
            ISearchCoinHintService.LIZ.getClass();
            ISearchCoinHintService iSearchCoinHintServiceLIZ = C0QQF.LIZ();
            if (iSearchCoinHintServiceLIZ != null && iSearchCoinHintServiceLIZ.LIZJ(this.LL, "comment_related_search")) {
                C786410Ut5.LJJJI("has_coin_entrance", "1", bundle);
            }
        }
        if (C1101304Sl.LIZ(this.LLJJJJJIL)) {
            C786410Ut5.LJJJI("is_from_sensitive_words", "1", bundle);
        }
        if (this.LL.isAd()) {
            AwemeCommerceStruct commerceVideoAuthInfo = this.LL.getCommerceVideoAuthInfo();
            C786410Ut5.LJJJI("enable_ad_star_hub", String.valueOf(commerceVideoAuthInfo != null ? commerceVideoAuthInfo.isEnableAdStarHub() : false), bundle);
        }
        Aweme aweme3 = this.LL;
        if ((aweme3 != null && C1010120cOQ.LJIIJ(aweme3)) && (aweme = this.LL) != null && (strLJII = C1010120cOQ.LJII(aweme)) != null) {
            C786410Ut5.LJJJI("search_ad_extra_context", strLJII, bundle);
        }
        C786410Ut5.LJJJI("is_display_sevensplit_screen", h0() ? "1" : CardStruct.IStatusCode.DEFAULT, bundle);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IEcomSearchService iEcomSearchService = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
        if (iEcomSearchService != null && (mapLJLJL = iEcomSearchService.LJLJL(this.LLJJJJLIIL)) != null) {
            linkedHashMap.putAll(mapLJLJL);
        }
        if (!linkedHashMap.isEmpty()) {
            try {
                C786410Ut5.LJJJI("suggest_word_mob_extra", C1741890vQh.LJIIIIZZ(linkedHashMap), bundle);
                C189200o6.m2constructorimpl(Unit.LIZ);
                return bundle;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return bundle;
    }

    public final boolean h0() {
        ISearchService iSearchService = (ISearchService) PluggableExtentionKt.pluggableSpi$default(ISearchService.class, false, false, false, 14, null);
        if (iSearchService == null) {
            return false;
        }
        Context context = getContext();
        Aweme aweme = this.LL;
        String str = this.LLILLJJLI;
        EnumC667230QFd enumC667230QFd = EnumC667230QFd.SEARCH_RELATED_WORD;
        boolean z = this.LLILZIL;
        C0QQT videoShrinkAbility = getVideoShrinkAbility();
        return iSearchService.j0(context, aweme, str, enumC667230QFd, z, videoShrinkAbility != null ? videoShrinkAbility.Si() : false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LLILZIL || this.LLJLLIL || !isShown()) {
            return;
        }
        this.LLJLLIL = true;
        j0(this.LL, this.LLILLJJLI);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJLLIL = false;
        if (this.LLILZIL || !C301010Br1.LIZ()) {
            return;
        }
        Activity activityLIZ = C1388190mED.LIZ(getContext());
        if (activityLIZ instanceof C19EG) {
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchRelatedSuggestionUiAssem.class);
            AssemSupervisor assemSupervisorLIZLLL = C724240Sb0.LIZLLL((C19EG) activityLIZ);
            if (assemSupervisorLIZLLL != null) {
                assemSupervisorLIZLLL.LJIIIZ(null, c19719912DlLIZ);
            }
            Fragment fragmentLIZLLL = C651580Ph6.LIZLLL(this);
            IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
            Fragment fragmentLIZLLL2 = iDetailFeedSafService != null ? iDetailFeedSafService.LIZLLL(fragmentLIZLLL) : null;
            SAFHelper.LIZ.getClass();
            if (!SAFHelper.LJIIJ() || fragmentLIZLLL == null) {
                return;
            }
            if (fragmentLIZLLL2 == null || fragmentLIZLLL2.getActivity() != null) {
                C723850SaN.LJIIIIZZ(fragmentLIZLLL, C13LE.LIZ(SearchRelatedSuggestionUiAssem.class));
            }
        }
    }

    public final void i0(float f) {
        C666360QBu.LIZ.getClass();
        if (f >= C666360QBu.LIZ().scoreThreshold) {
            C786410Ut5.LJLIIL(C666360QBu.LIZ().prefetchDelayTime, new BPEAHandler(Looper.getMainLooper()), new ARunnableS110S0100000_10(this, 131));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0(com.ss.android.ugc.aweme.feed.model.Aweme r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QQA.j0(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            e0();
            if (!this.LLILZIL && !this.LLJLLIL && isShown()) {
                this.LLJLLIL = true;
                j0(this.LL, this.LLILLJJLI);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x073b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0QQA(android.content.Context r24, com.ss.android.ugc.aweme.feed.model.Aweme r25, java.lang.String r26, java.lang.String r27, boolean r28, boolean r29, boolean r30, kotlin.jvm.functions.Function0<kotlin.Unit> r31, java.lang.Integer r32) {
        /*
            Method dump skipped, instruction units count: 2121
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QQA.<init>(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, boolean, boolean, boolean, kotlin.jvm.functions.Function0, java.lang.Integer):void");
    }
}
