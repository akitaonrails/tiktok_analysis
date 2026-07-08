package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.common.viewmodel.TrendingMixInFlowViewModel;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.dislike.core.db.SearchDislikeDataBase;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS61S1000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PMS, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PMS extends AbstractC1216410hl9<C0PI3, C643590PMf> implements InterfaceC1603420rpM, InterfaceC643670PMn, InterfaceC666730QDf, InterfaceC643550PMb, InterfaceC666850QDr, C0PMX, C0PMZ {
    public final C0PI3 LL;
    public final ArrayList<C0PMY> LLILLJJLI = new ArrayList<>();
    public boolean LLILLL = true;
    public C0PMU LLILZ;

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 9;
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final boolean isDataEmpty() {
        return false;
    }

    @Override // X.InterfaceC643550PMb
    public final InterfaceC582690MtH LIZ() {
        return this.mModel;
    }

    @Override // X.InterfaceC666850QDr
    public final void LJII() {
        this.mModel.LJII();
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final void unInit() {
        super.unInit();
        this.mModel.clearNotifyListener(this.LLILZ);
        this.LLILZ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.05yG, X.0PMU] */
    public C0PMS(C0PI3 c0pi3) {
        this.LL = c0pi3;
        ?? r0 = new InterfaceC1526205yG() { // from class: X.0PMU
            @Override // X.InterfaceC1526205yG
            public final void onSuccess() {
                Iterator<C0PMY> it2 = this.LL.LLILLJJLI.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ();
                }
            }

            @Override // X.InterfaceC1526205yG
            public final void onFailed(Exception exc) {
                Iterator<C0PMY> it2 = this.LL.LLILLJJLI.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ();
                }
            }
        };
        this.LLILZ = r0;
        this.mModel = c0pi3;
        c0pi3.addNotifyListener(r0);
        this.mPresenter = new AbstractC666280QBm<C0PI3, SearchMixFeed>() { // from class: X.0PMf
            @Override // X.AbstractC666280QBm, X.C1255920ims, X.C1260870iur
            public final void LIZ() {
                C0PI3 c0pi32 = (C0PI3) this.LL;
                if (c0pi32 != null) {
                    c0pi32.LJJIJIIJIL();
                }
                super.LIZ();
            }

            @Override // X.AbstractC666280QBm
            public final List<Aweme> LJIJJ() {
                K k;
                List<Aweme> awemeList = ((C0PJH) ((C0PI3) this.LL)).getAwemeList();
                ((ArrayList) awemeList).size();
                if (!C274380ApA.LIZ() || (k = this.LLILLJJLI) == 0 || !(k instanceof LifecycleOwner)) {
                    return LJIL(awemeList);
                }
                new SharedViewModelProvider(new ViewModelProvider.NewInstanceFactory()).get(((LifecycleOwner) k).getLifecycle(), TrendingMixInFlowViewModel.class).getClass();
                return LJIL(awemeList);
            }

            @Override // X.AbstractC666280QBm
            public final List<SearchMixFeed> LJIJJLI() {
                AbstractC1255880imo abstractC1255880imo = (AbstractC1255880imo) this.LL;
                if (abstractC1255880imo != null) {
                    return abstractC1255880imo.getItems();
                }
                return null;
            }

            public static List LJIL(List list) {
                int iIndexOf;
                if (C0BRM.LIZIZ()) {
                    C644490PPr.LIZ.getClass();
                    if (!C644490PPr.LJIIIIZZ) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(list);
                        for (Aweme aweme : (ArrayList) list) {
                            if (AwemeBizExtKt.getSubAweme(aweme) != null && !AwemeBizExtKt.isSubAweme(aweme) && (iIndexOf = arrayList.indexOf(aweme)) >= 0 && iIndexOf < arrayList.size()) {
                                int i = iIndexOf + 1;
                                Aweme subAweme = AwemeBizExtKt.getSubAweme(aweme);
                                if (subAweme != null) {
                                    ListProtector.add(arrayList, i, subAweme);
                                } else {
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            }
                        }
                        return arrayList;
                    }
                }
                return list;
            }

            @Override // X.C1260870iur
            public final void LJIIJ(AbstractC666100QAu abstractC666100QAu) {
                AbstractC1255880imo abstractC1255880imo = (AbstractC1255880imo) abstractC666100QAu;
                super.LJIIJ(abstractC1255880imo);
                abstractC1255880imo.onModelBound();
            }

            @Override // X.AbstractC666280QBm
            public final String LJIJI(SearchMixFeed searchMixFeed) {
                Aweme aweme;
                SearchMixFeed searchMixFeed2 = searchMixFeed;
                if (searchMixFeed2 != null && (aweme = searchMixFeed2.getAweme()) != null) {
                    return C735370Ssx.LIZJ(aweme);
                }
                return "";
            }
        };
    }

    @Override // X.InterfaceC666730QDf
    public final void LIZIZ(Aweme aweme) {
        List<Aweme> awemeList = ((C0PJH) this.mModel).getAwemeList();
        this.mModel.LJJIIZI(aweme, AbstractC19875512pd.copyOf((Collection) awemeList), AbstractC19875512pd.copyOf((Collection) this.mModel.getItems()));
        this.mModel.LJJII(aweme, AbstractC19875512pd.copyOf((Collection) awemeList));
    }

    @Override // X.InterfaceC1603420rpM
    public final void bindPreLoadView(InterfaceC666290QBn interfaceC666290QBn) {
        ((AbstractC666280QBm) this.mPresenter).LLILZIL = interfaceC666290QBn;
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final void bindView(InterfaceC1209780haS interfaceC1209780haS) {
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        VerticalViewPager verticalViewPagerJ51;
        PagerAdapter pagerAdapterLJJLIIIJL;
        VerticalViewPager verticalViewPager;
        View view;
        IFeedFragmentAbility iFeedFragmentAbilityLIZ;
        super.bindView(interfaceC1209780haS);
        this.mModel.LLJLLIL = interfaceC1209780haS;
        Fragment fragment = interfaceC1209780haS.getFragment();
        C0SR4 c0sr4 = null;
        if (fragment != null && (view = fragment.getView()) != null && (iFeedFragmentAbilityLIZ = C443040HYw.LIZ(C1558360qeg.LJ(view, null))) != null) {
            iViewPagerComponentAbilityMb = iFeedFragmentAbilityLIZ.Mb();
        } else {
            iViewPagerComponentAbilityMb = null;
        }
        if (iViewPagerComponentAbilityMb != null) {
            verticalViewPagerJ51 = iViewPagerComponentAbilityMb.j51();
        } else {
            verticalViewPagerJ51 = null;
        }
        if (!(verticalViewPagerJ51 instanceof VerticalViewPager)) {
            verticalViewPagerJ51 = null;
        }
        if (iViewPagerComponentAbilityMb != null) {
            pagerAdapterLJJLIIIJL = iViewPagerComponentAbilityMb.LJJLIIIJL();
        } else {
            pagerAdapterLJJLIIIJL = null;
        }
        if (!(pagerAdapterLJJLIIIJL instanceof C0SR4)) {
            pagerAdapterLJJLIIIJL = null;
        }
        if (verticalViewPagerJ51 != null && pagerAdapterLJJLIIIJL != null) {
            WeakReference<VerticalViewPager> weakReference = C1509470pNp.LIZ;
            if (weakReference != null) {
                verticalViewPager = weakReference.get();
            } else {
                verticalViewPager = null;
            }
            if (!Intrinsics.LJFF(verticalViewPager, verticalViewPagerJ51)) {
                C1509470pNp.LIZ = new WeakReference<>(verticalViewPagerJ51);
            }
            WeakReference<C0SR4> weakReference2 = C1509470pNp.LIZIZ;
            if (weakReference2 != null) {
                c0sr4 = weakReference2.get();
            }
            if (!Intrinsics.LJFF(c0sr4, pagerAdapterLJJLIIIJL)) {
                C1509470pNp.LIZIZ = new WeakReference<>(pagerAdapterLJJLIIIJL);
            }
        }
        C443030HYv.LIZJ(interfaceC1209780haS);
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final boolean deleteItem(String str) {
        Aweme awemeLIZLLL;
        C0PHX c0phx;
        C0PHX c0phx2;
        Aweme awemeLIZLLL2;
        Activity topActivity;
        if (!this.LL.isLoading() && ((ArrayList) ((C0PJH) this.LL).getAwemeList()).size() <= 1 && (topActivity = ActivityStack.getTopActivity()) != null) {
            topActivity.finish();
        }
        C0PHW c0phwLIZJ = this.LL.LLJJJJ.LIZJ();
        String str2 = null;
        if (c0phwLIZJ == null || !Intrinsics.LJFF(c0phwLIZJ.LIZ, str)) {
            c0phwLIZJ = null;
        }
        if (C07BF.LIZ() && c0phwLIZJ != null && (awemeLIZLLL2 = c0phwLIZJ.LIZLLL()) != null && AwemeSaaSExtKt.isLive(awemeLIZLLL2)) {
            str2 = str;
        } else {
            SearchDislikeDataBase searchDislikeDataBaseLIZ = C0NMN.LIZ();
            if (c0phwLIZJ != null) {
                awemeLIZLLL = c0phwLIZJ.LIZLLL();
            } else {
                awemeLIZLLL = null;
            }
            searchDislikeDataBaseLIZ.getClass();
            SearchDislikeDataBase.LIZ(awemeLIZLLL, str);
        }
        boolean zDeleteItem = super.deleteItem(str);
        if (str2 != null) {
            this.LL.LLJLLL.add(str2);
        } else if (c0phwLIZJ != null) {
            C643580PMe c643580PMe = C643580PMe.LIZ;
            C0PHX c0phx3 = c0phwLIZJ.LIZJ;
            c0phx3.LJ();
            String str3 = c0phx3.LJIIIZ;
            C0P7A c0p7a = c0phwLIZJ.LIZIZ.LJIIIZ;
            String str4 = c0phwLIZJ.LIZ;
            C640970PCd c640970PCd = c0p7a.LIZ.get(C13LE.LIZ(C643580PMe.class));
            if (c640970PCd == null) {
                c640970PCd = new C640970PCd();
                c0p7a.LIZ.put(C13LE.LIZ(C643580PMe.class), c640970PCd);
            }
            if (c643580PMe == null) {
                HashMap<String, Object> map = c640970PCd.LIZIZ;
                if (map != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str4);
                    sbLIZ.append(str3);
                    map.remove(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                HashMap<String, Object> map2 = c640970PCd.LIZIZ;
                if (map2 != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str4);
                    sbLIZ2.append(str3);
                    map2.put(C2188811AlT.LIZIZ(sbLIZ2), c643580PMe);
                }
            }
            Aweme awemeLIZLLL3 = c0phwLIZJ.LIZLLL();
            if (awemeLIZLLL3 != null && awemeLIZLLL3.isAd()) {
                C0PHX c0phx4 = c0phwLIZJ.LIZJ;
                C643570PMd c643570PMd = C643570PMd.LIZ;
                C0P7A c0p7a2 = c0phx4.LIZ.LJIIIZ;
                c0phx4.LJ();
                String str5 = c0phx4.LJIIIZ;
                C640970PCd c640970PCd2 = c0p7a2.LIZ.get(C13LE.LIZ(C643570PMd.class));
                if (c640970PCd2 == null) {
                    c640970PCd2 = new C640970PCd();
                    c0p7a2.LIZ.put(C13LE.LIZ(C643570PMd.class), c640970PCd2);
                }
                HashMap<String, Object> map3 = c640970PCd2.LIZ;
                if (map3 != null) {
                    map3.put(str5, c643570PMd);
                }
            }
            C0PHT c0pht = c0phwLIZJ.LIZIZ;
            if (c0pht != null && c0pht.LJI() && (c0phx = c0phwLIZJ.LIZIZ.LIZ) != null && (c0phx2 = (C0PHX) C0PJL.LIZ(c0phx, new AwS61S1000000_10(str, 15))) != null) {
                C643580PMe c643580PMe2 = C643580PMe.LIZ;
                C0P7A c0p7a3 = c0phx2.LIZ.LJIIIZ;
                c0phx2.LJ();
                String str6 = c0phx2.LJIIIZ;
                C640970PCd c640970PCd3 = c0p7a3.LIZ.get(C13LE.LIZ(C643580PMe.class));
                if (c640970PCd3 == null) {
                    c640970PCd3 = new C640970PCd();
                    c0p7a3.LIZ.put(C13LE.LIZ(C643580PMe.class), c640970PCd3);
                }
                HashMap<String, Object> map4 = c640970PCd3.LIZ;
                if (map4 != null) {
                    map4.put(str6, c643580PMe2);
                    return zDeleteItem;
                }
            }
        }
        return zDeleteItem;
    }

    @Override // X.InterfaceC666730QDf
    public final void onPageScrollStateChanged(int i) {
        this.mModel.LJJIJ(i);
    }

    @Override // X.InterfaceC1603420rpM
    public final void setPreLoad(boolean z) {
        ((AbstractC666280QBm) this.mPresenter).LLILZLL = true;
    }

    @Override // X.C0PMX
    public final void LIZJ(C0PN1<Aweme> c0pn1, List<? extends Aweme> list) {
        T t;
        PRESENTER presenter = this.mPresenter;
        if (presenter != 0 && (t = presenter.LL) != 0) {
            int i = c0pn1.LIZIZ;
            List<Aweme> list2 = c0pn1.LIZ;
            if (list.isEmpty()) {
                list = new ArrayList<>();
            }
            if (C19719512Dh.LJI(list)) {
                if (i >= 0 && i <= list.size()) {
                    list.addAll(i, list2);
                    C0PN0 c0pn0 = new C0PN0(c0pn1, list);
                    List<InterfaceC1526205yG> list3 = t.mNotifyListeners;
                    if (list3 != null && list3.size() != 0) {
                        for (InterfaceC1526205yG interfaceC1526205yG : t.mNotifyListeners) {
                            if (interfaceC1526205yG instanceof C643590PMf) {
                                C1255920ims c1255920ims = (C1255920ims) interfaceC1526205yG;
                                if (!c1255920ims.B1(c0pn0)) {
                                    c1255920ims.w(c0pn0.LIZIZ, c0pn0.LJFF);
                                }
                            }
                        }
                    }
                    C644490PPr.LIZ.getClass();
                    C644490PPr.LJ = true;
                    C644490PPr.LJI = i;
                    return;
                }
                throw new C646010PVn(i, list.size());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0PMV] */
    @Override // X.C0PMZ
    public final C0PMV LJFF(final List list, boolean z) {
        final InterfaceC643540PMa interfaceC643540PMa;
        InterfaceC642940PJs interfaceC642940PJs = this.LL;
        if (!(interfaceC642940PJs instanceof InterfaceC643540PMa) || (interfaceC643540PMa = (InterfaceC643540PMa) interfaceC642940PJs) == null || !z || !this.LLILLL || list == null || list.isEmpty() || ((Number) C1821807Bo.LIZ.getValue()).intValue() != 1) {
            return null;
        }
        this.LLILLL = false;
        interfaceC643540PMa.LJIIIIZZ(false);
        return new InterfaceC1478130oZH() { // from class: X.0PMV
            @Override // X.InterfaceC1478130oZH
            public final void LIZ(int i, Aweme aweme) {
                String aid;
                if (i == 2) {
                    String aid2 = aweme.getAid();
                    Aweme aweme2 = (Aweme) C13LP.LJJJLL(list);
                    if (aweme2 != null) {
                        aid = aweme2.getAid();
                    } else {
                        aid = null;
                    }
                    if (Intrinsics.LJFF(aid2, aid)) {
                        interfaceC643540PMa.LJIIIIZZ(true);
                    }
                }
            }
        };
    }

    @Override // X.InterfaceC643670PMn
    public final boolean j9(int i, Aweme aweme) {
        return this.mModel.LJJI(i, aweme);
    }

    @Override // X.InterfaceC666850QDr
    public final void LJ(int i, int i2, Aweme aweme) {
        this.mModel.LJ(i, i2, aweme);
        C0PIL.LJIIZILJ++;
    }

    @Override // X.InterfaceC666730QDf
    public final void LJI(int i, float f, int i2, Aweme aweme) {
        this.mModel.LJJIIZ(i, f, i2, aweme);
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        Integer num;
        if (i == 4) {
            this.mModel.getClass();
            ISearchContextAbility iSearchContextAbilityLJI = C0Q3E.LJI();
            if (iSearchContextAbilityLJI != null && (c0pcyPh1 = iSearchContextAbilityLJI.Ph1()) != null && (c0prc = (C0PRC) c0pcyPh1.LIZJ()) != null && (num = c0prc.LLJLLL) != null) {
                int iIntValue = num.intValue();
                if (this.mModel.LLJJJJ.LJI()) {
                    C642860PJk.LIZ.getClass();
                    C642860PJk.LIZIZ(iIntValue).LJ();
                }
                if (this.mModel.LLJJJJ.LJFF()) {
                    C642860PJk.LIZ.getClass();
                    C642860PJk.LIZ(iIntValue).LJ();
                }
            }
        }
        Iterator<C0PMY> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
        super.request(i, c2189821An6, i2, z);
    }
}
