package X;

import Y.ALAdapterS7S0100000_10;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.choosemusic.sug.model.MusicSearchSugResponse;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.viewmodel.MusicTrendingViewModel;
import com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.viewmodel.MusicSugViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.repo.SurveyDetailResponse;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.viewmodel.SurveyViewController;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.search.performance.core.config.SearchInitTaskPreConnectForImageExp;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS254S0300000_10;

/* JADX INFO: renamed from: X.0R4M, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R4M implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            case 3:
                return then$3(this, c15o7);
            case 4:
                return then$4(this, c15o7);
            case 5:
                return then$5(this, c15o7);
            default:
                return null;
        }
    }

    public C0R4M(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object then$0(C0R4M c0r4m, C15O7 c15o7) {
        C1C7U.LIZ("MusicTrendingViewModel@13bc.getSearchMusicTrendingList$2");
        if (c15o7.LJIILJJIL()) {
            ((MusicTrendingViewModel) c0r4m.l0).LL.setValue(new C0QRC<>(c15o7.LJIIL()));
        } else if (c15o7.LJIILL()) {
            NextLiveData<C0QRC<SuggestWordResponse>> nextLiveData = ((MusicTrendingViewModel) c0r4m.l0).LL;
            c15o7.LJIIJJI();
            nextLiveData.setValue(new C0QRC<>());
        } else {
            NextLiveData<C0QRC<SuggestWordResponse>> nextLiveData2 = ((MusicTrendingViewModel) c0r4m.l0).LL;
            c15o7.LJIIJJI();
            nextLiveData2.setValue(new C0QRC<>());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicTrendingViewModel@13bc.getSearchMusicTrendingList$2");
        return unit;
    }

    public static final Object then$1(C0R4M c0r4m, C15O7 c15o7) {
        C0PN8 c0pn8 = (C0PN8) c0r4m.l0;
        c0pn8.getClass();
        C1C7U.LIZ("SearchTopMixModel@4b99.searchMixFeedList$1L");
        if (c0pn8.mListQueryType == 4) {
            C642860PJk c642860PJk = C642860PJk.LIZ;
            ISearchContextAbility iSearchContextAbility = c0pn8.LLJZIJLIL;
            C0PHT c0phtLJJIIZ = c0pn8.LJJIIZ();
            c642860PJk.getClass();
            C1524805y2.LIZIZ(0L, new AwS254S0300000_10(iSearchContextAbility, (ISearchContextAbility) c0phtLJJIIZ, (C0PHT) c15o7, (C15O7<?>) 14));
        }
        C1C7U.LIZIZ("SearchTopMixModel@4b99.searchMixFeedList$1L");
        return c15o7;
    }

    public static final Object then$2(C0R4M c0r4m, C15O7 c15o7) {
        String str;
        String str2;
        List<String> list;
        View view;
        C1C7U.LIZ("SurveyViewController@7fbd.fetchData$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Survey data, title: ");
        SurveyDetailResponse.Data data = ((SurveyDetailResponse) c15o7.LJIIL()).data;
        View view2 = null;
        if (data != null) {
            str = data.title;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        SurveyDetailResponse.Data data2 = ((SurveyDetailResponse) c15o7.LJIIL()).data;
        if (data2 != null && (str2 = data2.title) != null && C703302op.LIZ(str2) && (list = data2.starsTitleList) != null) {
            Iterator<String> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().length() == 0) {
                        break;
                    }
                } else {
                    SurveyViewController surveyViewController = (SurveyViewController) c0r4m.l0;
                    surveyViewController.LLJILJILJ = data2;
                    TextView textView = surveyViewController.LLILZLL;
                    if (textView == null) {
                        textView = null;
                    }
                    textView.setText(data2.title);
                    View view3 = surveyViewController.LLILZ;
                    if (view3 == null) {
                        view3 = null;
                    }
                    C786410Ut5.T4(view3, 0.0f);
                    View view4 = surveyViewController.LLILZ;
                    if (view4 == null) {
                        view4 = null;
                    }
                    C786410Ut5.LJLLLLLL(0, view4);
                    View view5 = surveyViewController.LLILZ;
                    if (view5 == null) {
                        view5 = null;
                    }
                    float height = view5.getHeight();
                    View view6 = surveyViewController.LLILZ;
                    if (view6 == null) {
                        view6 = null;
                    }
                    C786410Ut5.ed(view5, height + ((ViewGroup.MarginLayoutParams) view6.getLayoutParams()).bottomMargin);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(300L);
                    animatorSet.setInterpolator(C0GY9.LIZIZ(0.25f, 1.0f, 0.25f, 1.0f));
                    Animator[] animatorArr = new Animator[2];
                    View view7 = surveyViewController.LLILZ;
                    if (view7 == null) {
                        view = null;
                    } else {
                        view = view7;
                    }
                    Property property = View.TRANSLATION_Y;
                    float[] fArr = new float[2];
                    if (view7 == null) {
                        view7 = null;
                    }
                    fArr[0] = view7.getTranslationY();
                    fArr[1] = 0.0f;
                    animatorArr[0] = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
                    View view8 = surveyViewController.LLILZ;
                    if (view8 != null) {
                        view2 = view8;
                    }
                    animatorArr[1] = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                    animatorSet.playTogether(animatorArr);
                    animatorSet.addListener(new ALAdapterS7S0100000_10(surveyViewController, 3));
                    animatorSet.start();
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SurveyViewController@7fbd.fetchData$1");
        return unit;
    }

    public static final Object then$3(C0R4M c0r4m, C15O7 c15o7) {
        C1C7U.LIZ("MusicSugViewModel@b56c.getSearchSugList$1");
        if (c15o7.LJIILJJIL()) {
            ((MusicSugViewModel) c0r4m.l0).LL.setValue(new C0QRC<>(c15o7.LJIIL()));
        } else if (c15o7.LJIILL()) {
            NextLiveData<C0QRC<MusicSearchSugResponse>> nextLiveData = ((MusicSugViewModel) c0r4m.l0).LL;
            c15o7.LJIIJJI();
            nextLiveData.setValue(new C0QRC<>());
        } else {
            NextLiveData<C0QRC<MusicSearchSugResponse>> nextLiveData2 = ((MusicSugViewModel) c0r4m.l0).LL;
            c15o7.LJIIJJI();
            nextLiveData2.setValue(new C0QRC<>());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicSugViewModel@b56c.getSearchSugList$1");
        return unit;
    }

    public static final Object then$4(C0R4M c0r4m, C15O7 c15o7) {
        C1C7U.LIZ("PreloadChunkDataStream@eff4.preload$1$1");
        C1515820pY4 c1515820pY4 = (C1515820pY4) c15o7.LJIIL();
        if (c1515820pY4 != null && !c15o7.LJIILL() && !c15o7.LJIILIIL()) {
            try {
                final C643850PNf c643850PNf = (C643850PNf) c0r4m.l0;
                c1515820pY4.LIZLLL(new C0POE<SearchMixFeedList>() { // from class: X.0POP
                    public int LIZ;

                    @Override // X.C0POE
                    public final void onComplete() {
                        c643850PNf.LLIZ.offer(new C0PO0(0, null, null));
                        if (C1109204Vm.LIZ()) {
                            return;
                        }
                        C0PQZ.LIZ.getClass();
                        C0PQZ.LJFF = true;
                        C0PQZ.LJI = false;
                        C0PQZ.LIZIZ();
                        C0PQZ.LJIIJ = 0L;
                        C0PQZ.LJIIJJI = 0L;
                    }

                    @Override // X.C0POE
                    public final void onFailed(Throwable th) {
                        c643850PNf.LLIZ.offer(new C0PO0(-1, null, th));
                        if (!C1109204Vm.LIZ()) {
                            C0PQZ.LIZ.getClass();
                            C0PQZ.LJFF = true;
                            C0PQZ.LJI = false;
                            C0PQZ.LIZIZ();
                            C0PQZ.LJIIJ = 0L;
                            C0PQZ.LJIIJJI = 0L;
                        }
                    }

                    @Override // X.C0POE
                    public final void onNext(SearchMixFeedList searchMixFeedList) {
                        C0PQA c0pqa;
                        int prefetchDegradeLevel;
                        int prefetchDegradeLevel2;
                        SearchMixFeedList searchMixFeedList2 = searchMixFeedList;
                        if (C0BIP.LIZ()) {
                            int i = this.LIZ;
                            this.LIZ = i + 1;
                            searchMixFeedList2.LLJ = i;
                        } else {
                            c643850PNf.getClass();
                            if (searchMixFeedList2.LLJ == 0 && (c0pqa = searchMixFeedList2.LLILLL) != null) {
                                searchMixFeedList2.LLJ = c0pqa.LIZ(c0pqa.LIZIZ().size() - 1).LJIIIIZZ;
                            }
                        }
                        C0POX.LIZ.getClass();
                        GlobalDoodleConfig globalDoodleConfig = searchMixFeedList2.globalDoodleConfig;
                        if (globalDoodleConfig != null) {
                            prefetchDegradeLevel = globalDoodleConfig.getPrefetchDegradeLevel();
                        } else {
                            prefetchDegradeLevel = 1;
                        }
                        C0POX.LJIIIIZZ = prefetchDegradeLevel;
                        GlobalDoodleConfig globalDoodleConfig2 = searchMixFeedList2.globalDoodleConfig;
                        if (globalDoodleConfig2 != null) {
                            prefetchDegradeLevel2 = globalDoodleConfig2.getPrefetchDegradeLevel();
                        } else {
                            prefetchDegradeLevel2 = 1;
                        }
                        C0POX.LJIIJ = prefetchDegradeLevel2;
                        c643850PNf.getClass();
                        C643850PNf.LJFF(searchMixFeedList2);
                        c643850PNf.LJ(searchMixFeedList2);
                        if (2 == SearchInitTaskPreConnectForImageExp.LIZ()) {
                            C0Q51.LIZ.getClass();
                            C0Q51.LIZIZ();
                        }
                        if (C1109204Vm.LIZ()) {
                            C0PQZ.LIZ.getClass();
                            C0PQZ.LJ(searchMixFeedList2);
                        }
                        c643850PNf.LLIZ.offer(new C0PO0(1, searchMixFeedList2, null));
                        if (!C1109204Vm.LIZ()) {
                            C0PQZ.LIZ.getClass();
                            C0PQZ.LJFF(searchMixFeedList2);
                        }
                        if (C1011530cQh.LIZ().enableSearchPreload) {
                            C0POS.LIZ.getClass();
                            C0POS.LIZ(searchMixFeedList2);
                        }
                        C0POS.LIZ.getClass();
                        C0POS.LIZIZ(searchMixFeedList2);
                    }
                });
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        C1C7U.LIZIZ("PreloadChunkDataStream@eff4.preload$1$1");
        return c15o7;
    }

    public static final Object then$5(C0R4M c0r4m, C15O7 c15o7) {
        C03W6 c03w6;
        String message;
        C1C7U.LIZ("EcSearchShopResultPreloadChecker@53d0.preloadShopResultByTask$1");
        if (c15o7.LJIILL()) {
            C03W6 c03w62 = (C03W6) c0r4m.l0;
            if (c03w62 != null) {
                Exception excLJIIJJI = c15o7.LJIIJJI();
                if (excLJIIJJI == null || (message = excLJIIJJI.getMessage()) == null) {
                    message = "";
                }
                c03w62.LIZ(message);
            }
            Exception excLJIIJJI2 = c15o7.LJIIJJI();
            if (excLJIIJJI2 != null) {
                excLJIIJJI2.getMessage();
            }
        } else if (c15o7.LJIILIIL()) {
            C03W6 c03w63 = (C03W6) c0r4m.l0;
            if (c03w63 != null) {
                c03w63.LIZ("has been cancel");
            }
        } else if (c15o7.LJIILJJIL() && (c03w6 = (C03W6) c0r4m.l0) != null) {
            c03w6.onSuccess();
        }
        C1C7U.LIZIZ("EcSearchShopResultPreloadChecker@53d0.preloadShopResultByTask$1");
        return c15o7;
    }
}
