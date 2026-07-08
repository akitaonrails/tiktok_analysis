package Y;

import X.AbstractC1623806Xk;
import X.C1157670gEP;
import X.C1178440glu;
import X.C1182900gt6;
import X.C1193560hAI;
import X.C13LP;
import X.C1558360qeg;
import X.C1623606Xi;
import X.C1C7U;
import X.C786410Ut5;
import X.EnumC1156340gCG;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.i18n.location.api.LocationData;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.ui.PoiReviewsContainerAssem;
import com.ss.android.ugc.aweme.series.innerfeed.fragment.SeriesInnerFeedDetailPageFragment;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS37S1110000_18;

/* JADX INFO: loaded from: classes19.dex */
public class ARunnableS26S0400000_18 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$0() {
        int i;
        String str;
        PoiReviewsContainerAssem poiReviewsContainerAssem = (PoiReviewsContainerAssem) this.l0;
        PoiReviewsApi.PoiReviewListResponse poiReviewListResponse = (PoiReviewsApi.PoiReviewListResponse) ((C1623606Xi) ((AbstractC1623806Xk) this.l1)).LIZ;
        poiReviewsContainerAssem.getClass();
        if (poiReviewListResponse == null || !(poiReviewListResponse.getLandingTab() == 0 || poiReviewListResponse.getLandingTab() == 1)) {
            i = 1;
            ((PoiReviewsContainerAssem) this.l0).LLJJIJIL = true;
        } else {
            i = 0;
        }
        ((ViewOnAttachStateChangeListenerC20631115oD) this.l2).setCurrentItem(i, false);
        PoiReviewsApi.PoiReviewsTabInfoModel poiReviewsTabInfoModel = (PoiReviewsApi.PoiReviewsTabInfoModel) C13LP.LJJJLZIJ(i, (List) this.l3);
        Integer num = poiReviewsTabInfoModel != null ? poiReviewsTabInfoModel.reviewTab : null;
        int value = EnumC1156340gCG.POI_REVIEW_TRIPADVISOR_TAB.getValue();
        if (num == null || num.intValue() != value) {
            str = (num == null || num.intValue() != EnumC1156340gCG.POI_REVIEW_TABELOG_TAB.getValue()) ? "tiktok" : "tabelog";
        } else {
            str = "tripadvisor";
        }
        PoiReviewsContainerAssem poiReviewsContainerAssem2 = (PoiReviewsContainerAssem) this.l0;
        if (poiReviewsContainerAssem2.LLJJIJIL) {
            poiReviewsContainerAssem2.hp().wQ2(C1558360qeg.LJ((ViewOnAttachStateChangeListenerC20631115oD) this.l2, null), str, "default");
        } else {
            poiReviewsContainerAssem2.hp().wQ2(C1558360qeg.LJ((ViewOnAttachStateChangeListenerC20631115oD) this.l2, null), "tiktok", "default");
        }
    }

    public final void LIZ$1() {
        final SeriesInnerFeedDetailPageFragment seriesInnerFeedDetailPageFragment = (SeriesInnerFeedDetailPageFragment) this.l0;
        final LinearLayout linearLayout = (LinearLayout) this.l1;
        final TuxTextView tuxTextView = (TuxTextView) this.l2;
        C1157670gEP c1157670gEP = (C1157670gEP) this.l3;
        long j = c1157670gEP.LIZIZ;
        final long j2 = c1157670gEP.LIZJ;
        seriesInnerFeedDetailPageFragment.getClass();
        if (linearLayout == null || tuxTextView == null) {
            return;
        }
        seriesInnerFeedDetailPageFragment.ZR(linearLayout, tuxTextView);
        C786410Ut5.LLLLZLL(tuxTextView, 8);
        SeriesInnerFeedDetailPageFragment.gS(linearLayout);
        final int iCS = SeriesInnerFeedDetailPageFragment.cS(linearLayout, tuxTextView, false);
        final int iCS2 = SeriesInnerFeedDetailPageFragment.cS(linearLayout, tuxTextView, true);
        if (iCS <= 0 || iCS2 <= iCS) {
            SeriesInnerFeedDetailPageFragment.gS(linearLayout);
            return;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = iCS;
            C786410Ut5.W5(linearLayout, layoutParams);
            HandlerHook.viewPostDelay(linearLayout, new Runnable() { // from class: X.0gpj
                public final void LIZ() {
                    if (linearLayout.isAttachedToWindow()) {
                        C01GW c01gw = C1180840gpm.LIZ;
                        if (!((Keva) c01gw.getValue()).getBoolean("guide_animation_shown", false)) {
                            ((Keva) c01gw.getValue()).storeBoolean("guide_animation_shown", true);
                            C786410Ut5.LLLLZLL(tuxTextView, 0);
                            SeriesInnerFeedDetailPageFragment seriesInnerFeedDetailPageFragment2 = seriesInnerFeedDetailPageFragment;
                            View view = linearLayout;
                            int i = iCS;
                            int i2 = iCS2;
                            C1180820gpk c1180820gpk = new C1180820gpk(view, j2, seriesInnerFeedDetailPageFragment2, i, tuxTextView);
                            seriesInnerFeedDetailPageFragment2.getClass();
                            SeriesInnerFeedDetailPageFragment.WR(i, i2, view, c1180820gpk);
                            return;
                        }
                    }
                    SeriesInnerFeedDetailPageFragment seriesInnerFeedDetailPageFragment3 = seriesInnerFeedDetailPageFragment;
                    View view2 = linearLayout;
                    seriesInnerFeedDetailPageFragment3.getClass();
                    SeriesInnerFeedDetailPageFragment.gS(view2);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SeriesInnerFeedDetailPageFragment@f879.startGuideAnimation$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SeriesInnerFeedDetailPageFragment@f879.startGuideAnimation$1");
                }
            }, j);
        }
    }

    public final void LIZ$2() {
        LocationData locationData = (LocationData) this.l0;
        if ((locationData.latitude == 0.0d) && locationData.longitude == 0.0d) {
            C1182900gt6 c1182900gt6 = C1182900gt6.LIZ;
            c1182900gt6.getClass();
            c1182900gt6.LIZJ("poi_quiz_fetch_location_result", new AwS37S1110000_18((Integer) null, "location and longitude is 0", false, 1));
            ((Function0) this.l1).invoke();
            return;
        }
        C1182900gt6 c1182900gt62 = C1182900gt6.LIZ;
        c1182900gt62.getClass();
        c1182900gt62.LIZJ("poi_quiz_fetch_location_result", new AwS37S1110000_18((Integer) null, (String) null, true, 1));
        C1178440glu c1178440glu = (C1178440glu) this.l2;
        LocationData locationData2 = (LocationData) this.l0;
        c1178440glu.LIZJ = locationData2;
        ((Function1) this.l3).invoke(locationData2);
    }

    public static final void run$0(ARunnableS26S0400000_18 aRunnableS26S0400000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiReviewsContainerAssem@a78a.onViewCreated$4$5$1");
        try {
            aRunnableS26S0400000_18.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiReviewsContainerAssem@a78a.onViewCreated$4$5$1");
    }

    public static final void run$1(ARunnableS26S0400000_18 aRunnableS26S0400000_18) {
        boolean zLIZ;
        C1C7U.LIZ("SeriesInnerFeedDetailPageFragment@f879.onViewCreated$applyDiscoverEntryStyle$2");
        try {
            aRunnableS26S0400000_18.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeriesInnerFeedDetailPageFragment@f879.onViewCreated$applyDiscoverEntryStyle$2");
    }

    public static final void run$2(ARunnableS26S0400000_18 aRunnableS26S0400000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiVideoAutoPlayPlugin@898.checkVideoListAlready$$inlined$doOnPreDraw$1");
        try {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) aRunnableS26S0400000_18.l1;
            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS51S0300000_18((C1193560hAI) aRunnableS26S0400000_18.l2, viewOnAttachStateChangeListenerC20604515jv, (Function0) aRunnableS26S0400000_18.l3, 8));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiVideoAutoPlayPlugin@898.checkVideoListAlready$$inlined$doOnPreDraw$1");
    }

    public static final void run$3(ARunnableS26S0400000_18 aRunnableS26S0400000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiQuizPermissionStateContext@f8b3.fetchGPS$1$onLocationChanged$1");
        try {
            aRunnableS26S0400000_18.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiQuizPermissionStateContext@f8b3.fetchGPS$1$onLocationChanged$1");
    }

    public ARunnableS26S0400000_18(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
