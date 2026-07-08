package Y;

import X.AbstractC1744400vUk;
import X.C04G1;
import X.C0H9H;
import X.C0KXW;
import X.C1389880mGw;
import X.C13LP;
import X.C1746700vYS;
import X.C1763130vyx;
import X.C1764130w0Z;
import X.C1764510w1B;
import X.C1765540w2q;
import X.C1835920xsM;
import X.C189200o6;
import X.C1C7U;
import X.C418440Gaw;
import X.C654910PmT;
import X.C786410Ut5;
import X.C814420VxA;
import X.DialogC1761330vw3;
import X.EnumC1764120w0Y;
import X.InterfaceC20236714Gf;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.aweme.storage.m2.M2StorageCleanImpl;
import com.ss.android.ugc.aweme.ecommerce.base.address.widget.SearchHelper;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierFragment;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS37S0101000_26 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

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
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        PopupWindow popupWindow;
        PopupWindow popupWindow2 = ((SearchHelper) this.l0).LJII;
        if (popupWindow2 == null || !popupWindow2.isShowing()) {
            return;
        }
        Rect rect = new Rect();
        ((SearchHelper) this.l0).LIZIZ.getWindowVisibleDisplayFrame(rect);
        Rect rect2 = new Rect();
        ((SearchHelper) this.l0).LIZIZ.getGlobalVisibleRect(rect2);
        int iLIZ = (rect.bottom - rect2.bottom) - ((int) C654910PmT.LIZ(40.0f, ((SearchHelper) this.l0).LIZ));
        SearchHelper searchHelper = (SearchHelper) this.l0;
        RecyclerView recyclerView = searchHelper.LJI;
        if (recyclerView != null) {
            int i = this.i1;
            int iComputeVerticalScrollRange = recyclerView.computeVerticalScrollRange() + searchHelper.LJFF.findViewById(R.id.ue1).getHeight();
            if (iLIZ > iComputeVerticalScrollRange) {
                iLIZ = iComputeVerticalScrollRange;
            }
            PopupWindow popupWindow3 = searchHelper.LJII;
            if ((popupWindow3 == null || iLIZ != popupWindow3.getHeight()) && iLIZ > 0 && (popupWindow = searchHelper.LJII) != null) {
                popupWindow.update(i, iLIZ);
            }
        }
    }

    public final void LIZ$1() {
        PopupWindow popupWindow;
        PopupWindow popupWindow2;
        if (((C1746700vYS) this.l0).LJFF.getParent() == null || (popupWindow = ((C1746700vYS) this.l0).LJII) == null || !popupWindow.isShowing()) {
            return;
        }
        Rect rect = new Rect();
        ((C1746700vYS) this.l0).LIZIZ.getWindowVisibleDisplayFrame(rect);
        Rect rect2 = new Rect();
        ((C1746700vYS) this.l0).LIZIZ.getGlobalVisibleRect(rect2);
        int iLIZ = (rect.bottom - rect2.bottom) - ((int) C654910PmT.LIZ(40.0f, ((C1746700vYS) this.l0).LIZ));
        C1746700vYS c1746700vYS = (C1746700vYS) this.l0;
        RecyclerView recyclerView = c1746700vYS.LJI;
        if (recyclerView != null) {
            int i = this.i1;
            int iComputeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
            if (iLIZ > iComputeVerticalScrollRange) {
                iLIZ = iComputeVerticalScrollRange;
            }
            PopupWindow popupWindow3 = c1746700vYS.LJII;
            if ((popupWindow3 == null || iLIZ != popupWindow3.getHeight()) && iLIZ > 0 && (popupWindow2 = c1746700vYS.LJII) != null) {
                popupWindow2.update(i, iLIZ);
            }
        }
    }

    public final void LIZ$2() {
        C1765540w2q c1765540w2q = (C1765540w2q) this.l0;
        View view = c1765540w2q.LLJILJILJ;
        if (view != null) {
            int i = this.i1;
            c1765540w2q.LLJJIJIL = true;
            c1765540w2q.LLJJIJIIJIL = false;
            RectF rectF = c1765540w2q.LLJI[c1765540w2q.LLJ].LIZJ;
            if (rectF != null) {
                C0H9H.LJI((((int) rectF.bottom) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))) - i, view);
            }
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public final void LIZ$3() {
        List<C04G1> list;
        C1764510w1B c1764510w1B = ((C1764130w0Z) this.l0).LLILZ;
        if (c1764510w1B == null || (list = c1764510w1B.LIZIZ) == null || list.isEmpty()) {
            return;
        }
        C1764130w0Z c1764130w0Z = (C1764130w0Z) this.l0;
        int currentItem = c1764130w0Z.LLIZ ? c1764130w0Z.LL.getViewPager2().getCurrentItem() : this.i1;
        if (currentItem != ((C1764130w0Z) this.l0).LL.getViewPager2().getCurrentItem()) {
            C1764130w0Z c1764130w0Z2 = (C1764130w0Z) this.l0;
            c1764130w0Z2.LLJI = EnumC1764120w0Y.DEFAULT_SELECT;
            c1764130w0Z2.LL.getViewPager2().LJ(currentItem, false);
        }
    }

    public static final void run$0(ARunnableS37S0101000_26 aRunnableS37S0101000_26) {
        boolean zLIZ;
        C1C7U.LIZ("SearchHelper@1c1d.resizePopupWindow$1");
        try {
            aRunnableS37S0101000_26.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchHelper@1c1d.resizePopupWindow$1");
    }

    public static final void run$1(ARunnableS37S0101000_26 aRunnableS37S0101000_26) {
        boolean zLIZ;
        C1C7U.LIZ("OneSearchHelper@14de.resizePopupWindow$1");
        try {
            aRunnableS37S0101000_26.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OneSearchHelper@14de.resizePopupWindow$1");
    }

    public static final void run$10(ARunnableS37S0101000_26 aRunnableS37S0101000_26) {
        boolean zLIZ;
        C1C7U.LIZ("PhotoSearchDynamicIndicator@c4b8.showWithNoAnimation$1");
        try {
            aRunnableS37S0101000_26.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotoSearchDynamicIndicator@c4b8.showWithNoAnimation$1");
    }

    public static final void run$11(ARunnableS37S0101000_26 aRunnableS37S0101000_26) {
        boolean zLIZ;
        C1C7U.LIZ("SeaHeadContainerView@ac2f.bindPager$2");
        try {
            aRunnableS37S0101000_26.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeaHeadContainerView@ac2f.bindPager$2");
    }

    public static final void run$2(ARunnableS37S0101000_26 aRunnableS37S0101000_26) {
        boolean zLIZ;
        C1763130vyx c1763130vyx;
        RecyclerView recyclerView;
        C1C7U.LIZ("GalleryViewerFragment@7bb4.onScrollListener$1$onPageSelected$1");
        try {
            DialogC1761330vw3 dialogC1761330vw3 = ((GalleryViewerFragment) aRunnableS37S0101000_26.l0).LLJZ;
            RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = null;
            if (dialogC1761330vw3 != null && (recyclerView = dialogC1761330vw3.LL) != null) {
                viewHolderFindViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(aRunnableS37S0101000_26.i1);
            }
            if ((viewHolderFindViewHolderForLayoutPosition instanceof C1763130vyx) && (c1763130vyx = (C1763130vyx) viewHolderFindViewHolderForLayoutPosition) != null) {
                c1763130vyx.L5();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GalleryViewerFragment@7bb4.onScrollListener$1$onPageSelected$1");
    }

    public static final void run$3(ARunnableS37S0101000_26 aRunnableS37S0101000_26) {
        boolean zLIZ;
        C1C7U.LIZ("DistrictPage@aef9.onDestroyView$1");
        try {
            District district = (District) C13LP.LJJJLZIJ(aRunnableS37S0101000_26.i1, ((DistrictPage) aRunnableS37S0101000_26.l0).SR().LLILLJJLI);
            if (district != null) {
                InterfaceC20236714Gf<? super Unit> interfaceC20236714Gf = district.continuation;
                if (interfaceC20236714Gf != null) {
                    Unit unit = Unit.LIZ;
                    C189200o6.m2constructorimpl(unit);
                    interfaceC20236714Gf.resumeWith(unit);
                }
                district.continuation = null;
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DistrictPage@aef9.onDestroyView$1");
    }

    public static final void run$4(ARunnableS37S0101000_26 aRunnableS37S0101000_26) {
        boolean zLIZ;
        C1C7U.LIZ("M2StorageCleanImpl@70f0.enableCleanDraft$1");
        try {
            ((M2StorageCleanImpl) aRunnableS37S0101000_26.l0).LJ().storeInt("M2_DRAFT_CLEAN_COUNT", aRunnableS37S0101000_26.i1 + 1);
            ((M2StorageCleanImpl) aRunnableS37S0101000_26.l0).LJ().storeLong("M2_DRAFT_CLEAN_LAST_TIME", System.currentTimeMillis());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("M2StorageCleanImpl@70f0.enableCleanDraft$1");
    }

    public static final void run$5(ARunnableS37S0101000_26 aRunnableS37S0101000_26) {
        boolean zLIZ;
        C1C7U.LIZ("CashierViewModel@ddc8.showPriceInfoChangedToast$1");
        try {
            CashierFragment cashierFragment = ((CashierViewModel) aRunnableS37S0101000_26.l0).LLILLL;
            if (cashierFragment != null) {
                int i = aRunnableS37S0101000_26.i1;
                C1389880mGw c1389880mGw = new C1389880mGw(cashierFragment);
                c1389880mGw.LJIIIIZZ(i);
                c1389880mGw.LJIIJ();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CashierViewModel@ddc8.showPriceInfoChangedToast$1");
    }

    public static final void run$6(ARunnableS37S0101000_26 aRunnableS37S0101000_26) {
        boolean zLIZ;
        C1C7U.LIZ("HighlightSpriteView@5477.initView$1$1");
        try {
            C1835920xsM c1835920xsM = (C1835920xsM) aRunnableS37S0101000_26.l0;
            C0KXW c0kxw = c1835920xsM.LL;
            c0kxw.LLILLL = c1835920xsM.LLILLJJLI;
            c0kxw.notifyItemRangeChanged(0, aRunnableS37S0101000_26.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HighlightSpriteView@5477.initView$1$1");
    }

    public static final void run$7(ARunnableS37S0101000_26 aRunnableS37S0101000_26) {
        boolean zLIZ;
        C1C7U.LIZ("Adapter@e408.selected$1");
        try {
            AbstractC1744400vUk abstractC1744400vUk = (AbstractC1744400vUk) aRunnableS37S0101000_26.l0;
            if (abstractC1744400vUk.LLILLL) {
                RecyclerView recyclerView = abstractC1744400vUk.LLILZLL;
                if (recyclerView != null) {
                    recyclerView.scrollToPosition(aRunnableS37S0101000_26.i1);
                }
            } else {
                RecyclerView recyclerView2 = abstractC1744400vUk.LLILZLL;
                if (recyclerView2 != null) {
                    recyclerView2.smoothScrollToPosition(aRunnableS37S0101000_26.i1);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Adapter@e408.selected$1");
    }

    public static final void run$8(ARunnableS37S0101000_26 aRunnableS37S0101000_26) {
        boolean zLIZ;
        C1763130vyx c1763130vyx;
        C1C7U.LIZ("GalleryViewer@610b.onPageSelected$2");
        try {
            RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = ((DialogC1761330vw3) aRunnableS37S0101000_26.l0).LL.findViewHolderForLayoutPosition(aRunnableS37S0101000_26.i1);
            if ((viewHolderFindViewHolderForLayoutPosition instanceof C1763130vyx) && (c1763130vyx = (C1763130vyx) viewHolderFindViewHolderForLayoutPosition) != null) {
                c1763130vyx.L5();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GalleryViewer@610b.onPageSelected$2");
    }

    public static final void run$9(ARunnableS37S0101000_26 aRunnableS37S0101000_26) {
        boolean zLIZ;
        C1C7U.LIZ("PhotoSearchDynamicIndicator@c4b8.show$1");
        try {
            C1765540w2q c1765540w2q = (C1765540w2q) aRunnableS37S0101000_26.l0;
            View view = c1765540w2q.LLJILJILJ;
            if (view != null) {
                view.animate().alpha(1.0f).setDuration(300L).withStartAction(new ARunnableS31S0201000_26(aRunnableS37S0101000_26.i1, c1765540w2q, view, 9));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotoSearchDynamicIndicator@c4b8.show$1");
    }

    public ARunnableS37S0101000_26(CashierViewModel cashierViewModel, int i) {
        this.$t = i;
        this.l0 = cashierViewModel;
        this.i1 = 2131840171;
    }

    public ARunnableS37S0101000_26(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
