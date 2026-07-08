package Y;

import X.C00I0;
import X.C0T2H;
import X.C0UK2;
import X.C0UK5;
import X.C0UK6;
import X.C0UK7;
import X.C0UK8;
import X.C1134030fcH;
import X.C1954807lC;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C473410IhP;
import X.C497740JfY;
import X.C770410UJz;
import X.C811103Ev;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiRecommendDishesDetailFragment;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.dishes.PoiDishesGalleryFragment;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class ARunnableS9S0301000_12 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        long j;
        C00I0 c00i0;
        C0UK5 c0uk5 = (C0UK5) this.l0;
        c0uk5.LIZLLL = null;
        if (c0uk5.LJ) {
            return;
        }
        C0UK8 c0uk8 = c0uk5.LIZ;
        C0UK7 c0uk7 = ((C770410UJz) this.l1).LIZ;
        if (!(c0uk8.LIZ.get(c0uk7) instanceof C00I0)) {
            c0uk8.LIZ.put(c0uk7, new C00I0(SystemClock.elapsedRealtime()));
        }
        List<C0UK2> list = ((C770410UJz) this.l1).LIZIZ;
        C0UK5 c0uk52 = (C0UK5) this.l0;
        for (C0UK2 c0uk2 : list) {
            if (!c0uk52.LJ) {
                C0UK8 c0uk82 = c0uk52.LIZ;
                Function0<Unit> function0 = c0uk2.LIZ;
                c0uk82.getClass();
                try {
                    function0.invoke();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("preview_load_task_error error=");
                    sbLIZ.append(th.getMessage());
                    C20441214yg.LJ("VideoModeContainer", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        C0UK8 c0uk83 = ((C0UK5) this.l0).LIZ;
        C0UK7 c0uk72 = ((C770410UJz) this.l1).LIZ;
        Object obj = c0uk83.LIZ.get(c0uk72);
        if ((obj instanceof C00I0) && (c00i0 = (C00I0) obj) != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime() - c00i0.LIZ;
            c0uk83.LIZ.put(c0uk72, new Object(jElapsedRealtime) { // from class: X.0044
                public final long LIZ;

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof AnonymousClass0044) && this.LIZ == ((AnonymousClass0044) obj2).LIZ;
                }

                public final int hashCode() {
                    return C786410Ut5.Y2(this.LIZ);
                }

                public final String toString() {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Finished(durationMs=");
                    sbLIZ2.append(this.LIZ);
                    sbLIZ2.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ2);
                }

                {
                    this.LIZ = jElapsedRealtime;
                }
            });
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("preview_load_phase_end priority=");
            sbLIZ2.append(c0uk72);
            sbLIZ2.append(" duration=");
            sbLIZ2.append(jElapsedRealtime);
            sbLIZ2.append("ms");
            C20441214yg.LJIIIZ("VideoModeContainer", C2188811AlT.LIZIZ(sbLIZ2));
        }
        C0UK5 c0uk53 = (C0UK5) this.l0;
        List list2 = (List) this.l2;
        int i = this.i3 + 1;
        C0UK7 c0uk73 = ((C770410UJz) this.l1).LIZ;
        c0uk53.getClass();
        int i2 = C0UK6.LIZ[c0uk73.ordinal()];
        if (i2 == 1) {
            j = c0uk53.LIZIZ.p0Delay;
        } else if (i2 == 2) {
            j = c0uk53.LIZIZ.p1Delay;
        } else {
            if (i2 != 3) {
                throw new C1954807lC();
            }
            j = c0uk53.LIZIZ.p2Delay;
        }
        if (j < 0) {
            j = 0;
        }
        c0uk53.LIZIZ(i, j, list2);
    }

    public final void LIZ$1() {
        if (((IViewPagerComponentAbility) this.l0).m12() != 0) {
            ((BaseListFragmentPanel) this.l2).LLJLLIL.postDelayed(this, 100L);
            return;
        }
        ((C0T2H) this.l1).LJI(this.i3, ((BaseListFragmentPanel) this.l2).getContext(), ((BaseListFragmentPanel) this.l2).LLJL.Fg());
        C811103Ev.LIZ("BaseListFragmentPanel");
        ((BaseListFragmentPanel) this.l2).LLJLLIL.removeCallbacks(this);
    }

    public static final void run$0(ARunnableS9S0301000_12 aRunnableS9S0301000_12) {
        boolean zLIZ;
        C1C7U.LIZ("PoiRecommendDishesDetailFragment@4c1a.initPager$1$2");
        try {
            if (((ViewOnAttachStateChangeListenerC20631115oD) aRunnableS9S0301000_12.l0).getParent() != null) {
                ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = (ViewOnAttachStateChangeListenerC20631115oD) aRunnableS9S0301000_12.l0;
                PoiRecommendDishesDetailFragment poiRecommendDishesDetailFragment = (PoiRecommendDishesDetailFragment) aRunnableS9S0301000_12.l1;
                int i = aRunnableS9S0301000_12.i3;
                List list = (List) aRunnableS9S0301000_12.l2;
                poiRecommendDishesDetailFragment.getClass();
                if (i < 0 || i >= list.size()) {
                    i = 0;
                }
                viewOnAttachStateChangeListenerC20631115oD.setCurrentItem(i, false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiRecommendDishesDetailFragment@4c1a.initPager$1$2");
    }

    public static final void run$1(ARunnableS9S0301000_12 aRunnableS9S0301000_12) {
        boolean zLIZ;
        C1C7U.LIZ("PreviewLoadWidgetExecutor@8a55.schedulePhase$runnable$1");
        try {
            aRunnableS9S0301000_12.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreviewLoadWidgetExecutor@8a55.schedulePhase$runnable$1");
    }

    public static final void run$2(ARunnableS9S0301000_12 aRunnableS9S0301000_12) {
        boolean zLIZ;
        C1C7U.LIZ("PoiDishesGalleryFragment@e7c5.initPager$1$2");
        try {
            if (((ViewOnAttachStateChangeListenerC20631115oD) aRunnableS9S0301000_12.l0).getParent() != null) {
                ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = (ViewOnAttachStateChangeListenerC20631115oD) aRunnableS9S0301000_12.l0;
                PoiDishesGalleryFragment poiDishesGalleryFragment = (PoiDishesGalleryFragment) aRunnableS9S0301000_12.l1;
                int i = aRunnableS9S0301000_12.i3;
                List list = (List) aRunnableS9S0301000_12.l2;
                poiDishesGalleryFragment.getClass();
                if (i < 0 || i >= list.size()) {
                    i = 0;
                }
                viewOnAttachStateChangeListenerC20631115oD.setCurrentItem(i, false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiDishesGalleryFragment@e7c5.initPager$1$2");
    }

    public static final void run$3(ARunnableS9S0301000_12 aRunnableS9S0301000_12) {
        boolean zLIZ;
        C1C7U.LIZ("BaseListFragmentPanel@112.preRenderDescriptive$1");
        try {
            aRunnableS9S0301000_12.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseListFragmentPanel@112.preRenderDescriptive$1");
    }

    public static final void run$4(ARunnableS9S0301000_12 aRunnableS9S0301000_12) {
        boolean zLIZ;
        C1C7U.LIZ("GiftNewPresenter@7d83.isSwitch2PortraitSuccess$3");
        try {
            if (C497740JfY.LJIL()) {
                ((Function0) aRunnableS9S0301000_12.l0).invoke();
            } else {
                int i = aRunnableS9S0301000_12.i3;
                if (i == 0) {
                    ((Function0) aRunnableS9S0301000_12.l1).invoke();
                } else {
                    C1134030fcH c1134030fcH = (C1134030fcH) aRunnableS9S0301000_12.l2;
                    Function0 function0 = (Function0) aRunnableS9S0301000_12.l0;
                    Function0 function02 = (Function0) aRunnableS9S0301000_12.l1;
                    c1134030fcH.getClass();
                    C473410IhP.LIZJ(new ARunnableS9S0301000_12(function0, function02, i - 1, c1134030fcH, 4), 500L);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftNewPresenter@7d83.isSwitch2PortraitSuccess$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS9S0301000_12(Object obj, ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD, PoiRecommendDishesDetailFragment poiRecommendDishesDetailFragment, int i, List<PoiDetailApi.RecommendedDish> list) {
        this.$t = list;
        this.l0 = obj;
        this.l1 = viewOnAttachStateChangeListenerC20631115oD;
        this.i3 = poiRecommendDishesDetailFragment;
        this.l2 = i;
    }
}
