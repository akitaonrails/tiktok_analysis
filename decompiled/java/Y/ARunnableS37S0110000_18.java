package Y;

import X.C1187470h0T;
import X.C1749280vcc;
import X.C1C7U;
import X.C339190DRl;
import X.EnumC1193720hAY;
import com.ss.android.ugc.aweme.favorites.business.FavoritesFragmentV2;
import com.ss.android.ugc.aweme.poi.search.assem.PoiSearchAssem;
import com.ss.android.ugc.aweme.tracker.TrackerImpl;

/* JADX INFO: loaded from: classes19.dex */
public class ARunnableS37S0110000_18 implements Runnable {
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS37S0110000_18 aRunnableS37S0110000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiSearchAssem@e687.updateLoading$1");
        try {
            if (((PoiSearchAssem) aRunnableS37S0110000_18.l0).LJJIJL().getParent() != null) {
                if (aRunnableS37S0110000_18.z1) {
                    ((PoiSearchAssem) aRunnableS37S0110000_18.l0).LJ();
                } else {
                    C1749280vcc c1749280vcc = ((PoiSearchAssem) aRunnableS37S0110000_18.l0).LLJ;
                    if (c1749280vcc == null) {
                        c1749280vcc = null;
                    }
                    C339190DRl.LIZIZ(c1749280vcc);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiSearchAssem@e687.updateLoading$1");
    }

    public static final void run$1(ARunnableS37S0110000_18 aRunnableS37S0110000_18) {
        boolean zLIZ;
        EnumC1193720hAY enumC1193720hAY;
        C1C7U.LIZ("TrackerImpl@f2d4.endLcpRender$1");
        try {
            if (aRunnableS37S0110000_18.z1) {
                enumC1193720hAY = EnumC1193720hAY.BUSINESS_MANUALLY;
            } else {
                enumC1193720hAY = EnumC1193720hAY.RENDER_FINISH;
            }
            TrackerImpl.LJJZZI((TrackerImpl) aRunnableS37S0110000_18.l0, enumC1193720hAY);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TrackerImpl@f2d4.endLcpRender$1");
    }

    public static final void run$2(ARunnableS37S0110000_18 aRunnableS37S0110000_18) {
        boolean zLIZ;
        C1C7U.LIZ("FavoritesFragmentV2@3256.setupPowerViewPager$1$onPageSelected$1");
        try {
            ((FavoritesFragmentV2) aRunnableS37S0110000_18.l0).aS(aRunnableS37S0110000_18.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FavoritesFragmentV2@3256.setupPowerViewPager$1$onPageSelected$1");
    }

    public static final void run$3(ARunnableS37S0110000_18 aRunnableS37S0110000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiTopVideoAutoPlayController@e5ea.scrollChangeTryAutoPlay$1");
        try {
            if (((C1187470h0T) aRunnableS37S0110000_18.l0).LIZLLL.compareAndSet(false, true)) {
                if (aRunnableS37S0110000_18.z1) {
                    ((C1187470h0T) aRunnableS37S0110000_18.l0).LIZ();
                } else {
                    ((C1187470h0T) aRunnableS37S0110000_18.l0).LIZJ();
                }
                ((C1187470h0T) aRunnableS37S0110000_18.l0).LIZLLL.set(false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiTopVideoAutoPlayController@e5ea.scrollChangeTryAutoPlay$1");
    }

    public ARunnableS37S0110000_18(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
