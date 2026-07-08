package Y;

import X.AbstractC21673719rz;
import X.C1819070xRB;
import X.C1855370yNj;
import X.C1C7U;
import X.EnumC1802220x00;
import X.InterfaceC21676919sV;
import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.explore.assem.ExploreViewPagerComponent;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment;

/* JADX INFO: loaded from: classes28.dex */
public class ARunnableS25S0100100_27 implements Runnable {
    public final int $t;
    public long j1;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (((C1819070xRB) this.l0).getWidth() <= 0) {
            return;
        }
        ((C1819070xRB) this.l0).LJIIJJI();
        C1819070xRB c1819070xRB = (C1819070xRB) this.l0;
        c1819070xRB.LLILZLL = c1819070xRB.LJ();
        C1819070xRB c1819070xRB2 = (C1819070xRB) this.l0;
        c1819070xRB2.LLILZ = EnumC1802220x00.LLILLL;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(c1819070xRB2.LLILLL, 0.0f);
        long j = this.j1;
        C1819070xRB c1819070xRB3 = (C1819070xRB) this.l0;
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS275S0100000_27(c1819070xRB3, 8));
        valueAnimatorOfFloat.addListener(new ALAdapterS22S0100000_27(c1819070xRB3, 4));
        c1819070xRB2.LLIZ = valueAnimatorOfFloat;
        ((C1819070xRB) this.l0).LIZ();
        ValueAnimator valueAnimator = ((C1819070xRB) this.l0).LLIZ;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0031 A[Catch: Exception -> 0x008e, TRY_ENTER, TryCatch #0 {Exception -> 0x008e, blocks: (B:8:0x0011, B:10:0x0016, B:12:0x001a, B:14:0x0022, B:22:0x0031, B:24:0x0035, B:25:0x0044, B:27:0x0048, B:29:0x004c, B:30:0x0054, B:32:0x0058, B:34:0x005c, B:36:0x0064, B:38:0x006a, B:40:0x006e, B:41:0x007d, B:43:0x0081, B:45:0x0085), top: B:64:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e A[Catch: Exception -> 0x008e, TryCatch #0 {Exception -> 0x008e, blocks: (B:8:0x0011, B:10:0x0016, B:12:0x001a, B:14:0x0022, B:22:0x0031, B:24:0x0035, B:25:0x0044, B:27:0x0048, B:29:0x004c, B:30:0x0054, B:32:0x0058, B:34:0x005c, B:36:0x0064, B:38:0x006a, B:40:0x006e, B:41:0x007d, B:43:0x0081, B:45:0x0085), top: B:64:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS25S0100100_27.LIZ$1():void");
    }

    public static final void run$0(ARunnableS25S0100100_27 aRunnableS25S0100100_27) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreViewPagerComponent@6933.scheduleUgPinFirstGuide$2");
        try {
            ((ExploreViewPagerComponent) aRunnableS25S0100100_27.l0).bp(aRunnableS25S0100100_27.j1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreViewPagerComponent@6933.scheduleUgPinFirstGuide$2");
    }

    public static final void run$1(ARunnableS25S0100100_27 aRunnableS25S0100100_27) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreViewPagerComponent@6933.scheduleUgPinFirstGuide$3$1");
        try {
            ((ExploreViewPagerComponent) aRunnableS25S0100100_27.l0).bp(aRunnableS25S0100100_27.j1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreViewPagerComponent@6933.scheduleUgPinFirstGuide$3$1");
    }

    public static final void run$2(ARunnableS25S0100100_27 aRunnableS25S0100100_27) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreViewPagerComponent@6933.scheduleUgPinFirstGuide$3$2$onPageScrollStateChanged$1");
        try {
            ((ExploreViewPagerComponent) aRunnableS25S0100100_27.l0).bp(aRunnableS25S0100100_27.j1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreViewPagerComponent@6933.scheduleUgPinFirstGuide$3$2$onPageScrollStateChanged$1");
    }

    public static final void run$3(ARunnableS25S0100100_27 aRunnableS25S0100100_27) {
        boolean zLIZ;
        C1C7U.LIZ("MinisOperationBanner@203a.animateCollapse$1");
        try {
            aRunnableS25S0100100_27.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisOperationBanner@203a.animateCollapse$1");
    }

    public static final void run$4(ARunnableS25S0100100_27 aRunnableS25S0100100_27) {
        boolean zLIZ;
        C1C7U.LIZ("TakoHTTContentView@520b.dismiss$1");
        try {
            if (aRunnableS25S0100100_27.j1 == ((C1855370yNj) aRunnableS25S0100100_27.l0).getLastShowTime()) {
                ((C1855370yNj) aRunnableS25S0100100_27.l0).LIZIZ();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoHTTContentView@520b.dismiss$1");
    }

    public static final void run$5(ARunnableS25S0100100_27 aRunnableS25S0100100_27) {
        boolean zLIZ;
        C1C7U.LIZ("LiveHighLightPageFragment@5404.initPlayerView$1$1$1$onRenderFirstFrame$1$1");
        try {
            ((LiveHighLightPageFragment) aRunnableS25S0100100_27.l0).RS(aRunnableS25S0100100_27.j1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveHighLightPageFragment@5404.initPlayerView$1$1$1$onRenderFirstFrame$1$1");
    }

    public static final void run$6(ARunnableS25S0100100_27 aRunnableS25S0100100_27) {
        boolean zLIZ;
        C1C7U.LIZ("TreeBuildMonitorReport@7ae1.handleTreeBuildMonitor$1");
        try {
            aRunnableS25S0100100_27.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TreeBuildMonitorReport@7ae1.handleTreeBuildMonitor$1");
    }

    public static final void run$7(ARunnableS25S0100100_27 aRunnableS25S0100100_27) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreTopicManagementAdapter@ccd4.removeAnimation$1");
        try {
            final AbstractC21673719rz abstractC21673719rz = (AbstractC21673719rz) aRunnableS25S0100100_27.l0;
            if (abstractC21673719rz != null) {
                final long j = aRunnableS25S0100100_27.j1;
                abstractC21673719rz.LJIJ(new InterfaceC21676919sV() { // from class: X.0y1Y
                    @Override // X.InterfaceC21676919sV
                    public final void LIZ() {
                        abstractC21673719rz.LJIL(j);
                    }
                });
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreTopicManagementAdapter@ccd4.removeAnimation$1");
    }

    public ARunnableS25S0100100_27(long j, Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }
}
