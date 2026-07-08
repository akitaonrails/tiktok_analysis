package Y;

import X.C12ES;
import X.C1ACC;
import X.C1ACY;
import X.C1AFI;
import X.C1C7U;
import X.C2175491ACd;
import X.C2184941AfE;
import X.C2185001AfK;
import X.C2185481Ag6;
import X.C2186441Ahe;
import X.C2186691Ai3;
import X.C293620Bf6;
import X.C786410Ut5;
import X.EnumC2184861Af6;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS494S0200000_33;

/* JADX INFO: loaded from: classes34.dex */
public class ARunnableS35S1200000_33 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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

    public final void LIZ$0() {
        ViewGroup viewGroup;
        LiveRoomStruct liveRoomStruct;
        C1ACY c1acy = C1ACY.LIZ;
        Context context = (Context) this.l1;
        View view = (View) this.l2;
        String str = this.s0;
        c1acy.getClass();
        if (C1ACY.LJIIIZ.get()) {
            return;
        }
        C2175491ACd c2175491ACd = new C2175491ACd(C1ACC.LIZJ(context, C1ACY.LJJIJIL, str, null, false, null), true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        layoutParams.topMargin = 0;
        c2175491ACd.LIZJ(layoutParams);
        if (c2175491ACd.LIZ.getContext() != null) {
            C12ES.LJIILL(0, c2175491ACd.LIZ);
        }
        C2175491ACd.LJ(c2175491ACd, 2);
        if (C1ACY.LJJIJIL == null || (liveRoomStruct = C1ACY.LJJIJIL) == null || !liveRoomStruct.liveTypeAudio) {
            if (C1ACY.LJJIIZI == null) {
                C1ACY.LJJIIZI = new HashMap<>();
            }
            HashMap<String, C2175491ACd> map = C1ACY.LJJIIZI;
            if (map != null) {
                map.put(str, c2175491ACd);
            }
        } else {
            if (C1ACY.LJJIIZ == null) {
                C1ACY.LJJIIZ = new HashMap<>();
            }
            HashMap<String, C2175491ACd> map2 = C1ACY.LJJIIZ;
            if (map2 != null) {
                map2.put(str, c2175491ACd);
            }
        }
        if (view != null && (viewGroup = (ViewGroup) view.findViewById(R.id.i72)) != null && (viewGroup instanceof FrameLayout)) {
            FrameLayout frameLayout = (FrameLayout) viewGroup;
            View view2 = c2175491ACd.LIZ;
            if (view2 != null && frameLayout.indexOfChild(view2) < 0) {
                C786410Ut5.LJLLLLLL(8, view2);
                if (view2.getParent() instanceof ViewGroup) {
                    C786410Ut5.LJJJLZIJ(view2, (ViewGroup) view2.getParent());
                }
                Object objLIZ = C1ACC.LIZ(frameLayout);
                if (objLIZ == null) {
                    C786410Ut5.LJLLLLLL(0, view2);
                    frameLayout.addView(view2, 0);
                } else {
                    View view3 = (View) objLIZ;
                    if (view3.getVisibility() != 0) {
                        C786410Ut5.LJLLLLLL(0, view3);
                    }
                    if (C293620Bf6.LIZ(view3)) {
                        c2175491ACd.LIZ = view3;
                    }
                }
            }
        }
        C1ACY.LJIIJ.set(true);
    }

    public static final void run$0(ARunnableS35S1200000_33 aRunnableS35S1200000_33) {
        boolean zLIZ;
        C1C7U.LIZ("ScanThread@fbdf.handleSingleFrame$1$1$2$1");
        try {
            ((C2186691Ai3) ((AwS494S0200000_33) aRunnableS35S1200000_33.l1).l0).LIZ.LL.LIZ(0, 107, aRunnableS35S1200000_33.s0, C2186441Ahe.LIZ((C1AFI) aRunnableS35S1200000_33.l2));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ScanThread@fbdf.handleSingleFrame$1$1$2$1");
    }

    public static final void run$1(ARunnableS35S1200000_33 aRunnableS35S1200000_33) {
        C2184941AfE c2184941AfE = (C2184941AfE) aRunnableS35S1200000_33.l1;
        String str = aRunnableS35S1200000_33.s0;
        C2185001AfK c2185001AfK = (C2185001AfK) aRunnableS35S1200000_33.l2;
        C1C7U.LIZ("StaggeredReleaseController@9bf7.performRelease$1L");
        if (!c2184941AfE.LJJI) {
            c2184941AfE.LJIIL.invoke(str, c2185001AfK, EnumC2184861Af6.STAGGERED_RELEASE);
        }
        C1C7U.LIZIZ("StaggeredReleaseController@9bf7.performRelease$1L");
    }

    public static final void run$2(ARunnableS35S1200000_33 aRunnableS35S1200000_33) {
        boolean zLIZ;
        C1C7U.LIZ("LiveCardHelperForColdBoot@43f7.prepareLiveRenderView$1");
        try {
            aRunnableS35S1200000_33.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveCardHelperForColdBoot@43f7.prepareLiveRenderView$1");
    }

    public static final void run$3(ARunnableS35S1200000_33 aRunnableS35S1200000_33) {
        Function0 function0 = (Function0) aRunnableS35S1200000_33.l1;
        C2185481Ag6 c2185481Ag6 = (C2185481Ag6) aRunnableS35S1200000_33.l2;
        String str = aRunnableS35S1200000_33.s0;
        C1C7U.LIZ("ThreadBoostSchedulerImpl@28ba.scheduleTimeoutTask$1L");
        function0.invoke();
        c2185481Ag6.LJI.remove(str);
        C1C7U.LIZIZ("ThreadBoostSchedulerImpl@28ba.scheduleTimeoutTask$1L");
    }

    public ARunnableS35S1200000_33(Context context, View view, int i) {
        this.$t = i;
        this.l1 = context;
        this.l2 = view;
        this.s0 = "homepage_hot-live_cell";
    }

    public ARunnableS35S1200000_33(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
