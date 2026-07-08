package Y;

import X.AbstractC21673719rz;
import X.AbstractC643470PLt;
import X.AbstractC669180QMq;
import X.C0P8S;
import X.C0PFI;
import X.C0PN2;
import X.C0PNY;
import X.C0QJV;
import X.C0QU0;
import X.C1424850nBL;
import X.C1849520yEI;
import X.C1C7U;
import X.C418440Gaw;
import X.C643810PNb;
import X.C645130PSd;
import X.C814420VxA;
import X.InterfaceC21676919sV;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.SearchImageLandingFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.dislike.core.ability.SearchDislikeAbilityImpl;
import com.ss.android.ugc.aweme.search.pages.sevensplitscreen.SearchSevenSplitScreenFragment;
import com.ss.android.ugc.aweme.search.pages.sevensplitscreen.ability.ISearchSplitSheetBehaviorAbility;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes11.dex */
public class ARunnableS21S0101000_10 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

    public final void LIZ$0() {
        C0PFI c0pfi;
        for (int i = 0; i < this.i1; i++) {
            try {
                c0pfi = (C0PFI) this.l0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (c0pfi.LIZLLL && c0pfi.LIZIZ >= c0pfi.LIZJ) {
                return;
            }
            int size = ((ConcurrentLinkedQueue) c0pfi.LIZ).size();
            C0PFI c0pfi2 = (C0PFI) this.l0;
            if (size >= c0pfi2.LIZJ) {
                return;
            }
            RecyclerView.ViewHolder viewHolderLIZ = c0pfi2.LIZ();
            if (viewHolderLIZ != null) {
                ((ConcurrentLinkedQueue) ((C0PFI) this.l0).LIZ).offer(viewHolderLIZ);
                ((C0PFI) this.l0).LIZIZ++;
            }
        }
    }

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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$1() {
        C1849520yEI c1849520yEI = ((SearchVideoPhotoCommentAnchorAssem) this.l0).LLJJJJJIL;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        ViewGroup.LayoutParams layoutParams = c1849520yEI != null ? c1849520yEI.getLayoutParams() : null;
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart(this.i1 == 1 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        }
        C1849520yEI c1849520yEI2 = ((SearchVideoPhotoCommentAnchorAssem) this.l0).LLJJJJJIL;
        if (c1849520yEI2 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1849520yEI2);
            c1849520yEI2.setLayoutParams(marginLayoutParams);
        }
        C1849520yEI c1849520yEI3 = ((SearchVideoPhotoCommentAnchorAssem) this.l0).LLJJJJJIL;
        if (c1849520yEI3 != null) {
            c1849520yEI3.requestLayout();
        }
    }

    public final void LIZ$2() {
        SearchJediMixFeedFragment searchJediMixFeedFragment = (SearchJediMixFeedFragment) this.l0;
        C643810PNb<SearchJediMixFeedFragment> c643810PNb = searchJediMixFeedFragment.LLLLZI;
        T t = c643810PNb.LL;
        if (t != 0) {
            ((C0PN2) t).LLJILJIL = 0;
        }
        String str = searchJediMixFeedFragment.LLJJIJI;
        if (t != 0) {
            ((C0PN2) t).LLJILLL = str;
        }
        SearchJediMixFeedFragment searchJediMixFeedFragment2 = (SearchJediMixFeedFragment) this.l0;
        c643810PNb.LIZJ(1, ((SearchJediMixFeedFragment) this.l0).dS(), Integer.valueOf(this.i1), 0, 0, Integer.valueOf(((SearchJediMixFeedFragment) this.l0).LLJJJJJIL), searchJediMixFeedFragment2.LLILZ, searchJediMixFeedFragment2.PS(), Integer.valueOf(((SearchJediMixFeedFragment) this.l0).q));
        ((SearchJediMixFeedFragment) this.l0).GS().setIsRefreshingData(true);
        ((C645130PSd) ((SearchJediMixFeedFragment) this.l0).NS()).LLJJIJI.LIZLLL.LIZJ(4);
        ((SearchJediMixFeedFragment) this.l0).LJ();
    }

    public static final void run$0(ARunnableS21S0101000_10 aRunnableS21S0101000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchSugViewHolderAsyncPool@dc75.prepare$runnable$1");
        try {
            int i = aRunnableS21S0101000_10.i1 - ((AbstractC669180QMq) aRunnableS21S0101000_10.l0).LIZIZ;
            for (int i2 = 0; i2 < i; i2++) {
                AbstractC669180QMq abstractC669180QMq = (AbstractC669180QMq) aRunnableS21S0101000_10.l0;
                ((LinkedList) abstractC669180QMq.LIZ).offer(abstractC669180QMq.LIZ());
                ((AbstractC669180QMq) aRunnableS21S0101000_10.l0).LIZIZ++;
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchSugViewHolderAsyncPool@dc75.prepare$runnable$1");
    }

    public static final void run$1(ARunnableS21S0101000_10 aRunnableS21S0101000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchMixFeedViewHolderAsyncPool@e43f.prepare$1");
        try {
            aRunnableS21S0101000_10.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchMixFeedViewHolderAsyncPool@e43f.prepare$1");
    }

    public static final void run$10(ARunnableS21S0101000_10 aRunnableS21S0101000_10) {
        boolean zLIZ;
        C1C7U.LIZ("TemplateListView@b16d.setTemplateList$2$1");
        try {
            StaggeredGridLayoutManager staggeredGridLayoutManager = ((C1424850nBL) aRunnableS21S0101000_10.l0).LLJJL;
            int i = aRunnableS21S0101000_10.i1;
            if (i < 0) {
                i = 0;
            }
            staggeredGridLayoutManager.scrollToPosition(i);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TemplateListView@b16d.setTemplateList$2$1");
    }

    public static final void run$11(ARunnableS21S0101000_10 aRunnableS21S0101000_10) {
        ((C0PNY) aRunnableS21S0101000_10.l0).LLLFF = aRunnableS21S0101000_10.i1;
    }

    public static final void run$12(ARunnableS21S0101000_10 aRunnableS21S0101000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchViewHolderAsyncPool@47c5.prepare$runnable$1");
        try {
            int i = aRunnableS21S0101000_10.i1 - ((C0QJV) aRunnableS21S0101000_10.l0).LIZIZ;
            for (int i2 = 0; i2 < i; i2++) {
                C0QJV c0qjv = (C0QJV) aRunnableS21S0101000_10.l0;
                c0qjv.LIZ.offer(c0qjv.LIZ());
                ((C0QJV) aRunnableS21S0101000_10.l0).LIZIZ++;
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchViewHolderAsyncPool@47c5.prepare$runnable$1");
    }

    public static final void run$2(ARunnableS21S0101000_10 aRunnableS21S0101000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchVideoPhotoCommentAnchorAssem@43e1.initUIStyleListener$2$2");
        try {
            aRunnableS21S0101000_10.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchVideoPhotoCommentAnchorAssem@43e1.initUIStyleListener$2$2");
    }

    public static final void run$3(ARunnableS21S0101000_10 aRunnableS21S0101000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchImageLandingFragment@1947.updateCenterNarBar$1");
        try {
            ((SearchImageLandingFragment) aRunnableS21S0101000_10.l0).cS(aRunnableS21S0101000_10.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchImageLandingFragment@1947.updateCenterNarBar$1");
    }

    public static final void run$4(ARunnableS21S0101000_10 aRunnableS21S0101000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchDislikeAbilityImpl@9c2a.dislikeOuterStreamItemByAdapterPosition$1$1$1");
        try {
            AbstractC21673719rz itemAnimator = ((SearchDislikeAbilityImpl) aRunnableS21S0101000_10.l0).LLILLL.getItemAnimator();
            if (itemAnimator != null) {
                final SearchDislikeAbilityImpl searchDislikeAbilityImpl = (SearchDislikeAbilityImpl) aRunnableS21S0101000_10.l0;
                final int i = aRunnableS21S0101000_10.i1;
                itemAnimator.LJIJ(new InterfaceC21676919sV() { // from class: X.0PAz
                    @Override // X.InterfaceC21676919sV
                    public final void LIZ() {
                        InterfaceC648350Pbt interfaceC648350Pbt;
                        Taco tacoLIZ;
                        Object objFindViewHolderForAdapterPosition = searchDislikeAbilityImpl.LLILLL.findViewHolderForAdapterPosition(i);
                        if (objFindViewHolderForAdapterPosition != null) {
                            SearchDislikeAbilityImpl searchDislikeAbilityImpl2 = searchDislikeAbilityImpl;
                            if (!(objFindViewHolderForAdapterPosition instanceof InterfaceC648350Pbt) || (interfaceC648350Pbt = (InterfaceC648350Pbt) objFindViewHolderForAdapterPosition) == null || (tacoLIZ = C0PCE.LIZ(searchDislikeAbilityImpl2.LLILLL, false)) == null) {
                                return;
                            }
                            tacoLIZ.LIZJ().LIZ(new C588560N6o(C0PCW.LIZ(searchDislikeAbilityImpl2.LLILLL, interfaceC648350Pbt), false, null, 6));
                        }
                    }
                });
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchDislikeAbilityImpl@9c2a.dislikeOuterStreamItemByAdapterPosition$1$1$1");
    }

    public static final void run$5(ARunnableS21S0101000_10 aRunnableS21S0101000_10) {
        boolean zLIZ;
        ISearchSplitSheetBehaviorAbility iSearchSplitSheetBehaviorAbilityMR;
        C1C7U.LIZ("SearchSevenSplitScreenFragment@825d.triggerScreenStateChange$1$1");
        try {
            View view = ((SearchSevenSplitScreenFragment) aRunnableS21S0101000_10.l0).getView();
            if (view != null && view.getParent() != null && (iSearchSplitSheetBehaviorAbilityMR = ((SearchSevenSplitScreenFragment) aRunnableS21S0101000_10.l0).MR()) != null) {
                iSearchSplitSheetBehaviorAbilityMR.c(aRunnableS21S0101000_10.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchSevenSplitScreenFragment@825d.triggerScreenStateChange$1$1");
    }

    public static final void run$6(ARunnableS21S0101000_10 aRunnableS21S0101000_10) {
        boolean zLIZ;
        C1C7U.LIZ("EcSearchSugViewHolderAsyncPool@242a.prepare$runnable$1");
        try {
            int i = aRunnableS21S0101000_10.i1 - ((C0QU0) aRunnableS21S0101000_10.l0).LIZIZ;
            for (int i2 = 0; i2 < i; i2++) {
                C0QU0 c0qu0 = (C0QU0) aRunnableS21S0101000_10.l0;
                ((ConcurrentLinkedQueue) c0qu0.LIZ).offer(c0qu0.LIZ());
                ((C0QU0) aRunnableS21S0101000_10.l0).LIZIZ++;
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcSearchSugViewHolderAsyncPool@242a.prepare$runnable$1");
    }

    public static final void run$7(ARunnableS21S0101000_10 aRunnableS21S0101000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchLcpLoadTimeTracker@b0f5.markDynamicElementStart$timeoutTask$1");
        try {
            ((C0P8S) aRunnableS21S0101000_10.l0).LIZJ(aRunnableS21S0101000_10.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchLcpLoadTimeTracker@b0f5.markDynamicElementStart$timeoutTask$1");
    }

    public static final void run$8(ARunnableS21S0101000_10 aRunnableS21S0101000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchJediMixFeedFragment@aa43.existingRefreshData$3");
        try {
            aRunnableS21S0101000_10.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchJediMixFeedFragment@aa43.existingRefreshData$3");
    }

    public static final void run$9(ARunnableS21S0101000_10 aRunnableS21S0101000_10) {
        AbstractC643470PLt abstractC643470PLt = (AbstractC643470PLt) aRunnableS21S0101000_10.l0;
        int i = aRunnableS21S0101000_10.i1;
        abstractC643470PLt.getClass();
        C1C7U.LIZ("AbsSearchFragmentPanel@733d.scrollToPosition$1L");
        abstractC643470PLt.LLILZ.scrollToPosition(i);
        C1C7U.LIZIZ("AbsSearchFragmentPanel@733d.scrollToPosition$1L");
    }

    public ARunnableS21S0101000_10(AbstractC643470PLt abstractC643470PLt, int i) {
        this.$t = i;
        this.l0 = abstractC643470PLt;
        this.i1 = 0;
    }

    public ARunnableS21S0101000_10(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
