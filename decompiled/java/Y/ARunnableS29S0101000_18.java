package Y;

import X.C1189860h4K;
import X.C1198850hIp;
import X.C1200110hKr;
import X.C1200910hM9;
import X.C1205640hTm;
import X.C19Y3;
import X.C19Y5;
import X.C1C7U;
import X.C20632315oP;
import X.C686930Qx1;
import X.C686940Qx2;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem.StoreViewPagerAssemV2;
import com.ss.android.ugc.aweme.favorites.business.FavoritesFragmentV2;
import com.ss.android.ugc.aweme.poi.detail.nearby.PoiDetailNearbyComponent;
import com.ss.android.ugc.aweme.poi.detail.post.tag.TagBarLayoutManager;
import com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailCommonHorizontalCardAssem;
import com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailFilterAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.nearby.container.NearbyContentAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public class ARunnableS29S0101000_18 implements Runnable {
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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS29S0101000_18 aRunnableS29S0101000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiMapDetailFilterAssem@c9a4.initChips$2$4");
        try {
            HorizontalScrollView horizontalScrollView = ((PoiMapDetailFilterAssem) aRunnableS29S0101000_18.l0).LLIZLLLIL;
            if (horizontalScrollView != null) {
                horizontalScrollView.scrollTo(aRunnableS29S0101000_18.i1, 0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiMapDetailFilterAssem@c9a4.initChips$2$4");
    }

    public static final void run$1(ARunnableS29S0101000_18 aRunnableS29S0101000_18) {
        boolean zLIZ;
        C1C7U.LIZ("RavenFragment@d0e1.runManualLoadMoreWithPendingContinuation$disposable$4$3");
        try {
            ((RavenFragment) aRunnableS29S0101000_18.l0).JS().getOperator().LIZ(Integer.valueOf(aRunnableS29S0101000_18.i1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RavenFragment@d0e1.runManualLoadMoreWithPendingContinuation$disposable$4$3");
    }

    public static final void run$10(ARunnableS29S0101000_18 aRunnableS29S0101000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiSearchUIPreloader@40be.triggerAsyncInflate$2");
        try {
            C686930Qx1 c686930Qx1 = ((C1198850hIp) aRunnableS29S0101000_18.l0).LIZIZ;
            c686930Qx1.getClass();
            C686940Qx2 c686940Qx2 = new C686940Qx2(c686930Qx1);
            c686940Qx2.LIZ(((C1198850hIp) aRunnableS29S0101000_18.l0).LIZ, aRunnableS29S0101000_18.i1);
            C686940Qx2.LIZIZ(c686940Qx2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiSearchUIPreloader@40be.triggerAsyncInflate$2");
    }

    public static final void run$11(ARunnableS29S0101000_18 aRunnableS29S0101000_18) {
        boolean zLIZ;
        C1C7U.LIZ("FavoritesFragmentV2@3256.observeScrollTabToSelectedRequest$1$1");
        try {
            C19Y3 c19y3 = ((FavoritesFragmentV2) aRunnableS29S0101000_18.l0).LLILZ;
            if (c19y3 == null) {
                c19y3 = null;
            }
            C19Y5 c19y5LJIIIZ = c19y3.LJIIIZ(aRunnableS29S0101000_18.i1);
            if (c19y5LJIIIZ != null) {
                c19y5LJIIIZ.LIZ();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FavoritesFragmentV2@3256.observeScrollTabToSelectedRequest$1$1");
    }

    public static final void run$12(ARunnableS29S0101000_18 aRunnableS29S0101000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiClaimListCellUiPreloader@75f6.triggerAsyncInflate$1");
        try {
            C686930Qx1 c686930Qx1 = ((C1200110hKr) aRunnableS29S0101000_18.l0).LIZ;
            c686930Qx1.getClass();
            C686940Qx2 c686940Qx2 = new C686940Qx2(c686930Qx1);
            ((C1200110hKr) aRunnableS29S0101000_18.l0).getClass();
            c686940Qx2.LIZ(R.layout.dyt, aRunnableS29S0101000_18.i1);
            C686940Qx2.LIZIZ(c686940Qx2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiClaimListCellUiPreloader@75f6.triggerAsyncInflate$1");
    }

    public static final void run$13(ARunnableS29S0101000_18 aRunnableS29S0101000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiDetailNearbyComponent@bb77.rebuildTuxChips$3");
        try {
            LinearLayout linearLayout = ((PoiDetailNearbyComponent) aRunnableS29S0101000_18.l0).LLJLILLLLZIIL;
            if (linearLayout != null && linearLayout.getParent() != null) {
                ((PoiDetailNearbyComponent) aRunnableS29S0101000_18.l0).Jp(aRunnableS29S0101000_18.i1, false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiDetailNearbyComponent@bb77.rebuildTuxChips$3");
    }

    public static final void run$14(ARunnableS29S0101000_18 aRunnableS29S0101000_18) {
        boolean zLIZ;
        C1C7U.LIZ("NearbyFeedUIPreloader@39f6.triggerAsyncInflate$2");
        try {
            C686930Qx1 c686930Qx1 = ((C1200910hM9) aRunnableS29S0101000_18.l0).LIZ;
            c686930Qx1.getClass();
            C686940Qx2 c686940Qx2 = new C686940Qx2(c686930Qx1);
            ((C1200910hM9) aRunnableS29S0101000_18.l0).getClass();
            c686940Qx2.LIZ(R.layout.ds3, aRunnableS29S0101000_18.i1);
            C686940Qx2.LIZIZ(c686940Qx2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NearbyFeedUIPreloader@39f6.triggerAsyncInflate$2");
    }

    public static final void run$2(ARunnableS29S0101000_18 aRunnableS29S0101000_18) {
        boolean zLIZ;
        C1C7U.LIZ("RavenFragment@d0e1.runManualLoadMoreWithPendingContinuation$disposable$4$4");
        try {
            ((RavenFragment) aRunnableS29S0101000_18.l0).iT(aRunnableS29S0101000_18.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RavenFragment@d0e1.runManualLoadMoreWithPendingContinuation$disposable$4$4");
    }

    public static final void run$3(ARunnableS29S0101000_18 aRunnableS29S0101000_18) {
        boolean zLIZ;
        C1C7U.LIZ("RavenFragment@d0e1.powerPageConfig$2$1$onLoadMore$9$4");
        try {
            ((RavenFragment) aRunnableS29S0101000_18.l0).JS().getOperator().LIZ(Integer.valueOf(aRunnableS29S0101000_18.i1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RavenFragment@d0e1.powerPageConfig$2$1$onLoadMore$9$4");
    }

    public static final void run$4(ARunnableS29S0101000_18 aRunnableS29S0101000_18) {
        boolean zLIZ;
        C1C7U.LIZ("RavenFragment@d0e1.powerPageConfig$2$1$onLoadMore$9$6");
        try {
            ((RavenFragment) aRunnableS29S0101000_18.l0).iT(aRunnableS29S0101000_18.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RavenFragment@d0e1.powerPageConfig$2$1$onLoadMore$9$6");
    }

    public static final void run$5(ARunnableS29S0101000_18 aRunnableS29S0101000_18) {
        boolean zLIZ;
        C1C7U.LIZ("StoreViewPagerAssemV2@1a70.onViewCreated$1$2$2");
        try {
            C20632315oP c20632315oPSo = ((StoreViewPagerAssemV2) aRunnableS29S0101000_18.l0).So();
            if (c20632315oPSo != null) {
                c20632315oPSo.LJ(aRunnableS29S0101000_18.i1, false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StoreViewPagerAssemV2@1a70.onViewCreated$1$2$2");
    }

    public static final void run$6(ARunnableS29S0101000_18 aRunnableS29S0101000_18) {
        boolean zLIZ;
        TagBarLayoutManager tagBarLayoutManager;
        C1C7U.LIZ("TagBarView@5d1b.showTags$1");
        try {
            if (((C1189860h4K) aRunnableS29S0101000_18.l0).LL.getParent() != null) {
                RecyclerView.LayoutManager layoutManager = ((C1189860h4K) aRunnableS29S0101000_18.l0).LL.getLayoutManager();
                if ((layoutManager instanceof TagBarLayoutManager) && (tagBarLayoutManager = (TagBarLayoutManager) layoutManager) != null) {
                    tagBarLayoutManager.LLJJIJI = aRunnableS29S0101000_18.i1;
                    tagBarLayoutManager.LLJJIJIIJIL = 0;
                    tagBarLayoutManager.requestLayout();
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TagBarView@5d1b.showTags$1");
    }

    public static final void run$7(ARunnableS29S0101000_18 aRunnableS29S0101000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiWorldCupMatchItemView@2447.renderScore$1");
        try {
            if (((C1205640hTm) aRunnableS29S0101000_18.l0).getTvScoreLeft().getParent() != null) {
                ((C1205640hTm) aRunnableS29S0101000_18.l0).i0(aRunnableS29S0101000_18.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiWorldCupMatchItemView@2447.renderScore$1");
    }

    public static final void run$8(ARunnableS29S0101000_18 aRunnableS29S0101000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiMapDetailCommonHorizontalCardAssem@e6aa.trySelectItem$1$1");
        try {
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = ((PoiMapDetailCommonHorizontalCardAssem) aRunnableS29S0101000_18.l0).LLJJIJI;
            if (viewOnAttachStateChangeListenerC20631115oD != null) {
                viewOnAttachStateChangeListenerC20631115oD.setCurrentItem(aRunnableS29S0101000_18.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiMapDetailCommonHorizontalCardAssem@e6aa.trySelectItem$1$1");
    }

    public static final void run$9(ARunnableS29S0101000_18 aRunnableS29S0101000_18) {
        boolean zLIZ;
        C1C7U.LIZ("NearbyContentAssem@bf9f.onResume$1$1");
        try {
            ((NearbyContentAssem) aRunnableS29S0101000_18.l0).Go().smoothScrollToPosition(aRunnableS29S0101000_18.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NearbyContentAssem@bf9f.onResume$1$1");
    }

    public ARunnableS29S0101000_18(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
