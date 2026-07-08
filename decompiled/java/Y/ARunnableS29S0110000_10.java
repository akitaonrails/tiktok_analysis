package Y;

import X.C0BYG;
import X.C0P8W;
import X.C0PO5;
import X.C0POC;
import X.C0PQZ;
import X.C0QUT;
import X.C13BV;
import X.C19719612Di;
import X.C19EG;
import X.C1AF0;
import X.C1C7U;
import X.C418040GaI;
import X.C426750GoL;
import X.C644060POa;
import X.C645870PUz;
import X.C650240Pew;
import X.C652600Pik;
import X.C786410Ut5;
import X.EnumC644580PQa;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ECSearchBarAssem;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.pages.result.videosearch.core.ui.SearchFeedFragment;
import com.ss.android.ugc.aweme.search.performance.core.model.PreloadImg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ARunnableS29S0110000_10 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        try {
            if (this.z1 && ((ECSearchBarAssem) this.l0).yp().LLILZLL == C0QUT.SUGGEST) {
                KeyboardUtils.LIZLLL(((ECSearchBarAssem) this.l0).Bp());
                ((ECSearchBarAssem) this.l0).Bp().setCursorVisible(true);
            } else {
                if (this.z1) {
                    return;
                }
                KeyboardUtils.LIZLLL(((ECSearchBarAssem) this.l0).Bp());
                ((ECSearchBarAssem) this.l0).Bp().setCursorVisible(true);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }

    public final void LIZ$1() {
        SearchFragment searchFragment = (SearchFragment) this.l0;
        searchFragment.AT();
        searchFragment.LLLLIILLL = true;
        searchFragment.DT();
        if (C0BYG.LIZ() && (((SearchFragment) this.l0) instanceof SearchJediMixFeedFragment)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C644060POa c644060POa = C644060POa.LIZ;
            SearchResultParam searchResultParam = ((SearchFragment) this.l0).LLJIJIL;
            c644060POa.getClass();
            if (C644060POa.LJII(searchResultParam).LJJIJIL < 0) {
                C644060POa.LJII(((SearchFragment) this.l0).LLJIJIL).LJIIIZ(jCurrentTimeMillis);
            }
            if (((SearchFragment) this.l0).qS() || this.z1) {
                C0PO5 c0po5LJII = C644060POa.LJII(((SearchFragment) this.l0).LLJIJIL);
                if (c0po5LJII.LJJIJLIJ == null) {
                    c0po5LJII.LJJIJLIJ = Boolean.FALSE;
                }
                SearchFragment searchFragment2 = (SearchFragment) this.l0;
                searchFragment2.rT(jCurrentTimeMillis, searchFragment2.LLJIJIL);
            } else {
                C0PO5 c0po5LJII2 = C644060POa.LJII(((SearchFragment) this.l0).LLJIJIL);
                if (c0po5LJII2.LJJIJLIJ == null) {
                    c0po5LJII2.LJJIJLIJ = Boolean.TRUE;
                }
                SearchFragment searchFragment3 = (SearchFragment) this.l0;
                if (!searchFragment3.LLLLJI) {
                    searchFragment3.LLLLJI = true;
                    C786410Ut5.x3(searchFragment3.BS().getViewTreeObserver(), ((SearchFragment) this.l0).LLLLL);
                }
            }
        } else {
            ((SearchFragment) this.l0).rT(System.currentTimeMillis(), ((SearchFragment) this.l0).LLJIJIL);
        }
        ((SearchFragment) this.l0).US();
    }

    public final void LIZ$2() {
        List<String> urlList;
        if (((SearchMixFeedList) this.l0).mItems == null || !(!r0.isEmpty())) {
            return;
        }
        ArrayList arrayList = new ArrayList(((SearchMixFeedList) this.l0).mItems);
        if (this.z1) {
            C0PQZ c0pqz = C0PQZ.LIZ;
            PreloadImg preloadImg = ((SearchMixFeedList) this.l0).preloadImg;
            C0PQZ.LJII(c0pqz, preloadImg != null ? preloadImg.getUrlList() : null, EnumC644580PQa.P0_VISIBLE_MAIN_CONTENT, "first_screen_patch", null, 8);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            PreloadImg preloadImg2 = ((SearchMixFeed) it2.next()).getPreloadImg();
            if (preloadImg2 == null || (urlList = preloadImg2.getUrlList()) == null) {
                urlList = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(urlList, arrayList2);
        }
        C0PQZ c0pqz2 = C0PQZ.LIZ;
        C0PQZ.LJII(c0pqz2, arrayList2, null, "first_screen", new C0POC(c0pqz2), 2);
    }

    public final void LIZ$3() {
        SAFHelper sAFHelper = SAFHelper.LIZ;
        C0P8W c0p8w = (C0P8W) this.l0;
        Fragment fragment = c0p8w.LIZ;
        C19EG c19eg = c0p8w.LIZIZ;
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJIJJ = SAFHelper.LJIJJ(fragment, c19eg);
        if (lifecycleOwnerLJIJJ != null) {
            boolean z = this.z1;
            C0P8W c0p8w2 = (C0P8W) this.l0;
            if (z) {
                ((SearchStartViewModel) c0p8w2.LJ.getValue()).xQ2().removeObserver(c0p8w2.LJFF);
            }
            ((SearchStartViewModel) c0p8w2.LJ.getValue()).xQ2().observe(lifecycleOwnerLJIJJ, c0p8w2.LJFF);
        }
    }

    public final void LIZ$4() {
        if (((C645870PUz) this.l0).LL.getParent() != null) {
            if (((C645870PUz) this.l0).getBanAdjustBottomMargin() || C650240Pew.LIZ()) {
                C426750GoL.LJIIIZ(((C645870PUz) this.l0).LL, 0, Integer.valueOf((int) C418040GaI.LIZ(8)), 0, Integer.valueOf((int) C418040GaI.LIZ(8)), false, 16);
                ((C645870PUz) this.l0).LLILZ = (int) C418040GaI.LIZ(8);
                return;
            }
            int iLIZ = this.z1 ? 0 : (int) C418040GaI.LIZ(8);
            if (((C645870PUz) this.l0).getLastBottomMargin() != iLIZ) {
                C426750GoL.LJIIIZ(((C645870PUz) this.l0).LL, 0, Integer.valueOf((int) C418040GaI.LIZ(8)), 0, Integer.valueOf(iLIZ), false, 16);
                ((C645870PUz) this.l0).LLILZ = iLIZ;
            }
        }
    }

    public static final void run$0(ARunnableS29S0110000_10 aRunnableS29S0110000_10) {
        boolean zLIZ;
        C1C7U.LIZ("ECSearchBarAssem@531.openKeyboard$1");
        try {
            aRunnableS29S0110000_10.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ECSearchBarAssem@531.openKeyboard$1");
    }

    public static final void run$1(ARunnableS29S0110000_10 aRunnableS29S0110000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchFragment@f345.recordViewDrawEnd$1");
        try {
            aRunnableS29S0110000_10.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchFragment@f345.recordViewDrawEnd$1");
    }

    public static final void run$2(ARunnableS29S0110000_10 aRunnableS29S0110000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchFeedFragment@9f20.refreshResult$1");
        try {
            if (((SearchFeedFragment) aRunnableS29S0110000_10.l0).getView() != null) {
                super/*com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment*/.Wy(aRunnableS29S0110000_10.z1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchFeedFragment@9f20.refreshResult$1");
    }

    public static final void run$3(ARunnableS29S0110000_10 aRunnableS29S0110000_10) {
        boolean zLIZ;
        C1C7U.LIZ("ImagePrefetchHelper@afdf.doPrefetchForFirstScreen$runnable$1");
        try {
            aRunnableS29S0110000_10.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImagePrefetchHelper@afdf.doPrefetchForFirstScreen$runnable$1");
    }

    public static final void run$4(ARunnableS29S0110000_10 aRunnableS29S0110000_10) {
        boolean zLIZ;
        C1C7U.LIZ("MixFeedActivityBgStrategy@c90.addIntermediateStateObserver$1");
        try {
            aRunnableS29S0110000_10.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MixFeedActivityBgStrategy@c90.addIntermediateStateObserver$1");
    }

    public static final void run$5(ARunnableS29S0110000_10 aRunnableS29S0110000_10) {
        boolean zLIZ;
        C1C7U.LIZ("GeneralHorizontalGroupCardAgent@49e4.config$1");
        try {
            C652600Pik c652600Pik = (C652600Pik) aRunnableS29S0110000_10.l0;
            c652600Pik.LIZ = true;
            if (aRunnableS29S0110000_10.z1 || c652600Pik.LJI) {
                c652600Pik.LJIIIIZZ();
                ((C652600Pik) aRunnableS29S0110000_10.l0).LJI = false;
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GeneralHorizontalGroupCardAgent@49e4.config$1");
    }

    public static final void run$6(ARunnableS29S0110000_10 aRunnableS29S0110000_10) {
        boolean zLIZ;
        C1C7U.LIZ("ResearchFilterBarLayout@e9ce.tryRefreshBottomMargin$1");
        try {
            aRunnableS29S0110000_10.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ResearchFilterBarLayout@e9ce.tryRefreshBottomMargin$1");
    }

    public ARunnableS29S0110000_10(SearchFeedFragment searchFeedFragment, int i) {
        this.$t = i;
        this.l0 = searchFeedFragment;
        this.z1 = true;
    }

    public ARunnableS29S0110000_10(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
