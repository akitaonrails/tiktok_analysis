package Y;

import X.C098200Yq;
import X.C1180060goW;
import X.C1558360qeg;
import X.C1558520qew;
import X.C189200o6;
import X.C19HL;
import X.C1C7U;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.dishes.gallery.PoiRecommendDishesGalleryAssem;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiGalleryAbility;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiGalleryCell;
import com.ss.android.ugc.aweme.poi.detail.gallery.PoiRecommendDishesGalleryAbility;
import com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailErrorAssem;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import kotlin.Unit;

/* JADX INFO: loaded from: classes19.dex */
public class ARunnableS24S0201000_18 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        PoiGalleryCell poiGalleryCell = (PoiGalleryCell) this.l0;
        C19HL c19hl = (C19HL) this.l1;
        int i = this.i2;
        try {
            Unit unit = null;
            PoiGalleryAbility poiGalleryAbility = (PoiGalleryAbility) C1558520qew.LIZ(C1558360qeg.LJ(poiGalleryCell.itemView, null), PoiGalleryAbility.class, null);
            if (poiGalleryAbility != null) {
                poiGalleryAbility.Gg(false, c19hl, i);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void run$0(ARunnableS24S0201000_18 aRunnableS24S0201000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiMapDetailErrorAssem@62e0.subscribe$3$onSlide$$inlined$doOnPreDraw$1");
        try {
            View view = ((PoiMapDetailErrorAssem) aRunnableS24S0201000_18.l1).LLJ;
            if (view != null) {
                C1180060goW.LJIIIZ((aRunnableS24S0201000_18.i2 - view.getTop()) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(((PoiMapDetailErrorAssem) aRunnableS24S0201000_18.l1).getContext()), view);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiMapDetailErrorAssem@62e0.subscribe$3$onSlide$$inlined$doOnPreDraw$1");
    }

    public static final void run$1(ARunnableS24S0201000_18 aRunnableS24S0201000_18) {
        boolean zLIZ;
        View viewAp;
        PoiRecommendDishesGalleryAbility poiRecommendDishesGalleryAbility;
        C1C7U.LIZ("PoiRecommendDishesGalleryAssem@8472.realLoadImg$2");
        try {
            if (((PoiRecommendDishesGalleryAssem) aRunnableS24S0201000_18.l0).up() && (viewAp = ((PoiRecommendDishesGalleryAssem) aRunnableS24S0201000_18.l0).Ap()) != null && (poiRecommendDishesGalleryAbility = (PoiRecommendDishesGalleryAbility) C1558520qew.LIZ(C1558360qeg.LJ(viewAp, null), PoiRecommendDishesGalleryAbility.class, null)) != null) {
                poiRecommendDishesGalleryAbility.Gg(false, (C19HL) aRunnableS24S0201000_18.l1, aRunnableS24S0201000_18.i2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiRecommendDishesGalleryAssem@8472.realLoadImg$2");
    }

    public static final void run$2(ARunnableS24S0201000_18 aRunnableS24S0201000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiGalleryCell@fbd4.realLoadImg$2");
        try {
            aRunnableS24S0201000_18.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiGalleryCell@fbd4.realLoadImg$2");
    }

    public ARunnableS24S0201000_18(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
