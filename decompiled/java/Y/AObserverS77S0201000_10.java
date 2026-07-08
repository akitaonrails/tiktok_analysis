package Y;

import X.C1766560w4U;
import X.C19EG;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.search.pages.visualsearch.landingpage.ability.IVisualSearchHalfScreenAbility;

/* JADX INFO: loaded from: classes11.dex */
public class AObserverS77S0201000_10 implements Observer {
    public final int $t;
    public int i2;
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
        }
    }

    public static final void onChanged$0(AObserverS77S0201000_10 aObserverS77S0201000_10, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        IVisualSearchHalfScreenAbility iVisualSearchHalfScreenAbility = (IVisualSearchHalfScreenAbility) aObserverS77S0201000_10.l0;
        if (iVisualSearchHalfScreenAbility != null && iVisualSearchHalfScreenAbility.isShowing()) {
            ((IVisualSearchHalfScreenAbility) aObserverS77S0201000_10.l0).wM(iIntValue, aObserverS77S0201000_10.i2, true ^ ((SearchResultFragmentNew) aObserverS77S0201000_10.l1).LLLLZLLLI);
            return;
        }
        if (iIntValue != 3) {
            return;
        }
        SAFHelper.LIZ.getClass();
        if (SAFHelper.LJIIL()) {
            Fragment fragmentNT = ((SearchResultFragmentNew) aObserverS77S0201000_10.l1).NT();
            if (fragmentNT == null) {
                return;
            }
            int i = aObserverS77S0201000_10.i2;
            SearchResultFragmentNew searchResultFragmentNew = (SearchResultFragmentNew) aObserverS77S0201000_10.l1;
            TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(fragmentNT);
            tuxImmersionBarLIZLLL.LJIIIZ(i);
            tuxImmersionBarLIZLLL.LIZIZ.LJIIJ(!searchResultFragmentNew.LLLLZLLLI);
            tuxImmersionBarLIZLLL.LIZLLL();
            return;
        }
        C19EG activity = ((SearchResultFragmentNew) aObserverS77S0201000_10.l1).getActivity();
        if (activity == null) {
            return;
        }
        int i2 = aObserverS77S0201000_10.i2;
        SearchResultFragmentNew searchResultFragmentNew2 = (SearchResultFragmentNew) aObserverS77S0201000_10.l1;
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(activity);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(activity, immersionBarLJIILJJIL);
        tuxImmersionBar.LJIIIZ(i2);
        immersionBarLJIILJJIL.LJIIJ(!searchResultFragmentNew2.LLLLZLLLI);
        tuxImmersionBar.LIZLLL();
    }

    public static final void onChanged$1(AObserverS77S0201000_10 aObserverS77S0201000_10, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        IVisualSearchHalfScreenAbility iVisualSearchHalfScreenAbility = (IVisualSearchHalfScreenAbility) aObserverS77S0201000_10.l0;
        if (iVisualSearchHalfScreenAbility != null && iVisualSearchHalfScreenAbility.isShowing()) {
            ((IVisualSearchHalfScreenAbility) aObserverS77S0201000_10.l0).wM(iIntValue, aObserverS77S0201000_10.i2, true ^ ((SearchResultFragmentNew) aObserverS77S0201000_10.l1).LLLLZLLLI);
            return;
        }
        if (iIntValue != 3) {
            return;
        }
        SAFHelper.LIZ.getClass();
        if (SAFHelper.LJIIL()) {
            Fragment fragmentNT = ((SearchResultFragmentNew) aObserverS77S0201000_10.l1).NT();
            if (fragmentNT == null) {
                return;
            }
            int i = aObserverS77S0201000_10.i2;
            SearchResultFragmentNew searchResultFragmentNew = (SearchResultFragmentNew) aObserverS77S0201000_10.l1;
            TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(fragmentNT);
            tuxImmersionBarLIZLLL.LJIIIZ(i);
            tuxImmersionBarLIZLLL.LIZIZ.LJIIJ(!searchResultFragmentNew.LLLLZLLLI);
            tuxImmersionBarLIZLLL.LIZLLL();
            return;
        }
        C19EG activity = ((SearchResultFragmentNew) aObserverS77S0201000_10.l1).getActivity();
        if (activity == null) {
            return;
        }
        int i2 = aObserverS77S0201000_10.i2;
        SearchResultFragmentNew searchResultFragmentNew2 = (SearchResultFragmentNew) aObserverS77S0201000_10.l1;
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(activity);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(activity, immersionBarLJIILJJIL);
        tuxImmersionBar.LJIIIZ(i2);
        immersionBarLJIILJJIL.LJIIJ(!searchResultFragmentNew2.LLLLZLLLI);
        tuxImmersionBar.LIZLLL();
    }

    public AObserverS77S0201000_10(IVisualSearchHalfScreenAbility iVisualSearchHalfScreenAbility, int i, SearchResultFragmentNew searchResultFragmentNew, int i2) {
        this.$t = i2;
        this.l0 = iVisualSearchHalfScreenAbility;
        this.i2 = i;
        this.l1 = searchResultFragmentNew;
    }
}
