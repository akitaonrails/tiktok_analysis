package Y;

import X.C09JN;
import X.C0BRE;
import X.C0H1U;
import X.C0P0T;
import X.C0P7M;
import X.C0PG7;
import X.C0PRC;
import X.C0Q3E;
import X.C1388190mED;
import X.C1389910mGz;
import X.C1931907hV;
import X.C19EG;
import X.C2188811AlT;
import X.C640240P9i;
import X.C640810PBn;
import X.C644560PPy;
import X.C666000QAk;
import X.C668120QIo;
import X.C668360QJm;
import X.C668490QJz;
import X.C823050WQl;
import X.C844470XAv;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixShopContainerVerticalAssem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.background.ui.SearchTop1BackgroundAssem;
import com.ss.android.ugc.aweme.search.ecommerce.viewmodel.SearchContainerHeaderVM;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.model.HistoryExtraInfo;
import com.ss.android.ugc.aweme.search.model.RichHisInfo;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.pages.common.personalized.banner.core.viewmodel.SearchPersonalizedBannerVM;
import com.ss.android.ugc.aweme.search.pages.common.theme.activitybg.ActivityCardThemeViewModel;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;
import com.ss.android.ugc.aweme.search.pages.middlepage.historytag.viewmodel.SearchHistoryIconManagerVM;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.helppost.ui.SearchHelpPostCardContentAssem;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import com.tts.oecverify.BdTuring;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public class AObserverS175S0200000_10 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onChanged$12(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS175S0200000_10 aObserverS175S0200000_10, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            FrameLayout frameLayout = ((MixShopContainerVerticalAssem) aObserverS175S0200000_10.l0).LLJLL;
            if (frameLayout != null) {
                C0H1U.LJIIJ(((SearchContainerHeaderVM) aObserverS175S0200000_10.l1).vQ2(), frameLayout);
            }
            new AwS554S0100000_10((SearchContainerHeaderVM) aObserverS175S0200000_10.l1, 103);
            C1931907hV.LIZ();
        }
    }

    public static final void onChanged$1(AObserverS175S0200000_10 aObserverS175S0200000_10, Object obj) {
        Integer num = (Integer) obj;
        int iLJIJJLI = C644560PPy.LJIJJLI();
        if (num != null && num.intValue() == iLJIJJLI) {
            IAVPublishService iAVPublishService = ((SearchHelpPostCardContentAssem) aObserverS175S0200000_10.l0).LLLILZJ;
            if (iAVPublishService != null) {
                iAVPublishService.showProgress(C1388190mED.LIZIZ(((View) aObserverS175S0200000_10.l1).getContext()), false);
                return;
            }
            return;
        }
        IAVPublishService iAVPublishService2 = ((SearchHelpPostCardContentAssem) aObserverS175S0200000_10.l0).LLLILZJ;
        if (iAVPublishService2 == null) {
            return;
        }
        iAVPublishService2.hideProgress(C1388190mED.LIZIZ(((View) aObserverS175S0200000_10.l1).getContext()));
    }

    public static final void onChanged$10(AObserverS175S0200000_10 aObserverS175S0200000_10, Object obj) {
        if (!((Boolean) obj).booleanValue() && ((Lifecycle) aObserverS175S0200000_10.l0).getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            ((C0P7M) aObserverS175S0200000_10.l1).LIZLLL("exit");
        }
    }

    public static final void onChanged$11(AObserverS175S0200000_10 aObserverS175S0200000_10, Object obj) {
        float fWQ2;
        int i = ((ActivityCardThemeViewModel) aObserverS175S0200000_10.l0).LLILLJJLI;
        C640240P9i c640240P9i = (C640240P9i) aObserverS175S0200000_10.l1;
        if (c640240P9i.LJIIJ != i) {
            c640240P9i.LJIIJ = i;
            ActivityCardThemeViewModel activityCardThemeViewModel = c640240P9i.LIZJ;
            if (activityCardThemeViewModel != null) {
                fWQ2 = activityCardThemeViewModel.wQ2();
            } else {
                fWQ2 = 0.0f;
            }
            C640240P9i c640240P9i2 = (C640240P9i) aObserverS175S0200000_10.l1;
            if (c640240P9i2.LJI != fWQ2) {
                c640240P9i2.LJI = fWQ2;
            }
            c640240P9i2.LIZIZ();
            ((C640240P9i) aObserverS175S0200000_10.l1).invalidateSelf();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0370  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$12(Y.AObserverS175S0200000_10 r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 1290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS175S0200000_10.onChanged$12(Y.AObserverS175S0200000_10, java.lang.Object):void");
    }

    public static final void onChanged$2(AObserverS175S0200000_10 aObserverS175S0200000_10, Object obj) {
        if (((Integer) obj).intValue() != 0) {
            if (((C0P0T) aObserverS175S0200000_10.l0).isShowing()) {
                ((C0P0T) aObserverS175S0200000_10.l0).dismiss();
            }
            ((SearchContainerFragment) aObserverS175S0200000_10.l1).LLJILLL.xQ2().removeObserver(aObserverS175S0200000_10);
        }
    }

    public static final void onChanged$3(AObserverS175S0200000_10 aObserverS175S0200000_10, Object obj) {
        if (((Number) obj).intValue() == 3) {
            ActivityCardThemeViewModel activityCardThemeViewModel = (ActivityCardThemeViewModel) aObserverS175S0200000_10.l0;
            View view = (View) aObserverS175S0200000_10.l1;
            activityCardThemeViewModel.getClass();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            activityCardThemeViewModel.LL = iArr[1] + view.getHeight();
        }
    }

    public static final void onChanged$4(AObserverS175S0200000_10 aObserverS175S0200000_10, Object obj) {
        String str;
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams;
        PhotoSearchBaseVM photoSearchBaseVM = ((PhotoSearchFragment) aObserverS175S0200000_10.l0).LLJIJIL;
        if (photoSearchBaseVM != null) {
            PhotoSearchEnterParams photoSearchEnterParams = photoSearchBaseVM.LLILLL;
            if (photoSearchEnterParams == null || (photoSearchToolsEnterParams = photoSearchEnterParams.toolsParams) == null || (str = photoSearchToolsEnterParams.localFilePath) == null) {
                str = "";
            }
            PhotoSearchBaseVM.wQ2(str).LJJLL(new AfS146S0200000_10((PhotoSearchFragment) aObserverS175S0200000_10.l0, (C19EG) aObserverS175S0200000_10.l1, 0), new C09JN() { // from class: X.00Nl
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                    C1C7U.LIZ("PhotoSearchFragment@f74c.refreshPage$1$requestByUri$1$1$subscriber$2");
                    C1C7U.LIZIZ("PhotoSearchFragment@f74c.refreshPage$1$requestByUri$1$1$subscriber$2");
                }
            });
        }
    }

    public static final void onChanged$5(AObserverS175S0200000_10 aObserverS175S0200000_10, Object obj) {
        Integer num = (Integer) obj;
        int i = ((C0PRC) C0Q3E.LIZ((View) aObserverS175S0200000_10.l0).Ph1().LIZJ()).LL;
        int i2 = ((SearchVideoPhotoCommentAnchorAssem) aObserverS175S0200000_10.l1).LLJZ;
        if (num != null && num.intValue() == i2) {
            return;
        }
        ((SearchVideoPhotoCommentAnchorAssem) aObserverS175S0200000_10.l1).LLJZ = num.intValue();
        if (num.intValue() == i) {
            ((SearchVideoPhotoCommentAnchorAssem) aObserverS175S0200000_10.l1).yp();
        } else {
            ((SearchVideoPhotoCommentAnchorAssem) aObserverS175S0200000_10.l1).up();
        }
    }

    public static final void onChanged$6(AObserverS175S0200000_10 aObserverS175S0200000_10, Object obj) {
        ((Observer) aObserverS175S0200000_10.l0).onChanged(obj);
        ((LiveData) aObserverS175S0200000_10.l1).removeObserver(aObserverS175S0200000_10);
    }

    public static final void onChanged$7(AObserverS175S0200000_10 aObserverS175S0200000_10, Object obj) {
        C668360QJm c668360QJm;
        SearchHistory searchHistory;
        Integer num;
        Object next;
        boolean zEquals;
        List list = (List) obj;
        if (((View) aObserverS175S0200000_10.l0).isAttachedToWindow() && (searchHistory = (c668360QJm = (C668360QJm) aObserverS175S0200000_10.l1).LLJJIII) != null) {
            View view = (View) aObserverS175S0200000_10.l0;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    num = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((HistoryExtraInfo) next).word, searchHistory.keyword)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                HistoryExtraInfo historyExtraInfo = (HistoryExtraInfo) next;
                if (historyExtraInfo != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("VM?.data?.observe history = ");
                    sbLIZ.append(searchHistory);
                    sbLIZ.append(" getIsWaitForHistoryRespons=");
                    int iL5 = c668360QJm.L5();
                    HashMap<Integer, Boolean> map = searchHistory.LIZIZ;
                    if (map == null) {
                        zEquals = false;
                    } else {
                        zEquals = Boolean.TRUE.equals(map.get(Integer.valueOf(iL5)));
                    }
                    sbLIZ.append(zEquals);
                    sbLIZ.append(" iconType = ");
                    RichHisInfo richHisInfo = historyExtraInfo.richHisInfo;
                    if (richHisInfo != null) {
                        num = richHisInfo.iconType;
                    }
                    sbLIZ.append(num);
                    C2188811AlT.LIZIZ(sbLIZ);
                    int iL52 = c668360QJm.L5();
                    HashMap<Integer, Boolean> map2 = searchHistory.LIZIZ;
                    if (map2 != null && Boolean.TRUE.equals(map2.get(Integer.valueOf(iL52)))) {
                        searchHistory.LIZLLL(c668360QJm.L5(), false);
                        RichHisInfo richHisInfo2 = historyExtraInfo.richHisInfo;
                        if (richHisInfo2 == null || richHisInfo2.iconType == null) {
                            RichHisInfo richHisInfo3 = searchHistory.LIZJ.get(Integer.valueOf(c668360QJm.L5()));
                            if (richHisInfo3 == null || !C668120QIo.LIZ(searchHistory.keyword) || richHisInfo3.subTitle == null) {
                                return;
                            }
                        }
                        searchHistory.LJ(historyExtraInfo.richHisInfo, c668360QJm.L5());
                        c668360QJm.I5(searchHistory, c668360QJm.LLILLJJLI, c668360QJm.LLILLL, c668360QJm.LLILZ, c668360QJm.LLJJIJIIJIL);
                        SearchHistoryIconManagerVM searchHistoryIconManagerVM = (SearchHistoryIconManagerVM) c668360QJm.LLJ.getValue();
                        if (searchHistoryIconManagerVM != null && searchHistoryIconManagerVM.LLILZLL) {
                            final String str = searchHistory.keyword;
                            final Integer numValueOf = Integer.valueOf(c668360QJm.getLayoutPosition());
                            final String str2 = c668360QJm.LLILLJJLI;
                            if (str2 == null) {
                                str2 = "";
                            }
                            final String strLIZ = C668490QJz.LIZ(searchHistory, view);
                            final String str3 = searchHistory.enterMethod;
                            final String strLIZJ = searchHistory.LIZJ(Integer.valueOf(c668360QJm.L5()));
                            final Long lValueOf = Long.valueOf(searchHistory.timestamp);
                            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0QId
                                public final void LIZ() {
                                    C650460PfI<C0QIZ> c650460PfI = new C650460PfI<C0QIZ>() { // from class: X.0QIg
                                    };
                                    Integer num2 = numValueOf;
                                    if (num2 != null) {
                                        c650460PfI.LJ("words_position", num2.toString());
                                    }
                                    if (C123100dR.LIZ(str3)) {
                                        c650460PfI.LJ("history_source", str3);
                                    }
                                    Long l = lValueOf;
                                    if (l != null) {
                                        c650460PfI.LJ("last_time_search", String.valueOf(l.longValue()));
                                    }
                                    if (C123100dR.LIZ(str)) {
                                        c650460PfI.LJJIJ(str);
                                    }
                                    if (C123100dR.LIZ(strLIZ)) {
                                        c650460PfI.LJ("words_label", strLIZ);
                                    }
                                    if (C123100dR.LIZ(strLIZJ)) {
                                        c650460PfI.LJ("subtitle_type", strLIZJ);
                                    }
                                    c650460PfI.LJ("search_position", str2);
                                    c650460PfI.LJIILJJIL();
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("SearchHistoryStatistics@5509.mobSearchHistoryWordsShowLabel$1");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("SearchHistoryStatistics@5509.mobSearchHistoryWordsShowLabel$1");
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    public static final void onChanged$8(AObserverS175S0200000_10 aObserverS175S0200000_10, Object obj) {
        String string;
        C0PG7 c0pg7 = (C0PG7) obj;
        if (c0pg7 == C0PG7.SHOW) {
            C666000QAk c666000QAk = C666000QAk.LIZ;
            SearchJediMixFeedFragment searchJediMixFeedFragment = (SearchJediMixFeedFragment) aObserverS175S0200000_10.l0;
            SearchPersonalizedBannerVM searchPersonalizedBannerVM = searchJediMixFeedFragment.LLLL;
            C1389910mGz c1389910mGz = searchJediMixFeedFragment.B;
            String str = ((C0PRC) C0Q3E.LIZIZ(searchJediMixFeedFragment).Ph1().LIZJ()).LLILLL;
            c666000QAk.getClass();
            if (searchPersonalizedBannerVM != null && c1389910mGz != null && C666000QAk.LIZJ(false) && ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin() && searchPersonalizedBannerVM.LLILLJJLI) {
                if (searchPersonalizedBannerVM.LL) {
                    searchPersonalizedBannerVM.LL = false;
                    if (ComplianceServiceProvider.LJI().LJJII()) {
                        C844470XAv.LIZ.getClass();
                        string = C844470XAv.LIZ().getResources().getString(2131839222);
                    } else {
                        C844470XAv.LIZ.getClass();
                        string = C844470XAv.LIZ().getResources().getString(2131839223);
                    }
                    C666000QAk.LIZLLL(c1389910mGz, string, str);
                } else if (ComplianceServiceProvider.LJI().LJJII() && C666000QAk.LIZ()) {
                    if (C0BRE.LIZIZ() && C640810PBn.LIZIZ()) {
                        C640810PBn.LIZ.storeString(C640810PBn.LIZ(), new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date()));
                    }
                    C844470XAv.LIZ.getClass();
                    C666000QAk.LIZLLL(c1389910mGz, C844470XAv.LIZ().getResources().getString(2131839222), str);
                }
            }
        }
        C0PG7 c0pg72 = C0PG7.DIMISS;
        if (c0pg7 == c0pg72 && ((SearchPersonalizedBannerVM) aObserverS175S0200000_10.l1).LLILZIL != c0pg72) {
            C666000QAk c666000QAk2 = C666000QAk.LIZ;
            C1389910mGz c1389910mGz2 = ((SearchJediMixFeedFragment) aObserverS175S0200000_10.l0).B;
            c666000QAk2.getClass();
            if (c1389910mGz2 != null) {
                c1389910mGz2.LIZJ();
            }
        }
        ((SearchPersonalizedBannerVM) aObserverS175S0200000_10.l1).LLILZIL = c0pg7;
    }

    public static final void onChanged$9(AObserverS175S0200000_10 aObserverS175S0200000_10, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            if (num.intValue() != 1 && num.intValue() != 2) {
                if (num.intValue() == 0) {
                    Integer value = ((SearchStartViewModel) aObserverS175S0200000_10.l1).yQ2().getValue();
                    int iLJIJJLI = C644560PPy.LJIJJLI();
                    if (value != null && value.intValue() == iLJIJJLI) {
                        SearchTop1BackgroundAssem searchTop1BackgroundAssem = (SearchTop1BackgroundAssem) aObserverS175S0200000_10.l0;
                        searchTop1BackgroundAssem.LLJILJIL = true;
                        searchTop1BackgroundAssem.Np2(true);
                        return;
                    } else {
                        SearchTop1BackgroundAssem searchTop1BackgroundAssem2 = (SearchTop1BackgroundAssem) aObserverS175S0200000_10.l0;
                        searchTop1BackgroundAssem2.LLJILJIL = false;
                        searchTop1BackgroundAssem2.Np2(false);
                        return;
                    }
                }
                return;
            }
            SearchTop1BackgroundAssem searchTop1BackgroundAssem3 = (SearchTop1BackgroundAssem) aObserverS175S0200000_10.l0;
            searchTop1BackgroundAssem3.LLJILJIL = false;
            searchTop1BackgroundAssem3.Np2(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObserverS175S0200000_10(Object obj, View view, SearchVideoPhotoCommentAnchorAssem<T> searchVideoPhotoCommentAnchorAssem) {
        this.$t = searchVideoPhotoCommentAnchorAssem;
        this.l0 = obj;
        this.l1 = view;
    }
}
